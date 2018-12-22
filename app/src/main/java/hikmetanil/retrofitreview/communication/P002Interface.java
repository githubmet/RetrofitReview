package hikmetanil.retrofitreview.communication;

import java.util.List;

import hikmetanil.retrofitreview.model.P002Strong;
import retrofit.Callback;
import retrofit.http.GET;

public interface P002Interface {

    @GET("/gists/public")
    void getP002StrongList(Callback<List<P002Strong>> p002StrongListCallback);
}
