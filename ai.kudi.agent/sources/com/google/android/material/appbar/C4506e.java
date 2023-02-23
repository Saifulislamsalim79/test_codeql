package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C4695q;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9272g;
/* compiled from: ViewUtilsLollipop.java */
/* renamed from: com.google.android.material.appbar.e */
/* loaded from: classes2.dex */
class C4506e {

    /* renamed from: a */
    private static final int[] f11026a = {16843848};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27602a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m27601b(View view, float f) {
        int integer = view.getResources().getInteger(C9272g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842766, C9233b.state_liftable, -C9233b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m27600c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray m26690h = C4695q.m26690h(context, attributeSet, f11026a, i, i2, new int[0]);
        try {
            if (m26690h.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, m26690h.getResourceId(0, 0)));
            }
        } finally {
            m26690h.recycle();
        }
    }
}
