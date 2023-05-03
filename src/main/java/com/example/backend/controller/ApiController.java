package com.example.backend.controller;

import com.example.backend.model.Product;
import com.example.backend.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "product", description = "the Product API")
public class ApiController {
    final ProductService productService;

    public ApiController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome!\nBest regards,\nMaidacenco Anastasia";
    }

    @Operation(summary = "Get all products")
    @ApiResponse(responseCode = "200", description = "Get all products", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Product.class))))

    @GetMapping(value = "/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int id) {
        return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
    }

}
