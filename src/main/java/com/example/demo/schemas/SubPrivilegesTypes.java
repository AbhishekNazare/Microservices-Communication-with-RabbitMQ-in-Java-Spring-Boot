package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "subprivilegestypes")
public class SubPrivilegesTypes {

    @Id
    @Column(name = "subPrivilegeTypeId")
    private String subPrivilegeTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "privilegeTypeId")
    private PrivilegesTypes privilegeTypeId;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentId")
    private SubPrivilegesTypes parentId;

    public SubPrivilegesTypes() {
        this.subPrivilegeTypeId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}
