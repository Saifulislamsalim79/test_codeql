package com.intercom.composer;

import android.os.Build;
import android.view.Window;
import androidx.core.content.C1335a;
/* loaded from: classes2.dex */
public class WindowUtil {
    public static void setFullscreenWindow(Window window, int i) {
        if (Build.VERSION.SDK_INT > 19) {
            window.getDecorView().setSystemUiVisibility(1280);
            setStatusBarColorRes(window, i);
        }
    }

    private static void setStatusBarColor(Window window, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }

    private static void setStatusBarColorRes(Window window, int i) {
        setStatusBarColor(window, C1335a.m36324d(window.getContext(), i));
    }
}
