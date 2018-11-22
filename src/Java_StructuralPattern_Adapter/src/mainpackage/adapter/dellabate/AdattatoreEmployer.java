package mainpackage.adapter.dellabate;

public class AdattatoreEmployer extends Impiegato {
	 
    Employer employer = null;
 
    public AdattatoreEmployer(Employer employer) {
        this.employer = employer;
    }
 
    @Override
    public String getCognome() {
        return employer.getLastName();
    }
 
    @Override
    public void setCognome(String cognome) {
        employer.setLastName(cognome);
    }
}