package main.helloworld;

import java.util.Scanner;


/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Sanja Milenkovic Padjen");
//        int age = 5;
//        if (age >= 18) {
//            System.out.println("Osoba je punoletna.");    
//        } else {
//            System.out.println( "Osoba je maloletna.");
//        }
//         System.out.println( "Unesite broj godina: ");
//      Scanner input = new Scanner (System.in);
//        int userAge = input.nextInt();
//        
//        System.out.println("Korisnik je uneo: " + userAge);
//        if (userAge >= 18) {
//            System.out.println("Osoba je punoletna.");    
//        } else {
//            System.out.println( "Osoba je maloletna.");
//        } 
//  System.out.println("Unesite broj godina: ");
//        Scanner input2 = new Scanner(System.in);
//        int personAge = input.nextInt();
//       
//       
//        if (personAge <= 0 && personAge > 150) {
//            System.out.println("Invalid");
//        } else if (personAge > 0 && personAge <= 5) {
//            System.out.println("Baby");
//        } else if (personAge <= 11) {
//            System.out.println("Kid");
//        } else if (personAge <= 17) {
//            System.out.println("Teen");
//        }  else if (personAge >=18) {
//            System.out.println("Adult");
//        }
//       
//        System.out.println("-------------------------------");
//        Scanner input3 = new Scanner (System.in);
//       
//        int dayNumber = input3.nextInt();
//        
//        String day = null;
//       
//        switch (dayNumber) {
//            case 1:
//            System.out.println("Ponedeljak");
//            break;
//             case 2:
//            System.out.println("Utorak");
//            break;
//             case 3:
//            System.out.println("Sreda");
//            break;
//             case 4:
//            System.out.println("Cetvrtak");
//            break;
//             case 5:
//            System.out.println("Petak");
//            break;
//             case 6:
//            System.out.println("Subota");
//            break;
//             case 7:
//            System.out.println("Nedelja");
//            break;
//            default:
//            System.out.println("Nije uneta trazena vrednost.");
//            break;
//        }
//        System.out.println(day);
   
//    System.out.println("While loop1:");
//    int x = 5;
//            while (x<10)
//            {System.out.println(x);
//            x = x+1;
//            }
            
//    System.out.println ("While loop2:");
//        int x = 10;
//    while (x>0)
//    {System.out.println(x);
//     x--;
//    }
//    
//    System.out.println ("Do While loop:");
//  do   {
//      System.out.println(x);
//     x--;
//  } while (x>15);
//    
//   System.out.println ("For loop:");
//  for (int i = 50; i < 60; i++) {
//      System.out.println(i);
//  }
  
//   System.out.println ("For loop2:");
//  for (int i = 30; i >= 20; i--) {
//      System.out.println(i);
//  }
//  
//  System.out.println("Kvadrat:");
//  for (int i = 0; i < 10; i++) {
//      for (int j = 0; j < 10; j++) {
//          System.out.print("*");
//      }
//      System.out.println();
//  }
   
  
System.out.println("Koordinate1:");
  for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
          System.out.print("(" + i + "," + j +")");
      }
      System.out.println();
  }
  
  System.out.println("Koordinate2:");
  for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <=10; j++) {
          System.out.print("(" + i + "," + j +")");
      }
      System.out.println();
  }
  
  
    } 
}