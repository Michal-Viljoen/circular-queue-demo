import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int size=0;
        int input;
        int condition;
        String firstname = null;
        String name = null;
        String  CName[] =new String[100];
        String Sname[]=new String[100];
        String fName[]=new String[100];
        int i=0;
        int l=0;
        int p=0;
        Scanner scanner=new Scanner(System.in);

    Myque critical=new Myque(100);
    Myque serious=new Myque(100);
    Myque fair =new Myque(100);


        do {
            System.out.println("Main Menu");
            System.out.println("1 Schedule a patient");
            System.out.println("2 Treat the next patient");
            System.out.println("3 Treat all patients");
            System.out.println("4 Exit the Program");
            System.out.print("Enter a Number [1-4]: ");
            size++;
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Enter the patients name:");
                name = scanner.next();
            System.out.println("Patient's Condition: ");
            System.out.println("1 Critical ");
            System.out.println("2 Serious ");
            System.out.println("3 Fair ");
            System.out.print("Enter a number [1-3]: ");
            condition = scanner.nextInt();
            if (condition == 1) {
                System.out.println(name + " is added to the critical list");
                CName[i]=name;
                critical.enque(name);
                i++;
            }  if (condition == 2) {
                System.out.println(name + " is added to the serious list");
                Sname[l]=name;
                serious.enque(name);
                l++;
            }  if (condition == 3) {
                System.out.println(name + " is added to the fair list");
                fName[p]=name;
                fair.enque(name);
                p++;
            }
        }

            if(input==2){
                System.out.println(CName[0]);
                if(!critical.isEmpty()){
                    System.out.println(CName[0] + " Is being treated next");
                    critical.deque(name);
                }
                else if(!serious.isEmpty() && critical.isEmpty()){
                    System.out.println(Sname[0]+ " Is being treated next");
                    serious.deque(name);
                }else if(serious.isEmpty()&&critical.isEmpty()){
                    System.out.println(fName[0] + " Is being treated next");
                    fair.deque(name);
                }
            }if(input==3){
                for(int j=0;j<2;j++){
                    if(CName[j]!=null){
                    serious.deque(name);
                    System.out.println("Patient "+ CName[j] + "/ critical is being Treated");}
                    else if(CName[j]==null){
                        System.out.print("");
                    }
                }for(int t=0;t<1;t++){
                    if(Sname[t]!=null){
                critical.deque(name);
                System.out.println("Patient "+ Sname[t] + "/ serious is being Treated");}
                    else if(Sname[t]==null){
                        System.out.print("");

                    }
                }
                for(int n=0;n<1;n++) {
                    if (fName[n]!=null){
                    fair.deque(name);
                    System.out.println("Patient " + fName[n] + "/ fair is being Treated");}
                    else if(fName[n]==null){
                        System.out.print("");
                    }
                }

            }
        }while (input!=4);
        System.out.println("The following poeple are in Critcal Condition: ");
        critical.display();
        System.out.println("The following poeple are in Serious Condition: ");
        serious.display();
        System.out.println("The following poeple are in Fair Condition: ");
        fair.display();

    }

}
