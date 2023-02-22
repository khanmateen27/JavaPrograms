abstract class ABC
{
void disp()
{
System.out.println("Disp Method");
}
abstract void print();
}

class PQR extends ABC
{
void print(){
System.out.println("Print");
}
}

class abstractClass{
public static void main(String ar[]){
PQR p = new PQR();
p.disp();
p.print();


}


}