package entities.principal;

import entities.enums.Order_Status;
import entities.principal.OrderItem;
import entities.principal.client;
import entities.principal.product;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class order {
    private Order_Status status;
    private List<OrderItem> produto = new ArrayList<>();
    private client Cliente;
    private Date moment;
    SimpleDateFormat padrao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public order(Order_Status status, client cliente, Date moment) {
        this.status = status;
        this.Cliente = cliente;
        this.moment = moment;
    }

    public Order_Status getStatus() {

        return status;
    }

    public void setStatus(Order_Status status) {

        this.status = status;
    }

    public client getCliente() {

        return Cliente;
    }

    public void setCliente(client cliente) {

        this.Cliente = cliente;
    }

    public Date getMoment() {

        return moment;
    }

    public void setMoment(Date moment) {

        this.moment = moment;
    }

    public List<OrderItem> getProduto() {

        return produto;
    }
    public void addProduto(OrderItem produtos) {
        produto.add(produtos);
    }
    public void removeProduto(OrderItem produtos){
        produto.remove(produtos);

    }
    public Double total(){
        double soma = 0.0;
        for (OrderItem x : produto ){
            soma += x.subTotal();
        }
        return soma;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMARY: " + "\n");
        sb.append("Order moment: ").append(padrao.format(moment)).append("\n");
        sb.append("Order Status: ").append(status).append("\n");
        sb.append("Client: ").append(Cliente).append("\n");
        sb.append("Order itens: " + "\n");
        for ( OrderItem y : produto ) {
            sb.append(y + "\n");
        }
        sb.append("Total price: ").append(total());
        return sb.toString();
    }

}
