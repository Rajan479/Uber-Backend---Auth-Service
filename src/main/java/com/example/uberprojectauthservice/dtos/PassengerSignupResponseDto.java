package com.example.uberprojectauthservice.dtos;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerSignupResponseDto {

    private String passengerName;

    private String email;

    private String password;

    private String phoneNumber;

    private Date createdAt;

    private Date updatedAt;

}
