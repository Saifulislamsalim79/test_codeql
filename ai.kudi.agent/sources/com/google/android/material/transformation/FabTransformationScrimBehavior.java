package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p272h.p286c.p287a.p323c.p328m.C9279b;
import p272h.p286c.p287a.p323c.p328m.C9286i;
@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C9286i f12242c;

    /* renamed from: d */
    private final C9286i f12243d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: classes2.dex */
    class C4831a extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ boolean f12244c;

        /* renamed from: d */
        final /* synthetic */ View f12245d;

        C4831a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f12244c = z;
            this.f12245d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f12244c) {
                return;
            }
            this.f12245d.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f12244c) {
                this.f12245d.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f12242c = new C9286i(75L, 150L);
        this.f12243d = new C9286i(0L, 150L);
    }

    /* renamed from: K */
    private void m26180K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        C9286i c9286i = z ? this.f12242c : this.f12243d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        c9286i.m15216a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: D */
    public boolean mo26182D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo26182D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo26181J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m26180K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C9279b.m15235a(animatorSet, arrayList);
        animatorSet.addListener(new C4831a(this, z, view2));
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: e */
    public boolean mo26179e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12242c = new C9286i(75L, 150L);
        this.f12243d = new C9286i(0L, 150L);
    }
}
