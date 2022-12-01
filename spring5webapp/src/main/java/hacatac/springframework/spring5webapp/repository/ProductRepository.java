package hacatac.springframework.spring5webapp.repository;

import hacatac.springframework.spring5webapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
