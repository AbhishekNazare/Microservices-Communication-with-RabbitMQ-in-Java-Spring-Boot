package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rolesprivileges")
public class RolesPrivileges extends BaseEntity {

    @Id
    @Column(name = "rolePrivilegeId")
    private String rolePrivilegeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "privilegeTypeId")
    private PrivilegesTypes privilegeTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subPrivilegeTypeId")
    private SubPrivilegesTypes subPrivilegeTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId")
    private Roles roleId;

    public RolesPrivileges() {
        this.rolePrivilegeId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}
