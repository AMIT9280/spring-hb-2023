package com.repositrory;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.AddressEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {

}
