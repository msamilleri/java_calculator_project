import java.util.Scanner;

public class Main {

   public static void show_main_menu(){
       System.out.println("Java Calculator");
       System.out.println("Choose (+) 1\nChoose (-) 2\nChoose (/) 3\nChoose (*) 4\nChoose Exit  5");
       System.out.print("Choosing : ");
   }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


       while (true) {
           show_main_menu();
           int choose = input.nextInt();

           switch (choose) {
               case 1:
                   System.out.println("1.st number :");
                   double first_add_number = input.nextDouble();

                   System.out.println("2.nd number :");
                   double second_add_number = input.nextDouble();

                   System.out.println("result is = " + (first_add_number + second_add_number));
                   break;

               case 2:
                   System.out.println("1.st number :");
                   double first_minus_number = input.nextDouble();

                   System.out.println("2.nd number :");
                   double second_minus_number = input.nextDouble();

                   System.out.println("result is = " + (first_minus_number - second_minus_number));
                   break;

               case 3:
               System.out.println("1.st number :");
               double first_sub_number = input.nextDouble();

               System.out.println("2.nd number :");
               double second_sub_number = input.nextDouble();

               System.out.println("result is = " + (first_sub_number / second_sub_number));
               break;

               case 4:
                   System.out.println("1.st number :");
                   double first_divide_number = input.nextDouble();

                   System.out.println("2.nd number :");
                   double second_divide_number = input.nextDouble();

                   System.out.println("result is = " + (first_divide_number * second_divide_number));
                   break;

               case 5:
                   System.exit(0);

               default:
                   System.out.println("Systme ERROR 404");
           }
          }
         }
        }

