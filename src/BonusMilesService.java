public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int bonusMiles;
        int rubForOneBonusMile = 20;
        bonusMiles = ticketPrice / rubForOneBonusMile;
        return bonusMiles;

    }
}