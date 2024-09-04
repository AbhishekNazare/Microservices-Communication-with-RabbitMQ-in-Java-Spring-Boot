package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "officecreations")
public class OfficeCreations extends BaseEntity {

    @Id
    @Column(name = "office_id")
    private String officeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_type_id")
    private UserTypes userTypesId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "office_type_id")
    private OfficeTypes officeTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_id")
    private Documents documentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Addresses addressesId;

    @Column(name = "office_name")
    private String officeName;

    @Column(name = "office_loc")
    private String officeLoc;

    @Column(name = "office_no")
    private String officeNo;

    @Column(name = "cash_in_transit")
    private Boolean cashInTransit;

    @Column(name = "cash_in_vault")
    private Boolean cashInVault;

    @Column(name = "fidelity")
    private String fidelity;

    @Column(name="reporting_to_office")
    private String reportingToOffice;

    @Column(name = "is_office_space_acquired")
    private Boolean isOfficeSpaceAcquired;

    @Column(name = "is_manager_appointed")
    private Boolean isManagerAppointed;

    @Column(name = "is_select_office_type")
    private Boolean isSelectOfficeType;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public OfficeCreations() {
        this.officeId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
        this.createdAt = LocalDateTime.now(); // Set default value
    }

    @PrePersist
    protected void onCreate() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }
}
