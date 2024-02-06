package com.inditex.zara.infrastructure.input.rest.mapper;

import com.inditex.zara.application.output.dto.PriceDto;
import com.inditex.zara.domain.model.Price;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * The interface Price rest mapper.
 */
@Mapper
public interface PriceRestMapper {

    /**
     * The constant INSTANCE.
     */
    PriceRestMapper INSTANCE = Mappers.getMapper(PriceRestMapper.class);

    /**
     * To dto price dto.
     *
     * @param price the price
     * @return the price dto
     */
    @Mapping(source = "price.productId", target = "productId")
    @Mapping(source = "price.brandId", target = "brandId")
    @Mapping(source = "price.priceList", target = "priceList")
    @Mapping(source = "price.startDate", target = "startDate")
    @Mapping(source = "price.endDate", target = "endDate")
    @Mapping(source = "price.pvp", target = "pvp")
    @Mapping(source = "price.curr", target = "curr")
    PriceDto toDto(Price price);
}
