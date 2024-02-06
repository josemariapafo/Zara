package com.inditex.zara.infrastructure.input.rest.error;

import com.inditex.zara.domain.exception.NotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = {GlobalExceptionHandler.class})
@ExtendWith(SpringExtension.class)
class GlobalExceptionHandlerTest {

    @Autowired
    private GlobalExceptionHandler globalExceptionHandler;

    /**
     * Method under test:
     * {@link GlobalExceptionHandler#handlerNotFoundException(NotFoundException)}
     */
    @Test
    void testHandlerNotFoundException() {
        assertEquals("An error occurred",
                globalExceptionHandler.handlerNotFoundException(new NotFoundException("An error occurred")).getMessage());
    }

    /**
     * Method under test:
     * {@link GlobalExceptionHandler#handlerMissingServletRequestParameterException(MissingServletRequestParameterException)}
     */
    @Test
    void testHandlerMissingServletRequestParameterException() {
        assertEquals("Todos los parámetros de la request son obligatorios.",
                globalExceptionHandler
                        .handlerMissingServletRequestParameterException(
                                new MissingServletRequestParameterException("Parameter Name", "Parameter Type"))
                        .getMessage());
    }

    /**
     * Method under test:
     * {@link GlobalExceptionHandler#handlerMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException)}
     */
    @Test
    void testHandlerMethodArgumentTypeMismatchException2() {
        Class<Object> requiredType = Object.class;
        assertEquals("Introduce el correcto tipado en los parametros de la request.", globalExceptionHandler
                .handlerMethodArgumentTypeMismatchException(
                        new MethodArgumentTypeMismatchException("Value", requiredType, "0123456789ABCDEF", null, new Throwable()))
                .getMessage());
    }
}
