package org.ecommerce.project.service;

import org.ecommerce.project.model.Product;
import org.ecommerce.project.payload.ProductDTO;

public interface ProductService {
    ProductDTO addProduct(Long categoryId, Product product);
}
