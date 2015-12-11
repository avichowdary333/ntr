package in.studyowl.android_recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    recyclerView.setLayoutManager(new LinearLayoutManager(this))  ;

    ArrayList<String> data = getData();
    ListAdapter adapter = new ListAdapter(data);
    recyclerView.setAdapter(adapter);
  }

  public ArrayList<String> getData() {
    ArrayList<String> data = new ArrayList<>();
    data.add("one");
    data.add("two");
    data.add("three");
    data.add("four");
    data.add("five");
    data.add("six");
    data.add("seven");
    data.add("eight");
    data.add("nine");
    data.add("ten");
    data.add("eleven");
    data.add("twelve");
    return data;
  }
}
