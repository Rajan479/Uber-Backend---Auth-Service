package com.example.uberprojectauthservice.services;

import com.example.uberprojectauthservice.dtos.PassengerSignupRequestDto;
import com.example.uberprojectauthservice.dtos.PassengerSignupResponseDto;
import com.example.uberprojectauthservice.models.Passenger;
import com.example.uberprojectauthservice.repositories.PassengerRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final PassengerRepository passengerRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AuthService(PassengerRepository passengerRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.passengerRepository = passengerRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public PassengerSignupResponseDto signUpPassenger(PassengerSignupRequestDto passengerSignupRequestDto){
        Passenger passenger = Passenger.builder()
                .passengerName(passengerSignupRequestDto.getPassengerName())
                .phoneNumber(passengerSignupRequestDto.getPhoneNumber())
                .email(passengerSignupRequestDto.getEmail())
                .password(bCryptPasswordEncoder.encode(passengerSignupRequestDto.getPassword()))
                .build();

        Passenger newPassenger = passengerRepository.save(passenger);

        PassengerSignupResponseDto response = PassengerSignupResponseDto.from(newPassenger);
        return response;
    }

}
