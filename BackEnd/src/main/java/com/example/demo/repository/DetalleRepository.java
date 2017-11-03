package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Detalle;

@Repository
public interface DetalleRepository extends JpaRepository <Detalle, Long> {
	Detalle findById(long id);
}
