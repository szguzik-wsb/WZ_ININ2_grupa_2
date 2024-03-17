public class Car {
    private String name;
    private int year;
    private String fuel;
    public  String color;

    Car() {
        this.name = "Fiat";
        this.year = 1810;
        this.fuel = "95";
        this.color = "Biały";
    }

    Car(String name, int year, String fuel) {
        this.name = name;
        this.year = year;
        this.fuel = fuel;
        this.color = "Różowy";
    }

    Car(String name, int year, String fuel, String color) {
        this.name = name;
        this.year = year;
        this.fuel = fuel;
        this.color = color;
    }

    public String InfoCar() {
        return "Nazwa samochodu to " + this.name
                + " Rok produkcji to " + this.year
                + " Rodzaj paliwa to " + this.fuel
                + " Kolor samochodu to " + this.color;
    }
}
