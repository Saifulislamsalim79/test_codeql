package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import p201g.p266v.AbstractC8160m;
import p201g.p266v.C8177s;
/* compiled from: TextScale.java */
/* renamed from: com.google.android.material.internal.o */
/* loaded from: classes2.dex */
public class C4692o extends AbstractC8160m {

    /* compiled from: TextScale.java */
    /* renamed from: com.google.android.material.internal.o$a */
    /* loaded from: classes2.dex */
    class C4693a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: c */
        final /* synthetic */ TextView f11775c;

        C4693a(C4692o c4692o, TextView textView) {
            this.f11775c = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f11775c.setScaleX(floatValue);
            this.f11775c.setScaleY(floatValue);
        }
    }

    /* renamed from: f0 */
    private void m26698f0(C8177s c8177s) {
        View view = c8177s.f19628b;
        if (view instanceof TextView) {
            c8177s.f19627a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: f */
    public void mo16595f(C8177s c8177s) {
        m26698f0(c8177s);
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: i */
    public void mo16591i(C8177s c8177s) {
        m26698f0(c8177s);
    }

    @Override // p201g.p266v.AbstractC8160m
    /* renamed from: n */
    public Animator mo16633n(ViewGroup viewGroup, C8177s c8177s, C8177s c8177s2) {
        if (c8177s == null || c8177s2 == null || !(c8177s.f19628b instanceof TextView)) {
            return null;
        }
        View view = c8177s2.f19628b;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Map<String, Object> map = c8177s.f19627a;
            Map<String, Object> map2 = c8177s2.f19627a;
            float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
            float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
            if (floatValue == floatValue2) {
                return null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
            ofFloat.addUpdateListener(new C4693a(this, textView));
            return ofFloat;
        }
        return null;
    }
}
