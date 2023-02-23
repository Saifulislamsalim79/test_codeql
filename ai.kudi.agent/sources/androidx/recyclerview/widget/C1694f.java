package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChildHelper.java */
/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes2.dex */
public class C1694f {

    /* renamed from: a */
    final InterfaceC1696b f5189a;

    /* renamed from: b */
    final C1695a f5190b = new C1695a();

    /* renamed from: c */
    final List<View> f5191c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.f$a */
    /* loaded from: classes2.dex */
    public static class C1695a {

        /* renamed from: a */
        long f5192a = 0;

        /* renamed from: b */
        C1695a f5193b;

        C1695a() {
        }

        /* renamed from: c */
        private void m34788c() {
            if (this.f5193b == null) {
                this.f5193b = new C1695a();
            }
        }

        /* renamed from: a */
        void m34790a(int i) {
            if (i >= 64) {
                C1695a c1695a = this.f5193b;
                if (c1695a != null) {
                    c1695a.m34790a(i - 64);
                    return;
                }
                return;
            }
            this.f5192a &= (1 << i) ^ (-1);
        }

        /* renamed from: b */
        int m34789b(int i) {
            C1695a c1695a = this.f5193b;
            if (c1695a == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f5192a);
                }
                return Long.bitCount(this.f5192a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f5192a & ((1 << i) - 1));
            } else {
                return c1695a.m34789b(i - 64) + Long.bitCount(this.f5192a);
            }
        }

        /* renamed from: d */
        boolean m34787d(int i) {
            if (i < 64) {
                return (this.f5192a & (1 << i)) != 0;
            }
            m34788c();
            return this.f5193b.m34787d(i - 64);
        }

        /* renamed from: e */
        void m34786e(int i, boolean z) {
            if (i >= 64) {
                m34788c();
                this.f5193b.m34786e(i - 64, z);
                return;
            }
            boolean z2 = (this.f5192a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f5192a;
            this.f5192a = ((j2 & (j ^ (-1))) << 1) | (j2 & j);
            if (z) {
                m34783h(i);
            } else {
                m34790a(i);
            }
            if (z2 || this.f5193b != null) {
                m34788c();
                this.f5193b.m34786e(0, z2);
            }
        }

        /* renamed from: f */
        boolean m34785f(int i) {
            if (i >= 64) {
                m34788c();
                return this.f5193b.m34785f(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f5192a & j) != 0;
            long j2 = this.f5192a & (j ^ (-1));
            this.f5192a = j2;
            long j3 = j - 1;
            this.f5192a = (j2 & j3) | Long.rotateRight((j3 ^ (-1)) & j2, 1);
            C1695a c1695a = this.f5193b;
            if (c1695a != null) {
                if (c1695a.m34787d(0)) {
                    m34783h(63);
                }
                this.f5193b.m34785f(0);
            }
            return z;
        }

        /* renamed from: g */
        void m34784g() {
            this.f5192a = 0L;
            C1695a c1695a = this.f5193b;
            if (c1695a != null) {
                c1695a.m34784g();
            }
        }

        /* renamed from: h */
        void m34783h(int i) {
            if (i >= 64) {
                m34788c();
                this.f5193b.m34783h(i - 64);
                return;
            }
            this.f5192a |= 1 << i;
        }

        public String toString() {
            if (this.f5193b == null) {
                return Long.toBinaryString(this.f5192a);
            }
            return this.f5193b.toString() + "xx" + Long.toBinaryString(this.f5192a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.f$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1696b {
        /* renamed from: o */
        int mo34782o();

        /* renamed from: p */
        View mo34781p(int i);

        /* renamed from: q */
        void mo34780q(View view);

        /* renamed from: r */
        void mo34779r();

        /* renamed from: s */
        int mo34778s(View view);

        /* renamed from: t */
        RecyclerView.AbstractC1620e0 mo34777t(View view);

        /* renamed from: u */
        void mo34776u(int i);

        /* renamed from: v */
        void mo34775v(View view);

        /* renamed from: w */
        void mo34774w(View view, int i);

        /* renamed from: x */
        void mo34773x(int i);

        /* renamed from: y */
        void mo34772y(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1694f(InterfaceC1696b interfaceC1696b) {
        this.f5189a = interfaceC1696b;
    }

    /* renamed from: h */
    private int m34803h(int i) {
        if (i < 0) {
            return -1;
        }
        int mo34782o = this.f5189a.mo34782o();
        int i2 = i;
        while (i2 < mo34782o) {
            int m34789b = i - (i2 - this.f5190b.m34789b(i2));
            if (m34789b == 0) {
                while (this.f5190b.m34787d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m34789b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m34799l(View view) {
        this.f5191c.add(view);
        this.f5189a.mo34780q(view);
    }

    /* renamed from: t */
    private boolean m34791t(View view) {
        if (this.f5191c.remove(view)) {
            this.f5189a.mo34775v(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m34810a(View view, int i, boolean z) {
        int m34803h;
        if (i < 0) {
            m34803h = this.f5189a.mo34782o();
        } else {
            m34803h = m34803h(i);
        }
        this.f5190b.m34786e(m34803h, z);
        if (z) {
            m34799l(view);
        }
        this.f5189a.mo34774w(view, m34803h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m34809b(View view, boolean z) {
        m34810a(view, -1, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m34808c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m34803h;
        if (i < 0) {
            m34803h = this.f5189a.mo34782o();
        } else {
            m34803h = m34803h(i);
        }
        this.f5190b.m34786e(m34803h, z);
        if (z) {
            m34799l(view);
        }
        this.f5189a.mo34772y(view, m34803h, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m34807d(int i) {
        int m34803h = m34803h(i);
        this.f5190b.m34785f(m34803h);
        this.f5189a.mo34776u(m34803h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public View m34806e(int i) {
        int size = this.f5191c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f5191c.get(i2);
            RecyclerView.AbstractC1620e0 mo34777t = this.f5189a.mo34777t(view);
            if (mo34777t.getLayoutPosition() == i && !mo34777t.isInvalid() && !mo34777t.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public View m34805f(int i) {
        return this.f5189a.mo34781p(m34803h(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m34804g() {
        return this.f5189a.mo34782o() - this.f5191c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public View m34802i(int i) {
        return this.f5189a.mo34781p(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m34801j() {
        return this.f5189a.mo34782o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m34800k(View view) {
        int mo34778s = this.f5189a.mo34778s(view);
        if (mo34778s >= 0) {
            this.f5190b.m34783h(mo34778s);
            m34799l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m34798m(View view) {
        int mo34778s = this.f5189a.mo34778s(view);
        if (mo34778s == -1 || this.f5190b.m34787d(mo34778s)) {
            return -1;
        }
        return mo34778s - this.f5190b.m34789b(mo34778s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m34797n(View view) {
        return this.f5191c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m34796o() {
        this.f5190b.m34784g();
        for (int size = this.f5191c.size() - 1; size >= 0; size--) {
            this.f5189a.mo34775v(this.f5191c.get(size));
            this.f5191c.remove(size);
        }
        this.f5189a.mo34779r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m34795p(View view) {
        int mo34778s = this.f5189a.mo34778s(view);
        if (mo34778s < 0) {
            return;
        }
        if (this.f5190b.m34785f(mo34778s)) {
            m34791t(view);
        }
        this.f5189a.mo34773x(mo34778s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m34794q(int i) {
        int m34803h = m34803h(i);
        View mo34781p = this.f5189a.mo34781p(m34803h);
        if (mo34781p == null) {
            return;
        }
        if (this.f5190b.m34785f(m34803h)) {
            m34791t(mo34781p);
        }
        this.f5189a.mo34773x(m34803h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m34793r(View view) {
        int mo34778s = this.f5189a.mo34778s(view);
        if (mo34778s == -1) {
            m34791t(view);
            return true;
        } else if (this.f5190b.m34787d(mo34778s)) {
            this.f5190b.m34785f(mo34778s);
            m34791t(view);
            this.f5189a.mo34773x(mo34778s);
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m34792s(View view) {
        int mo34778s = this.f5189a.mo34778s(view);
        if (mo34778s >= 0) {
            if (this.f5190b.m34787d(mo34778s)) {
                this.f5190b.m34790a(mo34778s);
                m34791t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public String toString() {
        return this.f5190b.toString() + ", hidden list:" + this.f5191c.size();
    }
}
