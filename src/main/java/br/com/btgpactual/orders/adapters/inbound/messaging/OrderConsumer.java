package br.com.btgpactual.orders.adapters.inbound.messaging;

import br.com.btgpactual.orders.domain.model.Order;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @RabbitListener(queues = "orderQueue")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
