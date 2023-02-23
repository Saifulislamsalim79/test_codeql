package org.org.org.org.org.core.internal.asm;

import android.graphics.Paint;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* renamed from: org.org.org.org.org.core.internal.asm.b */
/* loaded from: classes.dex */
public final class C14667b extends AbstractC11802m implements InterfaceC11756a<Paint> {

    /* renamed from: a */
    public static final C14667b f32650a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14667b $r0 = new C14667b();
        f32650a = $r0;
    }

    public C14667b() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Paint m823a() {
        Paint $r1 = new Paint();
        org.org.org.org.org.ClassWriter $r2 = org.org.org.org.org.ClassWriter.f32463b;
        int $i0 = $r2.m989d();
        $r1.setColor($i0);
        Paint.Style $r3 = Paint.Style.FILL;
        $r1.setStyle($r3);
        float $f0 = $r2.m987g();
        $r1.setShadowLayer($f0, 0.0f, 0.0f, -16777216);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Paint invoke() {
        Paint $r1 = m823a();
        return $r1;
    }
}
