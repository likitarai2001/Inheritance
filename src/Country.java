public class Country {
    public String country_name;
    public String continent;

    Country(String country_name, String continent){
        this.country_name = country_name;
        this.continent = continent;
    }

    public void display(){
        System.out.println(this.country_name + " is part of " + this.continent);
    }
}
