package com.inditex.zara.domain.service;

import com.inditex.zara.application.input.PriceUseCase;
import com.inditex.zara.application.output.PriceOutputPort;
import com.inditex.zara.domain.exception.NotFoundException;
import com.inditex.zara.domain.model.Price;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;


/**
 * The type Price service.
 */
@Service
@AllArgsConstructor
public class PriceService implements PriceUseCase {


    private final PriceOutputPort priceOutputPort;

    @Override
    public Price getPriceInformationByDateAndProductBrandId(Date applyDate, Long productId, Long brandId) {
        Optional<Price> price = priceOutputPort.getPriceByBrandProductAndDate(applyDate, productId, brandId);
        isEmptyResult(price);
        return price.get();
    }

    /**
     * isEmptyResult
     * @param price
     */
    private void isEmptyResult(Optional<Price> price) {
        if(!price.isPresent()) {
            throw new NotFoundException("No se encontraron resultados.");
        }
    }
}
