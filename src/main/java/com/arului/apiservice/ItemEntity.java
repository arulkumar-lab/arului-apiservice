package com.arului.apiservice;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name="items")
@Getter
@Setter
public class ItemEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    @Column(name="type_code")
    private EnItemType type;

    private String description;

}
