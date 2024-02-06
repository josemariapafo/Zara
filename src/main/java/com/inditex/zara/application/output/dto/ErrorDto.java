package com.inditex.zara.application.output.dto;

import lombok.Builder;
import lombok.Data;

/**
 * The type Error dto.
 */
@Builder
@Data
public class ErrorDto {

    private String message;
}
