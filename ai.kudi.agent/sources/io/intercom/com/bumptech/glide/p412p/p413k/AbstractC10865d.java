package io.intercom.com.bumptech.glide.p412p.p413k;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10878d;
/* compiled from: ImageViewTarget.java */
/* renamed from: io.intercom.com.bumptech.glide.p.k.d */
/* loaded from: classes3.dex */
public abstract class AbstractC10865d<Z> extends AbstractC10870i<ImageView, Z> implements InterfaceC10878d.InterfaceC10879a {

    /* renamed from: y */
    private Animatable f24820y;

    public AbstractC10865d(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: g */
    private void m12073g(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f24820y = animatable;
            animatable.start();
            return;
        }
        this.f24820y = null;
    }

    /* renamed from: i */
    private void m12071i(Z z) {
        mo12072h(z);
        m12073g(z);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10878d.InterfaceC10879a
    /* renamed from: a */
    public void mo12047a(Drawable drawable) {
        ((ImageView) this.f24822c).setImageDrawable(drawable);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10878d.InterfaceC10879a
    /* renamed from: b */
    public Drawable mo12046b() {
        return ((ImageView) this.f24822c).getDrawable();
    }

    /* renamed from: h */
    protected abstract void mo12072h(Z z);

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10870i, io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10862a, io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f24820y;
        if (animatable != null) {
            animatable.stop();
        }
        m12071i(null);
        mo12047a(drawable);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10862a, io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        m12071i(null);
        mo12047a(drawable);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10870i, io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10862a, io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m12071i(null);
        mo12047a(drawable);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void onResourceReady(Z z, InterfaceC10878d<? super Z> interfaceC10878d) {
        if (interfaceC10878d != null && interfaceC10878d.mo12048a(z, this)) {
            m12073g(z);
        } else {
            m12071i(z);
        }
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10862a, io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onStart() {
        Animatable animatable = this.f24820y;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10862a, io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onStop() {
        Animatable animatable = this.f24820y;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
