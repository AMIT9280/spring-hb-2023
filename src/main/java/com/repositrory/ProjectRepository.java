package com.repositrory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ProjectEntity;

 

@Repository
public interface ProjectRepository  extends JpaRepository<ProjectEntity, Integer>{

}
