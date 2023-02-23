package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.C7773y;
/* compiled from: TooltipCompatHandler.java */
/* renamed from: androidx.appcompat.widget.u0 */
/* loaded from: classes2.dex */
class View$OnLongClickListenerC1157u0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: B */
    private static View$OnLongClickListenerC1157u0 f3520B;

    /* renamed from: C */
    private static View$OnLongClickListenerC1157u0 f3521C;

    /* renamed from: A */
    private boolean f3522A;

    /* renamed from: c */
    private final View f3523c;

    /* renamed from: d */
    private final CharSequence f3524d;

    /* renamed from: e */
    private final int f3525e;

    /* renamed from: f */
    private final Runnable f3526f = new RunnableC1158a();

    /* renamed from: w */
    private final Runnable f3527w = new RunnableC1159b();

    /* renamed from: x */
    private int f3528x;

    /* renamed from: y */
    private int f3529y;

    /* renamed from: z */
    private C1163v0 f3530z;

    /* compiled from: TooltipCompatHandler.java */
    /* renamed from: androidx.appcompat.widget.u0$a */
    /* loaded from: classes2.dex */
    class RunnableC1158a implements Runnable {
        RunnableC1158a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC1157u0.this.m36977g(false);
        }
    }

    /* compiled from: TooltipCompatHandler.java */
    /* renamed from: androidx.appcompat.widget.u0$b */
    /* loaded from: classes2.dex */
    class RunnableC1159b implements Runnable {
        RunnableC1159b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC1157u0.this.m36981c();
        }
    }

    private View$OnLongClickListenerC1157u0(View view, CharSequence charSequence) {
        this.f3523c = view;
        this.f3524d = charSequence;
        this.f3525e = C7773y.m17438c(ViewConfiguration.get(view.getContext()));
        m36982b();
        this.f3523c.setOnLongClickListener(this);
        this.f3523c.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m36983a() {
        this.f3523c.removeCallbacks(this.f3526f);
    }

    /* renamed from: b */
    private void m36982b() {
        this.f3528x = Integer.MAX_VALUE;
        this.f3529y = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m36980d() {
        this.f3523c.postDelayed(this.f3526f, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m36979e(View$OnLongClickListenerC1157u0 view$OnLongClickListenerC1157u0) {
        View$OnLongClickListenerC1157u0 view$OnLongClickListenerC1157u02 = f3520B;
        if (view$OnLongClickListenerC1157u02 != null) {
            view$OnLongClickListenerC1157u02.m36983a();
        }
        f3520B = view$OnLongClickListenerC1157u0;
        if (view$OnLongClickListenerC1157u0 != null) {
            view$OnLongClickListenerC1157u0.m36980d();
        }
    }

    /* renamed from: f */
    public static void m36978f(View view, CharSequence charSequence) {
        View$OnLongClickListenerC1157u0 view$OnLongClickListenerC1157u0 = f3520B;
        if (view$OnLongClickListenerC1157u0 != null && view$OnLongClickListenerC1157u0.f3523c == view) {
            m36979e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnLongClickListenerC1157u0 view$OnLongClickListenerC1157u02 = f3521C;
            if (view$OnLongClickListenerC1157u02 != null && view$OnLongClickListenerC1157u02.f3523c == view) {
                view$OnLongClickListenerC1157u02.m36981c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerC1157u0(view, charSequence);
    }

    /* renamed from: h */
    private boolean m36976h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f3528x) > this.f3525e || Math.abs(y - this.f3529y) > this.f3525e) {
            this.f3528x = x;
            this.f3529y = y;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    void m36981c() {
        if (f3521C == this) {
            f3521C = null;
            C1163v0 c1163v0 = this.f3530z;
            if (c1163v0 != null) {
                c1163v0.m36944c();
                this.f3530z = null;
                m36982b();
                this.f3523c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3520B == this) {
            m36979e(null);
        }
        this.f3523c.removeCallbacks(this.f3527w);
    }

    /* renamed from: g */
    void m36977g(boolean z) {
        long j;
        int longPressTimeout;
        long j2;
        if (C7759x.m17536T(this.f3523c)) {
            m36979e(null);
            View$OnLongClickListenerC1157u0 view$OnLongClickListenerC1157u0 = f3521C;
            if (view$OnLongClickListenerC1157u0 != null) {
                view$OnLongClickListenerC1157u0.m36981c();
            }
            f3521C = this;
            this.f3522A = z;
            C1163v0 c1163v0 = new C1163v0(this.f3523c.getContext());
            this.f3530z = c1163v0;
            c1163v0.m36942e(this.f3523c, this.f3528x, this.f3529y, this.f3522A, this.f3524d);
            this.f3523c.addOnAttachStateChangeListener(this);
            if (this.f3522A) {
                j2 = 2500;
            } else {
                if ((C7759x.m17542N(this.f3523c) & 1) == 1) {
                    j = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j - longPressTimeout;
            }
            this.f3523c.removeCallbacks(this.f3527w);
            this.f3523c.postDelayed(this.f3527w, j2);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3530z == null || !this.f3522A) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3523c.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    m36982b();
                    m36981c();
                }
            } else if (this.f3523c.isEnabled() && this.f3530z == null && m36976h(motionEvent)) {
                m36979e(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f3528x = view.getWidth() / 2;
        this.f3529y = view.getHeight() / 2;
        m36977g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m36981c();
    }
}
