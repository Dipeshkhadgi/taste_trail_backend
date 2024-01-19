package com.online.test_trail.service.impl;

import com.online.test_trail.dto.request.AuthenticateRequest;
//import com.online.test_trail.dto.response.AuthenticateResponse;
import com.online.test_trail.dto.response.AuthenticateResponse;
import com.online.test_trail.repo.UserRepo;
//import com.online.test_trail.security.JwtService;
import com.online.test_trail.security.JwtService;
import com.online.test_trail.service.AuthenticateService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AuthenticateServiceImpl implements AuthenticateService {

    private final UserRepo userRepo;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;


    @Override
    public AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticateRequest.getEmail(), authenticateRequest.getPassword()
                )
        );

        UserDetails userDetails = userRepo.getUserByEmail(authenticateRequest.getEmail())
                .orElseThrow(() -> new EntityNotFoundException("User not found."));
        String jwtToken = jwtService.generateToken(userDetails);
        return AuthenticateResponse.builder().token(jwtToken).build();
    }
}
