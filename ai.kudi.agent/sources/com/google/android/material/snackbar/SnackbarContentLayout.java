package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p335s.C9310a;
/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC4732a {

    /* renamed from: c */
    private TextView f11858c;

    /* renamed from: d */
    private Button f11859d;

    /* renamed from: e */
    private int f11860e;

    /* renamed from: f */
    private int f11861f;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.SnackbarLayout);
        this.f11860e = obtainStyledAttributes.getDimensionPixelSize(C9277l.SnackbarLayout_android_maxWidth, -1);
        this.f11861f = obtainStyledAttributes.getDimensionPixelSize(C9277l.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private static void m26597d(View view, int i, int i2) {
        if (C7759x.m17533W(view)) {
            C7759x.m17560D0(view, C7759x.m17551I(view), i, C7759x.m17553H(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: e */
    private boolean m26596e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f11858c.getPaddingTop() == i2 && this.f11858c.getPaddingBottom() == i3) {
            return z;
        }
        m26597d(this.f11858c, i2, i3);
        return true;
    }

    @Override // com.google.android.material.snackbar.InterfaceC4732a
    /* renamed from: a */
    public void mo26595a(int i, int i2) {
        this.f11858c.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.f11858c.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f11859d.getVisibility() == 0) {
            this.f11859d.setAlpha(0.0f);
            this.f11859d.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.InterfaceC4732a
    /* renamed from: b */
    public void mo26594b(int i, int i2) {
        this.f11858c.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.f11858c.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f11859d.getVisibility() == 0) {
            this.f11859d.setAlpha(1.0f);
            this.f11859d.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m26598c(float f) {
        if (f != 1.0f) {
            this.f11859d.setTextColor(C9310a.m15079f(C9310a.m15082c(this, C9233b.colorSurface), this.f11859d.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.f11859d;
    }

    public TextView getMessageView() {
        return this.f11858c;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f11858c = (TextView) findViewById(C9271f.snackbar_text);
        this.f11859d = (Button) findViewById(C9271f.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (m26596e(1, r0, r0 - r1) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (m26596e(0, r0, r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f11860e
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f11860e
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p272h.p286c.p287a.p323c.C9267d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p272h.p286c.p287a.p323c.C9267d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f11858c
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f11861f
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f11859d
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f11861f
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.m26596e(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.m26596e(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f11861f = i;
    }
}
