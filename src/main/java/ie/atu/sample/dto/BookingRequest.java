package ie.atu.sample.dto;

import java.math.BigInteger;

public record BookingRequest (
        Long bookingId,
        Long roomId,
        String roomName,
        String organiserName,
        BigInteger attendanceCount,
        BigInteger status )
{}
