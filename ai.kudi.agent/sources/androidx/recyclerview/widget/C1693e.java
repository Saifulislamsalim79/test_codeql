package androidx.recyclerview.widget;
/* compiled from: BatchingListUpdateCallback.java */
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes2.dex */
public class C1693e implements InterfaceC1738r {

    /* renamed from: a */
    final InterfaceC1738r f5184a;

    /* renamed from: b */
    int f5185b = 0;

    /* renamed from: c */
    int f5186c = -1;

    /* renamed from: d */
    int f5187d = -1;

    /* renamed from: e */
    Object f5188e = null;

    public C1693e(InterfaceC1738r interfaceC1738r) {
        this.f5184a = interfaceC1738r;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1738r
    /* renamed from: a */
    public void mo17098a(int i, int i2) {
        int i3;
        if (this.f5185b == 1 && i >= (i3 = this.f5186c)) {
            int i4 = this.f5187d;
            if (i <= i3 + i4) {
                this.f5187d = i4 + i2;
                this.f5186c = Math.min(i, i3);
                return;
            }
        }
        m34811e();
        this.f5186c = i;
        this.f5187d = i2;
        this.f5185b = 1;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1738r
    /* renamed from: b */
    public void mo17097b(int i, int i2) {
        int i3;
        if (this.f5185b == 2 && (i3 = this.f5186c) >= i && i3 <= i + i2) {
            this.f5187d += i2;
            this.f5186c = i;
            return;
        }
        m34811e();
        this.f5186c = i;
        this.f5187d = i2;
        this.f5185b = 2;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1738r
    /* renamed from: c */
    public void mo17096c(int i, int i2) {
        m34811e();
        this.f5184a.mo17096c(i, i2);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1738r
    /* renamed from: d */
    public void mo17095d(int i, int i2, Object obj) {
        int i3;
        if (this.f5185b == 3) {
            int i4 = this.f5186c;
            int i5 = this.f5187d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f5188e == obj) {
                this.f5186c = Math.min(i, i4);
                this.f5187d = Math.max(i5 + i4, i3) - this.f5186c;
                return;
            }
        }
        m34811e();
        this.f5186c = i;
        this.f5187d = i2;
        this.f5188e = obj;
        this.f5185b = 3;
    }

    /* renamed from: e */
    public void m34811e() {
        int i = this.f5185b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f5184a.mo17098a(this.f5186c, this.f5187d);
        } else if (i == 2) {
            this.f5184a.mo17097b(this.f5186c, this.f5187d);
        } else if (i == 3) {
            this.f5184a.mo17095d(this.f5186c, this.f5187d, this.f5188e);
        }
        this.f5188e = null;
        this.f5185b = 0;
    }
}
