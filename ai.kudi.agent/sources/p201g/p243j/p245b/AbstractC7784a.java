package p201g.p243j.p245b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import p201g.p218e.C7535h;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7684b0;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p227h.p238l.p239h0.C7720d;
import p201g.p227h.p238l.p239h0.C7724e;
import p201g.p243j.p245b.C7788b;
/* compiled from: ExploreByTouchHelper.java */
/* renamed from: g.j.b.a */
/* loaded from: classes2.dex */
public abstract class AbstractC7784a extends C7676a {

    /* renamed from: n */
    private static final Rect f18553n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final C7788b.InterfaceC7789a<C7716c> f18554o = new C7785a();

    /* renamed from: p */
    private static final C7788b.InterfaceC7790b<C7535h<C7716c>, C7716c> f18555p = new C7786b();

    /* renamed from: h */
    private final AccessibilityManager f18560h;

    /* renamed from: i */
    private final View f18561i;

    /* renamed from: j */
    private C7787c f18562j;

    /* renamed from: d */
    private final Rect f18556d = new Rect();

    /* renamed from: e */
    private final Rect f18557e = new Rect();

    /* renamed from: f */
    private final Rect f18558f = new Rect();

    /* renamed from: g */
    private final int[] f18559g = new int[2];

    /* renamed from: k */
    int f18563k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f18564l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f18565m = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: g.j.b.a$a */
    /* loaded from: classes2.dex */
    static class C7785a implements C7788b.InterfaceC7789a<C7716c> {
        C7785a() {
        }

        @Override // p201g.p243j.p245b.C7788b.InterfaceC7789a
        /* renamed from: b */
        public void mo17361a(C7716c c7716c, Rect rect) {
            c7716c.m17670m(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: g.j.b.a$b */
    /* loaded from: classes2.dex */
    static class C7786b implements C7788b.InterfaceC7790b<C7535h<C7716c>, C7716c> {
        C7786b() {
        }

        @Override // p201g.p243j.p245b.C7788b.InterfaceC7790b
        /* renamed from: c */
        public C7716c mo17360a(C7535h<C7716c> c7535h, int i) {
            return c7535h.m18437k(i);
        }

        @Override // p201g.p243j.p245b.C7788b.InterfaceC7790b
        /* renamed from: d */
        public int mo17359b(C7535h<C7716c> c7535h) {
            return c7535h.m18438j();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: g.j.b.a$c */
    /* loaded from: classes2.dex */
    private class C7787c extends C7720d {
        C7787c() {
        }

        @Override // p201g.p227h.p238l.p239h0.C7720d
        /* renamed from: b */
        public C7716c mo17379b(int i) {
            return C7716c.m17705P(AbstractC7784a.this.m17413H(i));
        }

        @Override // p201g.p227h.p238l.p239h0.C7720d
        /* renamed from: d */
        public C7716c mo17378d(int i) {
            int i2 = i == 2 ? AbstractC7784a.this.f18563k : AbstractC7784a.this.f18564l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo17379b(i2);
        }

        @Override // p201g.p227h.p238l.p239h0.C7720d
        /* renamed from: f */
        public boolean mo17377f(int i, int i2, Bundle bundle) {
            return AbstractC7784a.this.m17405P(i, i2, bundle);
        }
    }

    public AbstractC7784a(View view) {
        if (view != null) {
            this.f18561i = view;
            this.f18560h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C7759x.m17567A(view) == 0) {
                C7759x.m17478z0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m17417D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: E */
    private boolean m17416E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f18561i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f18561i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* renamed from: F */
    private static int m17415F(int i) {
        if (i != 19) {
            if (i != 21) {
                return i != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    /* renamed from: G */
    private boolean m17414G(int i, Rect rect) {
        C7716c c7716c;
        C7535h<C7716c> m17384y = m17384y();
        int i2 = this.f18564l;
        C7716c m18443e = i2 == Integer.MIN_VALUE ? null : m17384y.m18443e(i2);
        if (i == 1 || i == 2) {
            c7716c = (C7716c) C7788b.m17373d(m17384y, f18555p, f18554o, m18443e, i, C7759x.m17563C(this.f18561i) == 1, false);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i3 = this.f18564l;
            if (i3 != Integer.MIN_VALUE) {
                m17383z(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m17417D(this.f18561i, i, rect2);
            }
            c7716c = (C7716c) C7788b.m17374c(m17384y, f18555p, f18554o, m18443e, rect2, i);
        }
        return m17401T(c7716c != null ? m17384y.m18440h(m17384y.m18441g(c7716c)) : Integer.MIN_VALUE);
    }

    /* renamed from: Q */
    private boolean m17404Q(int i, int i2, Bundle bundle) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 64) {
                    if (i2 != 128) {
                        return mo17411J(i, i2, bundle);
                    }
                    return m17395n(i);
                }
                return m17402S(i);
            }
            return m17394o(i);
        }
        return m17401T(i);
    }

    /* renamed from: R */
    private boolean m17403R(int i, Bundle bundle) {
        return C7759x.m17520e0(this.f18561i, i, bundle);
    }

    /* renamed from: S */
    private boolean m17402S(int i) {
        int i2;
        if (this.f18560h.isEnabled() && this.f18560h.isTouchExplorationEnabled() && (i2 = this.f18563k) != i) {
            if (i2 != Integer.MIN_VALUE) {
                m17395n(i2);
            }
            this.f18563k = i;
            this.f18561i.invalidate();
            m17400U(i, 32768);
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private void m17399V(int i) {
        int i2 = this.f18565m;
        if (i2 == i) {
            return;
        }
        this.f18565m = i;
        m17400U(i, 128);
        m17400U(i2, 256);
    }

    /* renamed from: n */
    private boolean m17395n(int i) {
        if (this.f18563k == i) {
            this.f18563k = Integer.MIN_VALUE;
            this.f18561i.invalidate();
            m17400U(i, 65536);
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private boolean m17393p() {
        int i = this.f18564l;
        return i != Integer.MIN_VALUE && mo17411J(i, 16, null);
    }

    /* renamed from: q */
    private AccessibilityEvent m17392q(int i, int i2) {
        if (i != -1) {
            return m17391r(i, i2);
        }
        return m17390s(i2);
    }

    /* renamed from: r */
    private AccessibilityEvent m17391r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C7716c m17413H = m17413H(i);
        obtain.getText().add(m17413H.m17650w());
        obtain.setContentDescription(m17413H.m17660r());
        obtain.setScrollable(m17413H.m17711J());
        obtain.setPassword(m17413H.m17712I());
        obtain.setEnabled(m17413H.m17717E());
        obtain.setChecked(m17413H.m17721C());
        m17409L(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m17413H.m17664p());
        C7724e.m17630c(obtain, this.f18561i, i);
        obtain.setPackageName(this.f18561i.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: s */
    private AccessibilityEvent m17390s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f18561i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C7716c m17389t(int i) {
        C7716c m17707N = C7716c.m17707N();
        m17707N.m17681g0(true);
        m17707N.m17677i0(true);
        m17707N.m17693a0("android.view.View");
        m17707N.m17698W(f18553n);
        m17707N.m17697X(f18553n);
        m17707N.m17661q0(this.f18561i);
        mo17407N(i, m17707N);
        if (m17707N.m17650w() == null && m17707N.m17660r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m17707N.m17670m(this.f18557e);
        if (!this.f18557e.equals(f18553n)) {
            int m17674k = m17707N.m17674k();
            if ((m17674k & 64) == 0) {
                if ((m17674k & 128) == 0) {
                    m17707N.m17665o0(this.f18561i.getContext().getPackageName());
                    m17707N.m17645y0(this.f18561i, i);
                    if (this.f18563k == i) {
                        m17707N.m17700U(true);
                        m17707N.m17694a(128);
                    } else {
                        m17707N.m17700U(false);
                        m17707N.m17694a(64);
                    }
                    boolean z = this.f18564l == i;
                    if (z) {
                        m17707N.m17694a(2);
                    } else if (m17707N.m17715F()) {
                        m17707N.m17694a(1);
                    }
                    m17707N.m17675j0(z);
                    this.f18561i.getLocationOnScreen(this.f18559g);
                    m17707N.m17668n(this.f18556d);
                    if (this.f18556d.equals(f18553n)) {
                        m17707N.m17670m(this.f18556d);
                        if (m17707N.f18472b != -1) {
                            C7716c m17707N2 = C7716c.m17707N();
                            for (int i2 = m17707N.f18472b; i2 != -1; i2 = m17707N2.f18472b) {
                                m17707N2.m17659r0(this.f18561i, -1);
                                m17707N2.m17698W(f18553n);
                                mo17407N(i2, m17707N2);
                                m17707N2.m17670m(this.f18557e);
                                Rect rect = this.f18556d;
                                Rect rect2 = this.f18557e;
                                rect.offset(rect2.left, rect2.top);
                            }
                            m17707N2.m17703R();
                        }
                        this.f18556d.offset(this.f18559g[0] - this.f18561i.getScrollX(), this.f18559g[1] - this.f18561i.getScrollY());
                    }
                    if (this.f18561i.getLocalVisibleRect(this.f18558f)) {
                        this.f18558f.offset(this.f18559g[0] - this.f18561i.getScrollX(), this.f18559g[1] - this.f18561i.getScrollY());
                        if (this.f18556d.intersect(this.f18558f)) {
                            m17707N.m17697X(this.f18556d);
                            if (m17416E(this.f18556d)) {
                                m17707N.m17720C0(true);
                            }
                        }
                    }
                    return m17707N;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    /* renamed from: u */
    private C7716c m17388u() {
        C7716c m17706O = C7716c.m17706O(this.f18561i);
        C7759x.m17524c0(this.f18561i, m17706O);
        ArrayList arrayList = new ArrayList();
        mo17418C(arrayList);
        if (m17706O.m17666o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m17706O.m17688d(this.f18561i, ((Integer) arrayList.get(i)).intValue());
        }
        return m17706O;
    }

    /* renamed from: y */
    private C7535h<C7716c> m17384y() {
        ArrayList arrayList = new ArrayList();
        mo17418C(arrayList);
        C7535h<C7716c> c7535h = new C7535h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            c7535h.m18439i(i, m17389t(i));
        }
        return c7535h;
    }

    /* renamed from: z */
    private void m17383z(int i, Rect rect) {
        m17413H(i).m17670m(rect);
    }

    /* renamed from: A */
    public final int m17420A() {
        return this.f18564l;
    }

    /* renamed from: B */
    protected abstract int mo17419B(float f, float f2);

    /* renamed from: C */
    protected abstract void mo17418C(List<Integer> list);

    /* renamed from: H */
    C7716c m17413H(int i) {
        if (i == -1) {
            return m17388u();
        }
        return m17389t(i);
    }

    /* renamed from: I */
    public final void m17412I(boolean z, int i, Rect rect) {
        int i2 = this.f18564l;
        if (i2 != Integer.MIN_VALUE) {
            m17394o(i2);
        }
        if (z) {
            m17414G(i, rect);
        }
    }

    /* renamed from: J */
    protected abstract boolean mo17411J(int i, int i2, Bundle bundle);

    /* renamed from: K */
    protected void m17410K(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: L */
    protected void m17409L(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: M */
    protected void mo17408M(C7716c c7716c) {
    }

    /* renamed from: N */
    protected abstract void mo17407N(int i, C7716c c7716c);

    /* renamed from: O */
    protected void mo17406O(int i, boolean z) {
    }

    /* renamed from: P */
    boolean m17405P(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m17404Q(i, i2, bundle);
        }
        return m17403R(i2, bundle);
    }

    /* renamed from: T */
    public final boolean m17401T(int i) {
        int i2;
        if ((this.f18561i.isFocused() || this.f18561i.requestFocus()) && (i2 = this.f18564l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                m17394o(i2);
            }
            this.f18564l = i;
            mo17406O(i, true);
            m17400U(i, 8);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public final boolean m17400U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f18560h.isEnabled() || (parent = this.f18561i.getParent()) == null) {
            return false;
        }
        return C7684b0.m17833h(parent, this.f18561i, m17392q(i, i2));
    }

    @Override // p201g.p227h.p238l.C7676a
    /* renamed from: b */
    public C7720d mo17398b(View view) {
        if (this.f18562j == null) {
            this.f18562j = new C7787c();
        }
        return this.f18562j;
    }

    @Override // p201g.p227h.p238l.C7676a
    /* renamed from: f */
    public void mo17397f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo17397f(view, accessibilityEvent);
        m17410K(accessibilityEvent);
    }

    @Override // p201g.p227h.p238l.C7676a
    /* renamed from: g */
    public void mo17396g(View view, C7716c c7716c) {
        super.mo17396g(view, c7716c);
        mo17408M(c7716c);
    }

    /* renamed from: o */
    public final boolean m17394o(int i) {
        if (this.f18564l != i) {
            return false;
        }
        this.f18564l = Integer.MIN_VALUE;
        mo17406O(i, false);
        m17400U(i, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean m17387v(MotionEvent motionEvent) {
        if (this.f18560h.isEnabled() && this.f18560h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && this.f18565m != Integer.MIN_VALUE) {
                    m17399V(Integer.MIN_VALUE);
                    return true;
                }
                return false;
            }
            int mo17419B = mo17419B(motionEvent.getX(), motionEvent.getY());
            m17399V(mo17419B);
            return mo17419B != Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m17386w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int m17415F = m17415F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && m17414G(m17415F, null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            return false;
                        case 23:
                            break;
                        default:
                            return false;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    m17393p();
                    return true;
                }
                return false;
            } else if (keyEvent.hasNoModifiers()) {
                return m17414G(2, null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return m17414G(1, null);
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final int m17385x() {
        return this.f18563k;
    }
}
