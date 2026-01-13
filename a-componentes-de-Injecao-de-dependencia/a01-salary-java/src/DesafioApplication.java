package com.andredeomondes.desafio.application;

import main.java.com.andredeomondes.desafio.entitites.Order;
import main.java.com.andredeomondes.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.andredeomondes"})
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("|             CÁLCULADORA DE PEDIDOS           |");
        System.out.println("------------------------------------------------");
        System.out.println("Informe os dados do pedido: ");

        System.out.print("Código: ");
        int cod = sc.nextInt();
        sc.nextLine();

        System.out.print("Valór básico: ");
        double basic = sc.nextDouble();

        System.out.print("Desconto (porcentagem): ");
        double discount = sc.nextDouble();

        System.out.println("------------------------------------------------");
        Order order = new Order(cod, basic, discount);
        System.out.println("|             0rdem de pedido criada           |");
        System.out.println("------------------------------------------------");
        System.out.println("Código do pedido: " + cod);
        System.out.printf("Valor total: %.2f\n", orderService.total(order));
        System.out.println("------------------------------------------------");


        sc.close();

    }
}
