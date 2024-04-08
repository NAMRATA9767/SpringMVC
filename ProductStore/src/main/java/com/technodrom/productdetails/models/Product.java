package com.technodrom.productdetails.models;


import java.util.Date;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="products")
public class Product {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String name;
private String brand;
private String category;
private double price;

@Column(columnDefinition = "TEXT")
private String description;
private Date createdAt;
private String imageFileName;





}
