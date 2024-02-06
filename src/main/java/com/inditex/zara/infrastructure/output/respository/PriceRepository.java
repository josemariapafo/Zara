package com.inditex.zara.infrastructure.output.respository;

import com.inditex.zara.infrastructure.output.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.Optional;

/**
 * The interface Price repository.
 */
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {

    /**
     * Find prices by brand id and product id and date range optional.
     *
     * @param brandId       the brand id
     * @param productId     the product id
     * @param requestedDate the requested date
     * @return the optional
     */
    @Query("SELECT p FROM PriceEntity p " +
            "WHERE p.brandId = :brandId " +
            "AND p.productId = :productId " +
            "AND :requestedDate BETWEEN p.startDate AND p.endDate " +
            "ORDER BY p.priority DESC " +
            "LIMIT 1")
    Optional<PriceEntity> findPricesByBrandIdAndProductIdAndDateRange(
            @Param("brandId") Long brandId,
            @Param("productId") Long productId,
            @Param("requestedDate") Date requestedDate);
}
