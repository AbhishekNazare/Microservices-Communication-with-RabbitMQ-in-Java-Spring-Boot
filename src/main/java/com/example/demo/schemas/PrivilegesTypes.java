package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "privilegestypes")
public class PrivilegesTypes extends BaseEntity {

    @Id
    @Column(name = "privilegeTypeId")
    private String privilegeTypeId;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "privileges_actions",
            joinColumns = @JoinColumn(name = "privilegeTypeId"),
            inverseJoinColumns = @JoinColumn(name = "actionId")
    )
    private List<ActionTypes> actions;


    public PrivilegesTypes() {
        this.privilegeTypeId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}
