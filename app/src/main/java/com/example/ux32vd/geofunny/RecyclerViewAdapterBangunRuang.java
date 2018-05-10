package com.example.ux32vd.geofunny;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapterBangunRuang extends RecyclerView.Adapter<RecyclerViewAdapterBangunRuang.MyViewHolder> {

    private Context mContext;
    private List<DeklarasiMenuBangunDatar> mData;


    public RecyclerViewAdapterBangunRuang (Context mContext, List<DeklarasiMenuBangunDatar> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.judul_menu.setText(mData.get(position).getNama());
        holder.img_menu_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //deklarasi intent setiap perhitungan bangun ruang
                Intent intent = new Intent(mContext,RecyclerViewBangunDatar.class);
                if (position == 0){
                    intent.putExtra("NamaBangun", "kubus");
                }else if(position == 1){
                    intent.putExtra("NamaBangun", "balok");
                }else if(position == 2){
                    intent.putExtra("NamaBangun", "limas");
                }else if(position == 3){
                    intent.putExtra("NamaBangun", "prisma");
                }else if(position == 4){
                    intent.putExtra("NamaBangun", "tabung");
                }else if(position == 5){
                    intent.putExtra("NamaBangun", "bola");
                }else if(position == 6){
                    intent.putExtra("NamaBangun", "kerucut");
                }


                //memberi data ke GunActivity
                intent.putExtra ("Type",mData.get(position).getNama());
                intent.putExtra ("Description",mData.get(position).getDeskripsi());
                intent.putExtra ("Rumus",mData.get(position).getRumus());
                intent.putExtra ("Thumbnail",mData.get(position).getThumbnail());
                //memulai activity
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView judul_menu;
        ImageView img_menu_thumbnail;
        CardView cardView ;

        public MyViewHolder(View itemView) {
            super(itemView);

            judul_menu = (TextView) itemView.findViewById(R.id.id_nama_menu);
            img_menu_thumbnail = (ImageView) itemView.findViewById(R.id.id_foto_menu);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);

        }
    }

}
