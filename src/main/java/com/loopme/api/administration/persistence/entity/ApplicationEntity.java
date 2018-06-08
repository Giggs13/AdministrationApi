package com.loopme.api.administration.persistence.entity;

import com.loopme.api.administration.persistence.model.ApplicationType;
import com.loopme.api.administration.persistence.model.ContentType;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@Data
@Entity
@Table(name = "ApplicationDirectory")
@Access(AccessType.FIELD)
public class ApplicationEntity
        implements Serializable {

    @Id
    @Column
    @NotNull
    private Long id;
    @Column
    @NotNull
    @Size(min = 7, max = 50)
    private String name;
    @Column
    @NotNull
    private ApplicationType type;
    private Set<ContentType> contentTypes;
    @Column
    @NotNull
    private User user;
}
