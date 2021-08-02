package lab.cqrs.productservice.service;

import lab.cqrs.productservice.data.ProductRepository;
import lab.cqrs.productservice.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void update(Product book) {
        productRepository.save(book);
    }

    public Product getProduct(Long isbn) {
        return productRepository.findById(isbn).orElseGet(() -> null);
    }

    public Collection<Product> findAll() {
        return productRepository.findAll();
    }
}
