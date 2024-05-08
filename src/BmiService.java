public class BmiService {
    int calculate(double height, double weight) {
        return (int) (weight / (height * height));
    }
}
