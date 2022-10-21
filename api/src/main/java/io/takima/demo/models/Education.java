package io.takima.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Education implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ide;
    @Column
    private String ecole;
    @Column
    private String diplome;
    @Column
    private String  locationE;
    @Column
    private String startDateE;
    @Column
    private String endDateE;
    @Column
    private String descriptionE;


}
