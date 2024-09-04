package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "usersassets")
public class UsersAssets extends BaseEntity {

    @Id
    @Column(name = "userAssetsId")
    private String userAssetsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private Users userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assetId")
    private MasterAssets assetId;

    @Column(name = "serialNo")
    private String serialNo;

    public UsersAssets() {
        this.userAssetsId= CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}