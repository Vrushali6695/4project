package com.app.service;

import java.util.List;


import com.app.dto.ApiResponse;
import com.app.entities.Project;


public interface ProjectService {
	
	//get
	List<Project> getAllProjects();

	//add
	ApiResponse addProjectDetail(Project transientProject);

	//update
	ApiResponse updateProject(Project detachedProject);
	
	//delete by id
	String removeProject(Long id);
	
	

}
