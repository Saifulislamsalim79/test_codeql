package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.C2101f;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import java.util.concurrent.locks.Lock;
/* compiled from: DrawableToBitmapConverter.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.j */
/* loaded from: classes2.dex */
final class C2304j {

    /* renamed from: a */
    private static final InterfaceC2100e f6698a = new C2305a();

    /* compiled from: DrawableToBitmapConverter.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.j$a */
    /* loaded from: classes2.dex */
    class C2305a extends C2101f {
        C2305a() {
        }

        @Override // com.bumptech.glide.load.engine.p069z.C2101f, com.bumptech.glide.load.engine.p069z.InterfaceC2100e
        /* renamed from: c */
        public void mo33347c(Bitmap bitmap) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC2087u<Bitmap> m33349a(InterfaceC2100e interfaceC2100e, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = m33348b(interfaceC2100e, current, i, i2);
            z = true;
        }
        if (!z) {
            interfaceC2100e = f6698a;
        }
        return C2293e.m33382e(bitmap, interfaceC2100e);
    }

    /* renamed from: b */
    private static Bitmap m33348b(InterfaceC2100e interfaceC2100e, Drawable drawable, int i, int i2) {
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
            Lock m33312c = C2320u.m33312c();
            m33312c.lock();
            Bitmap bitmap = interfaceC2100e.get(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(bitmap);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return bitmap;
            } finally {
                m33312c.unlock();
            }
        }
    }
}
