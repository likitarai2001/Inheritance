public class India extends Country {
    public String state;
    public String language;


    public India(String country_name, String continent, String state, String language) {
        super(country_name, continent);
        this.state = state;
        this.language = language;
    }

    @Override
    public void display(){
        System.out.println(this.state + " is in " + super.country_name + " and it's major language is " + this.language);
    }
}
