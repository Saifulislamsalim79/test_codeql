package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: Constraints.java */
/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes2.dex */
public class C1271e extends ViewGroup {

    /* renamed from: c */
    C1265d f3976c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public C1272a generateDefaultLayoutParams() {
        return new C1272a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public C1272a generateLayoutParams(AttributeSet attributeSet) {
        return new C1272a(getContext(), attributeSet);
    }

    public C1265d getConstraintSet() {
        if (this.f3976c == null) {
            this.f3976c = new C1265d();
        }
        this.f3976c.m36602h(this);
        return this.f3976c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C1255b(layoutParams);
    }

    /* compiled from: Constraints.java */
    /* renamed from: androidx.constraintlayout.widget.e$a */
    /* loaded from: classes2.dex */
    public static class C1272a extends ConstraintLayout.C1255b {

        /* renamed from: A0 */
        public float f3977A0;

        /* renamed from: o0 */
        public float f3978o0;

        /* renamed from: p0 */
        public boolean f3979p0;

        /* renamed from: q0 */
        public float f3980q0;

        /* renamed from: r0 */
        public float f3981r0;

        /* renamed from: s0 */
        public float f3982s0;

        /* renamed from: t0 */
        public float f3983t0;

        /* renamed from: u0 */
        public float f3984u0;

        /* renamed from: v0 */
        public float f3985v0;

        /* renamed from: w0 */
        public float f3986w0;

        /* renamed from: x0 */
        public float f3987x0;

        /* renamed from: y0 */
        public float f3988y0;

        /* renamed from: z0 */
        public float f3989z0;

        public C1272a(int i, int i2) {
            super(i, i2);
            this.f3978o0 = 1.0f;
            this.f3979p0 = false;
            this.f3980q0 = 0.0f;
            this.f3981r0 = 0.0f;
            this.f3982s0 = 0.0f;
            this.f3983t0 = 0.0f;
            this.f3984u0 = 1.0f;
            this.f3985v0 = 1.0f;
            this.f3986w0 = 0.0f;
            this.f3987x0 = 0.0f;
            this.f3988y0 = 0.0f;
            this.f3989z0 = 0.0f;
            this.f3977A0 = 0.0f;
        }

        public C1272a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3978o0 = 1.0f;
            this.f3979p0 = false;
            this.f3980q0 = 0.0f;
            this.f3981r0 = 0.0f;
            this.f3982s0 = 0.0f;
            this.f3983t0 = 0.0f;
            this.f3984u0 = 1.0f;
            this.f3985v0 = 1.0f;
            this.f3986w0 = 0.0f;
            this.f3987x0 = 0.0f;
            this.f3988y0 = 0.0f;
            this.f3989z0 = 0.0f;
            this.f3977A0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1276i.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1276i.ConstraintSet_android_alpha) {
                    this.f3978o0 = obtainStyledAttributes.getFloat(index, this.f3978o0);
                } else if (index == C1276i.ConstraintSet_android_elevation) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f3980q0 = obtainStyledAttributes.getFloat(index, this.f3980q0);
                        this.f3979p0 = true;
                    }
                } else if (index == C1276i.ConstraintSet_android_rotationX) {
                    this.f3982s0 = obtainStyledAttributes.getFloat(index, this.f3982s0);
                } else if (index == C1276i.ConstraintSet_android_rotationY) {
                    this.f3983t0 = obtainStyledAttributes.getFloat(index, this.f3983t0);
                } else if (index == C1276i.ConstraintSet_android_rotation) {
                    this.f3981r0 = obtainStyledAttributes.getFloat(index, this.f3981r0);
                } else if (index == C1276i.ConstraintSet_android_scaleX) {
                    this.f3984u0 = obtainStyledAttributes.getFloat(index, this.f3984u0);
                } else if (index == C1276i.ConstraintSet_android_scaleY) {
                    this.f3985v0 = obtainStyledAttributes.getFloat(index, this.f3985v0);
                } else if (index == C1276i.ConstraintSet_android_transformPivotX) {
                    this.f3986w0 = obtainStyledAttributes.getFloat(index, this.f3986w0);
                } else if (index == C1276i.ConstraintSet_android_transformPivotY) {
                    this.f3987x0 = obtainStyledAttributes.getFloat(index, this.f3987x0);
                } else if (index == C1276i.ConstraintSet_android_translationX) {
                    this.f3988y0 = obtainStyledAttributes.getFloat(index, this.f3988y0);
                } else if (index == C1276i.ConstraintSet_android_translationY) {
                    this.f3989z0 = obtainStyledAttributes.getFloat(index, this.f3989z0);
                } else if (index == C1276i.ConstraintSet_android_translationZ && Build.VERSION.SDK_INT >= 21) {
                    this.f3977A0 = obtainStyledAttributes.getFloat(index, this.f3977A0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
