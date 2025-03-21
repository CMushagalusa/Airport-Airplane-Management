import java.util.Scanner;

public class AirPortTest {
        public static void main(String[] args) {

                AirPlane plane = new AirPlane();

                AirPlane plane0 = new AirPlane("Ethiopian", "Goma", "Accra");

                Passengers passenger = new Passengers();

                Passengers passenger0 = new Passengers("Clovis", "Goma", "Accra", "first class");

                plane0.setPlaneCapacity(120);

                plane0.setPlaneProgram(14, 19);
                /*
                 * System.out.println(
                 * "The plane " + plane0.getPlaneName() + " has the capacity of "
                 * + plane0.getPlaneCapacity()
                 * + " places.");
                 * 
                 * System.out.println(plane0.getCapacity());
                 * 
                 * plane0.setPlaneCapacity(120);
                 * 
                 * System.out.println(plane0.getCapacity());
                 * 
                 * plane.setPlaneFirstClassCapacity(14);
                 * 
                 * System.out.println(
                 * "The plane " + plane0.getPlaneName() + " has the capacity of "
                 * + plane0.getPlaneCapacity()
                 * + " places.");
                 * 
                 * System.out.println("The plane " + plane0.getPlaneName() +
                 * " has a first class with a capacity of "
                 * + plane0.getPlaneFirstClassCapacity() + " places and an economic class with "
                 * + plane0.getPlaneEconomicClassCapacity() + " places.");
                 */

                System.out.println(plane0.getPlaneProgram());

                Scanner keyboard = new Scanner(System.in);

                String plName, plOrigin, plDestination;
                String paName, paOrigin, paDestination, seatClass;

                System.out.print("The plane name: ");
                plName = keyboard.next();
                plane.setPlaneName(plName);

                System.out.print("The plane origin: ");
                plOrigin = keyboard.next();
                plane.setPlaneOrigin(plOrigin);

                System.out.print("The plane destination: ");
                plDestination = keyboard.next();
                plane.setPlaneDestination(plDestination);

                System.out.print("The passenger name: ");
                paName = keyboard.next();
                passenger.setName(paName);

                System.out.print("The passenger origin: ");
                paOrigin = keyboard.next();
                passenger.setOrigin(paOrigin);

                System.out.print("The passenger destination: ");
                paDestination = keyboard.next();
                passenger.setDestination(paDestination);

                System.out.print("The passenger seat class: ");
                seatClass = keyboard.next();
                passenger.setSeatClass(seatClass);

                System.out.println(passenger.toString());

                plane.setPlaneCapacity(20);
                System.out.println(plane.toString());
                plane.addPassengers(plane, passenger);
                plane.listPassengers();

                plane0.addPassengers(plane0, passenger0);
                plane0.addPassengers(plane0, new Passengers("Sera", "Goma", "Accra", "economic"));
                plane0.listPassengers();

                plane0.addPassengers(plane0, passenger);
                plane0.listPassengers();

        }
}