package org.org.org.org.asm.asm;

import android.graphics.Bitmap;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class Face {

    /* renamed from: _x */
    public final Bitmap f32323_x;

    /* renamed from: _y */
    public final org.org.org.org.org.p602ui.asm.Item f32324_y;

    public Face(Bitmap bitmap, org.org.org.org.org.p602ui.asm.Item item) {
        Log_OC.getArray(bitmap, "frame");
        this.f32323_x = bitmap;
        this.f32324_y = item;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Face;
            if ($z0) {
                Face $r3 = (Face) obj;
                Bitmap $r4 = this.f32323_x;
                Bitmap $r1 = $r3.f32323_x;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    org.org.org.org.org.p602ui.asm.Item $r5 = this.f32324_y;
                    org.org.org.org.org.p602ui.asm.Item $r6 = $r3.f32324_y;
                    boolean $z03 = Log_OC.append($r5, $r6);
                    return $z03;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Bitmap getX() {
        Bitmap r1 = this.f32323_x;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final org.org.org.org.org.p602ui.asm.Item getY() {
        org.org.org.org.org.p602ui.asm.Item r1 = this.f32324_y;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        Bitmap $r2 = this.f32323_x;
        int $i1 = $r2 != null ? $r2.hashCode() : 0;
        int $i12 = $i1 * 31;
        org.org.org.org.org.p602ui.asm.Item $r1 = this.f32324_y;
        int $i0 = $r1 != null ? $r1.hashCode() : 0;
        return $i12 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("FrameBundle(frame=");
        Bitmap $r3 = this.f32323_x;
        $r2.append($r3);
        $r2.append(", renderingData=");
        org.org.org.org.org.p602ui.asm.Item $r4 = this.f32324_y;
        $r2.append($r4);
        $r2.append(")");
        String $r1 = $r2.toString();
        return $r1;
    }
}
