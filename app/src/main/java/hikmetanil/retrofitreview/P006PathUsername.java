package hikmetanil.retrofitreview;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;

import hikmetanil.retrofitreview.communication.P006Interface;
import hikmetanil.retrofitreview.model.P006Strong;
import retrofit.Endpoint;
import retrofit.RestAdapter;

public class P006PathUsername extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p006path_username);


        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().build());
        TextView textViewP006= findViewById(R.id.textViewP006);
        TextView textView2P006= findViewById(R.id.textView2P006);
        TextView textView3P006= findViewById(R.id.textView3P006);
        TextView textView4P006= findViewById(R.id.textView4P006);
        TextView textView5P006= findViewById(R.id.textView5P006);
        TextView textView6P006= findViewById(R.id.textView6P006);
        TextView textView7P006= findViewById(R.id.textView7P006);





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
        P006Interface p006Interface= restAdapter.create(P006Interface.class);
        P006Strong p006Strong= p006Interface.getP006Strong("githubmet");

        textViewP006.setText("Login="+p006Strong.getLogin());
        textView2P006.setText("Name="+p006Strong.getName());
        textView3P006.setText("Location="+p006Strong.getLocation());
        textView4P006.setText("Created at="+p006Strong.getCreated_at());
        textView5P006.setText("Repos="+p006Strong.getPublic_repos());
        textView6P006.setText("Followers="+p006Strong.getFollowers());
        textView7P006.setText("Following="+p006Strong.getFollowing());

    }
}
