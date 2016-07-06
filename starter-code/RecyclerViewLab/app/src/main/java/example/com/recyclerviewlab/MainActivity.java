package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecycler = (RecyclerView) findViewById(R.id.mainRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager
                (this, LinearLayoutManager.VERTICAL, false);
        mainRecycler.setLayoutManager(layoutManager);

        ArrayList<MainLayoutObject> objects = new ArrayList<>();
        objects.add(new MainLayoutObject("#000000", "Title 1", "Description 1"));
        objects.add(new MainLayoutObject("#FF0000", "Title 2", "Description 2"));
        objects.add(new MainLayoutObject("#00FF00", "Title 3", "Description 3"));
        objects.add(new MainLayoutObject("#0000FF", "Title 4", "Description 4"));
        objects.add(new MainLayoutObject("#FFFF00", "Title 5", "Description 5"));
        objects.add(new MainLayoutObject("#FF00FF", "Title 6", "Description 6"));
        objects.add(new MainLayoutObject("#00FFFF", "Title 7", "Description 7"));
        objects.add(new MainLayoutObject("#F0F0F0", "Title 8", "Description 8"));
        objects.add(new MainLayoutObject("#0F0F0F", "Title 9", "Description 9"));
        objects.add(new MainLayoutObject("#0FFFF0", "Title 10", "Description 10"));

        MainRecyclerAdapter adapter = new MainRecyclerAdapter(objects);

        mainRecycler.setAdapter(adapter);

    }
}
