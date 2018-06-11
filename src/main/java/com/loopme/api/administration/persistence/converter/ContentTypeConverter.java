package com.loopme.api.administration.persistence.converter;

import com.loopme.api.administration.persistence.model.ContentType;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ContentTypeConverter
        implements AttributeConverter<ContentType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ContentType value) {
        return value.getCode();
    }

    @Override
    public ContentType convertToEntityAttribute(Integer value) {
        return ContentType.fromCode(value);
    }
}
