package hikmetanil.retrofitreview;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;

import hikmetanil.retrofitreview.communication.P003Interface;
import hikmetanil.retrofitreview.model.P003Strong;
import retrofit.Endpoint;
import retrofit.RestAdapter;

public class P003Mojombo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().build());
        TextView textView=new TextView(this);
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

        P003Interface p003Interface= restAdapter.create(P003Interface.class);
        P003Strong p003Strong= p003Interface.getP003Strong();

        String login=p003Strong.getLogin();
        String id=p003Strong.getId();
        String url=p003Strong.getUrl();
        String name=p003Strong.getName();
        String location=p003Strong.getLocation();
        String followers=p003Strong.getFollowers();
        String following=p003Strong.getFollowing();

        textView.setText("Login="+login+"\nId="+id+"\nUrl="+url+"\nName="+name+
                "\nLocation="+location+ "\nFollowers="+followers+"\nFollowing="+following);
        setContentView(textView);
    }
}
