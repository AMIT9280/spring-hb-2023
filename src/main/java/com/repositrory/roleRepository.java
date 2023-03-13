package com.repositrory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.RoleEntity;

@Repository
public interface roleRepository extends JpaRepository<RoleEntity, Integer> {

}
