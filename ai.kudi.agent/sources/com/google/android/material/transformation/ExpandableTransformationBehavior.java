package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    private AnimatorSet f12225b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    /* loaded from: classes2.dex */
    class C4825a extends AnimatorListenerAdapter {
        C4825a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f12225b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo26178H(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f12225b != null;
        if (z3) {
            this.f12225b.cancel();
        }
        AnimatorSet mo26181J = mo26181J(view, view2, z, z3);
        this.f12225b = mo26181J;
        mo26181J.addListener(new C4825a());
        this.f12225b.start();
        if (!z2) {
            this.f12225b.end();
        }
        return true;
    }

    /* renamed from: J */
    protected abstract AnimatorSet mo26181J(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
