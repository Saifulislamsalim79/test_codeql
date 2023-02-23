package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p201g.p227h.p238l.C7759x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeaderBehavior.java */
/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4501a<V extends View> extends C4504c<V> {

    /* renamed from: d */
    private Runnable f11002d;

    /* renamed from: e */
    OverScroller f11003e;

    /* renamed from: f */
    private boolean f11004f;

    /* renamed from: g */
    private int f11005g;

    /* renamed from: h */
    private int f11006h;

    /* renamed from: i */
    private int f11007i;

    /* renamed from: j */
    private VelocityTracker f11008j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HeaderBehavior.java */
    /* renamed from: com.google.android.material.appbar.a$a */
    /* loaded from: classes2.dex */
    public class RunnableC4502a implements Runnable {

        /* renamed from: c */
        private final CoordinatorLayout f11009c;

        /* renamed from: d */
        private final V f11010d;

        RunnableC4502a(CoordinatorLayout coordinatorLayout, V v) {
            this.f11009c = coordinatorLayout;
            this.f11010d = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f11010d == null || (overScroller = AbstractC4501a.this.f11003e) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                AbstractC4501a abstractC4501a = AbstractC4501a.this;
                abstractC4501a.m27623P(this.f11009c, this.f11010d, abstractC4501a.f11003e.getCurrY());
                C7759x.m17514h0(this.f11010d, this);
                return;
            }
            AbstractC4501a.this.mo27625N(this.f11009c, this.f11010d);
        }
    }

    public AbstractC4501a() {
        this.f11005g = -1;
        this.f11007i = -1;
    }

    /* renamed from: I */
    private void m27630I() {
        if (this.f11008j == null) {
            this.f11008j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo26182D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f11005g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f11006h = r12
            goto L4c
        L2d:
            int r0 = r11.f11005g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f11006h
            int r7 = r1 - r0
            r11.f11006h = r0
            int r8 = r11.mo27628K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.m27624O(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f11008j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f11008j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f11008j
            int r4 = r11.f11005g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo27627L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m27629J(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f11004f = r3
            r11.f11005g = r1
            android.view.VelocityTracker r13 = r11.f11008j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f11008j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f11008j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f11004f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC4501a.mo26182D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    abstract boolean mo27631H(V v);

    /* renamed from: J */
    final boolean m27629J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.f11002d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f11002d = null;
        }
        if (this.f11003e == null) {
            this.f11003e = new OverScroller(v.getContext());
        }
        this.f11003e.fling(0, m27611E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f11003e.computeScrollOffset()) {
            RunnableC4502a runnableC4502a = new RunnableC4502a(coordinatorLayout, v);
            this.f11002d = runnableC4502a;
            C7759x.m17514h0(v, runnableC4502a);
            return true;
        }
        mo27625N(coordinatorLayout, v);
        return false;
    }

    /* renamed from: K */
    abstract int mo27628K(V v);

    /* renamed from: L */
    abstract int mo27627L(V v);

    /* renamed from: M */
    abstract int mo27626M();

    /* renamed from: N */
    abstract void mo27625N(CoordinatorLayout coordinatorLayout, V v);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final int m27624O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo27622Q(coordinatorLayout, v, mo27626M() - i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public int m27623P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo27622Q(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: Q */
    abstract int mo27622Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: k */
    public boolean mo26620k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f11007i < 0) {
            this.f11007i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f11004f) {
            int i = this.f11005g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f11006h) > this.f11007i) {
                this.f11006h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f11005g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo27631H(v) && coordinatorLayout.m36527v(v, x, y2);
            this.f11004f = z;
            if (z) {
                this.f11006h = y2;
                this.f11005g = motionEvent.getPointerId(0);
                m27630I();
                OverScroller overScroller = this.f11003e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f11003e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f11008j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC4501a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11005g = -1;
        this.f11007i = -1;
    }
}
