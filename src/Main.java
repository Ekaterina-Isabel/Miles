public class Main {
    public static void main(String[] args) {
        int ticketPriceInKopecks = 1_500_75;
        int costOf_1_MileInKopecks = 20_00;

        int numberOfMiles = ticketPriceInKopecks / costOf_1_MileInKopecks;
        System.out.println("Количество начисленных миль за купленный билет: " + numberOfMiles);
    }
}