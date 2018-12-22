package hikmetanil.retrofitreview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import hikmetanil.retrofitreview.R;
import hikmetanil.retrofitreview.model.P005Strong;

public class P005ArrayAdapter extends ArrayAdapter<P005Strong.itemsDetail> {

    List<P005Strong.itemsDetail> itemsDetailList;
    Context context;
    public P005ArrayAdapter(Context context, List<P005Strong.itemsDetail> itemsDetailList) {
        super(context, R.layout.p005custom_layout ,itemsDetailList);
        this.context=context;
        this.itemsDetailList=itemsDetailList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= layoutInflater.inflate(R.layout.p005custom_layout,parent,false);

        TextView textViewP005=  view.findViewById(R.id.textViewP005);
        TextView textView2P005=  view.findViewById(R.id.textView2P005);
        TextView textView3P005=  view.findViewById(R.id.textView3P005);

        textViewP005.setText("Id="+itemsDetailList.get(position).getId());
        textView2P005.setText("Login="+itemsDetailList.get(position).getLogin());
        textView3P005.setText("Score="+itemsDetailList.get(position).getScore());
        return view; //super.getView(position, convertView, parent);
    }
}
