package hikmetanil.retrofitreview.communication;


import java.util.List;

import hikmetanil.retrofitreview.model.P004Strong;
import retrofit.Callback;
import retrofit.http.GET;

public interface P004Interface {
    @GET("/gists/public")
    void getP004StrongList(Callback<List<P004Strong>> p004StrongListCallback);
}
