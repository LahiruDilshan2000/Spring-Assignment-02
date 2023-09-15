package lk.ijse.gdse.spring.service;

import lk.ijse.gdse.spring.dto.TechLeadDTO;

import java.util.List;

/**
 * @author Lahiru Dilshan
 * @created Fri 10:02 AM on 9/15/2023
 * @project Spring-Assigment-02
 **/
public interface TechLeadService {

    TechLeadDTO saveTechLead(TechLeadDTO techLeadDTO);

    TechLeadDTO updateTechLead(TechLeadDTO techLeadDTO);

    void deleteTechLeadByPk(String pk);

    List<TechLeadDTO> getAllTechLead();

    TechLeadDTO searchTechLeadByPk(String id);
}
