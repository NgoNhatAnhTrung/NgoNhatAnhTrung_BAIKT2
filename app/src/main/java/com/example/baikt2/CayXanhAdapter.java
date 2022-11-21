package com.example.baikt2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CayXanhAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<CayXanh> casiList;

    public CayXanhAdapter(Context context, int layout, List<CayXanh> casiList) {
        this.context = context;
        this.layout = layout;
        this.cayxanhList = cayxanhList;
    }

    @Override
    public int getCount() {
        return cayxanhList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTenKhoaHoc, txtTenThuongGoi, txtDacTinh, txtMauLa;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            holder = new ViewHolder();

            //anh xa view
            holder.txtTenKhoaHoc = (TextView) view.findViewById(R.id.textviewTenKhoaHoc);
            holder.txtTenThuongGoi = (TextView) view.findViewById(R.id.textviewTenThuongGoi);
            holder.txtDacTinh = (TextView) view.findViewById(R.id.textviewDacTinh);
            holder.txtMauLa = (TextView) view.findViewById(R.id.textviewMauLa);
            holder.imgHinh= (ImageView) view.findViewById(R.id.imageviewHinh);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        // gan gia tri
        TenKhoaHoc tenkhoahoc = tenkhoahocList.get(i);

        holder.txtTenKhoaHoc.setText(tenkhoahoc.getTenKhoaHoc());
        holder.txtTenThuongGoi.setText(tenthuonggoi.getTenThuongGoi());
        holder.txtDacTinh.setText(dactinh.getDacTinh());
        holder.txtMauLa.setText(maula.getMauLa());
        holder.imgHinh.setImageResource(tenkhoahoc.getHinh());

        return view;
    }
}
