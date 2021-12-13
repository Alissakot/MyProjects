package lesson11;

import lesson11.exceptions.*;

public class CheckpointRunner {
    public static void main(String[] args) {
        Auto[] cars = new Auto[30];
        for (int i = 0; i < cars.length; i++) {
            Car newCar = new Car();
            newCar.carRandom();
            cars[i] = newCar;
            i++;
            Truck newTruck = new Truck();
            newTruck.truckRandom();
            cars[i] = newTruck;
        }

       for (int i = 0; i < cars.length; i++) {
           try {
               CheckpointControl.checkPointSpeedControl(cars[i]);
           } catch (SpeedLimitException ex) {
               System.out.println("Превышение скорости (" + cars[i].getSpeed() + " км/ч). Номер автомобиля: " + cars[i].getNumber());
               continue;
           } catch (OverSpeedLimitException ex) {
               System.out.println("Скорость автомобиля с номером " + cars[i].getNumber() + " более 100 км/ч (" + cars[i].getSpeed() + " км/ч). Вызвана полиция");
               continue;
           } catch (OverMassException ex) {
               System.out.println("Проезд автомобиля с номером " + cars[i].getNumber() + " невозможен. Превышена масса (" + cars[i].getWeight() + " кг). Тип автомобиля: " + cars[i].getClassName());
               continue;
           } catch (OverHeightException ex) {
               System.out.println("Проезд автомобиля с номером " + cars[i].getNumber() + " невозможен. Превышена допустимая высота (" + cars[i].getHeight() + " см). Тип автомобиля: " + cars[i].getClassName());
               continue;
           } catch (OverWidthException ex) {
               System.out.println("Проезд автомобиля с номером " + cars[i].getNumber() + " невозможен. Превышена допустимая ширина (" + cars[i].getWidth() + " см). Тип автомобиля: " + cars[i].getClassName());
               continue;
           }
       }
    }
}
