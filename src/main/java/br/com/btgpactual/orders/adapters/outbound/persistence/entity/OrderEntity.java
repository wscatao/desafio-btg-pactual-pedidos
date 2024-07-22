package br.com.btgpactual.orders.adapters.outbound.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document("orders")
@Getter
@Setter
public class OrderEntity {

    @Id
    private UUID orderId;
    private UUID clientId;
    private List<ItensEntity> itens;
}
