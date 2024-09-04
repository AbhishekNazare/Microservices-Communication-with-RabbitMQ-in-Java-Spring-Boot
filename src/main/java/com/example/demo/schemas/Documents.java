package com.example.demo.schemas;
import com.example.demo.utils.CustomIdGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "documents")
public class Documents extends BaseEntity {

    @Id
    @Column(name = "document_id")
    private String documentId;

    @Column(name = "recent_photo")
    private String recentPhoto;

    @Column(name = "office_images")
    private String officeImages;

    @Column(name = "se_certificate")
    private String seCertificate;

    @Column(name = "se_renewal_date")
    private LocalDate seRenewalDate;

    @Column(name = "kyc_image")
    private String kycImage;

    // Default constructor
    public Documents() {
        this.documentId = CustomIdGenerator.generateId(this.getClass().getSimpleName());
    }

    // Constructor accepting documentId
    public Documents(String documentId) {
        this.documentId = documentId;
    }
}
