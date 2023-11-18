public enum WeaponType{
    LASER("Laser"),
    CHEMICAL("Chemical"),
    FIRE("Fire");

    String weaponType;

    WeaponType(String weaponType){
        this.weaponType = weaponType;
    };

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
}
