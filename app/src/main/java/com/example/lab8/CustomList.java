package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CustomList extends ArrayAdapter<City> {

    private static ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.cities = cities;
        this.context = context;

    }
    public List< City > getCities() {
        List < City >  list = cities;
        Collections.sort(list);
        return list;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    public int getCount(){
        return cities.size();
    }

    public void addCity(City city){
        this.cities.add(city);

    }

    public boolean hasCity(City city){
        /**
         * When given a city, return whether or not it belongs in the list
         */

        if (cities.contains(city)){
            return true;
        }
        return false;
    }
    public void delete(City city){
        /**
         * Check if a city is present in the list. If it does then remove it from the list, if not then throw an exception
         */

        if (hasCity(city)){
            cities.remove(city);

        }

    }
    public int countCities(){
        /**
         * Return how many cities are in the list
         */
        int i = cities.size();
        return i;

    }


}
