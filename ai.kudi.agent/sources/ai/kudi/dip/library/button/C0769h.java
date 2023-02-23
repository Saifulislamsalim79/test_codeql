package ai.kudi.dip.library.button;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.e0.d.l;
import kotlin.p487f0.C11819c;
/* compiled from: KudiSwitch.kt */
/* renamed from: ai.kudi.dip.library.button.h */
/* loaded from: classes2.dex */
public final class C0769h {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final int m38011b(int i) {
        int m10302a;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        l.e(displayMetrics, "getSystem().displayMetrics");
        m10302a = C11819c.m10302a(i * (displayMetrics.densityDpi / 160.0f));
        return m10302a;
    }
}
