package lk.ijse.gdse.spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @author Lahiru Dilshan
 * @created Fri 10:20 AM on 9/15/2023
 * @project Spring-Assigment-02
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ProjectDTO {
    private int projectId;
    private String projectName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private TechLeadDTO techLead;
}
