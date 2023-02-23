package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.engine.p396y.C10582f;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import java.util.concurrent.locks.Lock;
/* compiled from: DrawableToBitmapConverter.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.l */
/* loaded from: classes3.dex */
final class C10759l {

    /* renamed from: a */
    private static final InterfaceC10581e f24593a = new C10760a();

    /* compiled from: DrawableToBitmapConverter.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.l$a */
    /* loaded from: classes3.dex */
    static class C10760a extends C10582f {
        C10760a() {
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.p396y.C10582f, io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e
        /* renamed from: c */
        public void mo12398c(Bitmap bitmap) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC10569t<Bitmap> m12400a(InterfaceC10581e interfaceC10581e, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = m12399b(interfaceC10581e, current, i, i2);
            z = true;
        }
        if (!z) {
            interfaceC10581e = f24593a;
        }
        return C10741d.m12447e(bitmap, interfaceC10581e);
    }

    /* renamed from: b */
    private static Bitmap m12399b(InterfaceC10581e interfaceC10581e, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        } else {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock m12375f = C10770t.m12375f();
            m12375f.lock();
            Bitmap bitmap = interfaceC10581e.get(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(bitmap);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return bitmap;
            } finally {
                m12375f.unlock();
            }
        }
    }
}
