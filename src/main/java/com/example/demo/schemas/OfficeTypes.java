package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "officetypes")
public class OfficeTypes extends BaseEntity {

    @Id
    @Column(name = "office_type_id")
    private String officeTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_type_id")
    private UserTypes userTypesId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "office_head_id")
    private OfficeTypes officeHeadId;

    @Column(name = "office_name")
    private String officeName;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    // Default constructor
    public OfficeTypes() {
        this.officeTypeId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }

    // Constructor accepting officeTypeId
    public OfficeTypes(String officeTypeId) {
        this.officeTypeId = officeTypeId;
    }
}
