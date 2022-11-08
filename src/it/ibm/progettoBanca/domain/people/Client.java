package it.ibm.progettoBanca.domain.people;

import it.ibm.progettoBanca.domain.data.Account;

import java.time.LocalDate;

public class Client {
    public String firstname;
    private String lastname;
    public LocalDate dob;
    public Account[] accounts;
    public Client (String fn, String ln, LocalDate birthDate, int maxAccount){
        firstname= fn;
        lastname= ln;
        dob= birthDate;
        accounts= new Account[maxAccount];

    }
    public String getLastname(){
        return lastname;
    }

    public void setLastname(String ln) {
        //if (ln.length() > 2) {
            lastname=ln;
        //}

    }
}

