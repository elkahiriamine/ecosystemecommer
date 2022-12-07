package com.springboot.ecosystemecommer;

import com.springboot.ecosystemecommer.dao.ProductCategoryRepository;
import com.springboot.ecosystemecommer.dao.ProductRepository;
import com.springboot.ecosystemecommer.entities.Product;
import com.springboot.ecosystemecommer.entities.ProductCategory;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class EcosystemecommerApplication{
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(EcosystemecommerApplication.class, args);
    }


}
