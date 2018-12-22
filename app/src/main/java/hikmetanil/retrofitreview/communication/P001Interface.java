package hikmetanil.retrofitreview.communication;

import java.util.List;

import hikmetanil.retrofitreview.model.P001Strong;
import retrofit.Callback;
import retrofit.http.GET;

public interface P001Interface {

    @GET("/gists/public")
    List<P001Strong> p001StrongList();
}
