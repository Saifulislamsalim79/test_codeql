package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.C1003i;
import androidx.appcompat.widget.C1138r0;
import androidx.core.content.C1335a;
import com.google.android.material.internal.C4660b;
import com.google.android.material.internal.C4665g;
import com.google.android.material.internal.C4666h;
import com.google.android.material.internal.C4682k;
import com.google.android.material.internal.C4695q;
import com.google.android.material.theme.p106a.C4804a;
import p201g.p202a.C7452a;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p202a.p209o.C7492g;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
import p201g.p243j.p244a.AbstractC7781a;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9247h;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* loaded from: classes2.dex */
public class NavigationView extends C4682k {

    /* renamed from: E */
    private static final int[] f11785E = {16842912};

    /* renamed from: F */
    private static final int[] f11786F = {-16842910};

    /* renamed from: G */
    private static final int f11787G = C9276k.Widget_Design_NavigationView;

    /* renamed from: A */
    private final int f11788A;

    /* renamed from: B */
    private final int[] f11789B;

    /* renamed from: C */
    private MenuInflater f11790C;

    /* renamed from: D */
    private ViewTreeObserver.OnGlobalLayoutListener f11791D;

    /* renamed from: x */
    private final C4665g f11792x;

    /* renamed from: y */
    private final C4666h f11793y;

    /* renamed from: z */
    InterfaceC4704c f11794z;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    /* loaded from: classes2.dex */
    class C4702a implements C0999g.InterfaceC1000a {
        C4702a() {
        }

        @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
        /* renamed from: a */
        public boolean mo18592a(C0999g c0999g, MenuItem menuItem) {
            InterfaceC4704c interfaceC4704c = NavigationView.this.f11794z;
            return interfaceC4704c != null && interfaceC4704c.onNavigationItemSelected(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1000a
        /* renamed from: b */
        public void mo18591b(C0999g c0999g) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC4703b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC4703b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f11789B);
            boolean z = true;
            boolean z2 = NavigationView.this.f11789B[1] == 0;
            NavigationView.this.f11793y.m26742y(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Activity m26787a = C4660b.m26787a(NavigationView.this.getContext());
            if (m26787a == null || Build.VERSION.SDK_INT < 21) {
                return;
            }
            NavigationView.this.setDrawBottomInsetForeground(((m26787a.findViewById(16908290).getHeight() == NavigationView.this.getHeight()) && (Color.alpha(m26787a.getWindow().getNavigationBarColor()) != 0)) ? false : false);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4704c {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.navigationViewStyle);
    }

    /* renamed from: d */
    private ColorStateList m26676d(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList m18691c = C7462a.m18691c(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(C7452a.colorPrimary, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = m18691c.getDefaultColor();
                return new ColorStateList(new int[][]{f11786F, f11785E, FrameLayout.EMPTY_STATE_SET}, new int[]{m18691c.getColorForState(f11786F, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    /* renamed from: e */
    private final Drawable m26675e(C1138r0 c1138r0) {
        C9243g c9243g = new C9243g(C9250k.m15362b(getContext(), c1138r0.m37034n(C9277l.NavigationView_itemShapeAppearance, 0), c1138r0.m37034n(C9277l.NavigationView_itemShapeAppearanceOverlay, 0)).m15320m());
        c9243g.m15409X(C9321c.m15052b(getContext(), c1138r0, C9277l.NavigationView_itemShapeFillColor));
        return new InsetDrawable((Drawable) c9243g, c1138r0.m37042f(C9277l.NavigationView_itemShapeInsetStart, 0), c1138r0.m37042f(C9277l.NavigationView_itemShapeInsetTop, 0), c1138r0.m37042f(C9277l.NavigationView_itemShapeInsetEnd, 0), c1138r0.m37042f(C9277l.NavigationView_itemShapeInsetBottom, 0));
    }

    /* renamed from: f */
    private boolean m26674f(C1138r0 c1138r0) {
        return c1138r0.m37029s(C9277l.NavigationView_itemShapeAppearance) || c1138r0.m37029s(C9277l.NavigationView_itemShapeAppearanceOverlay);
    }

    private MenuInflater getMenuInflater() {
        if (this.f11790C == null) {
            this.f11790C = new C7492g(getContext());
        }
        return this.f11790C;
    }

    /* renamed from: i */
    private void m26671i() {
        this.f11791D = new ViewTreeObserver$OnGlobalLayoutListenerC4703b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f11791D);
    }

    @Override // com.google.android.material.internal.C4682k
    /* renamed from: a */
    protected void mo26679a(C7698g0 c7698g0) {
        this.f11793y.m26763d(c7698g0);
    }

    /* renamed from: g */
    public View m26673g(int i) {
        return this.f11793y.m26743x(i);
    }

    public MenuItem getCheckedItem() {
        return this.f11793y.m26762e();
    }

    public int getHeaderCount() {
        return this.f11793y.m26761f();
    }

    public Drawable getItemBackground() {
        return this.f11793y.m26760g();
    }

    public int getItemHorizontalPadding() {
        return this.f11793y.m26751p();
    }

    public int getItemIconPadding() {
        return this.f11793y.m26748s();
    }

    public ColorStateList getItemIconTintList() {
        return this.f11793y.m26745v();
    }

    public int getItemMaxLines() {
        return this.f11793y.m26747t();
    }

    public ColorStateList getItemTextColor() {
        return this.f11793y.m26746u();
    }

    public Menu getMenu() {
        return this.f11792x;
    }

    /* renamed from: h */
    public void m26672h(int i) {
        this.f11793y.m26768K(true);
        getMenuInflater().inflate(i, this.f11792x);
        this.f11793y.m26768K(false);
        this.f11793y.mo26758i(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.internal.C4682k, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9247h.m15367e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.internal.C4682k, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f11791D);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f11791D);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f11788A), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f11788A, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4705d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4705d c4705d = (C4705d) parcelable;
        super.onRestoreInstanceState(c4705d.m17424a());
        this.f11792x.m37542S(c4705d.f11797e);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C4705d c4705d = new C4705d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c4705d.f11797e = bundle;
        this.f11792x.m37540U(bundle);
        return c4705d;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f11792x.findItem(i);
        if (findItem != null) {
            this.f11793y.m26741z((C1003i) findItem);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C9247h.m15368d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f11793y.m26777B(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C1335a.m36322f(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.f11793y.m26776C(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f11793y.m26776C(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.f11793y.m26775D(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f11793y.m26775D(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.f11793y.m26774E(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f11793y.m26773F(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f11793y.m26772G(i);
    }

    public void setItemTextAppearance(int i) {
        this.f11793y.m26771H(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f11793y.m26770I(colorStateList);
    }

    public void setNavigationItemSelectedListener(InterfaceC4704c interfaceC4704c) {
        this.f11794z = interfaceC4704c;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C4666h c4666h = this.f11793y;
        if (c4666h != null) {
            c4666h.m26769J(i);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$d */
    /* loaded from: classes2.dex */
    public static class C4705d extends AbstractC7781a {
        public static final Parcelable.Creator<C4705d> CREATOR = new C4706a();

        /* renamed from: e */
        public Bundle f11797e;

        /* renamed from: com.google.android.material.navigation.NavigationView$d$a */
        /* loaded from: classes2.dex */
        static class C4706a implements Parcelable.ClassLoaderCreator<C4705d> {
            C4706a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4705d createFromParcel(Parcel parcel) {
                return new C4705d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4705d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4705d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4705d[] newArray(int i) {
                return new C4705d[i];
            }
        }

        public C4705d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11797e = parcel.readBundle(classLoader);
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f11797e);
        }

        public C4705d(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f11787G), attributeSet, i);
        ColorStateList m26676d;
        int i2;
        boolean z;
        this.f11793y = new C4666h();
        this.f11789B = new int[2];
        Context context2 = getContext();
        this.f11792x = new C4665g(context2);
        C1138r0 m26689i = C4695q.m26689i(context2, attributeSet, C9277l.NavigationView, i, f11787G, new int[0]);
        if (m26689i.m37029s(C9277l.NavigationView_android_background)) {
            C7759x.m17492s0(this, m26689i.m37041g(C9277l.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C9250k m15320m = C9250k.m15359e(context2, attributeSet, i, f11787G).m15320m();
            Drawable background = getBackground();
            C9243g c9243g = new C9243g(m15320m);
            if (background instanceof ColorDrawable) {
                c9243g.m15409X(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c9243g.m15420M(context2);
            C7759x.m17492s0(this, c9243g);
        }
        if (m26689i.m37029s(C9277l.NavigationView_elevation)) {
            setElevation(m26689i.m37042f(C9277l.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(m26689i.m37047a(C9277l.NavigationView_android_fitsSystemWindows, false));
        this.f11788A = m26689i.m37042f(C9277l.NavigationView_android_maxWidth, 0);
        if (m26689i.m37029s(C9277l.NavigationView_itemIconTint)) {
            m26676d = m26689i.m37045c(C9277l.NavigationView_itemIconTint);
        } else {
            m26676d = m26676d(16842808);
        }
        if (m26689i.m37029s(C9277l.NavigationView_itemTextAppearance)) {
            i2 = m26689i.m37034n(C9277l.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        if (m26689i.m37029s(C9277l.NavigationView_itemIconSize)) {
            setItemIconSize(m26689i.m37042f(C9277l.NavigationView_itemIconSize, 0));
        }
        ColorStateList m37045c = m26689i.m37029s(C9277l.NavigationView_itemTextColor) ? m26689i.m37045c(C9277l.NavigationView_itemTextColor) : null;
        if (!z && m37045c == null) {
            m37045c = m26676d(16842806);
        }
        Drawable m37041g = m26689i.m37041g(C9277l.NavigationView_itemBackground);
        if (m37041g == null && m26674f(m26689i)) {
            m37041g = m26675e(m26689i);
        }
        if (m26689i.m37029s(C9277l.NavigationView_itemHorizontalPadding)) {
            this.f11793y.m26776C(m26689i.m37042f(C9277l.NavigationView_itemHorizontalPadding, 0));
        }
        int m37042f = m26689i.m37042f(C9277l.NavigationView_itemIconPadding, 0);
        setItemMaxLines(m26689i.m37037k(C9277l.NavigationView_itemMaxLines, 1));
        this.f11792x.mo37444V(new C4702a());
        this.f11793y.m26778A(1);
        this.f11793y.mo26753n(context2, this.f11792x);
        this.f11793y.m26773F(m26676d);
        this.f11793y.m26769J(getOverScrollMode());
        if (z) {
            this.f11793y.m26771H(i2);
        }
        this.f11793y.m26770I(m37045c);
        this.f11793y.m26777B(m37041g);
        this.f11793y.m26775D(m37042f);
        this.f11792x.m37534b(this.f11793y);
        addView((View) this.f11793y.m26744w(this));
        if (m26689i.m37029s(C9277l.NavigationView_menu)) {
            m26672h(m26689i.m37034n(C9277l.NavigationView_menu, 0));
        }
        if (m26689i.m37029s(C9277l.NavigationView_headerLayout)) {
            m26673g(m26689i.m37034n(C9277l.NavigationView_headerLayout, 0));
        }
        m26689i.m37025w();
        m26671i();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f11792x.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f11793y.m26741z((C1003i) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
