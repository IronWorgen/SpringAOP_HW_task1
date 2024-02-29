package HW.data.task.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Converter
public class LocalDateTimeSqlConverter implements AttributeConverter<LocalDateTime, Timestamp> {
    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime attribute) {
        if (attribute == null) {
            return null;
        }
        return Timestamp.valueOf(attribute);
    }


    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp dbData) {
        if (dbData == null) {
            return null;
        }
        return dbData.toLocalDateTime();
    }
}
