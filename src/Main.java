public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 6200;
        int bonusMiles = service.calculate(ticketPrice);
        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}