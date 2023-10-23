package adapter.meteo.adapter;
import adapter.meteo.MeteoSensor;
import adapter.meteo.SensorTemperature;

import java.time.LocalDateTime;

public class ST500InfoAdapter implements MeteoSensor{
    public SensorTemperature sensorTemperature;

    public ST500InfoAdapter(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)sensorTemperature.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime timeStamp = LocalDateTime.of(sensorTemperature.year(), 10, 4, 0, 0, 0);
        timeStamp.plusDays(sensorTemperature.day()).plusSeconds(sensorTemperature.second());
        return timeStamp;
    }
}
