package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "roles")
public class Roles extends BaseEntity {

    @Id
    @Column(name = "roleId")
    private String roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userTypeId")
    private UserTypes userTypesId;

    @Column(name = "roleName")
    private String roleName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reportingToRoleType")
    private Roles reportingToRoleType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "officeTypeId")
    private OfficeTypes officeTypeId;

    @Column(name = "trainingFrequency")
    private String trainingFrequency;

    @Column(name = "incentive")
    private Boolean incentive;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    public Roles() {
        this.roleId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}
