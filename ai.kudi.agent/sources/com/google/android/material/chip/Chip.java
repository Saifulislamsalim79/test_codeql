package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C1097f;
import com.google.android.material.chip.C4574a;
import com.google.android.material.internal.C4695q;
import com.google.android.material.internal.C4696r;
import com.google.android.material.theme.p106a.C4804a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p243j.p245b.AbstractC7784a;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9275j;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p324a0.C9232b;
import p272h.p286c.p287a.p323c.p326c0.C9247h;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n;
import p272h.p286c.p287a.p323c.p328m.C9285h;
import p272h.p286c.p287a.p323c.p342z.AbstractC9326f;
import p272h.p286c.p287a.p323c.p342z.C9321c;
import p272h.p286c.p287a.p323c.p342z.C9322d;
/* loaded from: classes2.dex */
public class Chip extends C1097f implements C4574a.InterfaceC4575a, InterfaceC9266n {

    /* renamed from: L */
    private static final int f11280L = C9276k.Widget_MaterialComponents_Chip_Action;

    /* renamed from: M */
    private static final Rect f11281M = new Rect();

    /* renamed from: N */
    private static final int[] f11282N = {16842913};

    /* renamed from: O */
    private static final int[] f11283O = {16842911};

    /* renamed from: A */
    private boolean f11284A;

    /* renamed from: B */
    private boolean f11285B;

    /* renamed from: C */
    private boolean f11286C;

    /* renamed from: D */
    private boolean f11287D;

    /* renamed from: E */
    private boolean f11288E;

    /* renamed from: F */
    private int f11289F;

    /* renamed from: G */
    private int f11290G;

    /* renamed from: H */
    private final C4568c f11291H;

    /* renamed from: I */
    private final Rect f11292I;

    /* renamed from: J */
    private final RectF f11293J;

    /* renamed from: K */
    private final AbstractC9326f f11294K;

    /* renamed from: f */
    private C4574a f11295f;

    /* renamed from: w */
    private InsetDrawable f11296w;

    /* renamed from: x */
    private RippleDrawable f11297x;

    /* renamed from: y */
    private View.OnClickListener f11298y;

    /* renamed from: z */
    private CompoundButton.OnCheckedChangeListener f11299z;

    /* renamed from: com.google.android.material.chip.Chip$a */
    /* loaded from: classes2.dex */
    class C4566a extends AbstractC9326f {
        C4566a() {
        }

        @Override // p272h.p286c.p287a.p323c.p342z.AbstractC9326f
        /* renamed from: a */
        public void mo15030a(int i) {
        }

        @Override // p272h.p286c.p287a.p323c.p342z.AbstractC9326f
        /* renamed from: b */
        public void mo15029b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f11295f.m27254L2() ? Chip.this.f11295f.m27205h1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.chip.Chip$b */
    /* loaded from: classes2.dex */
    public class C4567b extends ViewOutlineProvider {
        C4567b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f11295f != null) {
                Chip.this.f11295f.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.Chip$c */
    /* loaded from: classes2.dex */
    public class C4568c extends AbstractC7784a {
        C4568c(Chip chip) {
            super(chip);
        }

        @Override // p201g.p243j.p245b.AbstractC7784a
        /* renamed from: B */
        protected int mo17419B(float f, float f2) {
            return (Chip.this.m27318n() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // p201g.p243j.p245b.AbstractC7784a
        /* renamed from: C */
        protected void mo17418C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m27318n() && Chip.this.m27313s() && Chip.this.f11298y != null) {
                list.add(1);
            }
        }

        @Override // p201g.p243j.p245b.AbstractC7784a
        /* renamed from: J */
        protected boolean mo17411J(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.m27312t();
                }
                return false;
            }
            return false;
        }

        @Override // p201g.p243j.p245b.AbstractC7784a
        /* renamed from: M */
        protected void mo17408M(C7716c c7716c) {
            c7716c.m17696Y(Chip.this.m27314r());
            c7716c.m17691b0(Chip.this.isClickable());
            if (!Chip.this.m27314r() && !Chip.this.isClickable()) {
                c7716c.m17693a0("android.view.View");
            } else {
                c7716c.m17693a0(Chip.this.m27314r() ? "android.widget.CompoundButton" : "android.widget.Button");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                c7716c.m17724A0(text);
            } else {
                c7716c.m17685e0(text);
            }
        }

        @Override // p201g.p243j.p245b.AbstractC7784a
        /* renamed from: N */
        protected void mo17407N(int i, C7716c c7716c) {
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    c7716c.m17685e0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C9275j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                    c7716c.m17685e0(context.getString(i2, objArr).trim());
                }
                c7716c.m17698W(Chip.this.getCloseIconTouchBoundsInt());
                c7716c.m17692b(C7716c.C7717a.f18476g);
                c7716c.m17681g0(Chip.this.isEnabled());
                return;
            }
            c7716c.m17685e0("");
            c7716c.m17698W(Chip.f11281M);
        }

        @Override // p201g.p243j.p245b.AbstractC7784a
        /* renamed from: O */
        protected void mo17406O(int i, boolean z) {
            if (i == 1) {
                Chip.this.f11287D = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.chipStyle);
    }

    /* renamed from: A */
    private void m27333A() {
        C4574a c4574a;
        if (TextUtils.isEmpty(getText()) || (c4574a = this.f11295f) == null) {
            return;
        }
        int m27262J0 = (int) (c4574a.m27262J0() + this.f11295f.m27201j1() + this.f11295f.m27181q0());
        int m27247O0 = (int) (this.f11295f.m27247O0() + this.f11295f.m27198k1() + this.f11295f.m27193m0());
        if (this.f11296w != null) {
            Rect rect = new Rect();
            this.f11296w.getPadding(rect);
            m27247O0 += rect.left;
            m27262J0 += rect.right;
        }
        C7759x.m17560D0(this, m27247O0, getPaddingTop(), m27262J0, getPaddingBottom());
    }

    /* renamed from: B */
    private void m27332B() {
        TextPaint paint = getPaint();
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            paint.drawableState = c4574a.getState();
        }
        C9322d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m15036j(getContext(), paint, this.f11294K);
        }
    }

    /* renamed from: C */
    private void m27331C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f11293J.setEmpty();
        if (m27318n() && this.f11298y != null) {
            this.f11295f.m27223Y0(this.f11293J);
        }
        return this.f11293J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f11292I.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f11292I;
    }

    private C9322d getTextAppearance() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27203i1();
        }
        return null;
    }

    /* renamed from: i */
    private void m27323i(C4574a c4574a) {
        c4574a.m27182p2(this);
    }

    /* renamed from: j */
    private int[] m27322j() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f11287D) {
            i2++;
        }
        if (this.f11286C) {
            i2++;
        }
        if (this.f11285B) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f11287D) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f11286C) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f11285B) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: l */
    private void m27320l() {
        if (getBackgroundDrawable() == this.f11296w && this.f11295f.getCallback() == null) {
            this.f11295f.setCallback(this.f11296w);
        }
    }

    /* renamed from: m */
    private boolean m27319m(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC7784a.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f11291H)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC7784a.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f11291H, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (NoSuchFieldException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (NoSuchMethodException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (InvocationTargetException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public boolean m27318n() {
        C4574a c4574a = this.f11295f;
        return (c4574a == null || c4574a.m27238R0() == null) ? false : true;
    }

    /* renamed from: o */
    private void m27317o(Context context, AttributeSet attributeSet, int i) {
        TypedArray m26690h = C4695q.m26690h(context, attributeSet, C9277l.Chip, i, f11280L, new int[0]);
        this.f11288E = m26690h.getBoolean(C9277l.Chip_ensureMinTouchTargetSize, false);
        this.f11290G = (int) Math.ceil(m26690h.getDimension(C9277l.Chip_chipMinTouchTargetSize, (float) Math.ceil(C4696r.m26687b(getContext(), 48))));
        m26690h.recycle();
    }

    /* renamed from: p */
    private void m27316p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C4567b());
        }
    }

    /* renamed from: q */
    private void m27315q(int i, int i2, int i3, int i4) {
        this.f11296w = new InsetDrawable((Drawable) this.f11295f, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f11286C != z) {
            this.f11286C = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f11285B != z) {
            this.f11285B = z;
            refreshDrawableState();
        }
    }

    /* renamed from: u */
    private void m27311u() {
        if (this.f11296w != null) {
            this.f11296w = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m27307y();
        }
    }

    /* renamed from: w */
    private void m27309w(C4574a c4574a) {
        if (c4574a != null) {
            c4574a.m27182p2(null);
        }
    }

    /* renamed from: x */
    private void m27308x() {
        if (m27318n() && m27313s() && this.f11298y != null) {
            C7759x.m17498p0(this, this.f11291H);
        } else {
            C7759x.m17498p0(this, null);
        }
    }

    /* renamed from: y */
    private void m27307y() {
        if (C9232b.f21638a) {
            m27306z();
            return;
        }
        this.f11295f.m27257K2(true);
        C7759x.m17492s0(this, getBackgroundDrawable());
        m27333A();
        m27320l();
    }

    /* renamed from: z */
    private void m27306z() {
        this.f11297x = new RippleDrawable(C9232b.m15444d(this.f11295f.m27209f1()), getBackgroundDrawable(), null);
        this.f11295f.m27257K2(false);
        C7759x.m17492s0(this, this.f11297x);
        m27333A();
    }

    @Override // com.google.android.material.chip.C4574a.InterfaceC4575a
    /* renamed from: a */
    public void mo27151a() {
        m27321k(this.f11290G);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m27319m(motionEvent) || this.f11291H.m17387v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f11291H.m17386w(keyEvent) || this.f11291H.m17420A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C1097f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4574a c4574a = this.f11295f;
        if ((c4574a == null || !c4574a.m27183p1()) ? false : this.f11295f.m27194l2(m27322j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f11296w;
        return insetDrawable == null ? this.f11295f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27274F0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27271G0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27268H0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return Math.max(0.0f, c4574a.m27265I0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f11295f;
    }

    public float getChipEndPadding() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27262J0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27259K0();
        }
        return null;
    }

    public float getChipIconSize() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27256L0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27253M0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27250N0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27247O0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27244P0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27241Q0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27238R0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27235S0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27233T0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27231U0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27229V0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27225X0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27217b1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f11291H.m17420A() != 1 && this.f11291H.m17385x() != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public C9285h getHideMotionSpec() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27215c1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27213d1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27211e1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27209f1();
        }
        return null;
    }

    public C9250k getShapeAppearanceModel() {
        return this.f11295f.m15430C();
    }

    public C9285h getShowMotionSpec() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27207g1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27201j1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            return c4574a.m27198k1();
        }
        return 0.0f;
    }

    /* renamed from: k */
    public boolean m27321k(int i) {
        this.f11290G = i;
        if (!m27310v()) {
            if (this.f11296w != null) {
                m27311u();
            } else {
                m27307y();
            }
            return false;
        }
        int max = Math.max(0, i - this.f11295f.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f11295f.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f11296w != null) {
                m27311u();
            } else {
                m27307y();
            }
            return false;
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f11296w != null) {
            Rect rect = new Rect();
            this.f11296w.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m27307y();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
        } else {
            setMinHeight(i);
            setMinWidth(i);
        }
        m27315q(i2, i3, i2, i3);
        m27307y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9247h.m15366f(this, this.f11295f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f11282N);
        }
        if (m27314r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f11283O);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f11291H.m17412I(z, i, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!m27314r() && !isClickable()) {
            accessibilityNodeInfo.setClassName("android.view.View");
        } else {
            accessibilityNodeInfo.setClassName(m27314r() ? "android.widget.CompoundButton" : "android.widget.Button");
        }
        accessibilityNodeInfo.setCheckable(m27314r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C7716c.m17716E0(accessibilityNodeInfo).m17687d0(C7716c.C7719c.m17636a(chipGroup.m26782b(this), 1, chipGroup.mo26781c() ? chipGroup.m27295o(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f11289F != i) {
            this.f11289F = i;
            m27333A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f11285B
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f11285B
            if (r0 == 0) goto L34
            r5.m27312t()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public boolean m27314r() {
        C4574a c4574a = this.f11295f;
        return c4574a != null && c4574a.m27186o1();
    }

    /* renamed from: s */
    public boolean m27313s() {
        C4574a c4574a = this.f11295f;
        return c4574a != null && c4574a.m27180q1();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f11297x) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C1097f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f11297x) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C1097f, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27159x1(z);
        }
    }

    public void setCheckableResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27156y1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C4574a c4574a = this.f11295f;
        if (c4574a == null) {
            this.f11284A = z;
        } else if (c4574a.m27186o1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.f11299z) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27153z1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27288A1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27285B1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27282C1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27279D1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27273F1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27270G1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27267H1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27264I1(i);
        }
    }

    public void setChipDrawable(C4574a c4574a) {
        C4574a c4574a2 = this.f11295f;
        if (c4574a2 != c4574a) {
            m27309w(c4574a2);
            this.f11295f = c4574a;
            c4574a.m27287A2(false);
            m27323i(this.f11295f);
            m27321k(this.f11290G);
        }
    }

    public void setChipEndPadding(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27261J1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27258K1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27255L1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27252M1(i);
        }
    }

    public void setChipIconSize(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27249N1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27246O1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27243P1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27240Q1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27237R1(i);
        }
    }

    public void setChipMinHeight(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27232T1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27230U1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27228V1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27226W1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27224X1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27222Y1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27220Z1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27218a2(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27214c2(drawable);
        }
        m27308x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27212d2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27210e2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27208f2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27206g2(i);
        }
        m27308x();
    }

    public void setCloseIconSize(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27204h2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27202i2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27200j2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27197k2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27191m2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27188n2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m15410W(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f11295f == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C4574a c4574a = this.f11295f;
            if (c4574a != null) {
                c4574a.m27179q2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f11288E = z;
        m27321k(this.f11290G);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C9285h c9285h) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27176r2(c9285h);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27173s2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27170t2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27167u2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27164v2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27161w2(i);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f11295f != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27158x2(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f11299z = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f11298y = onClickListener;
        m27308x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27155y2(colorStateList);
        }
        if (this.f11295f.m27192m1()) {
            return;
        }
        m27306z();
    }

    public void setRippleColorResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27152z2(i);
            if (this.f11295f.m27192m1()) {
                return;
            }
            m27306z();
        }
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.InterfaceC9266n
    public void setShapeAppearanceModel(C9250k c9250k) {
        this.f11295f.setShapeAppearanceModel(c9250k);
    }

    public void setShowMotionSpec(C9285h c9285h) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27284B2(c9285h);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27281C2(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f11295f == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(this.f11295f.m27254L2() ? null : charSequence, bufferType);
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27278D2(charSequence);
        }
    }

    public void setTextAppearance(C9322d c9322d) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27275E2(c9322d);
        }
        m27332B();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27269G2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27266H2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27263I2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27260J2(i);
        }
    }

    /* renamed from: t */
    public boolean m27312t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f11298y;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f11291H.m17400U(1, 1);
        return z;
    }

    /* renamed from: v */
    public boolean m27310v() {
        return this.f11288E;
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f11280L), attributeSet, i);
        this.f11292I = new Rect();
        this.f11293J = new RectF();
        this.f11294K = new C4566a();
        Context context2 = getContext();
        m27331C(attributeSet);
        C4574a m27166v0 = C4574a.m27166v0(context2, attributeSet, i, f11280L);
        m27317o(context2, attributeSet, i);
        setChipDrawable(m27166v0);
        m27166v0.m15410W(C7759x.m17485w(this));
        TypedArray m26690h = C4695q.m26690h(context2, attributeSet, C9277l.Chip, i, f11280L, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(C9321c.m15053a(context2, m26690h, C9277l.Chip_android_textColor));
        }
        boolean hasValue = m26690h.hasValue(C9277l.Chip_shapeAppearance);
        m26690h.recycle();
        this.f11291H = new C4568c(this);
        m27308x();
        if (!hasValue) {
            m27316p();
        }
        setChecked(this.f11284A);
        setText(m27166v0.m27205h1());
        setEllipsize(m27166v0.m27217b1());
        m27332B();
        if (!this.f11295f.m27254L2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m27333A();
        if (m27310v()) {
            setMinHeight(this.f11290G);
        }
        this.f11289F = C7759x.m17563C(this);
    }

    public void setCloseIconVisible(boolean z) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27185o2(z);
        }
        m27308x();
    }

    public void setCheckedIconVisible(boolean z) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27276E1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27234S1(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27272F2(i);
        }
        m27332B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C4574a c4574a = this.f11295f;
        if (c4574a != null) {
            c4574a.m27272F2(i);
        }
        m27332B();
    }
}
