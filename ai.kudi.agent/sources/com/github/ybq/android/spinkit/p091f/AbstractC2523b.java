package com.github.ybq.android.spinkit.p091f;

import android.util.Property;
/* compiled from: FloatProperty.java */
/* renamed from: com.github.ybq.android.spinkit.f.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2523b<T> extends Property<T, Float> {
    public AbstractC2523b(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public final void set(T t, Float f) {
        mo32604b(t, f.floatValue());
    }

    /* renamed from: b */
    public abstract void mo32604b(T t, float f);
}
