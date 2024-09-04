package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class Users extends BaseEntity {

    @Id
    @Column(name = "userId")
    private String userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userTypeId")
    private UserTypes userTypesId;

    @Column(name = "fullName")
    private String fullName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId")
    private Roles roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "managerId")
    private Users managerId;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_products",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "productId")
    )
    private List<Products> products;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "officeId")
    private OfficeCreations officeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "documentId")
    private Documents documentId;

    @OneToMany(mappedBy = "userId")
    private List<UsersAssets> assets;

    @Column(name = "empId", unique = true)
    private String empId;

    @Column(name = "status")
    private String status;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "personalMobileNo")
    private String personalMobileNo;

    @Column(name = "gender")
    private String gender;

    @Column(name = "personalEmailId")
    private String personalEmailId;

    @Column(name = "joiningDate")
    private LocalDate joiningDate;

    @Column(name = "inductionTrainingDate")
    private LocalDate inductionTrainingDate;

    @Column(name = "kycType")
    private String kycType;

    @Column(name = "kycNumber")
    private String kycNumber;

    @Column(name = "officeEmailId")
    private String officeEmailId;

    @Column(name = "isStakeholder")
    private Boolean isStakeholder = false;

    @Column(name = "isDisable")
    private Boolean isDisable = false;

    @Column(name = "isSuperAdmin")
    private Boolean isSuperAdmin = false;

    @Column(name = "isMakerAdmin")
    private Boolean isMakerAdmin = false;

    @Column(name = "isCheckerAdmin")
    private Boolean isCheckerAdmin = false;

    @Column(name = "isMakerCheckerDisabled")
    private Boolean isMakerCheckerDisabled;


    public Users() {
        this.userId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}
