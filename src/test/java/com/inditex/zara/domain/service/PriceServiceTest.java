package com.inditex.zara.domain.service;

import com.inditex.zara.application.output.PriceOutputPort;
import com.inditex.zara.domain.exception.NotFoundException;
import com.inditex.zara.domain.model.Price;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {PriceService.class})
@ExtendWith(SpringExtension.class)
class PriceServiceTest {

    @MockBean
    private PriceOutputPort priceOutputPort;

    @Autowired
    private PriceService priceService;

    /**
     * Method under test:
     * {@link PriceService#getPriceInformationByDateAndProductBrandId(Date, Long, Long)}
     */
    @Test
    void testGetPriceInformationByDateAndProductBrandId() {
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
        Optional<Price> ofResult = Optional.of(buildResult);
        when(priceOutputPort.getPriceByBrandProductAndDate(Mockito.any(), Mockito.<Long>any(), Mockito.<Long>any()))
                .thenReturn(ofResult);
        priceService.getPriceInformationByDateAndProductBrandId(
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), 1L, 1L);
        verify(priceOutputPort).getPriceByBrandProductAndDate(Mockito.any(), Mockito.<Long>any(),
                Mockito.<Long>any());
    }

    /**
     * Method under test:
     * {@link PriceService#getPriceInformationByDateAndProductBrandId(Date, Long, Long)}
     */
    @Test
    void testGetPriceInformationByDateAndProductBrandIdWhenDataNotFound() {
        Optional<Price> emptyResult = Optional.empty();
        when(priceOutputPort.getPriceByBrandProductAndDate(Mockito.any(), Mockito.any(), Mockito.<Long>any()))
                .thenReturn(emptyResult);
        Date date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        assertThrows(NotFoundException.class, () -> priceService.getPriceInformationByDateAndProductBrandId(
                date, 1L, 1L));
        verify(priceOutputPort).getPriceByBrandProductAndDate(Mockito.any(), Mockito.any(),
                Mockito.any());
    }

    /**
     * Method under test:
     * {@link PriceService#getPriceInformationByDateAndProductBrandId(Date, Long, Long)}
     */
    @Test
    void testGetPriceInformationByDateAndProductBrandIdWhenDataNotFound2() {
        when(priceOutputPort.getPriceByBrandProductAndDate(Mockito.any(), Mockito.<Long>any(), Mockito.<Long>any()))
                .thenThrow(new NotFoundException("An error occurred"));
        Date date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        assertThrows(NotFoundException.class, () -> priceService.getPriceInformationByDateAndProductBrandId(
                date, 1L, 1L));
        verify(priceOutputPort).getPriceByBrandProductAndDate(Mockito.any(), Mockito.<Long>any(),
                Mockito.<Long>any());
    }
}
