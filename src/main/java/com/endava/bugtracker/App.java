package com.endava.bugtracker;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.endava.bugtracker.domain.Issue;
import com.endava.bugtracker.repository.IssueRepository;

/**
 * Hello world!
 *
 */
@Configuration
public class App 
{
	
	final static Logger LOG = Logger.getLogger(App.class.getSimpleName());
	
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("/appContext.xml");
    	LOG.info("Context initialized");
    	
//    	ProjectRepository repo = (ProjectRepository)ctx.getBean("projectRepository");
////    	repo.delete(13L);
//    	repo.save(new Project());
    	
    	IssueRepository repo = (IssueRepository)ctx.getBean("issueRepository");
    	
    	repo.save(new Issue());
    }
}