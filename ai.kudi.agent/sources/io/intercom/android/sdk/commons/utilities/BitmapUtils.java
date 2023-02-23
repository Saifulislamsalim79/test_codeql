package io.intercom.android.sdk.commons.utilities;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
/* loaded from: classes.dex */
public class BitmapUtils {

    /* loaded from: classes.dex */
    public interface BitmapCache {
        Bitmap createBitmap(int i, int i2, Bitmap.Config config);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Bitmap transformRound(Bitmap bitmap, BitmapCache bitmapCache) {
        int $i0 = bitmap.getWidth();
        int $i1 = bitmap.getHeight();
        int $i02 = Math.min($i0, $i1);
        int $i12 = bitmap.getWidth();
        int $i13 = ($i12 - $i02) / 2;
        int $i2 = (bitmap.getHeight() - $i02) / 2;
        Bitmap.Config $r5 = Bitmap.Config.ARGB_8888;
        Bitmap $r6 = bitmapCache.createBitmap($i02, $i02, $r5);
        Bitmap $r7 = $r6;
        if ($r6 == null) {
            Bitmap.Config $r52 = Bitmap.Config.ARGB_8888;
            $r7 = Bitmap.createBitmap($i02, $i02, $r52);
        }
        Canvas $r8 = new Canvas($r7);
        Paint $r0 = new Paint();
        Shader.TileMode $r2 = Shader.TileMode.CLAMP;
        BitmapShader $r1 = new BitmapShader(bitmap, $r2, $r2);
        if ($i13 != 0 || $i2 != 0) {
            Matrix $r9 = new Matrix();
            float $f0 = -$i13;
            int $i14 = -$i2;
            float $f1 = $i14;
            $r9.setTranslate($f0, $f1);
            $r1.setLocalMatrix($r9);
        }
        $r0.setShader($r1);
        $r0.setAntiAlias(true);
        float $f02 = $i02;
        float $f03 = $f02 / 2.0f;
        $r8.drawCircle($f03, $f03, $f03, $r0);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Bitmap transformRound(Bitmap bitmap, BitmapCache bitmapCache, int i, int i2) {
        int $i0 = bitmap.getWidth();
        int $i3 = bitmap.getHeight();
        int $i02 = Math.min($i0, $i3);
        float $f1 = $i02 / 2.0f;
        Bitmap.Config $r2 = Bitmap.Config.ARGB_8888;
        Bitmap $r3 = bitmapCache.createBitmap($i02, $i02, $r2);
        Bitmap $r4 = $r3;
        if ($r3 == null) {
            Bitmap.Config $r22 = Bitmap.Config.ARGB_8888;
            $r4 = Bitmap.createBitmap($i02, $i02, $r22);
        }
        Paint $r5 = new Paint();
        $r5.setAntiAlias(true);
        Shader.TileMode $r7 = Shader.TileMode.CLAMP;
        BitmapShader $r6 = new BitmapShader(bitmap, $r7, $r7);
        $r5.setShader($r6);
        Canvas $r8 = new Canvas($r4);
        int $i03 = bitmap.getWidth();
        int $i32 = ($i03 - i2) / 2;
        int $i04 = i2 / 2;
        float $f0 = $i32 + $i04;
        int $i33 = bitmap.getHeight();
        float $f2 = (($i33 - i2) / 2) + $i04;
        float $f3 = i2;
        float $f12 = $f1 - $f3;
        $r8.drawCircle($f0, $f2, $f12, $r5);
        Paint $r52 = new Paint();
        $r52.setColor(i);
        Paint.Style $r9 = Paint.Style.STROKE;
        $r52.setStyle($r9);
        $r52.setAntiAlias(true);
        $r52.setStrokeWidth(2.0f);
        $r8.drawCircle($f0, $f2, $f12, $r52);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Bitmap transformRoundCorners(Bitmap bitmap, BitmapCache bitmapCache, int i) {
        int $i1 = bitmap.getWidth();
        int $i2 = bitmap.getHeight();
        Bitmap.Config $r4 = Bitmap.Config.ARGB_8888;
        Bitmap $r5 = bitmapCache.createBitmap($i1, $i2, $r4);
        Bitmap $r6 = $r5;
        if ($r5 == null) {
            Bitmap.Config $r42 = Bitmap.Config.ARGB_8888;
            $r6 = Bitmap.createBitmap($i1, $i2, $r42);
        }
        Canvas $r7 = new Canvas($r6);
        Paint $r0 = new Paint();
        $r0.setAntiAlias(true);
        Shader.TileMode $r1 = Shader.TileMode.CLAMP;
        BitmapShader $r8 = new BitmapShader(bitmap, $r1, $r1);
        $r0.setShader($r8);
        float $f1 = $i2;
        RectF $r9 = new RectF(0.0f, 0.0f, $i1, $f1);
        float $f0 = i;
        $r7.drawRoundRect($r9, $f0, $f0, $r0);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Bitmap transformRoundCorners(Bitmap bitmap, BitmapCache bitmapCache, int $i2, int i, int i2, int i3, int i4) {
        Bitmap.Config $r4 = Bitmap.Config.ARGB_8888;
        Bitmap $r5 = bitmapCache.createBitmap($i2, i, $r4);
        Bitmap $r6 = $r5;
        if ($r5 == null) {
            Bitmap.Config $r42 = Bitmap.Config.ARGB_8888;
            $r6 = Bitmap.createBitmap($i2, i, $r42);
        }
        Canvas $r7 = new Canvas($r6);
        Paint $r0 = new Paint();
        $r0.setAntiAlias(true);
        Bitmap $r2 = Bitmap.createScaledBitmap(bitmap, $i2, i, false);
        Shader.TileMode $r1 = Shader.TileMode.CLAMP;
        BitmapShader $r8 = new BitmapShader($r2, $r1, $r1);
        $r0.setShader($r8);
        float $f0 = i4;
        float $f2 = i - i4;
        RectF $r9 = new RectF($f0, $f0, $i2 - i4, $f2);
        float $f1 = i2;
        $r7.drawRoundRect($r9, $f1, $f1, $r0);
        Paint $r02 = new Paint();
        $r02.setColor(i3);
        Paint.Style $r10 = Paint.Style.STROKE;
        $r02.setStyle($r10);
        $r02.setAntiAlias(true);
        $r02.setStrokeWidth($f0);
        $r7.drawRoundRect($r9, $f1, $f1, $r02);
        return $r6;
    }
}
