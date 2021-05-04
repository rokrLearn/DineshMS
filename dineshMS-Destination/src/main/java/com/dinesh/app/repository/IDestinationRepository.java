package com.dinesh.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.app.model.Destination;

@Repository
public interface IDestinationRepository extends JpaRepository<Destination, Long>{

}
