public class Book {
int bno;
String name;
double price;



Book()   // default
{
bno=101;
name="asha";
price=90;

}
Book(int bno,String name,double price)
{
this.bno=bno;
this.name=name;
this.price=price;
}




public int getBno() {
return bno;
}
public void setBno(int bno) {
this.bno = bno;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;
}
 
public String toString()
{
return bno+ " "+name+ ""+ price;
}
}
 