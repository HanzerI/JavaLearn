package ru.alexandrov.guns;

public class MachineGun extends Gun {
    private int len; // Скорострельность

    public MachineGun() {
        super(0,30);
        this.len = 30;
    }

     public  MachineGun(int maxCartridges){
        super(0,maxCartridges);
        if(len < 0) throw new IllegalArgumentException("Скорострельность должна быть положительна");
        this.len = maxCartridges/2;
     }

    public MachineGun(int cartridges, int maxCartridges, int len) {
        super(cartridges, maxCartridges);
        if(len < 0) throw new IllegalArgumentException("Скорострельность должна быть положительна");
        if(len > maxCartridges) throw new IllegalArgumentException("Скорострельность не может быть больше максимального количества патрон ");
        this.len = len;
    }
}
