package com.example.testapi.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

import com.example.testapi.R;


/**
 * doannd ==> ok
 *
 * common loading
 */
public class LoadingDialog {
    private static LoadingDialog loadingDialog = null;
    private Dialog dialog;

    public static LoadingDialog getInstance() {
        if (loadingDialog == null) {
            loadingDialog = new LoadingDialog();
        }
        return loadingDialog;
    }

    public void showLoading(Context context) {
        dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.common_loading_view);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }

        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }

    public void hideLoading() {
        if (dialog != null) {
            dialog.dismiss();
            dialog = null;
        }
    }
}
