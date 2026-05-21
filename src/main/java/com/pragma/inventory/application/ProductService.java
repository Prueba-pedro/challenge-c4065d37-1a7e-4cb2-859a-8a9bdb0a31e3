package com.pragma.inventory.application;

import com.pragma.inventory.domain.model.Product;
import com.pragma.inventory.infrastructure.adapter.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product registerProduct(Product product) {
        // Implementar lógica para registrar producto
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void processOrder(String productId, int quantity) {
        // Implementar lógica para procesar pedido y actualizar inventario
    }
}