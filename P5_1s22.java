import java.util.Scanner;

class P5_1s22{
   public static void main(String[] args) { 
      Scanner teclado = new Scanner(System.in);
      String temp;
      int num1, num2;
      int resultado;

      System.out.println("ingresa el primer numero");
      temp = teclado.nextLine();
      num1 = Integer.parseInt(temp);
      System.out.println("ingresa el segundo numero");
      temp = teclado.nextLine();
      num2 = Integer.parseInt(temp);
      resultado = num1-num2;
      System.out.println("La resta es: " + resultado);
  }
}