package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.widget.C1138r0;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import com.google.android.material.internal.C4695q;
import com.google.android.material.internal.C4696r;
import com.google.android.material.theme.p106a.C4804a;
import p201g.p202a.p209o.C7492g;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
import p201g.p243j.p244a.AbstractC7781a;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9236c;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p324a0.C9232b;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9247h;
import p272h.p286c.p287a.p323c.p329n.C9289a;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* loaded from: classes2.dex */
public class BottomNavigationView extends FrameLayout {

    /* renamed from: z */
    private static final int f11094z = C9276k.Widget_Design_BottomNavigationView;

    /* renamed from: c */
    private final C0999g f11095c;

    /* renamed from: d */
    final C4533c f11096d;

    /* renamed from: e */
    private final C4535d f11097e;

    /* renamed from: f */
    private ColorStateList f11098f;

    /* renamed from: w */
    private MenuInflater f11099w;

    /* renamed from: x */
    private InterfaceC4527d f11100x;

    /* renamed from: y */
    private InterfaceC4526c f11101y;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    /* loaded from: classes2.dex */
    class C4524a implements C0999g.InterfaceC1000a {
        C4524a() {
        }

        @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
        /* renamed from: a */
        public boolean mo18592a(C0999g c0999g, MenuItem menuItem) {
            if (BottomNavigationView.this.f11101y == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                return (BottomNavigationView.this.f11100x == null || BottomNavigationView.this.f11100x.onNavigationItemSelected(menuItem)) ? false : true;
            }
            BottomNavigationView.this.f11101y.m27518a(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
        /* renamed from: b */
        public void mo18591b(C0999g c0999g) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    /* loaded from: classes2.dex */
    public class C4525b implements C4696r.InterfaceC4699c {
        C4525b(BottomNavigationView bottomNavigationView) {
        }

        @Override // com.google.android.material.internal.C4696r.InterfaceC4699c
        /* renamed from: a */
        public C7698g0 mo26682a(View view, C7698g0 c7698g0, C4696r.C4700d c4700d) {
            c4700d.f11783d += c7698g0.m17785i();
            boolean z = C7759x.m17563C(view) == 1;
            int m17784j = c7698g0.m17784j();
            int m17783k = c7698g0.m17783k();
            c4700d.f11780a += z ? m17783k : m17784j;
            int i = c4700d.f11782c;
            if (!z) {
                m17784j = m17783k;
            }
            c4700d.f11782c = i + m17784j;
            c4700d.m26681a(view);
            return c7698g0;
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4526c {
        /* renamed from: a */
        void m27518a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC4527d {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$e */
    /* loaded from: classes2.dex */
    public static class C4528e extends AbstractC7781a {
        public static final Parcelable.Creator<C4528e> CREATOR = new C4529a();

        /* renamed from: e */
        Bundle f11103e;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$e$a */
        /* loaded from: classes2.dex */
        static class C4529a implements Parcelable.ClassLoaderCreator<C4528e> {
            C4529a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4528e createFromParcel(Parcel parcel) {
                return new C4528e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4528e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4528e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4528e[] newArray(int i) {
                return new C4528e[i];
            }
        }

        public C4528e(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m27517b(Parcel parcel, ClassLoader classLoader) {
            this.f11103e = parcel.readBundle(classLoader);
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f11103e);
        }

        public C4528e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m27517b(parcel, classLoader == null ? C4528e.class.getClassLoader() : classLoader);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.bottomNavigationStyle);
    }

    /* renamed from: c */
    private void m27525c(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C1335a.m36324d(context, C9236c.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C9267d.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    /* renamed from: d */
    private void m27524d() {
        C4696r.m26688a(this, new C4525b(this));
    }

    /* renamed from: e */
    private C9243g m27523e(Context context) {
        C9243g c9243g = new C9243g();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            c9243g.m15409X(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        c9243g.m15420M(context);
        return c9243g;
    }

    private MenuInflater getMenuInflater() {
        if (this.f11099w == null) {
            this.f11099w = new C7492g(getContext());
        }
        return this.f11099w;
    }

    /* renamed from: i */
    private boolean m27519i() {
        return Build.VERSION.SDK_INT < 21 && !(getBackground() instanceof C9243g);
    }

    /* renamed from: f */
    public C9289a m27522f(int i) {
        return this.f11096d.m27495g(i);
    }

    /* renamed from: g */
    public C9289a m27521g(int i) {
        return this.f11096d.m27494h(i);
    }

    public Drawable getItemBackground() {
        return this.f11096d.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f11096d.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f11096d.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f11096d.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f11098f;
    }

    public int getItemTextAppearanceActive() {
        return this.f11096d.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f11096d.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f11096d.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f11096d.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f11095c;
    }

    public int getSelectedItemId() {
        return this.f11096d.getSelectedItemId();
    }

    /* renamed from: h */
    public void m27520h(int i) {
        this.f11097e.m27484d(true);
        getMenuInflater().inflate(i, this.f11095c);
        this.f11097e.m27484d(false);
        this.f11097e.mo26758i(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9247h.m15367e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4528e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4528e c4528e = (C4528e) parcelable;
        super.onRestoreInstanceState(c4528e.m17424a());
        this.f11095c.m37542S(c4528e.f11103e);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C4528e c4528e = new C4528e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c4528e.f11103e = bundle;
        this.f11095c.m37540U(bundle);
        return c4528e;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C9247h.m15368d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f11096d.setItemBackground(drawable);
        this.f11098f = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f11096d.setItemBackgroundRes(i);
        this.f11098f = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f11096d.m27493i() != z) {
            this.f11096d.setItemHorizontalTranslationEnabled(z);
            this.f11097e.mo26758i(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f11096d.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f11096d.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f11098f == colorStateList) {
            if (colorStateList != null || this.f11096d.getItemBackground() == null) {
                return;
            }
            this.f11096d.setItemBackground(null);
            return;
        }
        this.f11098f = colorStateList;
        if (colorStateList == null) {
            this.f11096d.setItemBackground(null);
            return;
        }
        ColorStateList m15447a = C9232b.m15447a(colorStateList);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f11096d.setItemBackground(new RippleDrawable(m15447a, null, null));
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(1.0E-5f);
        Drawable m36184r = C1365a.m36184r(gradientDrawable);
        C1365a.m36187o(m36184r, m15447a);
        this.f11096d.setItemBackground(m36184r);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f11096d.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f11096d.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f11096d.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f11096d.getLabelVisibilityMode() != i) {
            this.f11096d.setLabelVisibilityMode(i);
            this.f11097e.mo26758i(false);
        }
    }

    public void setOnNavigationItemReselectedListener(InterfaceC4526c interfaceC4526c) {
        this.f11101y = interfaceC4526c;
    }

    public void setOnNavigationItemSelectedListener(InterfaceC4527d interfaceC4527d) {
        this.f11100x = interfaceC4527d;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f11095c.findItem(i);
        if (findItem == null || this.f11095c.m37546O(findItem, this.f11097e, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f11094z), attributeSet, i);
        this.f11097e = new C4535d();
        Context context2 = getContext();
        this.f11095c = new C4532b(context2);
        this.f11096d = new C4533c(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f11096d.setLayoutParams(layoutParams);
        this.f11097e.m27486b(this.f11096d);
        this.f11097e.m27485c(1);
        this.f11096d.setPresenter(this.f11097e);
        this.f11095c.m37534b(this.f11097e);
        this.f11097e.mo26753n(getContext(), this.f11095c);
        C1138r0 m26689i = C4695q.m26689i(context2, attributeSet, C9277l.BottomNavigationView, i, C9276k.Widget_Design_BottomNavigationView, C9277l.BottomNavigationView_itemTextAppearanceInactive, C9277l.BottomNavigationView_itemTextAppearanceActive);
        if (m26689i.m37029s(C9277l.BottomNavigationView_itemIconTint)) {
            this.f11096d.setIconTintList(m26689i.m37045c(C9277l.BottomNavigationView_itemIconTint));
        } else {
            C4533c c4533c = this.f11096d;
            c4533c.setIconTintList(c4533c.m27497e(16842808));
        }
        setItemIconSize(m26689i.m37042f(C9277l.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(C9267d.design_bottom_navigation_icon_size)));
        if (m26689i.m37029s(C9277l.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(m26689i.m37034n(C9277l.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (m26689i.m37029s(C9277l.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(m26689i.m37034n(C9277l.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (m26689i.m37029s(C9277l.BottomNavigationView_itemTextColor)) {
            setItemTextColor(m26689i.m37045c(C9277l.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C7759x.m17492s0(this, m27523e(context2));
        }
        if (m26689i.m37029s(C9277l.BottomNavigationView_elevation)) {
            setElevation(m26689i.m37042f(C9277l.BottomNavigationView_elevation, 0));
        }
        C1365a.m36187o(getBackground().mutate(), C9321c.m15052b(context2, m26689i, C9277l.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(m26689i.m37036l(C9277l.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(m26689i.m37047a(C9277l.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int m37034n = m26689i.m37034n(C9277l.BottomNavigationView_itemBackground, 0);
        if (m37034n != 0) {
            this.f11096d.setItemBackgroundRes(m37034n);
        } else {
            setItemRippleColor(C9321c.m15052b(context2, m26689i, C9277l.BottomNavigationView_itemRippleColor));
        }
        if (m26689i.m37029s(C9277l.BottomNavigationView_menu)) {
            m27520h(m26689i.m37034n(C9277l.BottomNavigationView_menu, 0));
        }
        m26689i.m37025w();
        addView(this.f11096d, layoutParams);
        if (m27519i()) {
            m27525c(context2);
        }
        this.f11095c.mo37444V(new C4524a());
        m27524d();
    }
}
