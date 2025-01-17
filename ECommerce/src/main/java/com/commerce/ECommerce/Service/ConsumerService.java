package com.commerce.ECommerce.Service;

import com.commerce.ECommerce.Model.Entity.Cart;
import com.commerce.ECommerce.Model.Entity.Consumer;
import com.commerce.ECommerce.Model.Entity.Order;
import com.commerce.ECommerce.Repositoy.ConsumerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerService {

    @Autowired
    ConsumerRepo consumerRepo;


    public void register(Consumer consumer) {
        consumerRepo.save(consumer);
    }

    public void updateProfile(Consumer consumer) {
        consumerRepo.save(consumer);
    }

    public void deleteConsumer(Long id) {
        consumerRepo.deleteById(id);
    }

    public Consumer getConsumerDetails(Long id) {
        return consumerRepo.getReferenceById(id);
    }

    public Cart getMyCart(Long id) {
        return consumerRepo.getReferenceById(id).getCart();
    }

    public List<Order> getMyOrders(Long consumerId) {
        return consumerRepo.getReferenceById(consumerId).getOrders();
    }
}
