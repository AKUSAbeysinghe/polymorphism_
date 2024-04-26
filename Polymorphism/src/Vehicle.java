class Vehicle {
    public void drive(){
        System.out.println("Am the Boss!");
    }
}

class Audi extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving 160kmph");
    }
}

class BMW extends  Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving 140kmph");
    }
}

class Benz extends Vehicle{
    @Override
    public void drive() {
         super.drive();
        System.out.println("Driving 120kmph");
    }
}

class Honda extends Benz{
    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving 100kmph");
    }
}

class Test2{
    public static void main(String[] args) {
        Vehicle y;
        y=new Audi();
        y.drive();

    }
}