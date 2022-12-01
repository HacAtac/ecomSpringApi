package hacatac.springframework.spring5webapp.service;

import hacatac.springframework.spring5webapp.payload.ProductDto;
import hacatac.springframework.spring5webapp.payload.ProductResponse;
import jakarta.persistence.PrePersist;
import org.springframework.stereotype.Service;

public interface ProductService {

    ProductDto createProduct(ProductDto productDto);

    ProductResponse getAllProducts(int pageNo, int pageSize, String sortBy, String sortDir);

    ProductDto getProductById(Long id);

    ProductDto updateProduct(ProductDto productDto, Long id);

    void deleteProduct(Long id);
}
