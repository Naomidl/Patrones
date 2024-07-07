import Observer.*;
import Subject.*;

public class Main {
    public static void main(String[] args) {

        Subject Sujeto = new WeatherStation();

        Observer TemperatureDisplay = new TemperatureDisplay();
        Observer WeatherWarning = new WeatherWarning();

        Sujeto.addObserver(TemperatureDisplay);
        Sujeto.addObserver(WeatherWarning);

        Sujeto.notifyObservers(43);
        System.out.println();
        Sujeto.notifyObservers(113);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}
