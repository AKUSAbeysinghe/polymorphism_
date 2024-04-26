class Shapes {

    void draw() {

    }
}

class Rectangle extends Shapes{

    void  draw(){
        System.out.println("Drawing Rectangle!");
    }
}

class Circle extends  Shapes{

    void  draw(){
        System.out.println("Drawing Circle!");
    }
}

class Triangle extends Shapes{
    void draw(){
        System.out.println("Drawing Triangle!");
    }
}

class Test1{
    public static void main(String[] args) {
        Shapes s;
        s=new Rectangle();
        s.draw();
        s=new Circle();
        s.draw();
        s=new Triangle();
        s.draw();

    }
}
