import java.util.Random; public class Main { static int b;

public static void main(String[] args)
{
System.out.println("| Number | Positions\t|");

for (int i = 0; i < 10; i++)
{
Random random = new Random();//random
int b = random.nextInt(900000) + 100000; //random 100000-900000 System.out.print("| " + b + "\t | ");

int first = findFirst3Number(b); int second = findLast3Number(b); findLucky(first,second);

}
}
static int findFirst3Number(int b){

int i1=b/100000%10,i2=b/10000%10, i3=b/1000%10;
 
return i1+i2+i3;//summ pervie 3

}
static int findLast3Number(int b){

int i4=b/100%10, i5=b/10%10, i6=b%10; return i4+i5+i6;//summ poslednii 3


}
static void findLucky(int first,int second){ if( first == second) { System.out.println(" счастливое"+ "| ");
System.out.println(" 	_");
}
else {
System.out.println(" не счастливое"+ "| "); System.out.println(" 	");
}
}

}

