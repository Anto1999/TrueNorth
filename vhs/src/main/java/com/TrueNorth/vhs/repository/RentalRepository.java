package com.TrueNorth.vhs.repository;

import com.TrueNorth.vhs.entity.Rental;
import com.TrueNorth.vhs.entity.User;
import com.TrueNorth.vhs.entity.Vhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface RentalRepository  extends JpaRepository<Rental,Long> {
    @Modifying
    @Transactional
    @Query("UPDATE Vhs vhs SET vhs.is_rental = true where vhs.vhsId= :vhs_id")
    void updateVhs(@Param("vhs_id") Long vhs_id);


    @Modifying
    @Transactional
    @Query("UPDATE Vhs vhs SET vhs.is_rental = false where vhs.vhsId= :vhs_id")
    void setVhsToFalse(@Param("vhs_id") Long vhs_id);



}
