package android.shkelqimbehluli.com.weather;

import android.location.LocationManager;
import android.shkelqimbehluli.com.weather.models.OpenWeatherMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Shkelqim Behluli
    TextView txtCity,txtLastUpdate,txtDescription,txtHumidity,txtTime,txtCelsius;
    ImageView imageView;
    LocationManager locationManager;
    String provider;
    static double lat, lng;
    OpenWeatherMap openWeatherMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
