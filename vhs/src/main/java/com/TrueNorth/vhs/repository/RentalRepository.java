package com.TrueNorth.vhs.repository;

import com.TrueNorth.vhs.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository  extends JpaRepository<Rental,Long> {
}
