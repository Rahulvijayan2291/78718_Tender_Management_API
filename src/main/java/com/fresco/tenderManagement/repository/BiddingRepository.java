package com.fresco.tenderManagement.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fresco.tenderManagement.model.BiddingModel;

@Repository
public interface BiddingRepository extends JpaRepository<BiddingModel, Integer> {
    List<BiddingModel> findByBidAmountGreaterThan(double bidAmount);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM bidding_model WHERE id = :id AND (bidder_id = :userId OR :isApprover = true)", nativeQuery = true)
    int deleteBiddingByIdAndUserAccess(@Param("id") int id, @Param("userId") int userId, @Param("isApprover") boolean isApprover);
    
}
