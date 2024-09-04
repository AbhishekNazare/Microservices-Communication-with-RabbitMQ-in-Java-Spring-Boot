package com.example.demo.schemas;


import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "addresses")
public class Addresses extends BaseEntity {

    @Id
    @Column(name = "address_id")
    private String addressId;

    @Column(name = "street")
    private String street;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "full_Address1")
    private String fullAddress1;

    @Column(name = "full_Address2")
    private String fullAddress2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pincodeID")
    private MasterPincodes pincode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "districts_id")
    private MasterDistricts districts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "states_id")
    private MasterStates states;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public Addresses() {
        this.addressId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
        this.createdAt = LocalDateTime.now(); // Set default value
    }

    @PrePersist
    protected void onCreate() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }
}
