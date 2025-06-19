package fr.dawan.quiz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseAuditing extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDateTime created;

    @LastModifiedDate
    @Column(name = "last_modified", updatable = false, nullable = false)
    private LocalDateTime lastModified;

    @CreatedBy
    @Column(length = 130, updatable = false)
    private String createdBy;

    @LastModifiedBy
    @Column(name = "last_modified_by", length = 130)
    private String lastModifiedBy;


}
