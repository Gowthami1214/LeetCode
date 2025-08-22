import java.util.*;

class Car {
    int position;
    double time;
    Car(int position, double time) {
        this.position = position;
        this.time = time;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        if (n == 0) return 0;

        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            double time = (double)(target - position[i]) / speed[i];
            cars[i] = new Car(position[i], time);
        }

      
        Arrays.sort(cars, new Comparator<Car>() {
            public int compare(Car a, Car b) {
                return b.position - a.position;
            }
        });

        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (cars[i].time < cars[i+1].time) {
               
                ans++;
            } else {
                
                cars[i+1].time = cars[i].time;
            }
        }

        return ans + 1; 
    }
}
