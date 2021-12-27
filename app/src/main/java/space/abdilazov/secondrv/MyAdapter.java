package space.abdilazov.secondrv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<Modelka> list;

    public MyAdapter(MainActivity mainActivity, List<Modelka> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Modelka modelka = list.get(position);
        holder.contact.setText(modelka.getContact());
        holder.photo.setImageResource(modelka.getPhoto());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView photo;
        TextView contact;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            photo = itemView.findViewById(R.id.profile);
            contact = itemView.findViewById(R.id.contact);

        }
    }
}
