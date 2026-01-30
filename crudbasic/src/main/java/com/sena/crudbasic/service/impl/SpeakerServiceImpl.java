package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.SpeakerDto;
import com.sena.crudbasic.model.Speaker;
import com.sena.crudbasic.repository.SpeakerRepository;
import com.sena.crudbasic.service.SpeakerService;

@Service
public class SpeakerServiceImpl
implements SpeakerService {

    @Autowired
    private SpeakerRepository repo;

    @Override
    public List<Speaker> findAll() {
        return repo.findAll();
    }

    @Override
    public Speaker findById(int id) {
        return repo.findById(id).orElse(null);
    }

    // DTO → Model
    public Speaker dtoToModel(SpeakerDto dto) {
        Speaker speaker = new Speaker();
        speaker.setId(dto.getId());
        speaker.setPerson(null);
        speaker.setRecord(null);
        return speaker;
    }

    // Model → DTO
    public SpeakerDto modelToDto(Speaker speaker) {
        return new SpeakerDto(
                speaker.getId()
        );
    }

    @Override
    public String save(SpeakerDto s) {
        Speaker speaker = dtoToModel(s);
        repo.save(speaker);
        return null;
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return null;
    }
}
