public class CategoryBDriver extends Driver<Car> {
    public CategoryBDriver(String fullName, boolean presenceOfDriverLicense, int experience, Car motorTransport) {
        super(fullName, presenceOfDriverLicense, experience, motorTransport);
    }

    @Override
    public String toString() {
        return "Водитель " +
                getFullName() +
                " управляет автомобилем " + getMotorTransport().getBrand() +
                " " + getMotorTransport().getModel() +
                " и будет участвовать в заезде.";
    }
}
