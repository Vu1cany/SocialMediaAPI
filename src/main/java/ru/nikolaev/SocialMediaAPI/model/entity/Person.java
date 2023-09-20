package ru.nikolaev.SocialMediaAPI.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import ru.nikolaev.SocialMediaAPI.component.enums.PersonRole;

import java.time.LocalDateTime;

@Entity
@Table(name = "people", schema = "sm")
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Column(name = "username")
    private String username;

    @Email(message = "Введенная строка не является почтой")
    @Column(name = "email")
    private String email;

    //@Pattern(regexp = "\\w{3,64}")
    @Column(name = "password")
    private String password;

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private PersonRole role;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "disabled_at")
    private LocalDateTime disabledAt;

    @PrePersist
    private void prePersist(){
        //TODO подумать над зонами времени
        createdAt = LocalDateTime.now();
    }
}
