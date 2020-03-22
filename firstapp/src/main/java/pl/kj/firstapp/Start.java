package pl.kj.firstapp;

import java.util.Scanner;

// Zadanie 1
public class Start {
    public static void main(String[] args){
        System.out.println("Podaj temperature");
        Scanner scan = new Scanner (System.in);
        int a;
        int b;
        a=scan.nextInt();
        System.out.println("Podaj  druga temperature");
        b=scan.nextInt();

        if(a>100||b<100){
            System.out.println("prawda");
        }
    }
}


/*
// Zad 2
public class Start {
    public static void main(String[] args){
        int tab[]={3,2,2,3,2,3,7,1,2,3,8};
        for(int i=0;i<11;i++){
            if (tab[i]==1){
                if (tab[i+1]==2){
                    if (tab[i+2]==3){
                        System.out.println("tablica zwiera sekwencje 1 2 3");

                    }
                }
            }
        }


        }
    }



//Zad 3
/*
public class Start {
    public static void main(String[] args){
        System.out.println("Sprwadz czy zbudujesz trojkat prostokatny");
        System.out.println("podaj dlugosc przyprostokatnej");
        Scanner scan = new Scanner (System.in);
        int przyprostokatna1;
        przyprostokatna1=scan.nextInt();
        System.out.println("podaj dlugosc drugiej przyprostokatnej ");
        int przyprostokatna2;
       przyprostokatna2=scan.nextInt();
        System.out.println("podaj dlugosc przeciwprostokatnej ");
        int przeciwprostokatna;
        przeciwprostokatna=scan.nextInt();
        if(przyprostokatna1*przyprostokatna1+przyprostokatna2*przyprostokatna2==przeciwprostokatna*przeciwprostokatna){
            System.out.println("to bardzo ladny trojkat prostokatny ");
        }
        else{
            System.out.println("z tych bokow trojkata nie zbudujesz  ");
        }

        }
    }
 */
/*
public class Start {
    public static void main(String[] args){
        int a;
        for(a=0;a<12;a++){
            for(int b=0;b<a;b++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}

 */