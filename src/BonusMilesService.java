public class BonusMilesService {
    public int calculate(int price) {
        int wasted = 20;
        int totalMiles = price / wasted;

        return totalMiles;
    }
}