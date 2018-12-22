package hikmetanil.retrofitreview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import hikmetanil.retrofitreview.R;
import hikmetanil.retrofitreview.model.P002Strong;

public class P002ArrayAdapter extends ArrayAdapter<P002Strong> {

    Context context;
    List<P002Strong> p002StrongsList;
    public P002ArrayAdapter(Context context, List<P002Strong> p002StrongList) {
        super(context, R.layout.p002custom_layout,p002StrongList);
        this.context=context;
        this.p002StrongsList=p002StrongList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= layoutInflater.inflate(R.layout.p002custom_layout,parent,false);
        TextView textView= view.findViewById(R.id.textViewP002);
        TextView textView2= view.findViewById(R.id.textView2P002);
        TextView textView3= view.findViewById(R.id.textView3P002);

        textView.setText(p002StrongsList.get(position).getId());
        textView2.setText(p002StrongsList.get(position).getCreated_at());
        textView3.setText(p002StrongsList.get(position).getDescription());

        return view; //super.getView(position, convertView, parent);
    }
}
