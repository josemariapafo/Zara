package com.inditex.zara.domain.service;

import com.inditex.zara.application.input.PriceUseCase;
import com.inditex.zara.application.output.PriceOutputPort;
import com.inditex.zara.domain.exception.NotFoundException;
import com.inditex.zara.domain.model.Price;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * The type Price service.
 */
@Service
@AllArgsConstructor
public class PriceService implements PriceUseCase {

    private final PriceOutputPort priceOutputPort;

    @Override
    public Price getPriceInformationByDateAndProductBrandId(Date applyDate, Long productId, Long brandId) {
        return priceOutputPort.getPriceByBrandProductAndDate(applyDate, productId, brandId)
                .orElseThrow(() -> new NotFoundException("No se encontraron resultados."));
    }
}
