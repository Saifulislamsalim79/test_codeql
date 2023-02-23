package com.google.android.gms.internal.p104firebaseauthapi;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i1 */
/* loaded from: classes2.dex */
public abstract class AbstractC3227i1 {

    /* renamed from: a */
    final Unsafe f8576a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3227i1(Unsafe unsafe) {
        this.f8576a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo31000a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo30999b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo30998c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo30997d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo30996e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo30995f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo30994g(Object obj, long j);

    /* renamed from: h */
    public final int m30993h(Class<?> cls) {
        return this.f8576a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m30992i(Class<?> cls) {
        return this.f8576a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m30991j(Object obj, long j) {
        return this.f8576a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long m30990k(Object obj, long j) {
        return this.f8576a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long m30989l(Field field) {
        return this.f8576a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m30988m(Object obj, long j) {
        return this.f8576a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void m30987n(Object obj, long j, int i) {
        this.f8576a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void m30986o(Object obj, long j, long j2) {
        this.f8576a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void m30985p(Object obj, long j, Object obj2) {
        this.f8576a.putObject(obj, j, obj2);
    }
}
