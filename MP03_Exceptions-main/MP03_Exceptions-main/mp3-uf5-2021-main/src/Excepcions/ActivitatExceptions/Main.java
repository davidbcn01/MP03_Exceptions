package Excepcions.ActivitatExceptions;


import Excepcions.ActivitatExceptions.Control.Menus;

import Excepcions.ActivitatExceptions.Control.OperacionsBanc;
import Excepcions.ActivitatExceptions.Exceptions.BankAccountException;
import Excepcions.ActivitatExceptions.Exceptions.ClientAccountException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BankAccountException {
        Menus menus = new Menus();
        int option;
        int option2;

        boolean a = false;
        Scanner sc = new Scanner(System.in);
       OperacionsBanc operacionsBanc = new OperacionsBanc();


        while (!a) {
            menus.MenuInicial();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    operacionsBanc.crearCompte();
                    break;

                case 2:
                   operacionsBanc.VerCuentas();
                   menus.MenusTransferencia1();
                   operacionsBanc.Transferencias();

                    break;
                case 3:
                   operacionsBanc.verificarDNI();
                    break;
                case 4:
                    menus.MenusGestions();
                    option2 = sc.nextInt();
                        switch (option2) {
                    case 1:
                        menus.MenusIngresar();
                       operacionsBanc.GestionsCompteIngresar();

                        break;
                    case 2:
                        menus.MenusTreure();
                        operacionsBanc.GestionsCompteTreure();

                        break;
                    case 3:
                        menus.MenusRemoveUser();
                       operacionsBanc.GestionsCompteEsborrarUsuari();

                        break;
                    case 4:
                        menus.MenusBuscarCompte();
                      operacionsBanc.BuscarCuentaPorNumeroDeCuenta();


                        break;
                    case 5:
                        System.exit(0);
                        break;
                }
                    break;


            }

        }


    }
}
