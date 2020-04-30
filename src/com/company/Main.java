package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Booking object to handle the Booking class
       Booking bookings = new Booking();

       //Booking Objects array list
        List<Booking> booking = new ArrayList<>();
            booking.add(new Booking(001, 2, "2020/04/30", "08:00"));
            booking.add(new Booking(002, 4, "2020/04/28", "10:00"));
            booking.add(new Booking(003, 6, "2020/04/25", "12:00"));
            booking.add(new Booking(004, 8, "2020/04/22", "14:00"));
            booking.add(new Booking(005, 9, "2020/04/20", "17:00"));


//        List<Booking> v = bookings.getAllBookings(bookings);
//        System.out.println(v);

        //System.out.println(booking);

        Booking result = bookings.getBookingById(002, booking);
        result = bookings.getBookingById(001, booking);
        System.out.println(result);

        //get all bookings
        List<Booking> all;
        all = bookings.getAllBookings(booking);
        System.out.println(all);

    }
}
