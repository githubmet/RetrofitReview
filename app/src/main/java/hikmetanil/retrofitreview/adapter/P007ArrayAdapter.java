package hikmetanil.retrofitreview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import hikmetanil.retrofitreview.R;
import hikmetanil.retrofitreview.model.P007Strong;

public class P007ArrayAdapter extends ArrayAdapter<P007Strong> {

    List<P007Strong> p007StrongList;
    Context context;
    public P007ArrayAdapter(Context context, List<P007Strong> p007StrongList) {
        super(context, R.layout.p007custom_layout ,p007StrongList);
        this.p007StrongList=p007StrongList;
        this.context=context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= layoutInflater.inflate(R.layout.p007custom_layout,parent,false);

        TextView textViewP007= view.findViewById(R.id.textViewP007);
        TextView textView2P007= view.findViewById(R.id.textView2P007);
        TextView textView3P007= view.findViewById(R.id.textView3P007);
        TextView textView4P007= view.findViewById(R.id.textView4P007);
        TextView textView5P007= view.findViewById(R.id.textView5P007);
        TextView textView6P007= view.findViewById(R.id.textView6P007);
        TextView textView7P007= view.findViewById(R.id.textView7P007);

        //textViewP007.setText("User Id="+p007StrongList.get(position));
        //textView2P007.setText("Login="+p007StrongList.get(position).getOwner().get(position).getLogin());
        textView3P007.setText("Repos Id="+p007StrongList.get(position).getId());
        textView4P007.setText("Name="+p007StrongList.get(position).getName());
        textView5P007.setText("Size="+p007StrongList.get(position).getSize());
        textView6P007.setText("Language="+p007StrongList.get(position).getLanguage());
        textView7P007.setText("Created at="+p007StrongList.get(position).getCreated_at());

        return view; //super.getView(position, convertView, parent);
    }
}
