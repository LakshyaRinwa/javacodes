
class Asd{
    public 
    int p;
    String st;
    float f;
   public void putdata(){
        System.out.println(p+" "+st+" "+f+"  inside class");
    }
}


public class Practice {
    
    public static void main(String[] args) {
        int x;
        String str;
        float f;

       //  System.out.println(x+" "+str+f+"inside main");  // bina initialize kre print krne pr error deta hai
        Asd obj=new Asd();
        obj.putdata();
    }
}
