package p201g.p227h.p238l;

import android.view.View;
import android.view.ViewParent;
/* compiled from: NestedScrollingChildHelper.java */
/* renamed from: g.h.l.l */
/* loaded from: classes2.dex */
public class C7747l {

    /* renamed from: a */
    private ViewParent f18501a;

    /* renamed from: b */
    private ViewParent f18502b;

    /* renamed from: c */
    private final View f18503c;

    /* renamed from: d */
    private boolean f18504d;

    /* renamed from: e */
    private int[] f18505e;

    public C7747l(View view) {
        this.f18503c = view;
    }

    /* renamed from: h */
    private boolean m17590h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m17589i;
        int i6;
        int i7;
        int[] iArr3;
        if (!m17585m() || (m17589i = m17589i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f18503c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] m17588j = m17588j();
            m17588j[0] = 0;
            m17588j[1] = 0;
            iArr3 = m17588j;
        } else {
            iArr3 = iArr2;
        }
        C7684b0.m17837d(m17589i, this.f18503c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f18503c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: i */
    private ViewParent m17589i(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f18502b;
        }
        return this.f18501a;
    }

    /* renamed from: j */
    private int[] m17588j() {
        if (this.f18505e == null) {
            this.f18505e = new int[2];
        }
        return this.f18505e;
    }

    /* renamed from: o */
    private void m17583o(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f18501a = viewParent;
        } else if (i != 1) {
        } else {
            this.f18502b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean m17597a(float f, float f2, boolean z) {
        ViewParent m17589i;
        if (!m17585m() || (m17589i = m17589i(0)) == null) {
            return false;
        }
        return C7684b0.m17840a(m17589i, this.f18503c, f, f2, z);
    }

    /* renamed from: b */
    public boolean m17596b(float f, float f2) {
        ViewParent m17589i;
        if (!m17585m() || (m17589i = m17589i(0)) == null) {
            return false;
        }
        return C7684b0.m17839b(m17589i, this.f18503c, f, f2);
    }

    /* renamed from: c */
    public boolean m17595c(int i, int i2, int[] iArr, int[] iArr2) {
        return m17594d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m17594d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m17589i;
        int i4;
        int i5;
        if (!m17585m() || (m17589i = m17589i(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f18503c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m17588j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C7684b0.m17838c(m17589i, this.f18503c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f18503c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public void m17593e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m17590h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean m17592f(int i, int i2, int i3, int i4, int[] iArr) {
        return m17590h(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: g */
    public boolean m17591g(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m17590h(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: k */
    public boolean m17587k() {
        return m17586l(0);
    }

    /* renamed from: l */
    public boolean m17586l(int i) {
        return m17589i(i) != null;
    }

    /* renamed from: m */
    public boolean m17585m() {
        return this.f18504d;
    }

    /* renamed from: n */
    public void m17584n(boolean z) {
        if (this.f18504d) {
            C7759x.m17546K0(this.f18503c);
        }
        this.f18504d = z;
    }

    /* renamed from: p */
    public boolean m17582p(int i) {
        return m17581q(i, 0);
    }

    /* renamed from: q */
    public boolean m17581q(int i, int i2) {
        if (m17586l(i2)) {
            return true;
        }
        if (m17585m()) {
            View view = this.f18503c;
            for (ViewParent parent = this.f18503c.getParent(); parent != null; parent = parent.getParent()) {
                if (C7684b0.m17835f(parent, view, this.f18503c, i, i2)) {
                    m17583o(i2, parent);
                    C7684b0.m17836e(parent, view, this.f18503c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: r */
    public void m17580r() {
        m17579s(0);
    }

    /* renamed from: s */
    public void m17579s(int i) {
        ViewParent m17589i = m17589i(i);
        if (m17589i != null) {
            C7684b0.m17834g(m17589i, this.f18503c, i);
            m17583o(i, null);
        }
    }
}
