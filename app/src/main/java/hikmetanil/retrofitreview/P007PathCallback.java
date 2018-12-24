package hikmetanil.retrofitreview;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.StrictMode;

import java.util.List;

import hikmetanil.retrofitreview.adapter.P004ArrayAdapter;
import hikmetanil.retrofitreview.adapter.P007ArrayAdapter;
import hikmetanil.retrofitreview.communication.P004Interface;
import hikmetanil.retrofitreview.communication.P007Interface;
import hikmetanil.retrofitreview.model.P004Strong;
import hikmetanil.retrofitreview.model.P007Strong;
import retrofit.Callback;
import retrofit.Endpoint;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class P007PathCallback extends ListActivity {
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
        RestAdapter restAdapter= builder.build();

        P007Interface p007Interface= restAdapter.create(P007Interface.class);
        p007Interface.getP007StrongCallBackList("githubmet", new Callback<List<P007Strong>>() {
            @Override
            public void success(List<P007Strong> p007Strongs, Response response) {
                P007ArrayAdapter p007ArrayAdapter=new P007ArrayAdapter(P007PathCallback.this,p007Strongs);
                setListAdapter(p007ArrayAdapter);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
