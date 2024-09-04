package com.example.demo.schemas;


import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "actiontypes")
public class ActionTypes extends BaseEntity {

    @Id
    @Column(name = "actionId")
    private String actionId;

    @Column(name = "actionName")
    private String actionName;

    @ManyToMany(mappedBy = "actions", fetch = FetchType.LAZY)
    private List<PrivilegesTypes> privilegesTypes;

    public ActionTypes() {
        this.actionId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}