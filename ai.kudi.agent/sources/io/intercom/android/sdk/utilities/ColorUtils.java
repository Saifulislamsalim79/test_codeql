package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.identity.AppConfig;
/* loaded from: classes3.dex */
public class ColorUtils {
    private static int darkColorRes() {
        return C10110R.color.intercom_black_50;
    }

    public static int darkenColor(int i) {
        Color.colorToHSV(i, r0);
        float[] fArr = {0.0f, 0.0f, fArr[2] * 0.79f};
        return Color.HSVToColor(fArr);
    }

    public static int lightenColor(int i) {
        return Color.argb(Color.alpha(i), (Color.red(i) + 255) / 2, (Color.green(i) + 255) / 2, (Color.blue(i) + 255) / 2);
    }

    public static ColorFilter newGreyscaleFilter() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    private static int primaryOrBlackColor(Context context, AppConfig appConfig) {
        return appConfig.primaryColorRenderDarkText() ? C1335a.m36324d(context, C10110R.color.intercom_black) : appConfig.getPrimaryColor();
    }

    public static int primaryOrDarkColor(Context context, AppConfig appConfig) {
        return appConfig.primaryColorRenderDarkText() ? C1335a.m36324d(context, darkColorRes()) : appConfig.getPrimaryColor();
    }

    public static void setImageColorWhiteOrBlack(ImageView imageView, boolean z) {
        imageView.setColorFilter(whiteOrBlackColor(imageView.getContext(), z));
    }

    public static void setImageSrcColorWhiteOrDark(ImageView imageView, boolean z) {
        imageView.getDrawable().setColorFilter(C1335a.m36324d(imageView.getContext(), z ? darkColorRes() : C10110R.color.intercom_white), PorterDuff.Mode.SRC_IN);
    }

    public static void setTextColorPrimaryOrBlack(TextView textView, AppConfig appConfig) {
        int primaryOrBlackColor = primaryOrBlackColor(textView.getContext(), appConfig);
        textView.setTextColor(primaryOrBlackColor);
        textView.setLinkTextColor(primaryOrBlackColor);
    }

    public static void setTextColorPrimaryOrDark(TextView textView, AppConfig appConfig) {
        int primaryOrDarkColor = primaryOrDarkColor(textView.getContext(), appConfig);
        textView.setTextColor(primaryOrDarkColor);
        textView.setLinkTextColor(primaryOrDarkColor);
    }

    public static void setTextColorWhiteOrBlack(TextView textView, boolean z) {
        int whiteOrBlackColor = whiteOrBlackColor(textView.getContext(), z);
        textView.setTextColor(whiteOrBlackColor);
        textView.setLinkTextColor(whiteOrBlackColor);
    }

    public static void setTextColorWhiteOrDark(TextView textView, boolean z) {
        int whiteOrDarkColor = whiteOrDarkColor(textView.getContext(), z);
        textView.setTextColor(whiteOrDarkColor);
        textView.setLinkTextColor(whiteOrDarkColor);
    }

    public static void updateInnerBorderColor(AppConfig appConfig, View view) {
        int primaryColor = appConfig.getPrimaryColor();
        LayerDrawable layerDrawable = (LayerDrawable) C1335a.m36322f(view.getContext(), C10110R.C10111drawable.intercom_conversation_card_with_top_border);
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(C10110R.C10112id.top_border);
        findDrawableByLayerId.setAlpha(127);
        findDrawableByLayerId.setColorFilter(primaryColor, PorterDuff.Mode.SRC_IN);
        BackgroundUtils.setBackground(view, layerDrawable);
    }

    public static int whiteOrBlackColor(Context context, boolean z) {
        return C1335a.m36324d(context, z ? C10110R.color.intercom_black : C10110R.color.intercom_white);
    }

    public static int whiteOrDarkColor(Context context, boolean z) {
        if (z) {
            return C1335a.m36324d(context, darkColorRes());
        }
        return C1335a.m36324d(context, C10110R.color.intercom_white);
    }
}
