public class Main {
    public static void main(String[] args) {
        Vehicle aircraft = new Aircraft("Airbus-414J", 2022, "Air");
        Vehicle ship = new Ship("MEASK-Coastliner-V", 2005, "Sea");
        Vehicle car = new Car("Toyota Land Cruiser", 2024, "Land");

        aircraft.title();
        aircraft.transMode();

        ship.title();
        ship.transMode();

        car.title();
        car.transMode();
    }
}
