package com.careerboot.model;

import com.careerboot.validation.ValidPassword;
import lombok.*;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
@DynamicInsert
@DynamicUpdate
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "user email is required")
    @Email(message = "wrong email format")
    @Column(name = "email", nullable = false)
    private String email;

    @ValidPassword
    @Column(name = "password", nullable = false)
    private String password;

    @NotBlank(message = "user first name is required")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank(message = "user last name is required")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Enumerated(value = EnumType.STRING)
    private Role role = Role.USER;

    @Type(type = "org.hibernate.type.BooleanType")
    private boolean enabled = true;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Transient
    private String confirmPassword;

    @ToString.Include(name = "password")
    private String maskPassword() {
        return "*********";
    }
}
