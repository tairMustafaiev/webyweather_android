
package com.webyweather.dto;

import java.util.List;

public class Forecast {

    private List<Astronomy> astronomy;

    private String date;

    private List hourly;

    private String maxtempC;

    private String maxtempF;

    private String mintempC;

    private String mintempF;

    public List<Astronomy> getAstronomy () {
        return this.astronomy;
    }

    public void setAstronomy (List<Astronomy> astronomy) {
        this.astronomy = astronomy;
    }

    public String getDate () {
        return this.date;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public List getHourly () {
        return this.hourly;
    }

    public void setHourly (List hourly) {
        this.hourly = hourly;
    }

    public String getMaxtempC () {
        return this.maxtempC;
    }

    public void setMaxtempC (String maxtempC) {
        this.maxtempC = maxtempC;
    }

    public String getMaxtempF () {
        return this.maxtempF;
    }

    public void setMaxtempF (String maxtempF) {
        this.maxtempF = maxtempF;
    }

    public String getMintempC () {
        return this.mintempC;
    }

    public void setMintempC (String mintempC) {
        this.mintempC = mintempC;
    }

    public String getMintempF () {
        return this.mintempF;
    }

    public void setMintempF (String mintempF) {
        this.mintempF = mintempF;
    }
}
