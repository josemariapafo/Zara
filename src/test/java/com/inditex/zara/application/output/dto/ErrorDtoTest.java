package com.inditex.zara.application.output.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ErrorDtoTest {
    /**
     * Method under test: {@link ErrorDto#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new ErrorDto("Not all who wander are lost")).canEqual("Other"));
    }

    /**
     * Method under test: {@link ErrorDto#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        ErrorDto buildResult = ErrorDto.builder().message("Not all who wander are lost").build();
        ErrorDto buildResult2 = ErrorDto.builder().message("Not all who wander are lost").build();
        assertTrue(buildResult.canEqual(buildResult2));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorDto#ErrorDto(String)}
     *   <li>{@link ErrorDto#setMessage(String)}
     *   <li>{@link ErrorDto#toString()}
     *   <li>{@link ErrorDto#getMessage()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ErrorDto actualErrorDto = new ErrorDto("Not all who wander are lost");
        actualErrorDto.setMessage("Not all who wander are lost");
        String actualToStringResult = actualErrorDto.toString();
        assertEquals("ErrorDto(message=Not all who wander are lost)", actualToStringResult);
        assertEquals("Not all who wander are lost", actualErrorDto.getMessage());
    }

    /**
     * Method under test: {@link ErrorDto#equals(Object)}
     */
    @Test
    void testEquals() {
        ErrorDto buildResult = ErrorDto.builder().message("Not all who wander are lost").build();
        assertNotEquals(null, buildResult);
    }


    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorDto#equals(Object)}
     *   <li>{@link ErrorDto#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        ErrorDto buildResult = ErrorDto.builder().message("Not all who wander are lost").build();
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorDto#equals(Object)}
     *   <li>{@link ErrorDto#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        ErrorDto buildResult = ErrorDto.builder().message("Not all who wander are lost").build();
        ErrorDto buildResult2 = ErrorDto.builder().message("Not all who wander are lost").build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Method under test: {@link ErrorDto#equals(Object)}
     */
    @Test
    void testEquals4() {
        ErrorDto buildResult = ErrorDto.builder().message("Message").build();
        ErrorDto buildResult2 = ErrorDto.builder().message("Not all who wander are lost").build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link ErrorDto#equals(Object)}
     */
    @Test
    void testEquals5() {
        ErrorDto buildResult = ErrorDto.builder().message(null).build();
        ErrorDto buildResult2 = ErrorDto.builder().message("Not all who wander are lost").build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorDto#equals(Object)}
     *   <li>{@link ErrorDto#hashCode()}
     * </ul>
     */
    @Test
    void testEquals6() {
        ErrorDto buildResult = ErrorDto.builder().message(null).build();
        ErrorDto buildResult2 = ErrorDto.builder().message(null).build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }
}
