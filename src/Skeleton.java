public class Skeleton extends Boss{
    int arrowsAmount;

    public Skeleton(int health , int damage , WeaponType weapon , int arrowsAmount){
        super(health , damage , weapon );
        this.arrowsAmount = arrowsAmount;
    };

    public int getArrowsAmount() {
        return arrowsAmount;
    }

    public void setArrowsAmount(int arrowsAmount) {
        this.arrowsAmount = arrowsAmount;
    }

    public String printlninfo(){
      return super.printlninfo().replaceAll("Boss","Skeleton") + " ArrowsAmount:"+ this.arrowsAmount;
    };

}
