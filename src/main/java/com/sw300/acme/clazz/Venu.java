package com.sw300.acme.clazz;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;

@Entity
public class Venu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;
    private int capacity;
    private String map;

    @JsonIgnore
    @OneToMany(mappedBy = "venu", cascade = CascadeType.ALL)
    private List<ClazzDay> clazzDayList;

    public Venu(){}

    public Venu(String name, String address, int capacity, String map) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.map = map;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public List<ClazzDay> getClazzDayList() {
        return clazzDayList;
    }

    public void setClazzDayList(List<ClazzDay> clazzDayList) {
        this.clazzDayList = clazzDayList;
    }
}
