package hikmetanil.retrofitreview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import hikmetanil.retrofitreview.R;
import hikmetanil.retrofitreview.model.P004Strong;

public class P004ArrayAdapter extends ArrayAdapter<P004Strong> {

    Context context;
    List<P004Strong> p004StrongList;
    public P004ArrayAdapter(Context context, List<P004Strong> p004StrongList) {
        super(context, R.layout.p004custom_layout , p004StrongList);
        this.context=context;
        this.p004StrongList=p004StrongList;
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);

        View view= layoutInflater.inflate(R.layout.p004custom_layout,parent,false);

        TextView textViewP004= view.findViewById(R.id.textViewP004);
        TextView textView2P004= view.findViewById(R.id.textView2P004);
        TextView textView3P004= view.findViewById(R.id.textView3P004);
        TextView textView4P004= view.findViewById(R.id.textView4P004);

        textViewP004.setText(p004StrongList.get(position).getId());
        for(Object gex: p004StrongList.get(position).getFiles().values()){
            textView2P004.setText(((P004Strong.filesDetail)gex).getFilename());
            textView3P004.setText(((P004Strong.filesDetail)gex).getType());
            textView4P004.setText(((P004Strong.filesDetail)gex).getLanguage());
        }
        return view;  //super.getView(position, convertView, parent);
    }
}
