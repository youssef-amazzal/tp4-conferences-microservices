package edu.amazzal.authservice.service;

import edu.amazzal.authservice.entity.User;
import edu.amazzal.authservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AuthService {

    private UserRepository repository;
    private PasswordEncoder passwordEncoder;
    private JwtService jwtService;

    public String saveUser(User credential) {
        credential.setPassword(passwordEncoder.encode(credential.getPassword()));
        repository.save(credential);
        return "user added to the system";
    }

    public String generateToken(String username) {
        return jwtService.generateToken(username);
    }

    public void validateToken(String token) {
        jwtService.validateToken(token);
    }


}