public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        int miles1 = service.calculate(2_543);
        System.out.println(miles1);

        int miles2 = service.calculate(6_244);
        System.out.println(miles2);

        int miles3 = service.calculate(87_000);
        System.out.println(miles3);
    }
}