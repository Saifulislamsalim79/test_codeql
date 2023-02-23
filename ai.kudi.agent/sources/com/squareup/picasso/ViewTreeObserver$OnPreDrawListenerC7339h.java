package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeferredRequestCreator.java */
/* renamed from: com.squareup.picasso.h */
/* loaded from: classes2.dex */
public class ViewTreeObserver$OnPreDrawListenerC7339h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c */
    private final C7376x f17374c;

    /* renamed from: d */
    final WeakReference<ImageView> f17375d;

    /* renamed from: e */
    InterfaceC7336e f17376e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserver$OnPreDrawListenerC7339h(C7376x c7376x, ImageView imageView, InterfaceC7336e interfaceC7336e) {
        this.f17374c = c7376x;
        this.f17375d = new WeakReference<>(imageView);
        this.f17376e = interfaceC7336e;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m18934a() {
        this.f17374c.m18851a();
        this.f17376e = null;
        ImageView imageView = this.f17375d.get();
        if (imageView == null) {
            return;
        }
        this.f17375d.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f17375d.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width > 0 && height > 0) {
                imageView.removeOnAttachStateChangeListener(this);
                viewTreeObserver.removeOnPreDrawListener(this);
                this.f17375d.clear();
                C7376x c7376x = this.f17374c;
                c7376x.m18842j();
                c7376x.m18844h(width, height);
                c7376x.m18846f(imageView, this.f17376e);
            }
            return true;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
