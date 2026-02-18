package com.codebaithak.super150.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String email;
}
