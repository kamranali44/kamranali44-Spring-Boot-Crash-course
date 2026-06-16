package org.kamran.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class TimeApiResponse {
    private String date_time;

    public TimeApiResponse(String date_time) {
        this.date_time = date_time;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }
}
