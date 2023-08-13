package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "projects")
public class Project extends BaseEntity {
	@Column(name = "project_name", length=20,nullable = false)
	private String projectName;
	@Column(nullable = false)
	private LocalDate dateOfStart;
	private double teamSize;
	
	
	public Project() {
		
	}
	
	public Project(String projectName, LocalDate dateOfStart, double teamSize) {
		super();
		this.projectName = projectName;
		this.dateOfStart = dateOfStart;
		this.teamSize = teamSize;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public LocalDate getDateOfStart() {
		return dateOfStart;
	}

	public void setDateOfStart(LocalDate dateOfStart) {
		this.dateOfStart = dateOfStart;
	}

	public double getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(double teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", dateOfStart=" + dateOfStart + ", teamSize=" + teamSize
				+ ", ProjectId()=" + getId() + "]";
	}

	
	

	

}
