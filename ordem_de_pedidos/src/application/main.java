package application;

import entities.enums.Order_Status;
import entities.principal.OrderItem;
import entities.principal.client;
import entities.principal.order;
import entities.principal.product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat padrao = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date dataNascimento = padrao.parse(sc.next());
        client Cliente = new client(name,email,dataNascimento);

        Date dataPedido = new Date();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        sc.nextLine();
        String status = sc.nextLine();
        Order_Status Status = Order_Status.valueOf(status);
        System.out.print("How many itens to this order? ");
        order pedidoTotal = new order(Status,Cliente,dataPedido);
        int numeroDePedidos = sc.nextInt();
        for (int i = 1; i<= numeroDePedidos; i++){
        System.out.println("Enter #" + i + " item data:");
        System.out.print("Product name: ");
        sc.nextLine();
        String item = sc.nextLine();
        System.out.print("Product price: ");
        double preco = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantidade = sc.nextInt();
         product produto = new product(item,preco);
         OrderItem pedido = new OrderItem(quantidade,preco,produto);
         pedidoTotal.addProduto(pedido);
        }
        System.out.println(pedidoTotal);


        sc.close();
    }
}
