public class Main {
    public static void main(String[] args) {
        int amount = 20;  // Количество рублей за одну милю
        int ticketPrice = 1000; // Стоимость билета
        int miles = ticketPrice / amount; //Начисленно миль


        System.out.println("Начисленно миль:" + miles);
    }
}

