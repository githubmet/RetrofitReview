package hikmetanil.retrofitreview;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

import hikmetanil.retrofitreview.adapter.P005ArrayAdapter;
import hikmetanil.retrofitreview.communication.P005Interface;
import hikmetanil.retrofitreview.model.P005Strong;
import retrofit.Endpoint;
import retrofit.RestAdapter;

public class P005QueryqString extends Activity {
    EditText editTextP005;
    ListView listViewP005;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p005query_q_string);

        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().build());
        editTextP005= findViewById(R.id.editTextP005);
        listViewP005= findViewById(R.id.listViewP005);



    }

    public void onClickMtdP005(View view) {
        String userName=editTextP005.getText().toString();

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
        P005Interface p005Interface= restAdapter.create(P005Interface.class);

        P005Strong p005Strong= p005Interface.getP005Strong(userName);

        List<P005Strong.itemsDetail> itemsDetailList= p005Strong.getItems();

        ArrayAdapter arrayAdapter=new P005ArrayAdapter(this,itemsDetailList);
        listViewP005.setAdapter(arrayAdapter);


    }
}
