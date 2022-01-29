package com.manish.tinyurl.kgs.data.entity;

import com.manish.tinyurl.kgs.constants.KeyStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "keys_table")
@Getter
@Setter
public class KeyEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name = "key_value")
    private String keyValue;

    private String status;
}


