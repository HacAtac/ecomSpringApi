package hacatac.springframework.spring5webapp.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductDto {
    private Long id;
    private Boolean inStock;
    @NotEmpty(message = "Name is required")
    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    private String name;
    @NotEmpty(message = "Description is required")
    private String description;
    @NotEmpty(message = "Price is required")
    private BigDecimal price;
    @NotEmpty(message = "Quantity is required")
    private Integer quantity;
    private String imageUrl;
}
