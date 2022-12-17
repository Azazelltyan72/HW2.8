public class CategoryDDriver extends Driver<Bus> {

    public CategoryDDriver(String fullName, boolean presenceOfDriverLicense, int experience, Bus motorTransport) {
        super(fullName, presenceOfDriverLicense, experience, motorTransport);
    }

    @Override
    public String toString() {
        return "Водитель " +
                getFullName() +
                " управляет автобусом " + getMotorTransport().getBrand() +
                " " + getMotorTransport().getModel() +
                " и будет участвовать в заезде.";
    }
}
