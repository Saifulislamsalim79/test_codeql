package kotlin.p557z.p558b1;

import java.util.Arrays;
import kotlin.e0.d.l;
/* compiled from: ListBuilder.kt */
/* renamed from: kotlin.z.b1.b */
/* loaded from: classes3.dex */
public final class C13676b {
    /* renamed from: a */
    public static final <E> E[] m4216a(int i) {
        if (i >= 0) {
            return (E[]) new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: b */
    public static final <T> T[] m4215b(T[] tArr, int i) {
        l.f(tArr, "$this$copyOfUninitializedElements");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        l.e(tArr2, "java.util.Arrays.copyOf(this, newSize)");
        if (tArr2 != null) {
            return tArr2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: c */
    public static final <E> void m4214c(E[] eArr, int i) {
        l.f(eArr, "$this$resetAt");
        eArr[i] = null;
    }

    /* renamed from: d */
    public static final <E> void m4213d(E[] eArr, int i, int i2) {
        l.f(eArr, "$this$resetRange");
        while (i < i2) {
            m4214c(eArr, i);
            i++;
        }
    }
}
