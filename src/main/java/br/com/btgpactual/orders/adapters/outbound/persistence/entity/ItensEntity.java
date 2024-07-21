package br.com.btgpactual.orders.adapters.outbound.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ItensEntity {

    private String product;
    private int quantity;
    private BigDecimal price;

    public ItensEntity(String product, int quantity, BigDecimal price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public ItensEntity() {
    }
}
