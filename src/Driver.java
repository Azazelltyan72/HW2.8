public class Driver<M extends MotorTransport & Competing> {
    private String fullName;
    public boolean presenceOfDriverLicense;
    private int experience;
    private M motorTransport;

    public void startMoving() {
        System.out.println("Водитель " + getFullName() + " начинает  движение.");
    }

    public void stop() {
        System.out.println("Водитель " + getFullName() + " делает остановку.");
    }

    public void refuelMotorTransport() {
        System.out.println("Водитель " + getFullName() + " заправляет автотранспорт.");
    }


    public Driver(String fullName, boolean presenceOfDriverLicense, int experience, M motorTransport) {
        setFullName(fullName);
        setPresenceOfDriverLicense(presenceOfDriverLicense);
        setExperience(experience);
        setMotorTransport(motorTransport);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.isEmpty() && !fullName.isBlank()) {
            this.fullName = fullName;
        } else {
            this.fullName = "default";
        }
    }

    public boolean isPresenceOfDriverLicense() {
        return presenceOfDriverLicense;
    }

    public void setPresenceOfDriverLicense(boolean presenceOfDriverLicense) {
        this.presenceOfDriverLicense = presenceOfDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience >= 0) {
            this.experience = experience;
        } else {
            this.experience = 2;
        }
    }

    public M getMotorTransport() {
        return motorTransport;
    }

    public void setMotorTransport(M motorTransport) {
        if (motorTransport == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.motorTransport = motorTransport;
    }
}
