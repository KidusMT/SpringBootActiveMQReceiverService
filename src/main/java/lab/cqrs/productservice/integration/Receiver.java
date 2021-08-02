package lab.cqrs.productservice.integration;

import lab.cqrs.productservice.domain.Product;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "testQueue", containerFactory = "myFactory")
    public void receiveMessage(Product product) {
        System.out.println("Received <" + product + ">");

    }

}
