package lk.ijse.gdse.spring.service.impl;

import lk.ijse.gdse.spring.dto.TechLeadDTO;
import lk.ijse.gdse.spring.entity.TechLead;
import lk.ijse.gdse.spring.exception.NotFoundException;
import lk.ijse.gdse.spring.repo.TechLeadRepo;
import lk.ijse.gdse.spring.service.TechLeadService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @author Lahiru Dilshan
 * @created Fri 10:03 AM on 9/15/2023
 * @project Spring-Assigment-02
 **/
@Service
@Transactional
public class TechLeadServiceImpl implements TechLeadService {

    @Autowired
    private TechLeadRepo techLeadRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TechLeadDTO saveTechLead(TechLeadDTO techLeadDTO) {

        techLeadDTO.setId(UUID.randomUUID().toString());
        if (techLeadRepo.existsById(techLeadDTO.getId()))
            throw new RuntimeException(techLeadDTO.getId() + " Tech lead id already exist !");

        return modelMapper.map(techLeadRepo.save(modelMapper.map(techLeadDTO, TechLead.class)), TechLeadDTO.class);
    }

    @Override
    public TechLeadDTO updateTechLead(TechLeadDTO techLeadDTO) {

        if (!techLeadRepo.existsById(techLeadDTO.getId()))
            throw new NotFoundException(techLeadDTO.getId() + " Tech lead id doesn't exist !");

        return modelMapper.map(techLeadRepo.save(modelMapper.map(techLeadDTO, TechLead.class)), TechLeadDTO.class);
    }

    @Override
    public void deleteTechLeadByPk(String pk) {

        if (!techLeadRepo.existsById(pk))
            throw new NotFoundException(pk + " Tech lead id doesn't exist !");

        techLeadRepo.deleteById(pk);
    }

    @Override
    public List<TechLeadDTO> getAllTechLead() {

        return modelMapper.map(techLeadRepo.findAll(), new TypeToken<List<TechLeadDTO>>(){}.getType());
    }

    @Override
    public TechLeadDTO searchTechLeadByPk(String pk) {

        if (!techLeadRepo.existsById(pk))
            throw new NotFoundException(pk + " Tech lead id doesn't exist !");

        return modelMapper.map(techLeadRepo.findById(pk).get(), TechLeadDTO.class);
    }
}
