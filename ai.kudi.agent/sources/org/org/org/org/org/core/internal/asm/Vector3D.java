package org.org.org.org.org.core.internal.asm;

import android.graphics.Paint;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class Vector3D extends AbstractC11802m implements InterfaceC11756a<Paint> {

    /* renamed from: x */
    public static final Vector3D f32648x;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Vector3D $r0 = new Vector3D();
        f32648x = $r0;
    }

    public Vector3D() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Paint init() {
        Paint $r1 = new Paint();
        org.org.org.org.org.ClassWriter $r2 = org.org.org.org.org.ClassWriter.f32463b;
        int $i0 = $r2.m989d();
        $r1.setColor($i0);
        Paint.Style $r3 = Paint.Style.FILL;
        $r1.setStyle($r3);
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
