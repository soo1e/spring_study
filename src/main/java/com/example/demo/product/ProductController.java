package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    // 사용자 요청을 던지면 그걸 받아서
    // 요청에 맞는 메소드를 실행시킨다.
    // 그 안에서, 그에 맞는 로직을 수행할 수 있도록 서비스한테 시킬 것이다.

    @Autowired
    private ProductService productService;

    // 상품 조회
    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable("id") int id) {
        return productService.findProduct(id);
    }

    // 상품 등록
    @PostMapping("/products")
    public void saveProduct(@RequestBody Product product) {
        // @RequestParam : localhost:8080/products?name=____ -> productName
        productService.saveProduct(product);
    }


}
