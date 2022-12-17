package task1;

public class Truck extends MotorTransport implements Competing {
    public Truck(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен");
    }

    @Override
    public boolean service() {
        return Math.random() > 0.85;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начинает движение.");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик заканчивает движение.");
    }

    @Override
    public String toString() {
        return "Truk{" +
                "brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", engineCapacity ='" + String.format("%.2f", getEngineCapacity()) +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.println(("Грузовик " + this.getBrand() + " " + this.getModel() + " делает пит-стоп (техническую оставку)."));
    }

    @Override
    public void maxSpeed() {
        System.out.println(("Грузовик " + this.getBrand() + " " + this.getModel() + " достигает максимальной скорости."));
    }

    @Override
    public void bestTime() {
        System.out.println(("У грузовика " + this.getBrand() + " " + this.getModel() + " лучшее время."));
    }
}
