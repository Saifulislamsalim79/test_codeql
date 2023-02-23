package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.content.Context;
import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.p416r.C10893i;
/* compiled from: BitmapTransformation.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.e */
/* loaded from: classes3.dex */
public abstract class AbstractC10742e implements InterfaceC10629l<Bitmap> {
    public AbstractC10742e() {
    }

    protected abstract Bitmap transform(InterfaceC10581e interfaceC10581e, Bitmap bitmap, int i, int i2);

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l
    public final InterfaceC10569t<Bitmap> transform(Context context, InterfaceC10569t<Bitmap> interfaceC10569t, int i, int i2) {
        if (C10893i.m11994s(i, i2)) {
            InterfaceC10581e m13031f = ComponentCallbacks2C10478c.m13034c(context).m13031f();
            Bitmap bitmap = interfaceC10569t.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap transform = transform(m13031f, bitmap, i, i2);
            return bitmap.equals(transform) ? interfaceC10569t : C10741d.m12447e(transform, m13031f);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    @Deprecated
    public AbstractC10742e(Context context) {
        this();
    }

    @Deprecated
    public AbstractC10742e(InterfaceC10581e interfaceC10581e) {
        this();
    }
}
