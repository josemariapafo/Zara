package com.inditex.zara.application.input;

import com.inditex.zara.domain.model.Price;

import java.util.Date;

/**
 * The interface Price use case.
 */
public interface PriceUseCase {

    /**
     * get price by apply date, product id and brand id.
     *
     * @param applyDate Date that we apply the price
     * @param productId the product id
     * @param brandId   the brand id
     * @return price information by date and product brand id
     */
    Price getPriceInformationByDateAndProductBrandId(Date applyDate, Long productId, Long brandId);
}
