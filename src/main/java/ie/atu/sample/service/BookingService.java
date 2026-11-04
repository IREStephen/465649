package ie.atu.sample.service;

import ie.atu.sample.dto.BookingRequest;
import ie.atu.sample.model.Booking;
import org.apache.coyote.Request;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.awt.print.Book;
import java.util.List;

@Service
public class BookingService {
    private final BookingRespository;
    private final BookingService bookingService;
    private final BookingRequest bookingRequest;
    public bookingService(bookingRespository repository) {
        this.repository = repository;
    }
}

public List<Booking> get ASC() {
    return respository.findAll();
}

public Booking create Booking(CreateBookingRequest request) {
    if(request.roomId()==null) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Room Id is required");
    }
}

Booking booking = new Booking();
booking setroomName(request.roomName());
booking.set roomId(request.roomId());

return repository save(respository);

