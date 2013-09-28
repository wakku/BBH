package hackathon.bbh;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {
	 
    private ArrayList<Items> listData;
    private LayoutInflater layoutInflater;
 
    public CustomListAdapter(Context context, ArrayList<Items> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
    }
 
    @Override
    public int getCount() {
        return listData.size();
    }
 
    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }
 
    @Override
    public long getItemId(int position) {
        return position;
    }
 
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_row_layout, null);
            holder = new ViewHolder();
            holder.item_description = (TextView) convertView.findViewById(R.id.item_description);
            holder.item_category = (TextView) convertView.findViewById(R.id.item_category);
            holder.item_user = (TextView) convertView.findViewById(R.id.item_user);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
 
        holder.item_description.setText((listData.get(position)).getDescription());
        holder.item_category.setText(listData.get(position).getCategory());
        holder.item_user.setText(listData.get(position).getuID());
 
        return convertView;
    }
 
    static class ViewHolder {
        TextView item_description;
        TextView item_category;
        TextView item_user;
    }
 
}