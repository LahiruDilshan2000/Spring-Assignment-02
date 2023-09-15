package lk.ijse.gdse.spring.repo;

import lk.ijse.gdse.spring.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Lahiru Dilshan
 * @created Fri 10:24 AM on 9/15/2023
 * @project Spring-Assigment-02
 **/
@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer > {


}
