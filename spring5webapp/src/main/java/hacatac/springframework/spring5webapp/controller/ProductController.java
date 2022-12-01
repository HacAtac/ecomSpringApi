package hacatac.springframework.spring5webapp.controller;

import hacatac.springframework.spring5webapp.payload.ProductDto;
import hacatac.springframework.spring5webapp.payload.ProductResponse;
import hacatac.springframework.spring5webapp.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) throws Exception {
       /* ProductDto productResponse = productService.createProduct(productDto);
        return ResponseEntity.ok(productResponse); */
                return new ResponseEntity<>(
                        productService.createProduct(productDto),
                        HttpStatus.CREATED);
    }

}
