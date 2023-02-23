package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollEventAdapter.java */
/* renamed from: androidx.viewpager2.widget.e */
/* loaded from: classes2.dex */
public final class C1940e extends RecyclerView.AbstractC1644u {

    /* renamed from: a */
    private ViewPager2.AbstractC1924i f5848a;

    /* renamed from: b */
    private final ViewPager2 f5849b;

    /* renamed from: c */
    private final RecyclerView f5850c;

    /* renamed from: d */
    private final LinearLayoutManager f5851d;

    /* renamed from: e */
    private int f5852e;

    /* renamed from: f */
    private int f5853f;

    /* renamed from: g */
    private C1941a f5854g;

    /* renamed from: h */
    private int f5855h;

    /* renamed from: i */
    private int f5856i;

    /* renamed from: j */
    private boolean f5857j;

    /* renamed from: k */
    private boolean f5858k;

    /* renamed from: l */
    private boolean f5859l;

    /* renamed from: m */
    private boolean f5860m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollEventAdapter.java */
    /* renamed from: androidx.viewpager2.widget.e$a */
    /* loaded from: classes2.dex */
    public static final class C1941a {

        /* renamed from: a */
        int f5861a;

        /* renamed from: b */
        float f5862b;

        /* renamed from: c */
        int f5863c;

        C1941a() {
        }

        /* renamed from: a */
        void m34192a() {
            this.f5861a = -1;
            this.f5862b = 0.0f;
            this.f5863c = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1940e(ViewPager2 viewPager2) {
        this.f5849b = viewPager2;
        RecyclerView recyclerView = viewPager2.f5804B;
        this.f5850c = recyclerView;
        this.f5851d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f5854g = new C1941a();
        m34196l();
    }

    /* renamed from: a */
    private void m34207a(int i, float f, int i2) {
        ViewPager2.AbstractC1924i abstractC1924i = this.f5848a;
        if (abstractC1924i != null) {
            abstractC1924i.mo26464b(i, f, i2);
        }
    }

    /* renamed from: b */
    private void m34206b(int i) {
        ViewPager2.AbstractC1924i abstractC1924i = this.f5848a;
        if (abstractC1924i != null) {
            abstractC1924i.mo26463c(i);
        }
    }

    /* renamed from: c */
    private void m34205c(int i) {
        if ((this.f5852e == 3 && this.f5853f == 0) || this.f5853f == i) {
            return;
        }
        this.f5853f = i;
        ViewPager2.AbstractC1924i abstractC1924i = this.f5848a;
        if (abstractC1924i != null) {
            abstractC1924i.mo26465a(i);
        }
    }

    /* renamed from: d */
    private int m34204d() {
        return this.f5851d.m35402i2();
    }

    /* renamed from: i */
    private boolean m34199i() {
        int i = this.f5852e;
        return i == 1 || i == 4;
    }

    /* renamed from: l */
    private void m34196l() {
        this.f5852e = 0;
        this.f5853f = 0;
        this.f5854g.m34192a();
        this.f5855h = -1;
        this.f5856i = -1;
        this.f5857j = false;
        this.f5858k = false;
        this.f5860m = false;
        this.f5859l = false;
    }

    /* renamed from: n */
    private void m34194n(boolean z) {
        this.f5860m = z;
        this.f5852e = z ? 4 : 1;
        int i = this.f5856i;
        if (i != -1) {
            this.f5855h = i;
            this.f5856i = -1;
        } else if (this.f5855h == -1) {
            this.f5855h = m34204d();
        }
        m34205c(1);
    }

    /* renamed from: o */
    private void m34193o() {
        int top;
        C1941a c1941a = this.f5854g;
        int m35402i2 = this.f5851d.m35402i2();
        c1941a.f5861a = m35402i2;
        if (m35402i2 == -1) {
            c1941a.m34192a();
            return;
        }
        View mo35155M = this.f5851d.mo35155M(m35402i2);
        if (mo35155M == null) {
            c1941a.m34192a();
            return;
        }
        int m35117k0 = this.f5851d.m35117k0(mo35155M);
        int m35105p0 = this.f5851d.m35105p0(mo35155M);
        int m35097s0 = this.f5851d.m35097s0(mo35155M);
        int m35146R = this.f5851d.m35146R(mo35155M);
        ViewGroup.LayoutParams layoutParams = mo35155M.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            m35117k0 += marginLayoutParams.leftMargin;
            m35105p0 += marginLayoutParams.rightMargin;
            m35097s0 += marginLayoutParams.topMargin;
            m35146R += marginLayoutParams.bottomMargin;
        }
        int height = mo35155M.getHeight() + m35097s0 + m35146R;
        int width = mo35155M.getWidth() + m35117k0 + m35105p0;
        if (this.f5851d.m35389v2() == 0) {
            top = (mo35155M.getLeft() - m35117k0) - this.f5850c.getPaddingLeft();
            if (this.f5849b.m34264d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (mo35155M.getTop() - m35097s0) - this.f5850c.getPaddingTop();
        }
        int i = -top;
        c1941a.f5863c = i;
        if (i < 0) {
            if (new C1935a(this.f5851d).m34215d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(c1941a.f5863c)));
        }
        c1941a.f5862b = height == 0 ? 0.0f : i / height;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public double m34203e() {
        m34193o();
        C1941a c1941a = this.f5854g;
        double d = c1941a.f5861a;
        double d2 = c1941a.f5862b;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d + d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m34202f() {
        return this.f5853f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m34201g() {
        return this.f5860m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m34200h() {
        return this.f5853f == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m34198j() {
        this.f5859l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m34197k(int i, boolean z) {
        this.f5852e = z ? 2 : 3;
        this.f5860m = false;
        boolean z2 = this.f5856i != i;
        this.f5856i = i;
        m34205c(2);
        if (z2) {
            m34206b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m34195m(ViewPager2.AbstractC1924i abstractC1924i) {
        this.f5848a = abstractC1924i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z = true;
        if ((this.f5852e != 1 || this.f5853f != 1) && i == 1) {
            m34194n(false);
        } else if (m34199i() && i == 2) {
            if (this.f5858k) {
                m34205c(2);
                this.f5857j = true;
            }
        } else {
            if (m34199i() && i == 0) {
                m34193o();
                if (!this.f5858k) {
                    int i2 = this.f5854g.f5861a;
                    if (i2 != -1) {
                        m34207a(i2, 0.0f, 0);
                    }
                } else {
                    C1941a c1941a = this.f5854g;
                    if (c1941a.f5863c == 0) {
                        int i3 = this.f5855h;
                        int i4 = c1941a.f5861a;
                        if (i3 != i4) {
                            m34206b(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    m34205c(0);
                    m34196l();
                }
            }
            if (this.f5852e == 2 && i == 0 && this.f5859l) {
                m34193o();
                C1941a c1941a2 = this.f5854g;
                if (c1941a2.f5863c == 0) {
                    int i5 = this.f5856i;
                    int i6 = c1941a2.f5861a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m34206b(i6);
                    }
                    m34205c(0);
                    m34196l();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r5 < 0) == r3.f5849b.m34264d()) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f5858k = r4
            r3.m34193o()
            boolean r0 = r3.f5857j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3d
            r3.f5857j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f5849b
            boolean r6 = r6.m34264d()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = 0
            goto L23
        L22:
            r5 = 1
        L23:
            if (r5 == 0) goto L2f
            androidx.viewpager2.widget.e$a r5 = r3.f5854g
            int r6 = r5.f5863c
            if (r6 == 0) goto L2f
            int r5 = r5.f5861a
            int r5 = r5 + r4
            goto L33
        L2f:
            androidx.viewpager2.widget.e$a r5 = r3.f5854g
            int r5 = r5.f5861a
        L33:
            r3.f5856i = r5
            int r6 = r3.f5855h
            if (r6 == r5) goto L4b
            r3.m34206b(r5)
            goto L4b
        L3d:
            int r5 = r3.f5852e
            if (r5 != 0) goto L4b
            androidx.viewpager2.widget.e$a r5 = r3.f5854g
            int r5 = r5.f5861a
            if (r5 != r1) goto L48
            r5 = 0
        L48:
            r3.m34206b(r5)
        L4b:
            androidx.viewpager2.widget.e$a r5 = r3.f5854g
            int r5 = r5.f5861a
            if (r5 != r1) goto L52
            r5 = 0
        L52:
            androidx.viewpager2.widget.e$a r6 = r3.f5854g
            float r0 = r6.f5862b
            int r6 = r6.f5863c
            r3.m34207a(r5, r0, r6)
            androidx.viewpager2.widget.e$a r5 = r3.f5854g
            int r5 = r5.f5861a
            int r6 = r3.f5856i
            if (r5 == r6) goto L65
            if (r6 != r1) goto L75
        L65:
            androidx.viewpager2.widget.e$a r5 = r3.f5854g
            int r5 = r5.f5863c
            if (r5 != 0) goto L75
            int r5 = r3.f5853f
            if (r5 == r4) goto L75
            r3.m34205c(r2)
            r3.m34196l()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1940e.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
