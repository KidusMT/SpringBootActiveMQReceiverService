package lab.cqrs.productservice.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Product {
    private Long productNumber;
    private String name;
    private Double price;
}
