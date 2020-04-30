package com.company;

import java.util.List;

public class Booking {
    //Booking b= new Booking();

    int bookigId;
    int paxCount;
    String bookingDate;
    String timeSlot;

    public  Booking(int bookigId, int paxCount, String bookingDate, String timeSlot){
        this.bookigId = bookigId;
        this.paxCount = paxCount;
        this.bookingDate = bookingDate;
        this.timeSlot = timeSlot;
    }

    public Booking(){

    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookigId=" + bookigId +
                ", paxCount=" + paxCount +
                ", bookingDate='" + bookingDate + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                '}';
    }

    //display the full Bookings

//    public List<Booking> getAllBookings(Booking booking){
//        return (List<Booking>) booking;
//    }

    //Booking getting by BookingID

    public Booking getBookingById(int bId, List<Booking> allBookings){
        //x is an object type of Booking
        Booking x = new Booking();

        //checking all the bookingIds one by one
        for(int i = 0; i<allBookings.size(); i++){
            //when the looping id equlas to the passed id form object
            if(bId == allBookings.get(i).bookigId){
                x = allBookings.get(i);
            }
        }
        return x;
    }
    public List<Booking> getAllBookings(List<Booking> bo){
        return bo;
    }
}

