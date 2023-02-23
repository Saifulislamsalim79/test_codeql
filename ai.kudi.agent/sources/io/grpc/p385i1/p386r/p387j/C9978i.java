package io.grpc.p385i1.p386r.p387j;
/* compiled from: Settings.java */
/* renamed from: io.grpc.i1.r.j.i */
/* loaded from: classes2.dex */
public final class C9978i {

    /* renamed from: a */
    private int f23688a;

    /* renamed from: b */
    private int f23689b;

    /* renamed from: c */
    private int f23690c;

    /* renamed from: d */
    private final int[] f23691d = new int[10];

    /* renamed from: a */
    public int m13386a(int i) {
        return this.f23691d[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m13385b() {
        if ((this.f23688a & 2) != 0) {
            return this.f23691d[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m13384c(int i) {
        return (this.f23688a & 32) != 0 ? this.f23691d[5] : i;
    }

    /* renamed from: d */
    public boolean m13383d(int i) {
        return ((1 << i) & this.f23688a) != 0;
    }

    /* renamed from: e */
    public C9978i m13382e(int i, int i2, int i3) {
        if (i >= this.f23691d.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f23688a |= i4;
        if ((i2 & 1) != 0) {
            this.f23689b |= i4;
        } else {
            this.f23689b &= i4 ^ (-1);
        }
        if ((i2 & 2) != 0) {
            this.f23690c |= i4;
        } else {
            this.f23690c &= i4 ^ (-1);
        }
        this.f23691d[i] = i3;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m13381f() {
        return Integer.bitCount(this.f23688a);
    }
}
