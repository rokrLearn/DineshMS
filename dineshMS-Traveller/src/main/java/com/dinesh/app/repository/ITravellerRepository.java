package com.dinesh.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.app.model.Traveller;

@Repository
public interface ITravellerRepository extends JpaRepository<Traveller, Long>{

}
