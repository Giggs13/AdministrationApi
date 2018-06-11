package com.loopme.api.administration.persistence.converter;

import com.loopme.api.administration.persistence.model.ApplicationType;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ApplicationTypeConverter
        implements AttributeConverter<ApplicationType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ApplicationType value) {
        return value.getCode();
    }

    @Override
    public ApplicationType convertToEntityAttribute(Integer value) {
        return ApplicationType.fromCode(value);
    }
}
