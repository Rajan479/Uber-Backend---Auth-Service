package com.example.uberprojectauthservice.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

import static jakarta.persistence.TemporalType.TIMESTAMP;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel{

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(value = TIMESTAMP)
    private Date startTime;

    @Temporal(value = TIMESTAMP)
    private Date endTime;

    private long totalDistance;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    private Passenger passenger;

}
