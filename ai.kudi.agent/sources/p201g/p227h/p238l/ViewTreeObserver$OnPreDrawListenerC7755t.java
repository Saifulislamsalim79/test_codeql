package p201g.p227h.p238l;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: OneShotPreDrawListener.java */
/* renamed from: g.h.l.t */
/* loaded from: classes2.dex */
public final class ViewTreeObserver$OnPreDrawListenerC7755t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c */
    private final View f18508c;

    /* renamed from: d */
    private ViewTreeObserver f18509d;

    /* renamed from: e */
    private final Runnable f18510e;

    private ViewTreeObserver$OnPreDrawListenerC7755t(View view, Runnable runnable) {
        this.f18508c = view;
        this.f18509d = view.getViewTreeObserver();
        this.f18510e = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserver$OnPreDrawListenerC7755t m17571a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                ViewTreeObserver$OnPreDrawListenerC7755t viewTreeObserver$OnPreDrawListenerC7755t = new ViewTreeObserver$OnPreDrawListenerC7755t(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC7755t);
                view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC7755t);
                return viewTreeObserver$OnPreDrawListenerC7755t;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    /* renamed from: b */
    public void m17570b() {
        if (this.f18509d.isAlive()) {
            this.f18509d.removeOnPreDrawListener(this);
        } else {
            this.f18508c.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f18508c.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m17570b();
        this.f18510e.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f18509d = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m17570b();
    }
}
