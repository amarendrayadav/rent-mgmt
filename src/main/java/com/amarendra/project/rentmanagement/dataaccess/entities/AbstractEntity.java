package com.amarendra.project.rentmanagement.dataaccess.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.UUID;

@Data
public class AbstractEntity {

    @Id
    private UUID id;
    private String name;
    private Date createdOn;
}
