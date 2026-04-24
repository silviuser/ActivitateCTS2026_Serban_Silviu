package ro.ase.cts.clase;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        this.salon = new Salon();
    }
    public void internarePacient(Pacient pacient){
        if(pacient.getGravitate()>6 ){
            if(this.medic.areInregistratPacientul(pacient)){
                int nrPatLiber = this.salon.getPatLiber();
                if(nrPatLiber !=-1){
                    System.out.println("Pacient Inregistrat pe patul:" +nrPatLiber);
                    this.salon.ocupaPat(nrPatLiber);
                }else {
                    System.out.println("Nu exista paturi libere");
                }
            }else {
                System.out.println("Nu ai trimitere");
            }
        }else{
            System.out.println("Nu este gravitate mare");
        }
    }
}
