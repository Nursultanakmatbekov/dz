package com.example.dz3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ListOfLanguagesAdapter extends RecyclerView.Adapter<ListOfLanguagesAdapter.NameViewHolder>{

    private List<String> listOfLanguages;
    public void setData(List<String> listOfLanguages){
        this.listOfLanguages = listOfLanguages;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_languages,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.onBind(listOfLanguages.get(position));
    }

    @Override
    public int getItemCount() {
        return listOfLanguages.size();
    }

    public class NameViewHolder extends RecyclerView.ViewHolder{

        private TextView tvLanguages;

        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLanguages = itemView.findViewById(R.id.tv_languages);
        }

        public void onBind(String languages) {
            tvLanguages.setText(languages);
        }
    }
}
