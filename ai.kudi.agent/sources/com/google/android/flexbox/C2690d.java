package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p201g.p227h.p238l.C7713h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlexboxHelper.java */
/* renamed from: com.google.android.flexbox.d */
/* loaded from: classes2.dex */
public class C2690d {

    /* renamed from: a */
    private final InterfaceC2687a f7597a;

    /* renamed from: b */
    private boolean[] f7598b;

    /* renamed from: c */
    int[] f7599c;

    /* renamed from: d */
    long[] f7600d;

    /* renamed from: e */
    private long[] f7601e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlexboxHelper.java */
    /* renamed from: com.google.android.flexbox.d$b */
    /* loaded from: classes2.dex */
    public static class C2692b {

        /* renamed from: a */
        List<C2689c> f7602a;

        /* renamed from: b */
        int f7603b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m32164a() {
            this.f7602a = null;
            this.f7603b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FlexboxHelper.java */
    /* renamed from: com.google.android.flexbox.d$c */
    /* loaded from: classes2.dex */
    public static class C2693c implements Comparable<C2693c> {

        /* renamed from: c */
        int f7604c;

        /* renamed from: d */
        int f7605d;

        private C2693c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C2693c c2693c) {
            int i = this.f7605d;
            int i2 = c2693c.f7605d;
            return i != i2 ? i - i2 : this.f7604c - c2693c.f7604c;
        }

        public String toString() {
            return "Order{order=" + this.f7605d + ", index=" + this.f7604c + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2690d(InterfaceC2687a interfaceC2687a) {
        this.f7597a = interfaceC2687a;
    }

    /* renamed from: A */
    private int m32215A(InterfaceC2688b interfaceC2688b, boolean z) {
        if (z) {
            return interfaceC2688b.mo32223b0();
        }
        return interfaceC2688b.mo32231H0();
    }

    /* renamed from: B */
    private int m32214B(InterfaceC2688b interfaceC2688b, boolean z) {
        if (z) {
            return interfaceC2688b.mo32231H0();
        }
        return interfaceC2688b.mo32223b0();
    }

    /* renamed from: C */
    private int m32213C(InterfaceC2688b interfaceC2688b, boolean z) {
        if (z) {
            return interfaceC2688b.mo32221o0();
        }
        return interfaceC2688b.mo32222f0();
    }

    /* renamed from: D */
    private int m32212D(InterfaceC2688b interfaceC2688b, boolean z) {
        if (z) {
            return interfaceC2688b.mo32222f0();
        }
        return interfaceC2688b.mo32221o0();
    }

    /* renamed from: E */
    private int m32211E(InterfaceC2688b interfaceC2688b, boolean z) {
        if (z) {
            return interfaceC2688b.getHeight();
        }
        return interfaceC2688b.getWidth();
    }

    /* renamed from: F */
    private int m32210F(InterfaceC2688b interfaceC2688b, boolean z) {
        if (z) {
            return interfaceC2688b.getWidth();
        }
        return interfaceC2688b.getHeight();
    }

    /* renamed from: G */
    private int m32209G(boolean z) {
        if (z) {
            return this.f7597a.getPaddingBottom();
        }
        return this.f7597a.getPaddingEnd();
    }

    /* renamed from: H */
    private int m32208H(boolean z) {
        if (z) {
            return this.f7597a.getPaddingEnd();
        }
        return this.f7597a.getPaddingBottom();
    }

    /* renamed from: I */
    private int m32207I(boolean z) {
        if (z) {
            return this.f7597a.getPaddingTop();
        }
        return this.f7597a.getPaddingStart();
    }

    /* renamed from: J */
    private int m32206J(boolean z) {
        if (z) {
            return this.f7597a.getPaddingStart();
        }
        return this.f7597a.getPaddingTop();
    }

    /* renamed from: K */
    private int m32205K(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: L */
    private int m32204L(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: M */
    private boolean m32203M(int i, int i2, C2689c c2689c) {
        return i == i2 - 1 && c2689c.m32217c() != 0;
    }

    /* renamed from: O */
    private boolean m32201O(View view, int i, int i2, int i3, int i4, InterfaceC2688b interfaceC2688b, int i5, int i6, int i7) {
        if (this.f7597a.getFlexWrap() == 0) {
            return false;
        }
        if (interfaceC2688b.mo32227P0()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f7597a.getMaxLine();
        if (maxLine == -1 || maxLine > i7 + 1) {
            int mo32236h = this.f7597a.mo32236h(view, i5, i6);
            if (mo32236h > 0) {
                i4 += mo32236h;
            }
            return i2 < i3 + i4;
        }
        return false;
    }

    /* renamed from: S */
    private void m32197S(int i, int i2, C2689c c2689c, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8 = c2689c.f7585e;
        float f = c2689c.f7591k;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 > i8) {
            return;
        }
        float f3 = (i8 - i3) / f;
        c2689c.f7585e = i4 + c2689c.f7586f;
        if (!z) {
            c2689c.f7587g = Integer.MIN_VALUE;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f4 = 0.0f;
        while (i9 < c2689c.f7588h) {
            int i11 = c2689c.f7595o + i9;
            View mo32240d = this.f7597a.mo32240d(i11);
            if (mo32240d == null || mo32240d.getVisibility() == 8) {
                i5 = i8;
                i6 = i9;
            } else {
                InterfaceC2688b interfaceC2688b = (InterfaceC2688b) mo32240d.getLayoutParams();
                int flexDirection = this.f7597a.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = mo32240d.getMeasuredHeight();
                    long[] jArr = this.f7601e;
                    if (jArr != null) {
                        measuredHeight = m32168w(jArr[i11]);
                    }
                    int measuredWidth = mo32240d.getMeasuredWidth();
                    long[] jArr2 = this.f7601e;
                    if (jArr2 != null) {
                        measuredWidth = m32167x(jArr2[i11]);
                    }
                    if (this.f7598b[i11] || interfaceC2688b.mo32228P() <= f2) {
                        i5 = i8;
                        i6 = i9;
                    } else {
                        float mo32228P = measuredHeight - (interfaceC2688b.mo32228P() * f3);
                        if (i9 == c2689c.f7588h - 1) {
                            mo32228P += f4;
                            f4 = 0.0f;
                        }
                        int round = Math.round(mo32228P);
                        if (round < interfaceC2688b.mo32230K0()) {
                            round = interfaceC2688b.mo32230K0();
                            this.f7598b[i11] = true;
                            c2689c.f7591k -= interfaceC2688b.mo32228P();
                            i5 = i8;
                            i6 = i9;
                            z2 = true;
                        } else {
                            f4 += mo32228P - round;
                            i5 = i8;
                            i6 = i9;
                            double d = f4;
                            if (d > 1.0d) {
                                round++;
                                f4 -= 1.0f;
                            } else if (d < -1.0d) {
                                round--;
                                f4 += 1.0f;
                            }
                        }
                        int m32165z = m32165z(i, interfaceC2688b, c2689c.f7593m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        mo32240d.measure(m32165z, makeMeasureSpec);
                        measuredWidth = mo32240d.getMeasuredWidth();
                        int measuredHeight2 = mo32240d.getMeasuredHeight();
                        m32191Y(i11, m32165z, makeMeasureSpec, mo32240d);
                        this.f7597a.mo32238f(i11, mo32240d);
                        measuredHeight = measuredHeight2;
                    }
                    i7 = Math.max(i10, measuredWidth + interfaceC2688b.mo32222f0() + interfaceC2688b.mo32231H0() + this.f7597a.mo32233k(mo32240d));
                    c2689c.f7585e += measuredHeight + interfaceC2688b.mo32221o0() + interfaceC2688b.mo32223b0();
                } else {
                    i5 = i8;
                    int i12 = i9;
                    int measuredWidth2 = mo32240d.getMeasuredWidth();
                    long[] jArr3 = this.f7601e;
                    if (jArr3 != null) {
                        measuredWidth2 = m32167x(jArr3[i11]);
                    }
                    int measuredHeight3 = mo32240d.getMeasuredHeight();
                    long[] jArr4 = this.f7601e;
                    if (jArr4 != null) {
                        measuredHeight3 = m32168w(jArr4[i11]);
                    }
                    if (this.f7598b[i11] || interfaceC2688b.mo32228P() <= 0.0f) {
                        i6 = i12;
                    } else {
                        float mo32228P2 = measuredWidth2 - (interfaceC2688b.mo32228P() * f3);
                        i6 = i12;
                        if (i6 == c2689c.f7588h - 1) {
                            mo32228P2 += f4;
                            f4 = 0.0f;
                        }
                        int round2 = Math.round(mo32228P2);
                        if (round2 < interfaceC2688b.mo32225X()) {
                            round2 = interfaceC2688b.mo32225X();
                            this.f7598b[i11] = true;
                            c2689c.f7591k -= interfaceC2688b.mo32228P();
                            z2 = true;
                        } else {
                            f4 += mo32228P2 - round2;
                            double d2 = f4;
                            if (d2 > 1.0d) {
                                round2++;
                                f4 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f4 += 1.0f;
                            }
                        }
                        int m32166y = m32166y(i2, interfaceC2688b, c2689c.f7593m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        mo32240d.measure(makeMeasureSpec2, m32166y);
                        int measuredWidth3 = mo32240d.getMeasuredWidth();
                        int measuredHeight4 = mo32240d.getMeasuredHeight();
                        m32191Y(i11, makeMeasureSpec2, m32166y, mo32240d);
                        this.f7597a.mo32238f(i11, mo32240d);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i10, measuredHeight3 + interfaceC2688b.mo32221o0() + interfaceC2688b.mo32223b0() + this.f7597a.mo32233k(mo32240d));
                    c2689c.f7585e += measuredWidth2 + interfaceC2688b.mo32222f0() + interfaceC2688b.mo32231H0();
                    i7 = max;
                }
                c2689c.f7587g = Math.max(c2689c.f7587g, i7);
                i10 = i7;
            }
            i9 = i6 + 1;
            i8 = i5;
            f2 = 0.0f;
        }
        int i13 = i8;
        if (!z2 || i13 == c2689c.f7585e) {
            return;
        }
        m32197S(i, i2, c2689c, i3, i4, true);
    }

    /* renamed from: T */
    private int[] m32196T(int i, List<C2693c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C2693c c2693c : list) {
            int i3 = c2693c.f7604c;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c2693c.f7605d);
            i2++;
        }
        return iArr;
    }

    /* renamed from: U */
    private void m32195U(View view, int i, int i2) {
        int measuredHeight;
        InterfaceC2688b interfaceC2688b = (InterfaceC2688b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - interfaceC2688b.mo32222f0()) - interfaceC2688b.mo32231H0()) - this.f7597a.mo32233k(view), interfaceC2688b.mo32225X()), interfaceC2688b.mo32224Z0());
        long[] jArr = this.f7601e;
        if (jArr != null) {
            measuredHeight = m32168w(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m32191Y(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f7597a.mo32238f(i2, view);
    }

    /* renamed from: V */
    private void m32194V(View view, int i, int i2) {
        int measuredWidth;
        InterfaceC2688b interfaceC2688b = (InterfaceC2688b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - interfaceC2688b.mo32221o0()) - interfaceC2688b.mo32223b0()) - this.f7597a.mo32233k(view), interfaceC2688b.mo32230K0()), interfaceC2688b.mo32226U0());
        long[] jArr = this.f7601e;
        if (jArr != null) {
            measuredWidth = m32167x(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m32191Y(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f7597a.mo32238f(i2, view);
    }

    /* renamed from: Y */
    private void m32191Y(int i, int i2, int i3, View view) {
        long[] jArr = this.f7600d;
        if (jArr != null) {
            jArr[i] = m32198R(i2, i3);
        }
        long[] jArr2 = this.f7601e;
        if (jArr2 != null) {
            jArr2[i] = m32198R(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    private void m32190a(List<C2689c> list, C2689c c2689c, int i, int i2) {
        c2689c.f7593m = i2;
        this.f7597a.mo32241c(c2689c);
        c2689c.f7596p = i;
        list.add(c2689c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m32182i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.b r0 = (com.google.android.flexbox.InterfaceC2688b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo32225X()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.mo32225X()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.mo32224Z0()
            if (r1 <= r3) goto L26
            int r1 = r0.mo32224Z0()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.mo32230K0()
            if (r2 >= r5) goto L32
            int r2 = r0.mo32230K0()
            goto L3e
        L32:
            int r5 = r0.mo32226U0()
            if (r2 <= r5) goto L3d
            int r2 = r0.mo32226U0()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m32191Y(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f7597a
            r0.mo32238f(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C2690d.m32182i(android.view.View, int):void");
    }

    /* renamed from: k */
    private List<C2689c> m32180k(List<C2689c> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C2689c c2689c = new C2689c();
        c2689c.f7587g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(c2689c);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(c2689c);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    private List<C2693c> m32179l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C2693c c2693c = new C2693c();
            c2693c.f7605d = ((InterfaceC2688b) this.f7597a.mo32237g(i2).getLayoutParams()).getOrder();
            c2693c.f7604c = i2;
            arrayList.add(c2693c);
        }
        return arrayList;
    }

    /* renamed from: r */
    private void m32173r(int i) {
        boolean[] zArr = this.f7598b;
        if (zArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f7598b = new boolean[i];
        } else if (zArr.length < i) {
            int length = zArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f7598b = new boolean[i];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* renamed from: v */
    private void m32169v(int i, int i2, C2689c c2689c, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        float f = c2689c.f7590j;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 < (i5 = c2689c.f7585e)) {
            return;
        }
        float f3 = (i3 - i5) / f;
        c2689c.f7585e = i4 + c2689c.f7586f;
        if (!z) {
            c2689c.f7587g = Integer.MIN_VALUE;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f4 = 0.0f;
        while (i9 < c2689c.f7588h) {
            int i11 = c2689c.f7595o + i9;
            View mo32240d = this.f7597a.mo32240d(i11);
            if (mo32240d == null || mo32240d.getVisibility() == 8) {
                i6 = i5;
            } else {
                InterfaceC2688b interfaceC2688b = (InterfaceC2688b) mo32240d.getLayoutParams();
                int flexDirection = this.f7597a.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = mo32240d.getMeasuredHeight();
                    long[] jArr = this.f7601e;
                    if (jArr != null) {
                        measuredHeight = m32168w(jArr[i11]);
                    }
                    int measuredWidth = mo32240d.getMeasuredWidth();
                    long[] jArr2 = this.f7601e;
                    if (jArr2 != null) {
                        measuredWidth = m32167x(jArr2[i11]);
                    }
                    if (this.f7598b[i11] || interfaceC2688b.mo32220u0() <= f2) {
                        i8 = i5;
                    } else {
                        float mo32220u0 = measuredHeight + (interfaceC2688b.mo32220u0() * f3);
                        if (i9 == c2689c.f7588h - 1) {
                            mo32220u0 += f4;
                            f4 = 0.0f;
                        }
                        int round = Math.round(mo32220u0);
                        if (round > interfaceC2688b.mo32226U0()) {
                            round = interfaceC2688b.mo32226U0();
                            this.f7598b[i11] = true;
                            c2689c.f7590j -= interfaceC2688b.mo32220u0();
                            i8 = i5;
                            z2 = true;
                        } else {
                            f4 += mo32220u0 - round;
                            i8 = i5;
                            double d3 = f4;
                            if (d3 > 1.0d) {
                                round++;
                                Double.isNaN(d3);
                                d2 = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                round--;
                                Double.isNaN(d3);
                                d2 = d3 + 1.0d;
                            }
                            f4 = (float) d2;
                        }
                        int m32165z = m32165z(i, interfaceC2688b, c2689c.f7593m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        mo32240d.measure(m32165z, makeMeasureSpec);
                        measuredWidth = mo32240d.getMeasuredWidth();
                        int measuredHeight2 = mo32240d.getMeasuredHeight();
                        m32191Y(i11, m32165z, makeMeasureSpec, mo32240d);
                        this.f7597a.mo32238f(i11, mo32240d);
                        measuredHeight = measuredHeight2;
                    }
                    i7 = Math.max(i10, measuredWidth + interfaceC2688b.mo32222f0() + interfaceC2688b.mo32231H0() + this.f7597a.mo32233k(mo32240d));
                    c2689c.f7585e += measuredHeight + interfaceC2688b.mo32221o0() + interfaceC2688b.mo32223b0();
                    i6 = i8;
                } else {
                    int i12 = i5;
                    int measuredWidth2 = mo32240d.getMeasuredWidth();
                    long[] jArr3 = this.f7601e;
                    if (jArr3 != null) {
                        measuredWidth2 = m32167x(jArr3[i11]);
                    }
                    int measuredHeight3 = mo32240d.getMeasuredHeight();
                    long[] jArr4 = this.f7601e;
                    i6 = i12;
                    if (jArr4 != null) {
                        measuredHeight3 = m32168w(jArr4[i11]);
                    }
                    if (!this.f7598b[i11] && interfaceC2688b.mo32220u0() > 0.0f) {
                        float mo32220u02 = measuredWidth2 + (interfaceC2688b.mo32220u0() * f3);
                        if (i9 == c2689c.f7588h - 1) {
                            mo32220u02 += f4;
                            f4 = 0.0f;
                        }
                        int round2 = Math.round(mo32220u02);
                        if (round2 > interfaceC2688b.mo32224Z0()) {
                            round2 = interfaceC2688b.mo32224Z0();
                            this.f7598b[i11] = true;
                            c2689c.f7590j -= interfaceC2688b.mo32220u0();
                            z2 = true;
                        } else {
                            f4 += mo32220u02 - round2;
                            double d4 = f4;
                            if (d4 > 1.0d) {
                                round2++;
                                Double.isNaN(d4);
                                d = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round2--;
                                Double.isNaN(d4);
                                d = d4 + 1.0d;
                            }
                            f4 = (float) d;
                        }
                        int m32166y = m32166y(i2, interfaceC2688b, c2689c.f7593m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        mo32240d.measure(makeMeasureSpec2, m32166y);
                        int measuredWidth3 = mo32240d.getMeasuredWidth();
                        int measuredHeight4 = mo32240d.getMeasuredHeight();
                        m32191Y(i11, makeMeasureSpec2, m32166y, mo32240d);
                        this.f7597a.mo32238f(i11, mo32240d);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i10, measuredHeight3 + interfaceC2688b.mo32221o0() + interfaceC2688b.mo32223b0() + this.f7597a.mo32233k(mo32240d));
                    c2689c.f7585e += measuredWidth2 + interfaceC2688b.mo32222f0() + interfaceC2688b.mo32231H0();
                    i7 = max;
                }
                c2689c.f7587g = Math.max(c2689c.f7587g, i7);
                i10 = i7;
            }
            i9++;
            i5 = i6;
            f2 = 0.0f;
        }
        int i13 = i5;
        if (!z2 || i13 == c2689c.f7585e) {
            return;
        }
        m32169v(i, i2, c2689c, i3, i4, true);
    }

    /* renamed from: y */
    private int m32166y(int i, InterfaceC2688b interfaceC2688b, int i2) {
        InterfaceC2687a interfaceC2687a = this.f7597a;
        int mo32235i = interfaceC2687a.mo32235i(i, interfaceC2687a.getPaddingTop() + this.f7597a.getPaddingBottom() + interfaceC2688b.mo32221o0() + interfaceC2688b.mo32223b0() + i2, interfaceC2688b.getHeight());
        int size = View.MeasureSpec.getSize(mo32235i);
        if (size > interfaceC2688b.mo32226U0()) {
            return View.MeasureSpec.makeMeasureSpec(interfaceC2688b.mo32226U0(), View.MeasureSpec.getMode(mo32235i));
        }
        return size < interfaceC2688b.mo32230K0() ? View.MeasureSpec.makeMeasureSpec(interfaceC2688b.mo32230K0(), View.MeasureSpec.getMode(mo32235i)) : mo32235i;
    }

    /* renamed from: z */
    private int m32165z(int i, InterfaceC2688b interfaceC2688b, int i2) {
        InterfaceC2687a interfaceC2687a = this.f7597a;
        int mo32239e = interfaceC2687a.mo32239e(i, interfaceC2687a.getPaddingLeft() + this.f7597a.getPaddingRight() + interfaceC2688b.mo32222f0() + interfaceC2688b.mo32231H0() + i2, interfaceC2688b.getWidth());
        int size = View.MeasureSpec.getSize(mo32239e);
        if (size > interfaceC2688b.mo32224Z0()) {
            return View.MeasureSpec.makeMeasureSpec(interfaceC2688b.mo32224Z0(), View.MeasureSpec.getMode(mo32239e));
        }
        return size < interfaceC2688b.mo32225X() ? View.MeasureSpec.makeMeasureSpec(interfaceC2688b.mo32225X(), View.MeasureSpec.getMode(mo32239e)) : mo32239e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean m32202N(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f7597a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View mo32237g = this.f7597a.mo32237g(i);
            if (mo32237g != null && ((InterfaceC2688b) mo32237g.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m32200P(View view, C2689c c2689c, int i, int i2, int i3, int i4) {
        InterfaceC2688b interfaceC2688b = (InterfaceC2688b) view.getLayoutParams();
        int alignItems = this.f7597a.getAlignItems();
        if (interfaceC2688b.mo32229O() != -1) {
            alignItems = interfaceC2688b.mo32229O();
        }
        int i5 = c2689c.f7587g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f7597a.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - interfaceC2688b.mo32223b0(), i3, i6 - interfaceC2688b.mo32223b0());
                    return;
                }
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + interfaceC2688b.mo32221o0(), i3, (i4 - i5) + view.getMeasuredHeight() + interfaceC2688b.mo32221o0());
                return;
            } else if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + interfaceC2688b.mo32221o0()) - interfaceC2688b.mo32223b0()) / 2;
                if (this.f7597a.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                }
                int i8 = i2 - measuredHeight;
                view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                return;
            } else if (alignItems == 3) {
                if (this.f7597a.getFlexWrap() != 2) {
                    int max = Math.max(c2689c.f7592l - view.getBaseline(), interfaceC2688b.mo32221o0());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                }
                int max2 = Math.max((c2689c.f7592l - view.getMeasuredHeight()) + view.getBaseline(), interfaceC2688b.mo32223b0());
                view.layout(i, i2 - max2, i3, i4 - max2);
                return;
            } else if (alignItems != 4) {
                return;
            }
        }
        if (this.f7597a.getFlexWrap() != 2) {
            view.layout(i, i2 + interfaceC2688b.mo32221o0(), i3, i4 + interfaceC2688b.mo32221o0());
        } else {
            view.layout(i, i2 - interfaceC2688b.mo32223b0(), i3, i4 - interfaceC2688b.mo32223b0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m32199Q(View view, C2689c c2689c, boolean z, int i, int i2, int i3, int i4) {
        InterfaceC2688b interfaceC2688b = (InterfaceC2688b) view.getLayoutParams();
        int alignItems = this.f7597a.getAlignItems();
        if (interfaceC2688b.mo32229O() != -1) {
            alignItems = interfaceC2688b.mo32229O();
        }
        int i5 = c2689c.f7587g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - interfaceC2688b.mo32231H0(), i2, ((i3 + i5) - view.getMeasuredWidth()) - interfaceC2688b.mo32231H0(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + interfaceC2688b.mo32222f0(), i2, (i3 - i5) + view.getMeasuredWidth() + interfaceC2688b.mo32222f0(), i4);
                    return;
                }
            } else if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + C7713h.m17730b(marginLayoutParams)) - C7713h.m17731a(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            } else if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + interfaceC2688b.mo32222f0(), i2, i3 + interfaceC2688b.mo32222f0(), i4);
        } else {
            view.layout(i - interfaceC2688b.mo32231H0(), i2, i3 - interfaceC2688b.mo32231H0(), i4);
        }
    }

    /* renamed from: R */
    long m32198R(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m32193W() {
        m32192X(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m32192X(int i) {
        View mo32240d;
        if (i >= this.f7597a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f7597a.getFlexDirection();
        if (this.f7597a.getAlignItems() == 4) {
            int[] iArr = this.f7599c;
            List<C2689c> flexLinesInternal = this.f7597a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                C2689c c2689c = flexLinesInternal.get(i2);
                int i3 = c2689c.f7588h;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = c2689c.f7595o + i4;
                    if (i4 < this.f7597a.getFlexItemCount() && (mo32240d = this.f7597a.mo32240d(i5)) != null && mo32240d.getVisibility() != 8) {
                        InterfaceC2688b interfaceC2688b = (InterfaceC2688b) mo32240d.getLayoutParams();
                        if (interfaceC2688b.mo32229O() == -1 || interfaceC2688b.mo32229O() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                m32194V(mo32240d, c2689c.f7587g, i5);
                            } else if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            } else {
                                m32195U(mo32240d, c2689c.f7587g, i5);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (C2689c c2689c2 : this.f7597a.getFlexLinesInternal()) {
            for (Integer num : c2689c2.f7594n) {
                View mo32240d2 = this.f7597a.mo32240d(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    m32194V(mo32240d2, c2689c2.f7587g, num.intValue());
                } else if (flexDirection != 2 && flexDirection != 3) {
                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                } else {
                    m32195U(mo32240d2, c2689c2.f7587g, num.intValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m32189b(C2692b c2692b, int i, int i2, int i3, int i4, int i5, List<C2689c> list) {
        int i6;
        C2692b c2692b2;
        int i7;
        int i8;
        int i9;
        List<C2689c> list2;
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C2689c c2689c;
        int i17;
        int i18 = i;
        int i19 = i2;
        int i20 = i5;
        boolean mo32234j = this.f7597a.mo32234j();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        ArrayList arrayList = list == null ? new ArrayList() : list;
        c2692b.f7602a = arrayList;
        boolean z = i20 == -1;
        int m32206J = m32206J(mo32234j);
        int m32208H = m32208H(mo32234j);
        int m32207I = m32207I(mo32234j);
        int m32209G = m32209G(mo32234j);
        C2689c c2689c2 = new C2689c();
        int i21 = i4;
        c2689c2.f7595o = i21;
        int i22 = m32208H + m32206J;
        c2689c2.f7585e = i22;
        int flexItemCount = this.f7597a.getFlexItemCount();
        boolean z2 = z;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = Integer.MIN_VALUE;
        while (true) {
            if (i21 >= flexItemCount) {
                i6 = i24;
                c2692b2 = c2692b;
                break;
            }
            View mo32240d = this.f7597a.mo32240d(i21);
            if (mo32240d == null) {
                if (m32203M(i21, flexItemCount, c2689c2)) {
                    m32190a(arrayList, c2689c2, i21, i23);
                }
            } else if (mo32240d.getVisibility() == 8) {
                c2689c2.f7589i++;
                c2689c2.f7588h++;
                if (m32203M(i21, flexItemCount, c2689c2)) {
                    m32190a(arrayList, c2689c2, i21, i23);
                }
            } else {
                InterfaceC2688b interfaceC2688b = (InterfaceC2688b) mo32240d.getLayoutParams();
                int i27 = flexItemCount;
                if (interfaceC2688b.mo32229O() == 4) {
                    c2689c2.f7594n.add(Integer.valueOf(i21));
                }
                int m32210F = m32210F(interfaceC2688b, mo32234j);
                if (interfaceC2688b.mo32232A0() != -1.0f && mode == 1073741824) {
                    m32210F = Math.round(size * interfaceC2688b.mo32232A0());
                }
                if (mo32234j) {
                    int mo32239e = this.f7597a.mo32239e(i18, i22 + m32212D(interfaceC2688b, true) + m32214B(interfaceC2688b, true), m32210F);
                    i7 = size;
                    i8 = mode;
                    int mo32235i = this.f7597a.mo32235i(i19, m32207I + m32209G + m32213C(interfaceC2688b, true) + m32215A(interfaceC2688b, true) + i23, m32211E(interfaceC2688b, true));
                    mo32240d.measure(mo32239e, mo32235i);
                    m32191Y(i21, mo32239e, mo32235i, mo32240d);
                    i9 = mo32239e;
                } else {
                    i7 = size;
                    i8 = mode;
                    int mo32239e2 = this.f7597a.mo32239e(i19, m32207I + m32209G + m32213C(interfaceC2688b, false) + m32215A(interfaceC2688b, false) + i23, m32211E(interfaceC2688b, false));
                    int mo32235i2 = this.f7597a.mo32235i(i18, m32212D(interfaceC2688b, false) + i22 + m32214B(interfaceC2688b, false), m32210F);
                    mo32240d.measure(mo32239e2, mo32235i2);
                    m32191Y(i21, mo32239e2, mo32235i2, mo32240d);
                    i9 = mo32235i2;
                }
                this.f7597a.mo32238f(i21, mo32240d);
                m32182i(mo32240d, i21);
                i24 = View.combineMeasuredStates(i24, mo32240d.getMeasuredState());
                int i28 = i23;
                int i29 = i22;
                C2689c c2689c3 = c2689c2;
                int i30 = i21;
                list2 = arrayList;
                int i31 = i9;
                if (m32201O(mo32240d, i8, i7, c2689c2.f7585e, m32214B(interfaceC2688b, mo32234j) + m32204L(mo32240d, mo32234j) + m32212D(interfaceC2688b, mo32234j), interfaceC2688b, i30, i25, arrayList.size())) {
                    if (c2689c3.m32217c() > 0) {
                        if (i30 > 0) {
                            i17 = i30 - 1;
                            c2689c = c2689c3;
                        } else {
                            c2689c = c2689c3;
                            i17 = 0;
                        }
                        m32190a(list2, c2689c, i17, i28);
                        i23 = c2689c.f7587g + i28;
                    } else {
                        i23 = i28;
                    }
                    if (mo32234j) {
                        if (interfaceC2688b.getHeight() == -1) {
                            InterfaceC2687a interfaceC2687a = this.f7597a;
                            i10 = i2;
                            i21 = i30;
                            view = mo32240d;
                            view.measure(i31, interfaceC2687a.mo32235i(i10, interfaceC2687a.getPaddingTop() + this.f7597a.getPaddingBottom() + interfaceC2688b.mo32221o0() + interfaceC2688b.mo32223b0() + i23, interfaceC2688b.getHeight()));
                            m32182i(view, i21);
                        } else {
                            i10 = i2;
                            view = mo32240d;
                            i21 = i30;
                        }
                    } else {
                        i10 = i2;
                        view = mo32240d;
                        i21 = i30;
                        if (interfaceC2688b.getWidth() == -1) {
                            InterfaceC2687a interfaceC2687a2 = this.f7597a;
                            view.measure(interfaceC2687a2.mo32239e(i10, interfaceC2687a2.getPaddingLeft() + this.f7597a.getPaddingRight() + interfaceC2688b.mo32222f0() + interfaceC2688b.mo32231H0() + i23, interfaceC2688b.getWidth()), i31);
                            m32182i(view, i21);
                        }
                    }
                    c2689c2 = new C2689c();
                    c2689c2.f7588h = 1;
                    i11 = i29;
                    c2689c2.f7585e = i11;
                    c2689c2.f7595o = i21;
                    i12 = 0;
                    i13 = Integer.MIN_VALUE;
                } else {
                    i10 = i2;
                    view = mo32240d;
                    i21 = i30;
                    c2689c2 = c2689c3;
                    i11 = i29;
                    c2689c2.f7588h++;
                    i12 = i25 + 1;
                    i23 = i28;
                    i13 = i26;
                }
                int[] iArr = this.f7599c;
                if (iArr != null) {
                    iArr[i21] = list2.size();
                }
                c2689c2.f7585e += m32204L(view, mo32234j) + m32212D(interfaceC2688b, mo32234j) + m32214B(interfaceC2688b, mo32234j);
                c2689c2.f7590j += interfaceC2688b.mo32220u0();
                c2689c2.f7591k += interfaceC2688b.mo32228P();
                this.f7597a.mo32242b(view, i21, i12, c2689c2);
                int max = Math.max(i13, m32205K(view, mo32234j) + m32213C(interfaceC2688b, mo32234j) + m32215A(interfaceC2688b, mo32234j) + this.f7597a.mo32233k(view));
                c2689c2.f7587g = Math.max(c2689c2.f7587g, max);
                if (mo32234j) {
                    if (this.f7597a.getFlexWrap() != 2) {
                        c2689c2.f7592l = Math.max(c2689c2.f7592l, view.getBaseline() + interfaceC2688b.mo32221o0());
                    } else {
                        c2689c2.f7592l = Math.max(c2689c2.f7592l, (view.getMeasuredHeight() - view.getBaseline()) + interfaceC2688b.mo32223b0());
                    }
                }
                i14 = i27;
                if (m32203M(i21, i14, c2689c2)) {
                    m32190a(list2, c2689c2, i21, i23);
                    i23 += c2689c2.f7587g;
                }
                i15 = i5;
                if (i15 != -1 && list2.size() > 0) {
                    if (list2.get(list2.size() - 1).f7596p >= i15 && i21 >= i15 && !z2) {
                        i23 = -c2689c2.m32219a();
                        i16 = i3;
                        z2 = true;
                        if (i23 <= i16 && z2) {
                            c2692b2 = c2692b;
                            i6 = i24;
                            break;
                        }
                        i25 = i12;
                        i26 = max;
                        i21++;
                        i18 = i;
                        flexItemCount = i14;
                        i19 = i10;
                        i22 = i11;
                        arrayList = list2;
                        mode = i8;
                        i20 = i15;
                        size = i7;
                    }
                }
                i16 = i3;
                if (i23 <= i16) {
                }
                i25 = i12;
                i26 = max;
                i21++;
                i18 = i;
                flexItemCount = i14;
                i19 = i10;
                i22 = i11;
                arrayList = list2;
                mode = i8;
                i20 = i15;
                size = i7;
            }
            i7 = size;
            i8 = mode;
            i10 = i19;
            i15 = i20;
            list2 = arrayList;
            i11 = i22;
            i14 = flexItemCount;
            i21++;
            i18 = i;
            flexItemCount = i14;
            i19 = i10;
            i22 = i11;
            arrayList = list2;
            mode = i8;
            i20 = i15;
            size = i7;
        }
        c2692b2.f7603b = i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m32188c(C2692b c2692b, int i, int i2) {
        m32189b(c2692b, i, i2, Integer.MAX_VALUE, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m32187d(C2692b c2692b, int i, int i2, int i3, int i4, List<C2689c> list) {
        m32189b(c2692b, i, i2, i3, i4, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m32186e(C2692b c2692b, int i, int i2, int i3, int i4, List<C2689c> list) {
        m32189b(c2692b, i, i2, i3, 0, i4, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m32185f(C2692b c2692b, int i, int i2) {
        m32189b(c2692b, i2, i, Integer.MAX_VALUE, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m32184g(C2692b c2692b, int i, int i2, int i3, int i4, List<C2689c> list) {
        m32189b(c2692b, i2, i, i3, i4, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m32183h(C2692b c2692b, int i, int i2, int i3, int i4, List<C2689c> list) {
        m32189b(c2692b, i2, i, i3, 0, i4, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m32181j(List<C2689c> list, int i) {
        int i2 = this.f7599c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.f7599c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f7600d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] m32178m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f7597a.getFlexItemCount();
        return m32196T(flexItemCount, m32179l(flexItemCount), sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int[] m32177n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f7597a.getFlexItemCount();
        List<C2693c> m32179l = m32179l(flexItemCount);
        C2693c c2693c = new C2693c();
        if (view != null && (layoutParams instanceof InterfaceC2688b)) {
            c2693c.f7605d = ((InterfaceC2688b) layoutParams).getOrder();
        } else {
            c2693c.f7605d = 1;
        }
        if (i != -1 && i != flexItemCount) {
            if (i < this.f7597a.getFlexItemCount()) {
                c2693c.f7604c = i;
                while (i < flexItemCount) {
                    m32179l.get(i).f7604c++;
                    i++;
                }
            } else {
                c2693c.f7604c = flexItemCount;
            }
        } else {
            c2693c.f7604c = flexItemCount;
        }
        m32179l.add(c2693c);
        return m32196T(flexItemCount + 1, m32179l, sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m32176o(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.f7597a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection != 2 && flexDirection != 3) {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        } else {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        }
        List<C2689c> flexLinesInternal = this.f7597a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.f7597a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f7587g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f7597a.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    C2689c c2689c = new C2689c();
                    c2689c.f7587g = i7;
                    flexLinesInternal.add(0, c2689c);
                } else if (alignContent == 2) {
                    this.f7597a.setFlexLines(m32180k(flexLinesInternal, i5, sumOfCrossSize));
                } else if (alignContent == 3) {
                    if (sumOfCrossSize >= i5) {
                        return;
                    }
                    float size2 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i6 < size3) {
                        arrayList.add(flexLinesInternal.get(i6));
                        if (i6 != flexLinesInternal.size() - 1) {
                            C2689c c2689c2 = new C2689c();
                            if (i6 == flexLinesInternal.size() - 2) {
                                c2689c2.f7587g = Math.round(f + size2);
                                f = 0.0f;
                            } else {
                                c2689c2.f7587g = Math.round(size2);
                            }
                            int i8 = c2689c2.f7587g;
                            f += size2 - i8;
                            if (f > 1.0f) {
                                c2689c2.f7587g = i8 + 1;
                                f -= 1.0f;
                            } else if (f < -1.0f) {
                                c2689c2.f7587g = i8 - 1;
                                f += 1.0f;
                            }
                            arrayList.add(c2689c2);
                        }
                        i6++;
                    }
                    this.f7597a.setFlexLines(arrayList);
                } else if (alignContent == 4) {
                    if (sumOfCrossSize >= i5) {
                        this.f7597a.setFlexLines(m32180k(flexLinesInternal, i5, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    C2689c c2689c3 = new C2689c();
                    c2689c3.f7587g = size4;
                    for (C2689c c2689c4 : flexLinesInternal) {
                        arrayList2.add(c2689c3);
                        arrayList2.add(c2689c4);
                        arrayList2.add(c2689c3);
                    }
                    this.f7597a.setFlexLines(arrayList2);
                } else if (alignContent == 5 && sumOfCrossSize < i5) {
                    float size5 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i6 < size6) {
                        C2689c c2689c5 = flexLinesInternal.get(i6);
                        float f3 = c2689c5.f7587g + size5;
                        if (i6 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int round = Math.round(f3);
                        f2 += f3 - round;
                        if (f2 > 1.0f) {
                            round++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            round--;
                            f2 += 1.0f;
                        }
                        c2689c5.f7587g = round;
                        i6++;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m32175p(int i, int i2) {
        m32174q(i, i2, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m32174q(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        m32173r(this.f7597a.getFlexItemCount());
        if (i3 >= this.f7597a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f7597a.getFlexDirection();
        int flexDirection2 = this.f7597a.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            if (mode != 1073741824) {
                size = this.f7597a.getLargestMainSize();
            }
            paddingLeft = this.f7597a.getPaddingLeft();
            paddingRight = this.f7597a.getPaddingRight();
        } else if (flexDirection2 != 2 && flexDirection2 != 3) {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        } else {
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.f7597a.getLargestMainSize();
            }
            paddingLeft = this.f7597a.getPaddingTop();
            paddingRight = this.f7597a.getPaddingBottom();
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.f7599c;
        int i5 = iArr != null ? iArr[i3] : 0;
        List<C2689c> flexLinesInternal = this.f7597a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i6 = i5; i6 < size2; i6++) {
            C2689c c2689c = flexLinesInternal.get(i6);
            if (c2689c.f7585e < size) {
                m32169v(i, i2, c2689c, size, i4, false);
            } else {
                m32197S(i, i2, c2689c, size, i4, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m32172s(int i) {
        int[] iArr = this.f7599c;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f7599c = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f7599c = Arrays.copyOf(this.f7599c, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m32171t(int i) {
        long[] jArr = this.f7600d;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f7600d = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f7600d = Arrays.copyOf(this.f7600d, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m32170u(int i) {
        long[] jArr = this.f7601e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f7601e = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f7601e = Arrays.copyOf(this.f7601e, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public int m32168w(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public int m32167x(long j) {
        return (int) j;
    }
}
