package com.example.uberprojectauthservice.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PassengerSignupRequestDto {

    private String name;

    private String email;

    private String password;

    private String phoneNumber;

}
