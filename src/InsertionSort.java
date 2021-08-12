
import model.Car;

/**
 *
 * @author Lucas de Castro
 */
public class InsertionSort {
    
    public static void main(String[] args) {
        Car cars[] = {
            new Car("Ferrari", 1000000),
            new Car("Tesla", 70000),
            new Car("Jaguar", 80000),
            new Car("Fusca", 500),
        };
        
//        InsertionSort
        for (int i = 0; i < cars.length; i++) {
            int analyzing = i;
            while (analyzing > 0 && cars[analyzing].getPrice() < cars[analyzing - 1].getPrice()) {                
                Car analyzeCar = cars[analyzing];
                Car previousCar = cars[analyzing - 1];
                cars[analyzing - 1] = analyzeCar;
                cars[analyzing] = previousCar;
                analyzing--;
            }
        }
        
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
