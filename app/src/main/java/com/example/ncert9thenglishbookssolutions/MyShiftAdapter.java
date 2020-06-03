package com.example.ncert9thenglishbookssolutions;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MyShiftAdapter extends FirestoreRecyclerAdapter<document, MyShiftAdapter.MyViewHolder> {
    private static final int ITEM_TYPE_DATA = 1;
    private static final int ITEM_TYPE_BANNER_AD = 0;
    private InterstitialAd interstitialAd;


    public MyShiftAdapter(@NonNull FirestoreRecyclerOptions<document> options) {
        super(options);
    }


    @Override
    protected void onBindViewHolder(@NonNull final MyViewHolder holder, int position, @NonNull document model) {
        holder.setIsRecyclable(false);

        if (getItemViewType(position)== ITEM_TYPE_DATA)
        {

            holder.mName.setText(model.getName());
            holder.mlink.setText(model.getLink());
            holder.mName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View v) {


                    interstitialAd = new InterstitialAd(v.getContext());
                    interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");

                    requestinteradd();

                    interstitialAd.loadAd(new AdRequest.Builder().build());
                    interstitialAd.setAdListener(new AdListener()
                                                 {
                                                     @Override
                                                     public void onAdClosed() {
                                                         super.onAdClosed();
                                                         Intent intent1 = new Intent(v.getContext(), DownloadActivity.class);
                                                         v.getContext().startActivity(intent1);

                                                     }
                                                 }

                    );
                    if(interstitialAd.isLoaded()){
                        interstitialAd.show();
                    }
                    else {
                        Intent i = new Intent(v.getContext(), DownloadActivity.class);


                        String link = holder.mlink.getText().toString();
                        String name = holder.mName.getText().toString();

                        Bundle b = new Bundle();

                        i.putExtra("name", name);
                        i.putExtra("link", link);


                        i.putExtras(b);

                        v.getContext().startActivity(i);
                    }
                }
            });
        }
        else{


        }




    }





    //View holder for items
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName;
        TextView mlink;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            if (!(itemView instanceof AdView)) {

                mName = itemView.findViewById(R.id.name);
                mlink = itemView.findViewById(R.id.link);

                mlink.setVisibility(View.INVISIBLE);
            }else{
            }
        }
    }




    //Banner Ad View Holder
    public class MyAdViewHolder extends RecyclerView.ViewHolder
    {
        MyAdViewHolder(View itemView)
        {
            super(itemView);
        }
    }



    @Override
    public int getItemViewType(int position)
    {
        if (position % 11 == 0)
            return ITEM_TYPE_BANNER_AD;
        return ITEM_TYPE_DATA;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        AdView adview;


        if (viewType == ITEM_TYPE_BANNER_AD) {
            adview = new AdView(parent.getContext());
            adview.setAdSize( AdSize.BANNER);
            //Inflate ad banner container
            View bannerLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner_ad, parent, false);


            //Create View Holder
            MyAdViewHolder myAdViewHolder = new MyAdViewHolder(bannerLayoutView);
            adview.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

            float density = parent.getResources().getDisplayMetrics().density;
            int height = Math.round(AdSize.BANNER.getHeight() * density);
            AbsListView.LayoutParams params = new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, height);
            adview.setLayoutParams(params);


            AdRequest request = new AdRequest.Builder().build();
            adview.loadAd(request);
            return new MyViewHolder (adview);

        }else{
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
            return new MyViewHolder(v);
        }

    }

    public void requestinteradd()

    {

        interstitialAd.loadAd(new AdRequest.Builder().build());
    }

}
