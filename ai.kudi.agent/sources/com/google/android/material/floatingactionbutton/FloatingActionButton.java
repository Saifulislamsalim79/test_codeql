package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C1111i;
import androidx.appcompat.widget.C1116k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1365a;
import androidx.core.widget.InterfaceC1405m;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C4637b;
import com.google.android.material.internal.C4661c;
import com.google.android.material.internal.C4695q;
import com.google.android.material.internal.C4696r;
import com.google.android.material.internal.C4701s;
import com.google.android.material.theme.p106a.C4804a;
import java.util.List;
import p201g.p227h.p237k.C7675h;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7758w;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p325b0.InterfaceC9235b;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n;
import p272h.p286c.p287a.p323c.p327d0.C9268a;
import p272h.p286c.p287a.p323c.p328m.C9285h;
import p272h.p286c.p287a.p323c.p328m.InterfaceC9288k;
import p272h.p286c.p287a.p323c.p339w.C9315b;
import p272h.p286c.p287a.p323c.p339w.InterfaceC9314a;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* loaded from: classes2.dex */
public class FloatingActionButton extends C4701s implements InterfaceC7758w, InterfaceC1405m, InterfaceC9314a, InterfaceC9266n, CoordinatorLayout.InterfaceC1279b {

    /* renamed from: J */
    private static final int f11525J = C9276k.Widget_Design_FloatingActionButton;

    /* renamed from: A */
    private int f11526A;

    /* renamed from: B */
    private int f11527B;

    /* renamed from: C */
    private int f11528C;

    /* renamed from: D */
    boolean f11529D;

    /* renamed from: E */
    final Rect f11530E;

    /* renamed from: F */
    private final Rect f11531F;

    /* renamed from: G */
    private final C1116k f11532G;

    /* renamed from: H */
    private final C9315b f11533H;

    /* renamed from: I */
    private C4637b f11534I;

    /* renamed from: d */
    private ColorStateList f11535d;

    /* renamed from: e */
    private PorterDuff.Mode f11536e;

    /* renamed from: f */
    private ColorStateList f11537f;

    /* renamed from: w */
    private PorterDuff.Mode f11538w;

    /* renamed from: x */
    private ColorStateList f11539x;

    /* renamed from: y */
    private int f11540y;

    /* renamed from: z */
    private int f11541z;

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes2.dex */
    public class C4630a implements C4637b.InterfaceC4647j {

        /* renamed from: a */
        final /* synthetic */ AbstractC4631b f11545a;

        C4630a(AbstractC4631b abstractC4631b) {
            this.f11545a = abstractC4631b;
        }

        @Override // com.google.android.material.floatingactionbutton.C4637b.InterfaceC4647j
        /* renamed from: a */
        public void mo26889a() {
            this.f11545a.mo26947b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C4637b.InterfaceC4647j
        /* renamed from: b */
        public void mo26888b() {
            this.f11545a.mo26948a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4631b {
        /* renamed from: a */
        public void mo26948a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo26947b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes2.dex */
    public class C4632c implements InterfaceC9235b {
        C4632c() {
        }

        @Override // p272h.p286c.p287a.p323c.p325b0.InterfaceC9235b
        /* renamed from: a */
        public void mo15438a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // p272h.p286c.p287a.p323c.p325b0.InterfaceC9235b
        /* renamed from: b */
        public void mo15437b(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f11530E.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f11527B, i2 + FloatingActionButton.this.f11527B, i3 + FloatingActionButton.this.f11527B, i4 + FloatingActionButton.this.f11527B);
        }

        @Override // p272h.p286c.p287a.p323c.p325b0.InterfaceC9235b
        /* renamed from: c */
        public boolean mo15436c() {
            return FloatingActionButton.this.f11529D;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    /* loaded from: classes2.dex */
    class C4633d<T extends FloatingActionButton> implements C4637b.InterfaceC4646i {

        /* renamed from: a */
        private final InterfaceC9288k<T> f11548a;

        C4633d(InterfaceC9288k<T> interfaceC9288k) {
            this.f11548a = interfaceC9288k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C4637b.InterfaceC4646i
        /* renamed from: a */
        public void mo26891a() {
            this.f11548a.m15207b(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C4637b.InterfaceC4646i
        /* renamed from: b */
        public void mo26890b() {
            this.f11548a.m15208a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C4633d) && ((C4633d) obj).f11548a.equals(this.f11548a);
        }

        public int hashCode() {
            return this.f11548a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.floatingActionButtonStyle);
    }

    private C4637b getImpl() {
        if (this.f11534I == null) {
            this.f11534I = m26973h();
        }
        return this.f11534I;
    }

    /* renamed from: h */
    private C4637b m26973h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C4650c(this, new C4632c());
        }
        return new C4637b(this, new C4632c());
    }

    /* renamed from: k */
    private int m26970k(int i) {
        int i2 = this.f11526A;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C9267d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C9267d.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m26970k(1);
        } else {
            return m26970k(0);
        }
    }

    /* renamed from: q */
    private void m26964q(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f11530E;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: r */
    private void m26963r() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f11537f;
        if (colorStateList == null) {
            C1365a.m36199c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f11538w;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C1111i.m37131e(colorForState, mode));
    }

    /* renamed from: s */
    private static int m26962s(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i;
        }
        return Math.min(i, size);
    }

    /* renamed from: w */
    private C4637b.InterfaceC4647j m26958w(AbstractC4631b abstractC4631b) {
        if (abstractC4631b == null) {
            return null;
        }
        return new C4630a(abstractC4631b);
    }

    @Override // p272h.p286c.p287a.p323c.p339w.InterfaceC9314a
    /* renamed from: a */
    public boolean mo15071a() {
        return this.f11533H.m15068c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo26884E(getDrawableState());
    }

    /* renamed from: e */
    public void m26976e(Animator.AnimatorListener animatorListener) {
        getImpl().m26915d(animatorListener);
    }

    /* renamed from: f */
    public void m26975f(Animator.AnimatorListener animatorListener) {
        getImpl().m26914e(animatorListener);
    }

    /* renamed from: g */
    public void m26974g(InterfaceC9288k<? extends FloatingActionButton> interfaceC9288k) {
        getImpl().m26912f(new C4633d(interfaceC9288k));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f11535d;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f11536e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1279b
    public CoordinatorLayout.AbstractC1280c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo26875n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m26900q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m26898t();
    }

    public Drawable getContentBackground() {
        return getImpl().m26905k();
    }

    public int getCustomSize() {
        return this.f11526A;
    }

    public int getExpandedComponentIdHint() {
        return this.f11533H.m15069b();
    }

    public C9285h getHideMotionSpec() {
        return getImpl().m26901p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f11539x;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f11539x;
    }

    public C9250k getShapeAppearanceModel() {
        C9250k m26897u = getImpl().m26897u();
        C7675h.m17866f(m26897u);
        return m26897u;
    }

    public C9285h getShowMotionSpec() {
        return getImpl().m26896v();
    }

    public int getSize() {
        return this.f11541z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m26970k(this.f11541z);
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.InterfaceC1405m
    public ColorStateList getSupportImageTintList() {
        return this.f11537f;
    }

    @Override // androidx.core.widget.InterfaceC1405m
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f11538w;
    }

    public boolean getUseCompatPadding() {
        return this.f11529D;
    }

    @Deprecated
    /* renamed from: i */
    public boolean m26972i(Rect rect) {
        if (C7759x.m17535U(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            m26964q(rect);
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m26971j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m26964q(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo26886A();
    }

    /* renamed from: l */
    public void m26969l() {
        m26968m(null);
    }

    /* renamed from: m */
    public void m26968m(AbstractC4631b abstractC4631b) {
        m26967n(abstractC4631b, true);
    }

    /* renamed from: n */
    void m26967n(AbstractC4631b abstractC4631b, boolean z) {
        getImpl().m26895w(m26958w(abstractC4631b), z);
    }

    /* renamed from: o */
    public boolean m26966o() {
        return getImpl().m26894y();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m26940B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m26939D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f11527B = (sizeDimension - this.f11528C) / 2;
        getImpl().m26911f0();
        int min = Math.min(m26962s(sizeDimension, i), m26962s(sizeDimension, i2));
        Rect rect = this.f11530E;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C9268a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C9268a c9268a = (C9268a) parcelable;
        super.onRestoreInstanceState(c9268a.m17424a());
        C9315b c9315b = this.f11533H;
        Bundle bundle = c9268a.f21785e.get("expandableWidgetHelper");
        C7675h.m17866f(bundle);
        c9315b.m15067d(bundle);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        C9268a c9268a = new C9268a(onSaveInstanceState);
        c9268a.f21785e.put("expandableWidgetHelper", this.f11533H.m15066e());
        return c9268a;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m26972i(this.f11531F) && !this.f11531F.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public boolean m26965p() {
        return getImpl().m26893z();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f11535d != colorStateList) {
            this.f11535d = colorStateList;
            getImpl().m26934L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f11536e != mode) {
            this.f11536e = mode;
            getImpl().m26933M(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m26932N(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().m26929Q(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().m26925U(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            if (i != this.f11526A) {
                this.f11526A = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().m26909g0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().m26902o()) {
            getImpl().m26931O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f11533H.m15065f(i);
    }

    public void setHideMotionSpec(C9285h c9285h) {
        getImpl().m26930P(c9285h);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C9285h.m15223c(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m26913e0();
            if (this.f11537f != null) {
                m26963r();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f11532G.m37099g(i);
        m26963r();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m26936I();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m26936I();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().m26924W(z);
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n
    public void setShapeAppearanceModel(C9250k c9250k) {
        getImpl().m26923X(c9250k);
    }

    public void setShowMotionSpec(C9285h c9285h) {
        getImpl().m26922Y(c9285h);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C9285h.m15223c(getContext(), i));
    }

    public void setSize(int i) {
        this.f11526A = 0;
        if (i != this.f11541z) {
            this.f11541z = i;
            requestLayout();
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.InterfaceC1405m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f11537f != colorStateList) {
            this.f11537f = colorStateList;
            m26963r();
        }
    }

    @Override // androidx.core.widget.InterfaceC1405m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f11538w != mode) {
            this.f11538w = mode;
            m26963r();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m26935J();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m26935J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m26935J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f11529D != z) {
            this.f11529D = z;
            getImpl().mo26885C();
        }
    }

    @Override // com.google.android.material.internal.C4701s, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    public void m26961t() {
        m26960u(null);
    }

    /* renamed from: u */
    public void m26960u(AbstractC4631b abstractC4631b) {
        m26959v(abstractC4631b, true);
    }

    /* renamed from: v */
    void m26959v(AbstractC4631b abstractC4631b, boolean z) {
        getImpl().m26916c0(m26958w(abstractC4631b), z);
    }

    /* loaded from: classes2.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC1280c<T> {

        /* renamed from: a */
        private Rect f11542a;

        /* renamed from: b */
        private AbstractC4631b f11543b;

        /* renamed from: c */
        private boolean f11544c;

        public BaseBehavior() {
            this.f11544c = true;
        }

        /* renamed from: F */
        private static boolean m26956F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C1283f) {
                return ((CoordinatorLayout.C1283f) layoutParams).m36505f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m26955G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f11530E;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C1283f c1283f = (CoordinatorLayout.C1283f) floatingActionButton.getLayoutParams();
            int i2 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c1283f).rightMargin) {
                i = rect.right;
            } else {
                i = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c1283f).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c1283f).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c1283f).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                C7759x.m17528a0(floatingActionButton, i2);
            }
            if (i != 0) {
                C7759x.m17530Z(floatingActionButton, i);
            }
        }

        /* renamed from: J */
        private boolean m26952J(View view, FloatingActionButton floatingActionButton) {
            return this.f11544c && ((CoordinatorLayout.C1283f) floatingActionButton.getLayoutParams()).m36506e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: K */
        private boolean m26951K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (m26952J(appBarLayout, floatingActionButton)) {
                if (this.f11542a == null) {
                    this.f11542a = new Rect();
                }
                Rect rect = this.f11542a;
                C4661c.m26786a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.m26967n(this.f11543b, false);
                    return true;
                }
                floatingActionButton.m26959v(this.f11543b, false);
                return true;
            }
            return false;
        }

        /* renamed from: L */
        private boolean m26950L(View view, FloatingActionButton floatingActionButton) {
            if (m26952J(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C1283f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.m26967n(this.f11543b, false);
                    return true;
                }
                floatingActionButton.m26959v(this.f11543b, false);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: E */
        public boolean mo26949b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f11530E;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: H */
        public boolean mo26207h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m26951K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (m26956F(view)) {
                m26950L(view, floatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: I */
        public boolean mo26206l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> m36537l = coordinatorLayout.m36537l(floatingActionButton);
            int size = m36537l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = m36537l.get(i2);
                if (view instanceof AppBarLayout) {
                    if (m26951K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m26956F(view) && m26950L(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m36564C(floatingActionButton, i);
            m26955G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
        /* renamed from: g */
        public void mo26183g(CoordinatorLayout.C1283f c1283f) {
            if (c1283f.f4031h == 0) {
                c1283f.f4031h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.FloatingActionButton_Behavior_Layout);
            this.f11544c = obtainStyledAttributes.getBoolean(C9277l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f11525J), attributeSet, i);
        this.f11530E = new Rect();
        this.f11531F = new Rect();
        Context context2 = getContext();
        TypedArray m26690h = C4695q.m26690h(context2, attributeSet, C9277l.FloatingActionButton, i, f11525J, new int[0]);
        this.f11535d = C9321c.m15053a(context2, m26690h, C9277l.FloatingActionButton_backgroundTint);
        this.f11536e = C4696r.m26684e(m26690h.getInt(C9277l.FloatingActionButton_backgroundTintMode, -1), null);
        this.f11539x = C9321c.m15053a(context2, m26690h, C9277l.FloatingActionButton_rippleColor);
        this.f11541z = m26690h.getInt(C9277l.FloatingActionButton_fabSize, -1);
        this.f11526A = m26690h.getDimensionPixelSize(C9277l.FloatingActionButton_fabCustomSize, 0);
        this.f11540y = m26690h.getDimensionPixelSize(C9277l.FloatingActionButton_borderWidth, 0);
        float dimension = m26690h.getDimension(C9277l.FloatingActionButton_elevation, 0.0f);
        float dimension2 = m26690h.getDimension(C9277l.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = m26690h.getDimension(C9277l.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f11529D = m26690h.getBoolean(C9277l.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C9267d.mtrl_fab_min_touch_target);
        this.f11528C = m26690h.getDimensionPixelSize(C9277l.FloatingActionButton_maxImageSize, 0);
        C9285h m15224b = C9285h.m15224b(context2, m26690h, C9277l.FloatingActionButton_showMotionSpec);
        C9285h m15224b2 = C9285h.m15224b(context2, m26690h, C9277l.FloatingActionButton_hideMotionSpec);
        C9250k m15320m = C9250k.m15357g(context2, attributeSet, i, f11525J, C9250k.f21716m).m15320m();
        boolean z = m26690h.getBoolean(C9277l.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(m26690h.getBoolean(C9277l.FloatingActionButton_android_enabled, true));
        m26690h.recycle();
        C1116k c1116k = new C1116k(this);
        this.f11532G = c1116k;
        c1116k.m37100f(attributeSet, i);
        this.f11533H = new C9315b(this);
        getImpl().m26923X(m15320m);
        getImpl().mo26873x(this.f11535d, this.f11536e, this.f11539x, this.f11540y);
        getImpl().m26926T(dimensionPixelSize);
        getImpl().m26932N(dimension);
        getImpl().m26929Q(dimension2);
        getImpl().m26925U(dimension3);
        getImpl().m26927S(this.f11528C);
        getImpl().m26922Y(m15224b);
        getImpl().m26930P(m15224b2);
        getImpl().m26931O(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f11539x != colorStateList) {
            this.f11539x = colorStateList;
            getImpl().mo26881V(this.f11539x);
        }
    }
}
