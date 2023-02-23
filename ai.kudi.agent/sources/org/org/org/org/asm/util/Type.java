package org.org.org.org.asm.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.C1365a;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.ClassWriter;
/* loaded from: classes.dex */
public final class Type {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final ColorFilter m1046a(Drawable drawable) {
        Log_OC.getArray(drawable, "$this$getColorFilterCompat");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 21) {
            ColorFilter $r2 = drawable.getColorFilter();
            if ($r2 != null) {
                ColorFilter $r22 = drawable.getColorFilter();
                return $r22;
            }
        }
        ClassWriter $r3 = ClassWriter.f32305c;
        try {
            Object $r4 = $r3.get("mTintFilter", drawable);
            if ($r4 != null) {
                ColorFilter $r23 = (ColorFilter) $r4;
                return $r23;
            }
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type android.graphics.ColorFilter");
            throw $r5;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final Integer m1043a(Drawable drawable, boolean z) {
        Integer $r3;
        Log_OC.getArray(drawable, "$this$getAverageColor");
        C14618e $r1 = m1044a(drawable, 5, 5);
        Bitmap $r2 = $r1.m1038a();
        if ($r2 == null || ($r3 = C14620i.add($r2, null, 5, 0, z, 4, null)) == null) {
            return null;
        }
        int $i0 = $r3.intValue();
        boolean $z0 = $r1.m1037b();
        if ($z0) {
            $r1.m1038a().recycle();
        }
        return Integer.valueOf($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final C14618e m1044a(Drawable drawable, int i, int i2) {
        Log_OC.getArray(drawable, "$this$toDrawableBitmap");
        boolean $z0 = drawable instanceof BitmapDrawable;
        if ($z0) {
            BitmapDrawable $r1 = (BitmapDrawable) drawable;
            int $i2 = $r1.getIntrinsicWidth();
            if (i == $i2) {
                int $i22 = $r1.getIntrinsicHeight();
                if (i2 == $i22) {
                    C14618e $r2 = new C14618e($r1.getBitmap(), false);
                    return $r2;
                }
            }
            C14618e $r22 = new C14618e(Bitmap.createScaledBitmap($r1.getBitmap(), i, i2, true), false, 2, null);
            return $r22;
        }
        Drawable $r4 = get(drawable);
        if ($r4 == null) {
            C14618e $r23 = new C14618e(null, false, 3, null);
            return $r23;
        }
        Bitmap.Config $r5 = Bitmap.Config.ARGB_8888;
        Bitmap $r3 = Bitmap.createBitmap(i, i2, $r5);
        ColorFilter $r6 = m1046a(drawable);
        $r4.setColorFilter($r6);
        $r4.setBounds(0, 0, i, i2);
        Canvas $r7 = new Canvas($r3);
        $r4.draw($r7);
        C14618e $r24 = new C14618e($r3, false, 2, null);
        return $r24;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final void m1045a(Drawable drawable, int i) {
        Log_OC.getArray(drawable, "$this$tintCompat");
        int $i1 = Build.VERSION.SDK_INT;
        if ($i1 >= 21) {
            drawable.setTint(i);
            return;
        }
        Drawable $r0 = C1365a.m36184r(drawable);
        C1365a.m36188n($r0, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Drawable get(Drawable drawable) {
        Drawable $r2;
        Log_OC.getArray(drawable, "$this$cloneDrawable");
        Drawable.ConstantState $r1 = drawable.getConstantState();
        if ($r1 == null || ($r2 = $r1.newDrawable()) == null) {
            return null;
        }
        Log_OC.loadImage($r2, "it");
        Rect $r3 = drawable.getBounds();
        $r2.setBounds($r3);
        return $r2;
    }
}
