package com.example.giorgi.horizontalrecyclerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.giorgi.horizontalrecyclerview.R;
import com.example.giorgi.horizontalrecyclerview.custom.Person;

import java.util.ArrayList;

/**
 * Created by giorgi on 8/5/2016.
 */
public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private ArrayList<Person> personList;

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPerson;
        TextView tvName;
        TextView tvSurName;

        PersonViewHolder(View itemView) {
            super(itemView);
            ivPerson = (ImageView) itemView.findViewById(R.id.ivPerson);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvSurName = (TextView) itemView.findViewById(R.id.tvSurName);
        }

    }

    public PersonAdapter(ArrayList<Person> personList) {
        this.personList = personList;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int i) {
        holder.tvName.setText(personList.get(i).getName());
        holder.tvSurName.setText(personList.get(i).getLastName());
        holder.ivPerson.setImageResource(personList.get(i).getImageId());
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_person, viewGroup, false);
        PersonViewHolder holder = new PersonViewHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}
