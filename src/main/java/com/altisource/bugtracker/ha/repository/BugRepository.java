package com.altisource.bugtracker.ha.repository;

import org.springframework.data.repository.CrudRepository;

import com.altisource.bugtracker.ha.domain.Bug;

public interface BugRepository extends CrudRepository<Bug, Long>{

}
