import java.util.Scanner;
public class tablas_de_multiplicar{
public static void main(String[] args){
int res;
Scanner sc = new Scanner (System.in);
System.out.println("Ingresa el numero de tabla de multiplicar que quieras ");
int a = sc.nextInt();
for(int i = 1; i<=10; i++){
res = a*i;
System.out.println(a+" x "+i+" = "+res);
}
}}