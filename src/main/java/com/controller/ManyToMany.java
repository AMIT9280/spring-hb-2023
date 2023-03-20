package com.controller;

 
 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.DeveloperEntity;
import com.entity.DeveloperProjectEntity;
import com.entity.ProjectEntity;
import com.repositrory.DeveloperProjectRepository;
import com.repositrory.DeveloperReposetory;
import com.repositrory.ProjectRepository;
@Controller
public class ManyToMany {

	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	DeveloperReposetory devRepo;

	@Autowired
	DeveloperProjectRepository devproRepo;
//	project
	
	@GetMapping("/addProject")
	public String addproject() {
		return "AddProject";
	}

	//------------------------------------------------------ Project crud ---------------------------------------------
	
	@PostMapping("/saveproject")
	public String saveProject(ProjectEntity project) {
		proRepo.save(project);
		return "redirect:/projects";
	}
	
	@GetMapping("/projects")  
	public String GetAllprojects(Model model) {
		List<ProjectEntity> projects = proRepo.findAll();
		model.addAttribute("projects", projects);
		return "ListProjects";
	}
	
	@GetMapping("/deleteProject/{projectId}")  
	public String DeleteProject(@PathVariable("projectId") Integer projectId) {
		proRepo.deleteById(projectId);
		return "redirect:/projects";
	}

	@GetMapping("/UpdateProject/{projectId}")
	public String UpdateProject(@PathVariable("projectId")  Integer projectId,Model model) {
		Optional<ProjectEntity> u = proRepo.findById(projectId);
		ProjectEntity ue = null;
		if(u.isPresent()) {
			ue = u.get();
		} 
		System.out.println(ue.getProjectName());
		model.addAttribute("project",ue);
		return "UpdateProject"; 
	}
	@PostMapping("/updateproject") 
	public String updateProject(ProjectEntity project) {
		proRepo.save(project); 
		return "redirect:/projects"; 
	} 
	
	
	
//-------------------------------------------------- Developer crud ------------------------------------------------------------
	
	@GetMapping("/addDev")
	public String addDev() {
		return "AddDeveloper";
	}


	@PostMapping("/savedeveloper")
	public String savedeveloper(DeveloperEntity developer) {
		devRepo.save(developer);
		return "AddDeveloper";
	}

	
	@GetMapping("/developers")   
	public String GetAlldevelopers(Model model) {
		List<DeveloperEntity> developers = devRepo.findAll();
		model.addAttribute("developer", developers);
		return "ListDeveloper";
	}
	
	@GetMapping("/deleteDeveloper/{devId}")  
	public String DeleteDeveloper(@PathVariable("devId") Integer devId) {
		devRepo.deleteById(devId);
		return "redirect:/developers";
	}

	@GetMapping("/UpdateDeveloper/{devId}")
	public String UpdateDeveloper(@PathVariable("devId")  Integer devId,Model model) {
		Optional<DeveloperEntity> u = devRepo.findById(devId);
		DeveloperEntity ue = null;
		if(u.isPresent()) {
			ue = u.get();
		} 
		System.out.println(ue.getDevName());
		model.addAttribute("developer",ue);
		return "UpdateDeveloper"; 
	}
	@PostMapping("/updatedeveloper") 
	public String updateDeveloper(DeveloperEntity  developer) {
		devRepo.save(developer); 
		return "redirect:/developers"; 
	} 
	
  //---------------------------------------------- Developer Project Join -----------------------------------------
	
	  
	@GetMapping("/addDevPro")
	public String addDevPro(Model model) {	
		List<DeveloperEntity> developers = devRepo.findAll();
		List<ProjectEntity> projects = proRepo.findAll();
		model.addAttribute("developer", developers);
		model.addAttribute("project", projects);
		return "AddDeveloperProject";
	}
	
	@PostMapping("/savedeveloperproject")
	public String saveDeveloperProject(DeveloperProjectEntity developerproject) {
		devproRepo.save(developerproject);
		return "redirect:/developerpros";
	}
	
	@GetMapping("/developerpros")   
	public String GetAlldeveloperpros(Model model) {
		List<DeveloperProjectEntity> developerpros = devproRepo.findAll();
		model.addAttribute("developerpros", developerpros);
		return "ListAllDevPro";
	}
	
	@GetMapping("/deleteDeveloperPro/{devproId}")  
	public String DeleteDeveloperPro(@PathVariable("devproId") Integer devproId) {
		devproRepo.deleteById(devproId);
		return "redirect:/developerpros";
	}
	
	
//	----------------------------------- get projects by developer -------------------------------------
	
	@GetMapping("/devprojects/{devId}")   
	public String GetAlldevProjects(@PathVariable("devId")  Integer devId,Model model) {
		Optional<DeveloperEntity> developerpros = devRepo.findById(devId); 
		model.addAttribute("developer", developerpros.get());
		return "ListMyProject";
	} 
	
	//--------------------------------- get developer by project -------------------------------------
	@GetMapping("/viewDev/{projectId}")   
	public String GetAlldevlopers(@PathVariable("projectId")  Integer projectId,Model model) {
		Optional<ProjectEntity> developerpros = proRepo.findById(projectId); 
		model.addAttribute("project", developerpros.get());
		return "ListMyDevlopers";
	}
	
	
	
}
