package com.itb.inf3an.pizzariaatlas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

    private LocalDateTime timestamp;
    private String[] messages;
    private HttpStatus title;
    private int status;

}
