package org.org.org.org.asm.util;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13724q;
import org.org.org.org.asm.p598ec.ClassWriter;
/* renamed from: org.org.org.org.asm.util.l */
/* loaded from: classes.dex */
public final class C14621l {

    /* renamed from: d */
    public static final int f32400d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ClassWriter $r0 = ClassWriter.f32349b;
        float $f0 = $r0.dpToPx(2.0f);
        int $i0 = (int) $f0;
        f32400d = $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final List m1029a(Rect $r0, Rect rect) {
        List $r4;
        Log_OC.getArray($r0, "$this$subtract");
        Log_OC.getArray(rect, "subtracted");
        boolean $z0 = $r0.isEmpty();
        if ($z0) {
            return null;
        }
        boolean $z02 = Log_OC.append($r0, rect);
        if ($z02) {
            return null;
        }
        Rect $r2 = remove($r0, rect);
        if ($r2 != null) {
            boolean $z03 = $r2.isEmpty();
            if (!$z03) {
                ArrayList $r3 = new ArrayList();
                Rect $r22 = evaluate($r0, rect);
                if ($r22 != null) {
                    $r3.add($r22);
                }
                Rect $r23 = draw($r0, rect);
                if ($r23 != null) {
                    $r3.add($r23);
                }
                Rect $r24 = load($r0, rect);
                if ($r24 != null) {
                    $r3.add($r24);
                }
                Rect $r02 = getBounds($r0, rect);
                if ($r02 != null) {
                    $r3.add($r02);
                    return $r3;
                }
                return $r3;
            }
        }
        Rect $r1 = new Rect($r0);
        $r4 = C13724q.m3901b($r1);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final boolean m1028a(Rect rect, Rect rect2, int i) {
        Log_OC.getArray(rect, "$this$intersectsWithTolerance");
        Log_OC.getArray(rect2, "intersectsWith");
        Rect $r2 = new Rect(rect2);
        draw($r2, i);
        boolean $z0 = Rect.intersects(rect, $r2);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ boolean m1027a(Rect rect, Rect rect2, int $i0, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $i0 = f32400d;
        }
        boolean $z0 = m1028a(rect, rect2, $i0);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final RectF add(Rect rect) {
        Log_OC.getArray(rect, "$this$toRectF");
        RectF $r1 = new RectF(rect);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void add(Rect rect, float f) {
        Log_OC.getArray(rect, "$this$scale");
        int $i0 = rect.left;
        float $f1 = $i0;
        int $i02 = (int) ($f1 * f);
        rect.left = $i02;
        int $i03 = rect.top;
        float $f12 = $i03;
        int $i04 = (int) ($f12 * f);
        rect.top = $i04;
        int $i05 = rect.right;
        float $f13 = $i05;
        int $i06 = (int) ($f13 * f);
        rect.right = $i06;
        int $i07 = rect.bottom;
        float $f14 = $i07;
        float $f0 = $f14 * f;
        int $i08 = (int) $f0;
        rect.bottom = $i08;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static final Rect draw(Rect rect, Rect rect2) {
        int $i0 = rect.left;
        int $i1 = rect.top;
        int $i2 = rect.right;
        int $i3 = rect2.top;
        Rect $r0 = new Rect($i0, $i1, $i2, Math.max($i1, $i3));
        Rect $r1 = get($r0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void draw(Rect rect, int i) {
        Log_OC.getArray(rect, "$this$addPadding");
        int $i1 = rect.left;
        rect.left = $i1 + i;
        int $i12 = rect.top;
        rect.top = $i12 + i;
        int $i13 = rect.right;
        rect.right = $i13 - i;
        int $i14 = rect.bottom;
        int $i0 = $i14 - i;
        rect.bottom = $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void draw(Rect rect, int i, int i2, int i3, int i4) {
        Log_OC.getArray(rect, "$this$addPadding");
        int $i4 = rect.left;
        int $i3 = $i4 + i;
        rect.left = $i3;
        int $i32 = rect.top;
        rect.top = $i32 + i2;
        int $i33 = rect.right;
        rect.right = $i33 - i3;
        int $i34 = rect.bottom;
        rect.bottom = $i34 - i4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static final Rect evaluate(Rect rect, Rect rect2) {
        int $i0 = rect.left;
        int $i1 = rect.top;
        int $i2 = rect2.left;
        int $i22 = Math.max($i0, $i2);
        int $i3 = rect.bottom;
        Rect $r0 = new Rect($i0, $i1, $i22, $i3);
        Rect $r1 = get($r0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static final Rect get(Rect rect) {
        boolean $z0 = rect.isEmpty();
        if ($z0) {
            return null;
        }
        return rect;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static final Rect getBounds(Rect rect, Rect rect2) {
        int $i0 = rect.left;
        int $i1 = rect.bottom;
        int $i2 = rect2.bottom;
        int $i12 = Math.min($i1, $i2);
        int $i22 = rect.right;
        int $i3 = rect.bottom;
        Rect $r0 = new Rect($i0, $i12, $i22, $i3);
        Rect $r1 = get($r0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static final Rect load(Rect rect, Rect rect2) {
        int $i0 = rect.right;
        int $i1 = rect2.right;
        int $i12 = Math.min($i0, $i1);
        int $i2 = rect.top;
        int $i02 = rect.right;
        int $i3 = rect.bottom;
        Rect $r0 = new Rect($i12, $i2, $i02, $i3);
        Rect $r1 = get($r0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Rect remove(Rect rect, Rect rect2) {
        Log_OC.getArray(rect, "$this$intersectWith");
        Rect $r2 = new Rect(rect);
        boolean $z0 = rect2 != null ? $r2.intersect(rect2) : true;
        if ($z0) {
            return $r2;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Rect round(RectF rectF) {
        Log_OC.getArray(rectF, "$this$toRect");
        float $f0 = rectF.left;
        int $i0 = (int) $f0;
        float $f02 = rectF.top;
        int $i1 = (int) $f02;
        float $f03 = rectF.right;
        int $i2 = (int) $f03;
        float $f04 = rectF.bottom;
        int $i3 = (int) $f04;
        Rect $r1 = new Rect($i0, $i1, $i2, $i3);
        return $r1;
    }
}
