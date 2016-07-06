package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SecondaryActivity extends AppCompatActivity {
    RecyclerView secondaryRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        secondaryRecycler = (RecyclerView) findViewById(R.id.secondaryRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        secondaryRecycler.setLayoutManager(layoutManager);

        ArrayList<SecondaryLayoutObject> objects = new ArrayList<>();
        objects.add(new SecondaryLayoutObject("#000000", "Title 1", "Description 1", false));
        objects.add(new SecondaryLayoutObject("#FF0000", "Title 2", "Description 2", false));
        objects.add(new SecondaryLayoutObject("#00FF00", "Title 3", "Description 3", true));
        objects.add(new SecondaryLayoutObject("#0000FF", "Title 4", "Description 4", false));
        objects.add(new SecondaryLayoutObject("#FFFF00", "Title 5", "Description 5", false));
        objects.add(new SecondaryLayoutObject("#FF00FF", "Title 6", "Description 6", false));
        objects.add(new SecondaryLayoutObject("#00FFFF", "Title 7", "Description 7", false));
        objects.add(new SecondaryLayoutObject("#F0F0F0", "Title 8", "Description 8", true));
        objects.add(new SecondaryLayoutObject("#0F0F0F", "Title 9", "Description 9", false));
        objects.add(new SecondaryLayoutObject("#0FFFF0", "Title 10", "Description 10", false));

        SecondaryRecyclerAdapter adapter = new SecondaryRecyclerAdapter(objects);

        secondaryRecycler.setAdapter(adapter);


    }

}
