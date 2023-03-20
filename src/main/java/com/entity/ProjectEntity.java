package com.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class ProjectEntity {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer projectId;
	 String projectName;
	 String technologyName;
	 
	 @ManyToMany(mappedBy = "projects")
	 Set<DeveloperEntity> developer;
	 
	 
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Set<DeveloperEntity> getDeveloper() {
		return developer;
	}
	public void setDeveloper(Set<DeveloperEntity> developer) {
		this.developer = developer;
	}
 
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTechnologyName() {
		return technologyName;
	}
	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
	 
	 
}
