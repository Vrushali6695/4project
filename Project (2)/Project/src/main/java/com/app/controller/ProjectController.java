package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Project;
import com.app.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	public ProjectController() {
		System.out.println("in ctor of "+getClass());
	}
	
	@GetMapping
	public List<Project> showAllProjects()
	{
		return projectService.getAllProjects();
	}
	
	@PostMapping
	public ResponseEntity<?> addProject(@RequestBody Project transientProject)
	{
		return new ResponseEntity<>(projectService.addProjectDetail(transientProject),HttpStatus.CREATED);
	}
	
	

	@PutMapping()
	public ResponseEntity<?> updateProject(@RequestBody Project detachedProject)
	{
		return new ResponseEntity<>(projectService.updateProject(detachedProject),HttpStatus.CREATED);
	}
	
	
	
	@DeleteMapping("/{id}")
	public String deleteProject(@PathVariable Long id)
	{
		return projectService.removeProject(id);
	}
	

}
