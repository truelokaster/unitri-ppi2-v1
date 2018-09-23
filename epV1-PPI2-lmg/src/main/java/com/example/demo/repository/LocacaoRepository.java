package com.example.demo.repository;

import com.example.demo.entity.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocacaoRepository extends JpaRepository <Locacao,Long> {
}
