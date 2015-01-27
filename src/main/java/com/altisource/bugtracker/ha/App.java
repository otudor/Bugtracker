package com.altisource.bugtracker.ha;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.altisource.bugtracker.ha.domain.Project;
import com.altisource.bugtracker.ha.repository.ProjectRepository;

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
    	
    	ProjectRepository repo = (ProjectRepository)ctx.getBean("projectRepository");
//    	repo.delete(13L);
    	repo.save(new Project());
    }
}