package com.botidevapichaves.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.botidevapichaves.models.Personagem;

public interface PersonagensRepository extends JpaRepository<Personagem, Long> {

}
