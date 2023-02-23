package org.org.org.org.org.core.internal.asm;

import android.graphics.Paint;
import android.graphics.Rect;
import com.smartlook.sdk.smartlook.core.bridge.model.WireframeDataItem;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class Attribute {

    /* renamed from: a */
    public final InterfaceC11824h f32630a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Attribute() {
        InterfaceC11824h $r1;
        FloatRange $r2 = FloatRange.EMPTY;
        $r1 = C13218k.m5625b($r2);
        this.f32630a = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Paint m846a() {
        InterfaceC11824h $r2 = this.f32630a;
        Object $r1 = $r2.getValue();
        Paint $r3 = (Paint) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Rect m845a(WireframeDataItem wireframeDataItem) {
        Log_OC.getArray(wireframeDataItem, "$this$createRect");
        float $f0 = wireframeDataItem.getLeft();
        int $i0 = (int) $f0;
        float $f02 = wireframeDataItem.getTop();
        int $i1 = (int) $f02;
        float $f03 = wireframeDataItem.getLeft();
        int $i2 = (int) $f03;
        float $f04 = wireframeDataItem.getWidth();
        int $i3 = (int) $f04;
        int $i22 = $i2 + $i3;
        float $f05 = wireframeDataItem.getTop();
        int $i32 = (int) $f05;
        float $f06 = wireframeDataItem.getHeight();
        int $i4 = (int) $f06;
        Rect $r2 = new Rect($i0, $i1, $i22, $i32 + $i4);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m844a(java.util.List r11, android.graphics.Canvas r12) {
        /*
            r10 = this;
            java.lang.String r0 = "items"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            java.lang.String r0 = "canvas"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            java.util.Iterator r1 = r11.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r3 = r1.next()
            r5 = r3
            com.smartlook.sdk.smartlook.core.bridge.model.WireframeDataItem r5 = (com.smartlook.sdk.smartlook.core.bridge.model.WireframeDataItem) r5
            r4 = r5
            java.lang.String r6 = r4.getColor()
            if (r6 == 0) goto Le
            android.graphics.Rect r7 = r10.m845a(r4)
            android.graphics.Paint r8 = r10.m846a()
            int r9 = android.graphics.Color.parseColor(r6)
            r8.setColor(r9)
            r12.drawRect(r7, r8)
            goto Le
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.internal.asm.Attribute.m844a(java.util.List, android.graphics.Canvas):void");
    }
}
