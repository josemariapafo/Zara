package com.inditex.zara.infrastructure.output.entity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class PriceEntityTest {
    /**
     * Method under test: {@link PriceEntity#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new PriceEntity()).canEqual("Other"));
    }

    /**
     * Method under test: {@link PriceEntity#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertTrue(priceEntity.canEqual(priceEntity2));
    }

    /**
     * Method under test: {@link PriceEntity#canEqual(Object)}
     */
    @Test
    void testCanEqual3() {
        PriceEntity.PriceEntityBuilder pvpResult = PriceEntity.builder()
                .brandId(1L)
                .curr("Curr")
                .endDate(mock(java.sql.Date.class))
                .priceId(1L)
                .priceList(1L)
                .priority(1L)
                .productId(1L)
                .pvp(10.0f);
        PriceEntity buildResult = pvpResult
                .startDate(java.util.Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()))
                .build();
        assertFalse(buildResult.canEqual("Other"));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceEntity#PriceEntity()}
     *   <li>{@link PriceEntity#setBrandId(Long)}
     *   <li>{@link PriceEntity#setCurr(String)}
     *   <li>{@link PriceEntity#setEndDate(Date)}
     *   <li>{@link PriceEntity#setPriceId(Long)}
     *   <li>{@link PriceEntity#setPriceList(Long)}
     *   <li>{@link PriceEntity#setPriority(Long)}
     *   <li>{@link PriceEntity#setProductId(Long)}
     *   <li>{@link PriceEntity#setPvp(float)}
     *   <li>{@link PriceEntity#setStartDate(Date)}
     *   <li>{@link PriceEntity#toString()}
     *   <li>{@link PriceEntity#getBrandId()}
     *   <li>{@link PriceEntity#getCurr()}
     *   <li>{@link PriceEntity#getEndDate()}
     *   <li>{@link PriceEntity#getPriceId()}
     *   <li>{@link PriceEntity#getPriceList()}
     *   <li>{@link PriceEntity#getPriority()}
     *   <li>{@link PriceEntity#getProductId()}
     *   <li>{@link PriceEntity#getPvp()}
     *   <li>{@link PriceEntity#getStartDate()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PriceEntity actualPriceEntity = new PriceEntity();
        actualPriceEntity.setBrandId(1L);
        actualPriceEntity.setCurr("Curr");
        Date endDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPriceEntity.setEndDate(endDate);
        actualPriceEntity.setPriceId(1L);
        actualPriceEntity.setPriceList(1L);
        actualPriceEntity.setPriority(1L);
        actualPriceEntity.setProductId(1L);
        actualPriceEntity.setPvp(10.0f);
        Date startDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPriceEntity.setStartDate(startDate);
        Long actualBrandId = actualPriceEntity.getBrandId();
        String actualCurr = actualPriceEntity.getCurr();
        Date actualEndDate = actualPriceEntity.getEndDate();
        Long actualPriceId = actualPriceEntity.getPriceId();
        Long actualPriceList = actualPriceEntity.getPriceList();
        Long actualPriority = actualPriceEntity.getPriority();
        Long actualProductId = actualPriceEntity.getProductId();
        float actualPvp = actualPriceEntity.getPvp();
        Date actualStartDate = actualPriceEntity.getStartDate();
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
     * {@link PriceEntity#PriceEntity(Long, Long, Date, Date, Long, Long, Long, float, String)}
     *   <li>{@link PriceEntity#setBrandId(Long)}
     *   <li>{@link PriceEntity#setCurr(String)}
     *   <li>{@link PriceEntity#setEndDate(Date)}
     *   <li>{@link PriceEntity#setPriceId(Long)}
     *   <li>{@link PriceEntity#setPriceList(Long)}
     *   <li>{@link PriceEntity#setPriority(Long)}
     *   <li>{@link PriceEntity#setProductId(Long)}
     *   <li>{@link PriceEntity#setPvp(float)}
     *   <li>{@link PriceEntity#setStartDate(Date)}
     *   <li>{@link PriceEntity#toString()}
     *   <li>{@link PriceEntity#getBrandId()}
     *   <li>{@link PriceEntity#getCurr()}
     *   <li>{@link PriceEntity#getEndDate()}
     *   <li>{@link PriceEntity#getPriceId()}
     *   <li>{@link PriceEntity#getPriceList()}
     *   <li>{@link PriceEntity#getPriority()}
     *   <li>{@link PriceEntity#getProductId()}
     *   <li>{@link PriceEntity#getPvp()}
     *   <li>{@link PriceEntity#getStartDate()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Date startDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        PriceEntity actualPriceEntity = new PriceEntity(1L, 1L, startDate,
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), 1L, 1L, 1L, 10.0f,
                "Curr");
        actualPriceEntity.setBrandId(1L);
        actualPriceEntity.setCurr("Curr");
        Date endDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPriceEntity.setEndDate(endDate);
        actualPriceEntity.setPriceId(1L);
        actualPriceEntity.setPriceList(1L);
        actualPriceEntity.setPriority(1L);
        actualPriceEntity.setProductId(1L);
        actualPriceEntity.setPvp(10.0f);
        Date startDate2 = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualPriceEntity.setStartDate(startDate2);
        Long actualBrandId = actualPriceEntity.getBrandId();
        String actualCurr = actualPriceEntity.getCurr();
        Date actualEndDate = actualPriceEntity.getEndDate();
        Long actualPriceId = actualPriceEntity.getPriceId();
        Long actualPriceList = actualPriceEntity.getPriceList();
        Long actualPriority = actualPriceEntity.getPriority();
        Long actualProductId = actualPriceEntity.getProductId();
        float actualPvp = actualPriceEntity.getPvp();
        Date actualStartDate = actualPriceEntity.getStartDate();
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
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotNull(priceEntity);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals2() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotNull(priceEntity);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceEntity#equals(Object)}
     *   <li>{@link PriceEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertEquals(priceEntity, priceEntity2);
        int expectedHashCodeResult = priceEntity.hashCode();
        assertEquals(expectedHashCodeResult, priceEntity2.hashCode());
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals5() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(2L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals6() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(null);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals7() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr(null);
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals8() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("com.inditex.zara.infrastructure.output.entity.PriceEntity");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals9() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals10() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(null);
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals11() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(2L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals12() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(null);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals13() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(3L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals14() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(null);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals15() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(3L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals16() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(null);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals17() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(2L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals18() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(null);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals19() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(0.5f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals20() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Method under test: {@link PriceEntity#equals(Object)}
     */
    @Test
    void testEquals21() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(null);

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(priceEntity, priceEntity2);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceEntity#equals(Object)}
     *   <li>{@link PriceEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals22() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(null);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(null);
        priceEntity2.setCurr("Curr");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertEquals(priceEntity, priceEntity2);
        int expectedHashCodeResult = priceEntity.hashCode();
        assertEquals(expectedHashCodeResult, priceEntity2.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceEntity#equals(Object)}
     *   <li>{@link PriceEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals23() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr(null);
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr(null);
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(1L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(1L);
        priceEntity2.setPvp(10.0f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertEquals(priceEntity, priceEntity2);
        int expectedHashCodeResult = priceEntity.hashCode();
        assertEquals(expectedHashCodeResult, priceEntity2.hashCode());
    }
}
