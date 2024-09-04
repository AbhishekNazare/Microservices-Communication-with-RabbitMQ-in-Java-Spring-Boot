package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "usertypes")
public class UserTypes extends BaseEntity {

    @Id
    @Column(name = "user_type_id")
    private String userTypeId;

    @Column(name = "user_type_name")
    private String userTypeName;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    // Default constructor
    public UserTypes() {
        this.userTypeId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }

    // Constructor accepting userTypeId
    public UserTypes(String userTypeId) {
        this.userTypeId = userTypeId;
    }
}
