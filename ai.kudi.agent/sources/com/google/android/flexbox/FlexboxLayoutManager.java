package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1744u;
import androidx.recyclerview.widget.C1734o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C2690d;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class FlexboxLayoutManager extends RecyclerView.AbstractC1635p implements InterfaceC2687a, RecyclerView.AbstractC1610a0.InterfaceC1612b {

    /* renamed from: k0 */
    private static final Rect f7525k0 = new Rect();

    /* renamed from: K */
    private int f7526K;

    /* renamed from: L */
    private int f7527L;

    /* renamed from: M */
    private int f7528M;

    /* renamed from: N */
    private int f7529N;

    /* renamed from: P */
    private boolean f7531P;

    /* renamed from: Q */
    private boolean f7532Q;

    /* renamed from: T */
    private RecyclerView.C1647w f7535T;

    /* renamed from: U */
    private RecyclerView.C1614b0 f7536U;

    /* renamed from: V */
    private C2684d f7537V;

    /* renamed from: X */
    private AbstractC1744u f7539X;

    /* renamed from: Y */
    private AbstractC1744u f7540Y;

    /* renamed from: Z */
    private C2685e f7541Z;

    /* renamed from: e0 */
    private boolean f7546e0;

    /* renamed from: g0 */
    private final Context f7548g0;

    /* renamed from: h0 */
    private View f7549h0;

    /* renamed from: O */
    private int f7530O = -1;

    /* renamed from: R */
    private List<C2689c> f7533R = new ArrayList();

    /* renamed from: S */
    private final C2690d f7534S = new C2690d(this);

    /* renamed from: W */
    private C2681b f7538W = new C2681b();

    /* renamed from: a0 */
    private int f7542a0 = -1;

    /* renamed from: b0 */
    private int f7543b0 = Integer.MIN_VALUE;

    /* renamed from: c0 */
    private int f7544c0 = Integer.MIN_VALUE;

    /* renamed from: d0 */
    private int f7545d0 = Integer.MIN_VALUE;

    /* renamed from: f0 */
    private SparseArray<View> f7547f0 = new SparseArray<>();

    /* renamed from: i0 */
    private int f7550i0 = -1;

    /* renamed from: j0 */
    private C2690d.C2692b f7551j0 = new C2690d.C2692b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    /* loaded from: classes2.dex */
    public class C2681b {

        /* renamed from: a */
        private int f7552a;

        /* renamed from: b */
        private int f7553b;

        /* renamed from: c */
        private int f7554c;

        /* renamed from: d */
        private int f7555d;

        /* renamed from: e */
        private boolean f7556e;

        /* renamed from: f */
        private boolean f7557f;

        /* renamed from: g */
        private boolean f7558g;

        private C2681b() {
            this.f7555d = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public void m32280q() {
            if (!FlexboxLayoutManager.this.mo32234j() && FlexboxLayoutManager.this.f7531P) {
                this.f7554c = this.f7556e ? FlexboxLayoutManager.this.f7539X.mo34610i() : FlexboxLayoutManager.this.m35092u0() - FlexboxLayoutManager.this.f7539X.mo34606m();
            } else {
                this.f7554c = this.f7556e ? FlexboxLayoutManager.this.f7539X.mo34610i() : FlexboxLayoutManager.this.f7539X.mo34606m();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public void m32279r(View view) {
            if (!FlexboxLayoutManager.this.mo32234j() && FlexboxLayoutManager.this.f7531P) {
                if (this.f7556e) {
                    this.f7554c = FlexboxLayoutManager.this.f7539X.mo34612g(view) + FlexboxLayoutManager.this.f7539X.m34617o();
                } else {
                    this.f7554c = FlexboxLayoutManager.this.f7539X.mo34615d(view);
                }
            } else if (this.f7556e) {
                this.f7554c = FlexboxLayoutManager.this.f7539X.mo34615d(view) + FlexboxLayoutManager.this.f7539X.m34617o();
            } else {
                this.f7554c = FlexboxLayoutManager.this.f7539X.mo34612g(view);
            }
            this.f7552a = FlexboxLayoutManager.this.m35110n0(view);
            this.f7558g = false;
            int[] iArr = FlexboxLayoutManager.this.f7534S.f7599c;
            int i = this.f7552a;
            if (i == -1) {
                i = 0;
            }
            int i2 = iArr[i];
            this.f7553b = i2 != -1 ? i2 : 0;
            if (FlexboxLayoutManager.this.f7533R.size() > this.f7553b) {
                this.f7552a = ((C2689c) FlexboxLayoutManager.this.f7533R.get(this.f7553b)).f7595o;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m32278s() {
            this.f7552a = -1;
            this.f7553b = -1;
            this.f7554c = Integer.MIN_VALUE;
            this.f7557f = false;
            this.f7558g = false;
            if (FlexboxLayoutManager.this.mo32234j()) {
                if (FlexboxLayoutManager.this.f7527L == 0) {
                    this.f7556e = FlexboxLayoutManager.this.f7526K == 1;
                } else {
                    this.f7556e = FlexboxLayoutManager.this.f7527L == 2;
                }
            } else if (FlexboxLayoutManager.this.f7527L == 0) {
                this.f7556e = FlexboxLayoutManager.this.f7526K == 3;
            } else {
                this.f7556e = FlexboxLayoutManager.this.f7527L == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f7552a + ", mFlexLinePosition=" + this.f7553b + ", mCoordinate=" + this.f7554c + ", mPerpendicularCoordinate=" + this.f7555d + ", mLayoutFromEnd=" + this.f7556e + ", mValid=" + this.f7557f + ", mAssignedFromSavedState=" + this.f7558g + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$d */
    /* loaded from: classes2.dex */
    public static class C2684d {

        /* renamed from: a */
        private int f7569a;

        /* renamed from: b */
        private boolean f7570b;

        /* renamed from: c */
        private int f7571c;

        /* renamed from: d */
        private int f7572d;

        /* renamed from: e */
        private int f7573e;

        /* renamed from: f */
        private int f7574f;

        /* renamed from: g */
        private int f7575g;

        /* renamed from: h */
        private int f7576h;

        /* renamed from: i */
        private int f7577i;

        /* renamed from: j */
        private boolean f7578j;

        private C2684d() {
            this.f7576h = 1;
            this.f7577i = 1;
        }

        /* renamed from: i */
        static /* synthetic */ int m32267i(C2684d c2684d) {
            int i = c2684d.f7571c;
            c2684d.f7571c = i + 1;
            return i;
        }

        /* renamed from: j */
        static /* synthetic */ int m32266j(C2684d c2684d) {
            int i = c2684d.f7571c;
            c2684d.f7571c = i - 1;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public boolean m32253w(RecyclerView.C1614b0 c1614b0, List<C2689c> list) {
            int i;
            int i2 = this.f7572d;
            return i2 >= 0 && i2 < c1614b0.m35217b() && (i = this.f7571c) >= 0 && i < list.size();
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f7569a + ", mFlexLinePosition=" + this.f7571c + ", mPosition=" + this.f7572d + ", mOffset=" + this.f7573e + ", mScrollingOffset=" + this.f7574f + ", mLastScrollDelta=" + this.f7575g + ", mItemDirection=" + this.f7576h + ", mLayoutDirection=" + this.f7577i + '}';
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC1635p.C1639d m35107o0 = RecyclerView.AbstractC1635p.m35107o0(context, attributeSet, i, i2);
        int i3 = m35107o0.f5038a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (m35107o0.f5040c) {
                    m32355M2(3);
                } else {
                    m32355M2(2);
                }
            }
        } else if (m35107o0.f5040c) {
            m32355M2(1);
        } else {
            m32355M2(0);
        }
        m32352N2(1);
        m32356L2(4);
        m35164H1(true);
        this.f7548g0 = context;
    }

    /* renamed from: A2 */
    private int m32377A2(int i) {
        int i2;
        if (m35142T() == 0 || i == 0) {
            return 0;
        }
        m32319i2();
        boolean mo32234j = mo32234j();
        View view = this.f7549h0;
        int width = mo32234j ? view.getWidth() : view.getHeight();
        int m35092u0 = mo32234j ? m35092u0() : m35124g0();
        if (m35118j0() == 1) {
            int abs = Math.abs(i);
            if (i >= 0) {
                if (this.f7538W.f7555d + i <= 0) {
                    return i;
                }
                i2 = this.f7538W.f7555d;
            } else {
                i2 = Math.min((m35092u0 + this.f7538W.f7555d) - width, abs);
            }
        } else if (i <= 0) {
            if (this.f7538W.f7555d + i >= 0) {
                return i;
            }
            i2 = this.f7538W.f7555d;
        } else {
            return Math.min((m35092u0 - this.f7538W.f7555d) - width, i);
        }
        return -i2;
    }

    /* renamed from: B2 */
    private boolean m32375B2(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int m35092u0 = m35092u0() - getPaddingRight();
        int m35124g0 = m35124g0() - getPaddingBottom();
        int m32300w2 = m32300w2(view);
        int m32298y2 = m32298y2(view);
        int m32299x2 = m32299x2(view);
        int m32304u2 = m32304u2(view);
        return z ? (paddingLeft <= m32300w2 && m35092u0 >= m32299x2) && (paddingTop <= m32298y2 && m35124g0 >= m32304u2) : (m32300w2 >= m35092u0 || m32299x2 >= paddingLeft) && (m32298y2 >= m35124g0 || m32304u2 >= paddingTop);
    }

    /* renamed from: C2 */
    private int m32373C2(C2689c c2689c, C2684d c2684d) {
        if (mo32234j()) {
            return m32370D2(c2689c, c2684d);
        }
        return m32367E2(c2689c, c2684d);
    }

    /* renamed from: D0 */
    private static boolean m32371D0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            } else if (mode != 0) {
                return mode == 1073741824 && size == i;
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* renamed from: D2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m32370D2(com.google.android.flexbox.C2689c r22, com.google.android.flexbox.FlexboxLayoutManager.C2684d r23) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m32370D2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* renamed from: E2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m32367E2(com.google.android.flexbox.C2689c r26, com.google.android.flexbox.FlexboxLayoutManager.C2684d r27) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m32367E2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* renamed from: F2 */
    private void m32364F2(RecyclerView.C1647w c1647w, C2684d c2684d) {
        if (c2684d.f7578j) {
            if (c2684d.f7577i == -1) {
                m32361H2(c1647w, c2684d);
            } else {
                m32360I2(c1647w, c2684d);
            }
        }
    }

    /* renamed from: G2 */
    private void m32362G2(RecyclerView.C1647w c1647w, int i, int i2) {
        while (i2 >= i) {
            m35089v1(i2, c1647w);
            i2--;
        }
    }

    /* renamed from: H2 */
    private void m32361H2(RecyclerView.C1647w c1647w, C2684d c2684d) {
        if (c2684d.f7574f < 0) {
            return;
        }
        this.f7539X.mo34611h();
        int unused = c2684d.f7574f;
        int m35142T = m35142T();
        if (m35142T == 0) {
            return;
        }
        int i = m35142T - 1;
        int i2 = this.f7534S.f7599c[m35110n0(m35145S(i))];
        if (i2 == -1) {
            return;
        }
        C2689c c2689c = this.f7533R.get(i2);
        int i3 = i;
        while (true) {
            if (i3 < 0) {
                break;
            }
            View m35145S = m35145S(i3);
            if (!m32330b2(m35145S, c2684d.f7574f)) {
                break;
            }
            if (c2689c.f7595o == m35110n0(m35145S)) {
                if (i2 <= 0) {
                    m35142T = i3;
                    break;
                }
                i2 += c2684d.f7577i;
                c2689c = this.f7533R.get(i2);
                m35142T = i3;
            }
            i3--;
        }
        m32362G2(c1647w, m35142T, i);
    }

    /* renamed from: I2 */
    private void m32360I2(RecyclerView.C1647w c1647w, C2684d c2684d) {
        int m35142T;
        if (c2684d.f7574f >= 0 && (m35142T = m35142T()) != 0) {
            int i = this.f7534S.f7599c[m35110n0(m35145S(0))];
            int i2 = -1;
            if (i == -1) {
                return;
            }
            C2689c c2689c = this.f7533R.get(i);
            int i3 = 0;
            while (true) {
                if (i3 >= m35142T) {
                    break;
                }
                View m35145S = m35145S(i3);
                if (!m32328c2(m35145S, c2684d.f7574f)) {
                    break;
                }
                if (c2689c.f7596p == m35110n0(m35145S)) {
                    if (i >= this.f7533R.size() - 1) {
                        i2 = i3;
                        break;
                    }
                    i += c2684d.f7577i;
                    c2689c = this.f7533R.get(i);
                    i2 = i3;
                }
                i3++;
            }
            m32362G2(c1647w, 0, i2);
        }
    }

    /* renamed from: J2 */
    private void m32359J2() {
        int m35090v0;
        if (mo32234j()) {
            m35090v0 = m35122h0();
        } else {
            m35090v0 = m35090v0();
        }
        this.f7537V.f7570b = m35090v0 == 0 || m35090v0 == Integer.MIN_VALUE;
    }

    /* renamed from: K2 */
    private void m32358K2() {
        int m35118j0 = m35118j0();
        int i = this.f7526K;
        if (i == 0) {
            this.f7531P = m35118j0 == 1;
            this.f7532Q = this.f7527L == 2;
        } else if (i == 1) {
            this.f7531P = m35118j0 != 1;
            this.f7532Q = this.f7527L == 2;
        } else if (i == 2) {
            boolean z = m35118j0 == 1;
            this.f7531P = z;
            if (this.f7527L == 2) {
                this.f7531P = !z;
            }
            this.f7532Q = false;
        } else if (i != 3) {
            this.f7531P = false;
            this.f7532Q = false;
        } else {
            boolean z2 = m35118j0 == 1;
            this.f7531P = z2;
            if (this.f7527L == 2) {
                this.f7531P = !z2;
            }
            this.f7532Q = true;
        }
    }

    /* renamed from: O1 */
    private boolean m32350O1(View view, int i, int i2, RecyclerView.C1640q c1640q) {
        return (!view.isLayoutRequested() && m35174C0() && m32371D0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c1640q).width) && m32371D0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c1640q).height)) ? false : true;
    }

    /* renamed from: O2 */
    private boolean m32349O2(RecyclerView.C1614b0 c1614b0, C2681b c2681b) {
        View m32315k2;
        int mo34606m;
        boolean z = false;
        if (m35142T() == 0) {
            return false;
        }
        if (c2681b.f7556e) {
            m32315k2 = m32312n2(c1614b0.m35217b());
        } else {
            m32315k2 = m32315k2(c1614b0.m35217b());
        }
        if (m32315k2 != null) {
            c2681b.m32279r(m32315k2);
            if (!c1614b0.m35214e() && mo34991U1()) {
                if ((this.f7539X.mo34612g(m32315k2) >= this.f7539X.mo34610i() || this.f7539X.mo34615d(m32315k2) < this.f7539X.mo34606m()) ? true : true) {
                    if (c2681b.f7556e) {
                        mo34606m = this.f7539X.mo34610i();
                    } else {
                        mo34606m = this.f7539X.mo34606m();
                    }
                    c2681b.f7554c = mo34606m;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: P2 */
    private boolean m32347P2(RecyclerView.C1614b0 c1614b0, C2681b c2681b, C2685e c2685e) {
        int i;
        int mo34612g;
        if (!c1614b0.m35214e() && (i = this.f7542a0) != -1) {
            if (i >= 0 && i < c1614b0.m35217b()) {
                c2681b.f7552a = this.f7542a0;
                c2681b.f7553b = this.f7534S.f7599c[c2681b.f7552a];
                C2685e c2685e2 = this.f7541Z;
                if (c2685e2 != null && c2685e2.m32246g(c1614b0.m35217b())) {
                    c2681b.f7554c = this.f7539X.mo34606m() + c2685e.f7580d;
                    c2681b.f7558g = true;
                    c2681b.f7553b = -1;
                    return true;
                } else if (this.f7543b0 == Integer.MIN_VALUE) {
                    View mo35155M = mo35155M(this.f7542a0);
                    if (mo35155M != null) {
                        if (this.f7539X.mo34614e(mo35155M) > this.f7539X.mo34605n()) {
                            c2681b.m32280q();
                            return true;
                        } else if (this.f7539X.mo34612g(mo35155M) - this.f7539X.mo34606m() < 0) {
                            c2681b.f7554c = this.f7539X.mo34606m();
                            c2681b.f7556e = false;
                            return true;
                        } else if (this.f7539X.mo34610i() - this.f7539X.mo34615d(mo35155M) < 0) {
                            c2681b.f7554c = this.f7539X.mo34610i();
                            c2681b.f7556e = true;
                            return true;
                        } else {
                            if (c2681b.f7556e) {
                                mo34612g = this.f7539X.mo34615d(mo35155M) + this.f7539X.m34617o();
                            } else {
                                mo34612g = this.f7539X.mo34612g(mo35155M);
                            }
                            c2681b.f7554c = mo34612g;
                        }
                    } else {
                        if (m35142T() > 0) {
                            c2681b.f7556e = this.f7542a0 < m35110n0(m35145S(0));
                        }
                        c2681b.m32280q();
                    }
                    return true;
                } else {
                    if (mo32234j() || !this.f7531P) {
                        c2681b.f7554c = this.f7539X.mo34606m() + this.f7543b0;
                    } else {
                        c2681b.f7554c = this.f7543b0 - this.f7539X.mo34609j();
                    }
                    return true;
                }
            }
            this.f7542a0 = -1;
            this.f7543b0 = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: Q2 */
    private void m32346Q2(RecyclerView.C1614b0 c1614b0, C2681b c2681b) {
        if (m32347P2(c1614b0, c2681b, this.f7541Z) || m32349O2(c1614b0, c2681b)) {
            return;
        }
        c2681b.m32280q();
        c2681b.f7552a = 0;
        c2681b.f7553b = 0;
    }

    /* renamed from: R2 */
    private void m32345R2(int i) {
        int m32313m2 = m32313m2();
        int m32310p2 = m32310p2();
        if (i >= m32310p2) {
            return;
        }
        int m35142T = m35142T();
        this.f7534S.m32171t(m35142T);
        this.f7534S.m32170u(m35142T);
        this.f7534S.m32172s(m35142T);
        if (i >= this.f7534S.f7599c.length) {
            return;
        }
        this.f7550i0 = i;
        View m32302v2 = m32302v2();
        if (m32302v2 == null) {
            return;
        }
        if (m32313m2 > i || i > m32310p2) {
            this.f7542a0 = m35110n0(m32302v2);
            if (!mo32234j() && this.f7531P) {
                this.f7543b0 = this.f7539X.mo34615d(m32302v2) + this.f7539X.mo34609j();
            } else {
                this.f7543b0 = this.f7539X.mo34612g(m32302v2) - this.f7539X.mo34606m();
            }
        }
    }

    /* renamed from: S2 */
    private void m32344S2(int i) {
        int i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m35092u0(), m35090v0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m35124g0(), m35122h0());
        int m35092u0 = m35092u0();
        int m35124g0 = m35124g0();
        boolean z = true;
        if (mo32234j()) {
            int i3 = this.f7544c0;
            z = (i3 == Integer.MIN_VALUE || i3 == m35092u0) ? false : false;
            i2 = this.f7537V.f7570b ? this.f7548g0.getResources().getDisplayMetrics().heightPixels : this.f7537V.f7569a;
        } else {
            int i4 = this.f7545d0;
            z = (i4 == Integer.MIN_VALUE || i4 == m35124g0) ? false : false;
            if (!this.f7537V.f7570b) {
                i2 = this.f7537V.f7569a;
            } else {
                i2 = this.f7548g0.getResources().getDisplayMetrics().widthPixels;
            }
        }
        int i5 = i2;
        this.f7544c0 = m35092u0;
        this.f7545d0 = m35124g0;
        if (this.f7550i0 == -1 && (this.f7542a0 != -1 || z)) {
            if (this.f7538W.f7556e) {
                return;
            }
            this.f7533R.clear();
            this.f7551j0.m32164a();
            if (mo32234j()) {
                this.f7534S.m32186e(this.f7551j0, makeMeasureSpec, makeMeasureSpec2, i5, this.f7538W.f7552a, this.f7533R);
            } else {
                this.f7534S.m32183h(this.f7551j0, makeMeasureSpec, makeMeasureSpec2, i5, this.f7538W.f7552a, this.f7533R);
            }
            this.f7533R = this.f7551j0.f7602a;
            this.f7534S.m32175p(makeMeasureSpec, makeMeasureSpec2);
            this.f7534S.m32193W();
            C2681b c2681b = this.f7538W;
            c2681b.f7553b = this.f7534S.f7599c[c2681b.f7552a];
            this.f7537V.f7571c = this.f7538W.f7553b;
            return;
        }
        int i6 = this.f7550i0;
        int min = i6 != -1 ? Math.min(i6, this.f7538W.f7552a) : this.f7538W.f7552a;
        this.f7551j0.m32164a();
        if (mo32234j()) {
            if (this.f7533R.size() > 0) {
                this.f7534S.m32181j(this.f7533R, min);
                this.f7534S.m32189b(this.f7551j0, makeMeasureSpec, makeMeasureSpec2, i5, min, this.f7538W.f7552a, this.f7533R);
            } else {
                this.f7534S.m32172s(i);
                this.f7534S.m32187d(this.f7551j0, makeMeasureSpec, makeMeasureSpec2, i5, 0, this.f7533R);
            }
        } else if (this.f7533R.size() > 0) {
            this.f7534S.m32181j(this.f7533R, min);
            this.f7534S.m32189b(this.f7551j0, makeMeasureSpec2, makeMeasureSpec, i5, min, this.f7538W.f7552a, this.f7533R);
        } else {
            this.f7534S.m32172s(i);
            this.f7534S.m32184g(this.f7551j0, makeMeasureSpec, makeMeasureSpec2, i5, 0, this.f7533R);
        }
        this.f7533R = this.f7551j0.f7602a;
        this.f7534S.m32174q(makeMeasureSpec, makeMeasureSpec2, min);
        this.f7534S.m32192X(min);
    }

    /* renamed from: T2 */
    private void m32343T2(int i, int i2) {
        this.f7537V.f7577i = i;
        boolean mo32234j = mo32234j();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m35092u0(), m35090v0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m35124g0(), m35122h0());
        boolean z = !mo32234j && this.f7531P;
        if (i == 1) {
            View m35145S = m35145S(m35142T() - 1);
            this.f7537V.f7573e = this.f7539X.mo34615d(m35145S);
            int m35110n0 = m35110n0(m35145S);
            View m32311o2 = m32311o2(m35145S, this.f7533R.get(this.f7534S.f7599c[m35110n0]));
            this.f7537V.f7576h = 1;
            C2684d c2684d = this.f7537V;
            c2684d.f7572d = m35110n0 + c2684d.f7576h;
            if (this.f7534S.f7599c.length <= this.f7537V.f7572d) {
                this.f7537V.f7571c = -1;
            } else {
                C2684d c2684d2 = this.f7537V;
                c2684d2.f7571c = this.f7534S.f7599c[c2684d2.f7572d];
            }
            if (z) {
                this.f7537V.f7573e = this.f7539X.mo34612g(m32311o2);
                this.f7537V.f7574f = (-this.f7539X.mo34612g(m32311o2)) + this.f7539X.mo34606m();
                C2684d c2684d3 = this.f7537V;
                c2684d3.f7574f = c2684d3.f7574f >= 0 ? this.f7537V.f7574f : 0;
            } else {
                this.f7537V.f7573e = this.f7539X.mo34615d(m32311o2);
                this.f7537V.f7574f = this.f7539X.mo34615d(m32311o2) - this.f7539X.mo34610i();
            }
            if ((this.f7537V.f7571c == -1 || this.f7537V.f7571c > this.f7533R.size() - 1) && this.f7537V.f7572d <= getFlexItemCount()) {
                int i3 = i2 - this.f7537V.f7574f;
                this.f7551j0.m32164a();
                if (i3 > 0) {
                    if (mo32234j) {
                        this.f7534S.m32187d(this.f7551j0, makeMeasureSpec, makeMeasureSpec2, i3, this.f7537V.f7572d, this.f7533R);
                    } else {
                        this.f7534S.m32184g(this.f7551j0, makeMeasureSpec, makeMeasureSpec2, i3, this.f7537V.f7572d, this.f7533R);
                    }
                    this.f7534S.m32174q(makeMeasureSpec, makeMeasureSpec2, this.f7537V.f7572d);
                    this.f7534S.m32192X(this.f7537V.f7572d);
                }
            }
        } else {
            View m35145S2 = m35145S(0);
            this.f7537V.f7573e = this.f7539X.mo34612g(m35145S2);
            int m35110n02 = m35110n0(m35145S2);
            View m32314l2 = m32314l2(m35145S2, this.f7533R.get(this.f7534S.f7599c[m35110n02]));
            this.f7537V.f7576h = 1;
            int i4 = this.f7534S.f7599c[m35110n02];
            if (i4 == -1) {
                i4 = 0;
            }
            if (i4 > 0) {
                this.f7537V.f7572d = m35110n02 - this.f7533R.get(i4 - 1).m32218b();
            } else {
                this.f7537V.f7572d = -1;
            }
            this.f7537V.f7571c = i4 > 0 ? i4 - 1 : 0;
            if (z) {
                this.f7537V.f7573e = this.f7539X.mo34615d(m32314l2);
                this.f7537V.f7574f = this.f7539X.mo34615d(m32314l2) - this.f7539X.mo34610i();
                C2684d c2684d4 = this.f7537V;
                c2684d4.f7574f = c2684d4.f7574f >= 0 ? this.f7537V.f7574f : 0;
            } else {
                this.f7537V.f7573e = this.f7539X.mo34612g(m32314l2);
                this.f7537V.f7574f = (-this.f7539X.mo34612g(m32314l2)) + this.f7539X.mo34606m();
            }
        }
        C2684d c2684d5 = this.f7537V;
        c2684d5.f7569a = i2 - c2684d5.f7574f;
    }

    /* renamed from: U2 */
    private void m32342U2(C2681b c2681b, boolean z, boolean z2) {
        if (z2) {
            m32359J2();
        } else {
            this.f7537V.f7570b = false;
        }
        if (!mo32234j() && this.f7531P) {
            this.f7537V.f7569a = c2681b.f7554c - getPaddingRight();
        } else {
            this.f7537V.f7569a = this.f7539X.mo34610i() - c2681b.f7554c;
        }
        this.f7537V.f7572d = c2681b.f7552a;
        this.f7537V.f7576h = 1;
        this.f7537V.f7577i = 1;
        this.f7537V.f7573e = c2681b.f7554c;
        this.f7537V.f7574f = Integer.MIN_VALUE;
        this.f7537V.f7571c = c2681b.f7553b;
        if (!z || this.f7533R.size() <= 1 || c2681b.f7553b < 0 || c2681b.f7553b >= this.f7533R.size() - 1) {
            return;
        }
        C2684d.m32267i(this.f7537V);
        this.f7537V.f7572d += this.f7533R.get(c2681b.f7553b).m32218b();
    }

    /* renamed from: V2 */
    private void m32340V2(C2681b c2681b, boolean z, boolean z2) {
        if (z2) {
            m32359J2();
        } else {
            this.f7537V.f7570b = false;
        }
        if (!mo32234j() && this.f7531P) {
            this.f7537V.f7569a = (this.f7549h0.getWidth() - c2681b.f7554c) - this.f7539X.mo34606m();
        } else {
            this.f7537V.f7569a = c2681b.f7554c - this.f7539X.mo34606m();
        }
        this.f7537V.f7572d = c2681b.f7552a;
        this.f7537V.f7576h = 1;
        this.f7537V.f7577i = -1;
        this.f7537V.f7573e = c2681b.f7554c;
        this.f7537V.f7574f = Integer.MIN_VALUE;
        this.f7537V.f7571c = c2681b.f7553b;
        if (!z || c2681b.f7553b <= 0 || this.f7533R.size() <= c2681b.f7553b) {
            return;
        }
        C2684d.m32266j(this.f7537V);
        this.f7537V.f7572d -= this.f7533R.get(c2681b.f7553b).m32218b();
    }

    /* renamed from: b2 */
    private boolean m32330b2(View view, int i) {
        return (mo32234j() || !this.f7531P) ? this.f7539X.mo34612g(view) >= this.f7539X.mo34611h() - i : this.f7539X.mo34615d(view) <= i;
    }

    /* renamed from: c2 */
    private boolean m32328c2(View view, int i) {
        return (mo32234j() || !this.f7531P) ? this.f7539X.mo34615d(view) <= i : this.f7539X.mo34611h() - this.f7539X.mo34612g(view) <= i;
    }

    /* renamed from: d2 */
    private void m32326d2() {
        this.f7533R.clear();
        this.f7538W.m32278s();
        this.f7538W.f7555d = 0;
    }

    /* renamed from: e2 */
    private int m32324e2(RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0) {
            return 0;
        }
        int m35217b = c1614b0.m35217b();
        m32319i2();
        View m32315k2 = m32315k2(m35217b);
        View m32312n2 = m32312n2(m35217b);
        if (c1614b0.m35217b() == 0 || m32315k2 == null || m32312n2 == null) {
            return 0;
        }
        return Math.min(this.f7539X.mo34605n(), this.f7539X.mo34615d(m32312n2) - this.f7539X.mo34612g(m32315k2));
    }

    /* renamed from: f2 */
    private int m32322f2(RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0) {
            return 0;
        }
        int m35217b = c1614b0.m35217b();
        View m32315k2 = m32315k2(m35217b);
        View m32312n2 = m32312n2(m35217b);
        if (c1614b0.m35217b() != 0 && m32315k2 != null && m32312n2 != null) {
            int m35110n0 = m35110n0(m32315k2);
            int m35110n02 = m35110n0(m32312n2);
            int abs = Math.abs(this.f7539X.mo34615d(m32312n2) - this.f7539X.mo34612g(m32315k2));
            int[] iArr = this.f7534S.f7599c;
            int i = iArr[m35110n0];
            if (i != 0 && i != -1) {
                return Math.round((i * (abs / ((iArr[m35110n02] - i) + 1))) + (this.f7539X.mo34606m() - this.f7539X.mo34612g(m32315k2)));
            }
        }
        return 0;
    }

    /* renamed from: g2 */
    private int m32321g2(RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0) {
            return 0;
        }
        int m35217b = c1614b0.m35217b();
        View m32315k2 = m32315k2(m35217b);
        View m32312n2 = m32312n2(m35217b);
        if (c1614b0.m35217b() == 0 || m32315k2 == null || m32312n2 == null) {
            return 0;
        }
        int m32313m2 = m32313m2();
        return (int) ((Math.abs(this.f7539X.mo34615d(m32312n2) - this.f7539X.mo34612g(m32315k2)) / ((m32310p2() - m32313m2) + 1)) * c1614b0.m35217b());
    }

    /* renamed from: h2 */
    private void m32320h2() {
        if (this.f7537V == null) {
            this.f7537V = new C2684d();
        }
    }

    /* renamed from: i2 */
    private void m32319i2() {
        if (this.f7539X != null) {
            return;
        }
        if (mo32234j()) {
            if (this.f7527L == 0) {
                this.f7539X = AbstractC1744u.m34620a(this);
                this.f7540Y = AbstractC1744u.m34618c(this);
                return;
            }
            this.f7539X = AbstractC1744u.m34618c(this);
            this.f7540Y = AbstractC1744u.m34620a(this);
        } else if (this.f7527L == 0) {
            this.f7539X = AbstractC1744u.m34618c(this);
            this.f7540Y = AbstractC1744u.m34620a(this);
        } else {
            this.f7539X = AbstractC1744u.m34620a(this);
            this.f7540Y = AbstractC1744u.m34618c(this);
        }
    }

    /* renamed from: j2 */
    private int m32317j2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, C2684d c2684d) {
        if (c2684d.f7574f != Integer.MIN_VALUE) {
            if (c2684d.f7569a < 0) {
                c2684d.f7574f += c2684d.f7569a;
            }
            m32364F2(c1647w, c2684d);
        }
        int i = c2684d.f7569a;
        int i2 = c2684d.f7569a;
        int i3 = 0;
        boolean mo32234j = mo32234j();
        while (true) {
            if ((i2 > 0 || this.f7537V.f7570b) && c2684d.m32253w(c1614b0, this.f7533R)) {
                C2689c c2689c = this.f7533R.get(c2684d.f7571c);
                c2684d.f7572d = c2689c.f7595o;
                i3 += m32373C2(c2689c, c2684d);
                if (mo32234j || !this.f7531P) {
                    c2684d.f7573e += c2689c.m32219a() * c2684d.f7577i;
                } else {
                    c2684d.f7573e -= c2689c.m32219a() * c2684d.f7577i;
                }
                i2 -= c2689c.m32219a();
            }
        }
        c2684d.f7569a -= i3;
        if (c2684d.f7574f != Integer.MIN_VALUE) {
            c2684d.f7574f += i3;
            if (c2684d.f7569a < 0) {
                c2684d.f7574f += c2684d.f7569a;
            }
            m32364F2(c1647w, c2684d);
        }
        return i - c2684d.f7569a;
    }

    /* renamed from: k2 */
    private View m32315k2(int i) {
        View m32308r2 = m32308r2(0, m35142T(), i);
        if (m32308r2 == null) {
            return null;
        }
        int i2 = this.f7534S.f7599c[m35110n0(m32308r2)];
        if (i2 == -1) {
            return null;
        }
        return m32314l2(m32308r2, this.f7533R.get(i2));
    }

    /* renamed from: l2 */
    private View m32314l2(View view, C2689c c2689c) {
        boolean mo32234j = mo32234j();
        int i = c2689c.f7588h;
        for (int i2 = 1; i2 < i; i2++) {
            View m35145S = m35145S(i2);
            if (m35145S != null && m35145S.getVisibility() != 8) {
                if (this.f7531P && !mo32234j) {
                    if (this.f7539X.mo34615d(view) >= this.f7539X.mo34615d(m35145S)) {
                    }
                    view = m35145S;
                } else {
                    if (this.f7539X.mo34612g(view) <= this.f7539X.mo34612g(m35145S)) {
                    }
                    view = m35145S;
                }
            }
        }
        return view;
    }

    /* renamed from: n2 */
    private View m32312n2(int i) {
        View m32308r2 = m32308r2(m35142T() - 1, -1, i);
        if (m32308r2 == null) {
            return null;
        }
        return m32311o2(m32308r2, this.f7533R.get(this.f7534S.f7599c[m35110n0(m32308r2)]));
    }

    /* renamed from: o2 */
    private View m32311o2(View view, C2689c c2689c) {
        boolean mo32234j = mo32234j();
        int m35142T = (m35142T() - c2689c.f7588h) - 1;
        for (int m35142T2 = m35142T() - 2; m35142T2 > m35142T; m35142T2--) {
            View m35145S = m35145S(m35142T2);
            if (m35145S != null && m35145S.getVisibility() != 8) {
                if (this.f7531P && !mo32234j) {
                    if (this.f7539X.mo34612g(view) <= this.f7539X.mo34612g(m35145S)) {
                    }
                    view = m35145S;
                } else {
                    if (this.f7539X.mo34615d(view) >= this.f7539X.mo34615d(m35145S)) {
                    }
                    view = m35145S;
                }
            }
        }
        return view;
    }

    /* renamed from: q2 */
    private View m32309q2(int i, int i2, boolean z) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View m35145S = m35145S(i);
            if (m32375B2(m35145S, z)) {
                return m35145S;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: r2 */
    private View m32308r2(int i, int i2, int i3) {
        m32319i2();
        m32320h2();
        int mo34606m = this.f7539X.mo34606m();
        int mo34610i = this.f7539X.mo34610i();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m35145S = m35145S(i);
            int m35110n0 = m35110n0(m35145S);
            if (m35110n0 >= 0 && m35110n0 < i3) {
                if (((RecyclerView.C1640q) m35145S.getLayoutParams()).m35077c()) {
                    if (view2 == null) {
                        view2 = m35145S;
                    }
                } else if (this.f7539X.mo34612g(m35145S) >= mo34606m && this.f7539X.mo34615d(m35145S) <= mo34610i) {
                    return m35145S;
                } else {
                    if (view == null) {
                        view = m35145S;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: s2 */
    private int m32307s2(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, boolean z) {
        int i2;
        int mo34610i;
        if (!mo32234j() && this.f7531P) {
            int mo34606m = i - this.f7539X.mo34606m();
            if (mo34606m <= 0) {
                return 0;
            }
            i2 = m32297z2(mo34606m, c1647w, c1614b0);
        } else {
            int mo34610i2 = this.f7539X.mo34610i() - i;
            if (mo34610i2 <= 0) {
                return 0;
            }
            i2 = -m32297z2(-mo34610i2, c1647w, c1614b0);
        }
        int i3 = i + i2;
        if (!z || (mo34610i = this.f7539X.mo34610i() - i3) <= 0) {
            return i2;
        }
        this.f7539X.mo34602r(mo34610i);
        return mo34610i + i2;
    }

    /* renamed from: t2 */
    private int m32306t2(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, boolean z) {
        int i2;
        int mo34606m;
        if (!mo32234j() && this.f7531P) {
            int mo34610i = this.f7539X.mo34610i() - i;
            if (mo34610i <= 0) {
                return 0;
            }
            i2 = m32297z2(-mo34610i, c1647w, c1614b0);
        } else {
            int mo34606m2 = i - this.f7539X.mo34606m();
            if (mo34606m2 <= 0) {
                return 0;
            }
            i2 = -m32297z2(mo34606m2, c1647w, c1614b0);
        }
        int i3 = i + i2;
        if (!z || (mo34606m = i3 - this.f7539X.mo34606m()) <= 0) {
            return i2;
        }
        this.f7539X.mo34602r(-mo34606m);
        return i2 - mo34606m;
    }

    /* renamed from: u2 */
    private int m32304u2(View view) {
        return m35132Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1640q) view.getLayoutParams())).bottomMargin;
    }

    /* renamed from: v2 */
    private View m32302v2() {
        return m35145S(0);
    }

    /* renamed from: w2 */
    private int m32300w2(View view) {
        return m35130a0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1640q) view.getLayoutParams())).leftMargin;
    }

    /* renamed from: x2 */
    private int m32299x2(View view) {
        return m35127d0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1640q) view.getLayoutParams())).rightMargin;
    }

    /* renamed from: y2 */
    private int m32298y2(View view) {
        return m35126e0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1640q) view.getLayoutParams())).topMargin;
    }

    /* renamed from: z2 */
    private int m32297z2(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        if (m35142T() == 0 || i == 0) {
            return 0;
        }
        m32319i2();
        int i2 = 1;
        this.f7537V.f7578j = true;
        boolean z = !mo32234j() && this.f7531P;
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m32343T2(i2, abs);
        int m32317j2 = this.f7537V.f7574f + m32317j2(c1647w, c1614b0, this.f7537V);
        if (m32317j2 < 0) {
            return 0;
        }
        if (z) {
            if (abs > m32317j2) {
                i = (-i2) * m32317j2;
            }
        } else if (abs > m32317j2) {
            i = i2 * m32317j2;
        }
        this.f7539X.mo34602r(-i);
        this.f7537V.f7575g = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: A */
    public int mo32378A(RecyclerView.C1614b0 c1614b0) {
        return m32324e2(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: B */
    public int mo32376B(RecyclerView.C1614b0 c1614b0) {
        m32322f2(c1614b0);
        return m32322f2(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: C */
    public int mo32374C(RecyclerView.C1614b0 c1614b0) {
        return m32321g2(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: D */
    public int mo32372D(RecyclerView.C1614b0 c1614b0) {
        return m32324e2(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: E */
    public int mo32369E(RecyclerView.C1614b0 c1614b0) {
        return m32322f2(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: E1 */
    public int mo32368E1(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        if (!mo32234j()) {
            int m32297z2 = m32297z2(i, c1647w, c1614b0);
            this.f7547f0.clear();
            return m32297z2;
        }
        int m32377A2 = m32377A2(i);
        this.f7538W.f7555d += m32377A2;
        this.f7540Y.mo34602r(-m32377A2);
        return m32377A2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: F */
    public int mo32366F(RecyclerView.C1614b0 c1614b0) {
        return m32321g2(c1614b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: F1 */
    public void mo32365F1(int i) {
        this.f7542a0 = i;
        this.f7543b0 = Integer.MIN_VALUE;
        C2685e c2685e = this.f7541Z;
        if (c2685e != null) {
            c2685e.m32245h();
        }
        m35175B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: G1 */
    public int mo32363G1(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        if (mo32234j()) {
            int m32297z2 = m32297z2(i, c1647w, c1614b0);
            this.f7547f0.clear();
            return m32297z2;
        }
        int m32377A2 = m32377A2(i);
        this.f7538W.f7555d += m32377A2;
        this.f7540Y.mo34602r(-m32377A2);
        return m32377A2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: L0 */
    public void mo32357L0(RecyclerView.AbstractC1623h abstractC1623h, RecyclerView.AbstractC1623h abstractC1623h2) {
        m35099r1();
    }

    /* renamed from: L2 */
    public void m32356L2(int i) {
        int i2 = this.f7529N;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                m35099r1();
                m32326d2();
            }
            this.f7529N = i;
            m35175B1();
        }
    }

    /* renamed from: M2 */
    public void m32355M2(int i) {
        if (this.f7526K != i) {
            m35099r1();
            this.f7526K = i;
            this.f7539X = null;
            this.f7540Y = null;
            m32326d2();
            m35175B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: N */
    public RecyclerView.C1640q mo32354N() {
        return new C2682c(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: N0 */
    public void mo32353N0(RecyclerView recyclerView) {
        super.mo32353N0(recyclerView);
        this.f7549h0 = (View) recyclerView.getParent();
    }

    /* renamed from: N2 */
    public void m32352N2(int i) {
        if (i != 2) {
            int i2 = this.f7527L;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    m35099r1();
                    m32326d2();
                }
                this.f7527L = i;
                this.f7539X = null;
                this.f7540Y = null;
                m35175B1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: O */
    public RecyclerView.C1640q mo32351O(Context context, AttributeSet attributeSet) {
        return new C2682c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: P0 */
    public void mo32348P0(RecyclerView recyclerView, RecyclerView.C1647w c1647w) {
        super.mo32348P0(recyclerView, c1647w);
        if (this.f7546e0) {
            m35096s1(c1647w);
            c1647w.m35047c();
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
    /* renamed from: Y0 */
    public void mo32337Y0(RecyclerView recyclerView, int i, int i2) {
        super.mo32337Y0(recyclerView, i, i2);
        m32345R2(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1610a0.InterfaceC1612b
    /* renamed from: a */
    public PointF mo32334a(int i) {
        if (m35142T() == 0) {
            return null;
        }
        int i2 = i < m35110n0(m35145S(0)) ? -1 : 1;
        if (mo32234j()) {
            return new PointF(0.0f, i2);
        }
        return new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: a1 */
    public void mo32333a1(RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo32333a1(recyclerView, i, i2, i3);
        m32345R2(Math.min(i, i2));
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: b */
    public void mo32242b(View view, int i, int i2, C2689c c2689c) {
        m35095t(view, f7525k0);
        if (mo32234j()) {
            int m35117k0 = m35117k0(view) + m35105p0(view);
            c2689c.f7585e += m35117k0;
            c2689c.f7586f += m35117k0;
            return;
        }
        int m35097s0 = m35097s0(view) + m35146R(view);
        c2689c.f7585e += m35097s0;
        c2689c.f7586f += m35097s0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: b1 */
    public void mo32331b1(RecyclerView recyclerView, int i, int i2) {
        super.mo32331b1(recyclerView, i, i2);
        m32345R2(i);
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: c */
    public void mo32241c(C2689c c2689c) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: c1 */
    public void mo32329c1(RecyclerView recyclerView, int i, int i2) {
        super.mo32329c1(recyclerView, i, i2);
        m32345R2(i);
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: d */
    public View mo32240d(int i) {
        return mo32237g(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: d1 */
    public void mo32327d1(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo32327d1(recyclerView, i, i2, obj);
        m32345R2(i);
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: e */
    public int mo32239e(int i, int i2, int i3) {
        return RecyclerView.AbstractC1635p.m35139U(m35092u0(), m35090v0(), i2, i3, mo32305u());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: e1 */
    public void mo32325e1(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        int i;
        int i2;
        this.f7535T = c1647w;
        this.f7536U = c1614b0;
        int m35217b = c1614b0.m35217b();
        if (m35217b == 0 && c1614b0.m35214e()) {
            return;
        }
        m32358K2();
        m32319i2();
        m32320h2();
        this.f7534S.m32171t(m35217b);
        this.f7534S.m32170u(m35217b);
        this.f7534S.m32172s(m35217b);
        this.f7537V.f7578j = false;
        C2685e c2685e = this.f7541Z;
        if (c2685e != null && c2685e.m32246g(m35217b)) {
            this.f7542a0 = this.f7541Z.f7579c;
        }
        if (!this.f7538W.f7557f || this.f7542a0 != -1 || this.f7541Z != null) {
            this.f7538W.m32278s();
            m32346Q2(c1614b0, this.f7538W);
            this.f7538W.f7557f = true;
        }
        m35168G(c1647w);
        if (this.f7538W.f7556e) {
            m32340V2(this.f7538W, false, true);
        } else {
            m32342U2(this.f7538W, false, true);
        }
        m32344S2(m35217b);
        if (this.f7538W.f7556e) {
            m32317j2(c1647w, c1614b0, this.f7537V);
            i2 = this.f7537V.f7573e;
            m32342U2(this.f7538W, true, false);
            m32317j2(c1647w, c1614b0, this.f7537V);
            i = this.f7537V.f7573e;
        } else {
            m32317j2(c1647w, c1614b0, this.f7537V);
            i = this.f7537V.f7573e;
            m32340V2(this.f7538W, true, false);
            m32317j2(c1647w, c1614b0, this.f7537V);
            i2 = this.f7537V.f7573e;
        }
        if (m35142T() > 0) {
            if (this.f7538W.f7556e) {
                m32306t2(i2 + m32307s2(i, c1647w, c1614b0, true), c1647w, c1614b0, false);
            } else {
                m32307s2(i + m32306t2(i2, c1647w, c1614b0, true), c1647w, c1614b0, false);
            }
        }
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: f */
    public void mo32238f(int i, View view) {
        this.f7547f0.put(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: f1 */
    public void mo32323f1(RecyclerView.C1614b0 c1614b0) {
        super.mo32323f1(c1614b0);
        this.f7541Z = null;
        this.f7542a0 = -1;
        this.f7543b0 = Integer.MIN_VALUE;
        this.f7550i0 = -1;
        this.f7538W.m32278s();
        this.f7547f0.clear();
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: g */
    public View mo32237g(int i) {
        View view = this.f7547f0.get(i);
        return view != null ? view : this.f7535T.m35035o(i);
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getAlignItems() {
        return this.f7529N;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getFlexDirection() {
        return this.f7526K;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getFlexItemCount() {
        return this.f7536U.m35217b();
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public List<C2689c> getFlexLinesInternal() {
        return this.f7533R;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getFlexWrap() {
        return this.f7527L;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getLargestMainSize() {
        if (this.f7533R.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.f7533R.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f7533R.get(i2).f7585e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getMaxLine() {
        return this.f7530O;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public int getSumOfCrossSize() {
        int size = this.f7533R.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f7533R.get(i2).f7587g;
        }
        return i;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: h */
    public int mo32236h(View view, int i, int i2) {
        int m35097s0;
        int m35146R;
        if (mo32234j()) {
            m35097s0 = m35117k0(view);
            m35146R = m35105p0(view);
        } else {
            m35097s0 = m35097s0(view);
            m35146R = m35146R(view);
        }
        return m35097s0 + m35146R;
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: i */
    public int mo32235i(int i, int i2, int i3) {
        return RecyclerView.AbstractC1635p.m35139U(m35124g0(), m35122h0(), i2, i3, mo32303v());
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: j */
    public boolean mo32234j() {
        int i = this.f7526K;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: j1 */
    public void mo32318j1(Parcelable parcelable) {
        if (parcelable instanceof C2685e) {
            this.f7541Z = (C2685e) parcelable;
            m35175B1();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    /* renamed from: k */
    public int mo32233k(View view) {
        int m35117k0;
        int m35105p0;
        if (mo32234j()) {
            m35117k0 = m35097s0(view);
            m35105p0 = m35146R(view);
        } else {
            m35117k0 = m35117k0(view);
            m35105p0 = m35105p0(view);
        }
        return m35117k0 + m35105p0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: k1 */
    public Parcelable mo32316k1() {
        if (this.f7541Z != null) {
            return new C2685e(this.f7541Z);
        }
        C2685e c2685e = new C2685e();
        if (m35142T() <= 0) {
            c2685e.m32245h();
        } else {
            View m32302v2 = m32302v2();
            c2685e.f7579c = m35110n0(m32302v2);
            c2685e.f7580d = this.f7539X.mo34612g(m32302v2) - this.f7539X.mo34606m();
        }
        return c2685e;
    }

    /* renamed from: m2 */
    public int m32313m2() {
        View m32309q2 = m32309q2(0, m35142T(), false);
        if (m32309q2 == null) {
            return -1;
        }
        return m35110n0(m32309q2);
    }

    /* renamed from: p2 */
    public int m32310p2() {
        View m32309q2 = m32309q2(m35142T() - 1, -1, false);
        if (m32309q2 == null) {
            return -1;
        }
        return m35110n0(m32309q2);
    }

    @Override // com.google.android.flexbox.InterfaceC2687a
    public void setFlexLines(List<C2689c> list) {
        this.f7533R = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: u */
    public boolean mo32305u() {
        return !mo32234j() || m35092u0() > this.f7549h0.getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: v */
    public boolean mo32303v() {
        return mo32234j() || m35124g0() > this.f7549h0.getHeight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: w */
    public boolean mo32301w(RecyclerView.C1640q c1640q) {
        return c1640q instanceof C2682c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$e */
    /* loaded from: classes2.dex */
    public static class C2685e implements Parcelable {
        public static final Parcelable.Creator<C2685e> CREATOR = new C2686a();

        /* renamed from: c */
        private int f7579c;

        /* renamed from: d */
        private int f7580d;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$e$a */
        /* loaded from: classes2.dex */
        static class C2686a implements Parcelable.Creator<C2685e> {
            C2686a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C2685e createFromParcel(Parcel parcel) {
                return new C2685e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C2685e[] newArray(int i) {
                return new C2685e[i];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public boolean m32246g(int i) {
            int i2 = this.f7579c;
            return i2 >= 0 && i2 < i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m32245h() {
            this.f7579c = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f7579c + ", mAnchorOffset=" + this.f7580d + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7579c);
            parcel.writeInt(this.f7580d);
        }

        C2685e() {
        }

        private C2685e(Parcel parcel) {
            this.f7579c = parcel.readInt();
            this.f7580d = parcel.readInt();
        }

        private C2685e(C2685e c2685e) {
            this.f7579c = c2685e.f7579c;
            this.f7580d = c2685e.f7580d;
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    /* loaded from: classes2.dex */
    public static class C2682c extends RecyclerView.C1640q implements InterfaceC2688b {
        public static final Parcelable.Creator<C2682c> CREATOR = new C2683a();

        /* renamed from: A */
        private int f7560A;

        /* renamed from: B */
        private int f7561B;

        /* renamed from: C */
        private int f7562C;

        /* renamed from: D */
        private int f7563D;

        /* renamed from: E */
        private boolean f7564E;

        /* renamed from: w */
        private float f7565w;

        /* renamed from: x */
        private float f7566x;

        /* renamed from: y */
        private int f7567y;

        /* renamed from: z */
        private float f7568z;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c$a */
        /* loaded from: classes2.dex */
        static class C2683a implements Parcelable.Creator<C2682c> {
            C2683a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C2682c createFromParcel(Parcel parcel) {
                return new C2682c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C2682c[] newArray(int i) {
                return new C2682c[i];
            }
        }

        public C2682c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7565w = 0.0f;
            this.f7566x = 1.0f;
            this.f7567y = -1;
            this.f7568z = -1.0f;
            this.f7562C = 16777215;
            this.f7563D = 16777215;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: A0 */
        public float mo32232A0() {
            return this.f7568z;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: H0 */
        public int mo32231H0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: K0 */
        public int mo32230K0() {
            return this.f7561B;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: O */
        public int mo32229O() {
            return this.f7567y;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: P */
        public float mo32228P() {
            return this.f7566x;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: P0 */
        public boolean mo32227P0() {
            return this.f7564E;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: U0 */
        public int mo32226U0() {
            return this.f7563D;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: X */
        public int mo32225X() {
            return this.f7560A;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: Z0 */
        public int mo32224Z0() {
            return this.f7562C;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: b0 */
        public int mo32223b0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: f0 */
        public int mo32222f0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: o0 */
        public int mo32221o0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC2688b
        /* renamed from: u0 */
        public float mo32220u0() {
            return this.f7565w;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f7565w);
            parcel.writeFloat(this.f7566x);
            parcel.writeInt(this.f7567y);
            parcel.writeFloat(this.f7568z);
            parcel.writeInt(this.f7560A);
            parcel.writeInt(this.f7561B);
            parcel.writeInt(this.f7562C);
            parcel.writeInt(this.f7563D);
            parcel.writeByte(this.f7564E ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public C2682c(int i, int i2) {
            super(i, i2);
            this.f7565w = 0.0f;
            this.f7566x = 1.0f;
            this.f7567y = -1;
            this.f7568z = -1.0f;
            this.f7562C = 16777215;
            this.f7563D = 16777215;
        }

        protected C2682c(Parcel parcel) {
            super(-2, -2);
            this.f7565w = 0.0f;
            this.f7566x = 1.0f;
            this.f7567y = -1;
            this.f7568z = -1.0f;
            this.f7562C = 16777215;
            this.f7563D = 16777215;
            this.f7565w = parcel.readFloat();
            this.f7566x = parcel.readFloat();
            this.f7567y = parcel.readInt();
            this.f7568z = parcel.readFloat();
            this.f7560A = parcel.readInt();
            this.f7561B = parcel.readInt();
            this.f7562C = parcel.readInt();
            this.f7563D = parcel.readInt();
            this.f7564E = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
