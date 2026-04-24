package ro.ase.cts.program;

import ro.ase.cts.clase.Facade;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ionel",7);
        Medic medic1 = new Medic();
        Salon salon1 = new Salon();

        if(pacient1.getGravitate()>6 ){
            if(medic1.areInregistratPacientul(pacient1)){
                int nrPatLiber = salon1.getPatLiber();
                if(nrPatLiber !=-1){
                    System.out.println("Pacient Inregistrat pe patul:" +nrPatLiber);
                    salon1.ocupaPat(nrPatLiber);
                }else {
                    System.out.println("Nu exista paturi libere");
                }
            }else {
                System.out.println("Nu ai trimitere");
            }
        }else{
            System.out.println("Nu este gravitate mare");
        }

        Facade receptieSpital = new Facade();
        receptieSpital.internarePacient(pacient1);
    }
}
