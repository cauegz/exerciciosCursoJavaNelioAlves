package exerciciosCursoUdemy.enumeracao;

import exerciciosCursoUdemy.enumeracao.entities.Order;
import exerciciosCursoUdemy.enumeracao.entities.enums.OrderStatus;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;

public class Program {
    static void main(String[] args) {
        Order order = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
