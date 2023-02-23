package org.org.org.org.org.core.internal.asm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.asm.Method;
/* loaded from: classes.dex */
public final class Type {

    /* renamed from: a */
    public Bitmap f32647a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Bitmap apply(Method method) {
        int $i0 = method.getValue();
        int $i1 = method.getName();
        Bitmap.Config $r2 = Bitmap.Config.ARGB_8888;
        Bitmap $r3 = Bitmap.createBitmap($i0, $i1, $r2);
        Canvas $r4 = new Canvas($r3);
        org.org.org.org.org.ClassWriter $r5 = org.org.org.org.org.ClassWriter.f32463b;
        int $i02 = $r5.size();
        $r4.drawColor($i02);
        Log_OC.loadImage($r3, "Bitmap.createBitmap(opti…REENSHOT_COLOR)\n        }");
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r2 != r3) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap get(org.org.org.org.asm.asm.Method r5) {
        /*
            r4 = this;
            java.lang.String r0 = "optimalVideoSize"
            kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
            android.graphics.Bitmap r1 = r4.f32647a
            if (r1 == 0) goto L25
            int r2 = r5.getValue()
            android.graphics.Bitmap r1 = r4.f32647a
            if (r1 == 0) goto L25
            int r3 = r1.getWidth()
            if (r2 != r3) goto L25
            int r2 = r5.getName()
            android.graphics.Bitmap r1 = r4.f32647a
            if (r1 == 0) goto L25
            int r3 = r1.getHeight()
            if (r2 == r3) goto L2b
        L25:
            android.graphics.Bitmap r1 = r4.apply(r5)
            r4.f32647a = r1
        L2b:
            android.graphics.Bitmap r1 = r4.f32647a
            if (r1 == 0) goto L30
            return r1
        L30:
            android.graphics.Bitmap r1 = r4.apply(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.internal.asm.Type.get(org.org.org.org.asm.asm.Method):android.graphics.Bitmap");
    }
}
