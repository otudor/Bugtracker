package com.altisource.bugtracker.ha.repository;

import org.springframework.data.repository.CrudRepository;

import com.altisource.bugtracker.ha.domain.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

}
