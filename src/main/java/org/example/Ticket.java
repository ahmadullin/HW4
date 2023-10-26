package org.example;

import java.util.Date;

public class Ticket {
    public int place;
    public int rootNumber;
    public Date date;
    public boolean isValid;

    public Ticket(int place, int rootNumber, Date date, boolean isValid) {
        this.place = place;
        this.rootNumber = rootNumber;
        this.date = date;
        this.isValid = isValid;
    }

    public boolean isValid() {
        return isValid;
    }
}
