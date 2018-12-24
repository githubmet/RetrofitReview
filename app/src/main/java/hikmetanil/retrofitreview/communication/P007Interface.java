package hikmetanil.retrofitreview.communication;

import java.util.List;

import hikmetanil.retrofitreview.model.P007Strong;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface P007Interface {

    @GET("/users/{userName}/repos")
    void getP007StrongCallBackList(@Path("userName") String userName, Callback<List<P007Strong>> p007StrongListCallback);
}
