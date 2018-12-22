package hikmetanil.retrofitreview;

import android.app.ListActivity;
import android.os.Bundle;

import java.util.List;

import hikmetanil.retrofitreview.adapter.P004ArrayAdapter;
import hikmetanil.retrofitreview.communication.P004Interface;
import hikmetanil.retrofitreview.model.P004Strong;
import retrofit.Callback;
import retrofit.Endpoint;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class P004BirTikJson extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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


        P004Interface p004Interface= restAdapter.create(P004Interface.class);

        p004Interface.getP004StrongList(new Callback<List<P004Strong>>() {
            @Override
            public void success(List<P004Strong> p004Strongs, Response response) {
                P004ArrayAdapter p004ArrayAdapter=new P004ArrayAdapter(P004BirTikJson.this,
                        p004Strongs);
                setListAdapter(p004ArrayAdapter);
            }
            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
