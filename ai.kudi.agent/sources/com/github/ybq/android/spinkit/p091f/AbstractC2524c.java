package com.github.ybq.android.spinkit.p091f;

import android.util.Property;
/* compiled from: IntProperty.java */
/* renamed from: com.github.ybq.android.spinkit.f.c */
/* loaded from: classes2.dex */
public abstract class AbstractC2524c<T> extends Property<T, Integer> {
    public AbstractC2524c(String str) {
        super(Integer.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public final void set(T t, Integer num) {
        mo32613b(t, num.intValue());
    }

    /* renamed from: b */
    public abstract void mo32613b(T t, int i);
}
