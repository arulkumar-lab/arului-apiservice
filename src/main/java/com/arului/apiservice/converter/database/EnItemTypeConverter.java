package com.arului.apiservice.converter.database;

import com.arului.apiservice.EnItemType;
import org.springframework.stereotype.Component;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Optional;

@Component
@Converter (autoApply = true)
public class EnItemTypeConverter implements AttributeConverter< EnItemType, String> {

    @Override
    public String convertToDatabaseColumn(final EnItemType attribute) {
        return Optional.ofNullable(attribute).map(EnItemType::getCode).orElse(null);
    }

    @Override
    public EnItemType convertToEntityAttribute(final String dbData) {
        return EnItemType.decode(dbData);
    }
}
