package com.endava.bugtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endava.bugtracker.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
