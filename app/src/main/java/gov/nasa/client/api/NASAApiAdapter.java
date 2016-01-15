package gov.nasa.client.api;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import gov.nasa.client.api.NASAApi;
import gov.nasa.client.api.NASAService;

/**
 * Created by nk91 on 13.01.16.
 */
public class NASAApiAdapter {

    public static NASAService getRESTAdapter() {
        Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl(NASAApi.NASA_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return restAdapter.create(NASAService.class);
    }

}
