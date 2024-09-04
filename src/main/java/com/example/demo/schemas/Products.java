package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "products")
public class Products extends BaseEntity {

    @Id
    @Column(name = "productId")
    private String productId;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productCode")
    private String productCode;

    @Column(name = "isActive")
    private Boolean isActive = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bankId")
    private Banks banksId;

    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private List<Users> users;

    public Products() {
        this.productId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}