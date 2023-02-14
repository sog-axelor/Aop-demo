package com.axelor.student.web;

import com.axelor.rpc.Context;
import com.axelor.student.db.People;
import com.axelor.student.db.repo.PeopleRepository;
import com.axelor.student.service.PeopleService;

import java.time.LocalDate;
import java.time.LocalTime;

import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;

public class PeopleController {
			
	public void checkPossibility(ActionRequest request , ActionResponse response) {
	Context context =  request.getContext();
	
	//Context parent = context.getParent();
	
	People people = context.asType(People.class);
	System.err.println(people);
	if(people.getId()!=null) {
		people = Beans.get(PeopleRepository.class).find(people.getId());

	}
	System.err.println(people);
	
	Beans.get(PeopleService.class).validateDob(people);
	
	response.setAlert("Hello");
	response.setAlert("Current time is : "+LocalTime.now());
	response.setAttr("dobTime","value", LocalTime.now());
	}
}
