package hikmetanil.retrofitreview.communication;

import java.util.List;

import hikmetanil.retrofitreview.model.P005Strong;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface P005Interface {

    @GET("/search/users")
    P005Strong getP005Strong(@Query("q") String userName);
}
