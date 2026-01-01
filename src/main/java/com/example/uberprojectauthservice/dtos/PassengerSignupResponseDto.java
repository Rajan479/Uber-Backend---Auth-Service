package com.example.uberprojectauthservice.dtos;

import com.example.uberprojectauthservice.models.Passenger;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerSignupResponseDto {

    private String id;

    private String passengerName;

    private String email;

    private String password;

    private String phoneNumber;

    private Date createdAt;

    private Date updatedAt;

    public static  PassengerSignupResponseDto from(Passenger p) {
        PassengerSignupResponseDto result = PassengerSignupResponseDto.builder()
                .id(p.getId().toString())
                .passengerName(p.getPassengerName())
                .phoneNumber(p.getPhoneNumber())
                .email(p.getEmail())
                .password(p.getPassword())
                .createdAt(p.getCreatedAt())
                .build();

        return result;
    }
}
