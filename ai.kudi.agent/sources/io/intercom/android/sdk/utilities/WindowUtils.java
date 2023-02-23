package io.intercom.android.sdk.utilities;

import android.content.res.Resources;
import android.os.Build;
/* loaded from: classes3.dex */
public class WindowUtils {
    public static int getStatusBarHeight(Resources resources) {
        int identifier;
        if (Build.VERSION.SDK_INT >= 19 && (identifier = resources.getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
