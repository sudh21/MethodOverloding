

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class subtract{

    public int sub(int a, int b){

        return a-b;
    }

public  double avg(double a, double b){

        return (a+b)/3;

}

}


public class Main {
    public static void main(String[] args) {

       int  a;
       double c;

       subtract obj = new subtract();
       a= obj.sub(3,4);
       c = obj.avg(4,5);

        System.out.println("sub "+a);
        System.out.println("Sub "+c);
        }
    }
