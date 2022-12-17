public class Mechanic<M extends MotorTransport> {
    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public boolean  service(M m) {
         return m.service();
    }

    public void repair(M m) {
        m.repair();
    }
}
