package com.inditex.zara.infrastructure.input.rest.error;

import com.inditex.zara.application.output.dto.ErrorDto;
import com.inditex.zara.domain.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * The type Global exception handler.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handler not found exception error dto.
     *
     * @param notFoundException the not found exception
     * @return the error dto
     */
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDto handlerNotFoundException(NotFoundException notFoundException) {
        return ErrorDto.builder()
                .message(notFoundException.getMessage())
                .build();
    }

    /**
     * Handler missing servlet request parameter exception error dto.
     *
     * @param missingServletRequestParameterException the missing servlet request parameter exception
     * @return the error dto
     */
    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDto handlerMissingServletRequestParameterException(MissingServletRequestParameterException missingServletRequestParameterException) {
        return ErrorDto.builder()
                .message("Todos los parámetros de la request son obligatorios.")
                .build();
    }

    /**
     * Handler method argument type mismatch exception error dto.
     *
     * @param methodArgumentTypeMismatchException the method argument type mismatch exception
     * @return the error dto
     */
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDto handlerMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException methodArgumentTypeMismatchException) {
        return ErrorDto.builder()
                .message("Introduce el correcto tipado en los parametros de la request.")
                .build();
    }
}
