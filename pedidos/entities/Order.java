package exerciciosCursoUdemy.pedidos.entities;

import exerciciosCursoUdemy.pedidos.enums.OrderStatus;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;

public class Order {
    //atributos básicos
    private final LocalDateTime moment = Instant.now().atZone(ZoneId.systemDefault()).toLocalDateTime(); //pega o horário atual do sistema do usuário
    private OrderStatus status;

    //associações
    private Client client;
    private ArrayList<OrderItem> orderItems = new ArrayList<>();

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<OrderItem> getOrderItem() {
        return orderItems;
    }

    public void addItem(OrderItem orderItem){
        this.orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        this.orderItems.remove(orderItem);
    }

    public Double total(){
        Double sum = 0.0;
        for(OrderItem key : orderItems){
            sum += key.subTotal();
        }
        return sum;
    }
}
