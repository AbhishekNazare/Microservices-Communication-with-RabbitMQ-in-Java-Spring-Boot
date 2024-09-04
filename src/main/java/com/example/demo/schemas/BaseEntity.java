package com.example.demo.schemas;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

 @CreatedDate
 @Column(name = "created_at", nullable = false, updatable = false)
 private LocalDateTime createdAt;

 @LastModifiedDate
 @Column(name = "updated_at")
 private LocalDateTime updatedAt;

 @CreatedBy
 @Column(name = "created_by")
 private String createdBy;

 @LastModifiedBy
 @Column(name = "updated_by")
 private String updatedBy;

 @LastModifiedDate
 @Column(name = "deleted_at")
 private LocalDateTime deletedAt;


 @Column(name="is_delete")
 private Boolean isDelete = false;
}