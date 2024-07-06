package br.com.btgpactual.orders.adapters.outbound.persistence.repository;

import br.com.btgpactual.orders.adapters.outbound.persistence.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface OrdersRepository extends MongoRepository<OrderEntity, UUID> {
}
