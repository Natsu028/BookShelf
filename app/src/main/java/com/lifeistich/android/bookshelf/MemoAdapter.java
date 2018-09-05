package com.lifeistich.android.bookshelf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kodakanatsumi on 2018/07/20.
 */

public class MemoAdapter extends ArrayAdapter<Memo>{
    public LayoutInflater layoutInflater;

    MemoAdapter(Context context, int textViewResulfId, List<Memo> objects){
        super(context, textViewResulfId, objects);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Memo memo = getItem(position);

        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.layout_item_memo, null);
        }

        TextView titleText = (TextView) convertView.findViewById(R.id.titleEditText);

        titleText.setText(memo.bookname);

        return convertView;
    }



}
