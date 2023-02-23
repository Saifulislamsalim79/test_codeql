package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p227h.p238l.p239h0.C7716c;
/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a0 */
    boolean f4822a0;

    /* renamed from: b0 */
    int f4823b0;

    /* renamed from: c0 */
    int[] f4824c0;

    /* renamed from: d0 */
    View[] f4825d0;

    /* renamed from: e0 */
    final SparseIntArray f4826e0;

    /* renamed from: f0 */
    final SparseIntArray f4827f0;

    /* renamed from: g0 */
    AbstractC1603c f4828g0;

    /* renamed from: h0 */
    final Rect f4829h0;

    /* renamed from: i0 */
    private boolean f4830i0;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes2.dex */
    public static final class C1601a extends AbstractC1603c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1603c
        public int getSpanIndex(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1603c
        public int getSpanSize(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1603c {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        int getCachedSpanGroupIndex(int i, int i2) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i, i2);
            }
            int i3 = this.mSpanGroupIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanGroupIndex = getSpanGroupIndex(i, i2);
            this.mSpanGroupIndexCache.put(i, spanGroupIndex);
            return spanGroupIndex;
        }

        int getCachedSpanIndex(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanIndex = getSpanIndex(i, i2);
            this.mSpanIndexCache.put(i, spanIndex);
            return spanIndex;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getSpanGroupIndex(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.mCacheSpanGroupIndices
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.mSpanGroupIndexCache
                int r0 = findFirstKeyLessThan(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.mSpanGroupIndexCache
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.getCachedSpanIndex(r0, r8)
                int r0 = r6.getSpanSize(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.getSpanSize(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.getSpanSize(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC1603c.getSpanGroupIndex(int, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = 0
                r3 = 0
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = 0
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC1603c.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4822a0 = false;
        this.f4823b0 = -1;
        this.f4826e0 = new SparseIntArray();
        this.f4827f0 = new SparseIntArray();
        this.f4828g0 = new C1601a();
        this.f4829h0 = new Rect();
        m35438k3(RecyclerView.AbstractC1635p.m35107o0(context, attributeSet, i, i2).f5039b);
    }

    /* renamed from: T2 */
    private void m35455T2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = i - 1;
            i3 = -1;
        }
        while (i2 != i5) {
            View view = this.f4825d0[i2];
            C1602b c1602b = (C1602b) view.getLayoutParams();
            int m35442g3 = m35442g3(c1647w, c1614b0, m35110n0(view));
            c1602b.f4832x = m35442g3;
            c1602b.f4831w = i4;
            i4 += m35442g3;
            i2 += i3;
        }
    }

    /* renamed from: U2 */
    private void m35454U2() {
        int m35142T = m35142T();
        for (int i = 0; i < m35142T; i++) {
            C1602b c1602b = (C1602b) m35145S(i).getLayoutParams();
            int m35079a = c1602b.m35079a();
            this.f4826e0.put(m35079a, c1602b.m35434f());
            this.f4827f0.put(m35079a, c1602b.m35435e());
        }
    }

    /* renamed from: V2 */
    private void m35453V2(int i) {
        this.f4824c0 = m35452W2(this.f4824c0, this.f4823b0, i);
    }

    /* renamed from: W2 */
    static int[] m35452W2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: X2 */
    private void m35451X2() {
        this.f4826e0.clear();
        this.f4827f0.clear();
    }

    /* renamed from: Y2 */
    private int m35450Y2(RecyclerView.C1614b0 c1614b0) {
        int max;
        if (m35142T() != 0 && c1614b0.m35217b() != 0) {
            m35408c2();
            boolean m35387x2 = m35387x2();
            View m35403h2 = m35403h2(!m35387x2, true);
            View m35404g2 = m35404g2(!m35387x2, true);
            if (m35403h2 != null && m35404g2 != null) {
                int cachedSpanGroupIndex = this.f4828g0.getCachedSpanGroupIndex(m35110n0(m35403h2), this.f4823b0);
                int cachedSpanGroupIndex2 = this.f4828g0.getCachedSpanGroupIndex(m35110n0(m35404g2), this.f4823b0);
                int min = Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int max2 = Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int cachedSpanGroupIndex3 = this.f4828g0.getCachedSpanGroupIndex(c1614b0.m35217b() - 1, this.f4823b0) + 1;
                if (this.f4838P) {
                    max = Math.max(0, (cachedSpanGroupIndex3 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (m35387x2) {
                    return Math.round((max * (Math.abs(this.f4835M.mo34615d(m35404g2) - this.f4835M.mo34612g(m35403h2)) / ((this.f4828g0.getCachedSpanGroupIndex(m35110n0(m35404g2), this.f4823b0) - this.f4828g0.getCachedSpanGroupIndex(m35110n0(m35403h2), this.f4823b0)) + 1))) + (this.f4835M.mo34606m() - this.f4835M.mo34612g(m35403h2)));
                }
                return max;
            }
        }
        return 0;
    }

    /* renamed from: Z2 */
    private int m35449Z2(RecyclerView.C1614b0 c1614b0) {
        if (m35142T() != 0 && c1614b0.m35217b() != 0) {
            m35408c2();
            View m35403h2 = m35403h2(!m35387x2(), true);
            View m35404g2 = m35404g2(!m35387x2(), true);
            if (m35403h2 != null && m35404g2 != null) {
                if (!m35387x2()) {
                    return this.f4828g0.getCachedSpanGroupIndex(c1614b0.m35217b() - 1, this.f4823b0) + 1;
                }
                int mo34615d = this.f4835M.mo34615d(m35404g2) - this.f4835M.mo34612g(m35403h2);
                int cachedSpanGroupIndex = this.f4828g0.getCachedSpanGroupIndex(m35110n0(m35403h2), this.f4823b0);
                return (int) ((mo34615d / ((this.f4828g0.getCachedSpanGroupIndex(m35110n0(m35404g2), this.f4823b0) - cachedSpanGroupIndex) + 1)) * (this.f4828g0.getCachedSpanGroupIndex(c1614b0.m35217b() - 1, this.f4823b0) + 1));
            }
        }
        return 0;
    }

    /* renamed from: a3 */
    private void m35448a3(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, LinearLayoutManager.C1604a c1604a, int i) {
        boolean z = i == 1;
        int m35443f3 = m35443f3(c1647w, c1614b0, c1604a.f4850b);
        if (z) {
            while (m35443f3 > 0) {
                int i2 = c1604a.f4850b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                c1604a.f4850b = i3;
                m35443f3 = m35443f3(c1647w, c1614b0, i3);
            }
            return;
        }
        int m35217b = c1614b0.m35217b() - 1;
        int i4 = c1604a.f4850b;
        while (i4 < m35217b) {
            int i5 = i4 + 1;
            int m35443f32 = m35443f3(c1647w, c1614b0, i5);
            if (m35443f32 <= m35443f3) {
                break;
            }
            i4 = i5;
            m35443f3 = m35443f32;
        }
        c1604a.f4850b = i4;
    }

    /* renamed from: b3 */
    private void m35447b3() {
        View[] viewArr = this.f4825d0;
        if (viewArr == null || viewArr.length != this.f4823b0) {
            this.f4825d0 = new View[this.f4823b0];
        }
    }

    /* renamed from: e3 */
    private int m35444e3(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, int i) {
        if (!c1614b0.m35214e()) {
            return this.f4828g0.getCachedSpanGroupIndex(i, this.f4823b0);
        }
        int m35044f = c1647w.m35044f(i);
        if (m35044f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.f4828g0.getCachedSpanGroupIndex(m35044f, this.f4823b0);
    }

    /* renamed from: f3 */
    private int m35443f3(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, int i) {
        if (!c1614b0.m35214e()) {
            return this.f4828g0.getCachedSpanIndex(i, this.f4823b0);
        }
        int i2 = this.f4827f0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m35044f = c1647w.m35044f(i);
        if (m35044f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.f4828g0.getCachedSpanIndex(m35044f, this.f4823b0);
    }

    /* renamed from: g3 */
    private int m35442g3(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, int i) {
        if (!c1614b0.m35214e()) {
            return this.f4828g0.getSpanSize(i);
        }
        int i2 = this.f4826e0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m35044f = c1647w.m35044f(i);
        if (m35044f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.f4828g0.getSpanSize(m35044f);
    }

    /* renamed from: h3 */
    private void m35441h3(float f, int i) {
        m35453V2(Math.max(Math.round(f * this.f4823b0), i));
    }

    /* renamed from: i3 */
    private void m35440i3(View view, int i, boolean z) {
        int i2;
        int i3;
        C1602b c1602b = (C1602b) view.getLayoutParams();
        Rect rect = c1602b.f5043d;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1602b).topMargin + ((ViewGroup.MarginLayoutParams) c1602b).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1602b).leftMargin + ((ViewGroup.MarginLayoutParams) c1602b).rightMargin;
        int m35446c3 = m35446c3(c1602b.f4831w, c1602b.f4832x);
        if (this.f4833K == 1) {
            i3 = RecyclerView.AbstractC1635p.m35139U(m35446c3, i, i5, ((ViewGroup.MarginLayoutParams) c1602b).width, false);
            i2 = RecyclerView.AbstractC1635p.m35139U(this.f4835M.mo34605n(), m35122h0(), i4, ((ViewGroup.MarginLayoutParams) c1602b).height, true);
        } else {
            int m35139U = RecyclerView.AbstractC1635p.m35139U(m35446c3, i, i4, ((ViewGroup.MarginLayoutParams) c1602b).height, false);
            int m35139U2 = RecyclerView.AbstractC1635p.m35139U(this.f4835M.mo34605n(), m35090v0(), i5, ((ViewGroup.MarginLayoutParams) c1602b).width, true);
            i2 = m35139U;
            i3 = m35139U2;
        }
        m35439j3(view, i3, i2, z);
    }

    /* renamed from: j3 */
    private void m35439j3(View view, int i, int i2, boolean z) {
        boolean m35150O1;
        RecyclerView.C1640q c1640q = (RecyclerView.C1640q) view.getLayoutParams();
        if (z) {
            m35150O1 = m35147Q1(view, i, i2, c1640q);
        } else {
            m35150O1 = m35150O1(view, i, i2, c1640q);
        }
        if (m35150O1) {
            view.measure(i, i2);
        }
    }

    /* renamed from: m3 */
    private void m35436m3() {
        int m35124g0;
        int paddingTop;
        if (m35389v2() == 1) {
            m35124g0 = m35092u0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            m35124g0 = m35124g0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m35453V2(m35124g0 - paddingTop);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: A2 */
    public void mo35433A2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, LinearLayoutManager.C1604a c1604a, int i) {
        super.mo35433A2(c1647w, c1614b0, c1604a, i);
        m35436m3();
        if (c1614b0.m35217b() > 0 && !c1614b0.m35214e()) {
            m35448a3(c1647w, c1614b0, c1604a, i);
        }
        m35447b3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: B */
    public int mo32376B(RecyclerView.C1614b0 c1614b0) {
        if (this.f4830i0) {
            return m35450Y2(c1614b0);
        }
        return super.mo32376B(c1614b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: C */
    public int mo32374C(RecyclerView.C1614b0 c1614b0) {
        if (this.f4830i0) {
            return m35449Z2(c1614b0);
        }
        return super.mo32374C(c1614b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: E */
    public int mo32369E(RecyclerView.C1614b0 c1614b0) {
        if (this.f4830i0) {
            return m35450Y2(c1614b0);
        }
        return super.mo32369E(c1614b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: E1 */
    public int mo32368E1(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        m35436m3();
        m35447b3();
        return super.mo32368E1(i, c1647w, c1614b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: F */
    public int mo32366F(RecyclerView.C1614b0 c1614b0) {
        if (this.f4830i0) {
            return m35449Z2(c1614b0);
        }
        return super.mo32366F(c1614b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: G1 */
    public int mo32363G1(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        m35436m3();
        m35447b3();
        return super.mo32363G1(i, c1647w, c1614b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: K2 */
    public void mo35423K2(boolean z) {
        if (!z) {
            super.mo35423K2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: L1 */
    public void mo35004L1(Rect rect, int i, int i2) {
        int m35086x;
        int m35086x2;
        if (this.f4824c0 == null) {
            super.mo35004L1(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f4833K == 1) {
            m35086x2 = RecyclerView.AbstractC1635p.m35086x(i2, rect.height() + paddingTop, m35115l0());
            int[] iArr = this.f4824c0;
            m35086x = RecyclerView.AbstractC1635p.m35086x(i, iArr[iArr.length - 1] + paddingLeft, m35113m0());
        } else {
            m35086x = RecyclerView.AbstractC1635p.m35086x(i, rect.width() + paddingLeft, m35113m0());
            int[] iArr2 = this.f4824c0;
            m35086x2 = RecyclerView.AbstractC1635p.m35086x(i2, iArr2[iArr2.length - 1] + paddingTop, m35115l0());
        }
        m35157K1(m35086x, m35086x2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: N */
    public RecyclerView.C1640q mo32354N() {
        if (this.f4833K == 0) {
            return new C1602b(-2, -1);
        }
        return new C1602b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: O */
    public RecyclerView.C1640q mo32351O(Context context, AttributeSet attributeSet) {
        return new C1602b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: P */
    public RecyclerView.C1640q mo34999P(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1602b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1602b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo34997Q0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1647w r26, androidx.recyclerview.widget.RecyclerView.C1614b0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo34997Q0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: U1 */
    public boolean mo34991U1() {
        return this.f4844V == null && !this.f4822a0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: W0 */
    public void mo35135W0(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, View view, C7716c c7716c) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1602b)) {
            super.m35137V0(view, c7716c);
            return;
        }
        C1602b c1602b = (C1602b) layoutParams;
        int m35444e3 = m35444e3(c1647w, c1614b0, c1602b.m35079a());
        if (this.f4833K == 0) {
            c7716c.m17687d0(C7716c.C7719c.m17636a(c1602b.m35435e(), c1602b.m35434f(), m35444e3, 1, false, false));
        } else {
            c7716c.m17687d0(C7716c.C7719c.m17636a(m35444e3, 1, c1602b.m35435e(), c1602b.m35434f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: W1 */
    void mo35414W1(RecyclerView.C1614b0 c1614b0, LinearLayoutManager.C1606c c1606c, RecyclerView.AbstractC1635p.InterfaceC1638c interfaceC1638c) {
        int i = this.f4823b0;
        for (int i2 = 0; i2 < this.f4823b0 && c1606c.m35376c(c1614b0) && i > 0; i2++) {
            int i3 = c1606c.f4861d;
            interfaceC1638c.mo34667a(i3, Math.max(0, c1606c.f4864g));
            i -= this.f4828g0.getSpanSize(i3);
            c1606c.f4861d += c1606c.f4862e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: X */
    public int mo35134X(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        if (this.f4833K == 1) {
            return this.f4823b0;
        }
        if (c1614b0.m35217b() < 1) {
            return 0;
        }
        return m35444e3(c1647w, c1614b0, c1614b0.m35217b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: Y0 */
    public void mo32337Y0(RecyclerView recyclerView, int i, int i2) {
        this.f4828g0.invalidateSpanIndexCache();
        this.f4828g0.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: Z0 */
    public void mo34981Z0(RecyclerView recyclerView) {
        this.f4828g0.invalidateSpanIndexCache();
        this.f4828g0.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: a1 */
    public void mo32333a1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f4828g0.invalidateSpanIndexCache();
        this.f4828g0.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: b1 */
    public void mo32331b1(RecyclerView recyclerView, int i, int i2) {
        this.f4828g0.invalidateSpanIndexCache();
        this.f4828g0.invalidateSpanGroupIndexCache();
    }

    /* renamed from: c3 */
    int m35446c3(int i, int i2) {
        if (this.f4833K == 1 && m35388w2()) {
            int[] iArr = this.f4824c0;
            int i3 = this.f4823b0;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.f4824c0;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: d1 */
    public void mo32327d1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f4828g0.invalidateSpanIndexCache();
        this.f4828g0.invalidateSpanGroupIndexCache();
    }

    /* renamed from: d3 */
    public int m35445d3() {
        return this.f4823b0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: e1 */
    public void mo32325e1(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        if (c1614b0.m35214e()) {
            m35454U2();
        }
        super.mo32325e1(c1647w, c1614b0);
        m35451X2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: f1 */
    public void mo32323f1(RecyclerView.C1614b0 c1614b0) {
        super.mo32323f1(c1614b0);
        this.f4822a0 = false;
    }

    /* renamed from: k3 */
    public void m35438k3(int i) {
        if (i == this.f4823b0) {
            return;
        }
        this.f4822a0 = true;
        if (i >= 1) {
            this.f4823b0 = i;
            this.f4828g0.invalidateSpanIndexCache();
            m35175B1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    /* renamed from: l3 */
    public void m35437l3(AbstractC1603c abstractC1603c) {
        this.f4828g0 = abstractC1603c;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: p2 */
    View mo35395p2(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, boolean z, boolean z2) {
        int i;
        int m35142T = m35142T();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = m35142T() - 1;
            i3 = -1;
        } else {
            i2 = m35142T;
            i = 0;
        }
        int m35217b = c1614b0.m35217b();
        m35408c2();
        int mo34606m = this.f4835M.mo34606m();
        int mo34610i = this.f4835M.mo34610i();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m35145S = m35145S(i);
            int m35110n0 = m35110n0(m35145S);
            if (m35110n0 >= 0 && m35110n0 < m35217b && m35443f3(c1647w, c1614b0, m35110n0) == 0) {
                if (((RecyclerView.C1640q) m35145S.getLayoutParams()).m35077c()) {
                    if (view2 == null) {
                        view2 = m35145S;
                    }
                } else if (this.f4835M.mo34612g(m35145S) < mo34610i && this.f4835M.mo34615d(m35145S) >= mo34606m) {
                    return m35145S;
                } else {
                    if (view == null) {
                        view = m35145S;
                    }
                }
            }
            i += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: q0 */
    public int mo35103q0(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        if (this.f4833K == 0) {
            return this.f4823b0;
        }
        if (c1614b0.m35217b() < 1) {
            return 0;
        }
        return m35444e3(c1647w, c1614b0, c1614b0.m35217b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: w */
    public boolean mo32301w(RecyclerView.C1640q c1640q) {
        return c1640q instanceof C1602b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.f4855b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: y2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void mo35386y2(androidx.recyclerview.widget.RecyclerView.C1647w r18, androidx.recyclerview.widget.RecyclerView.C1614b0 r19, androidx.recyclerview.widget.LinearLayoutManager.C1606c r20, androidx.recyclerview.widget.LinearLayoutManager.C1605b r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo35386y2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes2.dex */
    public static class C1602b extends RecyclerView.C1640q {

        /* renamed from: w */
        int f4831w;

        /* renamed from: x */
        int f4832x;

        public C1602b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4831w = -1;
            this.f4832x = 0;
        }

        /* renamed from: e */
        public int m35435e() {
            return this.f4831w;
        }

        /* renamed from: f */
        public int m35434f() {
            return this.f4832x;
        }

        public C1602b(int i, int i2) {
            super(i, i2);
            this.f4831w = -1;
            this.f4832x = 0;
        }

        public C1602b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4831w = -1;
            this.f4832x = 0;
        }

        public C1602b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4831w = -1;
            this.f4832x = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f4822a0 = false;
        this.f4823b0 = -1;
        this.f4826e0 = new SparseIntArray();
        this.f4827f0 = new SparseIntArray();
        this.f4828g0 = new C1601a();
        this.f4829h0 = new Rect();
        m35438k3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f4822a0 = false;
        this.f4823b0 = -1;
        this.f4826e0 = new SparseIntArray();
        this.f4827f0 = new SparseIntArray();
        this.f4828g0 = new C1601a();
        this.f4829h0 = new Rect();
        m35438k3(i);
    }
}
