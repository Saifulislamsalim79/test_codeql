package okhttp3.internal.http2;

import java.util.Arrays;
/* compiled from: Settings.java */
/* renamed from: okhttp3.internal.http2.l */
/* loaded from: classes3.dex */
public final class C14517l {

    /* renamed from: a */
    private int f32057a;

    /* renamed from: b */
    private final int[] f32058b = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1418a() {
        this.f32057a = 0;
        Arrays.fill(this.f32058b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m1417b(int i) {
        return this.f32058b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m1416c() {
        if ((this.f32057a & 2) != 0) {
            return this.f32058b[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m1415d() {
        if ((this.f32057a & 128) != 0) {
            return this.f32058b[7];
        }
        return 65535;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m1414e(int i) {
        return (this.f32057a & 16) != 0 ? this.f32058b[4] : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m1413f(int i) {
        return (this.f32057a & 32) != 0 ? this.f32058b[5] : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m1412g(int i) {
        return ((1 << i) & this.f32057a) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1411h(C14517l c14517l) {
        for (int i = 0; i < 10; i++) {
            if (c14517l.m1412g(i)) {
                m1410i(i, c14517l.m1417b(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C14517l m1410i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f32058b;
            if (i < iArr.length) {
                this.f32057a = (1 << i) | this.f32057a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m1409j() {
        return Integer.bitCount(this.f32057a);
    }
}
