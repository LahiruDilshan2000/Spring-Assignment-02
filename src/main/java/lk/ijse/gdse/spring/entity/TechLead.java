package lk.ijse.gdse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Lahiru Dilshan
 * @created Fri 8:54 AM on 9/15/2023
 * @project Spring-Assigment-02
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class TechLead implements SuperEntity{
    @Id
    private String id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String mail;
}
