package ke.co.facebookdevcircle.eldoret.vdarasa;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DashBoardItemAdapter extends RecyclerView.Adapter<DashBoardItemAdapter.myViewHolder> {

private Context context;
private List<DashBoardItem> myItem;

    public DashBoardItemAdapter(Context context, List<DashBoardItem> myItem) {
        this.context = context;
        this.myItem = myItem;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
     View view;
     LayoutInflater layoutInflater= LayoutInflater.from(context);
     view=layoutInflater.inflate(R.layout.dashboarditem,parent,false);

        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        holder.textView.setText(myItem.get(position).getItem());
        holder.imageView.setImageResource(myItem.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return myItem.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;
        public myViewHolder(View view){
            super(view);
            textView=(TextView)itemView.findViewById(R.id.dashboard_item_id);
            imageView=(ImageView)itemView.findViewById(R.id.dashboard_img_id);
        }
    }

}