package ie.atu.sample.model;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "rooms")

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    private Long roomId;
    private String roomName;
    private String organiserName;
    private BigInteger attendanceCount;
    private BigInteger status;

    public Booking () {}
    public Booking(Long bookingId, String roomName, BigInteger status, BigInteger attendanceCount, String organiserName, Long roomId) {
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.roomName = roomName;
        this.status = status;
        this.attendanceCount = attendanceCount;
        this.organiserName = organiserName;
    }

    public void setId(Long id) {
        this.bookingId = id;
    }

    public Long getId() {
        return bookingId;
    }

    public void setRoomId(Long roomId) { this.roomId = roomId; }
    public Long getRoomId() { return roomId; }

    public void setRoomName(String roomName) { this.roomName = roomName; }
    public String getRoomName() { return roomName; }

    public void setOrganiserName(String organiserName) { this.organiserName = organiserName; }
    public String getOrganiserName() { return organiserName; }

    public void setAttendanceCount(BigInteger attendanceCount) { this.attendanceCount = attendanceCount; }
    public BigInteger getAttendanceCount() { return attendanceCount; }

    public void setBookingStatus(BigInteger bookingStatus) { this.status = bookingStatus; }
    public BigInteger getBookingStatus() { return status; }

}
