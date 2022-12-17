import task1.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Лада", "Гранта", 59.5599, "Бурый", "Хетчбэк", "автомат");
//        System.out.println(lada);
//        System.out.println();
        Bus neman = new Bus("Неман", "420211-10", 57.49, "Зеленый");
//        System.out.println(neman);
//        System.out.println();
        Truck gazel4 = new Truck("Газель", "Рута", 110);
//        System.out.println(gazel4);
//        gazel4.finishMoving();
//        System.out.println();

        CategoryBDriver nana = new CategoryBDriver("Нана Кобаяси Л.", true, 12, lada);
//        System.out.println(azazel);
//        azazel.stop();
//        task1.CategoryCDriver max = new task1.CategoryCDriver("АМТ", true, 10, gazel4);
//        System.out.println(max);
//        task1.CategoryDDriver dinislam = new task1.CategoryDDriver("ГДА", true, 20, neman);
//        System.out.println(dinislam);
//        System.out.println();

        Mechanic<Car> salavat = new Mechanic<>("Салават", "Валидов", "SintraCorp");
        Mechanic<Truck> renata = new Mechanic<>("Рената", "Девиль", "Evil");
        Mechanic<Bus> alex = new Mechanic<>("Александра", "Валидова", "SintraCorp");


        Sponsor honda = new Sponsor("Honda", 420);
        Sponsor redBull = new Sponsor("Red Bull", 243);
        Sponsor intel = new Sponsor("Intel", 40);
        Sponsor marlboro = new Sponsor("Marlboro", 200);
        Sponsor bridgestone = new Sponsor("Bridgestone ", 105);

        lada.addDriver(new CategoryBDriver("Тагирова Азалия Азаматовна", true, 12, lada), nana);
        lada.addMechanics(salavat);
        lada.addSponsors(honda, redBull, bridgestone);

        gazel4.addDriver(new CategoryCDriver("Даминов Максим Рюрикович", true, 10, gazel4));
        gazel4.addMechanics(renata);
        gazel4.addSponsors(marlboro, redBull);

        neman.addDriver(new CategoryDDriver("Гарипов Динислам Анисович", true, 20, neman));
        neman.addMechanics(alex);
        neman.addSponsors(intel, marlboro, honda);
//        service(lada, neman, gazel4);
        List<MotorTransport> motorTransports = List.of(lada, neman, gazel4);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(lada);
        serviceStation.addTruck(gazel4);
        serviceStation.service();
        serviceStation.service();

        printInfoDriver(lada);

    }

    public static void printInfoDriver(MotorTransport motorTransport) {
        System.out.println("Автотранспорт " + motorTransport.getBrand() + " " + motorTransport.getModel() + " будет учавствовать в заезде c водителем/ями:");
        for (Driver<?> driver : motorTransport.getDrivers()) {
            System.out.println(driver.getFullName());
        }
        System.out.println("со спонсором/ами из:");
        for (Sponsor sponsor : motorTransport.getSponsors()) {
            System.out.println(sponsor.getName() + ", чей взнос составляет $" + sponsor.getAmount() + " млн");
        }
        System.out.println("и с механиком/ами:");
        for (Mechanic<?> mechanic : motorTransport.getMechanics()) {
            System.out.println(mechanic.getSurname() + " " + mechanic.getName() + " из компании " + mechanic.getCompany());
        }
    }


    private static void service(MotorTransport... motorTransports) {
        for (MotorTransport motorTransport : motorTransports) {
            serviceT(motorTransport);
        }
    }

    private static void serviceT(MotorTransport motorTransport) {
        try {
            if (!motorTransport.service()) {
                throw new RuntimeException("Автотранспорт " + motorTransport.getBrand() + " " + motorTransport.getModel() + " не прошёл диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

}