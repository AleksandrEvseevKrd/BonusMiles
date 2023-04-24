public class Main {

    public static void main(String[] args) {
        int ticketPrice = 12345;
        System.out.println("Стоимость билета на Авиасейлс - " + ticketPrice);
        int oneMile = 20;
        int bonusMiles = (ticketPrice / oneMile);
        System.out.println("Накоплено бонусных миль Авиасейлс - " + bonusMiles);
    }
}