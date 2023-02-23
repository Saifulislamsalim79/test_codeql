package p425j.p434c.p435a;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import p425j.p434c.p435a.p436u.C11209a;
/* compiled from: Markwon.java */
/* renamed from: j.c.a.e */
/* loaded from: classes3.dex */
public abstract class AbstractC11178e {

    /* compiled from: Markwon.java */
    /* renamed from: j.c.a.e$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC11179a {
        /* renamed from: a */
        InterfaceC11179a mo11444a(InterfaceC11187i interfaceC11187i);

        AbstractC11178e build();
    }

    /* compiled from: Markwon.java */
    /* renamed from: j.c.a.e$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC11180b {
        /* renamed from: a */
        void m11445a(TextView textView, Spanned spanned, TextView.BufferType bufferType, Runnable runnable);
    }

    /* renamed from: a */
    public static InterfaceC11179a m11447a(Context context) {
        C11181f c11181f = new C11181f(context);
        c11181f.mo11444a(C11209a.m11356r());
        return c11181f;
    }

    /* renamed from: b */
    public static AbstractC11178e m11446b(Context context) {
        InterfaceC11179a m11447a = m11447a(context);
        m11447a.mo11444a(C11209a.m11356r());
        return m11447a.build();
    }

    /* renamed from: c */
    public abstract void mo11429c(TextView textView, String str);
}
