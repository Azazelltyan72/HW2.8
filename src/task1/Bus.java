package task1;

public class Bus extends MotorTransport implements Competing {
    private String color;
    public void repair() {
        System.out.println("Автобус " + getBrand() + getModel() + " починен");
    }
    @Override
    public void startMoving() {
        System.out.println(color + " автобус начинает движение.");
    }

    @Override
    public void finishMoving() {
        System.out.println(color + " автобус заканчивает движение.");
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + getModel() + " в диагностике не требуется");
        return true;
    }

    public Bus(String brand, String model, double engineCapacity, String color) {
        super(brand, model, engineCapacity);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "Красный";
        } else {
            this.color = color;
        }
    }

    @Override
    public String toString() {
        return "task1.Bus{" +
                "brand ='" + getBrand() + '\'' +
                ", model ='" + getModel() + '\'' +
                ", color ='" + color + '\'' +
                ", engineCapacity ='" + String.format("%.2f", getEngineCapacity()) +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.println(("Автобус " + this.getBrand() + " " + this.getModel() + " делает пит-стоп (техническую оставку)."));
    }

    @Override
    public void maxSpeed() {
        System.out.println(("Автобус " + this.getBrand() + " " + this.getModel() + " достигает максимальной скорости."));
    }

    @Override
    public void bestTime() {
        System.out.println(("У автобуса " + this.getBrand() + " " + this.getModel() + " лучшее время."));
    }


}
