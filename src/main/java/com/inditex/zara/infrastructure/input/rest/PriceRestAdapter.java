package com.inditex.zara.infrastructure.input.rest;

import com.inditex.zara.application.input.PriceUseCase;
import com.inditex.zara.application.output.dto.PriceDto;
import com.inditex.zara.infrastructure.input.rest.mapper.PriceRestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * The type Price rest adapter.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/price")
public class PriceRestAdapter {

    private final PriceUseCase priceUseCase;

    private static final PriceRestMapper priceRestMapper = PriceRestMapper.INSTANCE;

    /**
     * Gets price information by date, product and brand id.
     *
     * @param applyDate the apply date
     * @param productId the product id
     * @param brandId   the brand id
     * @return the price information by date and product brand id
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PriceDto> getPriceInformationByDateAndProductBrandId(
            @RequestParam("applyDate") @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss") Date applyDate,
            @RequestParam("productId") Long productId,
            @RequestParam("brandId") Long brandId) {
        return ResponseEntity.ok().body(priceRestMapper.toDto(priceUseCase.
                getPriceInformationByDateAndProductBrandId(applyDate, productId, brandId)));
    }
}
