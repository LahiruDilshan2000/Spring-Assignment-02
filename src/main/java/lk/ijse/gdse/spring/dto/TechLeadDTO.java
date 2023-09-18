package lk.ijse.gdse.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author Lahiru Dilshan
 * @created Fri 10:19 AM on 9/15/2023
 * @project Spring-Assigment-02
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TechLeadDTO {
    private String id;
    private String name;
    private String address;
    private String mail;
}
