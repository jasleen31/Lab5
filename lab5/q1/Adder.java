package sum;

public class Adder{
public int add(int a, int b){
return a+b;
}
public static void main(String args[]){
Adder obj = new Adder();
System.out.println(obj.add(50,20));
}
}