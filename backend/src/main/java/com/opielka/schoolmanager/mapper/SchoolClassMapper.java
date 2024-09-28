package com.opielka.schoolmanager.mapper;

import com.opielka.schoolmanager.api.entity.SchoolClass;
import com.opielka.schoolmanager.api.to.SchoolClassEto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SchoolClassMapper {
    SchoolClassEto toEto(SchoolClass schoolClass);
    SchoolClass toEntity(SchoolClassEto schoolClass);
}
