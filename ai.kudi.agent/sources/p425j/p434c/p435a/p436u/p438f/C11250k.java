package p425j.p434c.p435a.p436u.p438f;

import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* compiled from: TextViewSpan.java */
/* renamed from: j.c.a.u.f.k */
/* loaded from: classes3.dex */
public class C11250k {
    public C11250k(TextView textView) {
        new WeakReference(textView);
    }

    /* renamed from: a */
    public static void m11277a(Spannable spannable, TextView textView) {
        C11250k[] c11250kArr = (C11250k[]) spannable.getSpans(0, spannable.length(), C11250k.class);
        if (c11250kArr != null) {
            for (C11250k c11250k : c11250kArr) {
                spannable.removeSpan(c11250k);
            }
        }
        spannable.setSpan(new C11250k(textView), 0, spannable.length(), 18);
    }
}
