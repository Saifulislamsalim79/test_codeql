package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C0987a;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.widget.Toolbar;
import p201g.p202a.C7452a;
import p201g.p202a.C7456e;
import p201g.p202a.C7457f;
import p201g.p202a.C7459h;
import p201g.p202a.C7461j;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p238l.C7687c0;
import p201g.p227h.p238l.C7694e0;
import p201g.p227h.p238l.C7759x;
/* compiled from: ToolbarWidgetWrapper.java */
/* renamed from: androidx.appcompat.widget.s0 */
/* loaded from: classes2.dex */
public class C1140s0 implements InterfaceC1173z {

    /* renamed from: a */
    Toolbar f3468a;

    /* renamed from: b */
    private int f3469b;

    /* renamed from: c */
    private View f3470c;

    /* renamed from: d */
    private View f3471d;

    /* renamed from: e */
    private Drawable f3472e;

    /* renamed from: f */
    private Drawable f3473f;

    /* renamed from: g */
    private Drawable f3474g;

    /* renamed from: h */
    private boolean f3475h;

    /* renamed from: i */
    CharSequence f3476i;

    /* renamed from: j */
    private CharSequence f3477j;

    /* renamed from: k */
    private CharSequence f3478k;

    /* renamed from: l */
    Window.Callback f3479l;

    /* renamed from: m */
    boolean f3480m;

    /* renamed from: n */
    private C1073c f3481n;

    /* renamed from: o */
    private int f3482o;

    /* renamed from: p */
    private int f3483p;

    /* renamed from: q */
    private Drawable f3484q;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* renamed from: androidx.appcompat.widget.s0$a */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC1141a implements View.OnClickListener {

        /* renamed from: c */
        final C0987a f3485c;

        View$OnClickListenerC1141a() {
            this.f3485c = new C0987a(C1140s0.this.f3468a.getContext(), 0, 16908332, 0, 0, C1140s0.this.f3476i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1140s0 c1140s0 = C1140s0.this;
            Window.Callback callback = c1140s0.f3479l;
            if (callback == null || !c1140s0.f3480m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f3485c);
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    /* renamed from: androidx.appcompat.widget.s0$b */
    /* loaded from: classes2.dex */
    class C1142b extends C7694e0 {

        /* renamed from: a */
        private boolean f3487a = false;

        /* renamed from: b */
        final /* synthetic */ int f3488b;

        C1142b(int i) {
            this.f3488b = i;
        }

        @Override // p201g.p227h.p238l.C7694e0, p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: a */
        public void mo17804a(View view) {
            this.f3487a = true;
        }

        @Override // p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: b */
        public void mo17807b(View view) {
            if (this.f3487a) {
                return;
            }
            C1140s0.this.f3468a.setVisibility(this.f3488b);
        }

        @Override // p201g.p227h.p238l.C7694e0, p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: c */
        public void mo17803c(View view) {
            C1140s0.this.f3468a.setVisibility(0);
        }
    }

    public C1140s0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C7459h.abc_action_bar_up_description, C7456e.abc_ic_ab_back_material);
    }

    /* renamed from: B */
    private int m37018B() {
        if (this.f3468a.getNavigationIcon() != null) {
            this.f3484q = this.f3468a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    /* renamed from: H */
    private void m37012H(CharSequence charSequence) {
        this.f3476i = charSequence;
        if ((this.f3469b & 8) != 0) {
            this.f3468a.setTitle(charSequence);
        }
    }

    /* renamed from: I */
    private void m37011I() {
        if ((this.f3469b & 4) != 0) {
            if (TextUtils.isEmpty(this.f3478k)) {
                this.f3468a.setNavigationContentDescription(this.f3483p);
            } else {
                this.f3468a.setNavigationContentDescription(this.f3478k);
            }
        }
    }

    /* renamed from: J */
    private void m37010J() {
        if ((this.f3469b & 4) != 0) {
            Toolbar toolbar = this.f3468a;
            Drawable drawable = this.f3474g;
            if (drawable == null) {
                drawable = this.f3484q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f3468a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: K */
    private void m37009K() {
        Drawable drawable;
        int i = this.f3469b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f3473f;
            if (drawable == null) {
                drawable = this.f3472e;
            }
        } else {
            drawable = this.f3472e;
        }
        this.f3468a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: A */
    public void mo36891A(boolean z) {
        this.f3468a.setCollapsible(z);
    }

    /* renamed from: C */
    public void m37017C(View view) {
        View view2 = this.f3471d;
        if (view2 != null && (this.f3469b & 16) != 0) {
            this.f3468a.removeView(view2);
        }
        this.f3471d = view;
        if (view == null || (this.f3469b & 16) == 0) {
            return;
        }
        this.f3468a.addView(view);
    }

    /* renamed from: D */
    public void m37016D(int i) {
        if (i == this.f3483p) {
            return;
        }
        this.f3483p = i;
        if (TextUtils.isEmpty(this.f3468a.getNavigationContentDescription())) {
            mo36868w(this.f3483p);
        }
    }

    /* renamed from: E */
    public void m37015E(Drawable drawable) {
        this.f3473f = drawable;
        m37009K();
    }

    /* renamed from: F */
    public void m37014F(CharSequence charSequence) {
        this.f3478k = charSequence;
        m37011I();
    }

    /* renamed from: G */
    public void m37013G(CharSequence charSequence) {
        this.f3477j = charSequence;
        if ((this.f3469b & 8) != 0) {
            this.f3468a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: a */
    public void mo36890a(Drawable drawable) {
        C7759x.m17492s0(this.f3468a, drawable);
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: b */
    public void mo36889b(Menu menu, InterfaceC1014m.InterfaceC1015a interfaceC1015a) {
        if (this.f3481n == null) {
            C1073c c1073c = new C1073c(this.f3468a.getContext());
            this.f3481n = c1073c;
            c1073c.m37579s(C7457f.action_menu_presenter);
        }
        this.f3481n.mo26754m(interfaceC1015a);
        this.f3468a.setMenu((C0999g) menu, this.f3481n);
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: c */
    public boolean mo36888c() {
        return this.f3468a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    public void collapseActionView() {
        this.f3468a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: d */
    public void mo36887d() {
        this.f3480m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: e */
    public boolean mo36886e() {
        return this.f3468a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: f */
    public boolean mo36885f() {
        return this.f3468a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: g */
    public boolean mo36884g() {
        return this.f3468a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    public Context getContext() {
        return this.f3468a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    public CharSequence getTitle() {
        return this.f3468a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: h */
    public boolean mo36883h() {
        return this.f3468a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: i */
    public void mo36882i() {
        this.f3468a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: j */
    public void mo36881j(C1117k0 c1117k0) {
        View view = this.f3470c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f3468a;
            if (parent == toolbar) {
                toolbar.removeView(this.f3470c);
            }
        }
        this.f3470c = c1117k0;
        if (c1117k0 == null || this.f3482o != 2) {
            return;
        }
        this.f3468a.addView(c1117k0, 0);
        Toolbar.C1061e c1061e = (Toolbar.C1061e) this.f3470c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c1061e).width = -2;
        ((ViewGroup.MarginLayoutParams) c1061e).height = -2;
        c1061e.f2538a = 8388691;
        c1117k0.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: k */
    public boolean mo36880k() {
        return this.f3468a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: l */
    public void mo36879l(int i) {
        View view;
        int i2 = this.f3469b ^ i;
        this.f3469b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m37011I();
                }
                m37010J();
            }
            if ((i2 & 3) != 0) {
                m37009K();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f3468a.setTitle(this.f3476i);
                    this.f3468a.setSubtitle(this.f3477j);
                } else {
                    this.f3468a.setTitle((CharSequence) null);
                    this.f3468a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f3471d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f3468a.addView(view);
            } else {
                this.f3468a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: m */
    public Menu mo36878m() {
        return this.f3468a.getMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: n */
    public void mo36877n(int i) {
        m37015E(i != 0 ? C7462a.m18690d(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: o */
    public int mo36876o() {
        return this.f3482o;
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: p */
    public C7687c0 mo36875p(int i, long j) {
        C7687c0 m17523d = C7759x.m17523d(this.f3468a);
        m17523d.m17823a(i == 0 ? 1.0f : 0.0f);
        m17523d.m17820d(j);
        m17523d.m17818f(new C1142b(i));
        return m17523d;
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: q */
    public void mo36874q(int i) {
        mo36865z(i != 0 ? C7462a.m18690d(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: r */
    public void mo36873r(InterfaceC1014m.InterfaceC1015a interfaceC1015a, C0999g.InterfaceC1000a interfaceC1000a) {
        this.f3468a.setMenuCallbacks(interfaceC1015a, interfaceC1000a);
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: s */
    public void mo36872s(int i) {
        this.f3468a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    public void setIcon(int i) {
        setIcon(i != 0 ? C7462a.m18690d(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    public void setTitle(CharSequence charSequence) {
        this.f3475h = true;
        m37012H(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    public void setWindowCallback(Window.Callback callback) {
        this.f3479l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f3475h) {
            return;
        }
        m37012H(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: t */
    public ViewGroup mo36871t() {
        return this.f3468a;
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: u */
    public void mo36870u(boolean z) {
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: v */
    public int mo36869v() {
        return this.f3469b;
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: w */
    public void mo36868w(int i) {
        m37014F(i == 0 ? null : getContext().getString(i));
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: x */
    public void mo36867x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: y */
    public void mo36866y() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    /* renamed from: z */
    public void mo36865z(Drawable drawable) {
        this.f3474g = drawable;
        m37010J();
    }

    public C1140s0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f3482o = 0;
        this.f3483p = 0;
        this.f3468a = toolbar;
        this.f3476i = toolbar.getTitle();
        this.f3477j = toolbar.getSubtitle();
        this.f3475h = this.f3476i != null;
        this.f3474g = toolbar.getNavigationIcon();
        C1138r0 m37026v = C1138r0.m37026v(toolbar.getContext(), null, C7461j.ActionBar, C7452a.actionBarStyle, 0);
        this.f3484q = m37026v.m37041g(C7461j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence m37032p = m37026v.m37032p(C7461j.ActionBar_title);
            if (!TextUtils.isEmpty(m37032p)) {
                setTitle(m37032p);
            }
            CharSequence m37032p2 = m37026v.m37032p(C7461j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m37032p2)) {
                m37013G(m37032p2);
            }
            Drawable m37041g = m37026v.m37041g(C7461j.ActionBar_logo);
            if (m37041g != null) {
                m37015E(m37041g);
            }
            Drawable m37041g2 = m37026v.m37041g(C7461j.ActionBar_icon);
            if (m37041g2 != null) {
                setIcon(m37041g2);
            }
            if (this.f3474g == null && (drawable = this.f3484q) != null) {
                mo36865z(drawable);
            }
            mo36879l(m37026v.m37037k(C7461j.ActionBar_displayOptions, 0));
            int m37034n = m37026v.m37034n(C7461j.ActionBar_customNavigationLayout, 0);
            if (m37034n != 0) {
                m37017C(LayoutInflater.from(this.f3468a.getContext()).inflate(m37034n, (ViewGroup) this.f3468a, false));
                mo36879l(this.f3469b | 16);
            }
            int m37035m = m37026v.m37035m(C7461j.ActionBar_height, 0);
            if (m37035m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f3468a.getLayoutParams();
                layoutParams.height = m37035m;
                this.f3468a.setLayoutParams(layoutParams);
            }
            int m37043e = m37026v.m37043e(C7461j.ActionBar_contentInsetStart, -1);
            int m37043e2 = m37026v.m37043e(C7461j.ActionBar_contentInsetEnd, -1);
            if (m37043e >= 0 || m37043e2 >= 0) {
                this.f3468a.setContentInsetsRelative(Math.max(m37043e, 0), Math.max(m37043e2, 0));
            }
            int m37034n2 = m37026v.m37034n(C7461j.ActionBar_titleTextStyle, 0);
            if (m37034n2 != 0) {
                Toolbar toolbar2 = this.f3468a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), m37034n2);
            }
            int m37034n3 = m37026v.m37034n(C7461j.ActionBar_subtitleTextStyle, 0);
            if (m37034n3 != 0) {
                Toolbar toolbar3 = this.f3468a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), m37034n3);
            }
            int m37034n4 = m37026v.m37034n(C7461j.ActionBar_popupTheme, 0);
            if (m37034n4 != 0) {
                this.f3468a.setPopupTheme(m37034n4);
            }
        } else {
            this.f3469b = m37018B();
        }
        m37026v.m37025w();
        m37016D(i);
        this.f3478k = this.f3468a.getNavigationContentDescription();
        this.f3468a.setNavigationOnClickListener(new View$OnClickListenerC1141a());
    }

    @Override // androidx.appcompat.widget.InterfaceC1173z
    public void setIcon(Drawable drawable) {
        this.f3472e = drawable;
        m37009K();
    }
}
