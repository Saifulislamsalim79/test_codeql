package org.org.org.org.org.core.internal.asm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.List;
/* loaded from: classes.dex */
public abstract class Label {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0016 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List m832a(java.util.List r15) {
        /*
            r14 = this;
            org.org.org.org.org.core.internal.asm.x r0 = r14.mo796c()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r15.iterator()
        L12:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r5 = r3.next()
            r7 = r5
            org.org.org.org.org.ui.asm.Handle r7 = (org.org.org.org.org.p602ui.asm.Handle) r7
            r6 = r7
            org.org.org.org.org.ui.asm.Label r8 = r6.m523a()
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L2b
            goto L49
        L2b:
            java.util.Iterator r9 = r2.iterator()
        L2f:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r5 = r9.next()
            r11 = r5
            java.lang.String r11 = (java.lang.String) r11
            r10 = r11
            java.lang.String r12 = r8.m521b()
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r10, r12)
            if (r4 == 0) goto L2f
            r4 = 1
            goto L4a
        L49:
            r4 = 0
        L4a:
            if (r4 != 0) goto L6c
            android.view.View r13 = r8.getName()
            boolean r4 = r0.onSaveInstanceState(r13)
            if (r4 == 0) goto L5a
            r1.add(r6)
            goto L12
        L5a:
            android.view.View r13 = r8.getName()
            boolean r4 = r0.mo793a(r13)
            if (r4 == 0) goto L12
            java.lang.String r10 = r8.m520c()
            r2.add(r10)
            goto L12
        L6c:
            r1.add(r6)
            java.lang.String r10 = r8.m520c()
            r2.add(r10)
            goto L12
        L77:
            java.util.List r15 = kotlin.p557z.C13722p.m3970D0(r15)
            r15.removeAll(r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.internal.asm.Label.m832a(java.util.List):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0021 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m831a(java.util.List r14, android.graphics.Canvas r15, android.graphics.Bitmap r16, java.util.Map r17) {
        /*
            r13 = this;
            java.lang.String r1 = "roots"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r1)
            java.lang.String r1 = "canvas"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r1)
            java.lang.String r1 = "bitmap"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.lang.String r1 = "simplifiedRenderingItemsForViewRoots"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.util.Iterator r2 = r14.iterator()
            r3 = 0
        L1d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r5 = r2.next()
            int r6 = r3 + 1
            if (r3 < 0) goto L58
            r8 = r5
            org.org.org.org.asm.asm.m r8 = (org.org.org.org.asm.asm.C14590m) r8
            r7 = r8
            org.org.org.org.asm.util.C14617d.m1039b(r7, r15)
            int r9 = r7.hashCode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r0 = r17
            java.lang.Object r5 = r0.get(r10)
            r11 = r5
            java.util.List r11 = (java.util.List) r11
            r14 = r11
            if (r14 == 0) goto L56
            java.util.List r14 = r13.m832a(r14)
            if (r14 == 0) goto L56
            if (r3 != 0) goto L50
            r4 = 1
            goto L51
        L50:
            r4 = 0
        L51:
            r0 = r16
            r13.mo807a(r0, r15, r4, r14)
        L56:
            r3 = r6
            goto L1d
        L58:
            kotlin.p557z.C13722p.m3923n()
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r1 = "Null throw statement replaced by Soot"
            r12.<init>(r1)
            throw r12
        L63:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.internal.asm.Label.m831a(java.util.List, android.graphics.Canvas, android.graphics.Bitmap, java.util.Map):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public abstract void mo807a(Bitmap bitmap, Canvas canvas, boolean z, List list);

    /* renamed from: c */
    public abstract InterfaceC14676x mo796c();
}
