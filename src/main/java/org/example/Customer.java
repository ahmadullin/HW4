package org.example;


import java.util.List;

public class Customer {
    public int id;
    public List<Ticket> tickets;
    public CashProvider cashProvider;

    public Customer(int id, List<Ticket> tickets, CashProvider cashProvider) {
        this.id = id;
        this.tickets = tickets;
        this.cashProvider = cashProvider;
    }

    public int getId() {
        return id;
    }

    // Метод для покупки билета
    public boolean buyTicket(Ticket ticket) {
// Вызываем метод buyTicket у объекта TicketProvider и передаем в него объект билета
        boolean result = cashProvider.buyTicket(ticket);
// Возвращаем результат операции покупки билета
        return result;
    }

    public boolean isValid() {
        return cashProvider.isValid();
    }
}