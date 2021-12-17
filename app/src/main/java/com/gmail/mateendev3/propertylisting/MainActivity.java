package com.gmail.mateendev3.propertylisting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProductAdAdapter adapter = new ProductAdAdapter(generateData());
        rcMain = findViewById(R.id.rc_main);
        rcMain.setLayoutManager(new LinearLayoutManager(this));
        rcMain.setAdapter(adapter);
    }

    private List<PropertyAd> generateData() {
        List<PropertyAd> propertyAdList = new ArrayList<>();
        propertyAdList.add(new PropertyAd(R.drawable.commercial_plot, "Commercial Plot", "Rs. 32,000/-", "2\nBathrooms", "1\nCar Parking", "3\nBedrooms"));
        propertyAdList.add(new PropertyAd(R.drawable.lush_apartment, "Lush Apartment", "Rs. 48,000/-", "2\nBathrooms", "1\nCar Parking", "3\nBedrooms"));
        propertyAdList.add(new PropertyAd(R.drawable.multi_family, "Multi Family", "Rs. 21,000/-", "2\nBathrooms", "1\nCar Parking", "3\nBedrooms"));
        propertyAdList.add(new PropertyAd(R.drawable.multi_nationa_office, "National Office", "Rs. 90,000/-", "2\nBathrooms", "1\nCar Parking", "3\nBedrooms"));
        propertyAdList.add(new PropertyAd(R.drawable.residential_plot, "Residential Plot", "Rs. 45,000/-", "2\nBathrooms", "1\nCar Parking", "3\nBedrooms"));
        propertyAdList.add(new PropertyAd(R.drawable.residential_villa, "Residential Villa", "Rs. 6,000/-", "2\nBathrooms", "1\nCar Parking", "3\nBedrooms"));
        propertyAdList.add(new PropertyAd(R.drawable.shop_area, "Shop Area", "Rs. 8,000/-", "2\nBathrooms", "1\nCar Parking", "3\nBedrooms"));
        propertyAdList.add(new PropertyAd(R.drawable.single_family, "Family Area", "Rs. 41,000/-", "2\nBathrooms", "1\nCar Parking", "3\nBedrooms"));
        propertyAdList.add(new PropertyAd(R.drawable.studio_plot, "Studio Plot", "Rs. 35,000/-", "2\nBathrooms", "1\nCar Parking", "3\nBedrooms"));

        return propertyAdList;
    }
}