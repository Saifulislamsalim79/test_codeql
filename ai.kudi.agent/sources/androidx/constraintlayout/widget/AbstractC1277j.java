package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p201g.p219f.p223b.p224k.C7570k;
/* compiled from: VirtualLayout.java */
/* renamed from: androidx.constraintlayout.widget.j */
/* loaded from: classes2.dex */
public abstract class AbstractC1277j extends AbstractC1261b {

    /* renamed from: A */
    private boolean f3995A;

    /* renamed from: B */
    private boolean f3996B;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC1261b
    /* renamed from: h */
    public void mo36568h(AttributeSet attributeSet) {
        super.mo36568h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1276i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1276i.ConstraintLayout_Layout_android_visibility) {
                    this.f3995A = true;
                } else if (index == C1276i.ConstraintLayout_Layout_android_elevation) {
                    this.f3996B = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o */
    public void m36567o(C7570k c7570k, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC1261b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f3995A || this.f3996B) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f3851d; i++) {
                View viewById = constraintLayout.getViewById(this.f3850c[i]);
                if (viewById != null) {
                    if (this.f3995A) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f3996B && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m36626d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m36626d();
    }
}
