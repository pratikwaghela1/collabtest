package com.pc.collabtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pc.collabtest.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
