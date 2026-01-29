void main(){
        //opgave 1
double item1  = 25.50;
double item2  = 15;
double item3  = 30;
double subtotal =item1 + item2 + item3;
double taxRate = 25;
double withTax = (subtotal* taxRate/100);
System.out.println(subtotal);
System.out.println(subtotal+withTax);


        //opgave 2
    double food = 450;
double drink = 120;
double tip = 50;
int pep= 4;
double total = food+drink+tip;
double prPerson = total/pep;
System.out.println(prPerson);


    //opgave 3
    double OGprice = 300;
    double discount = 20;
    double off = (OGprice-(OGprice*(discount/100)));
double tax = 25;
double FinalPrice = off+(off*tax/100);
System.out.println(OGprice);
System.out.println(off);
System.out.println(FinalPrice);




}
