package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p201g.p202a.C7461j;
import p201g.p202a.p209o.AbstractC7485b;
/* compiled from: ActionBar.java */
/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes2.dex */
public abstract class AbstractC0925a {

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC0927b {
        /* renamed from: a */
        void m37801a(boolean z);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0928c {
        /* renamed from: a */
        public abstract CharSequence m37800a();

        /* renamed from: b */
        public abstract View m37799b();

        /* renamed from: c */
        public abstract Drawable m37798c();

        /* renamed from: d */
        public abstract CharSequence m37797d();

        /* renamed from: e */
        public abstract void m37796e();
    }

    /* renamed from: A */
    public abstract void mo37633A(Drawable drawable);

    /* renamed from: B */
    public abstract void mo37632B(boolean z);

    /* renamed from: C */
    public abstract void mo37631C(CharSequence charSequence);

    /* renamed from: D */
    public abstract void mo37630D(CharSequence charSequence);

    /* renamed from: E */
    public abstract void mo37629E();

    /* renamed from: F */
    public AbstractC7485b mo37628F(AbstractC7485b.InterfaceC7486a interfaceC7486a) {
        return null;
    }

    /* renamed from: g */
    public boolean mo37646g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo37611h();

    /* renamed from: i */
    public abstract void mo37610i(boolean z);

    /* renamed from: j */
    public abstract int mo37609j();

    /* renamed from: k */
    public abstract Context mo37608k();

    /* renamed from: l */
    public abstract void mo37607l();

    /* renamed from: m */
    public boolean mo37645m() {
        return false;
    }

    /* renamed from: n */
    public void mo37606n(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo37644o() {
    }

    /* renamed from: p */
    public abstract boolean mo37605p(int i, KeyEvent keyEvent);

    /* renamed from: q */
    public boolean mo37643q(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: r */
    public boolean mo37642r() {
        return false;
    }

    /* renamed from: s */
    public abstract void mo37604s(Drawable drawable);

    /* renamed from: t */
    public abstract void mo37603t(boolean z);

    /* renamed from: u */
    public abstract void mo37602u(boolean z);

    /* renamed from: v */
    public abstract void mo37601v(boolean z);

    /* renamed from: w */
    public abstract void mo37600w(boolean z);

    /* renamed from: x */
    public abstract void mo37599x(float f);

    /* renamed from: y */
    public abstract void mo37598y(int i);

    /* renamed from: z */
    public abstract void mo37597z(int i);

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes2.dex */
    public static class C0926a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2538a;

        public C0926a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2538a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7461j.ActionBarLayout);
            this.f2538a = obtainStyledAttributes.getInt(C7461j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0926a(int i, int i2) {
            super(i, i2);
            this.f2538a = 0;
            this.f2538a = 8388627;
        }

        public C0926a(C0926a c0926a) {
            super((ViewGroup.MarginLayoutParams) c0926a);
            this.f2538a = 0;
            this.f2538a = c0926a.f2538a;
        }

        public C0926a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2538a = 0;
        }
    }
}
