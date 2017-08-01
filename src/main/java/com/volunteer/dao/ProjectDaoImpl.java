package com.volunteer.dao;

import java.util.List;

import javax.persistence.Query;

import com.volunteer.model.Project;
import com.volunteer.model.Task;

public class ProjectDaoImpl extends JPADao<Project> implements ProjectDao{

	@Override
	public List<Project> getProjects() {
		Query query = entityManager.createQuery("SELECT p from Project p");
		return query.getResultList();
	}

	@Override
	public List<Task> getProjectTasks(int projectId) {
		Query query = entityManager.createQuery("SELEC t from Project p JOIN FETCH p.tasks t WHERE p.id = :project_id");
		return query.getResultList();
	}

	@Override
	public List<Project> getProjectsByStatus() {
		Query query = entityManager.createQuery("SELECT p from Project p JOIN FETCH ");
		return null;
	}

	@Override
	public List<Project> getProjectsWithRequirement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getProjectsWithKeyword(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getProjectsByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

}
