
package com.nea.myweather.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("timezone_id")
    @Expose
    private String timezoneId;
    @SerializedName("localtime")
    @Expose
    private String localtime;
    @SerializedName("localtime_epoch")
    @Expose
    private Long localtimeEpoch;
    @SerializedName("utc_offset")
    @Expose
    private String utcOffset;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param region
     * @param localtime
     * @param lon
     * @param localtimeEpoch
     * @param name
     * @param utcOffset
     * @param timezoneId
     * @param lat
     * @param country
     */
    public Location(String name, String country, String region, String lat, String lon, String timezoneId, String localtime, Long localtimeEpoch, String utcOffset) {
        super();
        this.name = name;
        this.country = country;
        this.region = region;
        this.lat = lat;
        this.lon = lon;
        this.timezoneId = timezoneId;
        this.localtime = localtime;
        this.localtimeEpoch = localtimeEpoch;
        this.utcOffset = utcOffset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getTimezoneId() {
        return timezoneId;
    }

    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    public Long getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    public void setLocaltimeEpoch(Long localtimeEpoch) {
        this.localtimeEpoch = localtimeEpoch;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

}
