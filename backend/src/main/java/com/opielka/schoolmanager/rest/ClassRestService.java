package com.opielka.schoolmanager.rest;

import com.opielka.schoolmanager.api.entity.SchoolClass;
import com.opielka.schoolmanager.api.to.SchoolClassEto;
import com.opielka.schoolmanager.service.SchoolClassService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/class")
public class ClassRestService {

    private final SchoolClassService service;

    public ClassRestService(SchoolClassService service) {
        this.service = service;
    }

    @GetMapping("/mock")
    public SchoolClassEto getMockSchoolClass() {
        SchoolClass schoolClass = new SchoolClass();
        schoolClass.setId(1L);
        schoolClass.setStudent("test1");
        return service.mapSchoolClass(
                schoolClass);
    }

    @PostMapping("/save")
    public SchoolClass saveSchoolClass(@RequestBody SchoolClassEto schoolClassEto) {
        return service.saveClass(schoolClassEto);
    }
}
