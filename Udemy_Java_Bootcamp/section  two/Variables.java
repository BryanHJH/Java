public class Variables {
    public static void main(String[] args) {
        //Type of variable must be the same as the provided value, both must be the same else we get a type mismatch error.
        int people = 20; 
        System.out.println("People: " + people);

        int busTickets = people;
        System.out.println("Bus Tickets: " + busTickets);
    }
}
