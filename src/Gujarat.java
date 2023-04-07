public class Gujarat extends India{
    public String festival;

    public Gujarat(String country_name, String continent, String state, String language, String festival) {
        super(country_name, continent, state, language);
        this.festival = festival;
    }

    public void intro(){
        System.out.println("Gujarat is a state along the western coast of India. " +
                            "Its coastline of about 1,600 km is the longest in the country.");
    }
}
