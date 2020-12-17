package Excepcions.ActivitatExceptions;


import Excepcions.ActivitatExceptions.Control.OperacionsBanc;
import Excepcions.ActivitatExceptions.Exceptions.ClientAccountException;

public class Main {
    public static void main(String[] args) {


        try {
           OperacionsBanc.verifyDNI("54037427W");
       } catch (ClientAccountException e) {
            System.out.println(e);
       }
    }
}
