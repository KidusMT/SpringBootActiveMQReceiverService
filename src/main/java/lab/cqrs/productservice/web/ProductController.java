package lab.cqrs.productservice.web;

import lab.cqrs.productservice.domain.Product;
import lab.cqrs.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PutMapping("{productNumber}")
    public void updateProduct(@PathVariable String productNumber, @RequestBody Product product){
        productService.update(product);
    }

    @GetMapping("{productNumber}")
    public Product getProduct(@PathVariable Long productNumber){
        return productService.getProduct(productNumber);
    }

    @GetMapping
    public Collection<Product> getAllProducts(){
        return productService.findAll();
    }
}
