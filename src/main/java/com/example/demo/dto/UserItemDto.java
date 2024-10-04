package com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.domain.Status;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserItemDto {

    private String userId;

}
