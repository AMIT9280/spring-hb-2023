package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "developerprojects")
public class DeveloperProjectEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer devproId;
	
	Integer devId; 
	Integer projectId;
	
	public Integer getDevproId() {
		return devproId;
	}
	public void setDevproId(Integer devproId) {
		this.devproId = devproId;
	}
 
	public Integer getDevId() {
		return devId;
	}
	public void setDevId(Integer devId) {
		this.devId = devId;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	
	
}
