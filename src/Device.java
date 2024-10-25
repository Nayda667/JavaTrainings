public class Device {
    byte currentIndex = 0;
    static String[] drinks = new String[8];

    public Device(String drinks1, String drinks2, String drinks3, String drinks4, String drinks5, String drinks6, String drinks7, String drinks8) {
        this.drinks[currentIndex] = drinks1;
        currentIndex++;
        this.drinks[currentIndex] = drinks2;
        currentIndex++;
        this.drinks[currentIndex] = drinks3;
        currentIndex++;
        this.drinks[currentIndex] = drinks4;
        currentIndex++;
        this.drinks[currentIndex] = drinks5;
        currentIndex++;
        this.drinks[currentIndex] = drinks6;
        currentIndex++;
        this.drinks[currentIndex] = drinks7;
        currentIndex++;
        this.drinks[currentIndex] = drinks8;
        currentIndex++;
    }
}
