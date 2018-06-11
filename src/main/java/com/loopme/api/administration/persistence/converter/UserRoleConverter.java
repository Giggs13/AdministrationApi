package com.loopme.api.administration.persistence.converter;

import com.loopme.api.administration.persistence.model.UserRole;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class UserRoleConverter
        implements AttributeConverter<UserRole, Integer> {

    @Override
    public Integer convertToDatabaseColumn(UserRole value) {
        return value.getCode();
    }

    @Override
    public UserRole convertToEntityAttribute(Integer value) {
        return UserRole.fromCode(value);
    }
}
