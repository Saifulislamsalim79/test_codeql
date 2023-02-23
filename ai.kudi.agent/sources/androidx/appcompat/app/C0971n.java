package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.widget.C1140s0;
import androidx.appcompat.widget.InterfaceC1173z;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p201g.p202a.p209o.Window$CallbackC7497i;
import p201g.p227h.p238l.C7759x;
/* compiled from: ToolbarActionBar.java */
/* renamed from: androidx.appcompat.app.n */
/* loaded from: classes2.dex */
class C0971n extends AbstractC0925a {

    /* renamed from: a */
    InterfaceC1173z f2679a;

    /* renamed from: b */
    boolean f2680b;

    /* renamed from: c */
    Window.Callback f2681c;

    /* renamed from: d */
    private boolean f2682d;

    /* renamed from: e */
    private boolean f2683e;

    /* renamed from: f */
    private ArrayList<AbstractC0925a.InterfaceC0927b> f2684f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f2685g = new RunnableC0972a();

    /* renamed from: h */
    private final Toolbar.InterfaceC1062f f2686h = new C0973b();

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: androidx.appcompat.app.n$a */
    /* loaded from: classes2.dex */
    class RunnableC0972a implements Runnable {
        RunnableC0972a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0971n.this.m37648I();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: androidx.appcompat.app.n$b */
    /* loaded from: classes2.dex */
    class C0973b implements Toolbar.InterfaceC1062f {
        C0973b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC1062f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0971n.this.f2681c.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* renamed from: androidx.appcompat.app.n$c */
    /* loaded from: classes2.dex */
    public final class C0974c implements InterfaceC1014m.InterfaceC1015a {

        /* renamed from: c */
        private boolean f2689c;

        C0974c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
        /* renamed from: a */
        public void mo37237a(C0999g c0999g, boolean z) {
            if (this.f2689c) {
                return;
            }
            this.f2689c = true;
            C0971n.this.f2679a.mo36882i();
            Window.Callback callback = C0971n.this.f2681c;
            if (callback != null) {
                callback.onPanelClosed(108, c0999g);
            }
            this.f2689c = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1014m.InterfaceC1015a
        /* renamed from: b */
        public boolean mo37236b(C0999g c0999g) {
            Window.Callback callback = C0971n.this.f2681c;
            if (callback != null) {
                callback.onMenuOpened(108, c0999g);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* renamed from: androidx.appcompat.app.n$d */
    /* loaded from: classes2.dex */
    public final class C0975d implements C0999g.InterfaceC1000a {
        C0975d() {
        }

        @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
        /* renamed from: a */
        public boolean mo18592a(C0999g c0999g, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
        /* renamed from: b */
        public void mo18591b(C0999g c0999g) {
            C0971n c0971n = C0971n.this;
            if (c0971n.f2681c != null) {
                if (c0971n.f2679a.mo36888c()) {
                    C0971n.this.f2681c.onPanelClosed(108, c0999g);
                } else if (C0971n.this.f2681c.onPreparePanel(0, null, c0999g)) {
                    C0971n.this.f2681c.onMenuOpened(108, c0999g);
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: androidx.appcompat.app.n$e */
    /* loaded from: classes2.dex */
    private class C0976e extends Window$CallbackC7497i {
        public C0976e(Window.Callback callback) {
            super(callback);
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0971n.this.f2679a.getContext());
            }
            return super.onCreatePanelView(i);
        }

        @Override // p201g.p202a.p209o.Window$CallbackC7497i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0971n c0971n = C0971n.this;
                if (!c0971n.f2680b) {
                    c0971n.f2679a.mo36887d();
                    C0971n.this.f2680b = true;
                }
            }
            return onPreparePanel;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0971n(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f2679a = new C1140s0(toolbar, false);
        C0976e c0976e = new C0976e(callback);
        this.f2681c = c0976e;
        this.f2679a.setWindowCallback(c0976e);
        toolbar.setOnMenuItemClickListener(this.f2686h);
        this.f2679a.setWindowTitle(charSequence);
    }

    /* renamed from: G */
    private Menu m37650G() {
        if (!this.f2682d) {
            this.f2679a.mo36873r(new C0974c(), new C0975d());
            this.f2682d = true;
        }
        return this.f2679a.mo36878m();
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: A */
    public void mo37633A(Drawable drawable) {
        this.f2679a.mo36865z(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: B */
    public void mo37632B(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: C */
    public void mo37631C(CharSequence charSequence) {
        this.f2679a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: D */
    public void mo37630D(CharSequence charSequence) {
        this.f2679a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: E */
    public void mo37629E() {
        this.f2679a.mo36872s(0);
    }

    /* renamed from: H */
    public Window.Callback m37649H() {
        return this.f2681c;
    }

    /* renamed from: I */
    void m37648I() {
        Menu m37650G = m37650G();
        C0999g c0999g = m37650G instanceof C0999g ? (C0999g) m37650G : null;
        if (c0999g != null) {
            c0999g.m37523h0();
        }
        try {
            m37650G.clear();
            if (!this.f2681c.onCreatePanelMenu(0, m37650G) || !this.f2681c.onPreparePanel(0, null, m37650G)) {
                m37650G.clear();
            }
        } finally {
            if (c0999g != null) {
                c0999g.m37524g0();
            }
        }
    }

    /* renamed from: J */
    public void m37647J(int i, int i2) {
        this.f2679a.mo36879l((i & i2) | ((i2 ^ (-1)) & this.f2679a.mo36869v()));
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: g */
    public boolean mo37646g() {
        return this.f2679a.mo36884g();
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: h */
    public boolean mo37611h() {
        if (this.f2679a.mo36880k()) {
            this.f2679a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: i */
    public void mo37610i(boolean z) {
        if (z == this.f2683e) {
            return;
        }
        this.f2683e = z;
        int size = this.f2684f.size();
        for (int i = 0; i < size; i++) {
            this.f2684f.get(i).m37801a(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: j */
    public int mo37609j() {
        return this.f2679a.mo36869v();
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: k */
    public Context mo37608k() {
        return this.f2679a.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: l */
    public void mo37607l() {
        this.f2679a.mo36872s(8);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: m */
    public boolean mo37645m() {
        this.f2679a.mo36871t().removeCallbacks(this.f2685g);
        C7759x.m17514h0(this.f2679a.mo36871t(), this.f2685g);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: n */
    public void mo37606n(Configuration configuration) {
        super.mo37606n(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: o */
    public void mo37644o() {
        this.f2679a.mo36871t().removeCallbacks(this.f2685g);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: p */
    public boolean mo37605p(int i, KeyEvent keyEvent) {
        Menu m37650G = m37650G();
        if (m37650G != null) {
            m37650G.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return m37650G.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: q */
    public boolean mo37643q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo37642r();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: r */
    public boolean mo37642r() {
        return this.f2679a.mo36883h();
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: s */
    public void mo37604s(Drawable drawable) {
        this.f2679a.mo36890a(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: t */
    public void mo37603t(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: u */
    public void mo37602u(boolean z) {
        m37647J(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: v */
    public void mo37601v(boolean z) {
        m37647J(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: w */
    public void mo37600w(boolean z) {
        m37647J(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: x */
    public void mo37599x(float f) {
        C7759x.m17484w0(this.f2679a.mo36871t(), f);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: y */
    public void mo37598y(int i) {
        this.f2679a.mo36868w(i);
    }

    @Override // androidx.appcompat.app.AbstractC0925a
    /* renamed from: z */
    public void mo37597z(int i) {
        this.f2679a.mo36874q(i);
    }
}
