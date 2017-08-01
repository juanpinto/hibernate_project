package com.volunteer.dao;

import java.util.List;

import com.volunteer.model.Project;
import com.volunteer.model.ResourceRequested;
import com.volunteer.model.Status;
import com.volunteer.model.Task;

public interface ProjectDao {
	
	List<Project> getProjects();
	
	List<Task> getProjectTasks(int projectId);
	
	List<Project> getProjectsByStatus(Status status);
	
	List<Project> getProjectsWithRequirement(ResourceRequested resource);
	
	List<Project> getProjectsWithKeyword(String key);
	
	List<Project> getProjectsByLocation(String location);
	
	

}
