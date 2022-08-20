package com.tesco.testproj.models;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    public int Id;
    public String TaskType;
    public String createdBy;
}
