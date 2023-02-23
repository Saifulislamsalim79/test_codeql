package org.org.org.org.org.core.internal.asm;

import android.graphics.Paint;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class Frame extends AbstractC11802m implements InterfaceC11756a<Paint> {

    /* renamed from: h */
    public static final Frame f32642h;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Frame $r0 = new Frame();
        f32642h = $r0;
    }

    public Frame() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Paint init() {
        Paint $r1 = new Paint();
        Paint.Style $r2 = Paint.Style.STROKE;
        $r1.setStyle($r2);
        $r1.setColor(-1);
        org.org.org.org.org.ClassWriter $r3 = org.org.org.org.org.ClassWriter.f32463b;
        float $f0 = $r3.getValue();
        $r1.setStrokeWidth($f0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Paint invoke() {
        Paint $r1 = init();
        return $r1;
    }
}
