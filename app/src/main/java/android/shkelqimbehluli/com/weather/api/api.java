package android.shkelqimbehluli.com.weather.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by SHB on 4/4/2018.
 */

public class api {

    public static final String API_Key="e7c75ebafb8910969cadcaaa39517929";
    public static final String API_LINK="http://api.openweathermap.org/data/2.5/weather";

    public static String apiRequest(String locationID){

        StringBuilder URL = new StringBuilder(API_LINK);
        URL.append(String.format("?id=%s&appid=%s&units=metric",locationID,API_Key));
        return URL.toString();
    }

    public static String apiGPSRequest(String lat,String lon){

        StringBuilder URL = new StringBuilder(API_LINK);
        URL.append(String.format("?lat=%s&lon=%s&appid=%s&units=metric",lat,lon,API_Key));
        return URL.toString();
    }


    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat = new SimpleDateFormat();
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);

        return dateFormat.format(date);
    }

    public static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png",icon);
    }

    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM YYYY HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }



}
