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



//opgave 4
    int guests = 15;
    int cupcakes = 40;
    int CupCakesPp = 40/15;
    int leftover = cupcakes % guests;
    System.out.println("each person gets " + CupCakesPp + " cupcakes");
    System.out.println(leftover + " cupcakes left");


    //opgave 5
    StringBuilder sb = new StringBuilder ();
    String name = "Anna";
    int age = 25;
    sb.append("hello, ");
    sb.append(name);
    sb.append( "! " );
    sb.append("you are ");
    sb.append (age);
    sb.append(" years old");
    System.out.println(sb.toString());


    //opgave 6
    int score = 100;
    System.out.println(score);
    score += 50;
    System.out.println(score);
    score += 25;
    System.out.println(score);




    //opgave 7
    int health = 100;
    System.out.println(health);
    health -= 15;
    System.out.println(health);
    health -=20;
    System.out.println(health);



//opgave 8
    double price = 50;
    System.out.println(price);
    price *= 2;
    System.out.println(price);


    //opgave 9
    int counter = 10;
    System.out.println(counter);
    counter ++;
    System.out.println(counter);
    counter --;
    System.out.println(counter);

    //opgave 10
    double number = 10;
    System.out.println(number);
    number += 5;
    System.out.println(number);
    number -= 3;
    System.out.println(number);
    number ++;
    System.out.println(number);
    number --;
    System.out.println(number);


















}
