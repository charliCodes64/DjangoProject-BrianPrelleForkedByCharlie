import java.util.Scanner;

class Interpreter{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        String storeW;
        String temp="";

        while(!temp.equals("q")){ 
            System.out.println("Hello please enter q: ");
            storeW = scan.nextLine();
            temp = storeW.toLowerCase();

            if (temp.equals("q")){
                System.out.println("you quit");
                break;
            }else{
                System.out.println("Invalid input");
            }
        }
    }   
