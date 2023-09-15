package lk.ijse.gdse.spring.service;

import lk.ijse.gdse.spring.dto.ProjectDTO;

import java.util.List;

/**
 * @author Lahiru Dilshan
 * @created Fri 10:05 AM on 9/15/2023
 * @project Spring-Assigment-02
 **/
public interface ProjectService {

    ProjectDTO saveProject(ProjectDTO projectDTO);

    ProjectDTO updateProject(ProjectDTO projectDTO);

    void deleteProjectByPk(int pk);

    List<ProjectDTO> getAllProjects();

    ProjectDTO searchProjectByPk(int pk);
}
