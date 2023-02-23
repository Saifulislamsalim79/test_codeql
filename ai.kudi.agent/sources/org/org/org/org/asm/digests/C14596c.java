package org.org.org.org.asm.digests;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.content.C1335a;
import com.smartlook.sdk.smartlook.C7206R;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.C14592c;
import org.org.org.org.asm.C14598f;
import org.org.org.org.org.ClassWriter;
/* renamed from: org.org.org.org.asm.digests.c */
/* loaded from: classes.dex */
public final class C14596c extends Paint {

    /* renamed from: d */
    public final Paint f32347d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14596c(float f, Integer num) {
        int $i0;
        int $i1;
        Paint $r2 = new Paint(1);
        Paint.Style $r3 = Paint.Style.FILL;
        $r2.setStyle($r3);
        this.f32347d = $r2;
        if (num != null) {
            int $i02 = num.intValue();
            C14592c $r4 = C14592c.f32345a;
            ClassWriter $r5 = ClassWriter.f32463b;
            int $i12 = $r5.m991b();
            $i0 = $r4.update($i02, $i12, 0.1f);
        } else {
            ClassWriter $r52 = ClassWriter.f32463b;
            $i0 = $r52.m991b();
        }
        if (num != null) {
            int $i13 = num.intValue();
            C14592c $r42 = C14592c.f32345a;
            ClassWriter $r53 = ClassWriter.f32463b;
            int $i2 = $r53.toByteArray();
            $i1 = $r42.update($i13, $i2, 0.5f);
        } else {
            ClassWriter $r54 = ClassWriter.f32463b;
            $i1 = $r54.toByteArray();
        }
        setAntiAlias(true);
        org.org.org.org.asm.p598ec.ClassWriter $r7 = org.org.org.org.asm.p598ec.ClassWriter.f32349b;
        float $f0 = $r7.dpToPx(f);
        int $i22 = (int) $f0;
        Bitmap $r8 = m1114a($i22, $i0, $i1);
        Shader.TileMode $r9 = Shader.TileMode.REPEAT;
        BitmapShader $r6 = new BitmapShader($r8, $r9, $r9);
        setShader($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Bitmap m1114a(int i, int i2, int i3) {
        Rect $r1 = new Rect(0, 0, i, i);
        Bitmap.Config $r2 = Bitmap.Config.ARGB_8888;
        Bitmap $r3 = Bitmap.createBitmap(i, i, $r2);
        C14598f $r4 = C14598f.f32351c;
        Context $r5 = $r4.getContext();
        int $i0 = C7206R.C7207drawable.smartlook_pattern_sensitive_overlay;
        Drawable $r6 = C1335a.m36322f($r5, $i0);
        Drawable $r7 = $r6;
        if ($r6 != null) {
            PorterDuff.Mode $r8 = PorterDuff.Mode.SRC_ATOP;
            $r6.setColorFilter(i3, $r8);
            $r6.setBounds($r1);
        } else {
            $r7 = null;
        }
        Canvas $r9 = new Canvas($r3);
        setAntiAlias(true);
        Paint $r10 = this.f32347d;
        $r10.setColor(i2);
        $r9.drawRect($r1, $r10);
        if ($r7 != null) {
            $r7.draw($r9);
        }
        Log_OC.loadImage($r3, "bitmap");
        return $r3;
    }
}
