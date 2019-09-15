
package com.nea.myweather.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Current {

    @SerializedName("observation_time")
    @Expose
    private String observationTime;
    @SerializedName("temperature")
    @Expose
    private Long temperature;
    @SerializedName("weather_code")
    @Expose
    private Long weatherCode;
    @SerializedName("weather_icons")
    @Expose
    private List<String> weatherIcons = null;
    @SerializedName("weather_descriptions")
    @Expose
    private List<String> weatherDescriptions = null;
    @SerializedName("wind_speed")
    @Expose
    private Long windSpeed;
    @SerializedName("wind_degree")
    @Expose
    private Long windDegree;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure")
    @Expose
    private Long pressure;
    @SerializedName("precip")
    @Expose
    private Double precip;
    @SerializedName("humidity")
    @Expose
    private Long humidity;
    @SerializedName("cloudcover")
    @Expose
    private Long cloudcover;
    @SerializedName("feelslike")
    @Expose
    private Long feelslike;
    @SerializedName("uv_index")
    @Expose
    private Long uvIndex;
    @SerializedName("visibility")
    @Expose
    private Long visibility;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Current() {
    }

    /**
     * 
     * @param observationTime
     * @param cloudcover
     * @param pressure
     * @param visibility
     * @param weatherDescriptions
     * @param windDegree
     * @param feelslike
     * @param temperature
     * @param weatherIcons
     * @param windSpeed
     * @param humidity
     * @param precip
     * @param uvIndex
     * @param weatherCode
     * @param windDir
     */
    public Current(String observationTime, Long temperature, Long weatherCode, List<String> weatherIcons, List<String> weatherDescriptions, Long windSpeed, Long windDegree, String windDir, Long pressure, Double precip, Long humidity, Long cloudcover, Long feelslike, Long uvIndex, Long visibility) {
        super();
        this.observationTime = observationTime;
        this.temperature = temperature;
        this.weatherCode = weatherCode;
        this.weatherIcons = weatherIcons;
        this.weatherDescriptions = weatherDescriptions;
        this.windSpeed = windSpeed;
        this.windDegree = windDegree;
        this.windDir = windDir;
        this.pressure = pressure;
        this.precip = precip;
        this.humidity = humidity;
        this.cloudcover = cloudcover;
        this.feelslike = feelslike;
        this.uvIndex = uvIndex;
        this.visibility = visibility;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public Long getTemperature() {
        return temperature;
    }

    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }

    public Long getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(Long weatherCode) {
        this.weatherCode = weatherCode;
    }

    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    public void setWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
    }

    public List<String> getWeatherDescriptions() {
        return weatherDescriptions;
    }

    public void setWeatherDescriptions(List<String> weatherDescriptions) {
        this.weatherDescriptions = weatherDescriptions;
    }

    public Long getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Long windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Long getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(Long windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Long getPressure() {
        return pressure;
    }

    public void setPressure(Long pressure) {
        this.pressure = pressure;
    }

    public Double getPrecip() {
        return precip;
    }

    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    public Long getHumidity() {
        return humidity;
    }

    public void setHumidity(Long humidity) {
        this.humidity = humidity;
    }

    public Long getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Long cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Long getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Long feelslike) {
        this.feelslike = feelslike;
    }

    public Long getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Long uvIndex) {
        this.uvIndex = uvIndex;
    }

    public Long getVisibility() {
        return visibility;
    }

    public void setVisibility(Long visibility) {
        this.visibility = visibility;
    }

}
