package com.gmail.mateendev3.propertylisting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final List<PropertyAd> propertyAdList;

    public ProductAdAdapter(List<PropertyAd> propertyAdList) {
        this.propertyAdList = propertyAdList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (viewType == 0) {
            rootView = inflater.inflate(R.layout.rc_row, parent, false);
            return new ProductAdViewHolder(rootView);
        } else {
            rootView = inflater.inflate(R.layout.rc_row_reverse, parent, false);
            return new ProductAdViewHolderN(rootView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PropertyAd ad = propertyAdList.get(position);

        if (holder instanceof ProductAdViewHolder) {
            ((ProductAdViewHolder) holder).getIvPropertyImage().setImageResource(ad.getPropertyImageResId());
            ((ProductAdViewHolder) holder).getTvPropertyTitle().setText(ad.getPropertyTitle());
            ((ProductAdViewHolder) holder).getTvPropertyPrice().setText(ad.getPropertyPrice());
            ((ProductAdViewHolder) holder).getTvBathrooms().setText(ad.getBathrooms());
            ((ProductAdViewHolder) holder).getTvCarParking().setText(ad.getCarParking());
            ((ProductAdViewHolder) holder).getTvBedrooms().setText(ad.getBedrooms());
        } else {
            ((ProductAdViewHolderN) holder).getIvPropertyImage().setImageResource(ad.getPropertyImageResId());
            ((ProductAdViewHolderN) holder).getTvPropertyTitle().setText(ad.getPropertyTitle());
            ((ProductAdViewHolderN) holder).getTvBathrooms().setText(ad.getBathrooms());
            ((ProductAdViewHolderN) holder).getTvCarParking().setText(ad.getCarParking());
            ((ProductAdViewHolderN) holder).getTvBedrooms().setText(ad.getBedrooms());
        }
    }

    @Override
    public int getItemCount() {
        return propertyAdList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    public static class ProductAdViewHolder extends RecyclerView.ViewHolder {
        private final ImageView ivPropertyImage;
        private final TextView tvPropertyTitle;
        private final TextView tvPropertyPrice;
        private final TextView tvBathrooms;
        private final TextView tvCarParking;
        private final TextView tvBedrooms;


        public ProductAdViewHolder(@NonNull View itemView) {
            super(itemView);

            ivPropertyImage = itemView.findViewById(R.id.iv_property_image);
            tvPropertyTitle = itemView.findViewById(R.id.tv_property_title);
            tvPropertyPrice = itemView.findViewById(R.id.tv_price);
            tvBathrooms = itemView.findViewById(R.id.tv_bathrooms);
            tvCarParking = itemView.findViewById(R.id.tv_car_parking);
            tvBedrooms = itemView.findViewById(R.id.tv_bedrooms);
        }

        public ImageView getIvPropertyImage() {
            return ivPropertyImage;
        }

        public TextView getTvPropertyTitle() {
            return tvPropertyTitle;
        }

        public TextView getTvPropertyPrice() {
            return tvPropertyPrice;
        }

        public TextView getTvBathrooms() {
            return tvBathrooms;
        }

        public TextView getTvCarParking() {
            return tvCarParking;
        }

        public TextView getTvBedrooms() {
            return tvBedrooms;
        }
    }

    public static class ProductAdViewHolderN extends RecyclerView.ViewHolder {
        private final ImageView ivPropertyImage;
        private final TextView tvPropertyTitle;
        private final TextView tvBathrooms;
        private final TextView tvCarParking;
        private final TextView tvBedrooms;


        public ProductAdViewHolderN(@NonNull View itemView) {
            super(itemView);

            ivPropertyImage = itemView.findViewById(R.id.iv_property_image);
            tvPropertyTitle = itemView.findViewById(R.id.tv_property_title);
            tvBathrooms = itemView.findViewById(R.id.tv_bathrooms);
            tvCarParking = itemView.findViewById(R.id.tv_car_parking);
            tvBedrooms = itemView.findViewById(R.id.tv_bedrooms);
        }

        public ImageView getIvPropertyImage() {
            return ivPropertyImage;
        }

        public TextView getTvPropertyTitle() {
            return tvPropertyTitle;
        }

        public TextView getTvBathrooms() {
            return tvBathrooms;
        }

        public TextView getTvCarParking() {
            return tvCarParking;
        }

        public TextView getTvBedrooms() {
            return tvBedrooms;
        }
    }
}
