
package com.webyweather.dto;

public class WeatherCondition {

    private String code;

    private String dayIcon;

    private String description;

    private String nightIcon;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDayIcon() {
        return this.dayIcon;
    }

    public void setDayIcon(String dayIcon) {
        this.dayIcon = dayIcon;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNightIcon() {
        return this.nightIcon;
    }

    public void setNightIcon(String nightIcon) {
        this.nightIcon = nightIcon;
    }
}
