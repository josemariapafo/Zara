package com.inditex.zara.infrastructure.output.persistence;

import com.inditex.zara.application.output.PriceOutputPort;
import com.inditex.zara.domain.model.Price;
import com.inditex.zara.infrastructure.output.mapper.PricePersistenceMapper;
import com.inditex.zara.infrastructure.output.respository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

/**
 * The type Price persistence adapter.
 */
@Component
@RequiredArgsConstructor
public class PricePersistenceAdapter implements PriceOutputPort {

    private final PriceRepository priceRepository;

    private static final PricePersistenceMapper pricePersistenceMapper = PricePersistenceMapper.INSTANCE;

    @Override
    public Optional<Price> getPriceByBrandProductAndDate(Date requestedDate, Long productId, Long brandId) {
        return priceRepository.findPricesByBrandIdAndProductIdAndDateRange(brandId, productId, requestedDate)
                .map(pricePersistenceMapper::toModel);
    }
}
