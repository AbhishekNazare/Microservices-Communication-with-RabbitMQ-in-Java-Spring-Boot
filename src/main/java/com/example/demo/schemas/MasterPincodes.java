package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "masterpincodes")
public class MasterPincodes extends BaseEntity {

    @Id
    @Column(name = "pincode")
    private String pincodeId;


    @Column(name= "pincode_number")
    private String pincodeNumber;

    // Default constructor
    public MasterPincodes() {
        this.pincodeId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }

    // Constructor accepting pincodeId
    public MasterPincodes(String pincodeId) {
        this.pincodeId = pincodeId;
    }
}
