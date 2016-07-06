package example.com.recyclerviewlab;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Qube on 7/6/16.
 */
public class SecondaryRecyclerAdapter extends RecyclerView.Adapter<SecondaryViewHolder> {

    ArrayList<SecondaryLayoutObject> objects;


    public SecondaryRecyclerAdapter(ArrayList<SecondaryLayoutObject> objectList) {
        this.objects = objectList;
    }

    @Override
    public SecondaryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View newView = inflater.inflate(R.layout.custom_layout_with_checkbox, parent, false);

        SecondaryViewHolder vh = new SecondaryViewHolder(newView);

        return vh;
    }

    @Override
    public void onBindViewHolder(final SecondaryViewHolder holder, final int position) {
        final SecondaryLayoutObject newObject = objects.get(position);

        holder.color.setBackgroundColor(Color.parseColor(newObject.getColor()));
        holder.title.setText(newObject.getTitle());
        holder.decription.setText(newObject.getDecription());
        holder.box.setChecked(newObject.isChecked());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.box.isChecked()) {
                    Toast.makeText(view.getContext(), "Check box changed to UNCHECKED", Toast.LENGTH_SHORT).show();
                    holder.box.setChecked(false);
                    objects.get(position).setChecked(false);
                } else {
                    Toast.makeText(view.getContext(), "Check box changed to CHECKED", Toast.LENGTH_SHORT).show();
                    holder.box.setChecked(true);
                    objects.get(position).setChecked(true);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }
}
