package p201g.p266v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p201g.p227h.p238l.C7759x;
/* compiled from: Fade.java */
/* renamed from: g.v.d */
/* loaded from: classes2.dex */
public class C8133d extends AbstractC8152j0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Fade.java */
    /* renamed from: g.v.d$a */
    /* loaded from: classes2.dex */
    public class C8134a extends C8168n {

        /* renamed from: c */
        final /* synthetic */ View f19515c;

        C8134a(C8133d c8133d, View view) {
            this.f19515c = view;
        }

        @Override // p201g.p266v.AbstractC8160m.InterfaceC8166f
        /* renamed from: c */
        public void mo16576c(AbstractC8160m abstractC8160m) {
            C8130c0.m16707g(this.f19515c, 1.0f);
            C8130c0.m16713a(this.f19515c);
            abstractC8160m.mo16608Q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Fade.java */
    /* renamed from: g.v.d$b */
    /* loaded from: classes2.dex */
    public static class C8135b extends AnimatorListenerAdapter {

        /* renamed from: c */
        private final View f19516c;

        /* renamed from: d */
        private boolean f19517d = false;

        C8135b(View view) {
            this.f19516c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8130c0.m16707g(this.f19516c, 1.0f);
            if (this.f19517d) {
                this.f19516c.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C7759x.m17539Q(this.f19516c) && this.f19516c.getLayerType() == 0) {
                this.f19517d = true;
                this.f19516c.setLayerType(2, null);
            }
        }
    }

    public C8133d(int i) {
        m16662n0(i);
    }

    /* renamed from: o0 */
    private Animator m16699o0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C8130c0.m16707g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C8130c0.f19514b, f2);
        ofFloat.addListener(new C8135b(view));
        mo16601a(new C8134a(this, view));
        return ofFloat;
    }

    /* renamed from: p0 */
    private static float m16698p0(C8177s c8177s, float f) {
        Float f2;
        return (c8177s == null || (f2 = (Float) c8177s.f19627a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // p201g.p266v.AbstractC8152j0, p201g.p266v.AbstractC8160m
    /* renamed from: i */
    public void mo16591i(C8177s c8177s) {
        super.mo16591i(c8177s);
        c8177s.f19627a.put("android:fade:transitionAlpha", Float.valueOf(C8130c0.m16711c(c8177s.f19628b)));
    }

    @Override // p201g.p266v.AbstractC8152j0
    /* renamed from: i0 */
    public Animator mo16666i0(ViewGroup viewGroup, View view, C8177s c8177s, C8177s c8177s2) {
        float m16698p0 = m16698p0(c8177s, 0.0f);
        return m16699o0(view, m16698p0 != 1.0f ? m16698p0 : 0.0f, 1.0f);
    }

    @Override // p201g.p266v.AbstractC8152j0
    /* renamed from: l0 */
    public Animator mo16664l0(ViewGroup viewGroup, View view, C8177s c8177s, C8177s c8177s2) {
        C8130c0.m16709e(view);
        return m16699o0(view, m16698p0(c8177s, 1.0f), 0.0f);
    }
}
