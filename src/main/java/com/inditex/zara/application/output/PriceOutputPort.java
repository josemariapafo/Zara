package com.inditex.zara.application.output;

import com.inditex.zara.domain.model.Price;

import java.util.Date;
import java.util.Optional;

/**
 * The interface Price output port.
 */
public interface PriceOutputPort {

    /**
     * Get price by applyDate, productId and brandId.
     *
     * @param requestedDate the requested date
     * @param productId     the product id
     * @param brandId       the brand id
     * @return price by brand product and date
     */
    Optional<Price> getPriceByBrandProductAndDate(Date requestedDate, Long productId, Long brandId);
}
