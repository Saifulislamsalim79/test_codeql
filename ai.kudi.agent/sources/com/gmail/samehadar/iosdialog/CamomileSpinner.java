package com.gmail.samehadar.iosdialog;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.gmail.samehadar.iosdialog.p095c.C2580a;
/* loaded from: classes2.dex */
public class CamomileSpinner extends AppCompatImageView {

    /* renamed from: f */
    public static final int f7208f;

    /* renamed from: c */
    private int f7209c;

    /* renamed from: d */
    private int f7210d;

    /* renamed from: e */
    private boolean f7211e;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f7208f = Resources.getSystem().getColor(17170443, null);
        } else {
            f7208f = Resources.getSystem().getColor(17170443);
        }
    }

    public CamomileSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7211e = true;
        m32590d(context, attributeSet);
    }

    /* renamed from: c */
    private AnimationDrawable m32591c(Context context, int i, int i2, boolean z) {
        if (i == f7208f && i2 == 60 && z) {
            return C2580a.m32585a(context);
        }
        return C2580a.m32584b(context, i, i2, z);
    }

    /* renamed from: d */
    private void m32590d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2579b.CamomileSpinner, 0, 0);
        try {
            this.f7210d = obtainStyledAttributes.getInteger(C2579b.CamomileSpinner_duration, 60);
            this.f7209c = obtainStyledAttributes.getColor(C2579b.CamomileSpinner_spinnerColor, f7208f);
            boolean z = obtainStyledAttributes.getBoolean(C2579b.CamomileSpinner_clockwise, true);
            this.f7211e = z;
            m32586h(m32591c(context, this.f7209c, this.f7210d, z));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: h */
    private void m32586h(AnimationDrawable animationDrawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(animationDrawable);
        } else {
            setBackgroundDrawable(animationDrawable);
        }
    }

    /* renamed from: e */
    public void m32589e(Context context, int i, int i2, boolean z) {
        boolean z2;
        if (((AnimationDrawable) getBackground()).isRunning()) {
            z2 = true;
            m32587g();
        } else {
            z2 = false;
        }
        AnimationDrawable m32591c = m32591c(context, i, i2, z);
        if (m32591c != null) {
            this.f7209c = i;
            this.f7210d = i2;
            this.f7211e = z;
            m32586h(m32591c);
        }
        if (z2) {
            m32588f();
        }
    }

    /* renamed from: f */
    public void m32588f() {
        ((AnimationDrawable) getBackground()).start();
    }

    /* renamed from: g */
    public void m32587g() {
        ((AnimationDrawable) getBackground()).stop();
    }
}
