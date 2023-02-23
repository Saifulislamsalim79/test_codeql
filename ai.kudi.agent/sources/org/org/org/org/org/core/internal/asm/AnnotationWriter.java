package org.org.org.org.org.core.internal.asm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import java.util.List;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.util.C14619f;
/* loaded from: classes.dex */
public final class AnnotationWriter extends AbstractC11802m implements InterfaceC11772q<e.a.a.a.c.l.e.d, List<? extends e.a.a.a.c.l.e.g>, Integer, C13666w> {

    /* renamed from: a */
    public final /* synthetic */ Plot f32628a;

    /* renamed from: c */
    public final /* synthetic */ Canvas f32629c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationWriter(Plot plot, Canvas canvas) {
        super(3);
        this.f32628a = plot;
        this.f32629c = canvas;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m847a(org.org.org.org.org.p602ui.asm.Label label, List list, int i) {
        Log_OC.getArray(label, "renderItem");
        Log_OC.getArray(list, "<anonymous parameter 1>");
        Canvas $r3 = this.f32629c;
        Rect $r4 = label.m522a();
        Plot $r5 = this.f32628a;
        Paint $r6 = $r5.m830a();
        $r3.drawRect($r4, $r6);
        Canvas $r32 = this.f32629c;
        Rect $r42 = label.m522a();
        Plot $r52 = this.f32628a;
        Paint $r62 = $r52.m826b();
        $r32.drawRect($r42, $r62);
        Plot $r53 = this.f32628a;
        boolean $z0 = $r53.f32645e;
        if ($z0) {
            Plot $r54 = this.f32628a;
            View $r7 = label.getName();
            boolean $z02 = $r54.m829a($r7);
            if ($z02) {
                Rect $r43 = new Rect();
                org.org.org.org.org.ClassWriter $r8 = org.org.org.org.org.ClassWriter.f32463b;
                float $f0 = $r8.m986i();
                int $i0 = (int) $f0;
                float $f02 = $r8.m986i();
                int $i1 = (int) $f02;
                Rect $r9 = label.m522a();
                Gravity.apply(17, $i0, $i1, $r9, $r43);
                View $r72 = label.getName();
                Drawable $r10 = C14619f.m1031f($r72);
                if ($r10 != null) {
                    $r10.setBounds($r43);
                    org.org.org.org.asm.util.Type.m1045a($r10, -1);
                    Canvas $r33 = this.f32629c;
                    $r10.draw($r33);
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(e.a.a.a.c.l.e.d dVar, List<? extends e.a.a.a.c.l.e.g> list, Integer num) {
        org.org.org.org.org.p602ui.asm.Label $r4 = (org.org.org.org.org.p602ui.asm.Label) dVar;
        List<? extends e.a.a.a.c.l.e.g> $r5 = list;
        Integer $r6 = num;
        int $i0 = $r6.intValue();
        m847a($r4, $r5, $i0);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }
}
