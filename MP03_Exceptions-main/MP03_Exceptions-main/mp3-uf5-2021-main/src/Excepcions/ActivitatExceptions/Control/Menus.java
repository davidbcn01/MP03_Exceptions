package Excepcions.ActivitatExceptions.Control;

public class Menus {
public void MenuInicial(){

    System.out.println("*******Menú*******");
    System.out.println("------------------");
    System.out.println("1.Crear compte");
    System.out.println("2.Tranferencia");
    System.out.println("3.Verificar DNI");
    System.out.println("4.Gestions de compte");
    System.out.println("------------------");
    System.out.println("Ingresa un numero:");
}
    public void MenuCrearCompte1(){

        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("Introdueixi el nom, el cognom i el DNI del client");

    }
    public void MenuCrearCompte2(){

        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("Introdueixi el numero de compte i el saldo");

    }
    public void MenusTransferencia1(){
        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("Introduexi la quantitat de la transferencia:");
    }
    public void MenusTransferencia2(){
        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("Seleccioni el compte des del qual vol enviar els diners:");
    }
    public void MenusTransferencia3(){
        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("Seleccioni el compte des del qual vol rebre els diners:");
    }
    public void MenusDNI(){
        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("Introdueixi el DNI a verificar");
    }
    public void MenusGestions() {
        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("1.Ingressar diners");
        System.out.println("2.Treure diners");
        System.out.println("3.Borrar usuari de compte");
        System.out.println("4.Buscar compte");
        System.out.println("5.Sortir");
        System.out.println("------------------");
        System.out.println("Ingresa un numero:");
    }
    public void MenusIngresar(){
        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("Introdueixi el compte i la quantitat a ingressar: ");
    }
    public void MenusTreure(){
        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("Introdueixi el compte i la quantitat a treure: ");
    }
    public void MenusRemoveUser(){
        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("Introdueixi el compte iel dni de la persona a donar de baixa: ");
    }
    public void MenusBuscarCompte(){
        System.out.println("*******Menú*******");
        System.out.println("------------------");
        System.out.println("Introdueixi el numero de compte que vols buscar  ");
    }

}
