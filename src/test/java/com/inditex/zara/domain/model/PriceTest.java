package com.inditex.zara.domain.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class PriceTest {
    /**
     * Method under test: {@link Price#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Price()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Price#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertTrue(buildResult.canEqual(buildResult2));
    }

    /**
     * Method under test: {@link Price#canEqual(Object)}
     */
    @Test
    void testCanEqual3() {
        java.sql.Date startDate = mock(java.sql.Date.class);
        assertFalse((new Price(1L, 1L, startDate,
                java.util.Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), 3L, 1L, 3L,
                10.0f, "Curr")).canEqual("Other"));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Price#Price()}
     *   <li>{@link Price#setBrandId(Long)}
     *   <li>{@link Price#setCurr(String)}
     *   <li>{@link Price#setEndDate(Date)}
     *   <li>{@link Price#setPriceId(Long)}
     *   <li>{@link Price#setPriceList(Long)}
     *   <li>{@link Price#setPriority(Long)}
     *   <li>{@link Price#setProductId(Long)}
     *   <li>{@link Price#setPvp(float)}
     *   <li>{@link Price#setStartDate(Date)}
     *   <li>{@link Price#toString()}
     *   <li>{@link Price#getBrandId()}
     *   <li>{@link Price#getCurr()}
     *   <li>{@link Price#getEndDate()}
     *   <li>{@link Price#getPriceId()}
     *   <li>{@link Price#getPriceList()}
     *   <li>{@link Price#getPriority()}
     *   <li>{@link Price#getProductId()}
     *   <li>{@link Price#getPvp()}
     *   <li>{@link Price#getStartDate()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Price actualPrice = new Price();
        actualPrice.setBrandId(1L);
        actualPrice.setCurr("Curr");
        Date endDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPrice.setEndDate(endDate);
        actualPrice.setPriceId(1L);
        actualPrice.setPriceList(1L);
        actualPrice.setPriority(1L);
        actualPrice.setProductId(1L);
        actualPrice.setPvp(10.0f);
        Date startDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPrice.setStartDate(startDate);
        Long actualBrandId = actualPrice.getBrandId();
        String actualCurr = actualPrice.getCurr();
        Date actualEndDate = actualPrice.getEndDate();
        Long actualPriceId = actualPrice.getPriceId();
        Long actualPriceList = actualPrice.getPriceList();
        Long actualPriority = actualPrice.getPriority();
        Long actualProductId = actualPrice.getProductId();
        float actualPvp = actualPrice.getPvp();
        Date actualStartDate = actualPrice.getStartDate();
        assertEquals("Curr", actualCurr);
        assertEquals(10.0f, actualPvp);
        assertEquals(1L, actualBrandId.longValue());
        assertEquals(1L, actualPriceId.longValue());
        assertEquals(1L, actualPriceList.longValue());
        assertEquals(1L, actualPriority.longValue());
        assertEquals(1L, actualProductId.longValue());
        assertSame(endDate, actualEndDate);
        assertSame(startDate, actualStartDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link Price#Price(Long, Long, Date, Date, Long, Long, Long, float, String)}
     *   <li>{@link Price#setBrandId(Long)}
     *   <li>{@link Price#setCurr(String)}
     *   <li>{@link Price#setEndDate(Date)}
     *   <li>{@link Price#setPriceId(Long)}
     *   <li>{@link Price#setPriceList(Long)}
     *   <li>{@link Price#setPriority(Long)}
     *   <li>{@link Price#setProductId(Long)}
     *   <li>{@link Price#setPvp(float)}
     *   <li>{@link Price#setStartDate(Date)}
     *   <li>{@link Price#toString()}
     *   <li>{@link Price#getBrandId()}
     *   <li>{@link Price#getCurr()}
     *   <li>{@link Price#getEndDate()}
     *   <li>{@link Price#getPriceId()}
     *   <li>{@link Price#getPriceList()}
     *   <li>{@link Price#getPriority()}
     *   <li>{@link Price#getProductId()}
     *   <li>{@link Price#getPvp()}
     *   <li>{@link Price#getStartDate()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Date startDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        Price actualPrice = new Price(1L, 1L, startDate,
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), 1L, 1L, 1L, 10.0f,
                "Curr");
        actualPrice.setBrandId(1L);
        actualPrice.setCurr("Curr");
        Date endDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPrice.setEndDate(endDate);
        actualPrice.setPriceId(1L);
        actualPrice.setPriceList(1L);
        actualPrice.setPriority(1L);
        actualPrice.setProductId(1L);
        actualPrice.setPvp(10.0f);
        Date startDate2 = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPrice.setStartDate(startDate2);
        Long actualBrandId = actualPrice.getBrandId();
        String actualCurr = actualPrice.getCurr();
        Date actualEndDate = actualPrice.getEndDate();
        Long actualPriceId = actualPrice.getPriceId();
        Long actualPriceList = actualPrice.getPriceList();
        Long actualPriority = actualPrice.getPriority();
        Long actualProductId = actualPrice.getProductId();
        float actualPvp = actualPrice.getPvp();
        Date actualStartDate = actualPrice.getStartDate();
        assertEquals("Curr", actualCurr);
        assertEquals(10.0f, actualPvp);
        assertEquals(1L, actualBrandId.longValue());
        assertEquals(1L, actualPriceId.longValue());
        assertEquals(1L, actualPriceList.longValue());
        assertEquals(1L, actualPriority.longValue());
        assertEquals(1L, actualProductId.longValue());
        assertSame(endDate, actualEndDate);
        assertSame(startDate2, actualStartDate);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(null, buildResult);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals2() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotNull(buildResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Price#equals(Object)}
     *   <li>{@link Price#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals5() {
        Price.PriceBuilder currResult = Price.builder().brandId(2L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals6() {
        Price.PriceBuilder currResult = Price.builder().brandId(null).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals7() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr(null);
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals8() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("42");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals9() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals10() {
        Price.PriceBuilder pvpResult = Price.builder()
                .brandId(1L)
                .curr("Curr")
                .endDate(null)
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals11() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(2L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals12() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(null)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals13() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(3L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals14() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(null)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals15() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(3L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals16() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(null)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals17() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(2L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals18() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(null)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals19() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(0.5f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals20() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link Price#equals(Object)}
     */
    @Test
    void testEquals21() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr("Curr");
        Price buildResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f)
                .startDate(null)
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr("Curr");
        Price.PriceBuilder pvpResult = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Price#equals(Object)}
     *   <li>{@link Price#hashCode()}
     * </ul>
     */
    @Test
    void testEquals22() {
        Price.PriceBuilder currResult = Price.builder().brandId(null).curr("Curr");
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(null).curr("Curr");
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
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
     *   <li>{@link Price#equals(Object)}
     *   <li>{@link Price#hashCode()}
     * </ul>
     */
    @Test
    void testEquals23() {
        Price.PriceBuilder currResult = Price.builder().brandId(1L).curr(null);
        Price.PriceBuilder pvpResult = currResult
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult = pvpResult
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        Price.PriceBuilder currResult2 = Price.builder().brandId(1L).curr(null);
        Price.PriceBuilder pvpResult2 = currResult2
                .endDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        Price buildResult2 = pvpResult2
                .startDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }
}
