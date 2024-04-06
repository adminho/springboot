package com.example.reactiveweb.model;

import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 
import org.springframework.data.annotation.Id; 
  
// Annotation to indicate that this class is a model class 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User { 
    // Annotation to mark the field as the primary identifier 
    @Id
    private String id; // User ID field 
    private String name; // User name field 
    private int age; // User age field 
} 