package DesignPattern;

interface MovableInterface {
    // returns speed in MPH
    double getSpeed();
}

class BugattiVeyronClass implements MovableInterface {

    @Override
    public double getSpeed() {
        return 100;
    }
}

interface MovableAdapterInterface {
    // returns speed in KM/H
    double getSpeed();
}

class MovableAdapterClass implements MovableAdapterInterface{

    private MovableInterface luxuryCars;

    public MovableAdapterClass(MovableInterface movableInterface){
        this.luxuryCars=movableInterface;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
public class AdapterDesignPattern {

    public static void main(String []args) {
        MovableInterface movableInterface = new BugattiVeyronClass();
        MovableAdapterInterface movableAdapterInterface = new MovableAdapterClass(movableInterface);

        System.out.println(movableAdapterInterface.getSpeed());
    }

}
