public class Maharashtra extends India{
    public String old_name;
    public int formation_year;

    Maharashtra(String country_name, String continent, String state, String language, String old_name, int year){
        super(country_name, continent, state, language);
        this.old_name = old_name;
        this.formation_year = year;
    }

    public void about(){
        System.out.println("Maharashtra was formed on " + this.formation_year + " and it was previously known as " + this.old_name);
    }
}
