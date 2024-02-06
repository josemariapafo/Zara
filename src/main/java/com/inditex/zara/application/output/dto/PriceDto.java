package com.inditex.zara.application.output.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * The type Price dto.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceDto {

    private Long productId;

    private Long brandId;

    private Long priceList;

    private Date startDate;

    private Date endDate;

    private float pvp;

    private String curr;
}
