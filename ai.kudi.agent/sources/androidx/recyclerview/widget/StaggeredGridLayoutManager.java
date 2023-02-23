package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC1635p implements RecyclerView.AbstractC1610a0.InterfaceC1612b {

    /* renamed from: L */
    C1660f[] f5064L;

    /* renamed from: M */
    AbstractC1744u f5065M;

    /* renamed from: N */
    AbstractC1744u f5066N;

    /* renamed from: O */
    private int f5067O;

    /* renamed from: P */
    private int f5068P;

    /* renamed from: Q */
    private final C1733n f5069Q;

    /* renamed from: T */
    private BitSet f5072T;

    /* renamed from: Y */
    private boolean f5077Y;

    /* renamed from: Z */
    private boolean f5078Z;

    /* renamed from: a0 */
    private C1658e f5079a0;

    /* renamed from: b0 */
    private int f5080b0;

    /* renamed from: g0 */
    private int[] f5085g0;

    /* renamed from: K */
    private int f5063K = -1;

    /* renamed from: R */
    boolean f5070R = false;

    /* renamed from: S */
    boolean f5071S = false;

    /* renamed from: U */
    int f5073U = -1;

    /* renamed from: V */
    int f5074V = Integer.MIN_VALUE;

    /* renamed from: W */
    C1655d f5075W = new C1655d();

    /* renamed from: X */
    private int f5076X = 2;

    /* renamed from: c0 */
    private final Rect f5081c0 = new Rect();

    /* renamed from: d0 */
    private final C1653b f5082d0 = new C1653b();

    /* renamed from: e0 */
    private boolean f5083e0 = false;

    /* renamed from: f0 */
    private boolean f5084f0 = true;

    /* renamed from: h0 */
    private final Runnable f5086h0 = new RunnableC1652a();

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes2.dex */
    class RunnableC1652a implements Runnable {
        RunnableC1652a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m34976b2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes2.dex */
    public class C1653b {

        /* renamed from: a */
        int f5088a;

        /* renamed from: b */
        int f5089b;

        /* renamed from: c */
        boolean f5090c;

        /* renamed from: d */
        boolean f5091d;

        /* renamed from: e */
        boolean f5092e;

        /* renamed from: f */
        int[] f5093f;

        C1653b() {
            m34945c();
        }

        /* renamed from: a */
        void m34947a() {
            this.f5089b = this.f5090c ? StaggeredGridLayoutManager.this.f5065M.mo34610i() : StaggeredGridLayoutManager.this.f5065M.mo34606m();
        }

        /* renamed from: b */
        void m34946b(int i) {
            if (this.f5090c) {
                this.f5089b = StaggeredGridLayoutManager.this.f5065M.mo34610i() - i;
            } else {
                this.f5089b = StaggeredGridLayoutManager.this.f5065M.mo34606m() + i;
            }
        }

        /* renamed from: c */
        void m34945c() {
            this.f5088a = -1;
            this.f5089b = Integer.MIN_VALUE;
            this.f5090c = false;
            this.f5091d = false;
            this.f5092e = false;
            int[] iArr = this.f5093f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        void m34944d(C1660f[] c1660fArr) {
            int length = c1660fArr.length;
            int[] iArr = this.f5093f;
            if (iArr == null || iArr.length < length) {
                this.f5093f = new int[StaggeredGridLayoutManager.this.f5064L.length];
            }
            for (int i = 0; i < length; i++) {
                this.f5093f[i] = c1660fArr[i].m34905p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes2.dex */
    public static class C1654c extends RecyclerView.C1640q {

        /* renamed from: w */
        C1660f f5095w;

        /* renamed from: x */
        boolean f5096x;

        public C1654c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public boolean m34943e() {
            return this.f5096x;
        }

        public C1654c(int i, int i2) {
            super(i, i2);
        }

        public C1654c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1654c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    /* loaded from: classes2.dex */
    public static class C1658e implements Parcelable {
        public static final Parcelable.Creator<C1658e> CREATOR = new C1659a();

        /* renamed from: A */
        boolean f5103A;

        /* renamed from: B */
        boolean f5104B;

        /* renamed from: c */
        int f5105c;

        /* renamed from: d */
        int f5106d;

        /* renamed from: e */
        int f5107e;

        /* renamed from: f */
        int[] f5108f;

        /* renamed from: w */
        int f5109w;

        /* renamed from: x */
        int[] f5110x;

        /* renamed from: y */
        List<C1655d.C1656a> f5111y;

        /* renamed from: z */
        boolean f5112z;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        /* loaded from: classes2.dex */
        class C1659a implements Parcelable.Creator<C1658e> {
            C1659a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1658e createFromParcel(Parcel parcel) {
                return new C1658e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1658e[] newArray(int i) {
                return new C1658e[i];
            }
        }

        public C1658e() {
        }

        /* renamed from: a */
        void m34924a() {
            this.f5108f = null;
            this.f5107e = 0;
            this.f5105c = -1;
            this.f5106d = -1;
        }

        /* renamed from: b */
        void m34923b() {
            this.f5108f = null;
            this.f5107e = 0;
            this.f5109w = 0;
            this.f5110x = null;
            this.f5111y = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5105c);
            parcel.writeInt(this.f5106d);
            parcel.writeInt(this.f5107e);
            if (this.f5107e > 0) {
                parcel.writeIntArray(this.f5108f);
            }
            parcel.writeInt(this.f5109w);
            if (this.f5109w > 0) {
                parcel.writeIntArray(this.f5110x);
            }
            parcel.writeInt(this.f5112z ? 1 : 0);
            parcel.writeInt(this.f5103A ? 1 : 0);
            parcel.writeInt(this.f5104B ? 1 : 0);
            parcel.writeList(this.f5111y);
        }

        C1658e(Parcel parcel) {
            this.f5105c = parcel.readInt();
            this.f5106d = parcel.readInt();
            int readInt = parcel.readInt();
            this.f5107e = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f5108f = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f5109w = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f5110x = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f5112z = parcel.readInt() == 1;
            this.f5103A = parcel.readInt() == 1;
            this.f5104B = parcel.readInt() == 1;
            this.f5111y = parcel.readArrayList(C1655d.C1656a.class.getClassLoader());
        }

        public C1658e(C1658e c1658e) {
            this.f5107e = c1658e.f5107e;
            this.f5105c = c1658e.f5105c;
            this.f5106d = c1658e.f5106d;
            this.f5108f = c1658e.f5108f;
            this.f5109w = c1658e.f5109w;
            this.f5110x = c1658e.f5110x;
            this.f5112z = c1658e.f5112z;
            this.f5103A = c1658e.f5103A;
            this.f5104B = c1658e.f5104B;
            this.f5111y = c1658e.f5111y;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    /* loaded from: classes2.dex */
    public class C1660f {

        /* renamed from: a */
        ArrayList<View> f5113a = new ArrayList<>();

        /* renamed from: b */
        int f5114b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f5115c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f5116d = 0;

        /* renamed from: e */
        final int f5117e;

        C1660f(int i) {
            this.f5117e = i;
        }

        /* renamed from: a */
        void m34920a(View view) {
            C1654c m34907n = m34907n(view);
            m34907n.f5095w = this;
            this.f5113a.add(view);
            this.f5115c = Integer.MIN_VALUE;
            if (this.f5113a.size() == 1) {
                this.f5114b = Integer.MIN_VALUE;
            }
            if (m34907n.m35077c() || m34907n.m35078b()) {
                this.f5116d += StaggeredGridLayoutManager.this.f5065M.mo34614e(view);
            }
        }

        /* renamed from: b */
        void m34919b(boolean z, int i) {
            int m34905p;
            if (z) {
                m34905p = m34909l(Integer.MIN_VALUE);
            } else {
                m34905p = m34905p(Integer.MIN_VALUE);
            }
            m34916e();
            if (m34905p == Integer.MIN_VALUE) {
                return;
            }
            if (!z || m34905p >= StaggeredGridLayoutManager.this.f5065M.mo34610i()) {
                if (z || m34905p <= StaggeredGridLayoutManager.this.f5065M.mo34606m()) {
                    if (i != Integer.MIN_VALUE) {
                        m34905p += i;
                    }
                    this.f5115c = m34905p;
                    this.f5114b = m34905p;
                }
            }
        }

        /* renamed from: c */
        void m34918c() {
            C1655d.C1656a m34937f;
            ArrayList<View> arrayList = this.f5113a;
            View view = arrayList.get(arrayList.size() - 1);
            C1654c m34907n = m34907n(view);
            this.f5115c = StaggeredGridLayoutManager.this.f5065M.mo34615d(view);
            if (m34907n.f5096x && (m34937f = StaggeredGridLayoutManager.this.f5075W.m34937f(m34907n.m35079a())) != null && m34937f.f5100d == 1) {
                this.f5115c += m34937f.m34927a(this.f5117e);
            }
        }

        /* renamed from: d */
        void m34917d() {
            C1655d.C1656a m34937f;
            View view = this.f5113a.get(0);
            C1654c m34907n = m34907n(view);
            this.f5114b = StaggeredGridLayoutManager.this.f5065M.mo34612g(view);
            if (m34907n.f5096x && (m34937f = StaggeredGridLayoutManager.this.f5075W.m34937f(m34907n.m35079a())) != null && m34937f.f5100d == -1) {
                this.f5114b -= m34937f.m34927a(this.f5117e);
            }
        }

        /* renamed from: e */
        void m34916e() {
            this.f5113a.clear();
            m34904q();
            this.f5116d = 0;
        }

        /* renamed from: f */
        public int m34915f() {
            if (StaggeredGridLayoutManager.this.f5070R) {
                return m34912i(this.f5113a.size() - 1, -1, true);
            }
            return m34912i(0, this.f5113a.size(), true);
        }

        /* renamed from: g */
        public int m34914g() {
            if (StaggeredGridLayoutManager.this.f5070R) {
                return m34912i(0, this.f5113a.size(), true);
            }
            return m34912i(this.f5113a.size() - 1, -1, true);
        }

        /* renamed from: h */
        int m34913h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int mo34606m = StaggeredGridLayoutManager.this.f5065M.mo34606m();
            int mo34610i = StaggeredGridLayoutManager.this.f5065M.mo34610i();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f5113a.get(i);
                int mo34612g = StaggeredGridLayoutManager.this.f5065M.mo34612g(view);
                int mo34615d = StaggeredGridLayoutManager.this.f5065M.mo34615d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? mo34612g >= mo34610i : mo34612g > mo34610i;
                if (!z3 ? mo34615d > mo34606m : mo34615d >= mo34606m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (mo34612g >= mo34606m && mo34615d <= mo34610i) {
                            return StaggeredGridLayoutManager.this.m35110n0(view);
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.this.m35110n0(view);
                    } else {
                        if (mo34612g < mo34606m || mo34615d > mo34610i) {
                            return StaggeredGridLayoutManager.this.m35110n0(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: i */
        int m34912i(int i, int i2, boolean z) {
            return m34913h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int m34911j() {
            return this.f5116d;
        }

        /* renamed from: k */
        int m34910k() {
            int i = this.f5115c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m34918c();
            return this.f5115c;
        }

        /* renamed from: l */
        int m34909l(int i) {
            int i2 = this.f5115c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f5113a.size() == 0) {
                return i;
            }
            m34918c();
            return this.f5115c;
        }

        /* renamed from: m */
        public View m34908m(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.f5113a.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.f5113a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f5070R && staggeredGridLayoutManager.m35110n0(view2) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f5070R && staggeredGridLayoutManager2.m35110n0(view2) >= i) || !view2.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
            } else {
                int size2 = this.f5113a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.f5113a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f5070R && staggeredGridLayoutManager3.m35110n0(view3) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f5070R && staggeredGridLayoutManager4.m35110n0(view3) <= i) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        C1654c m34907n(View view) {
            return (C1654c) view.getLayoutParams();
        }

        /* renamed from: o */
        int m34906o() {
            int i = this.f5114b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m34917d();
            return this.f5114b;
        }

        /* renamed from: p */
        int m34905p(int i) {
            int i2 = this.f5114b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f5113a.size() == 0) {
                return i;
            }
            m34917d();
            return this.f5114b;
        }

        /* renamed from: q */
        void m34904q() {
            this.f5114b = Integer.MIN_VALUE;
            this.f5115c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        void m34903r(int i) {
            int i2 = this.f5114b;
            if (i2 != Integer.MIN_VALUE) {
                this.f5114b = i2 + i;
            }
            int i3 = this.f5115c;
            if (i3 != Integer.MIN_VALUE) {
                this.f5115c = i3 + i;
            }
        }

        /* renamed from: s */
        void m34902s() {
            int size = this.f5113a.size();
            View remove = this.f5113a.remove(size - 1);
            C1654c m34907n = m34907n(remove);
            m34907n.f5095w = null;
            if (m34907n.m35077c() || m34907n.m35078b()) {
                this.f5116d -= StaggeredGridLayoutManager.this.f5065M.mo34614e(remove);
            }
            if (size == 1) {
                this.f5114b = Integer.MIN_VALUE;
            }
            this.f5115c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        void m34901t() {
            View remove = this.f5113a.remove(0);
            C1654c m34907n = m34907n(remove);
            m34907n.f5095w = null;
            if (this.f5113a.size() == 0) {
                this.f5115c = Integer.MIN_VALUE;
            }
            if (m34907n.m35077c() || m34907n.m35078b()) {
                this.f5116d -= StaggeredGridLayoutManager.this.f5065M.mo34614e(remove);
            }
            this.f5114b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        void m34900u(View view) {
            C1654c m34907n = m34907n(view);
            m34907n.f5095w = this;
            this.f5113a.add(0, view);
            this.f5114b = Integer.MIN_VALUE;
            if (this.f5113a.size() == 1) {
                this.f5115c = Integer.MIN_VALUE;
            }
            if (m34907n.m35077c() || m34907n.m35078b()) {
                this.f5116d += StaggeredGridLayoutManager.this.f5065M.mo34614e(view);
            }
        }

        /* renamed from: v */
        void m34899v(int i) {
            this.f5114b = i;
            this.f5115c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC1635p.C1639d m35107o0 = RecyclerView.AbstractC1635p.m35107o0(context, attributeSet, i, i2);
        m34996Q2(m35107o0.f5038a);
        m34993S2(m35107o0.f5039b);
        m34994R2(m35107o0.f5040c);
        this.f5069Q = new C1733n();
        m34968j2();
    }

    /* renamed from: D2 */
    private void m35014D2(View view, int i, int i2, boolean z) {
        boolean m35150O1;
        m35095t(view, this.f5081c0);
        C1654c c1654c = (C1654c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1654c).leftMargin;
        Rect rect = this.f5081c0;
        int m34977a3 = m34977a3(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) c1654c).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c1654c).topMargin;
        Rect rect2 = this.f5081c0;
        int m34977a32 = m34977a3(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) c1654c).bottomMargin + rect2.bottom);
        if (z) {
            m35150O1 = m35147Q1(view, m34977a3, m34977a32, c1654c);
        } else {
            m35150O1 = m35150O1(view, m34977a3, m34977a32, c1654c);
        }
        if (m35150O1) {
            view.measure(m34977a3, m34977a32);
        }
    }

    /* renamed from: E2 */
    private void m35013E2(View view, C1654c c1654c, boolean z) {
        if (c1654c.f5096x) {
            if (this.f5067O == 1) {
                m35014D2(view, this.f5080b0, RecyclerView.AbstractC1635p.m35139U(m35124g0(), m35122h0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c1654c).height, true), z);
            } else {
                m35014D2(view, RecyclerView.AbstractC1635p.m35139U(m35092u0(), m35090v0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c1654c).width, true), this.f5080b0, z);
            }
        } else if (this.f5067O == 1) {
            m35014D2(view, RecyclerView.AbstractC1635p.m35139U(this.f5068P, m35090v0(), 0, ((ViewGroup.MarginLayoutParams) c1654c).width, false), RecyclerView.AbstractC1635p.m35139U(m35124g0(), m35122h0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c1654c).height, true), z);
        } else {
            m35014D2(view, RecyclerView.AbstractC1635p.m35139U(m35092u0(), m35090v0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c1654c).width, true), RecyclerView.AbstractC1635p.m35139U(this.f5068P, m35122h0(), 0, ((ViewGroup.MarginLayoutParams) c1654c).height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (m34976b2() != false) goto L83;
     */
    /* renamed from: F2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m35012F2(androidx.recyclerview.widget.RecyclerView.C1647w r9, androidx.recyclerview.widget.RecyclerView.C1614b0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m35012F2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    /* renamed from: G2 */
    private boolean m35011G2(int i) {
        if (this.f5067O == 0) {
            return (i == -1) != this.f5071S;
        }
        return ((i == -1) == this.f5071S) == m35015C2();
    }

    /* renamed from: I2 */
    private void m35009I2(View view) {
        for (int i = this.f5063K - 1; i >= 0; i--) {
            this.f5064L[i].m34900u(view);
        }
    }

    /* renamed from: J2 */
    private void m35007J2(RecyclerView.C1647w c1647w, C1733n c1733n) {
        int min;
        int min2;
        if (!c1733n.f5344a || c1733n.f5352i) {
            return;
        }
        if (c1733n.f5345b == 0) {
            if (c1733n.f5348e == -1) {
                m35005K2(c1647w, c1733n.f5350g);
            } else {
                m35003L2(c1647w, c1733n.f5349f);
            }
        } else if (c1733n.f5348e == -1) {
            int i = c1733n.f5349f;
            int m34954v2 = i - m34954v2(i);
            if (m34954v2 < 0) {
                min2 = c1733n.f5350g;
            } else {
                min2 = c1733n.f5350g - Math.min(m34954v2, c1733n.f5345b);
            }
            m35005K2(c1647w, min2);
        } else {
            int m34953w2 = m34953w2(c1733n.f5350g) - c1733n.f5350g;
            if (m34953w2 < 0) {
                min = c1733n.f5349f;
            } else {
                min = Math.min(m34953w2, c1733n.f5345b) + c1733n.f5349f;
            }
            m35003L2(c1647w, min);
        }
    }

    /* renamed from: K2 */
    private void m35005K2(RecyclerView.C1647w c1647w, int i) {
        for (int m35142T = m35142T() - 1; m35142T >= 0; m35142T--) {
            View m35145S = m35145S(m35142T);
            if (this.f5065M.mo34612g(m35145S) < i || this.f5065M.mo34603q(m35145S) < i) {
                return;
            }
            C1654c c1654c = (C1654c) m35145S.getLayoutParams();
            if (c1654c.f5096x) {
                for (int i2 = 0; i2 < this.f5063K; i2++) {
                    if (this.f5064L[i2].f5113a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f5063K; i3++) {
                    this.f5064L[i3].m34902s();
                }
            } else if (c1654c.f5095w.f5113a.size() == 1) {
                return;
            } else {
                c1654c.f5095w.m34902s();
            }
            m35091u1(m35145S, c1647w);
        }
    }

    /* renamed from: L2 */
    private void m35003L2(RecyclerView.C1647w c1647w, int i) {
        while (m35142T() > 0) {
            View m35145S = m35145S(0);
            if (this.f5065M.mo34615d(m35145S) > i || this.f5065M.mo34604p(m35145S) > i) {
                return;
            }
            C1654c c1654c = (C1654c) m35145S.getLayoutParams();
            if (c1654c.f5096x) {
                for (int i2 = 0; i2 < this.f5063K; i2++) {
                    if (this.f5064L[i2].f5113a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f5063K; i3++) {
                    this.f5064L[i3].m34901t();
                }
            } else if (c1654c.f5095w.f5113a.size() == 1) {
                return;
            } else {
                c1654c.f5095w.m34901t();
            }
            m35091u1(m35145S, c1647w);
        }
    }

    /* renamed from: M2 */
    private void m35002M2() {
        if (this.f5066N.mo34608k() == 1073741824) {
            return;
        }
        float f = 0.0f;
        int m35142T = m35142T();
        for (int i = 0; i < m35142T; i++) {
            View m35145S = m35145S(i);
            float mo34614e = this.f5066N.mo34614e(m35145S);
            if (mo34614e >= f) {
                if (((C1654c) m35145S.getLayoutParams()).m34943e()) {
                    mo34614e = (mo34614e * 1.0f) / this.f5063K;
                }
                f = Math.max(f, mo34614e);
            }
        }
        int i2 = this.f5068P;
        int round = Math.round(f * this.f5063K);
        if (this.f5066N.mo34608k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f5066N.mo34605n());
        }
        m34982Y2(round);
        if (this.f5068P == i2) {
            return;
        }
        for (int i3 = 0; i3 < m35142T; i3++) {
            View m35145S2 = m35145S(i3);
            C1654c c1654c = (C1654c) m35145S2.getLayoutParams();
            if (!c1654c.f5096x) {
                if (m35015C2() && this.f5067O == 1) {
                    int i4 = this.f5063K;
                    int i5 = c1654c.f5095w.f5117e;
                    m35145S2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f5068P) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = c1654c.f5095w.f5117e;
                    int i7 = this.f5068P * i6;
                    int i8 = i6 * i2;
                    if (this.f5067O == 1) {
                        m35145S2.offsetLeftAndRight(i7 - i8);
                    } else {
                        m35145S2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    /* renamed from: N2 */
    private void m35001N2() {
        if (this.f5067O != 1 && m35015C2()) {
            this.f5071S = !this.f5070R;
        } else {
            this.f5071S = this.f5070R;
        }
    }

    /* renamed from: P2 */
    private void m34998P2(int i) {
        C1733n c1733n = this.f5069Q;
        c1733n.f5348e = i;
        c1733n.f5347d = this.f5071S != (i == -1) ? -1 : 1;
    }

    /* renamed from: T2 */
    private void m34992T2(int i, int i2) {
        for (int i3 = 0; i3 < this.f5063K; i3++) {
            if (!this.f5064L[i3].f5113a.isEmpty()) {
                m34979Z2(this.f5064L[i3], i, i2);
            }
        }
    }

    /* renamed from: U2 */
    private boolean m34990U2(RecyclerView.C1614b0 c1614b0, C1653b c1653b) {
        int m34965l2;
        if (this.f5077Y) {
            m34965l2 = m34961p2(c1614b0.m35217b());
        } else {
            m34965l2 = m34965l2(c1614b0.m35217b());
        }
        c1653b.f5088a = m34965l2;
        c1653b.f5089b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: V1 */
    private void m34989V1(View view) {
        for (int i = this.f5063K - 1; i >= 0; i--) {
            this.f5064L[i].m34920a(view);
        }
    }

    /* renamed from: W1 */
    private void m34987W1(C1653b c1653b) {
        int mo34606m;
        C1658e c1658e = this.f5079a0;
        int i = c1658e.f5107e;
        if (i > 0) {
            if (i == this.f5063K) {
                for (int i2 = 0; i2 < this.f5063K; i2++) {
                    this.f5064L[i2].m34916e();
                    C1658e c1658e2 = this.f5079a0;
                    int i3 = c1658e2.f5108f[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (c1658e2.f5103A) {
                            mo34606m = this.f5065M.mo34610i();
                        } else {
                            mo34606m = this.f5065M.mo34606m();
                        }
                        i3 += mo34606m;
                    }
                    this.f5064L[i2].m34899v(i3);
                }
            } else {
                c1658e.m34923b();
                C1658e c1658e3 = this.f5079a0;
                c1658e3.f5105c = c1658e3.f5106d;
            }
        }
        C1658e c1658e4 = this.f5079a0;
        this.f5078Z = c1658e4.f5104B;
        m34994R2(c1658e4.f5112z);
        m35001N2();
        C1658e c1658e5 = this.f5079a0;
        int i4 = c1658e5.f5105c;
        if (i4 != -1) {
            this.f5073U = i4;
            c1653b.f5090c = c1658e5.f5103A;
        } else {
            c1653b.f5090c = this.f5071S;
        }
        C1658e c1658e6 = this.f5079a0;
        if (c1658e6.f5109w > 1) {
            C1655d c1655d = this.f5075W;
            c1655d.f5097a = c1658e6.f5110x;
            c1655d.f5098b = c1658e6.f5111y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: X2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m34984X2(int r5, androidx.recyclerview.widget.RecyclerView.C1614b0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.n r0 = r4.f5069Q
            r1 = 0
            r0.f5345b = r1
            r0.f5346c = r5
            boolean r0 = r4.m35170E0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.m35216c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.f5071S
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.u r5 = r4.f5065M
            int r5 = r5.mo34605n()
            goto L2f
        L25:
            androidx.recyclerview.widget.u r5 = r4.f5065M
            int r5 = r5.mo34605n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.m35136W()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.n r0 = r4.f5069Q
            androidx.recyclerview.widget.u r3 = r4.f5065M
            int r3 = r3.mo34606m()
            int r3 = r3 - r6
            r0.f5349f = r3
            androidx.recyclerview.widget.n r6 = r4.f5069Q
            androidx.recyclerview.widget.u r0 = r4.f5065M
            int r0 = r0.mo34610i()
            int r0 = r0 + r5
            r6.f5350g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.n r0 = r4.f5069Q
            androidx.recyclerview.widget.u r3 = r4.f5065M
            int r3 = r3.mo34611h()
            int r3 = r3 + r5
            r0.f5350g = r3
            androidx.recyclerview.widget.n r5 = r4.f5069Q
            int r6 = -r6
            r5.f5349f = r6
        L5d:
            androidx.recyclerview.widget.n r5 = r4.f5069Q
            r5.f5351h = r1
            r5.f5344a = r2
            androidx.recyclerview.widget.u r6 = r4.f5065M
            int r6 = r6.mo34608k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.u r6 = r4.f5065M
            int r6 = r6.mo34611h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f5352i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m34984X2(int, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    /* renamed from: Z1 */
    private void m34980Z1(View view, C1654c c1654c, C1733n c1733n) {
        if (c1733n.f5348e == 1) {
            if (c1654c.f5096x) {
                m34989V1(view);
            } else {
                c1654c.f5095w.m34920a(view);
            }
        } else if (c1654c.f5096x) {
            m35009I2(view);
        } else {
            c1654c.f5095w.m34900u(view);
        }
    }

    /* renamed from: Z2 */
    private void m34979Z2(C1660f c1660f, int i, int i2) {
        int m34911j = c1660f.m34911j();
        if (i == -1) {
            if (c1660f.m34906o() + m34911j <= i2) {
                this.f5072T.set(c1660f.f5117e, false);
            }
        } else if (c1660f.m34910k() - m34911j >= i2) {
            this.f5072T.set(c1660f.f5117e, false);
        }
    }

    /* renamed from: a2 */
    private int m34978a2(int i) {
        if (m35142T() == 0) {
            return this.f5071S ? 1 : -1;
        }
        return (i < m34957s2()) != this.f5071S ? -1 : 1;
    }

    /* renamed from: a3 */
    private int m34977a3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: c2 */
    private boolean m34975c2(C1660f c1660f) {
        if (this.f5071S) {
            if (c1660f.m34910k() < this.f5065M.mo34610i()) {
                ArrayList<View> arrayList = c1660f.f5113a;
                return !c1660f.m34907n(arrayList.get(arrayList.size() - 1)).f5096x;
            }
        } else if (c1660f.m34906o() > this.f5065M.mo34606m()) {
            return !c1660f.m34907n(c1660f.f5113a.get(0)).f5096x;
        }
        return false;
    }

    /* renamed from: d2 */
    private int m34974d2(RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0) {
            return 0;
        }
        return C1751x.m34589a(c1614b0, this.f5065M, m34963n2(!this.f5084f0), m34964m2(!this.f5084f0), this, this.f5084f0);
    }

    /* renamed from: e2 */
    private int m34973e2(RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0) {
            return 0;
        }
        return C1751x.m34588b(c1614b0, this.f5065M, m34963n2(!this.f5084f0), m34964m2(!this.f5084f0), this, this.f5084f0, this.f5071S);
    }

    /* renamed from: f2 */
    private int m34972f2(RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0) {
            return 0;
        }
        return C1751x.m34587c(c1614b0, this.f5065M, m34963n2(!this.f5084f0), m34964m2(!this.f5084f0), this, this.f5084f0);
    }

    /* renamed from: g2 */
    private int m34971g2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f5067O == 1) ? 1 : Integer.MIN_VALUE : this.f5067O == 0 ? 1 : Integer.MIN_VALUE : this.f5067O == 1 ? -1 : Integer.MIN_VALUE : this.f5067O == 0 ? -1 : Integer.MIN_VALUE : (this.f5067O != 1 && m35015C2()) ? -1 : 1 : (this.f5067O != 1 && m35015C2()) ? 1 : -1;
    }

    /* renamed from: h2 */
    private C1655d.C1656a m34970h2(int i) {
        C1655d.C1656a c1656a = new C1655d.C1656a();
        c1656a.f5101e = new int[this.f5063K];
        for (int i2 = 0; i2 < this.f5063K; i2++) {
            c1656a.f5101e[i2] = i - this.f5064L[i2].m34909l(i);
        }
        return c1656a;
    }

    /* renamed from: i2 */
    private C1655d.C1656a m34969i2(int i) {
        C1655d.C1656a c1656a = new C1655d.C1656a();
        c1656a.f5101e = new int[this.f5063K];
        for (int i2 = 0; i2 < this.f5063K; i2++) {
            c1656a.f5101e[i2] = this.f5064L[i2].m34905p(i) - i;
        }
        return c1656a;
    }

    /* renamed from: j2 */
    private void m34968j2() {
        this.f5065M = AbstractC1744u.m34619b(this, this.f5067O);
        this.f5066N = AbstractC1744u.m34619b(this, 1 - this.f5067O);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: k2 */
    private int m34967k2(RecyclerView.C1647w c1647w, C1733n c1733n, RecyclerView.C1614b0 c1614b0) {
        int i;
        int i2;
        int mo34606m;
        int m34955u2;
        C1660f c1660f;
        int mo34614e;
        int i3;
        int i4;
        int mo34614e2;
        boolean m34983Y1;
        ?? r9 = 0;
        this.f5072T.set(0, this.f5063K, true);
        if (this.f5069Q.f5352i) {
            i2 = c1733n.f5348e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (c1733n.f5348e == 1) {
                i = c1733n.f5350g + c1733n.f5345b;
            } else {
                i = c1733n.f5349f - c1733n.f5345b;
            }
            i2 = i;
        }
        m34992T2(c1733n.f5348e, i2);
        if (this.f5071S) {
            mo34606m = this.f5065M.mo34610i();
        } else {
            mo34606m = this.f5065M.mo34606m();
        }
        int i5 = mo34606m;
        boolean z = false;
        while (c1733n.m34661a(c1614b0) && (this.f5069Q.f5352i || !this.f5072T.isEmpty())) {
            View m34660b = c1733n.m34660b(c1647w);
            C1654c c1654c = (C1654c) m34660b.getLayoutParams();
            int m35079a = c1654c.m35079a();
            int m34936g = this.f5075W.m34936g(m35079a);
            boolean z2 = m34936g == -1;
            if (z2) {
                c1660f = c1654c.f5096x ? this.f5064L[r9] : m34949y2(c1733n);
                this.f5075W.m34929n(m35079a, c1660f);
            } else {
                c1660f = this.f5064L[m34936g];
            }
            C1660f c1660f2 = c1660f;
            c1654c.f5095w = c1660f2;
            if (c1733n.f5348e == 1) {
                m35111n(m34660b);
            } else {
                m35108o(m34660b, r9);
            }
            m35013E2(m34660b, c1654c, r9);
            if (c1733n.f5348e == 1) {
                int m34955u22 = c1654c.f5096x ? m34955u2(i5) : c1660f2.m34909l(i5);
                int mo34614e3 = this.f5065M.mo34614e(m34660b) + m34955u22;
                if (z2 && c1654c.f5096x) {
                    C1655d.C1656a m34970h2 = m34970h2(m34955u22);
                    m34970h2.f5100d = -1;
                    m34970h2.f5099c = m35079a;
                    this.f5075W.m34942a(m34970h2);
                }
                i3 = mo34614e3;
                mo34614e = m34955u22;
            } else {
                int m34952x2 = c1654c.f5096x ? m34952x2(i5) : c1660f2.m34905p(i5);
                mo34614e = m34952x2 - this.f5065M.mo34614e(m34660b);
                if (z2 && c1654c.f5096x) {
                    C1655d.C1656a m34969i2 = m34969i2(m34952x2);
                    m34969i2.f5100d = 1;
                    m34969i2.f5099c = m35079a;
                    this.f5075W.m34942a(m34969i2);
                }
                i3 = m34952x2;
            }
            if (c1654c.f5096x && c1733n.f5347d == -1) {
                if (z2) {
                    this.f5083e0 = true;
                } else {
                    if (c1733n.f5348e == 1) {
                        m34983Y1 = m34985X1();
                    } else {
                        m34983Y1 = m34983Y1();
                    }
                    if (!m34983Y1) {
                        C1655d.C1656a m34937f = this.f5075W.m34937f(m35079a);
                        if (m34937f != null) {
                            m34937f.f5102f = true;
                        }
                        this.f5083e0 = true;
                    }
                }
            }
            m34980Z1(m34660b, c1654c, c1733n);
            if (m35015C2() && this.f5067O == 1) {
                int mo34610i = c1654c.f5096x ? this.f5066N.mo34610i() : this.f5066N.mo34610i() - (((this.f5063K - 1) - c1660f2.f5117e) * this.f5068P);
                mo34614e2 = mo34610i;
                i4 = mo34610i - this.f5066N.mo34614e(m34660b);
            } else {
                int mo34606m2 = c1654c.f5096x ? this.f5066N.mo34606m() : (c1660f2.f5117e * this.f5068P) + this.f5066N.mo34606m();
                i4 = mo34606m2;
                mo34614e2 = this.f5066N.mo34614e(m34660b) + mo34606m2;
            }
            if (this.f5067O == 1) {
                m35167G0(m34660b, i4, mo34614e, mo34614e2, i3);
            } else {
                m35167G0(m34660b, mo34614e, i4, i3, mo34614e2);
            }
            if (c1654c.f5096x) {
                m34992T2(this.f5069Q.f5348e, i2);
            } else {
                m34979Z2(c1660f2, this.f5069Q.f5348e, i2);
            }
            m35007J2(c1647w, this.f5069Q);
            if (this.f5069Q.f5351h && m34660b.hasFocusable()) {
                if (c1654c.f5096x) {
                    this.f5072T.clear();
                } else {
                    this.f5072T.set(c1660f2.f5117e, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            m35007J2(c1647w, this.f5069Q);
        }
        if (this.f5069Q.f5348e == -1) {
            m34955u2 = this.f5065M.mo34606m() - m34952x2(this.f5065M.mo34606m());
        } else {
            m34955u2 = m34955u2(this.f5065M.mo34610i()) - this.f5065M.mo34610i();
        }
        if (m34955u2 > 0) {
            return Math.min(c1733n.f5345b, m34955u2);
        }
        return 0;
    }

    /* renamed from: l2 */
    private int m34965l2(int i) {
        int m35142T = m35142T();
        for (int i2 = 0; i2 < m35142T; i2++) {
            int m35110n0 = m35110n0(m35145S(i2));
            if (m35110n0 >= 0 && m35110n0 < i) {
                return m35110n0;
            }
        }
        return 0;
    }

    /* renamed from: p2 */
    private int m34961p2(int i) {
        for (int m35142T = m35142T() - 1; m35142T >= 0; m35142T--) {
            int m35110n0 = m35110n0(m35145S(m35142T));
            if (m35110n0 >= 0 && m35110n0 < i) {
                return m35110n0;
            }
        }
        return 0;
    }

    /* renamed from: q2 */
    private void m34959q2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, boolean z) {
        int mo34610i;
        int m34955u2 = m34955u2(Integer.MIN_VALUE);
        if (m34955u2 != Integer.MIN_VALUE && (mo34610i = this.f5065M.mo34610i() - m34955u2) > 0) {
            int i = mo34610i - (-m35000O2(-mo34610i, c1647w, c1614b0));
            if (!z || i <= 0) {
                return;
            }
            this.f5065M.mo34602r(i);
        }
    }

    /* renamed from: r2 */
    private void m34958r2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, boolean z) {
        int mo34606m;
        int m34952x2 = m34952x2(Integer.MAX_VALUE);
        if (m34952x2 != Integer.MAX_VALUE && (mo34606m = m34952x2 - this.f5065M.mo34606m()) > 0) {
            int m35000O2 = mo34606m - m35000O2(mo34606m, c1647w, c1614b0);
            if (!z || m35000O2 <= 0) {
                return;
            }
            this.f5065M.mo34602r(-m35000O2);
        }
    }

    /* renamed from: u2 */
    private int m34955u2(int i) {
        int m34909l = this.f5064L[0].m34909l(i);
        for (int i2 = 1; i2 < this.f5063K; i2++) {
            int m34909l2 = this.f5064L[i2].m34909l(i);
            if (m34909l2 > m34909l) {
                m34909l = m34909l2;
            }
        }
        return m34909l;
    }

    /* renamed from: v2 */
    private int m34954v2(int i) {
        int m34905p = this.f5064L[0].m34905p(i);
        for (int i2 = 1; i2 < this.f5063K; i2++) {
            int m34905p2 = this.f5064L[i2].m34905p(i);
            if (m34905p2 > m34905p) {
                m34905p = m34905p2;
            }
        }
        return m34905p;
    }

    /* renamed from: w2 */
    private int m34953w2(int i) {
        int m34909l = this.f5064L[0].m34909l(i);
        for (int i2 = 1; i2 < this.f5063K; i2++) {
            int m34909l2 = this.f5064L[i2].m34909l(i);
            if (m34909l2 < m34909l) {
                m34909l = m34909l2;
            }
        }
        return m34909l;
    }

    /* renamed from: x2 */
    private int m34952x2(int i) {
        int m34905p = this.f5064L[0].m34905p(i);
        for (int i2 = 1; i2 < this.f5063K; i2++) {
            int m34905p2 = this.f5064L[i2].m34905p(i);
            if (m34905p2 < m34905p) {
                m34905p = m34905p2;
            }
        }
        return m34905p;
    }

    /* renamed from: y2 */
    private C1660f m34949y2(C1733n c1733n) {
        int i;
        int i2;
        int i3 = -1;
        if (m35011G2(c1733n.f5348e)) {
            i = this.f5063K - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.f5063K;
            i2 = 1;
        }
        C1660f c1660f = null;
        if (c1733n.f5348e == 1) {
            int i4 = Integer.MAX_VALUE;
            int mo34606m = this.f5065M.mo34606m();
            while (i != i3) {
                C1660f c1660f2 = this.f5064L[i];
                int m34909l = c1660f2.m34909l(mo34606m);
                if (m34909l < i4) {
                    c1660f = c1660f2;
                    i4 = m34909l;
                }
                i += i2;
            }
            return c1660f;
        }
        int i5 = Integer.MIN_VALUE;
        int mo34610i = this.f5065M.mo34610i();
        while (i != i3) {
            C1660f c1660f3 = this.f5064L[i];
            int m34905p = c1660f3.m34905p(mo34610i);
            if (m34905p > i5) {
                c1660f = c1660f3;
                i5 = m34905p;
            }
            i += i2;
        }
        return c1660f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: z2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m34948z2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f5071S
            if (r0 == 0) goto L9
            int r0 = r6.m34956t2()
            goto Ld
        L9:
            int r0 = r6.m34957s2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f5075W
            r4.m34935h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5075W
            r9.m34932k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f5075W
            r7.m34933j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5075W
            r9.m34932k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5075W
            r9.m34933j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f5071S
            if (r7 == 0) goto L4d
            int r7 = r6.m34957s2()
            goto L51
        L4d:
            int r7 = r6.m34956t2()
        L51:
            if (r3 > r7) goto L56
            r6.m35175B1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m34948z2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: A */
    public int mo32378A(RecyclerView.C1614b0 c1614b0) {
        return m34974d2(c1614b0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: A2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View m35017A2() {
        /*
            r12 = this;
            int r0 = r12.m35142T()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f5063K
            r2.<init>(r3)
            int r3 = r12.f5063K
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f5067O
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.m35015C2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.f5071S
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.m35145S(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1654c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5095w
            int r9 = r9.f5117e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5095w
            boolean r9 = r12.m34975c2(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5095w
            int r9 = r9.f5117e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f5096x
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.m35145S(r9)
            boolean r10 = r12.f5071S
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.u r10 = r12.f5065M
            int r10 = r10.mo34615d(r7)
            androidx.recyclerview.widget.u r11 = r12.f5065M
            int r11 = r11.mo34615d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.u r10 = r12.f5065M
            int r10 = r10.mo34612g(r7)
            androidx.recyclerview.widget.u r11 = r12.f5065M
            int r11 = r11.mo34612g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1654c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f5095w
            int r8 = r8.f5117e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f5095w
            int r9 = r9.f5117e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m35017A2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: B */
    public int mo32376B(RecyclerView.C1614b0 c1614b0) {
        return m34973e2(c1614b0);
    }

    /* renamed from: B2 */
    public void m35016B2() {
        this.f5075W.m34941b();
        m35175B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: C */
    public int mo32374C(RecyclerView.C1614b0 c1614b0) {
        return m34972f2(c1614b0);
    }

    /* renamed from: C2 */
    boolean m35015C2() {
        return m35118j0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: D */
    public int mo32372D(RecyclerView.C1614b0 c1614b0) {
        return m34974d2(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: E */
    public int mo32369E(RecyclerView.C1614b0 c1614b0) {
        return m34973e2(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: E1 */
    public int mo32368E1(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        return m35000O2(i, c1647w, c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: F */
    public int mo32366F(RecyclerView.C1614b0 c1614b0) {
        return m34972f2(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: F1 */
    public void mo32365F1(int i) {
        C1658e c1658e = this.f5079a0;
        if (c1658e != null && c1658e.f5105c != i) {
            c1658e.m34924a();
        }
        this.f5073U = i;
        this.f5074V = Integer.MIN_VALUE;
        m35175B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: G1 */
    public int mo32363G1(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        return m35000O2(i, c1647w, c1614b0);
    }

    /* renamed from: H2 */
    void m35010H2(int i, RecyclerView.C1614b0 c1614b0) {
        int m34957s2;
        int i2;
        if (i > 0) {
            m34957s2 = m34956t2();
            i2 = 1;
        } else {
            m34957s2 = m34957s2();
            i2 = -1;
        }
        this.f5069Q.f5344a = true;
        m34984X2(m34957s2, c1614b0);
        m34998P2(i2);
        C1733n c1733n = this.f5069Q;
        c1733n.f5346c = m34957s2 + c1733n.f5347d;
        c1733n.f5345b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: J0 */
    public void mo35008J0(int i) {
        super.mo35008J0(i);
        for (int i2 = 0; i2 < this.f5063K; i2++) {
            this.f5064L[i2].m34903r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: K0 */
    public void mo35006K0(int i) {
        super.mo35006K0(i);
        for (int i2 = 0; i2 < this.f5063K; i2++) {
            this.f5064L[i2].m34903r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: L0 */
    public void mo32357L0(RecyclerView.AbstractC1623h abstractC1623h, RecyclerView.AbstractC1623h abstractC1623h2) {
        this.f5075W.m34941b();
        for (int i = 0; i < this.f5063K; i++) {
            this.f5064L[i].m34916e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: L1 */
    public void mo35004L1(Rect rect, int i, int i2) {
        int m35086x;
        int m35086x2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f5067O == 1) {
            m35086x2 = RecyclerView.AbstractC1635p.m35086x(i2, rect.height() + paddingTop, m35115l0());
            m35086x = RecyclerView.AbstractC1635p.m35086x(i, (this.f5068P * this.f5063K) + paddingLeft, m35113m0());
        } else {
            m35086x = RecyclerView.AbstractC1635p.m35086x(i, rect.width() + paddingLeft, m35113m0());
            m35086x2 = RecyclerView.AbstractC1635p.m35086x(i2, (this.f5068P * this.f5063K) + paddingTop, m35115l0());
        }
        m35157K1(m35086x, m35086x2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: N */
    public RecyclerView.C1640q mo32354N() {
        if (this.f5067O == 0) {
            return new C1654c(-2, -1);
        }
        return new C1654c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: O */
    public RecyclerView.C1640q mo32351O(Context context, AttributeSet attributeSet) {
        return new C1654c(context, attributeSet);
    }

    /* renamed from: O2 */
    int m35000O2(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0 || i == 0) {
            return 0;
        }
        m35010H2(i, c1614b0);
        int m34967k2 = m34967k2(c1647w, this.f5069Q, c1614b0);
        if (this.f5069Q.f5345b >= m34967k2) {
            i = i < 0 ? -m34967k2 : m34967k2;
        }
        this.f5065M.mo34602r(-i);
        this.f5077Y = this.f5071S;
        C1733n c1733n = this.f5069Q;
        c1733n.f5345b = 0;
        m35007J2(c1647w, c1733n);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: P */
    public RecyclerView.C1640q mo34999P(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1654c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1654c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: P0 */
    public void mo32348P0(RecyclerView recyclerView, RecyclerView.C1647w c1647w) {
        super.mo32348P0(recyclerView, c1647w);
        m35087w1(this.f5086h0);
        for (int i = 0; i < this.f5063K; i++) {
            this.f5064L[i].m34916e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: Q0 */
    public View mo34997Q0(View view, int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        View m35156L;
        int m34957s2;
        int m34914g;
        int m34914g2;
        int m34914g3;
        View m34908m;
        if (m35142T() == 0 || (m35156L = m35156L(view)) == null) {
            return null;
        }
        m35001N2();
        int m34971g2 = m34971g2(i);
        if (m34971g2 == Integer.MIN_VALUE) {
            return null;
        }
        C1654c c1654c = (C1654c) m35156L.getLayoutParams();
        boolean z = c1654c.f5096x;
        C1660f c1660f = c1654c.f5095w;
        if (m34971g2 == 1) {
            m34957s2 = m34956t2();
        } else {
            m34957s2 = m34957s2();
        }
        m34984X2(m34957s2, c1614b0);
        m34998P2(m34971g2);
        C1733n c1733n = this.f5069Q;
        c1733n.f5346c = c1733n.f5347d + m34957s2;
        c1733n.f5345b = (int) (this.f5065M.mo34605n() * 0.33333334f);
        C1733n c1733n2 = this.f5069Q;
        c1733n2.f5351h = true;
        c1733n2.f5344a = false;
        m34967k2(c1647w, c1733n2, c1614b0);
        this.f5077Y = this.f5071S;
        if (z || (m34908m = c1660f.m34908m(m34957s2, m34971g2)) == null || m34908m == m35156L) {
            if (m35011G2(m34971g2)) {
                for (int i2 = this.f5063K - 1; i2 >= 0; i2--) {
                    View m34908m2 = this.f5064L[i2].m34908m(m34957s2, m34971g2);
                    if (m34908m2 != null && m34908m2 != m35156L) {
                        return m34908m2;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.f5063K; i3++) {
                    View m34908m3 = this.f5064L[i3].m34908m(m34957s2, m34971g2);
                    if (m34908m3 != null && m34908m3 != m35156L) {
                        return m34908m3;
                    }
                }
            }
            boolean z2 = (this.f5070R ^ true) == (m34971g2 == -1);
            if (!z) {
                if (z2) {
                    m34914g3 = c1660f.m34915f();
                } else {
                    m34914g3 = c1660f.m34914g();
                }
                View mo35155M = mo35155M(m34914g3);
                if (mo35155M != null && mo35155M != m35156L) {
                    return mo35155M;
                }
            }
            if (m35011G2(m34971g2)) {
                for (int i4 = this.f5063K - 1; i4 >= 0; i4--) {
                    if (i4 != c1660f.f5117e) {
                        if (z2) {
                            m34914g2 = this.f5064L[i4].m34915f();
                        } else {
                            m34914g2 = this.f5064L[i4].m34914g();
                        }
                        View mo35155M2 = mo35155M(m34914g2);
                        if (mo35155M2 != null && mo35155M2 != m35156L) {
                            return mo35155M2;
                        }
                    }
                }
            } else {
                for (int i5 = 0; i5 < this.f5063K; i5++) {
                    if (z2) {
                        m34914g = this.f5064L[i5].m34915f();
                    } else {
                        m34914g = this.f5064L[i5].m34914g();
                    }
                    View mo35155M3 = mo35155M(m34914g);
                    if (mo35155M3 != null && mo35155M3 != m35156L) {
                        return mo35155M3;
                    }
                }
            }
            return null;
        }
        return m34908m;
    }

    /* renamed from: Q2 */
    public void m34996Q2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo34960q(null);
        if (i == this.f5067O) {
            return;
        }
        this.f5067O = i;
        AbstractC1744u abstractC1744u = this.f5065M;
        this.f5065M = this.f5066N;
        this.f5066N = abstractC1744u;
        m35175B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: R0 */
    public void mo34995R0(AccessibilityEvent accessibilityEvent) {
        super.mo34995R0(accessibilityEvent);
        if (m35142T() > 0) {
            View m34963n2 = m34963n2(false);
            View m34964m2 = m34964m2(false);
            if (m34963n2 == null || m34964m2 == null) {
                return;
            }
            int m35110n0 = m35110n0(m34963n2);
            int m35110n02 = m35110n0(m34964m2);
            if (m35110n0 < m35110n02) {
                accessibilityEvent.setFromIndex(m35110n0);
                accessibilityEvent.setToIndex(m35110n02);
                return;
            }
            accessibilityEvent.setFromIndex(m35110n02);
            accessibilityEvent.setToIndex(m35110n0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: R1 */
    public void mo27028R1(RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0, int i) {
        C1734o c1734o = new C1734o(recyclerView.getContext());
        c1734o.m35226p(i);
        m35143S1(c1734o);
    }

    /* renamed from: R2 */
    public void m34994R2(boolean z) {
        mo34960q(null);
        C1658e c1658e = this.f5079a0;
        if (c1658e != null && c1658e.f5112z != z) {
            c1658e.f5112z = z;
        }
        this.f5070R = z;
        m35175B1();
    }

    /* renamed from: S2 */
    public void m34993S2(int i) {
        mo34960q(null);
        if (i != this.f5063K) {
            m35016B2();
            this.f5063K = i;
            this.f5072T = new BitSet(this.f5063K);
            this.f5064L = new C1660f[this.f5063K];
            for (int i2 = 0; i2 < this.f5063K; i2++) {
                this.f5064L[i2] = new C1660f(i2);
            }
            m35175B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: U1 */
    public boolean mo34991U1() {
        return this.f5079a0 == null;
    }

    /* renamed from: V2 */
    boolean m34988V2(RecyclerView.C1614b0 c1614b0, C1653b c1653b) {
        int i;
        int mo34606m;
        if (!c1614b0.m35214e() && (i = this.f5073U) != -1) {
            if (i >= 0 && i < c1614b0.m35217b()) {
                C1658e c1658e = this.f5079a0;
                if (c1658e != null && c1658e.f5105c != -1 && c1658e.f5107e >= 1) {
                    c1653b.f5089b = Integer.MIN_VALUE;
                    c1653b.f5088a = this.f5073U;
                } else {
                    View mo35155M = mo35155M(this.f5073U);
                    if (mo35155M != null) {
                        c1653b.f5088a = this.f5071S ? m34956t2() : m34957s2();
                        if (this.f5074V != Integer.MIN_VALUE) {
                            if (c1653b.f5090c) {
                                c1653b.f5089b = (this.f5065M.mo34610i() - this.f5074V) - this.f5065M.mo34615d(mo35155M);
                            } else {
                                c1653b.f5089b = (this.f5065M.mo34606m() + this.f5074V) - this.f5065M.mo34612g(mo35155M);
                            }
                            return true;
                        } else if (this.f5065M.mo34614e(mo35155M) > this.f5065M.mo34605n()) {
                            if (c1653b.f5090c) {
                                mo34606m = this.f5065M.mo34610i();
                            } else {
                                mo34606m = this.f5065M.mo34606m();
                            }
                            c1653b.f5089b = mo34606m;
                            return true;
                        } else {
                            int mo34612g = this.f5065M.mo34612g(mo35155M) - this.f5065M.mo34606m();
                            if (mo34612g < 0) {
                                c1653b.f5089b = -mo34612g;
                                return true;
                            }
                            int mo34610i = this.f5065M.mo34610i() - this.f5065M.mo34615d(mo35155M);
                            if (mo34610i < 0) {
                                c1653b.f5089b = mo34610i;
                                return true;
                            }
                            c1653b.f5089b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i2 = this.f5073U;
                        c1653b.f5088a = i2;
                        int i3 = this.f5074V;
                        if (i3 == Integer.MIN_VALUE) {
                            c1653b.f5090c = m34978a2(i2) == 1;
                            c1653b.m34947a();
                        } else {
                            c1653b.m34946b(i3);
                        }
                        c1653b.f5091d = true;
                    }
                }
                return true;
            }
            this.f5073U = -1;
            this.f5074V = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: W2 */
    void m34986W2(RecyclerView.C1614b0 c1614b0, C1653b c1653b) {
        if (m34988V2(c1614b0, c1653b) || m34990U2(c1614b0, c1653b)) {
            return;
        }
        c1653b.m34947a();
        c1653b.f5088a = 0;
    }

    /* renamed from: X1 */
    boolean m34985X1() {
        int m34909l = this.f5064L[0].m34909l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f5063K; i++) {
            if (this.f5064L[i].m34909l(Integer.MIN_VALUE) != m34909l) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: Y0 */
    public void mo32337Y0(RecyclerView recyclerView, int i, int i2) {
        m34948z2(i, i2, 1);
    }

    /* renamed from: Y1 */
    boolean m34983Y1() {
        int m34905p = this.f5064L[0].m34905p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f5063K; i++) {
            if (this.f5064L[i].m34905p(Integer.MIN_VALUE) != m34905p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Y2 */
    void m34982Y2(int i) {
        this.f5068P = i / this.f5063K;
        this.f5080b0 = View.MeasureSpec.makeMeasureSpec(i, this.f5066N.mo34608k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: Z0 */
    public void mo34981Z0(RecyclerView recyclerView) {
        this.f5075W.m34941b();
        m35175B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1610a0.InterfaceC1612b
    /* renamed from: a */
    public PointF mo32334a(int i) {
        int m34978a2 = m34978a2(i);
        PointF pointF = new PointF();
        if (m34978a2 == 0) {
            return null;
        }
        if (this.f5067O == 0) {
            pointF.x = m34978a2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m34978a2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: a1 */
    public void mo32333a1(RecyclerView recyclerView, int i, int i2, int i3) {
        m34948z2(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: b1 */
    public void mo32331b1(RecyclerView recyclerView, int i, int i2) {
        m34948z2(i, i2, 2);
    }

    /* renamed from: b2 */
    boolean m34976b2() {
        int m34957s2;
        int m34956t2;
        if (m35142T() == 0 || this.f5076X == 0 || !m35085x0()) {
            return false;
        }
        if (this.f5071S) {
            m34957s2 = m34956t2();
            m34956t2 = m34957s2();
        } else {
            m34957s2 = m34957s2();
            m34956t2 = m34956t2();
        }
        if (m34957s2 == 0 && m35017A2() != null) {
            this.f5075W.m34941b();
            m35173C1();
            m35175B1();
            return true;
        } else if (this.f5083e0) {
            int i = this.f5071S ? -1 : 1;
            int i2 = m34956t2 + 1;
            C1655d.C1656a m34938e = this.f5075W.m34938e(m34957s2, i2, i, true);
            if (m34938e == null) {
                this.f5083e0 = false;
                this.f5075W.m34939d(i2);
                return false;
            }
            C1655d.C1656a m34938e2 = this.f5075W.m34938e(m34957s2, m34938e.f5099c, i * (-1), true);
            if (m34938e2 == null) {
                this.f5075W.m34939d(m34938e.f5099c);
            } else {
                this.f5075W.m34939d(m34938e2.f5099c + 1);
            }
            m35173C1();
            m35175B1();
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: d1 */
    public void mo32327d1(RecyclerView recyclerView, int i, int i2, Object obj) {
        m34948z2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: e1 */
    public void mo32325e1(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        m35012F2(c1647w, c1614b0, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: f1 */
    public void mo32323f1(RecyclerView.C1614b0 c1614b0) {
        super.mo32323f1(c1614b0);
        this.f5073U = -1;
        this.f5074V = Integer.MIN_VALUE;
        this.f5079a0 = null;
        this.f5082d0.m34945c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: j1 */
    public void mo32318j1(Parcelable parcelable) {
        if (parcelable instanceof C1658e) {
            C1658e c1658e = (C1658e) parcelable;
            this.f5079a0 = c1658e;
            if (this.f5073U != -1) {
                c1658e.m34924a();
                this.f5079a0.m34923b();
            }
            m35175B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: k1 */
    public Parcelable mo32316k1() {
        int m34905p;
        int mo34606m;
        int[] iArr;
        if (this.f5079a0 != null) {
            return new C1658e(this.f5079a0);
        }
        C1658e c1658e = new C1658e();
        c1658e.f5112z = this.f5070R;
        c1658e.f5103A = this.f5077Y;
        c1658e.f5104B = this.f5078Z;
        C1655d c1655d = this.f5075W;
        if (c1655d != null && (iArr = c1655d.f5097a) != null) {
            c1658e.f5110x = iArr;
            c1658e.f5109w = iArr.length;
            c1658e.f5111y = c1655d.f5098b;
        } else {
            c1658e.f5109w = 0;
        }
        if (m35142T() > 0) {
            c1658e.f5105c = this.f5077Y ? m34956t2() : m34957s2();
            c1658e.f5106d = m34962o2();
            int i = this.f5063K;
            c1658e.f5107e = i;
            c1658e.f5108f = new int[i];
            for (int i2 = 0; i2 < this.f5063K; i2++) {
                if (this.f5077Y) {
                    m34905p = this.f5064L[i2].m34909l(Integer.MIN_VALUE);
                    if (m34905p != Integer.MIN_VALUE) {
                        mo34606m = this.f5065M.mo34610i();
                        m34905p -= mo34606m;
                        c1658e.f5108f[i2] = m34905p;
                    } else {
                        c1658e.f5108f[i2] = m34905p;
                    }
                } else {
                    m34905p = this.f5064L[i2].m34905p(Integer.MIN_VALUE);
                    if (m34905p != Integer.MIN_VALUE) {
                        mo34606m = this.f5065M.mo34606m();
                        m34905p -= mo34606m;
                        c1658e.f5108f[i2] = m34905p;
                    } else {
                        c1658e.f5108f[i2] = m34905p;
                    }
                }
            }
        } else {
            c1658e.f5105c = -1;
            c1658e.f5106d = -1;
            c1658e.f5107e = 0;
        }
        return c1658e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: l1 */
    public void mo34966l1(int i) {
        if (i == 0) {
            m34976b2();
        }
    }

    /* renamed from: m2 */
    View m34964m2(boolean z) {
        int mo34606m = this.f5065M.mo34606m();
        int mo34610i = this.f5065M.mo34610i();
        View view = null;
        for (int m35142T = m35142T() - 1; m35142T >= 0; m35142T--) {
            View m35145S = m35145S(m35142T);
            int mo34612g = this.f5065M.mo34612g(m35145S);
            int mo34615d = this.f5065M.mo34615d(m35145S);
            if (mo34615d > mo34606m && mo34612g < mo34610i) {
                if (mo34615d <= mo34610i || !z) {
                    return m35145S;
                }
                if (view == null) {
                    view = m35145S;
                }
            }
        }
        return view;
    }

    /* renamed from: n2 */
    View m34963n2(boolean z) {
        int mo34606m = this.f5065M.mo34606m();
        int mo34610i = this.f5065M.mo34610i();
        int m35142T = m35142T();
        View view = null;
        for (int i = 0; i < m35142T; i++) {
            View m35145S = m35145S(i);
            int mo34612g = this.f5065M.mo34612g(m35145S);
            if (this.f5065M.mo34615d(m35145S) > mo34606m && mo34612g < mo34610i) {
                if (mo34612g >= mo34606m || !z) {
                    return m35145S;
                }
                if (view == null) {
                    view = m35145S;
                }
            }
        }
        return view;
    }

    /* renamed from: o2 */
    int m34962o2() {
        View m34964m2 = this.f5071S ? m34964m2(true) : m34963n2(true);
        if (m34964m2 == null) {
            return -1;
        }
        return m35110n0(m34964m2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: q */
    public void mo34960q(String str) {
        if (this.f5079a0 == null) {
            super.mo34960q(str);
        }
    }

    /* renamed from: s2 */
    int m34957s2() {
        if (m35142T() == 0) {
            return 0;
        }
        return m35110n0(m35145S(0));
    }

    /* renamed from: t2 */
    int m34956t2() {
        int m35142T = m35142T();
        if (m35142T == 0) {
            return 0;
        }
        return m35110n0(m35145S(m35142T - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: u */
    public boolean mo32305u() {
        return this.f5067O == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: v */
    public boolean mo32303v() {
        return this.f5067O == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: w */
    public boolean mo32301w(RecyclerView.C1640q c1640q) {
        return c1640q instanceof C1654c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: y */
    public void mo34951y(int i, int i2, RecyclerView.C1614b0 c1614b0, RecyclerView.AbstractC1635p.InterfaceC1638c interfaceC1638c) {
        int m34909l;
        int i3;
        if (this.f5067O != 0) {
            i = i2;
        }
        if (m35142T() == 0 || i == 0) {
            return;
        }
        m35010H2(i, c1614b0);
        int[] iArr = this.f5085g0;
        if (iArr == null || iArr.length < this.f5063K) {
            this.f5085g0 = new int[this.f5063K];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f5063K; i5++) {
            C1733n c1733n = this.f5069Q;
            if (c1733n.f5347d == -1) {
                m34909l = c1733n.f5349f;
                i3 = this.f5064L[i5].m34905p(m34909l);
            } else {
                m34909l = this.f5064L[i5].m34909l(c1733n.f5350g);
                i3 = this.f5069Q.f5350g;
            }
            int i6 = m34909l - i3;
            if (i6 >= 0) {
                this.f5085g0[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.f5085g0, 0, i4);
        for (int i7 = 0; i7 < i4 && this.f5069Q.m34661a(c1614b0); i7++) {
            interfaceC1638c.mo34667a(this.f5069Q.f5346c, this.f5085g0[i7]);
            C1733n c1733n2 = this.f5069Q;
            c1733n2.f5346c += c1733n2.f5347d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: y0 */
    public boolean mo34950y0() {
        return this.f5076X != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes2.dex */
    public static class C1655d {

        /* renamed from: a */
        int[] f5097a;

        /* renamed from: b */
        List<C1656a> f5098b;

        C1655d() {
        }

        /* renamed from: i */
        private int m34934i(int i) {
            if (this.f5098b == null) {
                return -1;
            }
            C1656a m34937f = m34937f(i);
            if (m34937f != null) {
                this.f5098b.remove(m34937f);
            }
            int size = this.f5098b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f5098b.get(i2).f5099c >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                this.f5098b.remove(i2);
                return this.f5098b.get(i2).f5099c;
            }
            return -1;
        }

        /* renamed from: l */
        private void m34931l(int i, int i2) {
            List<C1656a> list = this.f5098b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1656a c1656a = this.f5098b.get(size);
                int i3 = c1656a.f5099c;
                if (i3 >= i) {
                    c1656a.f5099c = i3 + i2;
                }
            }
        }

        /* renamed from: m */
        private void m34930m(int i, int i2) {
            List<C1656a> list = this.f5098b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                C1656a c1656a = this.f5098b.get(size);
                int i4 = c1656a.f5099c;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f5098b.remove(size);
                    } else {
                        c1656a.f5099c = i4 - i2;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m34942a(C1656a c1656a) {
            if (this.f5098b == null) {
                this.f5098b = new ArrayList();
            }
            int size = this.f5098b.size();
            for (int i = 0; i < size; i++) {
                C1656a c1656a2 = this.f5098b.get(i);
                if (c1656a2.f5099c == c1656a.f5099c) {
                    this.f5098b.remove(i);
                }
                if (c1656a2.f5099c >= c1656a.f5099c) {
                    this.f5098b.add(i, c1656a);
                    return;
                }
            }
            this.f5098b.add(c1656a);
        }

        /* renamed from: b */
        void m34941b() {
            int[] iArr = this.f5097a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5098b = null;
        }

        /* renamed from: c */
        void m34940c(int i) {
            int[] iArr = this.f5097a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f5097a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m34928o(i)];
                this.f5097a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5097a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        int m34939d(int i) {
            List<C1656a> list = this.f5098b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f5098b.get(size).f5099c >= i) {
                        this.f5098b.remove(size);
                    }
                }
            }
            return m34935h(i);
        }

        /* renamed from: e */
        public C1656a m34938e(int i, int i2, int i3, boolean z) {
            List<C1656a> list = this.f5098b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1656a c1656a = this.f5098b.get(i4);
                int i5 = c1656a.f5099c;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || c1656a.f5100d == i3 || (z && c1656a.f5102f))) {
                    return c1656a;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C1656a m34937f(int i) {
            List<C1656a> list = this.f5098b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1656a c1656a = this.f5098b.get(size);
                if (c1656a.f5099c == i) {
                    return c1656a;
                }
            }
            return null;
        }

        /* renamed from: g */
        int m34936g(int i) {
            int[] iArr = this.f5097a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: h */
        int m34935h(int i) {
            int[] iArr = this.f5097a;
            if (iArr != null && i < iArr.length) {
                int m34934i = m34934i(i);
                if (m34934i == -1) {
                    int[] iArr2 = this.f5097a;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.f5097a.length;
                }
                int min = Math.min(m34934i + 1, this.f5097a.length);
                Arrays.fill(this.f5097a, i, min, -1);
                return min;
            }
            return -1;
        }

        /* renamed from: j */
        void m34933j(int i, int i2) {
            int[] iArr = this.f5097a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m34940c(i3);
            int[] iArr2 = this.f5097a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f5097a, i, i3, -1);
            m34931l(i, i2);
        }

        /* renamed from: k */
        void m34932k(int i, int i2) {
            int[] iArr = this.f5097a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m34940c(i3);
            int[] iArr2 = this.f5097a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f5097a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m34930m(i, i2);
        }

        /* renamed from: n */
        void m34929n(int i, C1660f c1660f) {
            m34940c(i);
            this.f5097a[i] = c1660f.f5117e;
        }

        /* renamed from: o */
        int m34928o(int i) {
            int length = this.f5097a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        /* loaded from: classes2.dex */
        public static class C1656a implements Parcelable {
            public static final Parcelable.Creator<C1656a> CREATOR = new C1657a();

            /* renamed from: c */
            int f5099c;

            /* renamed from: d */
            int f5100d;

            /* renamed from: e */
            int[] f5101e;

            /* renamed from: f */
            boolean f5102f;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: classes2.dex */
            class C1657a implements Parcelable.Creator<C1656a> {
                C1657a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public C1656a createFromParcel(Parcel parcel) {
                    return new C1656a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public C1656a[] newArray(int i) {
                    return new C1656a[i];
                }
            }

            C1656a(Parcel parcel) {
                this.f5099c = parcel.readInt();
                this.f5100d = parcel.readInt();
                this.f5102f = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f5101e = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            int m34927a(int i) {
                int[] iArr = this.f5101e;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f5099c + ", mGapDir=" + this.f5100d + ", mHasUnwantedGapAfter=" + this.f5102f + ", mGapPerSpan=" + Arrays.toString(this.f5101e) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f5099c);
                parcel.writeInt(this.f5100d);
                parcel.writeInt(this.f5102f ? 1 : 0);
                int[] iArr = this.f5101e;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f5101e);
                    return;
                }
                parcel.writeInt(0);
            }

            C1656a() {
            }
        }
    }
}
