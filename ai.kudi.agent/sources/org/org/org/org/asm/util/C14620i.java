package org.org.org.org.asm.util;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p491i0.C11841h;
/* renamed from: org.org.org.org.asm.util.i */
/* loaded from: classes.dex */
public final class C14620i {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static /* synthetic */ Integer add(Bitmap bitmap, Rect $r2, int $i0, int $i1, boolean $z0, int i, Object obj) {
        int $i3 = i & 1;
        if ($i3 != 0) {
            $r2 = null;
        }
        int $i32 = i & 2;
        if ($i32 != 0) {
            $i0 = 10;
        }
        int $i33 = i & 4;
        if ($i33 != 0) {
            $i1 = 0;
        }
        int $i2 = i & 8;
        if ($i2 != 0) {
            $z0 = false;
        }
        Integer $r0 = draw(bitmap, $r2, $i0, $i1, $z0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Integer draw(Bitmap bitmap, Rect rect, int i, int i2, boolean z) {
        int $i4;
        int $i7;
        int $i14;
        Log_OC.getArray(bitmap, "$this$getAverageColor");
        int $i42 = bitmap.getWidth();
        if ($i42 >= i) {
            int $i43 = bitmap.getHeight();
            if ($i43 < i) {
                return null;
            }
            int $i44 = rect != null ? rect.width() : bitmap.getWidth();
            int $i5 = i2 * 2;
            $i4 = C11841h.m10271a(($i44 - $i5) / i, 1);
            int $i6 = rect != null ? rect.height() : bitmap.getHeight();
            $i7 = C11841h.m10271a(($i6 - $i5) / i, 1);
            int $i52 = 0;
            int $i9 = 0;
            int $i10 = 0;
            int $i11 = 0;
            int $i12 = 0;
            int $i62 = 0;
            for (int $i8 = 0; $i8 < i; $i8++) {
                for (int $i13 = 0; $i13 < i; $i13++) {
                    int $i3 = rect != null ? rect.left : 0;
                    int $i2 = $i8 * $i4;
                    int $i22 = $i3 + $i2 + i2;
                    if (rect != null) {
                        int $i142 = rect.top;
                        $i14 = $i142;
                    } else {
                        $i14 = 0;
                    }
                    int $i32 = $i13 * $i7;
                    try {
                        int $i23 = bitmap.getPixel($i22, $i14 + $i32 + i2);
                        int $i33 = Color.alpha($i23);
                        if ($i33 != 0) {
                            int $i34 = Color.red($i23);
                            $i11 += $i34;
                            int $i35 = Color.green($i23);
                            $i12 += $i35;
                            int $i36 = Color.blue($i23);
                            $i62 += $i36;
                            int $i24 = Color.alpha($i23);
                            if ($i24 > 20) {
                                $i10 += $i24;
                                $i9++;
                            }
                            $i52++;
                        }
                    } catch (Exception e) {
                    }
                }
            }
            if ($i52 == 0) {
                return null;
            }
            int $i0 = (!z || $i9 == 0) ? 255 : $i10 / $i9;
            int $i1 = $i11 / $i52;
            int $i45 = $i12 / $i52;
            Integer $r3 = Integer.valueOf(Color.argb($i0, $i1, $i45, $i62 / $i52));
            return $r3;
        }
        return null;
    }
}
