package com.endava.bugtracker.frontend.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.endava.bugtracker.domain.Issue;
import com.endava.bugtracker.repository.IssueRepository;

@Controller
@RequestMapping("/issue/createIssue")
public class IssueController {

	@Autowired
	private IssueRepository issueRepo;
	
	 @RequestMapping(method=RequestMethod.GET)
	 public void form() {}
	 
	 @RequestMapping(method=RequestMethod.POST)
	 public void saveIssue(Issue issue, Model model) {
		 issue.setCreated(new Timestamp(System.currentTimeMillis()));
		 
		 issueRepo.saveAndFlush(issue);
	 }
}
