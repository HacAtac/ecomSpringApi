package hacatac.springframework.spring5webapp.service.impl;

import hacatac.springframework.spring5webapp.entity.Product;
import hacatac.springframework.spring5webapp.payload.ProductDto;
import hacatac.springframework.spring5webapp.payload.ProductResponse;
import hacatac.springframework.spring5webapp.repository.ProductRepository;
import hacatac.springframework.spring5webapp.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    private ModelMapper mapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.mapper = new ModelMapper();
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        // convert DTO to entity
        Product product = mapToEntity(productDto);
        Product newProduct = productRepository.save(product);
        // convert entity to DTO
        ProductDto productResponse = mapToDTO(newProduct);
        return productResponse;
    }


    @Override
    public ProductResponse getAllProducts(int pageNo, int pageSize, String sortBy, String sortDir) {
        return null;
    }

    @Override
    public ProductDto getProductById(Long id) {
        return null;
    }

    @Override
    public ProductDto updateProduct(ProductDto productDto, Long id) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

    private ProductDto mapToDTO(Product product) {
        ProductDto productDto = mapper.map(product, ProductDto.class);
        return productDto;
    }
    private Product mapToEntity(ProductDto productDto) {
        Product product = mapper.map(productDto, Product.class);
        return product;
    }


}
