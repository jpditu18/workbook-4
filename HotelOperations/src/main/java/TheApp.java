public class TheApp {
    public static void main(String[] args) {

        //test the room class
        Room room1 = new Room(2,140,false,false);
        Room room2 = new Room(1,100,true,true);

        System.out.println("Is room1 available: " + room1.isAvailable());
        System.out.println("is room2 available: " + room2.isAvailable());

        //test the reservation class
        Reservation reservation1 = new Reservation("King",150, 1,false);
        Reservation reservation2 = new Reservation("double",120,2,false);

        System.out.println("The rate per night for reservation 1: " + reservation1.getPrice());
        System.out.println("The rate per night for reservation 2: " + reservation2.getPrice());

        System.out.println("The total for reservation 1 is: " + reservation1.getReservationTotal());
        System.out.println("The total for reservation 2 is: " + reservation2.getReservationTotal());

        System.out.println("Reservation 2 is now scheduled for over the weekend and should be be 10% more");
        reservation2.setWeekend(true);

        System.out.println("The new total for reservation 2 is: " + reservation2.getReservationTotal());

        //test employee class
        Employee employee1 = new Employee(1, "Joshua Vickers", "Valet", 22.0,40.0);

        System.out.println("Employee ID: " + employee1.getEmployeeId());

        System.out.println("Regular Hours: " + employee1.getRegularHours());
        System.out.println("Overtime Hours: " + employee1.getOvertimeHours());
        System.out.println("Total Pay: $" + employee1.getTotalPay());

        //add 2nd employee
        Employee employee2 = new Employee(2,"James Bosley","Janitorial",30.0,40);

        System.out.println("Employee ID: " + employee2.getEmployeeId());

        System.out.println("Regular Hours: " + employee2.getRegularHours());
        System.out.println("Overtime Hours: " + employee2.getOvertimeHours());
        System.out.println("Total Pay: $" + employee2.getTotalPay());
    }
}
