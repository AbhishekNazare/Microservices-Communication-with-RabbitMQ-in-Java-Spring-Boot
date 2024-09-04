package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "masterdistricts")
public class MasterDistricts extends BaseEntity {

    @Id
    @Column(name = "districtId")
    private String districtId;

    @Column(name = "districtName")
    private String districtName;

    @Column(name = "districtCode")
    private String districtCode;


    public MasterDistricts() {
        this.districtId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }

    public MasterDistricts(String districtId) {
        this.districtId = districtId;
    }
}