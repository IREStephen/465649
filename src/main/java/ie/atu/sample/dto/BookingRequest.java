package ie.atu.sample.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public record BookingRequest (
        Long bookingId,
        Long roomId,
        String roomName,
        String organiserName,
        BigDecimal attendanceCount,
        BigInteger status )
{}
