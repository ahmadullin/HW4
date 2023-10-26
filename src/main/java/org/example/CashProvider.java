package org.example;

public class CashProvider {
    public long card;
    public boolean authorization;

    public CashProvider(long card) {
        this.card = card;
    }

    // Метод для авторизации платежа
    public boolean authorization(Customer customer) {
// Проверяем, совпадает ли номер карты с id пользователя
        if (card == customer.getId()) {
// Если совпадает, то устанавливаем значение authorization в true
            authorization = true;
        } else {
// Если не совпадает, то устанавливаем значение authorization в false
            authorization = false;
        }
// Возвращаем значение authorization
        return authorization;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public boolean isValid() {
        return authorization;
    }

    // Метод для покупки билета
    public boolean buyTicket(Ticket ticket) {
// Вызываем метод buyTicket у объекта TicketProvider и передаем в него объект билета
        boolean result = ticketProvider.buyTicket(ticket);
// Возвращаем результат операции покупки билета
        return result;
    }

    public static TicketProvider ticketProvider;
}

