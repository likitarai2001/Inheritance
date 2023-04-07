public class Main {
    public static void main(String[] args) {
        India ind = new India("India", "Asia", "Kerala", "Malayalam");
        ind.display();
        Gujarat guj = new Gujarat("India", "Asia", "Gujarat", "Gujarati", "Navratri");
        guj.intro();
        Maharashtra mah = new Maharashtra("India", "Asia", "Gujarat", "Marathi", "Dandakaranya", 1960);
        mah.about();
    }
}