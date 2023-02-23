package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9236c;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9273h;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* loaded from: classes2.dex */
class ClockFaceView extends C4820a implements ClockHandView.InterfaceC4812d {

    /* renamed from: A */
    private final int[] f12170A;

    /* renamed from: B */
    private final float[] f12171B;

    /* renamed from: C */
    private final int f12172C;

    /* renamed from: D */
    private String[] f12173D;

    /* renamed from: E */
    private float f12174E;

    /* renamed from: F */
    private final ColorStateList f12175F;

    /* renamed from: f */
    private final ClockHandView f12176f;

    /* renamed from: w */
    private final Rect f12177w;

    /* renamed from: x */
    private final RectF f12178x;

    /* renamed from: y */
    private final SparseArray<TextView> f12179y;

    /* renamed from: z */
    private final C7676a f12180z;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    /* loaded from: classes2.dex */
    class ViewTreeObserver$OnPreDrawListenerC4807a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC4807a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (ClockFaceView.this.isShown()) {
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.mo26219d(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f12176f.m26240g()) - ClockFaceView.this.f12172C);
                return true;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    /* loaded from: classes2.dex */
    class C4808b extends C7676a {
        C4808b() {
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            int intValue = ((Integer) view.getTag(C9271f.material_value_index)).intValue();
            if (intValue > 0) {
                c7716c.m17722B0((View) ClockFaceView.this.f12179y.get(intValue - 1));
            }
            c7716c.m17687d0(C7716c.C7719c.m17636a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.materialClockStyle);
    }

    /* renamed from: k */
    private void m26250k() {
        RectF m26243d = this.f12176f.m26243d();
        for (int i = 0; i < this.f12179y.size(); i++) {
            TextView textView = this.f12179y.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f12177w);
                this.f12177w.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f12177w);
                this.f12178x.set(this.f12177w);
                textView.getPaint().setShader(m26249l(m26243d, this.f12178x));
                textView.invalidate();
            }
        }
    }

    /* renamed from: l */
    private RadialGradient m26249l(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.f12178x.left, rectF.centerY() - this.f12178x.top, rectF.width() * 0.5f, this.f12170A, this.f12171B, Shader.TileMode.CLAMP);
        }
        return null;
    }

    /* renamed from: n */
    private void m26247n(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f12179y.size();
        for (int i2 = 0; i2 < Math.max(this.f12173D.length, size); i2++) {
            TextView textView = this.f12179y.get(i2);
            if (i2 >= this.f12173D.length) {
                removeView(textView);
                this.f12179y.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C9273h.material_clockface_textview, (ViewGroup) this, false);
                    this.f12179y.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f12173D[i2]);
                textView.setTag(C9271f.material_value_index, Integer.valueOf(i2));
                C7759x.m17498p0(textView, this.f12180z);
                textView.setTextColor(this.f12175F);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.f12173D[i2]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC4812d
    /* renamed from: a */
    public void mo26232a(float f, boolean z) {
        if (Math.abs(this.f12174E - f) > 0.001f) {
            this.f12174E = f;
            m26250k();
        }
    }

    @Override // com.google.android.material.timepicker.C4820a
    /* renamed from: d */
    public void mo26219d(int i) {
        if (i != m26220c()) {
            super.mo26219d(i);
            this.f12176f.m26237j(m26220c());
        }
    }

    /* renamed from: m */
    public void m26248m(String[] strArr, int i) {
        this.f12173D = strArr;
        m26247n(i);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C7716c.m17716E0(accessibilityNodeInfo).m17689c0(C7716c.C7718b.m17637b(1, this.f12173D.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m26250k();
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12177w = new Rect();
        this.f12178x = new RectF();
        this.f12179y = new SparseArray<>();
        this.f12171B = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.ClockFaceView, i, C9276k.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        this.f12175F = C9321c.m15053a(context, obtainStyledAttributes, C9277l.ClockFaceView_clockNumberTextColor);
        LayoutInflater.from(context).inflate(C9273h.material_clockface_view, (ViewGroup) this, true);
        this.f12176f = (ClockHandView) findViewById(C9271f.material_clock_hand);
        this.f12172C = resources.getDimensionPixelSize(C9267d.material_clock_hand_padding);
        ColorStateList colorStateList = this.f12175F;
        int colorForState = colorStateList.getColorForState(new int[]{16842913}, colorStateList.getDefaultColor());
        this.f12170A = new int[]{colorForState, colorForState, this.f12175F.getDefaultColor()};
        this.f12176f.m26245b(this);
        int defaultColor = C7462a.m18691c(context, C9236c.material_timepicker_clockface).getDefaultColor();
        ColorStateList m15053a = C9321c.m15053a(context, obtainStyledAttributes, C9277l.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(m15053a != null ? m15053a.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC4807a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f12180z = new C4808b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m26248m(strArr, 0);
    }
}
