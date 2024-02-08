package com.careerboot.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "user email is required")
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "wrong email format")
    @Column(name = "email", nullable = false)
    private String email;

    @NotBlank(message = "user password is required")
    @Size(min = 8, message = "password must be at least 8 characters long")
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

    @Basic
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Basic
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @NotBlank(message = "user password is required")
    @Size(min = 8, message = "password must be at least 8 characters long")
    @Transient
    private String confirmPassword;

    @ToString.Include(name = "password")
    private String maskPassword() {
        return "*********";
    }
}
