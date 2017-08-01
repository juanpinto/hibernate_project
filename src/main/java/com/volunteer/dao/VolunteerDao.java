package com.volunteer.dao;

import java.util.List;

import com.volunteer.model.Project;
import com.volunteer.model.Task;

public interface VolunteerDao {
	
	List<Project> getVolunteerProjects();
	
	List<Task> getVolunteerTask();

}
