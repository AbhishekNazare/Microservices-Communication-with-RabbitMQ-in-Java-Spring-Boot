package com.example.demo.schemas;
import com.example.demo.schemas.BaseEntity;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "masterassets")
public class MasterAssets extends BaseEntity {

    @Id
    @Column(name = "assetId")
    private String assetId;

    @Column(name = "assetName")
    private String assetName;

    public MasterAssets() {
        this.assetId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}
