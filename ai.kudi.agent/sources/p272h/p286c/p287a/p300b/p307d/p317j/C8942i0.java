package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.i0 */
/* loaded from: classes2.dex */
class C8942i0 extends C8957j0 {

    /* renamed from: a */
    Object[] f20993a = new Object[4];

    /* renamed from: b */
    int f20994b = 0;

    /* renamed from: c */
    boolean f20995c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8942i0(int i) {
    }

    /* renamed from: b */
    private final void m15700b(int i) {
        Object[] objArr = this.f20993a;
        int length = objArr.length;
        if (length >= i) {
            if (this.f20995c) {
                this.f20993a = (Object[]) objArr.clone();
                this.f20995c = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            i2 = highestOneBit + highestOneBit;
        }
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.f20993a = Arrays.copyOf(objArr, i2);
        this.f20995c = false;
    }

    /* renamed from: a */
    public final C8942i0 m15701a(Object obj) {
        if (obj != null) {
            m15700b(this.f20994b + 1);
            Object[] objArr = this.f20993a;
            int i = this.f20994b;
            this.f20994b = i + 1;
            objArr[i] = obj;
            return this;
        }
        throw null;
    }
}
