class Computer{
    public void code(){
        System.out.println("Coding by any computer");
    }
}
class Laptop extends Computer{
public void code(){
    System.out.println("Coding by laptop");
}
}
class Desktop extends Computer{
    public void code(){
        System.out.println("Coding by desktop");
    }
}

class Developer{
    public void code(Computer c){
        c.code();
    }
}
public class CEO {
    public static void main(String[] args) {
        Developer d=new Developer();
        Laptop l1=new Laptop();
        Desktop d1=new Desktop();
        d.code(d1);
        d.code(l1);
    }
}
