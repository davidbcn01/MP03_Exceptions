package Excepcions.ActivitatExceptions.Control;

import Excepcions.ActivitatExceptions.Exceptions.BankAccountException;
import Excepcions.ActivitatExceptions.Exceptions.ClientAccountException;
import Excepcions.ActivitatExceptions.Exceptions.ExceptionMessage;
import Excepcions.ActivitatExceptions.Model.Client;
import Excepcions.ActivitatExceptions.Model.CompteEstalvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperacionsBanc {

    List <CompteEstalvi> llistaComptes = new ArrayList<>();
Menus menus = new Menus();

    Scanner sc = new Scanner(System.in);





    public static boolean verifyDNI(String dni) throws ClientAccountException {
        //TODO implementar fòrmula de verificació del DNI
        final String WRONG_DNI = "DNI incorrecte: ";

        boolean correcto = false;

        Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");

        Matcher matcher = pattern.matcher(dni);



        if (matcher.matches()) {

            String letra = matcher.group(2);

            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

            int index = Integer.parseInt(matcher.group(1));

            index = index % 23;

            String reference = letras.substring(index, index + 1);



            if (reference.equalsIgnoreCase(letra)) {

                correcto = true;

            } else {

                correcto = false;
                throw new ClientAccountException(WRONG_DNI+ dni);
            }

        }


return correcto;

    }


public  void crearCompte()  {
        menus.MenuCrearCompte1();
    Scanner sc = new Scanner(System.in);

    String  ClientNom = sc.nextLine();
    String CognomClient = sc.nextLine();
    String DNI = sc.nextLine();




    Client client = new Client(ClientNom,CognomClient,DNI);
    List<Client> llistaUsuaris1 = Arrays.asList(client);
    menus.MenuCrearCompte2();
        String numCompte = sc.nextLine();
        double saldo = sc.nextDouble();





    llistaComptes.add(new CompteEstalvi(numCompte,saldo,llistaUsuaris1));

    System.out.println("Vol crear una altra compte? Pulsi 1 per fer-ho, pulsi qualsevol altra tecla per acabar");

    int option = sc.nextInt();
    if(option==1){
        crearCompte();
    }else{
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Tornant al menú principal.....");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }


}


public void VerCuentas(){

for(int i =0; i < llistaComptes.size();i++){
    System.out.println(i+"."+"Numero de compte: "+llistaComptes.get(i).getNumCompte()+" Saldo: "+llistaComptes.get(i).getSaldo()+" Lista de usuarios:"+llistaComptes.get(i).getLlista_usuaris());

}


    }

public void Transferencias () throws BankAccountException {

    double transferencia = sc.nextDouble();
menus.MenusTransferencia2();
    int num = sc.nextInt();

    double saldoEmissor = llistaComptes.get(num).getSaldo();

    saldoEmissor = saldoEmissor - transferencia;
if(saldoEmissor >0){
    llistaComptes.get(num).setSaldo(saldoEmissor);
    menus.MenusTransferencia3();
    int num2 = sc.nextInt();
    double saldoReceptor = llistaComptes.get(num2).getSaldo();
    saldoReceptor = saldoReceptor + transferencia;
    llistaComptes.get(num2).setSaldo(saldoReceptor);
}else {
    throw new BankAccountException(ExceptionMessage.TRANSFER_ERROR);
}




}
public void GestionsCompteIngresar(){
        VerCuentas();
        int num = sc.nextInt();
        double ingres = sc.nextDouble();

        llistaComptes.get(num).ingressar(ingres);

}
public void GestionsCompteTreure() {
        VerCuentas();
        int num = sc.nextInt();
        double quantitat = sc.nextDouble();
try{
    llistaComptes.get(num).treure(quantitat);
} catch (BankAccountException e) {
    e.printStackTrace();

}


}
    public void GestionsCompteEsborrarUsuari() throws BankAccountException {
        VerCuentas();
        int num = sc.nextInt();
        String DNI = sc.nextLine();
try {
    llistaComptes.get(num).removeUser(DNI);
} catch (BankAccountException e) {
    e.printStackTrace();
}
    }
    public void BuscarCuentaPorNumeroDeCuenta() throws BankAccountException{

      String numCompte = sc.nextLine();
        for(int i =0;i< llistaComptes.size();i++){
            if (numCompte.equals(llistaComptes.get(i).getNumCompte())){
                System.out.println("Cuenta existente");
            }else{
                throw new BankAccountException(ExceptionMessage.ACCOUNT_NOT_FOUND);
            }
        }

    }
    public void verificarDNI(){
        menus.MenusDNI();
        String DNI = sc.nextLine();
        try {
            verifyDNI(DNI);
            System.out.println("Correcto");
        } catch (ClientAccountException e) {
            System.out.println(e);
        }
    }

    }






