package com.coolrainweather.android.gson;

/**
 * Created by xyz on 2017/3/22.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
