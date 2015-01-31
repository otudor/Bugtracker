package com.endava.bugtracker.service.imp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.endava.bugtracker.domain.Project;
import com.endava.bugtracker.repository.ProjectRepository;
import com.endava.bugtracker.service.ProjectService;



@Service
public class ProjectServiceImp implements ProjectService {
    @Autowired
    protected ProjectRepository projectRepository;

    @Transactional(readOnly = true)
    public Page<Project> findAll(int page, int size) {
        Pageable pageable = new PageRequest(page, size, new Sort(
                Direction.DESC, "id"));
        Page<Project> persons = projectRepository.findAll(pageable);
        return persons;
    }

    @Transactional(readOnly = true)
    public Page<Project> findByNameLike(String name, int page, int size) {
        Pageable pageable = new PageRequest(page, size, new Sort(
                Direction.DESC, "id"));
        String q = "%" + name + "%";
        Page<Project> projects = projectRepository.findByNameLike(q, pageable);
        return projects;
    }

  
    @Transactional(readOnly = true)
    public Project findById(Long id) {
    	Project project = projectRepository.findOne(id);
        return project;
    }

    @Transactional
    public Project insert(Project project) {
        return projectRepository.save(project);
    }

    @Transactional
    public Project update(Project project) {
        return projectRepository.save(project);
    }


    @Transactional
    public void deleteById(Long id) {
        projectRepository.delete(id);
    }





}
