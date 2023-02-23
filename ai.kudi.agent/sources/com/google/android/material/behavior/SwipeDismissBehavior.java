package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p227h.p238l.p239h0.InterfaceC7725f;
import p201g.p243j.p245b.C7792c;
/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC1280c<V> {

    /* renamed from: a */
    C7792c f11032a;

    /* renamed from: b */
    InterfaceC4510c f11033b;

    /* renamed from: c */
    private boolean f11034c;

    /* renamed from: e */
    private boolean f11036e;

    /* renamed from: d */
    private float f11035d = 0.0f;

    /* renamed from: f */
    int f11037f = 2;

    /* renamed from: g */
    float f11038g = 0.5f;

    /* renamed from: h */
    float f11039h = 0.0f;

    /* renamed from: i */
    float f11040i = 0.5f;

    /* renamed from: j */
    private final C7792c.AbstractC7795c f11041j = new C4508a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes2.dex */
    class C4508a extends C7792c.AbstractC7795c {

        /* renamed from: a */
        private int f11042a;

        /* renamed from: b */
        private int f11043b = -1;

        C4508a() {
        }

        /* renamed from: n */
        private boolean m27585n(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.f11042a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f11038g);
            }
            boolean z = C7759x.m17563C(view) == 1;
            int i = SwipeDismissBehavior.this.f11037f;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            } else if (i == 1) {
                if (z) {
                    if (f <= 0.0f) {
                        return false;
                    }
                } else if (f >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: a */
        public int mo17316a(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = C7759x.m17563C(view) == 1;
            int i3 = SwipeDismissBehavior.this.f11037f;
            if (i3 == 0) {
                if (z) {
                    width = this.f11042a - view.getWidth();
                    width2 = this.f11042a;
                } else {
                    width = this.f11042a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.f11042a - view.getWidth();
                width2 = view.getWidth() + this.f11042a;
            } else if (z) {
                width = this.f11042a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f11042a - view.getWidth();
                width2 = this.f11042a;
            }
            return SwipeDismissBehavior.m27593G(width, i, width2);
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: b */
        public int mo17315b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: d */
        public int mo17313d(View view) {
            return view.getWidth();
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: i */
        public void mo17308i(View view, int i) {
            this.f11043b = i;
            this.f11042a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: j */
        public void mo17307j(int i) {
            InterfaceC4510c interfaceC4510c = SwipeDismissBehavior.this.f11033b;
            if (interfaceC4510c != null) {
                interfaceC4510c.mo26618b(i);
            }
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: k */
        public void mo17306k(View view, int i, int i2, int i3, int i4) {
            float width = this.f11042a + (view.getWidth() * SwipeDismissBehavior.this.f11039h);
            float width2 = this.f11042a + (view.getWidth() * SwipeDismissBehavior.this.f11040i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m27594F(0.0f, 1.0f - SwipeDismissBehavior.m27591I(width, width2, f), 1.0f));
            }
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: l */
        public void mo17305l(View view, float f, float f2) {
            int i;
            boolean z;
            InterfaceC4510c interfaceC4510c;
            this.f11043b = -1;
            int width = view.getWidth();
            if (m27585n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f11042a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f11042a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f11032a.m17346M(i, view.getTop())) {
                C7759x.m17514h0(view, new RunnableC4511d(view, z));
            } else if (!z || (interfaceC4510c = SwipeDismissBehavior.this.f11033b) == null) {
            } else {
                interfaceC4510c.mo26619a(view);
            }
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: m */
        public boolean mo17304m(View view, int i) {
            int i2 = this.f11043b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo26623E(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes2.dex */
    public class C4509b implements InterfaceC7725f {
        C4509b() {
        }

        @Override // p201g.p227h.p238l.p239h0.InterfaceC7725f
        /* renamed from: a */
        public boolean mo17629a(View view, InterfaceC7725f.AbstractC7726a abstractC7726a) {
            boolean z = false;
            if (SwipeDismissBehavior.this.mo26623E(view)) {
                boolean z2 = C7759x.m17563C(view) == 1;
                if ((SwipeDismissBehavior.this.f11037f == 0 && z2) || (SwipeDismissBehavior.this.f11037f == 1 && !z2)) {
                    z = true;
                }
                int width = view.getWidth();
                if (z) {
                    width = -width;
                }
                C7759x.m17530Z(view, width);
                view.setAlpha(0.0f);
                InterfaceC4510c interfaceC4510c = SwipeDismissBehavior.this.f11033b;
                if (interfaceC4510c != null) {
                    interfaceC4510c.mo26619a(view);
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4510c {
        /* renamed from: a */
        void mo26619a(View view);

        /* renamed from: b */
        void mo26618b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    /* loaded from: classes2.dex */
    private class RunnableC4511d implements Runnable {

        /* renamed from: c */
        private final View f11046c;

        /* renamed from: d */
        private final boolean f11047d;

        RunnableC4511d(View view, boolean z) {
            this.f11046c = view;
            this.f11047d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4510c interfaceC4510c;
            C7792c c7792c = SwipeDismissBehavior.this.f11032a;
            if (c7792c != null && c7792c.m17330m(true)) {
                C7759x.m17514h0(this.f11046c, this);
            } else if (!this.f11047d || (interfaceC4510c = SwipeDismissBehavior.this.f11033b) == null) {
            } else {
                interfaceC4510c.mo26619a(this.f11046c);
            }
        }
    }

    /* renamed from: F */
    static float m27594F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m27593G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m27592H(ViewGroup viewGroup) {
        C7792c m17328o;
        if (this.f11032a == null) {
            if (this.f11036e) {
                m17328o = C7792c.m17329n(viewGroup, this.f11035d, this.f11041j);
            } else {
                m17328o = C7792c.m17328o(viewGroup, this.f11041j);
            }
            this.f11032a = m17328o;
        }
    }

    /* renamed from: I */
    static float m27591I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: N */
    private void m27586N(View view) {
        C7759x.m17510j0(view, 1048576);
        if (mo26623E(view)) {
            C7759x.m17506l0(view, C7716c.C7717a.f18481l, null, new C4509b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: D */
    public boolean mo26182D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C7792c c7792c = this.f11032a;
        if (c7792c != null) {
            c7792c.m17354E(motionEvent);
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo26623E(View view) {
        return true;
    }

    /* renamed from: J */
    public void m27590J(float f) {
        this.f11040i = m27594F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void m27589K(InterfaceC4510c interfaceC4510c) {
        this.f11033b = interfaceC4510c;
    }

    /* renamed from: L */
    public void m27588L(float f) {
        this.f11039h = m27594F(0.0f, f, 1.0f);
    }

    /* renamed from: M */
    public void m27587M(int i) {
        this.f11037f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: k */
    public boolean mo26620k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f11034c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m36527v(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f11034c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f11034c = false;
        }
        if (z) {
            m27592H(coordinatorLayout);
            return this.f11032a.m17345N(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: l */
    public boolean mo26206l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean mo26206l = super.mo26206l(coordinatorLayout, v, i);
        if (C7759x.m17567A(v) == 0) {
            C7759x.m17478z0(v, 1);
            m27586N(v);
        }
        return mo26206l;
    }
}
