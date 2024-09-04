package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "requestcomments")
public class RequestComments extends BaseEntity {

    @Id
    @Column(name = "requestCommentId")
    private String requestCommentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requestId")
    private Requests requestId;

    @Column(name = "comments")
    private String comments;

    public RequestComments() {
        this.requestCommentId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }
}
