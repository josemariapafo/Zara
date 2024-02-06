package com.inditex.zara.infrastructure.output.persistence;

import com.inditex.zara.domain.model.Price;
import com.inditex.zara.infrastructure.output.entity.PriceEntity;
import com.inditex.zara.infrastructure.output.respository.PriceRepository;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {PricePersistenceAdapter.class})
@ExtendWith(SpringExtension.class)
class PricePersistenceAdapterTest {
    @Autowired
    private PricePersistenceAdapter pricePersistenceAdapter;

    @MockBean
    private PriceRepository priceRepository;

    /**
     * Method under test:
     * {@link PricePersistenceAdapter#getPriceByBrandProductAndDate(Date, Long, Long)}
     */
    @Test
    void testGetPriceByBrandProductAndDate() {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        Date endDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        priceEntity.setEndDate(endDate);
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(1L);
        priceEntity.setPvp(10.0f);
        Date startDate = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        priceEntity.setStartDate(startDate);
        Optional<PriceEntity> ofResult = Optional.of(priceEntity);
        when(priceRepository.findPricesByBrandIdAndProductIdAndDateRange(Mockito.<Long>any(), Mockito.<Long>any(),
                Mockito.any())).thenReturn(ofResult);
        Optional<Price> actualPriceByBrandProductAndDate = pricePersistenceAdapter.getPriceByBrandProductAndDate(
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()), 1L, 1L);
        verify(priceRepository).findPricesByBrandIdAndProductIdAndDateRange(Mockito.<Long>any(), Mockito.<Long>any(),
                Mockito.any());
        if(actualPriceByBrandProductAndDate.isPresent()) {
            Price getResult = actualPriceByBrandProductAndDate.get();
            assertEquals("Curr", getResult.getCurr());
            assertEquals(10.0f, getResult.getPvp());
            assertEquals(1L, getResult.getBrandId().longValue());
            assertEquals(1L, getResult.getPriceId().longValue());
            assertEquals(1L, getResult.getPriceList().longValue());
            assertEquals(1L, getResult.getPriority().longValue());
            assertEquals(1L, getResult.getProductId().longValue());
            assertSame(endDate, getResult.getEndDate());
            assertSame(startDate, getResult.getStartDate());
        }
    }
}
