package ru.alexandrov.guns;

abstract class Weapon {
    protected int cartridges;

    public Weapon(int cartridges) {
        if (cartridges < 0) throw new RuntimeException("Cartridges must be positive");
        this.cartridges = cartridges;
    }

    public void setCartridges(int cartridges) {
        if (cartridges < 0) throw new RuntimeException("Cartridges must be positive");
        this.cartridges = cartridges;
    }

    abstract void shoot();

    public int cartridges(){ return cartridges; }

    public boolean getCartridges(){
        if(cartridges == 0) return false;
        cartridges--;
        return true;
    }

    public void load(int cartridges){
        if(cartridges < 0) throw new RuntimeException("Cartridges must be positive");
            this.cartridges += cartridges;
    }

}
