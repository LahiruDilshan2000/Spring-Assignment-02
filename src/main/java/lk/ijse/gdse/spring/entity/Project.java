package lk.ijse.gdse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

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
public class Project implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectId;
    @Column(nullable = false)
    private String projectName;
    @Column(nullable = false)
    private LocalDate date;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "techLeadId", referencedColumnName = "id", nullable = false)
    private TechLead techLead;
}
