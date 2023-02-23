package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.C0934c;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import p201g.p202a.p205l.p206a.C7478d;
/* compiled from: ActionBarDrawerToggle.java */
/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes2.dex */
public class C0929b implements DrawerLayout.InterfaceC1409d {

    /* renamed from: a */
    private final InterfaceC0931b f2539a;

    /* renamed from: b */
    private final DrawerLayout f2540b;

    /* renamed from: c */
    private C7478d f2541c;

    /* renamed from: d */
    private boolean f2542d;

    /* renamed from: e */
    boolean f2543e;

    /* renamed from: f */
    private final int f2544f;

    /* renamed from: g */
    private final int f2545g;

    /* renamed from: h */
    View.OnClickListener f2546h;

    /* renamed from: i */
    private boolean f2547i;

    /* compiled from: ActionBarDrawerToggle.java */
    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC0930a implements View.OnClickListener {
        View$OnClickListenerC0930a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0929b c0929b = C0929b.this;
            if (c0929b.f2543e) {
                c0929b.m37790f();
                return;
            }
            View.OnClickListener onClickListener = c0929b.f2546h;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* renamed from: androidx.appcompat.app.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC0931b {
        /* renamed from: a */
        boolean mo37698a();

        /* renamed from: b */
        Context mo37697b();

        /* renamed from: c */
        void mo37696c(Drawable drawable, int i);

        /* renamed from: d */
        Drawable mo37695d();

        /* renamed from: e */
        void mo37694e(int i);
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* renamed from: androidx.appcompat.app.b$d */
    /* loaded from: classes2.dex */
    private static class C0932d implements InterfaceC0931b {

        /* renamed from: a */
        private final Activity f2549a;

        /* renamed from: b */
        private C0934c.C0935a f2550b;

        C0932d(Activity activity) {
            this.f2549a = activity;
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: a */
        public boolean mo37698a() {
            ActionBar actionBar = this.f2549a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: b */
        public Context mo37697b() {
            ActionBar actionBar = this.f2549a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f2549a;
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: c */
        public void mo37696c(Drawable drawable, int i) {
            ActionBar actionBar = this.f2549a.getActionBar();
            if (actionBar != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    actionBar.setHomeAsUpIndicator(drawable);
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                actionBar.setDisplayShowHomeEnabled(true);
                this.f2550b = C0934c.m37787c(this.f2549a, drawable, i);
                actionBar.setDisplayShowHomeEnabled(false);
            }
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: d */
        public Drawable mo37695d() {
            if (Build.VERSION.SDK_INT >= 18) {
                TypedArray obtainStyledAttributes = mo37697b().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                obtainStyledAttributes.recycle();
                return drawable;
            }
            return C0934c.m37789a(this.f2549a);
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: e */
        public void mo37694e(int i) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f2549a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            this.f2550b = C0934c.m37788b(this.f2550b, this.f2549a, i);
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* renamed from: androidx.appcompat.app.b$e */
    /* loaded from: classes2.dex */
    static class C0933e implements InterfaceC0931b {

        /* renamed from: a */
        final Toolbar f2551a;

        /* renamed from: b */
        final Drawable f2552b;

        /* renamed from: c */
        final CharSequence f2553c;

        C0933e(Toolbar toolbar) {
            this.f2551a = toolbar;
            this.f2552b = toolbar.getNavigationIcon();
            this.f2553c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: a */
        public boolean mo37698a() {
            return true;
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: b */
        public Context mo37697b() {
            return this.f2551a.getContext();
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: c */
        public void mo37696c(Drawable drawable, int i) {
            this.f2551a.setNavigationIcon(drawable);
            mo37694e(i);
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: d */
        public Drawable mo37695d() {
            return this.f2552b;
        }

        @Override // androidx.appcompat.app.C0929b.InterfaceC0931b
        /* renamed from: e */
        public void mo37694e(int i) {
            if (i == 0) {
                this.f2551a.setNavigationContentDescription(this.f2553c);
            } else {
                this.f2551a.setNavigationContentDescription(i);
            }
        }
    }

    public C0929b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    /* renamed from: d */
    private void m37792d(float f) {
        if (f == 1.0f) {
            this.f2541c.m18619h(true);
        } else if (f == 0.0f) {
            this.f2541c.m18619h(false);
        }
        this.f2541c.m18621f(f);
    }

    /* renamed from: a */
    Drawable m37795a() {
        return this.f2539a.mo37695d();
    }

    /* renamed from: b */
    void m37794b(int i) {
        this.f2539a.mo37694e(i);
    }

    /* renamed from: c */
    void m37793c(Drawable drawable, int i) {
        if (!this.f2547i && !this.f2539a.mo37698a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f2547i = true;
        }
        this.f2539a.mo37696c(drawable, i);
    }

    /* renamed from: e */
    public void m37791e() {
        if (this.f2540b.m36074C(8388611)) {
            m37792d(1.0f);
        } else {
            m37792d(0.0f);
        }
        if (this.f2543e) {
            m37793c(this.f2541c, this.f2540b.m36074C(8388611) ? this.f2545g : this.f2544f);
        }
    }

    /* renamed from: f */
    void m37790f() {
        int m36037q = this.f2540b.m36037q(8388611);
        if (this.f2540b.m36071F(8388611) && m36037q != 2) {
            this.f2540b.m36050d(8388611);
        } else if (m36037q != 1) {
            this.f2540b.m36066K(8388611);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1409d
    public void onDrawerClosed(View view) {
        m37792d(0.0f);
        if (this.f2543e) {
            m37794b(this.f2544f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1409d
    public void onDrawerOpened(View view) {
        m37792d(1.0f);
        if (this.f2543e) {
            m37794b(this.f2545g);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1409d
    public void onDrawerSlide(View view, float f) {
        if (this.f2542d) {
            m37792d(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m37792d(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1409d
    public void onDrawerStateChanged(int i) {
    }

    C0929b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C7478d c7478d, int i, int i2) {
        this.f2542d = true;
        this.f2543e = true;
        this.f2547i = false;
        if (toolbar != null) {
            this.f2539a = new C0933e(toolbar);
            toolbar.setNavigationOnClickListener(new View$OnClickListenerC0930a());
        } else if (activity instanceof c) {
            this.f2539a = ((c) activity).getDrawerToggleDelegate();
        } else {
            this.f2539a = new C0932d(activity);
        }
        this.f2540b = drawerLayout;
        this.f2544f = i;
        this.f2545g = i2;
        if (c7478d == null) {
            this.f2541c = new C7478d(this.f2539a.mo37697b());
        } else {
            this.f2541c = c7478d;
        }
        m37795a();
    }
}
