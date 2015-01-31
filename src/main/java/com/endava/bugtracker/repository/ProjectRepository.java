package com.endava.bugtracker.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.endava.bugtracker.domain.Project;


public interface ProjectRepository extends JpaRepository<Project, Long> {
	 Page<Project> findByNameLike(String name, Pageable pageable);

}
