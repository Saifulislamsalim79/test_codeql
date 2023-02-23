package androidx.recyclerview.widget;

import android.view.View;
/* compiled from: ViewBoundsCheck.java */
/* renamed from: androidx.recyclerview.widget.b0 */
/* loaded from: classes2.dex */
class C1673b0 {

    /* renamed from: a */
    final InterfaceC1675b f5137a;

    /* renamed from: b */
    C1674a f5138b = new C1674a();

    /* compiled from: ViewBoundsCheck.java */
    /* renamed from: androidx.recyclerview.widget.b0$a */
    /* loaded from: classes2.dex */
    static class C1674a {

        /* renamed from: a */
        int f5139a = 0;

        /* renamed from: b */
        int f5140b;

        /* renamed from: c */
        int f5141c;

        /* renamed from: d */
        int f5142d;

        /* renamed from: e */
        int f5143e;

        C1674a() {
        }

        /* renamed from: a */
        void m34860a(int i) {
            this.f5139a = i | this.f5139a;
        }

        /* renamed from: b */
        boolean m34859b() {
            int i = this.f5139a;
            if ((i & 7) == 0 || (i & (m34858c(this.f5142d, this.f5140b) << 0)) != 0) {
                int i2 = this.f5139a;
                if ((i2 & 112) == 0 || (i2 & (m34858c(this.f5142d, this.f5141c) << 4)) != 0) {
                    int i3 = this.f5139a;
                    if ((i3 & 1792) == 0 || (i3 & (m34858c(this.f5143e, this.f5140b) << 8)) != 0) {
                        int i4 = this.f5139a;
                        return (i4 & 28672) == 0 || (i4 & (m34858c(this.f5143e, this.f5141c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* renamed from: c */
        int m34858c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        void m34857d() {
            this.f5139a = 0;
        }

        /* renamed from: e */
        void m34856e(int i, int i2, int i3, int i4) {
            this.f5140b = i;
            this.f5141c = i2;
            this.f5142d = i3;
            this.f5143e = i4;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    /* renamed from: androidx.recyclerview.widget.b0$b */
    /* loaded from: classes2.dex */
    interface InterfaceC1675b {
        /* renamed from: a */
        int mo34855a(View view);

        /* renamed from: b */
        int mo34854b();

        /* renamed from: c */
        int mo34853c();

        /* renamed from: d */
        int mo34852d(View view);

        /* renamed from: p */
        View mo34851p(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1673b0(InterfaceC1675b interfaceC1675b) {
        this.f5137a = interfaceC1675b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m34862a(int i, int i2, int i3, int i4) {
        int mo34854b = this.f5137a.mo34854b();
        int mo34853c = this.f5137a.mo34853c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View mo34851p = this.f5137a.mo34851p(i);
            this.f5138b.m34856e(mo34854b, mo34853c, this.f5137a.mo34855a(mo34851p), this.f5137a.mo34852d(mo34851p));
            if (i3 != 0) {
                this.f5138b.m34857d();
                this.f5138b.m34860a(i3);
                if (this.f5138b.m34859b()) {
                    return mo34851p;
                }
            }
            if (i4 != 0) {
                this.f5138b.m34857d();
                this.f5138b.m34860a(i4);
                if (this.f5138b.m34859b()) {
                    view = mo34851p;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m34861b(View view, int i) {
        this.f5138b.m34856e(this.f5137a.mo34854b(), this.f5137a.mo34853c(), this.f5137a.mo34855a(view), this.f5137a.mo34852d(view));
        if (i != 0) {
            this.f5138b.m34857d();
            this.f5138b.m34860a(i);
            return this.f5138b.m34859b();
        }
        return false;
    }
}
