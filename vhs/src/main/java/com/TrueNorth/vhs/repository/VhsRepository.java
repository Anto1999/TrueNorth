package com.TrueNorth.vhs.repository;

import com.TrueNorth.vhs.entity.Vhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface VhsRepository extends JpaRepository<Vhs,Long> {


}
