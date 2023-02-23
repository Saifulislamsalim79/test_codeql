package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
/* compiled from: TooltipCompat.java */
/* renamed from: androidx.appcompat.widget.t0 */
/* loaded from: classes2.dex */
public class C1155t0 {
    /* renamed from: a */
    public static void m36986a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            View$OnLongClickListenerC1157u0.m36978f(view, charSequence);
        }
    }
}
