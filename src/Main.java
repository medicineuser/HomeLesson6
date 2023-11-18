// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(1000,50, WeaponType.LASER);
//        boss.setHealth(1000);
//        boss.setDamage(50);
//        boss.setWeapon(WeaponType.LASER);

        System.out.println(boss.printlninfo());

        Skeleton sk1 = new Skeleton(300,20,WeaponType.CHEMICAL,5);
        Skeleton sk2 = new Skeleton(330,22,WeaponType.FIRE,3);



        System.out.println(sk1.printlninfo());
        System.out.println(sk2.printlninfo());


    }
}