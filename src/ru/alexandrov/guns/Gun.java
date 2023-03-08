package ru.alexandrov.guns;

public class Gun extends Weapon {
    public final  int maxCartridges;

    Gun(){
        super(6);
        this.maxCartridges= 6;
    }

    Gun(int cartridges,int maxCartridges){
        super(cartridges);
        if( maxCartridges < 0) throw new IllegalArgumentException("maxCartridges must be positive");
        if( cartridges > maxCartridges) throw new IllegalArgumentException("Патронов больше максимального количества");
        this.maxCartridges = maxCartridges;
    }


    public int getMaxCartridges() {
        return maxCartridges;
    }

    public void setCartridges(int cartridges) {
        if( cartridges() > maxCartridges) throw new IllegalArgumentException("Патронов больше максимального количества");
        super.setCartridges(cartridges);
    }


    public void reload(int cartridges){
        if(cartridges + this.cartridges() > this.maxCartridges)
        {
            System.out.println("Возвращено патронов: "+(cartridges + this.cartridges() - this.maxCartridges));
            this.setCartridges(this.maxCartridges);
        }
        super.load(cartridges);
    }

    public void discharge(){
        System.out.println("Возвращено патронов:"+this.cartridges());
        this.cartridges = 0;
    }

//    public void isLoaded(){
//        if(this.cartridges() == this.maxCartridges)
//            System.out.println("Пистолет полностью заряжен");
//        else if(this.cartridges() == 0)
//            System.out.println("Пистолет разаряжен");
//        else System.out.println("Пистолет заряжен не полностью");
//    }

    public boolean isLoaded(){
        if(this.cartridges() == this.maxCartridges)
            return true;
        return false;
    }
//
//    public void isUnloaded(){
//        if(this.cartridges() == 0) System.out.println("Пистолет разаряжен");
//    }
    @Override
    public void shoot(){
        if(this.getCartridges())
            System.out.println("Бах");
        else System.out.println("Клац");
    }
}
