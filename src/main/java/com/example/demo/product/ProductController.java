package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ProductController {
    // 사용자 요청을 던지면 그걸 받아서
    // 요청에 맞는 메소드를 실행시킨다.
    // 그 안에서, 그에 맞는 로직을 수행할 수 있도록 서비스한테 시킬 것이다.

    @Autowired
    private ProductService productService;

    // 상품 조회
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String findProduct() {
        return productService.findProduct();
    }

    // 상품 등록
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void saveProduct() {
        productService.saveProduct();
    }
}
