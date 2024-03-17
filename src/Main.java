//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Film movie = new Film();
        movie.name_movie = "Avatar";
        movie.year_movie = 2018;
        movie.setName_author("Andrzej");
        movie.setSurName("Kowalski");
        movie.setYear_author(2000);
        movie.info();


        Car car = new Car();

        Car car2 = new Car(
                "BMW ",
                2024,
                " 95 ",
                " Niebieski"
        );

        Car car3 = car2;
        car3.color = "Pomarańcz";

        System.out.println(car.InfoCar());
        System.out.println(car2.InfoCar());
        System.out.println(car3.InfoCar());

    }
}

