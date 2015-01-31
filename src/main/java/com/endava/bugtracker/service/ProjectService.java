package com.endava.bugtracker.service;

import org.springframework.data.domain.Page;

import com.endava.bugtracker.domain.Project;


public interface ProjectService {
    Page<Project> findAll(int page, int size);

    Page<Project> findByNameLike(String name, int page, int size);

    Project findById(Long id);

    Project insert(Project project);

    Project update(Project project);

    void deleteById(Long id);

}
