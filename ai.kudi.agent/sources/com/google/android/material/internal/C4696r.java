package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7752q;
/* compiled from: ViewUtils.java */
/* renamed from: com.google.android.material.internal.r */
/* loaded from: classes2.dex */
public class C4696r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.r$a */
    /* loaded from: classes2.dex */
    public static class C4697a implements InterfaceC7752q {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4699c f11778a;

        /* renamed from: b */
        final /* synthetic */ C4700d f11779b;

        C4697a(InterfaceC4699c interfaceC4699c, C4700d c4700d) {
            this.f11778a = interfaceC4699c;
            this.f11779b = c4700d;
        }

        @Override // p201g.p227h.p238l.InterfaceC7752q
        /* renamed from: a */
        public C7698g0 mo17573a(View view, C7698g0 c7698g0) {
            return this.f11778a.mo26682a(view, c7698g0, new C4700d(this.f11779b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.r$b */
    /* loaded from: classes2.dex */
    public static class View$OnAttachStateChangeListenerC4698b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC4698b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C7759x.m17504m0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.r$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4699c {
        /* renamed from: a */
        C7698g0 mo26682a(View view, C7698g0 c7698g0, C4700d c4700d);
    }

    /* renamed from: a */
    public static void m26688a(View view, InterfaceC4699c interfaceC4699c) {
        C7759x.m17562C0(view, new C4697a(interfaceC4699c, new C4700d(C7759x.m17551I(view), view.getPaddingTop(), C7759x.m17553H(view), view.getPaddingBottom())));
        m26683f(view);
    }

    /* renamed from: b */
    public static float m26687b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static float m26686c(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C7759x.m17485w((View) parent);
        }
        return f;
    }

    /* renamed from: d */
    public static boolean m26685d(View view) {
        return C7759x.m17563C(view) == 1;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m26684e(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: f */
    public static void m26683f(View view) {
        if (C7759x.m17536T(view)) {
            C7759x.m17504m0(view);
        } else {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC4698b());
        }
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.r$d */
    /* loaded from: classes2.dex */
    public static class C4700d {

        /* renamed from: a */
        public int f11780a;

        /* renamed from: b */
        public int f11781b;

        /* renamed from: c */
        public int f11782c;

        /* renamed from: d */
        public int f11783d;

        public C4700d(int i, int i2, int i3, int i4) {
            this.f11780a = i;
            this.f11781b = i2;
            this.f11782c = i3;
            this.f11783d = i4;
        }

        /* renamed from: a */
        public void m26681a(View view) {
            C7759x.m17560D0(view, this.f11780a, this.f11781b, this.f11782c, this.f11783d);
        }

        public C4700d(C4700d c4700d) {
            this.f11780a = c4700d.f11780a;
            this.f11781b = c4700d.f11781b;
            this.f11782c = c4700d.f11782c;
            this.f11783d = c4700d.f11783d;
        }
    }
}
