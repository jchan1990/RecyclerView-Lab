package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Qube on 7/6/16.
 */
public class MainViewHolder extends RecyclerView.ViewHolder {

        TextView color, title, decription;
        RelativeLayout relativeLayout;


        public MainViewHolder(View itemView) {
            super(itemView);

            color = (TextView) itemView.findViewById(R.id.mainColorTV);
            title = (TextView) itemView.findViewById(R.id.mainTitleTV);
            decription = (TextView) itemView.findViewById(R.id.mainDescriptionTV);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.mainRelative);

    }
}
