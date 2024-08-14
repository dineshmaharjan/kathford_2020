package np.edu.divyagyan.remoteserverexample.helper;

import java.util.List;

import np.edu.divyagyan.remoteserverexample.entitiy.request.PostRequest;
import np.edu.divyagyan.remoteserverexample.entitiy.response.PostResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIService {

    @POST("posts")
    Call<PostResponse> submitPost(@Body PostRequest postRequest);

    @GET("posts")
    Call<List<PostResponse>> getAllPosts();



}
