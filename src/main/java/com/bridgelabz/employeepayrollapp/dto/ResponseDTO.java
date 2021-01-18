package com.bridgelabz.employeepayrollapp.dto;

import lombok.Data;

public @Data class ResponseDTO {
    private String message;
    private Object date;

    public ResponseDTO(String message, Object date) {
        this.message = message;
        this.date = date;
    } 
}
