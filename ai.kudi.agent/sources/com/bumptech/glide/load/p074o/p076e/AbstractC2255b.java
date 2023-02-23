package com.bumptech.glide.load.p074o.p076e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.InterfaceC2082q;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.p074o.p078g.C2265c;
import com.bumptech.glide.p086q.C2380j;
/* compiled from: DrawableResource.java */
/* renamed from: com.bumptech.glide.load.o.e.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2255b<T extends Drawable> implements InterfaceC2087u<T>, InterfaceC2082q {

    /* renamed from: c */
    protected final T f6594c;

    public AbstractC2255b(T t) {
        C2380j.m33129d(t);
        this.f6594c = t;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2082q
    /* renamed from: a */
    public void mo33329a() {
        T t = this.f6594c;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C2265c) {
            ((C2265c) t).m33452e().prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: d */
    public final T get() {
        Drawable.ConstantState constantState = this.f6594c.getConstantState();
        if (constantState == null) {
            return this.f6594c;
        }
        return (T) constantState.newDrawable();
    }
}
