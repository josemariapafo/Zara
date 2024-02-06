package com.inditex.zara.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * The type Price.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Price {

    private Long priceId;

    private Long brandId;

    private Date startDate;

    private Date endDate;

    private Long priceList;

    private Long productId;

    private Long priority;

    private float pvp;

    private String curr;
}
