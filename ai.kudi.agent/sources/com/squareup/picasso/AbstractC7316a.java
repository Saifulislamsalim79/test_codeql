package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.C7360t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Action.java */
/* renamed from: com.squareup.picasso.a */
/* loaded from: classes2.dex */
public abstract class AbstractC7316a<T> {

    /* renamed from: a */
    final C7360t f17293a;

    /* renamed from: b */
    final C7373w f17294b;

    /* renamed from: c */
    final WeakReference<T> f17295c;

    /* renamed from: d */
    final boolean f17296d;

    /* renamed from: e */
    final int f17297e;

    /* renamed from: f */
    final int f17298f;

    /* renamed from: g */
    final int f17299g;

    /* renamed from: h */
    final Drawable f17300h;

    /* renamed from: i */
    final String f17301i;

    /* renamed from: j */
    final Object f17302j;

    /* renamed from: k */
    boolean f17303k;

    /* renamed from: l */
    boolean f17304l;

    /* compiled from: Action.java */
    /* renamed from: com.squareup.picasso.a$a */
    /* loaded from: classes2.dex */
    static class C7317a<M> extends WeakReference<M> {

        /* renamed from: a */
        final AbstractC7316a f17305a;

        C7317a(AbstractC7316a abstractC7316a, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f17305a = abstractC7316a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC7316a(C7360t c7360t, T t, C7373w c7373w, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.f17293a = c7360t;
        this.f17294b = c7373w;
        this.f17295c = t == null ? null : new C7317a(this, t, c7360t.f17441k);
        this.f17297e = i;
        this.f17298f = i2;
        this.f17296d = z;
        this.f17299g = i3;
        this.f17300h = drawable;
        this.f17301i = str;
        this.f17302j = obj == null ? this : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18908a() {
        this.f17304l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo18907b(Bitmap bitmap, C7360t.EnumC7366e enumC7366e);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo18906c(Exception exc);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m19008d() {
        return this.f17301i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m19007e() {
        return this.f17297e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m19006f() {
        return this.f17298f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C7360t m19005g() {
        return this.f17293a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C7360t.EnumC7367f m19004h() {
        return this.f17294b.f17498t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C7373w m19003i() {
        return this.f17294b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Object m19002j() {
        return this.f17302j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public T m19001k() {
        WeakReference<T> weakReference = this.f17295c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m19000l() {
        return this.f17304l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m18999m() {
        return this.f17303k;
    }
}
