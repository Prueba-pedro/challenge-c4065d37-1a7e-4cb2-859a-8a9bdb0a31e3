package com.pragma.inventory.application;

import com.pragma.inventory.domain.model.Product;
import com.pragma.inventory.infrastructure.adapter.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @Test
    void testRegisterProduct() {
        Product product = new Product("Laptop", 1000.0, 10, "Electronics");
        Mockito.when(productRepository.save(product)).thenReturn(product);
        Product registeredProduct = productService.registerProduct(product);
        assertEquals(product, registeredProduct);
    }

    @Test
    void testGetAllProducts() {
        Mockito.when(productRepository.findAll()).thenReturn(Collections.emptyList());
        List<Product> products = productService.getAllProducts();
        assertEquals(Collections.emptyList(), products);
    }
}