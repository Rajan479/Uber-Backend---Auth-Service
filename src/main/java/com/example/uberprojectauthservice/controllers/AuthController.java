package com.example.uberprojectauthservice.controllers;

import com.example.uberprojectauthservice.dtos.PassengerSignupRequestDto;
import com.example.uberprojectauthservice.dtos.PassengerSignupResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("/signup/passenger")
    public ResponseEntity<PassengerSignupResponseDto> signUp(@RequestBody PassengerSignupRequestDto passengerSignupRequestDto) {
        return null;
    }

}
