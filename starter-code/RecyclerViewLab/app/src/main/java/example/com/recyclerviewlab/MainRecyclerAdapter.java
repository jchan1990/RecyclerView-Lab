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
public class MainRecyclerAdapter extends RecyclerView.Adapter<MainViewHolder> {
    ArrayList<MainLayoutObject> objects;


    public MainRecyclerAdapter(ArrayList<MainLayoutObject> objectList) {
        this.objects = objectList;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View newView = inflater.inflate(R.layout.custom_layout, parent, false);

        MainViewHolder vh = new MainViewHolder(newView);

        return vh;
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        final MainLayoutObject newObject = objects.get(position);

        holder.color.setBackgroundColor(Color.parseColor(newObject.getColor()));
        holder.title.setText(newObject.getTitle());
        holder.decription.setText(newObject.getDecription());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), newObject.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }
}
