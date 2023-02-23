package kotlinx.coroutines.internal;

import kotlin.p557z.C13712m;
/* compiled from: ArrayQueue.kt */
/* renamed from: kotlinx.coroutines.internal.a */
/* loaded from: classes3.dex */
public class C13868a<T> {

    /* renamed from: a */
    private Object[] f30337a = new Object[16];

    /* renamed from: b */
    private int f30338b;

    /* renamed from: c */
    private int f30339c;

    /* renamed from: b */
    private final void m3561b() {
        Object[] objArr = this.f30337a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        C13712m.m4064g(objArr, objArr2, 0, this.f30338b, 0, 10, null);
        Object[] objArr3 = this.f30337a;
        int length2 = objArr3.length;
        int i = this.f30338b;
        C13712m.m4064g(objArr3, objArr2, length2 - i, 0, i, 4, null);
        this.f30337a = objArr2;
        this.f30338b = 0;
        this.f30339c = length;
    }

    /* renamed from: a */
    public final void m3562a(T t) {
        Object[] objArr = this.f30337a;
        int i = this.f30339c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f30339c = length;
        if (length == this.f30338b) {
            m3561b();
        }
    }

    /* renamed from: c */
    public final boolean m3560c() {
        return this.f30338b == this.f30339c;
    }

    /* renamed from: d */
    public final T m3559d() {
        int i = this.f30338b;
        if (i == this.f30339c) {
            return null;
        }
        Object[] objArr = this.f30337a;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.f30338b = (i + 1) & (objArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
