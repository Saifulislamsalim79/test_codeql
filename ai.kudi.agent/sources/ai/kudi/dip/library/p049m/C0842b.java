package ai.kudi.dip.library.p049m;

import android.view.View;
import android.view.ViewGroup;
import kotlin.e0.d.l;
/* compiled from: ViewUtils.kt */
/* renamed from: ai.kudi.dip.library.m.b */
/* loaded from: classes2.dex */
public final class C0842b {
    /* renamed from: a */
    public static final void m37884a(View view, int i, int i2, int i3, int i4) {
        l.f(view, "view");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, i2, i3, i4);
                view.requestLayout();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
