package com.inditex.zara.infrastructure.output.respository;

import com.inditex.zara.infrastructure.output.entity.PriceEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ContextConfiguration(classes = {PriceRepository.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.inditex.zara.infrastructure.output.entity"})
@DataJpaTest
class PriceRepositoryTest {

    @Autowired
    private PriceRepository priceRepository;

    /**
     * Method under test:
     * {@link PriceRepository#findPricesByBrandIdAndProductIdAndDateRange(Long, Long, Date)}
     */
    @Test
    void testFindPricesByBrandIdAndProductIdAndDateRange() {

        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(1L);
        priceEntity.setCurr("Curr");
        priceEntity.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity.setPriceId(1L);
        priceEntity.setPriceList(1L);
        priceEntity.setPriority(1L);
        priceEntity.setProductId(35455L);
        priceEntity.setPvp(10.0f);
        priceEntity.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBrandId(1L);
        priceEntity2.setCurr("EUR");
        priceEntity2.setEndDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceEntity2.setPriceId(2L);
        priceEntity2.setPriceList(1L);
        priceEntity2.setPriority(1L);
        priceEntity2.setProductId(35455L);
        priceEntity2.setPvp(0.5f);
        priceEntity2.setStartDate(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        priceRepository.save(priceEntity);
        priceRepository.save(priceEntity2);
        assertNotNull(priceRepository.findPricesByBrandIdAndProductIdAndDateRange(1L, 1L,
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())));
    }
}
