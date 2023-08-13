package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.entities.Project;
import com.app.repository.ProjectRepository;

@Service
@Transactional
public class ProjectServiceImpl implements  ProjectService {
	
	@Autowired
	private ProjectRepository projectrepo;

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return projectrepo.findAll();
	}

	@Override
	public ApiResponse addProjectDetail(Project transientProject) {
		String msg="Adding Project Failed";
		Project project=projectrepo.save(transientProject);
		if(project != null)
		{
			msg="Project added Successflly";
		}
		return new ApiResponse(msg);
	}

	@Override
	public ApiResponse updateProject(Project detachedProject) {
		String msg="Updating  Project  Failed";
		Project project=projectrepo.save(detachedProject);
		if(project != null)
		{
			msg="Project details updated Successflly";
		}
		return new ApiResponse(msg);
	}

	@Override
	public String removeProject(Long id) {
		String mesg="Id invalid cannot delete record";
		if(projectrepo.existsById(id))
		{
			projectrepo.deleteById(id);
			mesg="Deleted Successfully";
		}
		
		return mesg;
	
	}
	
	
}
