package org.kamran.service;


import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.kamran.config.TimeApiConfig;
import org.kamran.model.TimeApiResponse;
import org.springframework.stereotype.Service;

@Service
public class TimeServiceImpl implements TimeService {

    TimeApiConfig timeApiConfig;

    public TimeServiceImpl(TimeApiConfig timeApiConfig) {
        this.timeApiConfig = timeApiConfig;
    }

    @Override
    public String getCurrentTime(String timeZone) {


        HttpResponse<TimeApiResponse> timeApiResponse = Unirest.get(
                timeApiConfig.getEndpoint() + timeApiConfig.getContinent())
                .asObject(TimeApiResponse.class);

        return timeApiResponse.getBody().getDate_time();
    }
}
