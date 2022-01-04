package com.company;

import java.util.Scanner;

public class Main {
    /**
     * Napisać program do obsługi sklepu:
     * Posiadamy dwie tablice 10 elementowe - jedna double (przechowuje ceny produktów), druga String (przechowuje nazwy produktów)
     * Relacja cena-nazwa na podstawie indexu (np. cena produktu pod indeksem 0 to cena z tabeli cen pod indeksem 0)
     * Calosc dziala w petli
     * Dostępne opcje:
     * dostępne - wyświetla wszystkie produkty i ich cenę
     * szukaj - możliwość szukania produktu, jak nie znajdzie to zwróć indeks produktu (-1 jak nie ma go w tablicy).
     * zmienCene - zmienia cenę produktu pod podanym indeksem
     * zmienNazwe - jw. ale dla nazwy produktu
     * opusc - wyjscie z petli
     * @return
     */

    public static void main(String[] args) {
        System.out.println("Welcome in GreatShop");
        String[] productNames = new String[]
                {"milk","sugar","butter","bread","salt","sausages","cheese","tea","coffee","flour"};

        double[] price = new double[]{2.99,4.99,8.50,2.50,1.99,4.99,5.15,3.55,15.99,3.99};

        boolean work=true;

        while (work){
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Choose your option");
            System.out.println("1.Your available product " + " 2.Search Product " + " 3.Change Price Product " +
                    " 4.Change Name Product " + " 5.Exit program ");
            int yourOption = scanner.nextInt();

            switch (yourOption){
                //TODO dostepne produkty - zrobione !
                case 1:
                    System.out.println("You choose option -> Your available product");

                    for(int i=0;i<productNames.length && i<price.length;i++){
                        System.out.print(productNames[i]);
                        System.out.print(" ");
                        System.out.println(price[i]);
                    }
                    break;

                //TODO zrobic wyszukiwanie produktow - zrobione !
                case 2:
                    System.out.println("You choose option -> SearchProduct");
                    System.out.println("Enter the name of product");
                    String nameProduct = scanner.next();
                    if(nameProduct != null ){
                        for (int i = 0; i < productNames.length; i++) {
                            if (productNames[i].equals(nameProduct)) {
                                System.out.println("Product " + nameProduct + " is exist on the list ");
                            }

                            }
                        }


                    break;

                //TODO dodac zmiane ceny produktu - zrobione
                case 3:
                    System.out.println("You choose option -> Change Price Product ");
                    System.out.println("First Enter the name of product");
                    String product = scanner.next();
                    System.out.println("Enter the new price for your product");
                    double newPrice = scanner.nextDouble();
                    if(product != null && newPrice>0 ){
                        for (int i = 0; i < productNames.length && i < price.length; i++) {
                            if (productNames[i].equals(product)) {
                                price[i] = newPrice;
                                System.out.println("Change made");
                            }

                        }
                    }
                        break;

                    //TODO dodac zmiane nazwy produktu - zrobione
                case 4:
                    System.out.println("Which element you want change ? ");
                    String toChangeP = scanner.next();
                    System.out.println("Enter the new name of product ?");
                    String afterChangeP = scanner.next();
                    if(toChangeP != null) {
                        for (int i = 0; i < productNames.length; i++) {
                            if (productNames[i].equals(toChangeP)) {
                                productNames[i] = afterChangeP;
                                System.out.println("Change made");
                            }
                        }
                    }


                    break;

                case 5:
                    work=false;
                    break;

            }

        }
    }
}