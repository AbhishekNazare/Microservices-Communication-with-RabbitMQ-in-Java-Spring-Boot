package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "banks")
public class Banks extends BaseEntity {
    @Id
    @Column(name = "bankId")
    private String bankId;

    @Column(name = "bankName")
    private String bankName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userTypeId")
    private UserTypes userTypesId;

    public Banks() {
        this.bankId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}
