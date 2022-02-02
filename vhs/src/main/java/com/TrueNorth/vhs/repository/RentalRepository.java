package com.TrueNorth.vhs.repository;

import com.TrueNorth.vhs.entity.Rental;
import com.TrueNorth.vhs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RentalRepository  extends JpaRepository<Rental,Long> {

}
