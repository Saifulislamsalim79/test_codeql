package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C1365a;
import androidx.core.widget.C1398i;
import p201g.p202a.C7452a;
import p201g.p202a.C7459h;
import p201g.p202a.C7461j;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p202a.p208n.C7483a;
import p201g.p227h.p238l.C7759x;
/* loaded from: classes2.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: i0 */
    private static final Property<SwitchCompat, Float> f3166i0 = new C1056a(Float.class, "thumbPos");

    /* renamed from: j0 */
    private static final int[] f3167j0 = {16842912};

    /* renamed from: A */
    private boolean f3168A;

    /* renamed from: B */
    private boolean f3169B;

    /* renamed from: C */
    private int f3170C;

    /* renamed from: D */
    private int f3171D;

    /* renamed from: E */
    private int f3172E;

    /* renamed from: F */
    private boolean f3173F;

    /* renamed from: G */
    private CharSequence f3174G;

    /* renamed from: H */
    private CharSequence f3175H;

    /* renamed from: I */
    private boolean f3176I;

    /* renamed from: J */
    private int f3177J;

    /* renamed from: K */
    private int f3178K;

    /* renamed from: L */
    private float f3179L;

    /* renamed from: M */
    private float f3180M;

    /* renamed from: N */
    private VelocityTracker f3181N;

    /* renamed from: O */
    private int f3182O;

    /* renamed from: P */
    float f3183P;

    /* renamed from: Q */
    private int f3184Q;

    /* renamed from: R */
    private int f3185R;

    /* renamed from: S */
    private int f3186S;

    /* renamed from: T */
    private int f3187T;

    /* renamed from: U */
    private int f3188U;

    /* renamed from: V */
    private int f3189V;

    /* renamed from: W */
    private int f3190W;

    /* renamed from: a0 */
    private final TextPaint f3191a0;

    /* renamed from: b0 */
    private ColorStateList f3192b0;

    /* renamed from: c */
    private Drawable f3193c;

    /* renamed from: c0 */
    private Layout f3194c0;

    /* renamed from: d */
    private ColorStateList f3195d;

    /* renamed from: d0 */
    private Layout f3196d0;

    /* renamed from: e */
    private PorterDuff.Mode f3197e;

    /* renamed from: e0 */
    private TransformationMethod f3198e0;

    /* renamed from: f */
    private boolean f3199f;

    /* renamed from: f0 */
    ObjectAnimator f3200f0;

    /* renamed from: g0 */
    private final C1160v f3201g0;

    /* renamed from: h0 */
    private final Rect f3202h0;

    /* renamed from: w */
    private boolean f3203w;

    /* renamed from: x */
    private Drawable f3204x;

    /* renamed from: y */
    private ColorStateList f3205y;

    /* renamed from: z */
    private PorterDuff.Mode f3206z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    /* loaded from: classes2.dex */
    class C1056a extends Property<SwitchCompat, Float> {
        C1056a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f3183P);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.switchStyle);
    }

    /* renamed from: a */
    private void m37314a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f3166i0, z ? 1.0f : 0.0f);
        this.f3200f0 = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f3200f0.setAutoCancel(true);
        }
        this.f3200f0.start();
    }

    /* renamed from: b */
    private void m37313b() {
        if (this.f3193c != null) {
            if (this.f3199f || this.f3203w) {
                Drawable mutate = C1365a.m36184r(this.f3193c).mutate();
                this.f3193c = mutate;
                if (this.f3199f) {
                    C1365a.m36187o(mutate, this.f3195d);
                }
                if (this.f3203w) {
                    C1365a.m36186p(this.f3193c, this.f3197e);
                }
                if (this.f3193c.isStateful()) {
                    this.f3193c.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    private void m37312c() {
        if (this.f3204x != null) {
            if (this.f3168A || this.f3169B) {
                Drawable mutate = C1365a.m36184r(this.f3204x).mutate();
                this.f3204x = mutate;
                if (this.f3168A) {
                    C1365a.m36187o(mutate, this.f3205y);
                }
                if (this.f3169B) {
                    C1365a.m36186p(this.f3204x, this.f3206z);
                }
                if (this.f3204x.isStateful()) {
                    this.f3204x.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    private void m37311d() {
        ObjectAnimator objectAnimator = this.f3200f0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: e */
    private void m37310e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: f */
    private static float m37309f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: g */
    private boolean m37308g(float f, float f2) {
        if (this.f3193c == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f3193c.getPadding(this.f3202h0);
        int i = this.f3188U;
        int i2 = this.f3178K;
        int i3 = i - i2;
        int i4 = (this.f3187T + thumbOffset) - i2;
        Rect rect = this.f3202h0;
        return f > ((float) i4) && f < ((float) ((((this.f3186S + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f3190W + i2));
    }

    private boolean getTargetCheckedState() {
        return this.f3183P > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (C1170x0.m36903b(this)) {
            f = 1.0f - this.f3183P;
        } else {
            f = this.f3183P;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f3204x;
        if (drawable != null) {
            Rect rect2 = this.f3202h0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f3193c;
            if (drawable2 != null) {
                rect = C1068a0.m37282d(drawable2);
            } else {
                rect = C1068a0.f3234c;
            }
            return ((((this.f3184Q - this.f3186S) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    /* renamed from: h */
    private Layout m37307h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f3198e0;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f3191a0;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: i */
    private void m37306i() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f3175H;
            if (charSequence == null) {
                charSequence = getResources().getString(C7459h.abc_capital_off);
            }
            C7759x.m17554G0(this, charSequence);
        }
    }

    /* renamed from: j */
    private void m37305j() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f3174G;
            if (charSequence == null) {
                charSequence = getResources().getString(C7459h.abc_capital_on);
            }
            C7759x.m17554G0(this, charSequence);
        }
    }

    /* renamed from: m */
    private void m37302m(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i != 2) {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        m37303l(typeface, i2);
    }

    /* renamed from: n */
    private void m37301n(MotionEvent motionEvent) {
        this.f3177J = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f3181N.computeCurrentVelocity(1000);
            float xVelocity = this.f3181N.getXVelocity();
            if (Math.abs(xVelocity) > this.f3182O) {
                if (!C1170x0.m36903b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z = false;
                }
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m37310e(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f3202h0;
        int i3 = this.f3187T;
        int i4 = this.f3188U;
        int i5 = this.f3189V;
        int i6 = this.f3190W;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f3193c;
        if (drawable != null) {
            rect = C1068a0.m37282d(drawable);
        } else {
            rect = C1068a0.f3234c;
        }
        Drawable drawable2 = this.f3204x;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f3204x.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f3204x.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f3193c;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f3186S + rect2.right;
            this.f3193c.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C1365a.m36190l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f3193c;
        if (drawable != null) {
            C1365a.m36191k(drawable, f, f2);
        }
        Drawable drawable2 = this.f3204x;
        if (drawable2 != null) {
            C1365a.m36191k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3193c;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f3204x;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C1170x0.m36903b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3184Q;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3172E : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C1170x0.m36903b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3184Q;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3172E : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f3176I;
    }

    public boolean getSplitTrack() {
        return this.f3173F;
    }

    public int getSwitchMinWidth() {
        return this.f3171D;
    }

    public int getSwitchPadding() {
        return this.f3172E;
    }

    public CharSequence getTextOff() {
        return this.f3175H;
    }

    public CharSequence getTextOn() {
        return this.f3174G;
    }

    public Drawable getThumbDrawable() {
        return this.f3193c;
    }

    public int getThumbTextPadding() {
        return this.f3170C;
    }

    public ColorStateList getThumbTintList() {
        return this.f3195d;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3197e;
    }

    public Drawable getTrackDrawable() {
        return this.f3204x;
    }

    public ColorStateList getTrackTintList() {
        return this.f3205y;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3206z;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3193c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3204x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3200f0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3200f0.end();
        this.f3200f0 = null;
    }

    /* renamed from: k */
    public void m37304k(Context context, int i) {
        C1138r0 m37028t = C1138r0.m37028t(context, i, C7461j.TextAppearance);
        ColorStateList m37045c = m37028t.m37045c(C7461j.TextAppearance_android_textColor);
        if (m37045c != null) {
            this.f3192b0 = m37045c;
        } else {
            this.f3192b0 = getTextColors();
        }
        int m37042f = m37028t.m37042f(C7461j.TextAppearance_android_textSize, 0);
        if (m37042f != 0) {
            float f = m37042f;
            if (f != this.f3191a0.getTextSize()) {
                this.f3191a0.setTextSize(f);
                requestLayout();
            }
        }
        m37302m(m37028t.m37037k(C7461j.TextAppearance_android_typeface, -1), m37028t.m37037k(C7461j.TextAppearance_android_textStyle, -1));
        if (m37028t.m37047a(C7461j.TextAppearance_textAllCaps, false)) {
            this.f3198e0 = new C7483a(getContext());
        } else {
            this.f3198e0 = null;
        }
        m37028t.m37025w();
    }

    /* renamed from: l */
    public void m37303l(Typeface typeface, int i) {
        Typeface create;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            int style = ((create != null ? create.getStyle() : 0) ^ (-1)) & i;
            this.f3191a0.setFakeBoldText((style & 1) != 0);
            this.f3191a0.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.f3191a0.setFakeBoldText(false);
        this.f3191a0.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f3167j0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f3202h0;
        Drawable drawable = this.f3204x;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f3188U;
        int i2 = this.f3190W;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f3193c;
        if (drawable != null) {
            if (this.f3173F && drawable2 != null) {
                Rect m37282d = C1068a0.m37282d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m37282d.left;
                rect.right -= m37282d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f3194c0 : this.f3196d0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3192b0;
            if (colorStateList != null) {
                this.f3191a0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f3191a0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f3174G : this.f3175H;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.f3193c != null) {
            Rect rect = this.f3202h0;
            Drawable drawable = this.f3204x;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m37282d = C1068a0.m37282d(this.f3193c);
            i5 = Math.max(0, m37282d.left - rect.left);
            i9 = Math.max(0, m37282d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C1170x0.m36903b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f3184Q + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f3184Q) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i7 = this.f3185R;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i7 = this.f3185R;
        } else {
            i8 = getHeight() - getPaddingBottom();
            paddingTop = i8 - this.f3185R;
            this.f3187T = i6;
            this.f3188U = paddingTop;
            this.f3190W = i8;
            this.f3189V = width;
        }
        i8 = i7 + paddingTop;
        this.f3187T = i6;
        this.f3188U = paddingTop;
        this.f3190W = i8;
        this.f3189V = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f3176I) {
            if (this.f3194c0 == null) {
                this.f3194c0 = m37307h(this.f3174G);
            }
            if (this.f3196d0 == null) {
                this.f3196d0 = m37307h(this.f3175H);
            }
        }
        Rect rect = this.f3202h0;
        Drawable drawable = this.f3193c;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f3193c.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f3193c.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f3186S = Math.max(this.f3176I ? Math.max(this.f3194c0.getWidth(), this.f3196d0.getWidth()) + (this.f3170C * 2) : 0, i3);
        Drawable drawable2 = this.f3204x;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f3204x.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f3193c;
        if (drawable3 != null) {
            Rect m37282d = C1068a0.m37282d(drawable3);
            i6 = Math.max(i6, m37282d.left);
            i7 = Math.max(i7, m37282d.right);
        }
        int max = Math.max(this.f3171D, (this.f3186S * 2) + i6 + i7);
        int max2 = Math.max(i5, i4);
        this.f3184Q = max;
        this.f3185R = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3174G : this.f3175H;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f3181N
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.f3177J
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f3179L
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = androidx.appcompat.widget.C1170x0.m36903b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.f3183P
            float r0 = r0 + r2
            float r0 = m37309f(r0, r4, r3)
            float r2 = r6.f3183P
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.f3179L = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f3179L
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f3178K
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.f3180M
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f3178K
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.f3177J = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f3179L = r0
            r6.f3180M = r3
            return r1
        L8b:
            int r0 = r6.f3177J
            if (r0 != r2) goto L96
            r6.m37301n(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.f3177J = r0
            android.view.VelocityTracker r0 = r6.f3181N
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.m37308g(r0, r2)
            if (r3 == 0) goto Lb9
            r6.f3177J = r1
            r6.f3179L = r0
            r6.f3180M = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            m37305j();
        } else {
            m37306i();
        }
        if (getWindowToken() != null && C7759x.m17535U(this)) {
            m37314a(isChecked);
            return;
        }
        m37311d();
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1398i.m36087s(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f3176I != z) {
            this.f3176I = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f3173F = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f3171D = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f3172E = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f3191a0.getTypeface() == null || this.f3191a0.getTypeface().equals(typeface)) && (this.f3191a0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f3191a0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f3175H = charSequence;
        requestLayout();
        if (isChecked()) {
            return;
        }
        m37306i();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f3174G = charSequence;
        requestLayout();
        if (isChecked()) {
            m37305j();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3193c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3193c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f) {
        this.f3183P = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C7462a.m18690d(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f3170C = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3195d = colorStateList;
        this.f3199f = true;
        m37313b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3197e = mode;
        this.f3203w = true;
        m37313b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3204x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3204x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C7462a.m18690d(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3205y = colorStateList;
        this.f3168A = true;
        m37312c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3206z = mode;
        this.f3169B = true;
        m37312c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3193c || drawable == this.f3204x;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3195d = null;
        this.f3197e = null;
        this.f3199f = false;
        this.f3203w = false;
        this.f3205y = null;
        this.f3206z = null;
        this.f3168A = false;
        this.f3169B = false;
        this.f3181N = VelocityTracker.obtain();
        this.f3202h0 = new Rect();
        C1126m0.m37066a(this, getContext());
        this.f3191a0 = new TextPaint(1);
        Resources resources = getResources();
        this.f3191a0.density = resources.getDisplayMetrics().density;
        C1138r0 m37026v = C1138r0.m37026v(context, attributeSet, C7461j.SwitchCompat, i, 0);
        C7759x.m17502n0(this, context, C7461j.SwitchCompat, attributeSet, m37026v.m37030r(), i, 0);
        Drawable m37041g = m37026v.m37041g(C7461j.SwitchCompat_android_thumb);
        this.f3193c = m37041g;
        if (m37041g != null) {
            m37041g.setCallback(this);
        }
        Drawable m37041g2 = m37026v.m37041g(C7461j.SwitchCompat_track);
        this.f3204x = m37041g2;
        if (m37041g2 != null) {
            m37041g2.setCallback(this);
        }
        this.f3174G = m37026v.m37032p(C7461j.SwitchCompat_android_textOn);
        this.f3175H = m37026v.m37032p(C7461j.SwitchCompat_android_textOff);
        this.f3176I = m37026v.m37047a(C7461j.SwitchCompat_showText, true);
        this.f3170C = m37026v.m37042f(C7461j.SwitchCompat_thumbTextPadding, 0);
        this.f3171D = m37026v.m37042f(C7461j.SwitchCompat_switchMinWidth, 0);
        this.f3172E = m37026v.m37042f(C7461j.SwitchCompat_switchPadding, 0);
        this.f3173F = m37026v.m37047a(C7461j.SwitchCompat_splitTrack, false);
        ColorStateList m37045c = m37026v.m37045c(C7461j.SwitchCompat_thumbTint);
        if (m37045c != null) {
            this.f3195d = m37045c;
            this.f3199f = true;
        }
        PorterDuff.Mode m37281e = C1068a0.m37281e(m37026v.m37037k(C7461j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f3197e != m37281e) {
            this.f3197e = m37281e;
            this.f3203w = true;
        }
        if (this.f3199f || this.f3203w) {
            m37313b();
        }
        ColorStateList m37045c2 = m37026v.m37045c(C7461j.SwitchCompat_trackTint);
        if (m37045c2 != null) {
            this.f3205y = m37045c2;
            this.f3168A = true;
        }
        PorterDuff.Mode m37281e2 = C1068a0.m37281e(m37026v.m37037k(C7461j.SwitchCompat_trackTintMode, -1), null);
        if (this.f3206z != m37281e2) {
            this.f3206z = m37281e2;
            this.f3169B = true;
        }
        if (this.f3168A || this.f3169B) {
            m37312c();
        }
        int m37034n = m37026v.m37034n(C7461j.SwitchCompat_switchTextAppearance, 0);
        if (m37034n != 0) {
            m37304k(context, m37034n);
        }
        C1160v c1160v = new C1160v(this);
        this.f3201g0 = c1160v;
        c1160v.m36960m(attributeSet, i);
        m37026v.m37025w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3178K = viewConfiguration.getScaledTouchSlop();
        this.f3182O = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
