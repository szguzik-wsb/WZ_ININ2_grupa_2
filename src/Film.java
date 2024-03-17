public class Film extends Author{
    public String name_movie;
    public int year_movie;

    public void info()
    {
        System.out.println("Nazwa filmu to: " + name_movie
                + " Rok produkcji filmu to:  " + year_movie
                + " Autor filmu to: " + this.getName_author()
                + " " + this.getSurName()
                + " a jego rok urodzenia to: " + this.getYear_author()
        );
    }
}
