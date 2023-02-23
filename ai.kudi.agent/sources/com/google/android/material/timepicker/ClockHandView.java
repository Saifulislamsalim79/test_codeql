package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClockHandView extends View {

    /* renamed from: A */
    private final float f12183A;

    /* renamed from: B */
    private final Paint f12184B;

    /* renamed from: C */
    private final RectF f12185C;

    /* renamed from: D */
    private final int f12186D;

    /* renamed from: E */
    private float f12187E;

    /* renamed from: F */
    private boolean f12188F;

    /* renamed from: G */
    private InterfaceC4811c f12189G;

    /* renamed from: H */
    private double f12190H;

    /* renamed from: I */
    private int f12191I;

    /* renamed from: c */
    private ValueAnimator f12192c;

    /* renamed from: d */
    private boolean f12193d;

    /* renamed from: e */
    private float f12194e;

    /* renamed from: f */
    private float f12195f;

    /* renamed from: w */
    private boolean f12196w;

    /* renamed from: x */
    private int f12197x;

    /* renamed from: y */
    private final List<InterfaceC4812d> f12198y;

    /* renamed from: z */
    private final int f12199z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    /* loaded from: classes2.dex */
    public class C4809a implements ValueAnimator.AnimatorUpdateListener {
        C4809a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m26234m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    /* loaded from: classes2.dex */
    public class C4810b extends AnimatorListenerAdapter {
        C4810b(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4811c {
        /* renamed from: a */
        void m26233a(float f, boolean z);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC4812d {
        /* renamed from: a */
        void mo26232a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.materialClockStyle);
    }

    /* renamed from: c */
    private void m26244c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.f12184B.setStrokeWidth(0.0f);
        canvas.drawCircle((this.f12191I * ((float) Math.cos(this.f12190H))) + width2, (this.f12191I * ((float) Math.sin(this.f12190H))) + f, this.f12199z, this.f12184B);
        double sin = Math.sin(this.f12190H);
        double cos = Math.cos(this.f12190H);
        Double.isNaN(r6);
        Double.isNaN(r6);
        this.f12184B.setStrokeWidth(this.f12186D);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f12184B);
        canvas.drawCircle(width2, f, this.f12183A, this.f12184B);
    }

    /* renamed from: e */
    private int m26242e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: h */
    private Pair<Float, Float> m26239h(float f) {
        float m26241f = m26241f();
        if (Math.abs(m26241f - f) > 180.0f) {
            if (m26241f > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (m26241f < 180.0f && f > 180.0f) {
                m26241f += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(m26241f), Float.valueOf(f));
    }

    /* renamed from: i */
    private boolean m26238i(float f, float f2, boolean z, boolean z2, boolean z3) {
        float m26242e = m26242e(f, f2);
        boolean z4 = false;
        boolean z5 = m26241f() != m26242e;
        if (z2 && z5) {
            return true;
        }
        if (z5 || z) {
            if (z3 && this.f12193d) {
                z4 = true;
            }
            m26235l(m26242e, z4);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m26234m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f12187E = f2;
        this.f12190H = Math.toRadians(f2 - 90.0f);
        float width = (getWidth() / 2) + (this.f12191I * ((float) Math.cos(this.f12190H)));
        float height = (getHeight() / 2) + (this.f12191I * ((float) Math.sin(this.f12190H)));
        RectF rectF = this.f12185C;
        int i = this.f12199z;
        rectF.set(width - i, height - i, width + i, height + i);
        for (InterfaceC4812d interfaceC4812d : this.f12198y) {
            interfaceC4812d.mo26232a(f2, z);
        }
        invalidate();
    }

    /* renamed from: b */
    public void m26245b(InterfaceC4812d interfaceC4812d) {
        this.f12198y.add(interfaceC4812d);
    }

    /* renamed from: d */
    public RectF m26243d() {
        return this.f12185C;
    }

    /* renamed from: f */
    public float m26241f() {
        return this.f12187E;
    }

    /* renamed from: g */
    public int m26240g() {
        return this.f12199z;
    }

    /* renamed from: j */
    public void m26237j(int i) {
        this.f12191I = i;
        invalidate();
    }

    /* renamed from: k */
    public void m26236k(float f) {
        m26235l(f, false);
    }

    /* renamed from: l */
    public void m26235l(float f, boolean z) {
        ValueAnimator valueAnimator = this.f12192c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m26234m(f, false);
            return;
        }
        Pair<Float, Float> m26239h = m26239h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) m26239h.first).floatValue(), ((Float) m26239h.second).floatValue());
        this.f12192c = ofFloat;
        ofFloat.setDuration(200L);
        this.f12192c.addUpdateListener(new C4809a());
        this.f12192c.addListener(new C4810b(this));
        this.f12192c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m26244c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m26236k(m26241f());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC4811c interfaceC4811c;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.f12194e);
                int i2 = (int) (y - this.f12195f);
                this.f12196w = (i * i) + (i2 * i2) > this.f12197x;
                boolean z4 = this.f12188F;
                z = actionMasked == 1;
                z2 = z4;
            } else {
                z = false;
                z2 = false;
            }
            z3 = false;
        } else {
            this.f12194e = x;
            this.f12195f = y;
            this.f12196w = true;
            this.f12188F = false;
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean m26238i = m26238i(x, y, z2, z3, z) | this.f12188F;
        this.f12188F = m26238i;
        if (m26238i && z && (interfaceC4811c = this.f12189G) != null) {
            interfaceC4811c.m26233a(m26242e(x, y), this.f12196w);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12198y = new ArrayList();
        this.f12184B = new Paint();
        this.f12185C = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.ClockHandView, i, C9276k.Widget_MaterialComponents_TimePicker_Clock);
        this.f12191I = obtainStyledAttributes.getDimensionPixelSize(C9277l.ClockHandView_materialCircleRadius, 0);
        this.f12199z = obtainStyledAttributes.getDimensionPixelSize(C9277l.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f12186D = resources.getDimensionPixelSize(C9267d.material_clock_hand_stroke_width);
        this.f12183A = resources.getDimensionPixelSize(C9267d.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(C9277l.ClockHandView_clockHandColor, 0);
        this.f12184B.setAntiAlias(true);
        this.f12184B.setColor(color);
        m26236k(0.0f);
        this.f12197x = ViewConfiguration.get(context).getScaledTouchSlop();
        C7759x.m17478z0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
