package com.loopme.api.administration.persistence.entity;

import com.loopme.api.administration.persistence.converter.UserRoleConverter;
import com.loopme.api.administration.persistence.model.UserRole;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "user_directory")
@Access(AccessType.FIELD)
public class UserEntity
        implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @NotNull
    private Long id;
    @Column
    @NotNull
    @Size(min = 2, max = 100)
    private String name;
    @Column
    @NotNull
    @Size(min = 7, max = 50)
    private String email;
    @Column
    @NotNull
    @Size(min = 6, max = 50)
    private String password;
    @Convert(converter = UserRoleConverter.class)
    @Column
    @NotNull
    private UserRole role;
    //private Set<ApplicationEntity> apps;
}
