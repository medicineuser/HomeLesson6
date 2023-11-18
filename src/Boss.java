public class Boss extends  GameEntity{
    public WeaponType weapon;


    public WeaponType getWeapon(){
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public Boss(int health , int damage , WeaponType weapon ){
        this.setHealth(health);
        this.setDamage(damage);
        this.setWeapon(weapon);
    };
    public String printlninfo(){
        return "Boss Health:"+ this.getHealth() + " Boss Damage:"+ this.getDamage() + " Boss Weapon:"+ this.getWeapon().toString().toLowerCase();
    };
}
