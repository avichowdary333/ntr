package in.studyowl.android_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ItemHolder> {

  private ArrayList<String> items;

  public ListAdapter(ArrayList<String> items) {
    this.items = items;
  }

  @Override public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemView =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
    return new ItemHolder(itemView);
  }

  @Override public void onBindViewHolder(ItemHolder holder, int position) {
    String text = items.get(position);
    holder.bind(text);
  }

  @Override public int getItemCount() {
    return items.size();
  }
}
