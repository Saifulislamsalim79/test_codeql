package p201g.p227h.p238l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* compiled from: ViewPropertyAnimatorCompat.java */
/* renamed from: g.h.l.c0 */
/* loaded from: classes2.dex */
public final class C7687c0 {

    /* renamed from: a */
    private WeakReference<View> f18416a;

    /* renamed from: b */
    Runnable f18417b = null;

    /* renamed from: c */
    Runnable f18418c = null;

    /* renamed from: d */
    int f18419d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: g.h.l.c0$a */
    /* loaded from: classes2.dex */
    public class C7688a extends AnimatorListenerAdapter {

        /* renamed from: c */
        final /* synthetic */ InterfaceC7692d0 f18420c;

        /* renamed from: d */
        final /* synthetic */ View f18421d;

        C7688a(C7687c0 c7687c0, InterfaceC7692d0 interfaceC7692d0, View view) {
            this.f18420c = interfaceC7692d0;
            this.f18421d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f18420c.mo17804a(this.f18421d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18420c.mo17807b(this.f18421d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f18420c.mo17803c(this.f18421d);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: g.h.l.c0$b */
    /* loaded from: classes2.dex */
    class C7689b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: c */
        final /* synthetic */ InterfaceC7696f0 f18422c;

        /* renamed from: d */
        final /* synthetic */ View f18423d;

        C7689b(C7687c0 c7687c0, InterfaceC7696f0 interfaceC7696f0, View view) {
            this.f18422c = interfaceC7696f0;
            this.f18423d = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f18422c.mo17796a(this.f18423d);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* renamed from: g.h.l.c0$c */
    /* loaded from: classes2.dex */
    static class C7690c implements InterfaceC7692d0 {

        /* renamed from: a */
        C7687c0 f18424a;

        /* renamed from: b */
        boolean f18425b;

        C7690c(C7687c0 c7687c0) {
            this.f18424a = c7687c0;
        }

        @Override // p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: a */
        public void mo17804a(View view) {
            Object tag = view.getTag(2113929216);
            InterfaceC7692d0 interfaceC7692d0 = tag instanceof InterfaceC7692d0 ? (InterfaceC7692d0) tag : null;
            if (interfaceC7692d0 != null) {
                interfaceC7692d0.mo17804a(view);
            }
        }

        @Override // p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: b */
        public void mo17807b(View view) {
            int i = this.f18424a.f18419d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f18424a.f18419d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f18425b) {
                C7687c0 c7687c0 = this.f18424a;
                Runnable runnable = c7687c0.f18418c;
                if (runnable != null) {
                    c7687c0.f18418c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                InterfaceC7692d0 interfaceC7692d0 = tag instanceof InterfaceC7692d0 ? (InterfaceC7692d0) tag : null;
                if (interfaceC7692d0 != null) {
                    interfaceC7692d0.mo17807b(view);
                }
                this.f18425b = true;
            }
        }

        @Override // p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: c */
        public void mo17803c(View view) {
            this.f18425b = false;
            if (this.f18424a.f18419d > -1) {
                view.setLayerType(2, null);
            }
            C7687c0 c7687c0 = this.f18424a;
            Runnable runnable = c7687c0.f18417b;
            if (runnable != null) {
                c7687c0.f18417b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            InterfaceC7692d0 interfaceC7692d0 = tag instanceof InterfaceC7692d0 ? (InterfaceC7692d0) tag : null;
            if (interfaceC7692d0 != null) {
                interfaceC7692d0.mo17803c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7687c0(View view) {
        this.f18416a = new WeakReference<>(view);
    }

    /* renamed from: g */
    private void m17817g(View view, InterfaceC7692d0 interfaceC7692d0) {
        if (interfaceC7692d0 != null) {
            view.animate().setListener(new C7688a(this, interfaceC7692d0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C7687c0 m17823a(float f) {
        View view = this.f18416a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void m17822b() {
        View view = this.f18416a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long m17821c() {
        View view = this.f18416a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: d */
    public C7687c0 m17820d(long j) {
        View view = this.f18416a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: e */
    public C7687c0 m17819e(Interpolator interpolator) {
        View view = this.f18416a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: f */
    public C7687c0 m17818f(InterfaceC7692d0 interfaceC7692d0) {
        View view = this.f18416a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m17817g(view, interfaceC7692d0);
            } else {
                view.setTag(2113929216, interfaceC7692d0);
                m17817g(view, new C7690c(this));
            }
        }
        return this;
    }

    /* renamed from: h */
    public C7687c0 m17816h(long j) {
        View view = this.f18416a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: i */
    public C7687c0 m17815i(InterfaceC7696f0 interfaceC7696f0) {
        View view = this.f18416a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(interfaceC7696f0 != null ? new C7689b(this, interfaceC7696f0, view) : null);
        }
        return this;
    }

    /* renamed from: j */
    public void m17814j() {
        View view = this.f18416a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: k */
    public C7687c0 m17813k(float f) {
        View view = this.f18416a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
