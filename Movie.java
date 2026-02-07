class Movie
{
    public static void main(String args[])
    {
        String name="Hwarang";
        int seat_no=7;
        int price=77;
        boolean isBooked=true;
        if(isBooked){
            System.out.println("Ticket is Booked");
        }
        else{
            System.out.println("Ticket is Not Booked");
        }
        System.out.println(name);
        System.out.println(seat_no);
        System.out.println(price);
        System.out.println(isBooked);
    }
}