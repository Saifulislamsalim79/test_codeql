package org.org.org.org.org.core.p600xy;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.menu.EnumC14570c;
import org.org.org.org.asm.asm.Method;
import org.org.org.org.asm.p598ec.ClassWriter;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.core.util.Type;
/* renamed from: org.org.org.org.org.core.xy.f */
/* loaded from: classes.dex */
public final class C14687f {

    /* renamed from: d */
    public static final C14687f f32709d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14687f $r0 = new C14687f();
        f32709d = $r0;
    }

    private C14687f() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final int m775a() {
        ClassWriter $r1 = ClassWriter.f32349b;
        float $f0 = $r1.m1111b();
        int $i0 = (int) ($f0 / 2.0f);
        return Math.min($i0, 720);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Type m774a(int $i0, int $i1) {
        int $i2 = $i0 % 2;
        if ($i2 == 1) {
            $i0++;
        }
        int $i22 = $i1 % 2;
        if ($i22 == 1) {
            $i1++;
        }
        int $i23 = $i0 % 16;
        int $i02 = $i0 - $i23;
        int $i24 = $i1 % 16;
        Type $r1 = new Type($i02, $i1 - $i24);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Type m773a(Method method) {
        float $f0;
        int $i0;
        Log_OC.getArray(method, "screenSize");
        ClassWriter $r3 = ClassWriter.f32349b;
        EnumC14570c $r4 = $r3.m1113a();
        EnumC14570c $r5 = EnumC14570c.f32268a;
        if ($r4 == $r5) {
            int $i02 = method.getValue();
            float $f02 = $i02;
            int $i03 = method.getName();
            float $f1 = $i03;
            $f0 = $f02 / $f1;
            $i0 = m775a();
        } else {
            int $i04 = method.getName();
            float $f03 = $i04;
            int $i05 = method.getValue();
            float $f12 = $i05;
            $f0 = $f03 / $f12;
            $i0 = m775a();
        }
        float $f13 = $i0;
        int $i06 = (int) ($f0 * $f13);
        int $i1 = m775a();
        Type $r6 = new Type($i06, $i1);
        System $r7 = System.f32375c;
        LogAspect $r8 = LogAspect.VIDEO_CAPTURE;
        LogSeverity $r1 = LogSeverity.INFO;
        TopLevel$NativeErrors $r9 = $r7.get($r8, true, $r1);
        int $i07 = $r9.ordinal();
        if ($i07 != 0) {
            return $r6;
        }
        StringBuilder $r10 = new StringBuilder();
        StringBuilder $r11 = new StringBuilder();
        $r11.append("maxVideoSize() max video size calculated: videoSize = ");
        String $r12 = Log.get($r6, false, 2, null);
        $r11.append($r12);
        String $r122 = $r11.toString();
        $r10.append($r122);
        $r10.append(", [logAspect: ");
        $r10.append($r8);
        $r10.append(']');
        String $r123 = $r10.toString();
        $r7.size($r8, $r1, "VideoSize", $r123);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Bitmap add(Bitmap $r2, int i) {
        Log_OC.getArray($r2, "frame");
        if (i == 90 || i == 270) {
            Matrix $r1 = new Matrix();
            float $f0 = i;
            $r1.postRotate($f0);
            int $i0 = $r2.getWidth();
            int $i1 = $r2.getHeight();
            Bitmap $r22 = Bitmap.createBitmap($r2, 0, 0, $i0, $i1, $r1, true);
            Log_OC.loadImage($r22, "Bitmap.createBitmap(fram…ame.height, matrix, true)");
            return $r22;
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Type add(Method method) {
        Log_OC.getArray(method, "screenSize");
        Type $r2 = m773a(method);
        int $i0 = $r2.getValue();
        int $i1 = $r2.m779a();
        return m774a($i0, $i1);
    }
}
