package org.org.org.org.org.core.internal.asm;

import android.graphics.Paint;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* renamed from: org.org.org.org.org.core.internal.asm.c */
/* loaded from: classes.dex */
public final class C14668c extends AbstractC11802m implements InterfaceC11756a<Paint> {

    /* renamed from: a */
    public static final C14668c f32651a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14668c $r0 = new C14668c();
        f32651a = $r0;
    }

    public C14668c() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Paint m822a() {
        Paint $r1 = new Paint();
        org.org.org.org.org.ClassWriter $r2 = org.org.org.org.org.ClassWriter.f32463b;
        int $i0 = $r2.m990c();
        $r1.setColor($i0);
        Paint.Style $r3 = Paint.Style.STROKE;
        $r1.setStyle($r3);
        float $f0 = $r2.m992a();
        $r1.setStrokeWidth($f0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Paint invoke() {
        Paint $r1 = m822a();
        return $r1;
    }
}
