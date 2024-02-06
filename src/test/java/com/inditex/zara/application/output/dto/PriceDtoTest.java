package com.inditex.zara.application.output.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class PriceDtoTest {
    /**
     * Method under test: {@link PriceDto#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new PriceDto()).canEqual("Other"));
    }

    /**
     * Method under test: {@link PriceDto#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertTrue(buildResult.canEqual(buildResult2));
    }

    /**
     * Method under test: {@link PriceDto#canEqual(Object)}
     */
    @Test
    void testCanEqual3() {
        java.sql.Date startDate = mock(java.sql.Date.class);
        assertFalse((new PriceDto(1L, 1L, 3L, startDate,
                java.util.Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), 10.0f, "Curr"))
                .canEqual("Other"));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceDto#PriceDto()}
     *   <li>{@link PriceDto#setBrandId(Long)}
     *   <li>{@link PriceDto#setCurr(String)}
     *   <li>{@link PriceDto#setEndDate(Date)}
     *   <li>{@link PriceDto#setPriceList(Long)}
     *   <li>{@link PriceDto#setProductId(Long)}
     *   <li>{@link PriceDto#setPvp(float)}
     *   <li>{@link PriceDto#setStartDate(Date)}
     *   <li>{@link PriceDto#toString()}
     *   <li>{@link PriceDto#getBrandId()}
     *   <li>{@link PriceDto#getCurr()}
     *   <li>{@link PriceDto#getEndDate()}
     *   <li>{@link PriceDto#getPriceList()}
     *   <li>{@link PriceDto#getProductId()}
     *   <li>{@link PriceDto#getPvp()}
     *   <li>{@link PriceDto#getStartDate()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PriceDto actualPriceDto = new PriceDto();
        actualPriceDto.setBrandId(1L);
        actualPriceDto.setCurr("Curr");
        Date endDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPriceDto.setEndDate(endDate);
        actualPriceDto.setPriceList(1L);
        actualPriceDto.setProductId(1L);
        actualPriceDto.setPvp(10.0f);
        Date startDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPriceDto.setStartDate(startDate);
        actualPriceDto.toString();
        Long actualBrandId = actualPriceDto.getBrandId();
        String actualCurr = actualPriceDto.getCurr();
        Date actualEndDate = actualPriceDto.getEndDate();
        Long actualPriceList = actualPriceDto.getPriceList();
        Long actualProductId = actualPriceDto.getProductId();
        float actualPvp = actualPriceDto.getPvp();
        Date actualStartDate = actualPriceDto.getStartDate();
        assertEquals("Curr", actualCurr);
        assertEquals(10.0f, actualPvp);
        assertEquals(1L, actualBrandId.longValue());
        assertEquals(1L, actualPriceList.longValue());
        assertEquals(1L, actualProductId.longValue());
        assertSame(endDate, actualEndDate);
        assertSame(startDate, actualStartDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceDto#PriceDto(Long, Long, Long, Date, Date, float, String)}
     *   <li>{@link PriceDto#setBrandId(Long)}
     *   <li>{@link PriceDto#setCurr(String)}
     *   <li>{@link PriceDto#setEndDate(Date)}
     *   <li>{@link PriceDto#setPriceList(Long)}
     *   <li>{@link PriceDto#setProductId(Long)}
     *   <li>{@link PriceDto#setPvp(float)}
     *   <li>{@link PriceDto#setStartDate(Date)}
     *   <li>{@link PriceDto#toString()}
     *   <li>{@link PriceDto#getBrandId()}
     *   <li>{@link PriceDto#getCurr()}
     *   <li>{@link PriceDto#getEndDate()}
     *   <li>{@link PriceDto#getPriceList()}
     *   <li>{@link PriceDto#getProductId()}
     *   <li>{@link PriceDto#getPvp()}
     *   <li>{@link PriceDto#getStartDate()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Date startDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        PriceDto actualPriceDto = new PriceDto(1L, 1L, 1L, startDate,
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), 10.0f, "Curr");
        actualPriceDto.setBrandId(1L);
        actualPriceDto.setCurr("Curr");
        Date endDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPriceDto.setEndDate(endDate);
        actualPriceDto.setPriceList(1L);
        actualPriceDto.setProductId(1L);
        actualPriceDto.setPvp(10.0f);
        Date startDate2 = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPriceDto.setStartDate(startDate2);
        actualPriceDto.toString();
        Long actualBrandId = actualPriceDto.getBrandId();
        String actualCurr = actualPriceDto.getCurr();
        Date actualEndDate = actualPriceDto.getEndDate();
        Long actualPriceList = actualPriceDto.getPriceList();
        Long actualProductId = actualPriceDto.getProductId();
        float actualPvp = actualPriceDto.getPvp();
        Date actualStartDate = actualPriceDto.getStartDate();
        assertEquals("Curr", actualCurr);
        assertEquals(10.0f, actualPvp);
        assertEquals(1L, actualBrandId.longValue());
        assertEquals(1L, actualPriceList.longValue());
        assertEquals(1L, actualProductId.longValue());
        assertSame(endDate, actualEndDate);
        assertSame(startDate2, actualStartDate);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(null, buildResult);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals2() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals("Different type to PriceDto", buildResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceDto#equals(Object)}
     *   <li>{@link PriceDto#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertEquals(buildResult, buildResult);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceDto#equals(Object)}
     *   <li>{@link PriceDto#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals5() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(2L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals6() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(null).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals7() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr(null);
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals8() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("42");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals9() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals10() {
        PriceDto.PriceDtoBuilder pvpResult = PriceDto.builder()
                .brandId(1L)
                .curr("Curr")
                .endDate(null)
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals11() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(3L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals12() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(null)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals13() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(2L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals14() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(null)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals15() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(0.5f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals16() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PriceDto#equals(Object)}
     */
    @Test
    void testEquals17() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto buildResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f)
                .startDate(null)
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceDto#equals(Object)}
     *   <li>{@link PriceDto#hashCode()}
     * </ul>
     */
    @Test
    void testEquals18() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(null).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(null).curr("Curr");
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceDto#equals(Object)}
     *   <li>{@link PriceDto#hashCode()}
     * </ul>
     */
    @Test
    void testEquals19() {
        PriceDto.PriceDtoBuilder currResult = PriceDto.builder().brandId(1L).curr(null);
        PriceDto.PriceDtoBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        PriceDto.PriceDtoBuilder currResult2 = PriceDto.builder().brandId(1L).curr(null);
        PriceDto.PriceDtoBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceList(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceDto buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }
}
