package hikmetanil.retrofitreview.communication;

import hikmetanil.retrofitreview.model.P003Strong;
import retrofit.http.GET;

public interface P003Interface  {

    @GET("/users/mojombo")
    P003Strong getP003Strong();
}
