package ie.atu.sample.controller;

import ie.atu.sample.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class SampleController {
    private final SampleController sampleController;
    @Autowired
    public SampleController(SampleController sampleController) {
        this.sampleController = sampleController;
    }
    public SampleController(BookingService) {this.service = service}
}

@GetMapping
public List<Booking>getAll() {return service.getAll();}

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
Public booking

public