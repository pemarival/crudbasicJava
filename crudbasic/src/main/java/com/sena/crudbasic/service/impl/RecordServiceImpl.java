package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.RecordDto;
import com.sena.crudbasic.model.Record;
import com.sena.crudbasic.repository.RecordRepository;
import com.sena.crudbasic.service.RecordService;

@Service
public class RecordServiceImpl
implements RecordService {

    @Autowired
    private RecordRepository repo;

    @Override
    public List<Record> findAll() {
        return repo.findAll();
    }

    @Override
    public Record findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Record> filterByOnline(String online) {
        return repo.filterByOnline(online);
    }

    // DTO → Model
    public Record dtoToModel(RecordDto recordDto) {
        Record record = new Record();
        record.setId(recordDto.getId());
        record.setOnline(recordDto.getOnline());
        record.setFair(null);
        record.setChat(null);
        record.setVisitor(null);
        record.setSpeaker(null);
        record.setCompany(null);
        record.setDemostration(null);
        return record;
    }

    // Model → DTO
    public RecordDto modelToDto(Record record) {
        return new RecordDto(
                record.getId(),
                record.getOnline()
        );
    }

    @Override
    public String save(RecordDto recordDto) {
        Record record = dtoToModel(recordDto);
        repo.save(record);
        return null;
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return null;
    }
}
