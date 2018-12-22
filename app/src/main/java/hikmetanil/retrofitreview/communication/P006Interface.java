package hikmetanil.retrofitreview.communication;

import hikmetanil.retrofitreview.model.P006Strong;
import retrofit.http.GET;
import retrofit.http.Path;

public interface P006Interface {

    @GET("/users/{userName}")
    P006Strong getP006Strong(@Path("userName") String userName);
}
