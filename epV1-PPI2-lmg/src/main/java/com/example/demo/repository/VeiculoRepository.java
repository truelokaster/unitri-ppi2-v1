package com.example.demo.repository;

import com.example.demo.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    Veiculo findByModelo(String modelo);
}
