package com.endava.bugtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endava.bugtracker.domain.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long> {

}
