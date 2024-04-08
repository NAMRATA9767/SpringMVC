package com.technodrom.productdetails.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
@NotEmpty(message = "The name must not be blank")
private String name;

@NotEmpty(message = "The brand must not be blank")
private String brand;

@NotEmpty(message = "The name must not be blank")
private String category;

@Min(0)
private double price;

@Size(min = 10,message = "The description should be at least 10 characters")
@Size(max= 2000,message = "The description can't exceed 2000 characters ")
private String description;
 
private MultipartFile imageFile;
}
