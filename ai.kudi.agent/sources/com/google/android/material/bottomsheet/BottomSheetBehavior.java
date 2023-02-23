package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.C4696r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p201g.p227h.p233h.C7628a;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p227h.p238l.p239h0.InterfaceC7725f;
import p201g.p243j.p244a.AbstractC7781a;
import p201g.p243j.p245b.C7792c;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9275j;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC1280c<V> {

    /* renamed from: R */
    private static final int f11157R = C9276k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    C7792c f11158A;

    /* renamed from: B */
    private boolean f11159B;

    /* renamed from: C */
    private int f11160C;

    /* renamed from: D */
    private boolean f11161D;

    /* renamed from: E */
    private int f11162E;

    /* renamed from: F */
    int f11163F;

    /* renamed from: G */
    int f11164G;

    /* renamed from: H */
    WeakReference<V> f11165H;

    /* renamed from: I */
    WeakReference<View> f11166I;

    /* renamed from: J */
    private final ArrayList<AbstractC4543f> f11167J;

    /* renamed from: K */
    private VelocityTracker f11168K;

    /* renamed from: L */
    int f11169L;

    /* renamed from: M */
    private int f11170M;

    /* renamed from: N */
    boolean f11171N;

    /* renamed from: O */
    private Map<View, Integer> f11172O;

    /* renamed from: P */
    private int f11173P;

    /* renamed from: Q */
    private final C7792c.AbstractC7795c f11174Q;

    /* renamed from: a */
    private int f11175a;

    /* renamed from: b */
    private boolean f11176b;

    /* renamed from: c */
    private boolean f11177c;

    /* renamed from: d */
    private float f11178d;

    /* renamed from: e */
    private int f11179e;

    /* renamed from: f */
    private boolean f11180f;

    /* renamed from: g */
    private int f11181g;

    /* renamed from: h */
    private int f11182h;

    /* renamed from: i */
    private boolean f11183i;

    /* renamed from: j */
    private C9243g f11184j;

    /* renamed from: k */
    private int f11185k;

    /* renamed from: l */
    private boolean f11186l;

    /* renamed from: m */
    private C9250k f11187m;

    /* renamed from: n */
    private boolean f11188n;

    /* renamed from: o */
    private BottomSheetBehavior<V>.RunnableC4546h f11189o;

    /* renamed from: p */
    private ValueAnimator f11190p;

    /* renamed from: q */
    int f11191q;

    /* renamed from: r */
    int f11192r;

    /* renamed from: s */
    int f11193s;

    /* renamed from: t */
    float f11194t;

    /* renamed from: u */
    int f11195u;

    /* renamed from: v */
    float f11196v;

    /* renamed from: w */
    boolean f11197w;

    /* renamed from: x */
    private boolean f11198x;

    /* renamed from: y */
    private boolean f11199y;

    /* renamed from: z */
    int f11200z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes2.dex */
    public class RunnableC4538a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f11201c;

        /* renamed from: d */
        final /* synthetic */ int f11202d;

        RunnableC4538a(View view, int i) {
            this.f11201c = view;
            this.f11202d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m27433t0(this.f11201c, this.f11202d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes2.dex */
    public class C4539b implements ValueAnimator.AnimatorUpdateListener {
        C4539b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f11184j != null) {
                BottomSheetBehavior.this.f11184j.m15408Y(floatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes2.dex */
    public class C4540c implements C4696r.InterfaceC4699c {
        C4540c() {
        }

        @Override // com.google.android.material.internal.C4696r.InterfaceC4699c
        /* renamed from: a */
        public C7698g0 mo26682a(View view, C7698g0 c7698g0, C4696r.C4700d c4700d) {
            BottomSheetBehavior.this.f11185k = c7698g0.m17787g().f18276d;
            BottomSheetBehavior.this.m27480A0(false);
            return c7698g0;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes2.dex */
    class C4541d extends C7792c.AbstractC7795c {
        C4541d() {
        }

        /* renamed from: n */
        private boolean m27424n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f11164G + bottomSheetBehavior.m27459X()) / 2;
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: a */
        public int mo17316a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: b */
        public int mo17315b(View view, int i, int i2) {
            int m27459X = BottomSheetBehavior.this.m27459X();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C7628a.m17971b(i, m27459X, bottomSheetBehavior.f11197w ? bottomSheetBehavior.f11164G : bottomSheetBehavior.f11195u);
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: e */
        public int mo17312e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f11197w) {
                return bottomSheetBehavior.f11164G;
            }
            return bottomSheetBehavior.f11195u;
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: j */
        public void mo17307j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f11199y) {
                BottomSheetBehavior.this.m27436r0(1);
            }
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: k */
        public void mo17306k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m27462U(i2);
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: l */
        public void mo17305l(View view, float f, float f2) {
            int i;
            int i2 = 4;
            if (f2 < 0.0f) {
                if (BottomSheetBehavior.this.f11176b) {
                    i = BottomSheetBehavior.this.f11192r;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i3 = bottomSheetBehavior.f11193s;
                    if (top > i3) {
                        i = i3;
                        i2 = 6;
                    } else {
                        i = bottomSheetBehavior.f11191q;
                    }
                }
                i2 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.f11197w && bottomSheetBehavior2.m27431v0(view, f2)) {
                    if ((Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) && !m27424n(view)) {
                        if (BottomSheetBehavior.this.f11176b) {
                            i = BottomSheetBehavior.this.f11192r;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.f11191q) < Math.abs(view.getTop() - BottomSheetBehavior.this.f11193s)) {
                            i = BottomSheetBehavior.this.f11191q;
                        } else {
                            i = BottomSheetBehavior.this.f11193s;
                            i2 = 6;
                        }
                        i2 = 3;
                    } else {
                        i = BottomSheetBehavior.this.f11164G;
                        i2 = 5;
                    }
                } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                    if (BottomSheetBehavior.this.f11176b) {
                        i = BottomSheetBehavior.this.f11195u;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f11193s) < Math.abs(top2 - BottomSheetBehavior.this.f11195u)) {
                            i = BottomSheetBehavior.this.f11193s;
                            i2 = 6;
                        } else {
                            i = BottomSheetBehavior.this.f11195u;
                        }
                    }
                } else {
                    int top3 = view.getTop();
                    if (BottomSheetBehavior.this.f11176b) {
                        if (Math.abs(top3 - BottomSheetBehavior.this.f11192r) < Math.abs(top3 - BottomSheetBehavior.this.f11195u)) {
                            i = BottomSheetBehavior.this.f11192r;
                            i2 = 3;
                        } else {
                            i = BottomSheetBehavior.this.f11195u;
                        }
                    } else {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i4 = bottomSheetBehavior3.f11193s;
                        if (top3 < i4) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior3.f11195u)) {
                                i = BottomSheetBehavior.this.f11191q;
                                i2 = 3;
                            } else {
                                i = BottomSheetBehavior.this.f11193s;
                            }
                        } else if (Math.abs(top3 - i4) < Math.abs(top3 - BottomSheetBehavior.this.f11195u)) {
                            i = BottomSheetBehavior.this.f11193s;
                        } else {
                            i = BottomSheetBehavior.this.f11195u;
                        }
                        i2 = 6;
                    }
                }
            }
            BottomSheetBehavior.this.m27430w0(view, i2, i, true);
        }

        @Override // p201g.p243j.p245b.C7792c.AbstractC7795c
        /* renamed from: m */
        public boolean mo17304m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f11200z;
            if (i2 == 1 || bottomSheetBehavior.f11171N) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f11169L == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f11166I;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f11165H;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: classes2.dex */
    public class C4542e implements InterfaceC7725f {

        /* renamed from: a */
        final /* synthetic */ int f11207a;

        C4542e(int i) {
            this.f11207a = i;
        }

        @Override // p201g.p227h.p238l.p239h0.InterfaceC7725f
        /* renamed from: a */
        public boolean mo17629a(View view, InterfaceC7725f.AbstractC7726a abstractC7726a) {
            BottomSheetBehavior.this.m27437q0(this.f11207a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4543f {
        /* renamed from: a */
        public abstract void mo27418a(View view, float f);

        /* renamed from: b */
        public abstract void mo27417b(View view, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    /* loaded from: classes2.dex */
    public class RunnableC4546h implements Runnable {

        /* renamed from: c */
        private final View f11214c;

        /* renamed from: d */
        private boolean f11215d;

        /* renamed from: e */
        int f11216e;

        RunnableC4546h(View view, int i) {
            this.f11214c = view;
            this.f11216e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C7792c c7792c = BottomSheetBehavior.this.f11158A;
            if (c7792c != null && c7792c.m17330m(true)) {
                C7759x.m17514h0(this.f11214c, this);
            } else {
                BottomSheetBehavior.this.m27436r0(this.f11216e);
            }
            this.f11215d = false;
        }
    }

    public BottomSheetBehavior() {
        this.f11175a = 0;
        this.f11176b = true;
        this.f11177c = false;
        this.f11189o = null;
        this.f11194t = 0.5f;
        this.f11196v = -1.0f;
        this.f11199y = true;
        this.f11200z = 4;
        this.f11167J = new ArrayList<>();
        this.f11173P = -1;
        this.f11174Q = new C4541d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public void m27480A0(boolean z) {
        V v;
        if (this.f11165H != null) {
            m27469N();
            if (this.f11200z != 4 || (v = this.f11165H.get()) == null) {
                return;
            }
            if (z) {
                m27432u0(this.f11200z);
            } else {
                v.requestLayout();
            }
        }
    }

    /* renamed from: L */
    private int m27471L(V v, int i, int i2) {
        return C7759x.m17527b(v, v.getResources().getString(i), m27466Q(i2));
    }

    /* renamed from: N */
    private void m27469N() {
        int m27467P = m27467P();
        if (this.f11176b) {
            this.f11195u = Math.max(this.f11164G - m27467P, this.f11192r);
        } else {
            this.f11195u = this.f11164G - m27467P;
        }
    }

    /* renamed from: O */
    private void m27468O() {
        this.f11193s = (int) (this.f11164G * (1.0f - this.f11194t));
    }

    /* renamed from: P */
    private int m27467P() {
        int i;
        if (this.f11180f) {
            return Math.min(Math.max(this.f11181g, this.f11164G - ((this.f11163F * 9) / 16)), this.f11162E);
        }
        if (!this.f11186l && (i = this.f11185k) > 0) {
            return Math.max(this.f11179e, i + this.f11182h);
        }
        return this.f11179e;
    }

    /* renamed from: Q */
    private InterfaceC7725f m27466Q(int i) {
        return new C4542e(i);
    }

    /* renamed from: R */
    private void m27465R(Context context, AttributeSet attributeSet, boolean z) {
        m27464S(context, attributeSet, z, null);
    }

    /* renamed from: S */
    private void m27464S(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f11183i) {
            this.f11187m = C9250k.m15359e(context, attributeSet, C9233b.bottomSheetStyle, f11157R).m15320m();
            C9243g c9243g = new C9243g(this.f11187m);
            this.f11184j = c9243g;
            c9243g.m15420M(context);
            if (z && colorStateList != null) {
                this.f11184j.m15409X(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f11184j.setTint(typedValue.data);
        }
    }

    /* renamed from: T */
    private void m27463T() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11190p = ofFloat;
        ofFloat.setDuration(500L);
        this.f11190p.addUpdateListener(new C4539b());
    }

    /* renamed from: W */
    public static <V extends View> BottomSheetBehavior<V> m27460W(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C1283f) {
            CoordinatorLayout.AbstractC1280c m36505f = ((CoordinatorLayout.C1283f) layoutParams).m36505f();
            if (m36505f instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) m36505f;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: Z */
    private float m27457Z() {
        VelocityTracker velocityTracker = this.f11168K;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f11178d);
        return this.f11168K.getYVelocity(this.f11169L);
    }

    /* renamed from: d0 */
    private void m27453d0(V v, C7716c.C7717a c7717a, int i) {
        C7759x.m17506l0(v, c7717a, null, m27466Q(i));
    }

    /* renamed from: e0 */
    private void m27452e0() {
        this.f11169L = -1;
        VelocityTracker velocityTracker = this.f11168K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11168K = null;
        }
    }

    /* renamed from: f0 */
    private void m27451f0(C4544g c4544g) {
        int i = this.f11175a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f11179e = c4544g.f11210f;
        }
        int i2 = this.f11175a;
        if (i2 == -1 || (i2 & 2) == 2) {
            this.f11176b = c4544g.f11211w;
        }
        int i3 = this.f11175a;
        if (i3 == -1 || (i3 & 4) == 4) {
            this.f11197w = c4544g.f11212x;
        }
        int i4 = this.f11175a;
        if (i4 == -1 || (i4 & 8) == 8) {
            this.f11198x = c4544g.f11213y;
        }
    }

    /* renamed from: s0 */
    private void m27435s0(View view) {
        if (Build.VERSION.SDK_INT < 29 || m27456a0() || this.f11180f) {
            return;
        }
        C4696r.m26688a(view, new C4540c());
    }

    /* renamed from: u0 */
    private void m27432u0(int i) {
        V v = this.f11165H.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C7759x.m17536T(v)) {
            v.post(new RunnableC4538a(v, i));
        } else {
            m27433t0(v, i);
        }
    }

    /* renamed from: x0 */
    private void m27428x0() {
        V v;
        WeakReference<V> weakReference = this.f11165H;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C7759x.m17510j0(v, 524288);
        C7759x.m17510j0(v, 262144);
        C7759x.m17510j0(v, 1048576);
        int i = this.f11173P;
        if (i != -1) {
            C7759x.m17510j0(v, i);
        }
        if (this.f11200z != 6) {
            this.f11173P = m27471L(v, C9275j.bottomsheet_action_expand_halfway, 6);
        }
        if (this.f11197w && this.f11200z != 5) {
            m27453d0(v, C7716c.C7717a.f18481l, 5);
        }
        int i2 = this.f11200z;
        if (i2 == 3) {
            m27453d0(v, C7716c.C7717a.f18480k, this.f11176b ? 4 : 6);
        } else if (i2 == 4) {
            m27453d0(v, C7716c.C7717a.f18479j, this.f11176b ? 3 : 6);
        } else if (i2 != 6) {
        } else {
            m27453d0(v, C7716c.C7717a.f18480k, 4);
            m27453d0(v, C7716c.C7717a.f18479j, 3);
        }
    }

    /* renamed from: y0 */
    private void m27426y0(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f11188n != z) {
            this.f11188n = z;
            if (this.f11184j == null || (valueAnimator = this.f11190p) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f11190p.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.f11190p.setFloatValues(1.0f - f, f);
            this.f11190p.start();
        }
    }

    /* renamed from: z0 */
    private void m27425z0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f11165H;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.f11172O != null) {
                    return;
                }
                this.f11172O = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f11165H.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f11172O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f11177c) {
                            C7759x.m17478z0(childAt, 4);
                        }
                    } else if (this.f11177c && (map = this.f11172O) != null && map.containsKey(childAt)) {
                        C7759x.m17478z0(childAt, this.f11172O.get(childAt).intValue());
                    }
                }
            }
            if (!z) {
                this.f11172O = null;
            } else if (this.f11177c) {
                this.f11165H.get().sendAccessibilityEvent(8);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: A */
    public boolean mo27481A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f11160C = 0;
        this.f11161D = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: C */
    public void mo27479C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3 = 3;
        if (v.getTop() == m27459X()) {
            m27436r0(3);
            return;
        }
        WeakReference<View> weakReference = this.f11166I;
        if (weakReference != null && view == weakReference.get() && this.f11161D) {
            if (this.f11160C > 0) {
                if (this.f11176b) {
                    i2 = this.f11192r;
                } else {
                    int top = v.getTop();
                    int i4 = this.f11193s;
                    if (top > i4) {
                        i2 = i4;
                        i3 = 6;
                    } else {
                        i2 = this.f11191q;
                    }
                }
            } else if (this.f11197w && m27431v0(v, m27457Z())) {
                i2 = this.f11164G;
                i3 = 5;
            } else if (this.f11160C == 0) {
                int top2 = v.getTop();
                if (this.f11176b) {
                    if (Math.abs(top2 - this.f11192r) < Math.abs(top2 - this.f11195u)) {
                        i2 = this.f11192r;
                    } else {
                        i2 = this.f11195u;
                        i3 = 4;
                    }
                } else {
                    int i5 = this.f11193s;
                    if (top2 < i5) {
                        if (top2 < Math.abs(top2 - this.f11195u)) {
                            i2 = this.f11191q;
                        } else {
                            i2 = this.f11193s;
                        }
                    } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.f11195u)) {
                        i2 = this.f11193s;
                    } else {
                        i2 = this.f11195u;
                        i3 = 4;
                    }
                    i3 = 6;
                }
            } else {
                if (this.f11176b) {
                    i2 = this.f11195u;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.f11193s) < Math.abs(top3 - this.f11195u)) {
                        i2 = this.f11193s;
                        i3 = 6;
                    } else {
                        i2 = this.f11195u;
                    }
                }
                i3 = 4;
            }
            m27430w0(v, i3, i2, false);
            this.f11161D = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: D */
    public boolean mo26182D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.f11200z == 1 && actionMasked == 0) {
                return true;
            }
            C7792c c7792c = this.f11158A;
            if (c7792c != null) {
                c7792c.m17354E(motionEvent);
            }
            if (actionMasked == 0) {
                m27452e0();
            }
            if (this.f11168K == null) {
                this.f11168K = VelocityTracker.obtain();
            }
            this.f11168K.addMovement(motionEvent);
            if (this.f11158A != null && actionMasked == 2 && !this.f11159B && Math.abs(this.f11170M - motionEvent.getY()) > this.f11158A.m17318y()) {
                this.f11158A.m17341b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.f11159B;
        }
        return false;
    }

    /* renamed from: M */
    public void m27470M(AbstractC4543f abstractC4543f) {
        if (this.f11167J.contains(abstractC4543f)) {
            return;
        }
        this.f11167J.add(abstractC4543f);
    }

    /* renamed from: U */
    void m27462U(int i) {
        float f;
        float f2;
        V v = this.f11165H.get();
        if (v == null || this.f11167J.isEmpty()) {
            return;
        }
        int i2 = this.f11195u;
        if (i <= i2 && i2 != m27459X()) {
            int i3 = this.f11195u;
            f = i3 - i;
            f2 = i3 - m27459X();
        } else {
            int i4 = this.f11195u;
            f = i4 - i;
            f2 = this.f11164G - i4;
        }
        float f3 = f / f2;
        for (int i5 = 0; i5 < this.f11167J.size(); i5++) {
            this.f11167J.get(i5).mo27418a(v, f3);
        }
    }

    /* renamed from: V */
    View m27461V(View view) {
        if (C7759x.m17534V(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View m27461V = m27461V(viewGroup.getChildAt(i));
                if (m27461V != null) {
                    return m27461V;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: X */
    public int m27459X() {
        return this.f11176b ? this.f11192r : this.f11191q;
    }

    /* renamed from: Y */
    public int m27458Y() {
        return this.f11200z;
    }

    /* renamed from: a0 */
    public boolean m27456a0() {
        return this.f11186l;
    }

    /* renamed from: b0 */
    public boolean m27455b0() {
        return this.f11197w;
    }

    /* renamed from: c0 */
    public void m27454c0(AbstractC4543f abstractC4543f) {
        this.f11167J.remove(abstractC4543f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: g */
    public void mo26183g(CoordinatorLayout.C1283f c1283f) {
        super.mo26183g(c1283f);
        this.f11165H = null;
        this.f11158A = null;
    }

    /* renamed from: g0 */
    public void m27450g0(boolean z) {
        this.f11199y = z;
    }

    /* renamed from: h0 */
    public void m27449h0(int i) {
        if (i >= 0) {
            this.f11191q = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: i0 */
    public void m27448i0(boolean z) {
        if (this.f11176b == z) {
            return;
        }
        this.f11176b = z;
        if (this.f11165H != null) {
            m27469N();
        }
        m27436r0((this.f11176b && this.f11200z == 6) ? 3 : this.f11200z);
        m27428x0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: j */
    public void mo27447j() {
        super.mo27447j();
        this.f11165H = null;
        this.f11158A = null;
    }

    /* renamed from: j0 */
    public void m27446j0(boolean z) {
        this.f11186l = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: k */
    public boolean mo26620k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C7792c c7792c;
        if (v.isShown() && this.f11199y) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m27452e0();
            }
            if (this.f11168K == null) {
                this.f11168K = VelocityTracker.obtain();
            }
            this.f11168K.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.f11170M = (int) motionEvent.getY();
                if (this.f11200z != 2) {
                    WeakReference<View> weakReference = this.f11166I;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.m36527v(view, x, this.f11170M)) {
                        this.f11169L = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f11171N = true;
                    }
                }
                this.f11159B = this.f11169L == -1 && !coordinatorLayout.m36527v(v, x, this.f11170M);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.f11171N = false;
                this.f11169L = -1;
                if (this.f11159B) {
                    this.f11159B = false;
                    return false;
                }
            }
            if (this.f11159B || (c7792c = this.f11158A) == null || !c7792c.m17345N(motionEvent)) {
                WeakReference<View> weakReference2 = this.f11166I;
                View view2 = weakReference2 != null ? weakReference2.get() : null;
                return (actionMasked != 2 || view2 == null || this.f11159B || this.f11200z == 1 || coordinatorLayout.m36527v(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f11158A == null || Math.abs(((float) this.f11170M) - motionEvent.getY()) <= ((float) this.f11158A.m17318y())) ? false : true;
            }
            return true;
        }
        this.f11159B = true;
        return false;
    }

    /* renamed from: k0 */
    public void m27445k0(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.f11194t = f;
            if (this.f11165H != null) {
                m27468O();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: l */
    public boolean mo26206l(CoordinatorLayout coordinatorLayout, V v, int i) {
        C9243g c9243g;
        if (C7759x.m17479z(coordinatorLayout) && !C7759x.m17479z(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f11165H == null) {
            this.f11181g = coordinatorLayout.getResources().getDimensionPixelSize(C9267d.design_bottom_sheet_peek_height_min);
            m27435s0(v);
            this.f11165H = new WeakReference<>(v);
            if (this.f11183i && (c9243g = this.f11184j) != null) {
                C7759x.m17492s0(v, c9243g);
            }
            C9243g c9243g2 = this.f11184j;
            if (c9243g2 != null) {
                float f = this.f11196v;
                if (f == -1.0f) {
                    f = C7759x.m17485w(v);
                }
                c9243g2.m15410W(f);
                boolean z = this.f11200z == 3;
                this.f11188n = z;
                this.f11184j.m15408Y(z ? 0.0f : 1.0f);
            }
            m27428x0();
            if (C7759x.m17567A(v) == 0) {
                C7759x.m17478z0(v, 1);
            }
        }
        if (this.f11158A == null) {
            this.f11158A = C7792c.m17328o(coordinatorLayout, this.f11174Q);
        }
        int top = v.getTop();
        coordinatorLayout.m36564C(v, i);
        this.f11163F = coordinatorLayout.getWidth();
        this.f11164G = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f11162E = height;
        this.f11192r = Math.max(0, this.f11164G - height);
        m27468O();
        m27469N();
        int i2 = this.f11200z;
        if (i2 == 3) {
            C7759x.m17528a0(v, m27459X());
        } else if (i2 == 6) {
            C7759x.m17528a0(v, this.f11193s);
        } else if (this.f11197w && i2 == 5) {
            C7759x.m17528a0(v, this.f11164G);
        } else {
            int i3 = this.f11200z;
            if (i3 == 4) {
                C7759x.m17528a0(v, this.f11195u);
            } else if (i3 == 1 || i3 == 2) {
                C7759x.m17528a0(v, top - v.getTop());
            }
        }
        this.f11166I = new WeakReference<>(m27461V(v));
        return true;
    }

    /* renamed from: l0 */
    public void m27444l0(boolean z) {
        if (this.f11197w != z) {
            this.f11197w = z;
            if (!z && this.f11200z == 5) {
                m27437q0(4);
            }
            m27428x0();
        }
    }

    /* renamed from: m0 */
    public void m27443m0(int i) {
        m27442n0(i, false);
    }

    /* renamed from: n0 */
    public final void m27442n0(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.f11180f) {
                this.f11180f = true;
            }
            z2 = false;
        } else {
            if (this.f11180f || this.f11179e != i) {
                this.f11180f = false;
                this.f11179e = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            m27480A0(z);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: o */
    public boolean mo27441o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f11166I;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f11200z != 3 || super.mo27441o(coordinatorLayout, v, view, f, f2);
    }

    /* renamed from: o0 */
    public void m27440o0(int i) {
        this.f11175a = i;
    }

    /* renamed from: p0 */
    public void m27439p0(boolean z) {
        this.f11198x = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: q */
    public void mo27438q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f11166I;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < m27459X()) {
                iArr[1] = top - m27459X();
                C7759x.m17528a0(v, -iArr[1]);
                m27436r0(3);
            } else if (!this.f11199y) {
                return;
            } else {
                iArr[1] = i2;
                C7759x.m17528a0(v, -i2);
                m27436r0(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.f11195u;
            if (i4 > i5 && !this.f11197w) {
                iArr[1] = top - i5;
                C7759x.m17528a0(v, -iArr[1]);
                m27436r0(4);
            } else if (!this.f11199y) {
                return;
            } else {
                iArr[1] = i2;
                C7759x.m17528a0(v, -i2);
                m27436r0(1);
            }
        }
        m27462U(v.getTop());
        this.f11160C = i2;
        this.f11161D = true;
    }

    /* renamed from: q0 */
    public void m27437q0(int i) {
        if (i == this.f11200z) {
            return;
        }
        if (this.f11165H == null) {
            if (i == 4 || i == 3 || i == 6 || (this.f11197w && i == 5)) {
                this.f11200z = i;
                return;
            }
            return;
        }
        m27432u0(i);
    }

    /* renamed from: r0 */
    void m27436r0(int i) {
        V v;
        if (this.f11200z == i) {
            return;
        }
        this.f11200z = i;
        WeakReference<V> weakReference = this.f11165H;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m27425z0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m27425z0(false);
        }
        m27426y0(i);
        for (int i2 = 0; i2 < this.f11167J.size(); i2++) {
            this.f11167J.get(i2).mo27417b(v, i);
        }
        m27428x0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: t */
    public void mo27434t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: t0 */
    void m27433t0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f11195u;
        } else if (i == 6) {
            int i4 = this.f11193s;
            if (!this.f11176b || i4 > (i3 = this.f11192r)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = m27459X();
        } else if (this.f11197w && i == 5) {
            i2 = this.f11164G;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        }
        m27430w0(view, i, i2, false);
    }

    /* renamed from: v0 */
    boolean m27431v0(View view, float f) {
        if (this.f11198x) {
            return true;
        }
        if (view.getTop() < this.f11195u) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f11195u)) / ((float) m27467P()) > 0.5f;
    }

    /* renamed from: w0 */
    void m27430w0(View view, int i, int i2, boolean z) {
        C7792c c7792c = this.f11158A;
        if (c7792c != null && (!z ? !c7792c.m17344O(view, view.getLeft(), i2) : !c7792c.m17346M(view.getLeft(), i2))) {
            m27436r0(2);
            m27426y0(i);
            if (this.f11189o == null) {
                this.f11189o = new RunnableC4546h(view, i);
            }
            if (!((RunnableC4546h) this.f11189o).f11215d) {
                BottomSheetBehavior<V>.RunnableC4546h runnableC4546h = this.f11189o;
                runnableC4546h.f11216e = i;
                C7759x.m17514h0(view, runnableC4546h);
                ((RunnableC4546h) this.f11189o).f11215d = true;
                return;
            }
            this.f11189o.f11216e = i;
            return;
        }
        m27436r0(i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: x */
    public void mo27429x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C4544g c4544g = (C4544g) parcelable;
        super.mo27429x(coordinatorLayout, v, c4544g.m17424a());
        m27451f0(c4544g);
        int i = c4544g.f11209e;
        if (i != 1 && i != 2) {
            this.f11200z = i;
        } else {
            this.f11200z = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: y */
    public Parcelable mo27427y(CoordinatorLayout coordinatorLayout, V v) {
        return new C4544g(super.mo27427y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    /* loaded from: classes2.dex */
    public static class C4544g extends AbstractC7781a {
        public static final Parcelable.Creator<C4544g> CREATOR = new C4545a();

        /* renamed from: e */
        final int f11209e;

        /* renamed from: f */
        int f11210f;

        /* renamed from: w */
        boolean f11211w;

        /* renamed from: x */
        boolean f11212x;

        /* renamed from: y */
        boolean f11213y;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g$a */
        /* loaded from: classes2.dex */
        static class C4545a implements Parcelable.ClassLoaderCreator<C4544g> {
            C4545a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4544g createFromParcel(Parcel parcel) {
                return new C4544g(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4544g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4544g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4544g[] newArray(int i) {
                return new C4544g[i];
            }
        }

        public C4544g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11209e = parcel.readInt();
            this.f11210f = parcel.readInt();
            this.f11211w = parcel.readInt() == 1;
            this.f11212x = parcel.readInt() == 1;
            this.f11213y = parcel.readInt() == 1;
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11209e);
            parcel.writeInt(this.f11210f);
            parcel.writeInt(this.f11211w ? 1 : 0);
            parcel.writeInt(this.f11212x ? 1 : 0);
            parcel.writeInt(this.f11213y ? 1 : 0);
        }

        public C4544g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f11209e = bottomSheetBehavior.f11200z;
            this.f11210f = ((BottomSheetBehavior) bottomSheetBehavior).f11179e;
            this.f11211w = ((BottomSheetBehavior) bottomSheetBehavior).f11176b;
            this.f11212x = bottomSheetBehavior.f11197w;
            this.f11213y = ((BottomSheetBehavior) bottomSheetBehavior).f11198x;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f11175a = 0;
        this.f11176b = true;
        this.f11177c = false;
        this.f11189o = null;
        this.f11194t = 0.5f;
        this.f11196v = -1.0f;
        this.f11199y = true;
        this.f11200z = 4;
        this.f11167J = new ArrayList<>();
        this.f11173P = -1;
        this.f11174Q = new C4541d();
        this.f11182h = context.getResources().getDimensionPixelSize(C9267d.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.BottomSheetBehavior_Layout);
        this.f11183i = obtainStyledAttributes.hasValue(C9277l.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(C9277l.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            m27464S(context, attributeSet, hasValue, C9321c.m15053a(context, obtainStyledAttributes, C9277l.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            m27465R(context, attributeSet, hasValue);
        }
        m27463T();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f11196v = obtainStyledAttributes.getDimension(C9277l.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(C9277l.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && (i = peekValue.data) == -1) {
            m27443m0(i);
        } else {
            m27443m0(obtainStyledAttributes.getDimensionPixelSize(C9277l.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        m27444l0(obtainStyledAttributes.getBoolean(C9277l.BottomSheetBehavior_Layout_behavior_hideable, false));
        m27446j0(obtainStyledAttributes.getBoolean(C9277l.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        m27448i0(obtainStyledAttributes.getBoolean(C9277l.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        m27439p0(obtainStyledAttributes.getBoolean(C9277l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        m27450g0(obtainStyledAttributes.getBoolean(C9277l.BottomSheetBehavior_Layout_behavior_draggable, true));
        m27440o0(obtainStyledAttributes.getInt(C9277l.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        m27445k0(obtainStyledAttributes.getFloat(C9277l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(C9277l.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            m27449h0(peekValue2.data);
        } else {
            m27449h0(obtainStyledAttributes.getDimensionPixelOffset(C9277l.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        obtainStyledAttributes.recycle();
        this.f11178d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
