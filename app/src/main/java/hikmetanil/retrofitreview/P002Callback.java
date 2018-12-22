package hikmetanil.retrofitreview;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.ArrayAdapter;

import java.util.List;

import hikmetanil.retrofitreview.adapter.P002ArrayAdapter;
import hikmetanil.retrofitreview.communication.P001Interface;
import hikmetanil.retrofitreview.communication.P002Interface;
import hikmetanil.retrofitreview.model.P001Strong;
import hikmetanil.retrofitreview.model.P002Strong;
import retrofit.Callback;
import retrofit.Endpoint;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class P002Callback extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().build());
        Endpoint endpoint=new Endpoint() {
            @Override
            public String getUrl() {
                return "https://api.github.com";
            }

            @Override
            public String getName() {
                return null;
            }
        };

        RestAdapter.Builder builder=new RestAdapter.Builder();
        builder.setEndpoint(endpoint);
        RestAdapter restAdapter=builder.build();

        P002Interface p002Interface= restAdapter.create(P002Interface.class);

        p002Interface.getP002StrongList(new Callback<List<P002Strong>>() {
            @Override
            public void success(List<P002Strong> p002Strongs, Response response) {
                P002ArrayAdapter p002ArrayAdapter=new P002ArrayAdapter(P002Callback.this,
                        p002Strongs);

                setListAdapter(p002ArrayAdapter);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
