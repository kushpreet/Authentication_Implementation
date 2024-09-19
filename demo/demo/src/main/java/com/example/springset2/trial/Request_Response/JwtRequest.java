package com.example.springset2.trial.Request_Response;


import lombok.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString

public class JwtRequest {
    private String email;
    private String password;
}