package com.volunteer.dao;

import java.util.List;

import com.volunteer.model.Project;
import com.volunteer.model.Task;

public interface ProjectDao {
	
	List<Project> getProjects();
	
	List<Task> getProjectTasks(int projectId);
	
	List<Project> getProjectsByStatus();
	
	List<Project> getProjectsWithRequirement();
	
	List<Project> getProjectsWithKeyword(String key);
	
	List<Project> getProjectsByLocation(String location);
	
	

}
