package ie.atu.sample.repository;

import ie.atu.sample.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface bookingRespository
    extends JpaRepository<Booking, Long> {
    @Query("""
               SELECT p
               FROM roomId p
               WHERE attendeeCount ASC
               """)
    List<Booking> findBookingsByAttendanceCount(
            @Param("match")Long attendeeCount);
}

@Query("""
               SELECT p
               FROM roomId p
               WHERE LOWER(c.name)=LOWER(:roomName)
               ORDER BY p.attendeeCount ASC
               """)
    List<Booking>findbyroomId(
        @Param("Order") String attendeeCount) {
    return null;
}

