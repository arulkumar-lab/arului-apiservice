package com.arului.apiservice.modal;

import com.arului.apiservice.EnItemType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Data
@Entity
@RestResource
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemDetail {
    @Id
    @GeneratedValue
    Long id;
    private String code;
    private EnItemType type_code;
    private String description;
}
