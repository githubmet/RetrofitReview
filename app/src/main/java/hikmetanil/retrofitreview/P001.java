package hikmetanil.retrofitreview;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import hikmetanil.retrofitreview.communication.P001Interface;
import hikmetanil.retrofitreview.model.P001Strong;
import retrofit.RestAdapter;

public class P001 extends ListActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().build());  //bunun ne ise yaradigini bilmiyorum

        RestAdapter.Builder builder=new RestAdapter.Builder();
        builder.setEndpoint("https://api.github.com");
        RestAdapter restAdapter= builder.build();

        P001Interface p001Interface= restAdapter.create(P001Interface.class);
        List<P001Strong> p001StrongList= p001Interface.p001StrongList();

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1);
        arrayAdapter.addAll(p001StrongList);

        setListAdapter(arrayAdapter);

    }
}
