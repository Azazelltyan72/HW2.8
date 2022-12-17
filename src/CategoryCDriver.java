public class CategoryCDriver extends Driver<Truck> {

    public CategoryCDriver(String fullName, boolean presenceOfDriverLicense, int experience, Truck motorTransport) {
        super(fullName, presenceOfDriverLicense, experience, motorTransport);
    }

    @Override
    public String toString() {
        return "Водитель " +
                getFullName() +
                " управляет грузовиком " + getMotorTransport().getBrand() +
                " " + getMotorTransport().getModel() +
                " и будет участвовать в заезде.";
    }
}