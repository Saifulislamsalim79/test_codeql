package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1742t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p237k.C7673f;
import p201g.p227h.p237k.InterfaceC7672e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdapterHelper.java */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes2.dex */
public final class C1661a implements C1742t.InterfaceC1743a {

    /* renamed from: a */
    private InterfaceC7672e<C1663b> f5119a;

    /* renamed from: b */
    final ArrayList<C1663b> f5120b;

    /* renamed from: c */
    final ArrayList<C1663b> f5121c;

    /* renamed from: d */
    final InterfaceC1662a f5122d;

    /* renamed from: e */
    Runnable f5123e;

    /* renamed from: f */
    final boolean f5124f;

    /* renamed from: g */
    final C1742t f5125g;

    /* renamed from: h */
    private int f5126h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1662a {
        /* renamed from: a */
        void mo34874a(int i, int i2);

        /* renamed from: b */
        void mo34873b(C1663b c1663b);

        /* renamed from: c */
        void mo34872c(int i, int i2, Object obj);

        /* renamed from: d */
        void mo34871d(C1663b c1663b);

        /* renamed from: e */
        RecyclerView.AbstractC1620e0 mo34870e(int i);

        /* renamed from: f */
        void mo34869f(int i, int i2);

        /* renamed from: g */
        void mo34868g(int i, int i2);

        /* renamed from: h */
        void mo34867h(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes2.dex */
    public static final class C1663b {

        /* renamed from: a */
        int f5127a;

        /* renamed from: b */
        int f5128b;

        /* renamed from: c */
        Object f5129c;

        /* renamed from: d */
        int f5130d;

        C1663b(int i, int i2, int i3, Object obj) {
            this.f5127a = i;
            this.f5128b = i2;
            this.f5130d = i3;
            this.f5129c = obj;
        }

        /* renamed from: a */
        String m34866a() {
            int i = this.f5127a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1663b) {
                C1663b c1663b = (C1663b) obj;
                int i = this.f5127a;
                if (i != c1663b.f5127a) {
                    return false;
                }
                if (i == 8 && Math.abs(this.f5130d - this.f5128b) == 1 && this.f5130d == c1663b.f5128b && this.f5128b == c1663b.f5130d) {
                    return true;
                }
                if (this.f5130d == c1663b.f5130d && this.f5128b == c1663b.f5128b) {
                    Object obj2 = this.f5129c;
                    if (obj2 != null) {
                        if (!obj2.equals(c1663b.f5129c)) {
                            return false;
                        }
                    } else if (c1663b.f5129c != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f5127a * 31) + this.f5128b) * 31) + this.f5130d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m34866a() + ",s:" + this.f5128b + "c:" + this.f5130d + ",p:" + this.f5129c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1661a(InterfaceC1662a interfaceC1662a) {
        this(interfaceC1662a, false);
    }

    /* renamed from: c */
    private void m34898c(C1663b c1663b) {
        m34879v(c1663b);
    }

    /* renamed from: d */
    private void m34897d(C1663b c1663b) {
        m34879v(c1663b);
    }

    /* renamed from: f */
    private void m34895f(C1663b c1663b) {
        boolean z;
        char c;
        int i = c1663b.f5128b;
        int i2 = c1663b.f5130d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f5122d.mo34870e(i3) != null || m34893h(i3)) {
                if (c2 == 0) {
                    m34890k(mo34621b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m34879v(mo34621b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != c1663b.f5130d) {
            mo34622a(c1663b);
            c1663b = mo34621b(2, i, i4, null);
        }
        if (c2 == 0) {
            m34890k(c1663b);
        } else {
            m34879v(c1663b);
        }
    }

    /* renamed from: g */
    private void m34894g(C1663b c1663b) {
        int i = c1663b.f5128b;
        int i2 = c1663b.f5130d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f5122d.mo34870e(i) != null || m34893h(i)) {
                if (c == 0) {
                    m34890k(mo34621b(4, i3, i4, c1663b.f5129c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m34879v(mo34621b(4, i3, i4, c1663b.f5129c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != c1663b.f5130d) {
            Object obj = c1663b.f5129c;
            mo34622a(c1663b);
            c1663b = mo34621b(4, i3, i4, obj);
        }
        if (c == 0) {
            m34890k(c1663b);
        } else {
            m34879v(c1663b);
        }
    }

    /* renamed from: h */
    private boolean m34893h(int i) {
        int size = this.f5121c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1663b c1663b = this.f5121c.get(i2);
            int i3 = c1663b.f5127a;
            if (i3 == 8) {
                if (m34887n(c1663b.f5130d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c1663b.f5128b;
                int i5 = c1663b.f5130d + i4;
                while (i4 < i5) {
                    if (m34887n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m34890k(C1663b c1663b) {
        int i;
        int i2 = c1663b.f5127a;
        if (i2 != 1 && i2 != 8) {
            int m34875z = m34875z(c1663b.f5128b, i2);
            int i3 = c1663b.f5128b;
            int i4 = c1663b.f5127a;
            if (i4 == 2) {
                i = 0;
            } else if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c1663b);
            } else {
                i = 1;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < c1663b.f5130d; i6++) {
                int m34875z2 = m34875z(c1663b.f5128b + (i * i6), c1663b.f5127a);
                int i7 = c1663b.f5127a;
                if (i7 == 2 ? m34875z2 == m34875z : i7 == 4 && m34875z2 == m34875z + 1) {
                    i5++;
                } else {
                    C1663b mo34621b = mo34621b(c1663b.f5127a, m34875z, i5, c1663b.f5129c);
                    m34889l(mo34621b, i3);
                    mo34622a(mo34621b);
                    if (c1663b.f5127a == 4) {
                        i3 += i5;
                    }
                    m34875z = m34875z2;
                    i5 = 1;
                }
            }
            Object obj = c1663b.f5129c;
            mo34622a(c1663b);
            if (i5 > 0) {
                C1663b mo34621b2 = mo34621b(c1663b.f5127a, m34875z, i5, obj);
                m34889l(mo34621b2, i3);
                mo34622a(mo34621b2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    /* renamed from: v */
    private void m34879v(C1663b c1663b) {
        this.f5121c.add(c1663b);
        int i = c1663b.f5127a;
        if (i == 1) {
            this.f5122d.mo34868g(c1663b.f5128b, c1663b.f5130d);
        } else if (i == 2) {
            this.f5122d.mo34869f(c1663b.f5128b, c1663b.f5130d);
        } else if (i == 4) {
            this.f5122d.mo34872c(c1663b.f5128b, c1663b.f5130d, c1663b.f5129c);
        } else if (i == 8) {
            this.f5122d.mo34874a(c1663b.f5128b, c1663b.f5130d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c1663b);
        }
    }

    /* renamed from: z */
    private int m34875z(int i, int i2) {
        for (int size = this.f5121c.size() - 1; size >= 0; size--) {
            C1663b c1663b = this.f5121c.get(size);
            int i3 = c1663b.f5127a;
            if (i3 == 8) {
                int i4 = c1663b.f5128b;
                int i5 = c1663b.f5130d;
                if (i4 >= i5) {
                    i5 = i4;
                    i4 = i5;
                }
                if (i >= i4 && i <= i5) {
                    int i6 = c1663b.f5128b;
                    if (i4 == i6) {
                        if (i2 == 1) {
                            c1663b.f5130d++;
                        } else if (i2 == 2) {
                            c1663b.f5130d--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            c1663b.f5128b = i6 + 1;
                        } else if (i2 == 2) {
                            c1663b.f5128b = i6 - 1;
                        }
                        i--;
                    }
                } else {
                    int i7 = c1663b.f5128b;
                    if (i < i7) {
                        if (i2 == 1) {
                            c1663b.f5128b = i7 + 1;
                            c1663b.f5130d++;
                        } else if (i2 == 2) {
                            c1663b.f5128b = i7 - 1;
                            c1663b.f5130d--;
                        }
                    }
                }
            } else {
                int i8 = c1663b.f5128b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= c1663b.f5130d;
                    } else if (i3 == 2) {
                        i += c1663b.f5130d;
                    }
                } else if (i2 == 1) {
                    c1663b.f5128b = i8 + 1;
                } else if (i2 == 2) {
                    c1663b.f5128b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f5121c.size() - 1; size2 >= 0; size2--) {
            C1663b c1663b2 = this.f5121c.get(size2);
            if (c1663b2.f5127a == 8) {
                int i9 = c1663b2.f5130d;
                if (i9 == c1663b2.f5128b || i9 < 0) {
                    this.f5121c.remove(size2);
                    mo34622a(c1663b2);
                }
            } else if (c1663b2.f5130d <= 0) {
                this.f5121c.remove(size2);
                mo34622a(c1663b2);
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.C1742t.InterfaceC1743a
    /* renamed from: a */
    public void mo34622a(C1663b c1663b) {
        if (this.f5124f) {
            return;
        }
        c1663b.f5129c = null;
        this.f5119a.mo11983a(c1663b);
    }

    @Override // androidx.recyclerview.widget.C1742t.InterfaceC1743a
    /* renamed from: b */
    public C1663b mo34621b(int i, int i2, int i3, Object obj) {
        C1663b mo11982b = this.f5119a.mo11982b();
        if (mo11982b == null) {
            return new C1663b(i, i2, i3, obj);
        }
        mo11982b.f5127a = i;
        mo11982b.f5128b = i2;
        mo11982b.f5130d = i3;
        mo11982b.f5129c = obj;
        return mo11982b;
    }

    /* renamed from: e */
    public int m34896e(int i) {
        int size = this.f5120b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1663b c1663b = this.f5120b.get(i2);
            int i3 = c1663b.f5127a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c1663b.f5128b;
                    if (i4 <= i) {
                        int i5 = c1663b.f5130d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c1663b.f5128b;
                    if (i6 == i) {
                        i = c1663b.f5130d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c1663b.f5130d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c1663b.f5128b <= i) {
                i += c1663b.f5130d;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m34892i() {
        int size = this.f5121c.size();
        for (int i = 0; i < size; i++) {
            this.f5122d.mo34871d(this.f5121c.get(i));
        }
        m34877x(this.f5121c);
        this.f5126h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m34891j() {
        m34892i();
        int size = this.f5120b.size();
        for (int i = 0; i < size; i++) {
            C1663b c1663b = this.f5120b.get(i);
            int i2 = c1663b.f5127a;
            if (i2 == 1) {
                this.f5122d.mo34871d(c1663b);
                this.f5122d.mo34868g(c1663b.f5128b, c1663b.f5130d);
            } else if (i2 == 2) {
                this.f5122d.mo34871d(c1663b);
                this.f5122d.mo34867h(c1663b.f5128b, c1663b.f5130d);
            } else if (i2 == 4) {
                this.f5122d.mo34871d(c1663b);
                this.f5122d.mo34872c(c1663b.f5128b, c1663b.f5130d, c1663b.f5129c);
            } else if (i2 == 8) {
                this.f5122d.mo34871d(c1663b);
                this.f5122d.mo34874a(c1663b.f5128b, c1663b.f5130d);
            }
            Runnable runnable = this.f5123e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m34877x(this.f5120b);
        this.f5126h = 0;
    }

    /* renamed from: l */
    void m34889l(C1663b c1663b, int i) {
        this.f5122d.mo34873b(c1663b);
        int i2 = c1663b.f5127a;
        if (i2 == 2) {
            this.f5122d.mo34867h(i, c1663b.f5130d);
        } else if (i2 == 4) {
            this.f5122d.mo34872c(i, c1663b.f5130d, c1663b.f5129c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m34888m(int i) {
        return m34887n(i, 0);
    }

    /* renamed from: n */
    int m34887n(int i, int i2) {
        int size = this.f5121c.size();
        while (i2 < size) {
            C1663b c1663b = this.f5121c.get(i2);
            int i3 = c1663b.f5127a;
            if (i3 == 8) {
                int i4 = c1663b.f5128b;
                if (i4 == i) {
                    i = c1663b.f5130d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c1663b.f5130d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c1663b.f5128b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c1663b.f5130d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c1663b.f5130d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m34886o(int i) {
        return (i & this.f5126h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m34885p() {
        return this.f5120b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m34884q() {
        return (this.f5121c.isEmpty() || this.f5120b.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m34883r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f5120b.add(mo34621b(4, i, i2, obj));
        this.f5126h |= 4;
        return this.f5120b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m34882s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f5120b.add(mo34621b(1, i, i2, null));
        this.f5126h |= 1;
        return this.f5120b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m34881t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f5120b.add(mo34621b(8, i, i2, null));
            this.f5126h |= 8;
            return this.f5120b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m34880u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f5120b.add(mo34621b(2, i, i2, null));
        this.f5126h |= 2;
        return this.f5120b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m34878w() {
        this.f5125g.m34627b(this.f5120b);
        int size = this.f5120b.size();
        for (int i = 0; i < size; i++) {
            C1663b c1663b = this.f5120b.get(i);
            int i2 = c1663b.f5127a;
            if (i2 == 1) {
                m34898c(c1663b);
            } else if (i2 == 2) {
                m34895f(c1663b);
            } else if (i2 == 4) {
                m34894g(c1663b);
            } else if (i2 == 8) {
                m34897d(c1663b);
            }
            Runnable runnable = this.f5123e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f5120b.clear();
    }

    /* renamed from: x */
    void m34877x(List<C1663b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo34622a(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m34876y() {
        m34877x(this.f5120b);
        m34877x(this.f5121c);
        this.f5126h = 0;
    }

    C1661a(InterfaceC1662a interfaceC1662a, boolean z) {
        this.f5119a = new C7673f(30);
        this.f5120b = new ArrayList<>();
        this.f5121c = new ArrayList<>();
        this.f5126h = 0;
        this.f5122d = interfaceC1662a;
        this.f5124f = z;
        this.f5125g = new C1742t(this);
    }
}
