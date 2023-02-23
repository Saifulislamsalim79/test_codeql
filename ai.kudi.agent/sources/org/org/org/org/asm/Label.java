package org.org.org.org.asm;

import android.graphics.Matrix;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
/* loaded from: classes.dex */
public final class Label {

    /* renamed from: a */
    public static final Matrix.ScaleToFit[] f32308a;

    /* renamed from: i */
    public static final Label f32309i;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Label $r0 = new Label();
        f32309i = $r0;
        Matrix.ScaleToFit $r2 = Matrix.ScaleToFit.FILL;
        Matrix.ScaleToFit $r22 = Matrix.ScaleToFit.START;
        Matrix.ScaleToFit $r23 = Matrix.ScaleToFit.CENTER;
        Matrix.ScaleToFit $r24 = Matrix.ScaleToFit.END;
        Matrix.ScaleToFit[] $r1 = {$r2, $r22, $r23, $r24};
        f32308a = $r1;
    }

    private Label() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final int convert(ImageView.ScaleType scaleType) {
        int[] $r1 = C14606l.f32362c;
        int $i0 = scaleType.ordinal();
        switch ($r1[$i0]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                Throwable r4 = new NoWhenBranchMatchedException();
                Throwable r5 = r4;
                throw r5;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Matrix.ScaleToFit get(ImageView.ScaleType scaleType) {
        Matrix.ScaleToFit[] $r1 = f32308a;
        int $i0 = convert(scaleType);
        Matrix.ScaleToFit $r3 = $r1[$i0 - 1];
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
        if (r12 != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect draw(int r28, int r29, android.graphics.Rect r30, android.graphics.Rect r31, android.widget.ImageView r32) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.Label.draw(int, int, android.graphics.Rect, android.graphics.Rect, android.widget.ImageView):android.graphics.Rect");
    }
}
