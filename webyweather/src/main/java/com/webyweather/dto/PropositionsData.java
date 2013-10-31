
package com.webyweather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PropositionsData {

    private List<Address> address;

    private List<Propositions> propositions;

    @JsonProperty("weather")
    private Weather weather;

    public List<Address> getAddress () {
        return this.address;
    }

    public void setAddress (List<Address> address) {
        this.address = address;
    }

    public List<Propositions> getPropositions () {
        return this.propositions;
    }

    public void setPropositions (List<Propositions> propositions) {
        this.propositions = propositions;
    }

    public Weather getWeather () {
        return this.weather;
    }

    public void setWeather (Weather weather) {
        this.weather = weather;
    }
}
