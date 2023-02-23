package p272h.p286c.p287a.p323c.p331p;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import p201g.p202a.p203k.p204a.C7462a;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n;
/* compiled from: MaterialCardView.java */
/* renamed from: h.c.a.c.p.a */
/* loaded from: classes2.dex */
public class C9295a extends CardView implements Checkable, InterfaceC9266n {

    /* renamed from: G */
    private static final int[] f21863G = {16842911};

    /* renamed from: H */
    private static final int[] f21864H = {16842912};

    /* renamed from: I */
    private static final int[] f21865I = {C9233b.state_dragged};

    /* renamed from: B */
    private final C9297b f21866B;

    /* renamed from: C */
    private boolean f21867C;

    /* renamed from: D */
    private boolean f21868D;

    /* renamed from: E */
    private boolean f21869E;

    /* renamed from: F */
    private InterfaceC9296a f21870F;

    /* compiled from: MaterialCardView.java */
    /* renamed from: h.c.a.c.p.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC9296a {
        /* renamed from: a */
        void m15140a(C9295a c9295a, boolean z);
    }

    /* renamed from: g */
    private void m15143g() {
        if (Build.VERSION.SDK_INT <= 26) {
            return;
        }
        this.f21866B.m15130a();
        throw null;
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        this.f21866B.m15129b();
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        this.f21866B.m15128c();
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        this.f21866B.m15127d();
        throw null;
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        this.f21866B.m15126e();
        throw null;
    }

    public int getCheckedIconMargin() {
        this.f21866B.m15125f();
        throw null;
    }

    public int getCheckedIconSize() {
        this.f21866B.m15124g();
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        this.f21866B.m15123h();
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        this.f21866B.m15115p();
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        this.f21866B.m15115p();
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        this.f21866B.m15115p();
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        this.f21866B.m15115p();
        throw null;
    }

    public float getProgress() {
        this.f21866B.m15121j();
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        this.f21866B.m15122i();
        throw null;
    }

    public ColorStateList getRippleColor() {
        this.f21866B.m15120k();
        throw null;
    }

    public C9250k getShapeAppearanceModel() {
        this.f21866B.m15119l();
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        this.f21866B.m15118m();
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        this.f21866B.m15117n();
        throw null;
    }

    public int getStrokeWidth() {
        this.f21866B.m15116o();
        throw null;
    }

    /* renamed from: h */
    public boolean m15142h() {
        C9297b c9297b = this.f21866B;
        if (c9297b == null) {
            return false;
        }
        c9297b.m15113r();
        throw null;
    }

    /* renamed from: i */
    public boolean m15141i() {
        return this.f21869E;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f21868D;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21866B.m15129b();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (m15142h()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f21863G);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f21864H);
        }
        if (m15141i()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f21865I);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m15142h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f21866B.m15112s(getMeasuredWidth(), getMeasuredHeight());
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f21867C) {
            this.f21866B.m15114q();
            throw null;
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f21866B.m15111t(ColorStateList.valueOf(i));
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f21866B.m15132H();
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f21866B.m15110u(colorStateList);
        throw null;
    }

    public void setCheckable(boolean z) {
        this.f21866B.m15109v(z);
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f21868D != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f21866B.m15108w(drawable);
        throw null;
    }

    public void setCheckedIconMargin(int i) {
        this.f21866B.m15107x(i);
        throw null;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i == -1) {
            return;
        }
        this.f21866B.m15107x(getResources().getDimensionPixelSize(i));
        throw null;
    }

    public void setCheckedIconResource(int i) {
        this.f21866B.m15108w(C7462a.m18690d(getContext(), i));
        throw null;
    }

    public void setCheckedIconSize(int i) {
        this.f21866B.m15106y(i);
        throw null;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i == 0) {
            return;
        }
        this.f21866B.m15106y(getResources().getDimensionPixelSize(i));
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f21866B.m15105z(colorStateList);
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C9297b c9297b = this.f21866B;
        if (c9297b == null) {
            return;
        }
        c9297b.m15133G();
        throw null;
    }

    public void setDragged(boolean z) {
        if (this.f21869E != z) {
            this.f21869E = z;
            refreshDrawableState();
            m15143g();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f21866B.m15131I();
        throw null;
    }

    public void setOnCheckedChangeListener(InterfaceC9296a interfaceC9296a) {
        this.f21870F = interfaceC9296a;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f21866B.m15131I();
        throw null;
    }

    public void setProgress(float f) {
        this.f21866B.m15138B(f);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.f21866B.m15139A(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f21866B.m15137C(colorStateList);
        throw null;
    }

    public void setRippleColorResource(int i) {
        this.f21866B.m15137C(C7462a.m18691c(getContext(), i));
        throw null;
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n
    public void setShapeAppearanceModel(C9250k c9250k) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(c9250k.m15343u(getBoundsAsRectF()));
        }
        this.f21866B.m15136D(c9250k);
        throw null;
    }

    public void setStrokeColor(int i) {
        this.f21866B.m15135E(ColorStateList.valueOf(i));
        throw null;
    }

    public void setStrokeWidth(int i) {
        this.f21866B.m15134F(i);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f21866B.m15131I();
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m15142h() && isEnabled()) {
            this.f21868D = !this.f21868D;
            refreshDrawableState();
            m15143g();
            InterfaceC9296a interfaceC9296a = this.f21870F;
            if (interfaceC9296a != null) {
                interfaceC9296a.m15140a(this, this.f21868D);
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f21866B.m15111t(colorStateList);
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f21866B.m15135E(colorStateList);
        throw null;
    }
}
