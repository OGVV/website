package com.project.dropping.repo;

import com.project.dropping.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductServiceInterface extends CrudRepository<Product,Long> {
}
