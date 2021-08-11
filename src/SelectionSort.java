
import model.Car;

/**
 *
 * @author Lucas de Castro
 */
public class SelectionSort {

    public static void main(String[] args) {
        Car cars[] = {
            new Car("Ferrari", 1000000),
            new Car("Tesla", 70000),
            new Car("Jaguar", 80000),
            new Car("Fusca", 500),
        };

        //SelectionSort
        for (int i = 0; i < cars.length; i++) {
            int cheapest = findTheCheapest(cars, i, cars.length);
            Car actual = cars[i];
            Car cheapestCar = cars[cheapest];
            cars[i] = cheapestCar;
            cars[cheapest] = actual;
        }
        
        for (Car car : cars) {
            System.out.println(car);
        }
    }
    
    private static int findTheCheapest(Car cars[], int initial, int end){
        int smallest = initial;
        
        for (int actual = initial; actual < end; actual++) {
            if(cars[actual].getPrice() < cars[smallest].getPrice()){
                smallest = actual;
            }
        }
        
        return smallest;
    }
}
