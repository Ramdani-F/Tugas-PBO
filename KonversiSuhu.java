
public class KonversiSuhu {
        public void tampilkan() {
        double C = 10;
        double F = 15;
        double R = 5;


        System.out.println("a. Celsius ke Fahrenheit : " + C + " C = " + (C * 9 / 5 + 32) + " F");
        System.out.println("   Fahrenheit ke Celsius : " + F + " F = " + ((F - 32) * 5 / 9) + " C");


        System.out.println("b. Celsius ke Reamur     : " + C + " C = " + (C * 4 / 5) + " R");
        System.out.println("   Reamur ke Celsius     : " + R + " R = " + (R * 5 / 4) + " C");


        System.out.println("c. Fahrenheit ke Reamur  : " + F + " F = " + ((F - 32) * 4 / 9) + " R");
        System.out.println("   Reamur ke Fahrenheit  : " + R + " R = " + (R * 9 / 4 + 32) + " F");
    }
    
}
