package ru.mirea.lab1;
import java.util.Random;
public class Example {
    public static void main(String[] args){
        int myArray[] = {3, 5, 7, 13};                              //3 номер
        int sum=0;
        /*for(int i=0; i<myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);*/
        /*int n=0;
        while (n<myArray.length ){
            sum = sum + myArray[n];
            n++;
        }*/
        /*System.out.println(sum);*/
        /*do {
            sum = sum + myArray[n];
            n++;
        }while(n<myArray.length);




        System.out.println(sum);*/                              //4 номер
        /*for (int i=0; i<4; i++){
            System.out.print(args[i]);
        }*/



        /*for(int i=1; i<10; i++){                           //5 номер
            double num=1/i;

            System.out.printf(" %.2f", 1.0/i);

        }*/




        int[] array =new int[5];                                  //6 номер
        /*for(int i=0; i < array.length; i++)
        {
            array[i]=new Random().nextInt(99);
        }
        for (int i=0; i<array.length;i++) {
            System.out.print(" "+ array[i]);
        }
        System.out.println();*/
        for(int i=0; i < array.length; i++)
        {
            double n =Math.random() *100;
            array[i] =(int) n;
        }
        for (int i=0; i<array.length;i++) {
            System.out.print(" "+ array[i]);
        }
        System.out.println();
        for (int i = array.length-1; i>0 ; i--)
        for(int j=0; j < i; j++)
        {
            if(array[j] >array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
        for (int i=0; i<array.length;i++) {
            System.out.print(" "+ array[i]);
        }

        System.out.println();
        System.out.println(calculateFactorial(4));                     //7 номер


    }


    static int calculateFactorial(int n){                                 //7 номер
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
}


