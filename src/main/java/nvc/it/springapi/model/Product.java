package nvc.it.springapi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Json
@Document("products")
@Getter @Setter @NoArgsConstructor
public class Product {
    @Id
    private String _id;
    private String name;
    private Double price;
    private Integer unit_in_stock;

    // เก็บตัวรีวิว Review
    private List<Review> reviews = new ArrayList<Review>();
    
    // คงที่
    @CreatedDate
    private Date createdAt;
    // เมื่อมีการอัพเดตจะตรงนี้ที่อัพเดตตรงเดียว
    @LastModifiedDate
    private Date updatedAt;
}
