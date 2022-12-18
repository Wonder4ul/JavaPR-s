package pr_3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Generate {     //Задание 1

    Random rand2=new Random();
    double aMass[]=new double [10];
    public void generateRand1(){
        System.out.println("Mass, generated with random() method:\n");
        for(int i=0; i<10; i++){
            aMass[i]= Math.random();
            System.out.println(aMass[i]+"\n");
        }
    }
    public void generateRand2(){
        System.out.println("Mass, generated with class Random:\n");
        for(int i=0; i<aMass.length; i++){
            aMass[i]= rand2.nextDouble(100);
            System.out.println(aMass[i]+"\n");
        }
    }
    public void sort(){
        double temp;
        System.out.println("Sorted mass:\n");
        for(int i=0; i< aMass.length;i++)
            for(int j=0; j<aMass.length; j++)
                if(aMass[i]<aMass[j]){
                    temp=aMass[j];
                    aMass[j]=aMass[i];
                    aMass[i]=temp;}
        for(int i=0; i< aMass.length;i++)
            System.out.println(aMass[i]+" ");
    }
    public void generate3(){
        int bMass[]=new int[4];
        boolean flag=true;
        for(int i=0; i<bMass.length;i++)
            bMass[i]=rand2.nextInt(89)+10;
        System.out.println(Arrays.toString(bMass));
        for(int i=0; i<bMass.length-1; i++)
            if(bMass[i]>bMass[i+1]) flag=false;
        if(flag=true) System.out.println("This raw is ascending sequence");
        else System.out.println("This raw isn't ascending sequence");
    }
    public void generate4(int n){
        int cMass[]=new int[n];
        int counter=0;
        if(n<1){
            System.out.print("Try again pls. Your n<1: ");
            Scanner sc=new Scanner(System.in);
            n = sc.nextInt();
        }
        else {
            for(int i=0; i<cMass.length;i++){
                cMass[i]=rand2.nextInt(n);
                if((cMass[i] % 2)==0) counter++;
            }
            System.out.println(Arrays.toString(cMass));
        }
        int dMass[]=new int[counter];
        int j=0;
        for(int i=0; i< cMass.length;i++) {
            if (cMass[i] % 2 == 0) {
                dMass[j] = cMass[i];
                j++;
            }
        }
        System.out.println("Mass of even numbers"+Arrays.toString(dMass));
    }

    public static void main(String args[]){
        Generate task1= new Generate();
        Shells task2 = new Shells();
        System.out.println("Task #1:");
        task1.generateRand1();            //З. 1.1
        task1.sort();

        task1.generate3();        //З. 1.3

        Scanner sc=new Scanner(System.in);    //З. 1.4
        int n = sc.nextInt();
        task1.generate4(n);
        System.out.println("\nTask #2:");
        String a="12";
        task2.creation(10.0);
        task2.stringTransfrom(a);
        System.out.println("\nTask #3:");
        Converter task3= new Converter();
        double n1= sc.nextDouble();
        task3.converter(n1);
    }
}
