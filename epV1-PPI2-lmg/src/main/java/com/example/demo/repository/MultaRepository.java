package com.example.demo.repository;

import com.example.demo.entity.Multa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultaRepository extends JpaRepository <Multa,Long> {
}
