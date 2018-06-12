package com.loopme.api.administration.persistence.entity;

import com.loopme.api.administration.persistence.converter.ApplicationTypeConverter;
import com.loopme.api.administration.persistence.model.ApplicationType;
import com.loopme.api.administration.persistence.model.ContentType;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "application_directory")
@Access(AccessType.FIELD)
public class ApplicationEntity
        implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotNull
    @Size(min = 7, max = 50)
    private String name;
    @Convert(converter = ApplicationTypeConverter.class)
    @Column
    @NotNull
    private ApplicationType type;
    /*private Set<ContentType> contentTypes;
    @Column
    @NotNull
    private UserEntity user;*/
}
