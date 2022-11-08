package it.ibm.progettoBanca.program;

import it.ibm.progettoBanca.domain.data.ForeignAccount;
import it.ibm.progettoBanca.domain.people.Client;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client c1= new Client("Ciccio","Rossi", LocalDate.of(1981,12,11),10);
        System.out.println(c1.getLastname());
        c1.setLastname("Bianchi");
        //setLastname(c1,"Bianchi");
        System.out.println(c1.firstname);
        ForeignAccount fa=new ForeignAccount(1000, "fr");

    }
}