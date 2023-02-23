package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p201g.p217d.C7516a;
import p201g.p217d.C7517b;
import p201g.p217d.C7519d;
import p201g.p217d.C7520e;
/* loaded from: classes2.dex */
public class CardView extends FrameLayout {

    /* renamed from: A */
    private static final InterfaceC1250e f3713A;

    /* renamed from: z */
    private static final int[] f3714z = {16842801};

    /* renamed from: c */
    private boolean f3715c;

    /* renamed from: d */
    private boolean f3716d;

    /* renamed from: e */
    int f3717e;

    /* renamed from: f */
    int f3718f;

    /* renamed from: w */
    final Rect f3719w;

    /* renamed from: x */
    final Rect f3720x;

    /* renamed from: y */
    private final InterfaceC1249d f3721y;

    /* renamed from: androidx.cardview.widget.CardView$a */
    /* loaded from: classes2.dex */
    class C1243a implements InterfaceC1249d {

        /* renamed from: a */
        private Drawable f3722a;

        C1243a() {
        }

        @Override // androidx.cardview.widget.InterfaceC1249d
        /* renamed from: b */
        public void mo36689b(int i, int i2, int i3, int i4) {
            CardView.this.f3720x.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f3719w;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // androidx.cardview.widget.InterfaceC1249d
        /* renamed from: c */
        public void mo36688c(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f3717e) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f3718f) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        @Override // androidx.cardview.widget.InterfaceC1249d
        /* renamed from: d */
        public void mo36687d(Drawable drawable) {
            this.f3722a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.InterfaceC1249d
        /* renamed from: e */
        public boolean mo36686e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.InterfaceC1249d
        /* renamed from: f */
        public boolean mo36685f() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.InterfaceC1249d
        /* renamed from: g */
        public Drawable mo36684g() {
            return this.f3722a;
        }

        @Override // androidx.cardview.widget.InterfaceC1249d
        /* renamed from: h */
        public View mo36683h() {
            return CardView.this;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f3713A = new C1246b();
        } else if (i >= 17) {
            f3713A = new C1244a();
        } else {
            f3713A = new C1247c();
        }
        f3713A.mo36674i();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7516a.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return f3713A.mo36675h(this.f3721y);
    }

    public float getCardElevation() {
        return f3713A.mo36680c(this.f3721y);
    }

    public int getContentPaddingBottom() {
        return this.f3719w.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f3719w.left;
    }

    public int getContentPaddingRight() {
        return this.f3719w.right;
    }

    public int getContentPaddingTop() {
        return this.f3719w.top;
    }

    public float getMaxCardElevation() {
        return f3713A.mo36676g(this.f3721y);
    }

    public boolean getPreventCornerOverlap() {
        return this.f3716d;
    }

    public float getRadius() {
        return f3713A.mo36679d(this.f3721y);
    }

    public boolean getUseCompatPadding() {
        return this.f3715c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!(f3713A instanceof C1246b)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f3713A.mo36672k(this.f3721y)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f3713A.mo36673j(this.f3721y)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f3713A.mo36670m(this.f3721y, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f3713A.mo36677f(this.f3721y, f);
    }

    public void setMaxCardElevation(float f) {
        f3713A.mo36669n(this.f3721y, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f3718f = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f3717e = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f3716d) {
            this.f3716d = z;
            f3713A.mo36671l(this.f3721y);
        }
    }

    public void setRadius(float f) {
        f3713A.mo36681b(this.f3721y, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f3715c != z) {
            this.f3715c = z;
            f3713A.mo36678e(this.f3721y);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        this.f3719w = new Rect();
        this.f3720x = new Rect();
        this.f3721y = new C1243a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7520e.CardView, i, C7519d.CardView);
        if (obtainStyledAttributes.hasValue(C7520e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(C7520e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f3714z);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(C7517b.cardview_light_background);
            } else {
                color = getResources().getColor(C7517b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C7520e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C7520e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C7520e.CardView_cardMaxElevation, 0.0f);
        this.f3715c = obtainStyledAttributes.getBoolean(C7520e.CardView_cardUseCompatPadding, false);
        this.f3716d = obtainStyledAttributes.getBoolean(C7520e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7520e.CardView_contentPadding, 0);
        this.f3719w.left = obtainStyledAttributes.getDimensionPixelSize(C7520e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f3719w.top = obtainStyledAttributes.getDimensionPixelSize(C7520e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f3719w.right = obtainStyledAttributes.getDimensionPixelSize(C7520e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f3719w.bottom = obtainStyledAttributes.getDimensionPixelSize(C7520e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f3717e = obtainStyledAttributes.getDimensionPixelSize(C7520e.CardView_android_minWidth, 0);
        this.f3718f = obtainStyledAttributes.getDimensionPixelSize(C7520e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f3713A.mo36682a(this.f3721y, context, colorStateList, dimension, dimension2, f);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f3713A.mo36670m(this.f3721y, colorStateList);
    }
}
