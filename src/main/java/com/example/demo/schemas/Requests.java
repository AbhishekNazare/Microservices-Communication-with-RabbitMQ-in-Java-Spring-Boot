package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "resquests")
public class Requests extends BaseEntity{

    @Id
    @Column(name = "requestId")
    private String requestId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "checkerId")
    private Users checkerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "makerId")
    private Users makerId;

    @Column(columnDefinition = "jsonb",name = "update")
    private String update;

    @Column(name = "status")
    private String status;

    public Requests() {
        this.requestId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}
