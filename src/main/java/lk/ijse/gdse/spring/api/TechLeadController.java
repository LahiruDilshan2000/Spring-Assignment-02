package lk.ijse.gdse.spring.api;

import lk.ijse.gdse.spring.dto.TechLeadDTO;
import lk.ijse.gdse.spring.service.TechLeadService;
import lk.ijse.gdse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lahiru Dilshan
 * @created Fri 9:59 AM on 9/15/2023
 * @project Spring-Assigment-02
 **/
@RestController
@RequestMapping("api/v1/techlead")
@CrossOrigin
public class TechLeadController {

    @Autowired
    private TechLeadService techLeadService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseUtil getAllTechLead(){

        return new ResponseUtil(200, "Get", techLeadService.getAllTechLead());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseUtil saveTechLead(@RequestBody TechLeadDTO techLeadDTO){

        return new ResponseUtil(200, "save", techLeadService.saveTechLead(techLeadDTO));
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseUtil updateTechLead(@RequestBody TechLeadDTO techLeadDTO){

        return new ResponseUtil(200, "update", techLeadService.updateTechLead(techLeadDTO));
    }

    @DeleteMapping(params = {"id"}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseUtil deleteTechLead(@RequestParam String id){

        techLeadService.deleteTechLeadByPk(id);
        return new ResponseUtil(200, "delete", null);
    }

    @GetMapping(path = {"/{id}"}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseUtil searchTechLeadById(@PathVariable String id){

        return new ResponseUtil(200, "search", techLeadService.searchTechLeadByPk(id));
    }
}
