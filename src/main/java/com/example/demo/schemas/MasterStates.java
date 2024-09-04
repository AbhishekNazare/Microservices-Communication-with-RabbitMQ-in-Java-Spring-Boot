package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "masterstates")
public class MasterStates extends BaseEntity {

    @Id
    @Column(name = "stateId")
    private String stateId;

    @Column(name = "stateName")
    private String stateName;

    @Column(name = "stateCode")
    private String stateCode;

    public MasterStates() {

        this.stateId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }


    public MasterStates(String stateId) {
        this.stateId = stateId;
    }
}
