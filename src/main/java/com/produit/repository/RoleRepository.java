package com.produit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produit.models.ERole;
import com.produit.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name); 

}
