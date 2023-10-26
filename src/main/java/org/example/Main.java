package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Main {
    public static void main(String[] args) {
// Создание объекта типа Ticket
        Ticket ticket = new Ticket(10, 5, new Date(), true);

// Создание объекта типа TicketProvider
        TicketProvider provider = new TicketProvider();

// Создание объекта типа CashProvider
        CashProvider cashProvider = new CashProvider(100);

// Выполнение операции покупки билета
        boolean result = provider.buyTicket(ticket);

// Выполнение операции поиска билета
        List<Ticket> tickets = provider.getTickets();

// Выполнение операции авторизации платежа
        boolean authorizationResult = cashProvider.authorization(new Customer(1, new ArrayList<>(), cashProvider));

        System.out.println("Результат покупки билета: " + result);
        System.out.println("Результат поиска билета: " + tickets.size());
        System.out.println("Результат авторизации платежа: " + authorizationResult);
    }
}