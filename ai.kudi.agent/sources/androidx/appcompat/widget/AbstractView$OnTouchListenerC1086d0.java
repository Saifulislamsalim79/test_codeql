package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.InterfaceC1019p;
/* compiled from: ForwardingListener.java */
/* renamed from: androidx.appcompat.widget.d0 */
/* loaded from: classes2.dex */
public abstract class AbstractView$OnTouchListenerC1086d0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: A */
    private final int[] f3285A = new int[2];

    /* renamed from: c */
    private final float f3286c;

    /* renamed from: d */
    private final int f3287d;

    /* renamed from: e */
    private final int f3288e;

    /* renamed from: f */
    final View f3289f;

    /* renamed from: w */
    private Runnable f3290w;

    /* renamed from: x */
    private Runnable f3291x;

    /* renamed from: y */
    private boolean f3292y;

    /* renamed from: z */
    private int f3293z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* renamed from: androidx.appcompat.widget.d0$a */
    /* loaded from: classes2.dex */
    public class RunnableC1087a implements Runnable {
        RunnableC1087a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC1086d0.this.f3289f.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* renamed from: androidx.appcompat.widget.d0$b */
    /* loaded from: classes2.dex */
    public class RunnableC1088b implements Runnable {
        RunnableC1088b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC1086d0.this.m37230e();
        }
    }

    public AbstractView$OnTouchListenerC1086d0(View view) {
        this.f3289f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3286c = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3287d = tapTimeout;
        this.f3288e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m37232a() {
        Runnable runnable = this.f3291x;
        if (runnable != null) {
            this.f3289f.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f3290w;
        if (runnable2 != null) {
            this.f3289f.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m37229f(MotionEvent motionEvent) {
        C1070b0 c1070b0;
        View view = this.f3289f;
        InterfaceC1019p mo37006b = mo37006b();
        if (mo37006b == null || !mo37006b.mo37195b() || (c1070b0 = (C1070b0) mo37006b.mo37188p()) == null || !c1070b0.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m37226i(view, obtainNoHistory);
        m37225j(c1070b0, obtainNoHistory);
        boolean m37276e = c1070b0.m37276e(obtainNoHistory, this.f3293z);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return m37276e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m37228g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f3289f
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f3293z
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f3286c
            boolean r6 = m37227h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m37232a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m37232a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f3293z = r6
            java.lang.Runnable r6 = r5.f3290w
            if (r6 != 0) goto L52
            androidx.appcompat.widget.d0$a r6 = new androidx.appcompat.widget.d0$a
            r6.<init>()
            r5.f3290w = r6
        L52:
            java.lang.Runnable r6 = r5.f3290w
            int r1 = r5.f3287d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f3291x
            if (r6 != 0) goto L65
            androidx.appcompat.widget.d0$b r6 = new androidx.appcompat.widget.d0$b
            r6.<init>()
            r5.f3291x = r6
        L65:
            java.lang.Runnable r6 = r5.f3291x
            int r1 = r5.f3288e
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractView$OnTouchListenerC1086d0.m37228g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m37227h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: i */
    private boolean m37226i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3285A;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m37225j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3285A;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    /* renamed from: b */
    public abstract InterfaceC1019p mo37006b();

    /* renamed from: c */
    protected abstract boolean mo37005c();

    /* renamed from: d */
    protected boolean mo37231d() {
        InterfaceC1019p mo37006b = mo37006b();
        if (mo37006b == null || !mo37006b.mo37195b()) {
            return true;
        }
        mo37006b.dismiss();
        return true;
    }

    /* renamed from: e */
    void m37230e() {
        m37232a();
        View view = this.f3289f;
        if (view.isEnabled() && !view.isLongClickable() && mo37005c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f3292y = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f3292y;
        if (z2) {
            z = m37229f(motionEvent) || !mo37231d();
        } else {
            z = m37228g(motionEvent) && mo37005c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f3289f.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f3292y = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f3292y = false;
        this.f3293z = -1;
        Runnable runnable = this.f3290w;
        if (runnable != null) {
            this.f3289f.removeCallbacks(runnable);
        }
    }
}
