package com.evgeniykudashov.adservice.mapper.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UsernamePasswordDto {

    @Pattern(regexp = "^[a-zA-Z][a-zA-z0-9]{4,19}$",
            message = "password length should be minimum 4 and maximum 19, and consist of latin letters and digits")
    public String username;

    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9]{4,}$",
            message = "password length should be minimum 4 and consist of latin letters and digits")
    public String password;

    public UsernamePasswordDto(@JsonProperty(required = true) String username,
                               @JsonProperty(required = true) String password) {
        this.username = username;
        this.password = password;
    }
}