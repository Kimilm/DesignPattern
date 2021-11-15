package creational.singleton;

public class App {
    public static void main(String[] args) {
        // ver.01
//        Settings settings = new Settings();
//        Settings settings1 = new Settings();
//        System.out.println(settings != settings1);

        // ver.02
        Settings settings = Settings.getInstance();
        System.out.println(settings == settings.getInstance());
    }
}
