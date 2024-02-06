package com.inditex.zara.infrastructure.output.mapper;

import com.inditex.zara.domain.model.Price;
import com.inditex.zara.infrastructure.output.entity.PriceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * The interface Price persistence mapper.
 */
@Mapper
public interface PricePersistenceMapper {

    /**
     * The constant INSTANCE.
     */
    PricePersistenceMapper INSTANCE = Mappers.getMapper(PricePersistenceMapper.class);

    /**
     * To model price.
     *
     * @param priceEntity the price entity
     * @return the price
     */
    @Mapping(source = "priceEntity.priceId", target = "priceId")
    @Mapping(source = "priceEntity.brandId", target = "brandId")
    @Mapping(source = "priceEntity.startDate", target = "startDate")
    @Mapping(source = "priceEntity.endDate", target = "endDate")
    @Mapping(source = "priceEntity.priceList", target = "priceList")
    @Mapping(source = "priceEntity.productId", target = "productId")
    @Mapping(source = "priceEntity.priority", target = "priority")
    @Mapping(source = "priceEntity.pvp", target = "pvp")
    @Mapping(source = "priceEntity.curr", target = "curr")
    Price toModel(PriceEntity priceEntity);
}
