import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        String[] carBrands2023 = {"Volvo", "Hyundai", "Kia" };

        String[] carBrands2024 = {"Volvo", "Hyundai", "Kia" };

//        System.out.println(Arrays.compare(carBrands2023, carBrands2024));
//
//        System.out.println(Arrays.equals(carBrands2024, carBrands2023));

//        Arrays.fill(carBrands2024, "Audi");

        Arrays.fill(carBrands2024, 1, 3, "Audi");

        System.out.println(Arrays.toString(carBrands2024));

    }
}
