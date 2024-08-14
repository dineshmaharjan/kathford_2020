package np.edu.divyagyan.remoteserverexample.helper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIHelper {

    private static  Retrofit retrofit=null;
    private static  String BASE_URL="https://jsonplaceholder.typicode.com/";

    private APIHelper(){
    }


    public  static Retrofit getInstance(){

        if(retrofit ==null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;


    }

}
