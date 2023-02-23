package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.wa */
/* loaded from: classes2.dex */
public abstract class AbstractC4054wa {

    /* renamed from: a */
    final Unsafe f9826a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4054wa(Unsafe unsafe) {
        this.f9826a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo28689a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo28688b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo28687c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo28686d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo28685e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo28684f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo28683g(Object obj, long j);

    /* renamed from: h */
    public final int m28682h(Class<?> cls) {
        return this.f9826a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m28681i(Class<?> cls) {
        return this.f9826a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m28680j(Object obj, long j) {
        return this.f9826a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long m28679k(Object obj, long j) {
        return this.f9826a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long m28678l(Field field) {
        return this.f9826a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m28677m(Object obj, long j) {
        return this.f9826a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void m28676n(Object obj, long j, int i) {
        this.f9826a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void m28675o(Object obj, long j, long j2) {
        this.f9826a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void m28674p(Object obj, long j, Object obj2) {
        this.f9826a.putObject(obj, j, obj2);
    }
}
