import java.util.Scanner;

class WeatherSensor {
    private double temperature; // in Celsius
    private double humidity;    // in percentage
    private double windSpeed;   // in km/h

    public WeatherSensor(double temperature, double humidity, double windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public String detectWeather() {
        if (temperature > 35 && humidity < 40) {
            return "☀ Sunny (Possible Heatwave Alert!)";
        } else if (humidity > 70 && temperature < 30) {
            return "🌧 Rainy Weather";
        } else if (windSpeed > 50) {
            return "🌪 Stormy Weather (Storm Alert!)";
        } else if (temperature >= 20 && temperature <= 30 && humidity >= 40 && humidity <= 60) {
            return "⛅ Cloudy";
        } else {
            return "🌤 Moderate Weather";
        }
    }

    public void showAlerts() {
        if (temperature > 40) {
            System.out.println("⚠ Alert: Extremely High Temperature!");
        }
        if (humidity > 85) {
            System.out.println("⚠ Alert: High Humidity Level!");
        }
        if (windSpeed > 80) {
            System.out.println("⚠ Alert: Dangerous Storm Condition!");
        }
    }
}

public class WeatherDetectorSensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Weather Detector Sensor ===");

        System.out.print("Enter Temperature (°C): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter Humidity (%): ");
        double humidity = sc.nextDouble();

        System.out.print("Enter Wind Speed (km/h): ");
        double windSpeed = sc.nextDouble();

        WeatherSensor sensor = new WeatherSensor(temperature, humidity, windSpeed);

        System.out.println("\nDetected Weather Condition: " + sensor.detectWeather());
        sensor.showAlerts();

        sc.close();
    }
}

