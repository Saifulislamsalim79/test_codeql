package p201g.p266v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p201g.p266v.AbstractC8160m;
import p201g.p266v.C8113a;
/* compiled from: Visibility.java */
/* renamed from: g.v.j0 */
/* loaded from: classes2.dex */
public abstract class AbstractC8152j0 extends AbstractC8160m {

    /* renamed from: c0 */
    private static final String[] f19544c0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: b0 */
    private int f19545b0 = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Visibility.java */
    /* renamed from: g.v.j0$a */
    /* loaded from: classes2.dex */
    public class C8153a extends C8168n {

        /* renamed from: c */
        final /* synthetic */ ViewGroup f19546c;

        /* renamed from: d */
        final /* synthetic */ View f19547d;

        /* renamed from: e */
        final /* synthetic */ View f19548e;

        C8153a(ViewGroup viewGroup, View view, View view2) {
            this.f19546c = viewGroup;
            this.f19547d = view;
            this.f19548e = view2;
        }

        @Override // p201g.p266v.C8168n, p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: b */
        public void mo16620b(AbstractC8160m abstractC8160m) {
            C8182x.m16569a(this.f19546c).mo16570d(this.f19547d);
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: c */
        public void mo16576c(AbstractC8160m abstractC8160m) {
            this.f19548e.setTag(C8151j.save_overlay_view, null);
            C8182x.m16569a(this.f19546c).mo16570d(this.f19547d);
            abstractC8160m.mo16608Q(this);
        }

        @Override // p201g.p266v.C8168n, p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: e */
        public void mo16618e(AbstractC8160m abstractC8160m) {
            if (this.f19547d.getParent() == null) {
                C8182x.m16569a(this.f19546c).mo16571c(this.f19547d);
            } else {
                AbstractC8152j0.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* renamed from: g.v.j0$b */
    /* loaded from: classes2.dex */
    public static class C8154b extends AnimatorListenerAdapter implements AbstractC8160m.InterfaceC8166f, C8113a.InterfaceC8114a {

        /* renamed from: c */
        private final View f19550c;

        /* renamed from: d */
        private final int f19551d;

        /* renamed from: e */
        private final ViewGroup f19552e;

        /* renamed from: f */
        private final boolean f19553f;

        /* renamed from: w */
        private boolean f19554w;

        /* renamed from: x */
        boolean f19555x = false;

        C8154b(View view, int i, boolean z) {
            this.f19550c = view;
            this.f19551d = i;
            this.f19552e = (ViewGroup) view.getParent();
            this.f19553f = z;
            m16660g(true);
        }

        /* renamed from: f */
        private void m16661f() {
            if (!this.f19555x) {
                C8130c0.m16706h(this.f19550c, this.f19551d);
                ViewGroup viewGroup = this.f19552e;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m16660g(false);
        }

        /* renamed from: g */
        private void m16660g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f19553f || this.f19554w == z || (viewGroup = this.f19552e) == null) {
                return;
            }
            this.f19554w = z;
            C8182x.m16567c(viewGroup, z);
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: a */
        public void mo16577a(AbstractC8160m abstractC8160m) {
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: b */
        public void mo16620b(AbstractC8160m abstractC8160m) {
            m16660g(false);
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: c */
        public void mo16576c(AbstractC8160m abstractC8160m) {
            m16661f();
            abstractC8160m.mo16608Q(this);
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: d */
        public void mo16619d(AbstractC8160m abstractC8160m) {
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: e */
        public void mo16618e(AbstractC8160m abstractC8160m) {
            m16660g(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19555x = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m16661f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p201g.p266v.C8113a.InterfaceC8114a
        public void onAnimationPause(Animator animator) {
            if (this.f19555x) {
                return;
            }
            C8130c0.m16706h(this.f19550c, this.f19551d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p201g.p266v.C8113a.InterfaceC8114a
        public void onAnimationResume(Animator animator) {
            if (this.f19555x) {
                return;
            }
            C8130c0.m16706h(this.f19550c, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* renamed from: g.v.j0$c */
    /* loaded from: classes2.dex */
    public static class C8155c {

        /* renamed from: a */
        boolean f19556a;

        /* renamed from: b */
        boolean f19557b;

        /* renamed from: c */
        int f19558c;

        /* renamed from: d */
        int f19559d;

        /* renamed from: e */
        ViewGroup f19560e;

        /* renamed from: f */
        ViewGroup f19561f;

        C8155c() {
        }
    }

    /* renamed from: f0 */
    private void m16668f0(C8177s c8177s) {
        c8177s.f19627a.put("android:visibility:visibility", Integer.valueOf(c8177s.f19628b.getVisibility()));
        c8177s.f19627a.put("android:visibility:parent", c8177s.f19628b.getParent());
        int[] iArr = new int[2];
        c8177s.f19628b.getLocationOnScreen(iArr);
        c8177s.f19627a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: h0 */
    private C8155c m16667h0(C8177s c8177s, C8177s c8177s2) {
        C8155c c8155c = new C8155c();
        c8155c.f19556a = false;
        c8155c.f19557b = false;
        if (c8177s != null && c8177s.f19627a.containsKey("android:visibility:visibility")) {
            c8155c.f19558c = ((Integer) c8177s.f19627a.get("android:visibility:visibility")).intValue();
            c8155c.f19560e = (ViewGroup) c8177s.f19627a.get("android:visibility:parent");
        } else {
            c8155c.f19558c = -1;
            c8155c.f19560e = null;
        }
        if (c8177s2 != null && c8177s2.f19627a.containsKey("android:visibility:visibility")) {
            c8155c.f19559d = ((Integer) c8177s2.f19627a.get("android:visibility:visibility")).intValue();
            c8155c.f19561f = (ViewGroup) c8177s2.f19627a.get("android:visibility:parent");
        } else {
            c8155c.f19559d = -1;
            c8155c.f19561f = null;
        }
        if (c8177s != null && c8177s2 != null) {
            if (c8155c.f19558c == c8155c.f19559d && c8155c.f19560e == c8155c.f19561f) {
                return c8155c;
            }
            int i = c8155c.f19558c;
            int i2 = c8155c.f19559d;
            if (i != i2) {
                if (i == 0) {
                    c8155c.f19557b = false;
                    c8155c.f19556a = true;
                } else if (i2 == 0) {
                    c8155c.f19557b = true;
                    c8155c.f19556a = true;
                }
            } else if (c8155c.f19561f == null) {
                c8155c.f19557b = false;
                c8155c.f19556a = true;
            } else if (c8155c.f19560e == null) {
                c8155c.f19557b = true;
                c8155c.f19556a = true;
            }
        } else if (c8177s == null && c8155c.f19559d == 0) {
            c8155c.f19557b = true;
            c8155c.f19556a = true;
        } else if (c8177s2 == null && c8155c.f19558c == 0) {
            c8155c.f19557b = false;
            c8155c.f19556a = true;
        }
        return c8155c;
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: D */
    public String[] mo16652D() {
        return f19544c0;
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: F */
    public boolean mo16650F(C8177s c8177s, C8177s c8177s2) {
        if (c8177s == null && c8177s2 == null) {
            return false;
        }
        if (c8177s == null || c8177s2 == null || c8177s2.f19627a.containsKey("android:visibility:visibility") == c8177s.f19627a.containsKey("android:visibility:visibility")) {
            C8155c m16667h0 = m16667h0(c8177s, c8177s2);
            if (m16667h0.f19556a) {
                return m16667h0.f19558c == 0 || m16667h0.f19559d == 0;
            }
            return false;
        }
        return false;
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: f */
    public void mo16595f(C8177s c8177s) {
        m16668f0(c8177s);
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: i */
    public void mo16591i(C8177s c8177s) {
        m16668f0(c8177s);
    }

    /* renamed from: i0 */
    public abstract Animator mo16666i0(ViewGroup viewGroup, View view, C8177s c8177s, C8177s c8177s2);

    /* renamed from: j0 */
    public Animator m16665j0(ViewGroup viewGroup, C8177s c8177s, int i, C8177s c8177s2, int i2) {
        if ((this.f19545b0 & 1) != 1 || c8177s2 == null) {
            return null;
        }
        if (c8177s == null) {
            View view = (View) c8177s2.f19628b.getParent();
            if (m16667h0(m16628t(view, false), m16651E(view, false)).f19556a) {
                return null;
            }
        }
        return mo16666i0(viewGroup, c8177s2.f19628b, c8177s, c8177s2);
    }

    /* renamed from: l0 */
    public abstract Animator mo16664l0(ViewGroup viewGroup, View view, C8177s c8177s, C8177s c8177s2);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
        if (r10.f19583N != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator m16663m0(android.view.ViewGroup r11, p201g.p266v.C8177s r12, int r13, p201g.p266v.C8177s r14, int r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p266v.AbstractC8152j0.m16663m0(android.view.ViewGroup, g.v.s, int, g.v.s, int):android.animation.Animator");
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: n */
    public Animator mo16633n(ViewGroup viewGroup, C8177s c8177s, C8177s c8177s2) {
        C8155c m16667h0 = m16667h0(c8177s, c8177s2);
        if (m16667h0.f19556a) {
            if (m16667h0.f19560e == null && m16667h0.f19561f == null) {
                return null;
            }
            if (m16667h0.f19557b) {
                return m16665j0(viewGroup, c8177s, m16667h0.f19558c, c8177s2, m16667h0.f19559d);
            }
            return m16663m0(viewGroup, c8177s, m16667h0.f19558c, c8177s2, m16667h0.f19559d);
        }
        return null;
    }

    /* renamed from: n0 */
    public void m16662n0(int i) {
        if ((i & (-4)) == 0) {
            this.f19545b0 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
