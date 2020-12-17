package Excepcions.ActivitatExceptions.Control;

import Excepcions.ActivitatExceptions.Exceptions.ClientAccountException;
import Excepcions.ActivitatExceptions.Model.Client;
import Excepcions.ActivitatExceptions.Model.CompteEstalvi;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperacionsBanc {


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


public static void Transferencias(){
    Client client1 = new Client("Pepe","Viyuela","54037421W");
    Client client2 = new Client("Pepa","Viyuela","54037421W");
    Client client3 = new Client("David","Ferrero","54037421W");
    Client client4 = new Client("Alguien","Del Mundo","54037421W");


        List<Client> llistaUsuaris1 = Arrays.asList(client1,client2);
        List<Client> llistaUsuaris2 = Arrays.asList(client3,client4);
            CompteEstalvi  Cuenta1 = new CompteEstalvi("12345678",1200.00,llistaUsuaris1);
            CompteEstalvi Cuenta2 = new CompteEstalvi("98765432",9000.00,llistaUsuaris2);
        double transferencia = 30.00;
        Cuenta1.saldo = Cuenta1.saldo-transferencia;
        Cuenta2.saldo = Cuenta1.saldo+transferencia;

    }


    }






