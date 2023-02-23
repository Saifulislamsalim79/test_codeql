package kotlin.p491i0;

import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Ranges.kt */
/* renamed from: kotlin.i0.h */
/* loaded from: classes3.dex */
public class C11841h extends C11840g {
    /* renamed from: a */
    public static int m10271a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: b */
    public static long m10270b(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: c */
    public static float m10269c(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* renamed from: d */
    public static int m10268d(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: e */
    public static long m10267e(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: f */
    public static int m10266f(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: g */
    public static int m10265g(int i, InterfaceC11833b<Integer> interfaceC11833b) {
        l.f(interfaceC11833b, "range");
        if (interfaceC11833b instanceof InterfaceC11832a) {
            return ((Number) m10264h(Integer.valueOf(i), (InterfaceC11832a) interfaceC11833b)).intValue();
        }
        if (!interfaceC11833b.isEmpty()) {
            return i < interfaceC11833b.mo10283h().intValue() ? interfaceC11833b.mo10283h().intValue() : i > interfaceC11833b.mo10282k().intValue() ? interfaceC11833b.mo10282k().intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC11833b + '.');
    }

    /* renamed from: h */
    public static final <T extends Comparable<? super T>> T m10264h(T t, InterfaceC11832a<T> interfaceC11832a) {
        l.f(t, "$this$coerceIn");
        l.f(interfaceC11832a, "range");
        if (!interfaceC11832a.isEmpty()) {
            return (!interfaceC11832a.m10293e(t, interfaceC11832a.mo10283h()) || interfaceC11832a.m10293e(interfaceC11832a.mo10283h(), t)) ? (!interfaceC11832a.m10293e(interfaceC11832a.mo10282k(), t) || interfaceC11832a.m10293e(t, interfaceC11832a.mo10282k())) ? t : interfaceC11832a.mo10282k() : interfaceC11832a.mo10283h();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC11832a + '.');
    }

    /* renamed from: i */
    public static C11834c m10263i(int i, int i2) {
        return C11834c.f26513f.m10288a(i, i2, -1);
    }

    /* renamed from: j */
    public static C11837e m10262j(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C11837e.f26522x.m10281a();
        }
        return new C11837e(i, i2 - 1);
    }
}
