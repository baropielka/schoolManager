package com.opielka.schoolmanager.service;

import com.opielka.schoolmanager.api.entity.SchoolClass;
import com.opielka.schoolmanager.api.to.SchoolClassEto;
import com.opielka.schoolmanager.mapper.SchoolClassMapper;
import com.opielka.schoolmanager.repository.SchoolClassRepository;
import org.springframework.stereotype.Service;

@Service
public class SchoolClassService {

    private final SchoolClassMapper mapper;
    private final SchoolClassRepository repository;

    public SchoolClassService(SchoolClassMapper mapper, SchoolClassRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public SchoolClassEto mapSchoolClass(SchoolClass schoolClass) {
        return mapper.toEto(schoolClass);
    }

    public SchoolClass saveClass(SchoolClassEto schoolClassEto) {
        SchoolClass mapperEntity = mapper.toEntity(schoolClassEto);
        SchoolClass saved = repository.save(mapperEntity);
        return saved;
    }
}
