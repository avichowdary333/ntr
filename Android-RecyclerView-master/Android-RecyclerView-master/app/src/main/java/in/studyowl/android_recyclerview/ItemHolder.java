package in.studyowl.android_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ItemHolder extends RecyclerView.ViewHolder {

  private TextView txtView;

  public ItemHolder(View itemView) {
    super(itemView);
    txtView = (TextView) itemView.findViewById(R.id.txt);
  }

  public void bind(String text) {
    txtView.setText(text);
  }
}
