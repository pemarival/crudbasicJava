package com.sena.crudbasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Speaker;

@Repository
public interface SpeakerRepository
extends JpaRepository<Speaker, Integer> {
}
