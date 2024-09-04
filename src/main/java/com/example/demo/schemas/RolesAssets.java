package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rolesassets")
public class RolesAssets extends BaseEntity{

    @Id
    @Column(name = "roleAssetId")
    private String roleAssetId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId")
    private Roles roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assetId")
    private MasterAssets assetId;

    public RolesAssets() {
        this.roleAssetId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }

}
