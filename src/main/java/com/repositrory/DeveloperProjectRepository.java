package com.repositrory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.DeveloperProjectEntity;

@Repository
public interface DeveloperProjectRepository extends JpaRepository<DeveloperProjectEntity, Integer> {

}
