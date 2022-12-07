package com.springboot.ecosystemecommer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "product_category")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductCategory {
    @Id
    @GeneratedValue
    @Column(name= "id")
    private  Long id;
    @Column(name = "category_name")
    private  String categoryName;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "category")
    private Collection<Product> products;
}
