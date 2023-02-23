package p272h.p286c.p287a.p300b.p307d.p316i;

import java.util.Arrays;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.h8 */
/* loaded from: classes2.dex */
class C8622h8 extends C8633i9 {

    /* renamed from: a */
    Object[] f20475a = new Object[4];

    /* renamed from: b */
    int f20476b = 0;

    /* renamed from: c */
    boolean f20477c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8622h8(int i) {
    }

    /* renamed from: b */
    private final void m15961b(int i) {
        Object[] objArr = this.f20475a;
        int length = objArr.length;
        if (length >= i) {
            if (this.f20477c) {
                this.f20475a = (Object[]) objArr.clone();
                this.f20477c = false;
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
        this.f20475a = Arrays.copyOf(objArr, i2);
        this.f20477c = false;
    }

    /* renamed from: a */
    public final C8622h8 m15962a(Object obj) {
        if (obj != null) {
            m15961b(this.f20476b + 1);
            Object[] objArr = this.f20475a;
            int i = this.f20476b;
            this.f20476b = i + 1;
            objArr[i] = obj;
            return this;
        }
        throw null;
    }
}
