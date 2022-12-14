package com.example.retos_3_4_5.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// class Sortbyroll implements Comparator<Reservation>
// {
//     // Used for sorting in ascending order of
//     // roll number
//     public int compare(Reservation a, Reservation b)
//     {
//         return a.getIdReservation() - b.getIdReservation();
//     }
// }

public class ReportClient {
    private int total;
    private Client client;

    public ReportClient(Client client) {
        this.client = client;
        List<Reservation> arr = new ArrayList<>(client.getReservations());
        Collections.sort(arr, new Comparator<Reservation>() {
            @Override
            public int compare(Reservation u1, Reservation u2) {
                return u1.getIdReservation().compareTo(u2.getIdReservation());
            }
        });

        Set<Reservation> hSet = new HashSet<Reservation>(arr);
        this.client.setReservations(hSet);
        this.total = client.getReservations().size();
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}