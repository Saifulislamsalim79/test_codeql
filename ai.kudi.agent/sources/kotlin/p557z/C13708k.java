package kotlin.p557z;

import java.lang.reflect.Array;
import kotlin.e0.d.l;
/* compiled from: ArraysJVM.kt */
/* renamed from: kotlin.z.k */
/* loaded from: classes3.dex */
class C13708k {
    /* renamed from: a */
    public static final <T> T[] m4073a(T[] tArr, int i) {
        l.f(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        if (newInstance != null) {
            return (T[]) ((Object[]) newInstance);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: b */
    public static final void m4072b(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }
}
