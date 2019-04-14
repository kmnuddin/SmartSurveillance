package com.example.smartsurveillance.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.smartsurveillance.R;
import com.example.smartsurveillance.models.MenuItem;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private List<MenuItem> items;
    private Context context;

    public MenuAdapter(List<MenuItem> items, Context context) {
        this.items = items;
        this.context = context;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.menu_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final MenuItem item = items.get(i);

        viewHolder.Item.setText(item.getItem());
        viewHolder.List_Icon.setImageResource(item.getIcon_id());

        viewHolder.Layout_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(item.getIntent());
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView Item;
        public ImageView List_Icon;
        public LinearLayout Layout_item;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Item = (TextView) itemView.findViewById(R.id.item);
            List_Icon = (ImageView) itemView.findViewById(R.id.list_icon);
            Layout_item = (LinearLayout) itemView.findViewById(R.id.item_layout);
        }
    }
}
