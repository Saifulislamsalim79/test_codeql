package p272h.p286c.p287a.p323c.p342z;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
/* compiled from: MaterialAttributes.java */
/* renamed from: h.c.a.c.z.b */
/* loaded from: classes2.dex */
public class C9320b {
    /* renamed from: a */
    public static TypedValue m15057a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m15056b(Context context, int i, boolean z) {
        TypedValue m15057a = m15057a(context, i);
        return (m15057a == null || m15057a.type != 18) ? z : m15057a.data != 0;
    }

    /* renamed from: c */
    public static int m15055c(Context context, int i, String str) {
        TypedValue m15057a = m15057a(context, i);
        if (m15057a != null) {
            return m15057a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static int m15054d(View view, int i) {
        return m15055c(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
