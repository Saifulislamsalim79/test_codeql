package io.intercom.com.bumptech.glide.load.p402o.p405e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10564p;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.p402o.p407g.C10793c;
import io.intercom.com.bumptech.glide.p416r.C10892h;
/* compiled from: DrawableResource.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.e.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10782b<T extends Drawable> implements InterfaceC10569t<T>, InterfaceC10564p {

    /* renamed from: c */
    protected final T f24630c;

    public AbstractC10782b(T t) {
        C10892h.m12014d(t);
        this.f24630c = t;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10564p
    /* renamed from: a */
    public void mo12304a() {
        T t = this.f24630c;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C10793c) {
            ((C10793c) t).m12317e().prepareToDraw();
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: d */
    public final T get() {
        Drawable.ConstantState constantState = this.f24630c.getConstantState();
        if (constantState == null) {
            return this.f24630c;
        }
        return (T) constantState.newDrawable();
    }
}
