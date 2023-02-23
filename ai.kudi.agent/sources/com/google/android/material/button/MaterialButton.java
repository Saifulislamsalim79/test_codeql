package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C1365a;
import androidx.core.widget.C1398i;
import com.google.android.material.internal.C4695q;
import com.google.android.material.internal.C4696r;
import com.google.android.material.theme.p106a.C4804a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p238l.C7759x;
import p201g.p243j.p244a.AbstractC7781a;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p326c0.C9247h;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC9266n {

    /* renamed from: H */
    private static final int[] f11222H = {16842911};

    /* renamed from: I */
    private static final int[] f11223I = {16842912};

    /* renamed from: J */
    private static final int f11224J = C9276k.Widget_MaterialComponents_Button;

    /* renamed from: A */
    private int f11225A;

    /* renamed from: B */
    private int f11226B;

    /* renamed from: C */
    private int f11227C;

    /* renamed from: D */
    private int f11228D;

    /* renamed from: E */
    private boolean f11229E;

    /* renamed from: F */
    private boolean f11230F;

    /* renamed from: G */
    private int f11231G;

    /* renamed from: e */
    private final C4565a f11232e;

    /* renamed from: f */
    private final LinkedHashSet<InterfaceC4555a> f11233f;

    /* renamed from: w */
    private InterfaceC4556b f11234w;

    /* renamed from: x */
    private PorterDuff.Mode f11235x;

    /* renamed from: y */
    private ColorStateList f11236y;

    /* renamed from: z */
    private Drawable f11237z;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4555a {
        /* renamed from: a */
        void mo27377a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    /* loaded from: classes2.dex */
    interface InterfaceC4556b {
        /* renamed from: a */
        void mo27370a(MaterialButton materialButton, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.button.MaterialButton$c */
    /* loaded from: classes2.dex */
    public static class C4557c extends AbstractC7781a {
        public static final Parcelable.Creator<C4557c> CREATOR = new C4558a();

        /* renamed from: e */
        boolean f11238e;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        /* loaded from: classes2.dex */
        static class C4558a implements Parcelable.ClassLoaderCreator<C4557c> {
            C4558a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4557c createFromParcel(Parcel parcel) {
                return new C4557c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4557c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4557c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4557c[] newArray(int i) {
                return new C4557c[i];
            }
        }

        public C4557c(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m27405b(Parcel parcel) {
            this.f11238e = parcel.readInt() == 1;
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11238e ? 1 : 0);
        }

        public C4557c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                C4557c.class.getClassLoader();
            }
            m27405b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.materialButtonStyle);
    }

    /* renamed from: c */
    private boolean m27414c() {
        int i = this.f11231G;
        return i == 3 || i == 4;
    }

    /* renamed from: d */
    private boolean m27413d() {
        int i = this.f11231G;
        return i == 1 || i == 2;
    }

    /* renamed from: e */
    private boolean m27412e() {
        int i = this.f11231G;
        return i == 16 || i == 32;
    }

    /* renamed from: f */
    private boolean m27411f() {
        return C7759x.m17563C(this) == 1;
    }

    /* renamed from: g */
    private boolean m27410g() {
        C4565a c4565a = this.f11232e;
        return (c4565a == null || c4565a.m27345o()) ? false : true;
    }

    private String getA11yClassName() {
        return (m27415b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: i */
    private void m27408i() {
        if (m27413d()) {
            C1398i.m36094l(this, this.f11237z, null, null, null);
        } else if (m27414c()) {
            C1398i.m36094l(this, null, null, this.f11237z, null);
        } else if (m27412e()) {
            C1398i.m36094l(this, null, this.f11237z, null, null);
        }
    }

    /* renamed from: j */
    private void m27407j(boolean z) {
        Drawable drawable = this.f11237z;
        if (drawable != null) {
            Drawable mutate = C1365a.m36184r(drawable).mutate();
            this.f11237z = mutate;
            C1365a.m36187o(mutate, this.f11236y);
            PorterDuff.Mode mode = this.f11235x;
            if (mode != null) {
                C1365a.m36186p(this.f11237z, mode);
            }
            int i = this.f11225A;
            if (i == 0) {
                i = this.f11237z.getIntrinsicWidth();
            }
            int i2 = this.f11225A;
            if (i2 == 0) {
                i2 = this.f11237z.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f11237z;
            int i3 = this.f11226B;
            int i4 = this.f11227C;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            m27408i();
            return;
        }
        Drawable[] m36105a = C1398i.m36105a(this);
        boolean z2 = false;
        Drawable drawable3 = m36105a[0];
        Drawable drawable4 = m36105a[1];
        Drawable drawable5 = m36105a[2];
        if ((m27413d() && drawable3 != this.f11237z) || ((m27414c() && drawable5 != this.f11237z) || (m27412e() && drawable4 != this.f11237z))) {
            z2 = true;
        }
        if (z2) {
            m27408i();
        }
    }

    /* renamed from: k */
    private void m27406k(int i, int i2) {
        if (this.f11237z == null || getLayout() == null) {
            return;
        }
        if (!m27413d() && !m27414c()) {
            if (m27412e()) {
                this.f11226B = 0;
                if (this.f11231G == 16) {
                    this.f11227C = 0;
                    m27407j(false);
                    return;
                }
                int i3 = this.f11225A;
                if (i3 == 0) {
                    i3 = this.f11237z.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.f11228D) - getPaddingBottom()) / 2;
                if (this.f11227C != textHeight) {
                    this.f11227C = textHeight;
                    m27407j(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f11227C = 0;
        int i4 = this.f11231G;
        if (i4 != 1 && i4 != 3) {
            int i5 = this.f11225A;
            if (i5 == 0) {
                i5 = this.f11237z.getIntrinsicWidth();
            }
            int textWidth = (((((i - getTextWidth()) - C7759x.m17553H(this)) - i5) - this.f11228D) - C7759x.m17551I(this)) / 2;
            if (m27411f() != (this.f11231G == 4)) {
                textWidth = -textWidth;
            }
            if (this.f11226B != textWidth) {
                this.f11226B = textWidth;
                m27407j(false);
                return;
            }
            return;
        }
        this.f11226B = 0;
        m27407j(false);
    }

    /* renamed from: a */
    public void m27416a(InterfaceC4555a interfaceC4555a) {
        this.f11233f.add(interfaceC4555a);
    }

    /* renamed from: b */
    public boolean m27415b() {
        C4565a c4565a = this.f11232e;
        return c4565a != null && c4565a.m27344p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m27410g()) {
            return this.f11232e.m27358b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f11237z;
    }

    public int getIconGravity() {
        return this.f11231G;
    }

    public int getIconPadding() {
        return this.f11228D;
    }

    public int getIconSize() {
        return this.f11225A;
    }

    public ColorStateList getIconTint() {
        return this.f11236y;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11235x;
    }

    public int getInsetBottom() {
        return this.f11232e.m27357c();
    }

    public int getInsetTop() {
        return this.f11232e.m27356d();
    }

    public ColorStateList getRippleColor() {
        if (m27410g()) {
            return this.f11232e.m27352h();
        }
        return null;
    }

    public C9250k getShapeAppearanceModel() {
        if (m27410g()) {
            return this.f11232e.m27351i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m27410g()) {
            return this.f11232e.m27350j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m27410g()) {
            return this.f11232e.m27349k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, p201g.p227h.p238l.InterfaceC7758w
    public ColorStateList getSupportBackgroundTintList() {
        if (m27410g()) {
            return this.f11232e.m27348l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, p201g.p227h.p238l.InterfaceC7758w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m27410g()) {
            return this.f11232e.m27347m();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public void m27409h(InterfaceC4555a interfaceC4555a) {
        this.f11233f.remove(interfaceC4555a);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f11229E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m27410g()) {
            C9247h.m15366f(this, this.f11232e.m27354f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m27415b()) {
            Button.mergeDrawableStates(onCreateDrawableState, f11222H);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f11223I);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m27415b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C4565a c4565a;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (c4565a = this.f11232e) == null) {
            return;
        }
        c4565a.m27362H(i4 - i2, i3 - i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4557c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4557c c4557c = (C4557c) parcelable;
        super.onRestoreInstanceState(c4557c.m17424a());
        setChecked(c4557c.f11238e);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        C4557c c4557c = new C4557c(super.onSaveInstanceState());
        c4557c.f11238e = this.f11229E;
        return c4557c;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m27406k(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m27406k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m27410g()) {
            this.f11232e.m27342r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m27410g()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f11232e.m27341s();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C7462a.m18690d(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m27410g()) {
            this.f11232e.m27340t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m27415b() && isEnabled() && this.f11229E != z) {
            this.f11229E = z;
            refreshDrawableState();
            if (this.f11230F) {
                return;
            }
            this.f11230F = true;
            Iterator<InterfaceC4555a> it = this.f11233f.iterator();
            while (it.hasNext()) {
                it.next().mo27377a(this, this.f11229E);
            }
            this.f11230F = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m27410g()) {
            this.f11232e.m27339u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m27410g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m27410g()) {
            this.f11232e.m27354f().m15410W(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f11237z != drawable) {
            this.f11237z = drawable;
            m27407j(true);
            m27406k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f11231G != i) {
            this.f11231G = i;
            m27406k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f11228D != i) {
            this.f11228D = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C7462a.m18690d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.f11225A != i) {
                this.f11225A = i;
                m27407j(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f11236y != colorStateList) {
            this.f11236y = colorStateList;
            m27407j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f11235x != mode) {
            this.f11235x = mode;
            m27407j(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C7462a.m18691c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f11232e.m27338v(i);
    }

    public void setInsetTop(int i) {
        this.f11232e.m27337w(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(InterfaceC4556b interfaceC4556b) {
        this.f11234w = interfaceC4556b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC4556b interfaceC4556b = this.f11234w;
        if (interfaceC4556b != null) {
            interfaceC4556b.mo27370a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m27410g()) {
            this.f11232e.m27336x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m27410g()) {
            setRippleColor(C7462a.m18691c(getContext(), i));
        }
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n
    public void setShapeAppearanceModel(C9250k c9250k) {
        if (m27410g()) {
            this.f11232e.m27335y(c9250k);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m27410g()) {
            this.f11232e.m27334z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m27410g()) {
            this.f11232e.m27369A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m27410g()) {
            setStrokeColor(C7462a.m18691c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m27410g()) {
            this.f11232e.m27368B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m27410g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m27410g()) {
            this.f11232e.m27367C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m27410g()) {
            this.f11232e.m27366D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f11229E);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f11224J), attributeSet, i);
        this.f11233f = new LinkedHashSet<>();
        this.f11229E = false;
        this.f11230F = false;
        Context context2 = getContext();
        TypedArray m26690h = C4695q.m26690h(context2, attributeSet, C9277l.MaterialButton, i, f11224J, new int[0]);
        this.f11228D = m26690h.getDimensionPixelSize(C9277l.MaterialButton_iconPadding, 0);
        this.f11235x = C4696r.m26684e(m26690h.getInt(C9277l.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f11236y = C9321c.m15053a(getContext(), m26690h, C9277l.MaterialButton_iconTint);
        this.f11237z = C9321c.m15050d(getContext(), m26690h, C9277l.MaterialButton_icon);
        this.f11231G = m26690h.getInteger(C9277l.MaterialButton_iconGravity, 1);
        this.f11225A = m26690h.getDimensionPixelSize(C9277l.MaterialButton_iconSize, 0);
        C4565a c4565a = new C4565a(this, C9250k.m15359e(context2, attributeSet, i, f11224J).m15320m());
        this.f11232e = c4565a;
        c4565a.m27343q(m26690h);
        m26690h.recycle();
        setCompoundDrawablePadding(this.f11228D);
        m27407j(this.f11237z != null);
    }
}
