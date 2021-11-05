import java.util.Scanner;
public class asteriscos{
public static void main(String[] args){
int res;
Scanner sc = new Scanner (System.in);
System.out.println("Ingresa el numero de pisos que tenga la escalera ");
int a = sc.nextInt();

for(int i = 1; i<=a; i++){
System.out.println("");
for(int j = 1; j<=i; j++){
System.out.print("*");
}
}

}}