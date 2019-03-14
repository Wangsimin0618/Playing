package com.bwie.playing;

import android.content.Context;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * date: 2019/3/14.
 * Created 王思敏
 * function:
 */
public class ToastUtil {
    public static void ToastWithImage(Context context, int imgID, String message) {
        Toast toast = Toast.makeText(context.getApplicationContext(),
                message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        if (imgID != 0) {
            LinearLayout toastView = (LinearLayout) toast.getView();
            ImageView imageCodeProject = new ImageView(context.getApplicationContext());
            imageCodeProject.setImageResource(imgID);
            toastView.addView(imageCodeProject, 0);
        }
        toast.show();
    }
}
