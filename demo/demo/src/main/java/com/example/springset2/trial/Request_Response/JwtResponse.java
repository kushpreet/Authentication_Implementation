package com.example.springset2.trial.Request_Response;
import lombok.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString

public class JwtResponse {
    private String jwtToken;
    private String username;



}
