package com.example.rishad.login;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast {
    //custom toast method
    public void Show_Toast(Context context, View view, String error) {
        //Layout inflater for inflating custom view
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //inflate the layout overview
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) view.findViewById(R.id.toast_root));

        // Get TextView id and set error
        TextView text = layout.findViewById(R.id.toast_error);
        text.setText(error);

        Toast toast = new Toast(context); //Get Toast Context
        toast.setGravity(Gravity.TOP | Gravity.FILL_HORIZONTAL, 0, 0); //set toast gravity and fill horizontal

        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();

    }
}
