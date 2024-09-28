package com.opielka.schoolmanager.repository;

import com.opielka.schoolmanager.api.entity.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolClassRepository extends JpaRepository<SchoolClass, Long> {
}
