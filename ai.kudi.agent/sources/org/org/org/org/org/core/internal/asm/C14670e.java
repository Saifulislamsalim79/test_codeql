package org.org.org.org.org.core.internal.asm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.List;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
/* renamed from: org.org.org.org.org.core.internal.asm.e */
/* loaded from: classes.dex */
public final class C14670e extends AbstractC11802m implements InterfaceC11772q<e.a.a.a.c.l.e.d, List<? extends e.a.a.a.c.l.e.g>, Integer, C13666w> {

    /* renamed from: a */
    public final /* synthetic */ Canvas f32655a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f32656b;

    /* renamed from: e */
    public final /* synthetic */ C14673h f32657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14670e(C14673h c14673h, Canvas canvas, Bitmap bitmap) {
        super(3);
        this.f32657e = c14673h;
        this.f32655a = canvas;
        this.f32656b = bitmap;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0037 */
    /* JADX WARN: Incorrect condition in loop: B:18:0x0055 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m821a(org.org.org.org.org.p602ui.asm.Label r14, java.util.List r15, int r16) {
        /*
            r13 = this;
            java.lang.String r0 = "renderItem"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r0)
            java.lang.String r0 = "simplifiedItems"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r0)
            if (r16 != 0) goto L14
            org.org.org.org.org.core.internal.asm.h r1 = r13.f32657e
            android.graphics.Canvas r2 = r13.f32655a
            org.org.org.org.org.core.internal.asm.C14673h.m799b(r1, r2, r14)
            return
        L14:
            org.org.org.org.org.core.internal.asm.h r1 = r13.f32657e
            android.view.View r3 = r14.getName()
            boolean r4 = org.org.org.org.org.core.internal.asm.C14673h.m803a(r1, r3)
            if (r4 == 0) goto L2a
            org.org.org.org.org.core.internal.asm.h r1 = r13.f32657e
            android.graphics.Bitmap r5 = r13.f32656b
            android.graphics.Canvas r2 = r13.f32655a
            org.org.org.org.org.core.internal.asm.C14673h.m797b(r1, r14, r5, r2)
            return
        L2a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r15.iterator()
        L33:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r8 = r7.next()
            r10 = r8
            org.org.org.org.org.ui.asm.d r10 = (org.org.org.org.org.p602ui.asm.C14720d) r10
            r9 = r10
            boolean r4 = r9.m512c()
            r11 = 1
            r4 = r4 ^ r11
            if (r4 == 0) goto L33
            r6.add(r8)
            goto L33
        L4d:
            java.util.Iterator r7 = r6.iterator()
        L51:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L69
            java.lang.Object r8 = r7.next()
            r12 = r8
            org.org.org.org.org.ui.asm.d r12 = (org.org.org.org.org.p602ui.asm.C14720d) r12
            r9 = r12
            org.org.org.org.org.core.internal.asm.h r1 = r13.f32657e
            android.graphics.Canvas r2 = r13.f32655a
            org.org.org.org.org.core.internal.asm.C14673h.m798b(r1, r2, r9, r14)
            goto L51
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.internal.asm.C14670e.m821a(org.org.org.org.org.ui.asm.Label, java.util.List, int):void");
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
        m821a($r4, $r5, $i0);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }
}
