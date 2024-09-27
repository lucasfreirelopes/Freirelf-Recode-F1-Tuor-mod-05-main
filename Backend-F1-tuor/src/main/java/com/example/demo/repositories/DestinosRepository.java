package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.pacotes;

@Repository
public interface DestinosRepository extends JpaRepository<pacotes,Long>{

}
