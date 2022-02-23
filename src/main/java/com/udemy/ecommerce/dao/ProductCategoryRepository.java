package com.udemy.ecommerce.dao;

import com.udemy.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory" /*Name of JSON entry*/, path = "product-category" /* reference to path /product-category*/)
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}