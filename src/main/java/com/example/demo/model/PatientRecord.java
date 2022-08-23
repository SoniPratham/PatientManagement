package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombk.ToString;

import javax.persistence.Entity;o
import javax.persistence.Id;


@Entity
@Getter
@ToString
@Builder
public class PatientRecord {
    @Id
    public Long patientId;
    Integer age;
    public String name, address;

    public PatientRecord() {
    }

    public PatientRecord(Long patientId, String name,Integer age, String address) {
        this.patientId = patientId;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
