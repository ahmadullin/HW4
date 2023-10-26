package org.example;

import java.util.ArrayList;
import java.util.List;

public class TicketProvider {
    public List<Ticket> tickets;

    public TicketProvider() {
        tickets = new ArrayList<>();
    }

    // Метод для покупки билета
    public boolean buyTicket(Ticket ticket) {
        // Проверяем, есть ли уже билеты в списке
        if (tickets != null && tickets.size() > 0) {
            // Добавляем новый билет в список
            tickets.add(ticket);
            // Возвращаем true, если операция выполнена успешно
            return true;
        } else {
            // Возвращаем false, если список пустой
            return false;
        }
    }

    public List<Ticket> updateTickets() {
        return tickets;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}