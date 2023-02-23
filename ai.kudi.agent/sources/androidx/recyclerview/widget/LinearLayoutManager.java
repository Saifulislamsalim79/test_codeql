package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* loaded from: classes2.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC1635p implements RecyclerView.AbstractC1610a0.InterfaceC1612b {

    /* renamed from: K */
    int f4833K;

    /* renamed from: L */
    private C1606c f4834L;

    /* renamed from: M */
    AbstractC1744u f4835M;

    /* renamed from: N */
    private boolean f4836N;

    /* renamed from: O */
    private boolean f4837O;

    /* renamed from: P */
    boolean f4838P;

    /* renamed from: Q */
    private boolean f4839Q;

    /* renamed from: R */
    private boolean f4840R;

    /* renamed from: S */
    int f4841S;

    /* renamed from: T */
    int f4842T;

    /* renamed from: U */
    private boolean f4843U;

    /* renamed from: V */
    C1607d f4844V;

    /* renamed from: W */
    final C1604a f4845W;

    /* renamed from: X */
    private final C1605b f4846X;

    /* renamed from: Y */
    private int f4847Y;

    /* renamed from: Z */
    private int[] f4848Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes2.dex */
    public static class C1604a {

        /* renamed from: a */
        AbstractC1744u f4849a;

        /* renamed from: b */
        int f4850b;

        /* renamed from: c */
        int f4851c;

        /* renamed from: d */
        boolean f4852d;

        /* renamed from: e */
        boolean f4853e;

        C1604a() {
            m35380e();
        }

        /* renamed from: a */
        void m35384a() {
            int mo34606m;
            if (this.f4852d) {
                mo34606m = this.f4849a.mo34610i();
            } else {
                mo34606m = this.f4849a.mo34606m();
            }
            this.f4851c = mo34606m;
        }

        /* renamed from: b */
        public void m35383b(View view, int i) {
            if (this.f4852d) {
                this.f4851c = this.f4849a.mo34615d(view) + this.f4849a.m34617o();
            } else {
                this.f4851c = this.f4849a.mo34612g(view);
            }
            this.f4850b = i;
        }

        /* renamed from: c */
        public void m35382c(View view, int i) {
            int m34617o = this.f4849a.m34617o();
            if (m34617o >= 0) {
                m35383b(view, i);
                return;
            }
            this.f4850b = i;
            if (this.f4852d) {
                int mo34610i = (this.f4849a.mo34610i() - m34617o) - this.f4849a.mo34615d(view);
                this.f4851c = this.f4849a.mo34610i() - mo34610i;
                if (mo34610i > 0) {
                    int mo34614e = this.f4851c - this.f4849a.mo34614e(view);
                    int mo34606m = this.f4849a.mo34606m();
                    int min = mo34614e - (mo34606m + Math.min(this.f4849a.mo34612g(view) - mo34606m, 0));
                    if (min < 0) {
                        this.f4851c += Math.min(mo34610i, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo34612g = this.f4849a.mo34612g(view);
            int mo34606m2 = mo34612g - this.f4849a.mo34606m();
            this.f4851c = mo34612g;
            if (mo34606m2 > 0) {
                int mo34610i2 = (this.f4849a.mo34610i() - Math.min(0, (this.f4849a.mo34610i() - m34617o) - this.f4849a.mo34615d(view))) - (mo34612g + this.f4849a.mo34614e(view));
                if (mo34610i2 < 0) {
                    this.f4851c -= Math.min(mo34606m2, -mo34610i2);
                }
            }
        }

        /* renamed from: d */
        boolean m35381d(View view, RecyclerView.C1614b0 c1614b0) {
            RecyclerView.C1640q c1640q = (RecyclerView.C1640q) view.getLayoutParams();
            return !c1640q.m35077c() && c1640q.m35079a() >= 0 && c1640q.m35079a() < c1614b0.m35217b();
        }

        /* renamed from: e */
        void m35380e() {
            this.f4850b = -1;
            this.f4851c = Integer.MIN_VALUE;
            this.f4852d = false;
            this.f4853e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4850b + ", mCoordinate=" + this.f4851c + ", mLayoutFromEnd=" + this.f4852d + ", mValid=" + this.f4853e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes2.dex */
    public static class C1605b {

        /* renamed from: a */
        public int f4854a;

        /* renamed from: b */
        public boolean f4855b;

        /* renamed from: c */
        public boolean f4856c;

        /* renamed from: d */
        public boolean f4857d;

        protected C1605b() {
        }

        /* renamed from: a */
        void m35379a() {
            this.f4854a = 0;
            this.f4855b = false;
            this.f4856c = false;
            this.f4857d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes2.dex */
    public static class C1606c {

        /* renamed from: b */
        int f4859b;

        /* renamed from: c */
        int f4860c;

        /* renamed from: d */
        int f4861d;

        /* renamed from: e */
        int f4862e;

        /* renamed from: f */
        int f4863f;

        /* renamed from: g */
        int f4864g;

        /* renamed from: j */
        boolean f4867j;

        /* renamed from: k */
        int f4868k;

        /* renamed from: m */
        boolean f4870m;

        /* renamed from: a */
        boolean f4858a = true;

        /* renamed from: h */
        int f4865h = 0;

        /* renamed from: i */
        int f4866i = 0;

        /* renamed from: l */
        List<RecyclerView.AbstractC1620e0> f4869l = null;

        C1606c() {
        }

        /* renamed from: e */
        private View m35374e() {
            int size = this.f4869l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f4869l.get(i).itemView;
                RecyclerView.C1640q c1640q = (RecyclerView.C1640q) view.getLayoutParams();
                if (!c1640q.m35077c() && this.f4861d == c1640q.m35079a()) {
                    m35377b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m35378a() {
            m35377b(null);
        }

        /* renamed from: b */
        public void m35377b(View view) {
            View m35373f = m35373f(view);
            if (m35373f == null) {
                this.f4861d = -1;
            } else {
                this.f4861d = ((RecyclerView.C1640q) m35373f.getLayoutParams()).m35079a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean m35376c(RecyclerView.C1614b0 c1614b0) {
            int i = this.f4861d;
            return i >= 0 && i < c1614b0.m35217b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public View m35375d(RecyclerView.C1647w c1647w) {
            if (this.f4869l != null) {
                return m35374e();
            }
            View m35035o = c1647w.m35035o(this.f4861d);
            this.f4861d += this.f4862e;
            return m35035o;
        }

        /* renamed from: f */
        public View m35373f(View view) {
            int m35079a;
            int size = this.f4869l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f4869l.get(i2).itemView;
                RecyclerView.C1640q c1640q = (RecyclerView.C1640q) view3.getLayoutParams();
                if (view3 != view && !c1640q.m35077c() && (m35079a = (c1640q.m35079a() - this.f4861d) * this.f4862e) >= 0 && m35079a < i) {
                    view2 = view3;
                    if (m35079a == 0) {
                        break;
                    }
                    i = m35079a;
                }
            }
            return view2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    /* loaded from: classes2.dex */
    public static class C1607d implements Parcelable {
        public static final Parcelable.Creator<C1607d> CREATOR = new C1608a();

        /* renamed from: c */
        int f4871c;

        /* renamed from: d */
        int f4872d;

        /* renamed from: e */
        boolean f4873e;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        /* loaded from: classes2.dex */
        class C1608a implements Parcelable.Creator<C1607d> {
            C1608a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1607d createFromParcel(Parcel parcel) {
                return new C1607d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1607d[] newArray(int i) {
                return new C1607d[i];
            }
        }

        public C1607d() {
        }

        /* renamed from: a */
        boolean m35372a() {
            return this.f4871c >= 0;
        }

        /* renamed from: b */
        void m35371b() {
            this.f4871c = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4871c);
            parcel.writeInt(this.f4872d);
            parcel.writeInt(this.f4873e ? 1 : 0);
        }

        C1607d(Parcel parcel) {
            this.f4871c = parcel.readInt();
            this.f4872d = parcel.readInt();
            this.f4873e = parcel.readInt() == 1;
        }

        public C1607d(C1607d c1607d) {
            this.f4871c = c1607d.f4871c;
            this.f4872d = c1607d.f4872d;
            this.f4873e = c1607d.f4873e;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: B2 */
    private void m35432B2(RecyclerView.C1647w c1647w, C1606c c1606c) {
        if (!c1606c.f4858a || c1606c.f4870m) {
            return;
        }
        int i = c1606c.f4864g;
        int i2 = c1606c.f4866i;
        if (c1606c.f4863f == -1) {
            m35430D2(c1647w, i, i2);
        } else {
            m35429E2(c1647w, i, i2);
        }
    }

    /* renamed from: C2 */
    private void m35431C2(RecyclerView.C1647w c1647w, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m35089v1(i, c1647w);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            m35089v1(i3, c1647w);
        }
    }

    /* renamed from: D2 */
    private void m35430D2(RecyclerView.C1647w c1647w, int i, int i2) {
        int m35142T = m35142T();
        if (i < 0) {
            return;
        }
        int mo34611h = (this.f4835M.mo34611h() - i) + i2;
        if (this.f4838P) {
            for (int i3 = 0; i3 < m35142T; i3++) {
                View m35145S = m35145S(i3);
                if (this.f4835M.mo34612g(m35145S) < mo34611h || this.f4835M.mo34603q(m35145S) < mo34611h) {
                    m35431C2(c1647w, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = m35142T - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View m35145S2 = m35145S(i5);
            if (this.f4835M.mo34612g(m35145S2) < mo34611h || this.f4835M.mo34603q(m35145S2) < mo34611h) {
                m35431C2(c1647w, i4, i5);
                return;
            }
        }
    }

    /* renamed from: E2 */
    private void m35429E2(RecyclerView.C1647w c1647w, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int m35142T = m35142T();
        if (!this.f4838P) {
            for (int i4 = 0; i4 < m35142T; i4++) {
                View m35145S = m35145S(i4);
                if (this.f4835M.mo34615d(m35145S) > i3 || this.f4835M.mo34604p(m35145S) > i3) {
                    m35431C2(c1647w, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = m35142T - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View m35145S2 = m35145S(i6);
            if (this.f4835M.mo34615d(m35145S2) > i3 || this.f4835M.mo34604p(m35145S2) > i3) {
                m35431C2(c1647w, i5, i6);
                return;
            }
        }
    }

    /* renamed from: G2 */
    private void m35427G2() {
        if (this.f4833K != 1 && m35388w2()) {
            this.f4838P = !this.f4837O;
        } else {
            this.f4838P = this.f4837O;
        }
    }

    /* renamed from: L2 */
    private boolean m35422L2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, C1604a c1604a) {
        View mo35395p2;
        boolean z = false;
        if (m35142T() == 0) {
            return false;
        }
        View m35125f0 = m35125f0();
        if (m35125f0 != null && c1604a.m35381d(m35125f0, c1614b0)) {
            c1604a.m35382c(m35125f0, m35110n0(m35125f0));
            return true;
        }
        boolean z2 = this.f4836N;
        boolean z3 = this.f4839Q;
        if (z2 == z3 && (mo35395p2 = mo35395p2(c1647w, c1614b0, c1604a.f4852d, z3)) != null) {
            c1604a.m35383b(mo35395p2, m35110n0(mo35395p2));
            if (!c1614b0.m35214e() && mo34991U1()) {
                int mo34612g = this.f4835M.mo34612g(mo35395p2);
                int mo34615d = this.f4835M.mo34615d(mo35395p2);
                int mo34606m = this.f4835M.mo34606m();
                int mo34610i = this.f4835M.mo34610i();
                boolean z4 = mo34615d <= mo34606m && mo34612g < mo34606m;
                if (mo34612g >= mo34610i && mo34615d > mo34610i) {
                    z = true;
                }
                if (z4 || z) {
                    if (c1604a.f4852d) {
                        mo34606m = mo34610i;
                    }
                    c1604a.f4851c = mo34606m;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: M2 */
    private boolean m35421M2(RecyclerView.C1614b0 c1614b0, C1604a c1604a) {
        int i;
        int mo34612g;
        if (!c1614b0.m35214e() && (i = this.f4841S) != -1) {
            if (i >= 0 && i < c1614b0.m35217b()) {
                c1604a.f4850b = this.f4841S;
                C1607d c1607d = this.f4844V;
                if (c1607d != null && c1607d.m35372a()) {
                    boolean z = this.f4844V.f4873e;
                    c1604a.f4852d = z;
                    if (z) {
                        c1604a.f4851c = this.f4835M.mo34610i() - this.f4844V.f4872d;
                    } else {
                        c1604a.f4851c = this.f4835M.mo34606m() + this.f4844V.f4872d;
                    }
                    return true;
                } else if (this.f4842T == Integer.MIN_VALUE) {
                    View mo35155M = mo35155M(this.f4841S);
                    if (mo35155M != null) {
                        if (this.f4835M.mo34614e(mo35155M) > this.f4835M.mo34605n()) {
                            c1604a.m35384a();
                            return true;
                        } else if (this.f4835M.mo34612g(mo35155M) - this.f4835M.mo34606m() < 0) {
                            c1604a.f4851c = this.f4835M.mo34606m();
                            c1604a.f4852d = false;
                            return true;
                        } else if (this.f4835M.mo34610i() - this.f4835M.mo34615d(mo35155M) < 0) {
                            c1604a.f4851c = this.f4835M.mo34610i();
                            c1604a.f4852d = true;
                            return true;
                        } else {
                            if (c1604a.f4852d) {
                                mo34612g = this.f4835M.mo34615d(mo35155M) + this.f4835M.m34617o();
                            } else {
                                mo34612g = this.f4835M.mo34612g(mo35155M);
                            }
                            c1604a.f4851c = mo34612g;
                        }
                    } else {
                        if (m35142T() > 0) {
                            c1604a.f4852d = (this.f4841S < m35110n0(m35145S(0))) == this.f4838P;
                        }
                        c1604a.m35384a();
                    }
                    return true;
                } else {
                    boolean z2 = this.f4838P;
                    c1604a.f4852d = z2;
                    if (z2) {
                        c1604a.f4851c = this.f4835M.mo34610i() - this.f4842T;
                    } else {
                        c1604a.f4851c = this.f4835M.mo34606m() + this.f4842T;
                    }
                    return true;
                }
            }
            this.f4841S = -1;
            this.f4842T = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: N2 */
    private void m35420N2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, C1604a c1604a) {
        if (m35421M2(c1614b0, c1604a) || m35422L2(c1647w, c1614b0, c1604a)) {
            return;
        }
        c1604a.m35384a();
        c1604a.f4850b = this.f4839Q ? c1614b0.m35217b() - 1 : 0;
    }

    /* renamed from: O2 */
    private void m35419O2(int i, int i2, boolean z, RecyclerView.C1614b0 c1614b0) {
        int mo34606m;
        this.f4834L.f4870m = m35428F2();
        this.f4834L.f4863f = i;
        int[] iArr = this.f4848Z;
        iArr[0] = 0;
        iArr[1] = 0;
        mo27089V1(c1614b0, iArr);
        int max = Math.max(0, this.f4848Z[0]);
        int max2 = Math.max(0, this.f4848Z[1]);
        boolean z2 = i == 1;
        this.f4834L.f4865h = z2 ? max2 : max;
        C1606c c1606c = this.f4834L;
        if (!z2) {
            max = max2;
        }
        c1606c.f4866i = max;
        if (z2) {
            this.f4834L.f4865h += this.f4835M.mo34609j();
            View m35392s2 = m35392s2();
            this.f4834L.f4862e = this.f4838P ? -1 : 1;
            C1606c c1606c2 = this.f4834L;
            int m35110n0 = m35110n0(m35392s2);
            C1606c c1606c3 = this.f4834L;
            c1606c2.f4861d = m35110n0 + c1606c3.f4862e;
            c1606c3.f4859b = this.f4835M.mo34615d(m35392s2);
            mo34606m = this.f4835M.mo34615d(m35392s2) - this.f4835M.mo34610i();
        } else {
            View m35391t2 = m35391t2();
            this.f4834L.f4865h += this.f4835M.mo34606m();
            this.f4834L.f4862e = this.f4838P ? 1 : -1;
            C1606c c1606c4 = this.f4834L;
            int m35110n02 = m35110n0(m35391t2);
            C1606c c1606c5 = this.f4834L;
            c1606c4.f4861d = m35110n02 + c1606c5.f4862e;
            c1606c5.f4859b = this.f4835M.mo34612g(m35391t2);
            mo34606m = (-this.f4835M.mo34612g(m35391t2)) + this.f4835M.mo34606m();
        }
        C1606c c1606c6 = this.f4834L;
        c1606c6.f4860c = i2;
        if (z) {
            c1606c6.f4860c = i2 - mo34606m;
        }
        this.f4834L.f4864g = mo34606m;
    }

    /* renamed from: P2 */
    private void m35418P2(int i, int i2) {
        this.f4834L.f4860c = this.f4835M.mo34610i() - i2;
        this.f4834L.f4862e = this.f4838P ? -1 : 1;
        C1606c c1606c = this.f4834L;
        c1606c.f4861d = i;
        c1606c.f4863f = 1;
        c1606c.f4859b = i2;
        c1606c.f4864g = Integer.MIN_VALUE;
    }

    /* renamed from: Q2 */
    private void m35417Q2(C1604a c1604a) {
        m35418P2(c1604a.f4850b, c1604a.f4851c);
    }

    /* renamed from: R2 */
    private void m35416R2(int i, int i2) {
        this.f4834L.f4860c = i2 - this.f4835M.mo34606m();
        C1606c c1606c = this.f4834L;
        c1606c.f4861d = i;
        c1606c.f4862e = this.f4838P ? 1 : -1;
        C1606c c1606c2 = this.f4834L;
        c1606c2.f4863f = -1;
        c1606c2.f4859b = i2;
        c1606c2.f4864g = Integer.MIN_VALUE;
    }

    /* renamed from: S2 */
    private void m35415S2(C1604a c1604a) {
        m35416R2(c1604a.f4850b, c1604a.f4851c);
    }

    /* renamed from: X1 */
    private int m35413X1(RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0) {
            return 0;
        }
        m35408c2();
        return C1751x.m34589a(c1614b0, this.f4835M, m35403h2(!this.f4840R, true), m35404g2(!this.f4840R, true), this, this.f4840R);
    }

    /* renamed from: Y1 */
    private int m35412Y1(RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0) {
            return 0;
        }
        m35408c2();
        return C1751x.m34588b(c1614b0, this.f4835M, m35403h2(!this.f4840R, true), m35404g2(!this.f4840R, true), this, this.f4840R, this.f4838P);
    }

    /* renamed from: Z1 */
    private int m35411Z1(RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0) {
            return 0;
        }
        m35408c2();
        return C1751x.m34587c(c1614b0, this.f4835M, m35403h2(!this.f4840R, true), m35404g2(!this.f4840R, true), this, this.f4840R);
    }

    /* renamed from: f2 */
    private View m35405f2() {
        return m35399l2(0, m35142T());
    }

    /* renamed from: j2 */
    private View m35401j2() {
        return m35399l2(m35142T() - 1, -1);
    }

    /* renamed from: n2 */
    private View m35397n2() {
        return this.f4838P ? m35405f2() : m35401j2();
    }

    /* renamed from: o2 */
    private View m35396o2() {
        return this.f4838P ? m35401j2() : m35405f2();
    }

    /* renamed from: q2 */
    private int m35394q2(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, boolean z) {
        int mo34610i;
        int mo34610i2 = this.f4835M.mo34610i() - i;
        if (mo34610i2 > 0) {
            int i2 = -m35426H2(-mo34610i2, c1647w, c1614b0);
            int i3 = i + i2;
            if (!z || (mo34610i = this.f4835M.mo34610i() - i3) <= 0) {
                return i2;
            }
            this.f4835M.mo34602r(mo34610i);
            return mo34610i + i2;
        }
        return 0;
    }

    /* renamed from: r2 */
    private int m35393r2(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, boolean z) {
        int mo34606m;
        int mo34606m2 = i - this.f4835M.mo34606m();
        if (mo34606m2 > 0) {
            int i2 = -m35426H2(mo34606m2, c1647w, c1614b0);
            int i3 = i + i2;
            if (!z || (mo34606m = i3 - this.f4835M.mo34606m()) <= 0) {
                return i2;
            }
            this.f4835M.mo34602r(-mo34606m);
            return i2 - mo34606m;
        }
        return 0;
    }

    /* renamed from: s2 */
    private View m35392s2() {
        return m35145S(this.f4838P ? 0 : m35142T() - 1);
    }

    /* renamed from: t2 */
    private View m35391t2() {
        return m35145S(this.f4838P ? m35142T() - 1 : 0);
    }

    /* renamed from: z2 */
    private void m35385z2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, int i, int i2) {
        if (!c1614b0.m35212g() || m35142T() == 0 || c1614b0.m35214e() || !mo34991U1()) {
            return;
        }
        List<RecyclerView.AbstractC1620e0> m35039k = c1647w.m35039k();
        int size = m35039k.size();
        int m35110n0 = m35110n0(m35145S(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.AbstractC1620e0 abstractC1620e0 = m35039k.get(i5);
            if (!abstractC1620e0.isRemoved()) {
                if (((abstractC1620e0.getLayoutPosition() < m35110n0) != this.f4838P ? (char) 65535 : (char) 1) == 65535) {
                    i3 += this.f4835M.mo34614e(abstractC1620e0.itemView);
                } else {
                    i4 += this.f4835M.mo34614e(abstractC1620e0.itemView);
                }
            }
        }
        this.f4834L.f4869l = m35039k;
        if (i3 > 0) {
            m35416R2(m35110n0(m35391t2()), i);
            C1606c c1606c = this.f4834L;
            c1606c.f4865h = i3;
            c1606c.f4860c = 0;
            c1606c.m35378a();
            m35407d2(c1647w, this.f4834L, c1614b0, false);
        }
        if (i4 > 0) {
            m35418P2(m35110n0(m35392s2()), i2);
            C1606c c1606c2 = this.f4834L;
            c1606c2.f4865h = i4;
            c1606c2.f4860c = 0;
            c1606c2.m35378a();
            m35407d2(c1647w, this.f4834L, c1614b0, false);
        }
        this.f4834L.f4869l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: A */
    public int mo32378A(RecyclerView.C1614b0 c1614b0) {
        return m35413X1(c1614b0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A2 */
    public void mo35433A2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, C1604a c1604a, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: B */
    public int mo32376B(RecyclerView.C1614b0 c1614b0) {
        return m35412Y1(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: C */
    public int mo32374C(RecyclerView.C1614b0 c1614b0) {
        return m35411Z1(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: D */
    public int mo32372D(RecyclerView.C1614b0 c1614b0) {
        return m35413X1(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: E */
    public int mo32369E(RecyclerView.C1614b0 c1614b0) {
        return m35412Y1(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: E1 */
    public int mo32368E1(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        if (this.f4833K == 1) {
            return 0;
        }
        return m35426H2(i, c1647w, c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: F */
    public int mo32366F(RecyclerView.C1614b0 c1614b0) {
        return m35411Z1(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: F1 */
    public void mo32365F1(int i) {
        this.f4841S = i;
        this.f4842T = Integer.MIN_VALUE;
        C1607d c1607d = this.f4844V;
        if (c1607d != null) {
            c1607d.m35371b();
        }
        m35175B1();
    }

    /* renamed from: F2 */
    boolean m35428F2() {
        return this.f4835M.mo34608k() == 0 && this.f4835M.mo34611h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: G1 */
    public int mo32363G1(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        if (this.f4833K == 0) {
            return 0;
        }
        return m35426H2(i, c1647w, c1614b0);
    }

    /* renamed from: H2 */
    int m35426H2(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0 || i == 0) {
            return 0;
        }
        m35408c2();
        this.f4834L.f4858a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m35419O2(i2, abs, true, c1614b0);
        C1606c c1606c = this.f4834L;
        int m35407d2 = c1606c.f4864g + m35407d2(c1647w, c1606c, c1614b0, false);
        if (m35407d2 < 0) {
            return 0;
        }
        if (abs > m35407d2) {
            i = i2 * m35407d2;
        }
        this.f4835M.mo34602r(-i);
        this.f4834L.f4868k = i;
        return i;
    }

    /* renamed from: I2 */
    public void m35425I2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo34960q(null);
        if (i != this.f4833K || this.f4835M == null) {
            AbstractC1744u m34619b = AbstractC1744u.m34619b(this, i);
            this.f4835M = m34619b;
            this.f4845W.f4849a = m34619b;
            this.f4833K = i;
            m35175B1();
        }
    }

    /* renamed from: J2 */
    public void m35424J2(boolean z) {
        mo34960q(null);
        if (z == this.f4837O) {
            return;
        }
        this.f4837O = z;
        m35175B1();
    }

    /* renamed from: K2 */
    public void mo35423K2(boolean z) {
        mo34960q(null);
        if (this.f4839Q == z) {
            return;
        }
        this.f4839Q = z;
        m35175B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: M */
    public View mo35155M(int i) {
        int m35142T = m35142T();
        if (m35142T == 0) {
            return null;
        }
        int m35110n0 = i - m35110n0(m35145S(0));
        if (m35110n0 >= 0 && m35110n0 < m35142T) {
            View m35145S = m35145S(m35110n0);
            if (m35110n0(m35145S) == i) {
                return m35145S;
            }
        }
        return super.mo35155M(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: N */
    public RecyclerView.C1640q mo32354N() {
        return new RecyclerView.C1640q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: P0 */
    public void mo32348P0(RecyclerView recyclerView, RecyclerView.C1647w c1647w) {
        super.mo32348P0(recyclerView, c1647w);
        if (this.f4843U) {
            m35096s1(c1647w);
            c1647w.m35047c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: P1 */
    boolean mo35149P1() {
        return (m35122h0() == 1073741824 || m35090v0() == 1073741824 || !m35088w0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: Q0 */
    public View mo34997Q0(View view, int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        int m35410a2;
        View m35397n2;
        View m35392s2;
        m35427G2();
        if (m35142T() == 0 || (m35410a2 = m35410a2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m35408c2();
        m35419O2(m35410a2, (int) (this.f4835M.mo34605n() * 0.33333334f), false, c1614b0);
        C1606c c1606c = this.f4834L;
        c1606c.f4864g = Integer.MIN_VALUE;
        c1606c.f4858a = false;
        m35407d2(c1647w, c1606c, c1614b0, true);
        if (m35410a2 == -1) {
            m35397n2 = m35396o2();
        } else {
            m35397n2 = m35397n2();
        }
        if (m35410a2 == -1) {
            m35392s2 = m35391t2();
        } else {
            m35392s2 = m35392s2();
        }
        if (m35392s2.hasFocusable()) {
            if (m35397n2 == null) {
                return null;
            }
            return m35392s2;
        }
        return m35397n2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: R0 */
    public void mo34995R0(AccessibilityEvent accessibilityEvent) {
        super.mo34995R0(accessibilityEvent);
        if (m35142T() > 0) {
            accessibilityEvent.setFromIndex(m35402i2());
            accessibilityEvent.setToIndex(m35400k2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: R1 */
    public void mo27028R1(RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0, int i) {
        C1734o c1734o = new C1734o(recyclerView.getContext());
        c1734o.m35226p(i);
        m35143S1(c1734o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: U1 */
    public boolean mo34991U1() {
        return this.f4844V == null && this.f4836N == this.f4839Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V1 */
    public void mo27089V1(RecyclerView.C1614b0 c1614b0, int[] iArr) {
        int i;
        int m35390u2 = m35390u2(c1614b0);
        if (this.f4834L.f4863f == -1) {
            i = 0;
        } else {
            i = m35390u2;
            m35390u2 = 0;
        }
        iArr[0] = m35390u2;
        iArr[1] = i;
    }

    /* renamed from: W1 */
    void mo35414W1(RecyclerView.C1614b0 c1614b0, C1606c c1606c, RecyclerView.AbstractC1635p.InterfaceC1638c interfaceC1638c) {
        int i = c1606c.f4861d;
        if (i < 0 || i >= c1614b0.m35217b()) {
            return;
        }
        interfaceC1638c.mo34667a(i, Math.max(0, c1606c.f4864g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1610a0.InterfaceC1612b
    /* renamed from: a */
    public PointF mo32334a(int i) {
        if (m35142T() == 0) {
            return null;
        }
        int i2 = (i < m35110n0(m35145S(0))) != this.f4838P ? -1 : 1;
        if (this.f4833K == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a2 */
    public int m35410a2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f4833K == 1) ? 1 : Integer.MIN_VALUE : this.f4833K == 0 ? 1 : Integer.MIN_VALUE : this.f4833K == 1 ? -1 : Integer.MIN_VALUE : this.f4833K == 0 ? -1 : Integer.MIN_VALUE : (this.f4833K != 1 && m35388w2()) ? -1 : 1 : (this.f4833K != 1 && m35388w2()) ? 1 : -1;
    }

    /* renamed from: b2 */
    C1606c m35409b2() {
        return new C1606c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c2 */
    public void m35408c2() {
        if (this.f4834L == null) {
            this.f4834L = m35409b2();
        }
    }

    /* renamed from: d2 */
    int m35407d2(RecyclerView.C1647w c1647w, C1606c c1606c, RecyclerView.C1614b0 c1614b0, boolean z) {
        int i = c1606c.f4860c;
        int i2 = c1606c.f4864g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c1606c.f4864g = i2 + i;
            }
            m35432B2(c1647w, c1606c);
        }
        int i3 = c1606c.f4860c + c1606c.f4865h;
        C1605b c1605b = this.f4846X;
        while (true) {
            if ((!c1606c.f4870m && i3 <= 0) || !c1606c.m35376c(c1614b0)) {
                break;
            }
            c1605b.m35379a();
            mo35386y2(c1647w, c1614b0, c1606c, c1605b);
            if (!c1605b.f4855b) {
                c1606c.f4859b += c1605b.f4854a * c1606c.f4863f;
                if (!c1605b.f4856c || c1606c.f4869l != null || !c1614b0.m35214e()) {
                    int i4 = c1606c.f4860c;
                    int i5 = c1605b.f4854a;
                    c1606c.f4860c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c1606c.f4864g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + c1605b.f4854a;
                    c1606c.f4864g = i7;
                    int i8 = c1606c.f4860c;
                    if (i8 < 0) {
                        c1606c.f4864g = i7 + i8;
                    }
                    m35432B2(c1647w, c1606c);
                }
                if (z && c1605b.f4857d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c1606c.f4860c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: e1 */
    public void mo32325e1(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        int i;
        int i2;
        int i3;
        int i4;
        int m35394q2;
        int i5;
        View mo35155M;
        int mo34612g;
        int i6;
        int i7 = -1;
        if ((this.f4844V != null || this.f4841S != -1) && c1614b0.m35217b() == 0) {
            m35096s1(c1647w);
            return;
        }
        C1607d c1607d = this.f4844V;
        if (c1607d != null && c1607d.m35372a()) {
            this.f4841S = this.f4844V.f4871c;
        }
        m35408c2();
        this.f4834L.f4858a = false;
        m35427G2();
        View m35125f0 = m35125f0();
        if (this.f4845W.f4853e && this.f4841S == -1 && this.f4844V == null) {
            if (m35125f0 != null && (this.f4835M.mo34612g(m35125f0) >= this.f4835M.mo34610i() || this.f4835M.mo34615d(m35125f0) <= this.f4835M.mo34606m())) {
                this.f4845W.m35382c(m35125f0, m35110n0(m35125f0));
            }
        } else {
            this.f4845W.m35380e();
            C1604a c1604a = this.f4845W;
            c1604a.f4852d = this.f4838P ^ this.f4839Q;
            m35420N2(c1647w, c1614b0, c1604a);
            this.f4845W.f4853e = true;
        }
        C1606c c1606c = this.f4834L;
        c1606c.f4863f = c1606c.f4868k >= 0 ? 1 : -1;
        int[] iArr = this.f4848Z;
        iArr[0] = 0;
        iArr[1] = 0;
        mo27089V1(c1614b0, iArr);
        int max = Math.max(0, this.f4848Z[0]) + this.f4835M.mo34606m();
        int max2 = Math.max(0, this.f4848Z[1]) + this.f4835M.mo34609j();
        if (c1614b0.m35214e() && (i5 = this.f4841S) != -1 && this.f4842T != Integer.MIN_VALUE && (mo35155M = mo35155M(i5)) != null) {
            if (this.f4838P) {
                i6 = this.f4835M.mo34610i() - this.f4835M.mo34615d(mo35155M);
                mo34612g = this.f4842T;
            } else {
                mo34612g = this.f4835M.mo34612g(mo35155M) - this.f4835M.mo34606m();
                i6 = this.f4842T;
            }
            int i8 = i6 - mo34612g;
            if (i8 > 0) {
                max += i8;
            } else {
                max2 -= i8;
            }
        }
        if (!this.f4845W.f4852d ? !this.f4838P : this.f4838P) {
            i7 = 1;
        }
        mo35433A2(c1647w, c1614b0, this.f4845W, i7);
        m35168G(c1647w);
        this.f4834L.f4870m = m35428F2();
        this.f4834L.f4867j = c1614b0.m35214e();
        this.f4834L.f4866i = 0;
        C1604a c1604a2 = this.f4845W;
        if (c1604a2.f4852d) {
            m35415S2(c1604a2);
            C1606c c1606c2 = this.f4834L;
            c1606c2.f4865h = max;
            m35407d2(c1647w, c1606c2, c1614b0, false);
            C1606c c1606c3 = this.f4834L;
            i2 = c1606c3.f4859b;
            int i9 = c1606c3.f4861d;
            int i10 = c1606c3.f4860c;
            if (i10 > 0) {
                max2 += i10;
            }
            m35417Q2(this.f4845W);
            C1606c c1606c4 = this.f4834L;
            c1606c4.f4865h = max2;
            c1606c4.f4861d += c1606c4.f4862e;
            m35407d2(c1647w, c1606c4, c1614b0, false);
            C1606c c1606c5 = this.f4834L;
            i = c1606c5.f4859b;
            int i11 = c1606c5.f4860c;
            if (i11 > 0) {
                m35416R2(i9, i2);
                C1606c c1606c6 = this.f4834L;
                c1606c6.f4865h = i11;
                m35407d2(c1647w, c1606c6, c1614b0, false);
                i2 = this.f4834L.f4859b;
            }
        } else {
            m35417Q2(c1604a2);
            C1606c c1606c7 = this.f4834L;
            c1606c7.f4865h = max2;
            m35407d2(c1647w, c1606c7, c1614b0, false);
            C1606c c1606c8 = this.f4834L;
            i = c1606c8.f4859b;
            int i12 = c1606c8.f4861d;
            int i13 = c1606c8.f4860c;
            if (i13 > 0) {
                max += i13;
            }
            m35415S2(this.f4845W);
            C1606c c1606c9 = this.f4834L;
            c1606c9.f4865h = max;
            c1606c9.f4861d += c1606c9.f4862e;
            m35407d2(c1647w, c1606c9, c1614b0, false);
            C1606c c1606c10 = this.f4834L;
            i2 = c1606c10.f4859b;
            int i14 = c1606c10.f4860c;
            if (i14 > 0) {
                m35418P2(i12, i);
                C1606c c1606c11 = this.f4834L;
                c1606c11.f4865h = i14;
                m35407d2(c1647w, c1606c11, c1614b0, false);
                i = this.f4834L.f4859b;
            }
        }
        if (m35142T() > 0) {
            if (this.f4838P ^ this.f4839Q) {
                int m35394q22 = m35394q2(i, c1647w, c1614b0, true);
                i3 = i2 + m35394q22;
                i4 = i + m35394q22;
                m35394q2 = m35393r2(i3, c1647w, c1614b0, false);
            } else {
                int m35393r2 = m35393r2(i2, c1647w, c1614b0, true);
                i3 = i2 + m35393r2;
                i4 = i + m35393r2;
                m35394q2 = m35394q2(i4, c1647w, c1614b0, false);
            }
            i2 = i3 + m35394q2;
            i = i4 + m35394q2;
        }
        m35385z2(c1647w, c1614b0, i2, i);
        if (!c1614b0.m35214e()) {
            this.f4835M.m34616s();
        } else {
            this.f4845W.m35380e();
        }
        this.f4836N = this.f4839Q;
    }

    /* renamed from: e2 */
    public int m35406e2() {
        View m35398m2 = m35398m2(0, m35142T(), true, false);
        if (m35398m2 == null) {
            return -1;
        }
        return m35110n0(m35398m2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: f1 */
    public void mo32323f1(RecyclerView.C1614b0 c1614b0) {
        super.mo32323f1(c1614b0);
        this.f4844V = null;
        this.f4841S = -1;
        this.f4842T = Integer.MIN_VALUE;
        this.f4845W.m35380e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2 */
    public View m35404g2(boolean z, boolean z2) {
        if (this.f4838P) {
            return m35398m2(0, m35142T(), z, z2);
        }
        return m35398m2(m35142T() - 1, -1, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h2 */
    public View m35403h2(boolean z, boolean z2) {
        if (this.f4838P) {
            return m35398m2(m35142T() - 1, -1, z, z2);
        }
        return m35398m2(0, m35142T(), z, z2);
    }

    /* renamed from: i2 */
    public int m35402i2() {
        View m35398m2 = m35398m2(0, m35142T(), false, true);
        if (m35398m2 == null) {
            return -1;
        }
        return m35110n0(m35398m2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: j1 */
    public void mo32318j1(Parcelable parcelable) {
        if (parcelable instanceof C1607d) {
            C1607d c1607d = (C1607d) parcelable;
            this.f4844V = c1607d;
            if (this.f4841S != -1) {
                c1607d.m35371b();
            }
            m35175B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: k1 */
    public Parcelable mo32316k1() {
        if (this.f4844V != null) {
            return new C1607d(this.f4844V);
        }
        C1607d c1607d = new C1607d();
        if (m35142T() > 0) {
            m35408c2();
            boolean z = this.f4836N ^ this.f4838P;
            c1607d.f4873e = z;
            if (z) {
                View m35392s2 = m35392s2();
                c1607d.f4872d = this.f4835M.mo34610i() - this.f4835M.mo34615d(m35392s2);
                c1607d.f4871c = m35110n0(m35392s2);
            } else {
                View m35391t2 = m35391t2();
                c1607d.f4871c = m35110n0(m35391t2);
                c1607d.f4872d = this.f4835M.mo34612g(m35391t2) - this.f4835M.mo34606m();
            }
        } else {
            c1607d.m35371b();
        }
        return c1607d;
    }

    /* renamed from: k2 */
    public int m35400k2() {
        View m35398m2 = m35398m2(m35142T() - 1, -1, false, true);
        if (m35398m2 == null) {
            return -1;
        }
        return m35110n0(m35398m2);
    }

    /* renamed from: l2 */
    View m35399l2(int i, int i2) {
        int i3;
        int i4;
        m35408c2();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m35145S(i);
        }
        if (this.f4835M.mo34612g(m35145S(i)) < this.f4835M.mo34606m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.f4833K == 0) {
            return this.f5032w.m34862a(i, i2, i3, i4);
        }
        return this.f5033x.m34862a(i, i2, i3, i4);
    }

    /* renamed from: m2 */
    View m35398m2(int i, int i2, boolean z, boolean z2) {
        m35408c2();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.f4833K == 0) {
            return this.f5032w.m34862a(i, i2, i3, i4);
        }
        return this.f5033x.m34862a(i, i2, i3, i4);
    }

    /* renamed from: p2 */
    View mo35395p2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, boolean z, boolean z2) {
        int i;
        int i2;
        m35408c2();
        int m35142T = m35142T();
        int i3 = -1;
        if (z2) {
            i = m35142T() - 1;
            i2 = -1;
        } else {
            i3 = m35142T;
            i = 0;
            i2 = 1;
        }
        int m35217b = c1614b0.m35217b();
        int mo34606m = this.f4835M.mo34606m();
        int mo34610i = this.f4835M.mo34610i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i != i3) {
            View m35145S = m35145S(i);
            int m35110n0 = m35110n0(m35145S);
            int mo34612g = this.f4835M.mo34612g(m35145S);
            int mo34615d = this.f4835M.mo34615d(m35145S);
            if (m35110n0 >= 0 && m35110n0 < m35217b) {
                if (!((RecyclerView.C1640q) m35145S.getLayoutParams()).m35077c()) {
                    boolean z3 = mo34615d <= mo34606m && mo34612g < mo34606m;
                    boolean z4 = mo34612g >= mo34610i && mo34615d > mo34610i;
                    if (!z3 && !z4) {
                        return m35145S;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = m35145S;
                        }
                        view2 = m35145S;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = m35145S;
                        }
                        view2 = m35145S;
                    }
                } else if (view3 == null) {
                    view3 = m35145S;
                }
            }
            i += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: q */
    public void mo34960q(String str) {
        if (this.f4844V == null) {
            super.mo34960q(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: u */
    public boolean mo32305u() {
        return this.f4833K == 0;
    }

    @Deprecated
    /* renamed from: u2 */
    protected int m35390u2(RecyclerView.C1614b0 c1614b0) {
        if (c1614b0.m35215d()) {
            return this.f4835M.mo34605n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: v */
    public boolean mo32303v() {
        return this.f4833K == 1;
    }

    /* renamed from: v2 */
    public int m35389v2() {
        return this.f4833K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w2 */
    public boolean m35388w2() {
        return m35118j0() == 1;
    }

    /* renamed from: x2 */
    public boolean m35387x2() {
        return this.f4840R;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: y */
    public void mo34951y(int i, int i2, RecyclerView.C1614b0 c1614b0, RecyclerView.AbstractC1635p.InterfaceC1638c interfaceC1638c) {
        if (this.f4833K != 0) {
            i = i2;
        }
        if (m35142T() == 0 || i == 0) {
            return;
        }
        m35408c2();
        m35419O2(i > 0 ? 1 : -1, Math.abs(i), true, c1614b0);
        mo35414W1(c1614b0, this.f4834L, interfaceC1638c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: y0 */
    public boolean mo34950y0() {
        return true;
    }

    /* renamed from: y2 */
    void mo35386y2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, C1606c c1606c, C1605b c1605b) {
        int i;
        int i2;
        int i3;
        int i4;
        int mo34613f;
        View m35375d = c1606c.m35375d(c1647w);
        if (m35375d == null) {
            c1605b.f4855b = true;
            return;
        }
        RecyclerView.C1640q c1640q = (RecyclerView.C1640q) m35375d.getLayoutParams();
        if (c1606c.f4869l == null) {
            if (this.f4838P == (c1606c.f4863f == -1)) {
                m35111n(m35375d);
            } else {
                m35108o(m35375d, 0);
            }
        } else {
            if (this.f4838P == (c1606c.f4863f == -1)) {
                m35116l(m35375d);
            } else {
                m35114m(m35375d, 0);
            }
        }
        m35165H0(m35375d, 0, 0);
        c1605b.f4854a = this.f4835M.mo34614e(m35375d);
        if (this.f4833K == 1) {
            if (m35388w2()) {
                mo34613f = m35092u0() - getPaddingRight();
                i4 = mo34613f - this.f4835M.mo34613f(m35375d);
            } else {
                i4 = getPaddingLeft();
                mo34613f = this.f4835M.mo34613f(m35375d) + i4;
            }
            if (c1606c.f4863f == -1) {
                int i5 = c1606c.f4859b;
                i3 = i5;
                i2 = mo34613f;
                i = i5 - c1605b.f4854a;
            } else {
                int i6 = c1606c.f4859b;
                i = i6;
                i2 = mo34613f;
                i3 = c1605b.f4854a + i6;
            }
        } else {
            int paddingTop = getPaddingTop();
            int mo34613f2 = this.f4835M.mo34613f(m35375d) + paddingTop;
            if (c1606c.f4863f == -1) {
                int i7 = c1606c.f4859b;
                i2 = i7;
                i = paddingTop;
                i3 = mo34613f2;
                i4 = i7 - c1605b.f4854a;
            } else {
                int i8 = c1606c.f4859b;
                i = paddingTop;
                i2 = c1605b.f4854a + i8;
                i3 = mo34613f2;
                i4 = i8;
            }
        }
        m35167G0(m35375d, i4, i, i2, i3);
        if (c1640q.m35077c() || c1640q.m35078b()) {
            c1605b.f4856c = true;
        }
        c1605b.f4857d = m35375d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: z */
    public void mo35082z(int i, RecyclerView.AbstractC1635p.InterfaceC1638c interfaceC1638c) {
        boolean z;
        int i2;
        C1607d c1607d = this.f4844V;
        if (c1607d != null && c1607d.m35372a()) {
            C1607d c1607d2 = this.f4844V;
            z = c1607d2.f4873e;
            i2 = c1607d2.f4871c;
        } else {
            m35427G2();
            z = this.f4838P;
            i2 = this.f4841S;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f4847Y && i2 >= 0 && i2 < i; i4++) {
            interfaceC1638c.mo34667a(i2, 0);
            i2 += i3;
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f4833K = 1;
        this.f4837O = false;
        this.f4838P = false;
        this.f4839Q = false;
        this.f4840R = true;
        this.f4841S = -1;
        this.f4842T = Integer.MIN_VALUE;
        this.f4844V = null;
        this.f4845W = new C1604a();
        this.f4846X = new C1605b();
        this.f4847Y = 2;
        this.f4848Z = new int[2];
        m35425I2(i);
        m35424J2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4833K = 1;
        this.f4837O = false;
        this.f4838P = false;
        this.f4839Q = false;
        this.f4840R = true;
        this.f4841S = -1;
        this.f4842T = Integer.MIN_VALUE;
        this.f4844V = null;
        this.f4845W = new C1604a();
        this.f4846X = new C1605b();
        this.f4847Y = 2;
        this.f4848Z = new int[2];
        RecyclerView.AbstractC1635p.C1639d m35107o0 = RecyclerView.AbstractC1635p.m35107o0(context, attributeSet, i, i2);
        m35425I2(m35107o0.f5038a);
        m35424J2(m35107o0.f5040c);
        mo35423K2(m35107o0.f5041d);
    }
}
