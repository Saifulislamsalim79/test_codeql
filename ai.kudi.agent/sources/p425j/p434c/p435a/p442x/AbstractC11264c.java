package p425j.p434c.p435a.p442x;

import android.text.Spanned;
/* compiled from: LeadingMarginUtils.java */
/* renamed from: j.c.a.x.c */
/* loaded from: classes3.dex */
public abstract class AbstractC11264c {
    /* renamed from: a */
    public static boolean m11269a(int i, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(obj) == i;
    }

    /* renamed from: b */
    public static boolean m11268b(int i, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i;
    }
}
