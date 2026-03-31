package exerciciosCursoUdemy.pedidos.src;

import exerciciosCursoUdemy.pedidos.entities.Client;
import exerciciosCursoUdemy.pedidos.entities.Order;
import exerciciosCursoUdemy.pedidos.entities.OrderItem;
import exerciciosCursoUdemy.pedidos.entities.Product;
import exerciciosCursoUdemy.pedidos.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Locale.setDefault(Locale.US);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("BirthDate (DD/MM/YYYY): ");
        String dateString = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(dateString, format);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine()); //pega a entrada do usuário e passa direto para o tipo enumerado
        System.out.print("How many items for this order? ");
        int items = sc.nextInt();

        Order order = new Order(orderStatus, client);
        Product product;
        OrderItem orderItem;
        sc.nextLine();
        for (int i = 0; i < items; i++) {
            System.out.println("Enter item #"+(i+1)+" item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer productQuantity = sc.nextInt();

            sc.nextLine();

            product = new Product(productName, productPrice);
            orderItem = new OrderItem(productQuantity, product);

            order.addItem(orderItem);
        }
        System.out.println();

        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + order.getMoment().format(formatTime));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + client.getName() + "(" + client.getBirthDate().format(format) + ") - " + client.getEmail());
        System.out.println("Order items:");
        for (OrderItem key : order.getOrderItem()){
            System.out.println(key.getProduct().getName() + ", $" + String.format("%.2f", key.getProduct().getPrice()) + ", Quantity: " + key.getQuantity() + ", Subtotal: $" + String.format("%.2f", key.subTotal()));
        }
        System.out.println("Total price: $" + String.format("%.2f", order.total()));

        sc.close();
    }
}
