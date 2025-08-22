# Weather-Detector-Sensor
|| Weather Detector Sensor using Core Java🛜 ||

🛠 Features
1. Input sensor values (temperature, humidity, wind speed).
2. Detect and display current weather condition.
3. Alert messages for extreme conditions (heatwave, storm, high humidity, etc.).
4. Can be extended with real-world API integration (like OpenWeatherMap) in the future.


Source Code:

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

public class WeatherDetector {
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


Example Output
=== Weather Detector Sensor ===
Enter Temperature (°C): 38
Enter Humidity (%): 30
Enter Wind Speed (km/h): 20

Detected Weather Condition: ☀ Sunny (Possible Heatwave Alert!)
⚠ Alert: Extremely High Temperature!


🌍Real-World Advantages
1. Disaster Management – Helps predict storms, heatwaves, or heavy rains.
2. Agriculture Support – Farmers can plan irrigation based on weather predictions.
3. Public Safety – Alerts for extreme conditions to avoid accidents.
4. Smart Devices – Can be integrated with IoT sensors for real-time weather monitoring.
