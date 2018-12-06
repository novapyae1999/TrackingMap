package e.msi.trackingmap;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class ListOnlineViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView txtEmail;
    itemClickListener  mItemClickListener;
    public ListOnlineViewHolder(View itemView)
    {
        super(itemView);
        txtEmail = (TextView)itemView.findViewById(R.id.txt_email);
    }

    public void setmItemClickListener(itemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    @Override
    public void onClick(View view) {
        mItemClickListener.onClick(view, getAdapterPosition());
    }
}
