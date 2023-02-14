package com.axelor.student.module;

import com.axelor.app.AxelorModule;
import com.axelor.student.db.repo.StudentManagementRepository;
import com.axelor.student.db.repo.StudentRepository;
import com.axelor.student.service.PeopleService;
import com.axelor.student.service.PeopleServiceImpl;

public class StudentModule extends AxelorModule {
	
	@Override
	protected void configure() {
			bind(PeopleService.class).to(PeopleServiceImpl.class);
			bind(StudentRepository.class).to(StudentManagementRepository.class);
	}
}
