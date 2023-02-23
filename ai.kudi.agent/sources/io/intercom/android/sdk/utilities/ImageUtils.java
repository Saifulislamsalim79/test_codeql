package io.intercom.android.sdk.utilities;

import android.text.TextUtils;
import io.intercom.com.bumptech.glide.load.engine.AbstractC10544i;
/* loaded from: classes3.dex */
public class ImageUtils {
    public static int getAspectHeight(int i, double d) {
        double d2 = i;
        Double.isNaN(d2);
        return (int) (d2 * d);
    }

    public static double getAspectRatio(int i, int i2) {
        double d = i2;
        Double.isNaN(d);
        double d2 = i;
        Double.isNaN(d2);
        double d3 = (d * 1.0d) / d2;
        if (Double.isNaN(d3)) {
            return 0.0d;
        }
        return d3;
    }

    public static AbstractC10544i getDiskCacheStrategy(String str) {
        return isGif(str) ? AbstractC10544i.f24237b : AbstractC10544i.f24238c;
    }

    public static boolean isGif(String str) {
        return !TextUtils.isEmpty(str) && str.endsWith(".gif");
    }
}
