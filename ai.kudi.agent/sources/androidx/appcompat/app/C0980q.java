package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C1117k0;
import androidx.appcompat.widget.InterfaceC1173z;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p201g.p202a.C7452a;
import p201g.p202a.C7457f;
import p201g.p202a.C7461j;
import p201g.p202a.p209o.AbstractC7485b;
import p201g.p202a.p209o.C7484a;
import p201g.p202a.p209o.C7492g;
import p201g.p202a.p209o.C7495h;
import p201g.p227h.p238l.C7687c0;
import p201g.p227h.p238l.C7694e0;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7692d0;
import p201g.p227h.p238l.InterfaceC7696f0;
/* compiled from: WindowDecorActionBar.java */
/* renamed from: androidx.appcompat.app.q */
/* loaded from: classes2.dex */
public class C0980q extends AbstractC0925a implements ActionBarOverlayLayout.InterfaceC1029d {

    /* renamed from: B */
    private static final Interpolator f2707B = new AccelerateInterpolator();

    /* renamed from: C */
    private static final Interpolator f2708C = new DecelerateInterpolator();

    /* renamed from: A */
    final InterfaceC7696f0 f2709A;

    /* renamed from: a */
    Context f2710a;

    /* renamed from: b */
    private Context f2711b;

    /* renamed from: c */
    ActionBarOverlayLayout f2712c;

    /* renamed from: d */
    ActionBarContainer f2713d;

    /* renamed from: e */
    InterfaceC1173z f2714e;

    /* renamed from: f */
    ActionBarContextView f2715f;

    /* renamed from: g */
    View f2716g;

    /* renamed from: h */
    C1117k0 f2717h;

    /* renamed from: i */
    private boolean f2718i;

    /* renamed from: j */
    C0984d f2719j;

    /* renamed from: k */
    AbstractC7485b f2720k;

    /* renamed from: l */
    AbstractC7485b.InterfaceC7486a f2721l;

    /* renamed from: m */
    private boolean f2722m;

    /* renamed from: n */
    private ArrayList<AbstractC0925a.InterfaceC0927b> f2723n;

    /* renamed from: o */
    private boolean f2724o;

    /* renamed from: p */
    private int f2725p;

    /* renamed from: q */
    boolean f2726q;

    /* renamed from: r */
    boolean f2727r;

    /* renamed from: s */
    boolean f2728s;

    /* renamed from: t */
    private boolean f2729t;

    /* renamed from: u */
    private boolean f2730u;

    /* renamed from: v */
    C7495h f2731v;

    /* renamed from: w */
    private boolean f2732w;

    /* renamed from: x */
    boolean f2733x;

    /* renamed from: y */
    final InterfaceC7692d0 f2734y;

    /* renamed from: z */
    final InterfaceC7692d0 f2735z;

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.q$a */
    /* loaded from: classes2.dex */
    class C0981a extends C7694e0 {
        C0981a() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: b */
        public void mo17807b(View view) {
            View view2;
            C0980q c0980q = C0980q.this;
            if (c0980q.f2726q && (view2 = c0980q.f2716g) != null) {
                view2.setTranslationY(0.0f);
                C0980q.this.f2713d.setTranslationY(0.0f);
            }
            C0980q.this.f2713d.setVisibility(8);
            C0980q.this.f2713d.setTransitioning(false);
            C0980q c0980q2 = C0980q.this;
            c0980q2.f2731v = null;
            c0980q2.m37625I();
            ActionBarOverlayLayout actionBarOverlayLayout = C0980q.this.f2712c;
            if (actionBarOverlayLayout != null) {
                C7759x.m17504m0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.q$b */
    /* loaded from: classes2.dex */
    class C0982b extends C7694e0 {
        C0982b() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: b */
        public void mo17807b(View view) {
            C0980q c0980q = C0980q.this;
            c0980q.f2731v = null;
            c0980q.f2713d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.q$c */
    /* loaded from: classes2.dex */
    class C0983c implements InterfaceC7696f0 {
        C0983c() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7696f0
        /* renamed from: a */
        public void mo17796a(View view) {
            ((View) C0980q.this.f2713d.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.q$d */
    /* loaded from: classes2.dex */
    public class C0984d extends AbstractC7485b implements C0999g.InterfaceC1000a {

        /* renamed from: e */
        private final Context f2739e;

        /* renamed from: f */
        private final C0999g f2740f;

        /* renamed from: w */
        private AbstractC7485b.InterfaceC7486a f2741w;

        /* renamed from: x */
        private WeakReference<View> f2742x;

        public C0984d(Context context, AbstractC7485b.InterfaceC7486a interfaceC7486a) {
            this.f2739e = context;
            this.f2741w = interfaceC7486a;
            C0999g c0999g = new C0999g(context);
            c0999g.m37539W(1);
            this.f2740f = c0999g;
            c0999g.mo37444V(this);
        }

        @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
        /* renamed from: a */
        public boolean mo18592a(C0999g c0999g, MenuItem menuItem) {
            AbstractC7485b.InterfaceC7486a interfaceC7486a = this.f2741w;
            if (interfaceC7486a != null) {
                return interfaceC7486a.mo18573d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
        /* renamed from: b */
        public void mo18591b(C0999g c0999g) {
            if (this.f2741w == null) {
                return;
            }
            mo18584k();
            C0980q.this.f2715f.m37431l();
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: c */
        public void mo18590c() {
            C0980q c0980q = C0980q.this;
            if (c0980q.f2719j != this) {
                return;
            }
            if (!C0980q.m37626H(c0980q.f2727r, c0980q.f2728s, false)) {
                C0980q c0980q2 = C0980q.this;
                c0980q2.f2720k = this;
                c0980q2.f2721l = this.f2741w;
            } else {
                this.f2741w.mo18576a(this);
            }
            this.f2741w = null;
            C0980q.this.m37627G(false);
            C0980q.this.f2715f.m37436g();
            C0980q.this.f2714e.mo36871t().sendAccessibilityEvent(32);
            C0980q c0980q3 = C0980q.this;
            c0980q3.f2712c.setHideOnContentScrollEnabled(c0980q3.f2733x);
            C0980q.this.f2719j = null;
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: d */
        public View mo18589d() {
            WeakReference<View> weakReference = this.f2742x;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: e */
        public Menu mo18588e() {
            return this.f2740f;
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: f */
        public MenuInflater mo18587f() {
            return new C7492g(this.f2739e);
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: g */
        public CharSequence mo18586g() {
            return C0980q.this.f2715f.getSubtitle();
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: i */
        public CharSequence mo18585i() {
            return C0980q.this.f2715f.getTitle();
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: k */
        public void mo18584k() {
            if (C0980q.this.f2719j != this) {
                return;
            }
            this.f2740f.m37523h0();
            try {
                this.f2741w.mo18574c(this, this.f2740f);
            } finally {
                this.f2740f.m37524g0();
            }
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: l */
        public boolean mo18583l() {
            return C0980q.this.f2715f.m37433j();
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: m */
        public void mo18582m(View view) {
            C0980q.this.f2715f.setCustomView(view);
            this.f2742x = new WeakReference<>(view);
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: n */
        public void mo18581n(int i) {
            mo18580o(C0980q.this.f2710a.getResources().getString(i));
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: o */
        public void mo18580o(CharSequence charSequence) {
            C0980q.this.f2715f.setSubtitle(charSequence);
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: q */
        public void mo18579q(int i) {
            mo18578r(C0980q.this.f2710a.getResources().getString(i));
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: r */
        public void mo18578r(CharSequence charSequence) {
            C0980q.this.f2715f.setTitle(charSequence);
        }

        @Override // p201g.p202a.p209o.AbstractC7485b
        /* renamed from: s */
        public void mo18577s(boolean z) {
            super.mo18577s(z);
            C0980q.this.f2715f.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean m37596t() {
            this.f2740f.m37523h0();
            try {
                return this.f2741w.mo18575b(this, this.f2740f);
            } finally {
                this.f2740f.m37524g0();
            }
        }
    }

    public C0980q(Activity activity, boolean z) {
        new ArrayList();
        this.f2723n = new ArrayList<>();
        this.f2725p = 0;
        this.f2726q = true;
        this.f2730u = true;
        this.f2734y = new C0981a();
        this.f2735z = new C0982b();
        this.f2709A = new C0983c();
        View decorView = activity.getWindow().getDecorView();
        m37619O(decorView);
        if (z) {
            return;
        }
        this.f2716g = decorView.findViewById(16908290);
    }

    /* renamed from: H */
    static boolean m37626H(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* renamed from: L */
    private InterfaceC1173z m37622L(View view) {
        if (view instanceof InterfaceC1173z) {
            return (InterfaceC1173z) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: N */
    private void m37620N() {
        if (this.f2729t) {
            this.f2729t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2712c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m37612V(false);
        }
    }

    /* renamed from: O */
    private void m37619O(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C7457f.decor_content_parent);
        this.f2712c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f2714e = m37622L(view.findViewById(C7457f.action_bar));
        this.f2715f = (ActionBarContextView) view.findViewById(C7457f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C7457f.action_bar_container);
        this.f2713d = actionBarContainer;
        InterfaceC1173z interfaceC1173z = this.f2714e;
        if (interfaceC1173z != null && this.f2715f != null && actionBarContainer != null) {
            this.f2710a = interfaceC1173z.getContext();
            boolean z = (this.f2714e.mo36869v() & 4) != 0;
            if (z) {
                this.f2718i = true;
            }
            C7484a m18609b = C7484a.m18609b(this.f2710a);
            m37615S(m18609b.m18610a() || z);
            m37617Q(m18609b.m18604g());
            TypedArray obtainStyledAttributes = this.f2710a.obtainStyledAttributes(null, C7461j.ActionBar, C7452a.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(C7461j.ActionBar_hideOnContentScroll, false)) {
                m37616R(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7461j.ActionBar_elevation, 0);
            if (dimensionPixelSize != 0) {
                mo37599x(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(C0980q.class.getSimpleName() + " can only be used with a compatible window decor layout");
    }

    /* renamed from: Q */
    private void m37617Q(boolean z) {
        this.f2724o = z;
        if (!z) {
            this.f2714e.mo36881j(null);
            this.f2713d.setTabContainer(this.f2717h);
        } else {
            this.f2713d.setTabContainer(null);
            this.f2714e.mo36881j(this.f2717h);
        }
        boolean z2 = true;
        boolean z3 = m37621M() == 2;
        C1117k0 c1117k0 = this.f2717h;
        if (c1117k0 != null) {
            if (z3) {
                c1117k0.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2712c;
                if (actionBarOverlayLayout != null) {
                    C7759x.m17504m0(actionBarOverlayLayout);
                }
            } else {
                c1117k0.setVisibility(8);
            }
        }
        this.f2714e.mo36891A(!this.f2724o && z3);
        this.f2712c.setHasNonEmbeddedTabs((this.f2724o || !z3) ? false : false);
    }

    /* renamed from: T */
    private boolean m37614T() {
        return C7759x.m17535U(this.f2713d);
    }

    /* renamed from: U */
    private void m37613U() {
        if (this.f2729t) {
            return;
        }
        this.f2729t = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2712c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m37612V(false);
    }

    /* renamed from: V */
    private void m37612V(boolean z) {
        if (m37626H(this.f2727r, this.f2728s, this.f2729t)) {
            if (this.f2730u) {
                return;
            }
            this.f2730u = true;
            m37623K(z);
        } else if (this.f2730u) {
            this.f2730u = false;
            m37624J(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: A */
    public void mo37633A(Drawable drawable) {
        this.f2714e.mo36865z(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: B */
    public void mo37632B(boolean z) {
        C7495h c7495h;
        this.f2732w = z;
        if (z || (c7495h = this.f2731v) == null) {
            return;
        }
        c7495h.m18558a();
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: C */
    public void mo37631C(CharSequence charSequence) {
        this.f2714e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: D */
    public void mo37630D(CharSequence charSequence) {
        this.f2714e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: E */
    public void mo37629E() {
        if (this.f2727r) {
            this.f2727r = false;
            m37612V(false);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: F */
    public AbstractC7485b mo37628F(AbstractC7485b.InterfaceC7486a interfaceC7486a) {
        C0984d c0984d = this.f2719j;
        if (c0984d != null) {
            c0984d.mo18590c();
        }
        this.f2712c.setHideOnContentScrollEnabled(false);
        this.f2715f.m37432k();
        C0984d c0984d2 = new C0984d(this.f2715f.getContext(), interfaceC7486a);
        if (c0984d2.m37596t()) {
            this.f2719j = c0984d2;
            c0984d2.mo18584k();
            this.f2715f.m37435h(c0984d2);
            m37627G(true);
            this.f2715f.sendAccessibilityEvent(32);
            return c0984d2;
        }
        return null;
    }

    /* renamed from: G */
    public void m37627G(boolean z) {
        C7687c0 mo36875p;
        C7687c0 f;
        if (z) {
            m37613U();
        } else {
            m37620N();
        }
        if (!m37614T()) {
            if (z) {
                this.f2714e.mo36872s(4);
                this.f2715f.setVisibility(0);
                return;
            }
            this.f2714e.mo36872s(0);
            this.f2715f.setVisibility(8);
            return;
        }
        if (z) {
            f = this.f2714e.mo36875p(4, 100L);
            mo36875p = this.f2715f.m37287f(0, 200L);
        } else {
            mo36875p = this.f2714e.mo36875p(0, 200L);
            f = this.f2715f.m37287f(8, 100L);
        }
        C7495h c7495h = new C7495h();
        c7495h.m18555d(f, mo36875p);
        c7495h.m18551h();
    }

    /* renamed from: I */
    void m37625I() {
        AbstractC7485b.InterfaceC7486a interfaceC7486a = this.f2721l;
        if (interfaceC7486a != null) {
            interfaceC7486a.mo18576a(this.f2720k);
            this.f2720k = null;
            this.f2721l = null;
        }
    }

    /* renamed from: J */
    public void m37624J(boolean z) {
        View view;
        int[] iArr;
        C7495h c7495h = this.f2731v;
        if (c7495h != null) {
            c7495h.m18558a();
        }
        if (this.f2725p == 0 && (this.f2732w || z)) {
            this.f2713d.setAlpha(1.0f);
            this.f2713d.setTransitioning(true);
            C7495h c7495h2 = new C7495h();
            float f = -this.f2713d.getHeight();
            if (z) {
                this.f2713d.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            C7687c0 m17523d = C7759x.m17523d(this.f2713d);
            m17523d.m17813k(f);
            m17523d.m17815i(this.f2709A);
            c7495h2.m18556c(m17523d);
            if (this.f2726q && (view = this.f2716g) != null) {
                C7687c0 m17523d2 = C7759x.m17523d(view);
                m17523d2.m17813k(f);
                c7495h2.m18556c(m17523d2);
            }
            c7495h2.m18553f(f2707B);
            c7495h2.m18554e(250L);
            c7495h2.m18552g(this.f2734y);
            this.f2731v = c7495h2;
            c7495h2.m18551h();
            return;
        }
        this.f2734y.mo17807b(null);
    }

    /* renamed from: K */
    public void m37623K(boolean z) {
        View view;
        View view2;
        int[] iArr;
        C7495h c7495h = this.f2731v;
        if (c7495h != null) {
            c7495h.m18558a();
        }
        this.f2713d.setVisibility(0);
        if (this.f2725p == 0 && (this.f2732w || z)) {
            this.f2713d.setTranslationY(0.0f);
            float f = -this.f2713d.getHeight();
            if (z) {
                this.f2713d.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.f2713d.setTranslationY(f);
            C7495h c7495h2 = new C7495h();
            C7687c0 m17523d = C7759x.m17523d(this.f2713d);
            m17523d.m17813k(0.0f);
            m17523d.m17815i(this.f2709A);
            c7495h2.m18556c(m17523d);
            if (this.f2726q && (view2 = this.f2716g) != null) {
                view2.setTranslationY(f);
                C7687c0 m17523d2 = C7759x.m17523d(this.f2716g);
                m17523d2.m17813k(0.0f);
                c7495h2.m18556c(m17523d2);
            }
            c7495h2.m18553f(f2708C);
            c7495h2.m18554e(250L);
            c7495h2.m18552g(this.f2735z);
            this.f2731v = c7495h2;
            c7495h2.m18551h();
        } else {
            this.f2713d.setAlpha(1.0f);
            this.f2713d.setTranslationY(0.0f);
            if (this.f2726q && (view = this.f2716g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f2735z.mo17807b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2712c;
        if (actionBarOverlayLayout != null) {
            C7759x.m17504m0(actionBarOverlayLayout);
        }
    }

    /* renamed from: M */
    public int m37621M() {
        return this.f2714e.mo36876o();
    }

    /* renamed from: P */
    public void m37618P(int i, int i2) {
        int mo36869v = this.f2714e.mo36869v();
        if ((i2 & 4) != 0) {
            this.f2718i = true;
        }
        this.f2714e.mo36879l((i & i2) | ((i2 ^ (-1)) & mo36869v));
    }

    /* renamed from: R */
    public void m37616R(boolean z) {
        if (z && !this.f2712c.m37423q()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f2733x = z;
        this.f2712c.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: S */
    public void m37615S(boolean z) {
        this.f2714e.mo36870u(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1029d
    /* renamed from: a */
    public void mo37417a() {
        if (this.f2728s) {
            this.f2728s = false;
            m37612V(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1029d
    /* renamed from: b */
    public void mo37416b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1029d
    /* renamed from: c */
    public void mo37415c(boolean z) {
        this.f2726q = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1029d
    /* renamed from: d */
    public void mo37414d() {
        if (this.f2728s) {
            return;
        }
        this.f2728s = true;
        m37612V(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1029d
    /* renamed from: e */
    public void mo37413e() {
        C7495h c7495h = this.f2731v;
        if (c7495h != null) {
            c7495h.m18558a();
            this.f2731v = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1029d
    /* renamed from: f */
    public void mo37412f(int i) {
        this.f2725p = i;
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: h */
    public boolean mo37611h() {
        InterfaceC1173z interfaceC1173z = this.f2714e;
        if (interfaceC1173z == null || !interfaceC1173z.mo36880k()) {
            return false;
        }
        this.f2714e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: i */
    public void mo37610i(boolean z) {
        if (z == this.f2722m) {
            return;
        }
        this.f2722m = z;
        int size = this.f2723n.size();
        for (int i = 0; i < size; i++) {
            this.f2723n.get(i).m37801a(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: j */
    public int mo37609j() {
        return this.f2714e.mo36869v();
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: k */
    public Context mo37608k() {
        if (this.f2711b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2710a.getTheme().resolveAttribute(C7452a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2711b = new ContextThemeWrapper(this.f2710a, i);
            } else {
                this.f2711b = this.f2710a;
            }
        }
        return this.f2711b;
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: l */
    public void mo37607l() {
        if (this.f2727r) {
            return;
        }
        this.f2727r = true;
        m37612V(false);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: n */
    public void mo37606n(Configuration configuration) {
        m37617Q(C7484a.m18609b(this.f2710a).m18604g());
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: p */
    public boolean mo37605p(int i, KeyEvent keyEvent) {
        Menu mo18588e;
        C0984d c0984d = this.f2719j;
        if (c0984d == null || (mo18588e = c0984d.mo18588e()) == null) {
            return false;
        }
        mo18588e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo18588e.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: s */
    public void mo37604s(Drawable drawable) {
        this.f2713d.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: t */
    public void mo37603t(boolean z) {
        if (this.f2718i) {
            return;
        }
        mo37602u(z);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: u */
    public void mo37602u(boolean z) {
        m37618P(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: v */
    public void mo37601v(boolean z) {
        m37618P(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: w */
    public void mo37600w(boolean z) {
        m37618P(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: x */
    public void mo37599x(float f) {
        C7759x.m17484w0(this.f2713d, f);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: y */
    public void mo37598y(int i) {
        this.f2714e.mo36868w(i);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: z */
    public void mo37597z(int i) {
        this.f2714e.mo36874q(i);
    }

    public C0980q(Dialog dialog) {
        new ArrayList();
        this.f2723n = new ArrayList<>();
        this.f2725p = 0;
        this.f2726q = true;
        this.f2730u = true;
        this.f2734y = new C0981a();
        this.f2735z = new C0982b();
        this.f2709A = new C0983c();
        m37619O(dialog.getWindow().getDecorView());
    }
}
