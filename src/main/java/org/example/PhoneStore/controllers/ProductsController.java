package org.example.PhoneStore.controllers;

import org.example.PhoneStore.dataBase.services.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductsController {

    final ProductServiceImpl productService;

    public ProductsController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("products", productService.findAllProducts());
        return "products/products";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "products/product";
    }
}
