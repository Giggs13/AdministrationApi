package com.loopme.api.administration.persistence.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

@Data
@Entity
@Table(name = "AdminParameterDirectory")
@Access(AccessType.FIELD)
public class AdminParameterEntity
        implements Serializable {

    @Id
    @Column
    @NotNull
    @Size(min = 3, max = 20)
    private String parameterId;
    @Column
    @NotNull
    @Size(min = 5, max = 255)
    private String parameterName;
    @Column
    @NotBlank
    @Size(max = 765)
    private String parameterValue;
}
