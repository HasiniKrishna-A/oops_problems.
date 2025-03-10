class simple_calci{
public void add(){
       int a=5,b=11;
       int c=a+b;
       System.out.println("addition of a and b is: "+c);
     }
public void sub(){
       int a=5,b=11;
       int sub=a-b;
       System.out.println("subtraction of a and b is: "+sub);
     }
public void mul(){
       int a=5,b=11;
       int mul=a*b;
       System.out.println("multiplication of a and b is: "+mul);
     }
public void div(){
       int a=5,b=11;
       int div=a/b;
       System.out.println("subtraction of a and b is: "+div);
     }
}
class adv_calci extends simple_calci{
public void div_adv(){
int a=36,b=6;
if(b!=0){
int div=a/b;
System.out.println("div of a and b in adv_calci is: "+div);
}
}
public void modulo_div(){
int a=5,b=2;
if(b!=0){
int mod=a%b;
System.out.println("div of a and b in adv_calci is: "+mod);
}
}
}
class super_calci extends adv_calci{
public void max(){
int a=9,b=7;
m=max(a,b);
System.out.println("max of a and b is: "+m);
}
}
class multilevel{
  public static  void main(String[] args){
super_calci obj=new super_calci();
obj.squarert();
obj.div_adv();
obj.modulo_div();
obj.add();
obj.sub();
obj.mul();
obj.div();
}
}