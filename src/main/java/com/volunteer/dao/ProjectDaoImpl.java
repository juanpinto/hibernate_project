package com.volunteer.dao;

import java.util.List;

import javax.persistence.Query;

import com.volunteer.model.Project;
import com.volunteer.model.ResourceRequested;
import com.volunteer.model.Status;
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
		query.setParameter("project_id", projectId);
		return query.getResultList();
	}

	@Override
	public List<Project> getProjectsByStatus(Status status) {
		Query query = entityManager.createQuery("SELECT p from Project p WHERE p.status = :status");
		query.setParameter("status", status);
		return query.getResultList();
	}

	@Override
	public List<Project> getProjectsWithRequirement(ResourceRequested resource) {
		Query query = entityManager.createQuery("SELECT p from Project p JOIN FETCH p.resources r WHERE r = :resource");
		query.setParameter("resource", resource);
		return query.getResultList();
	}

	@Override
	public List<Project> getProjectsWithKeyword(String key) {
		Query query = entityManager.createQuery("SELECT p from Project p WHERE p.description LIKE :key");
		query.setParameter("key", key);
		return query.getResultList();
	}

	@Override
	public List<Project> getProjectsByLocation(String location) {
		Query query = entityManager.createQuery("SELECT p from Project p WHERE p.description LIKE :location");
		query.setParameter("location", location);
		return query.getResultList();
	}

}
