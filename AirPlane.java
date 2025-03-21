import java.util.Scanner;

public class AirPlane {

    private String name;
    private String origin;
    private String destination;

    private int planeCapacity;
    private int firstClassCapacity;
    private int economicClassCapacity;

    private int depatureTime;
    private int landingTime;

    private static int passengerOnBoard;
    private static int passengerInFirstClass;
    private static int passengerInEconomicClass;

    private Passengers[] firstClassPassengers;
    private Passengers[] economicClassPassengers;
    // private Passengers[][] passengers = { firstClassPassengers,
    // economicClassPassengers };

    public AirPlane() {
        name = origin = destination = null;

        planeCapacity = firstClassCapacity = economicClassCapacity = 0;

        passengerOnBoard = passengerInFirstClass = passengerInEconomicClass = 0;
    }

    public AirPlane(String name, String origin, String destination) {

        this.name = name;
        this.origin = origin;
        this.destination = destination;

        planeCapacity = firstClassCapacity = economicClassCapacity = 0;

        passengerOnBoard = passengerInFirstClass = passengerInEconomicClass = 0;

    }

    public void setPlaneName(String name) {
        this.name = name;
    }

    public void setPlaneOrigin(String origin) {
        this.origin = origin;
    }

    public void setPlaneDestination(String destination) {
        this.destination = destination;
    }

    public void setPlaneCapacity(int planeCapacity) {

        this.planeCapacity = planeCapacity;

        firstClassCapacity = ((planeCapacity * 10) / 100);
        setPlaneFirstClassCapacity(firstClassCapacity);

        firstClassPassengers = new Passengers[firstClassCapacity];

        economicClassCapacity = ((planeCapacity * 90) / 100);
        setPlaneEconomicClassCapacity(economicClassCapacity);

        economicClassPassengers = new Passengers[economicClassCapacity];

        passengerOnBoard = 0;
        passengerInFirstClass = 0;
        passengerInEconomicClass = 0;
    }

    public void setPlaneFirstClassCapacity(int firstClassCapacity) {

        if (planeCapacity == 0) {
            System.out.println("You should set first the total plane capacity.");
        }

        else if (firstClassCapacity == ((planeCapacity * 10) / 100)) {
            this.firstClassCapacity = firstClassCapacity;
        }

        else {
            System.out.println("The first class capacity must be 10 percent of the total plane capacity.");
        }

    }

    public void setPlaneEconomicClassCapacity(int economicClassCapacity) {

        if (planeCapacity == 0) {
            System.out.println("You should set first the total plane capacity.");
        }

        if (economicClassCapacity == ((planeCapacity * 90) / 100)) {
            this.economicClassCapacity = economicClassCapacity;
        }

        else {
            System.out.println("The economic class capacity must be 90 percent of the total plane capacity.");
        }

    }

    public void setPlaneProgram(int newDepatureTime, int newLandingTime) {

        setDepatureTime(newDepatureTime);
        setLandingTime(newLandingTime);
    }

    public void setDepatureTime(int depatureTime) {
        this.depatureTime = depatureTime;
    }

    public void setLandingTime(int landingTime) {
        this.landingTime = landingTime;
    }

    public void setAirPlane(String newName, String newOrigin, String newDestination, int newPlaneCapacity) {

        setPlaneName(newName);
        setPlaneOrigin(newOrigin);

        setPlaneDestination(newDestination);
        setPlaneCapacity(newPlaneCapacity);
    }

    public String getPlaneName() {
        return name;
    }

    public String getPlaneOrigin() {
        return origin;
    }

    public String getPlaneDestination() {
        return destination;
    }

    public int getPlaneCapacity() {
        return planeCapacity;
    }

    public String getCapacity() {
        return ("The plane has the capacity of " + planeCapacity + " seats where " + firstClassCapacity
                + " are first class and " + economicClassCapacity + " are economic seats.");
    }

    public int getPlaneFirstClassCapacity() {
        return firstClassCapacity;
    }

    public int getPlaneEconomicClassCapacity() {
        return economicClassCapacity;
    }

    public String getPlaneProgram() {
        return (name + " will take off at " + depatureTime + " and land at " + landingTime);
    }

    public int getDepatureTime() {
        return depatureTime;
    }

    public int getLandingTime() {
        return landingTime;
    }

    public static int getPassengersOnBoard() {
        return passengerOnBoard;
    }

    public void addPassengers(AirPlane newAirPlane, Passengers newPassenger) {

        if (passengerOnBoard < planeCapacity) {
            if ((passengerInFirstClass < firstClassCapacity)
                    && (newPassenger.getSeatClass().equalsIgnoreCase("First class")
                            || newPassenger.getSeatClass().equalsIgnoreCase("First"))
                    && newPassenger.getDestination().equalsIgnoreCase(newAirPlane.destination)) {

                firstClassPassengers[passengerInFirstClass] = newPassenger;
                passengerInFirstClass++;
                passengerOnBoard++;
            }

            else if ((passengerInEconomicClass < economicClassCapacity)
                    && (newPassenger.getSeatClass().equalsIgnoreCase("Economic class")
                            || newPassenger.getSeatClass().equalsIgnoreCase("Economic"))
                    && newPassenger.getDestination().equalsIgnoreCase(newAirPlane.destination)) {

                economicClassPassengers[passengerInEconomicClass] = newPassenger;

                passengerInEconomicClass++;
                passengerOnBoard++;
            }

            else if ((passengerInFirstClass >= firstClassCapacity)
                    && (newPassenger.getSeatClass().equalsIgnoreCase("First class")
                            || newPassenger.getSeatClass().equalsIgnoreCase("First"))
                    && newPassenger.getDestination().equalsIgnoreCase(newAirPlane.destination)) {

                System.out.println(newPassenger.getName() + ", we have reached the maximum number in our first class.");
            }

            else if ((passengerInEconomicClass >= economicClassCapacity)
                    && (newPassenger.getSeatClass().equalsIgnoreCase("Economic class")
                            || newPassenger.getSeatClass().equalsIgnoreCase("Economic"))
                    && newPassenger.getDestination().equalsIgnoreCase(newAirPlane.destination)) {

                System.out.println(
                        newPassenger.getName() + ", we have reached the maximum number in our economic class.");
            }
        }

        else {
            System.out.println("We have reached the maximum capacity of the plane.");
        }
    }

    public void listPassengers() {
        System.out.println("In " + getPlaneName() + " we have " + passengerOnBoard + " passenger(s) on board. "
                + passengerInFirstClass
                + " in the first class and " + passengerInEconomicClass + " in the economic class.");

        System.out.println("In the first class we have " + passengerInFirstClass + " passenger(s):");

        for (int m = 0; m < passengerInFirstClass; m++) {
            System.out.println((m + 1) + ". " + firstClassPassengers[m]);
        }

        System.out.println("In the economic class we have " + passengerInEconomicClass + " passenger(s):");

        for (int n = 0; n < passengerInEconomicClass; n++) {
            System.out.println((n + 1) + ". " + economicClassPassengers[n]);
        }
    }

    public String toString() {
        return ("The plane " + name + " is taking off from " + origin + " at in destination of " + destination
                + " with a capacity of " + planeCapacity);
    }

    // String passengerClass = (income > 10_000) ? "First" : "Economy";
}