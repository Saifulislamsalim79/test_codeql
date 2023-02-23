package org.org.org.org.org.p602ui;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.WindowManager;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13724q;
import org.org.org.org.android.util.asm.C14544h;
import org.org.org.org.asm.C14592c;
import org.org.org.org.asm.asm.C14590m;
import org.org.org.org.asm.util.AnnotationVisitor;
import org.org.org.org.asm.util.C14619f;
import org.org.org.org.asm.util.C14621l;
import org.org.org.org.org.p602ui.asm.C14719b;
import org.org.org.org.org.p602ui.asm.C14720d;
import org.org.org.org.org.p602ui.asm.C14721f;
import org.org.org.org.org.p602ui.asm.Handle;
import org.org.org.org.org.p602ui.asm.Item;
import org.org.org.org.org.p602ui.asm.Label;
import org.org.org.org.org.p602ui.asm.Type;
/* renamed from: org.org.org.org.org.ui.f */
/* loaded from: classes.dex */
public final class C14726f {

    /* renamed from: c */
    public static final String f32915c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14592c $r1 = C14592c.f32345a;
        String $r0 = $r1.get(-16777216);
        f32915c = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List m491a(java.util.List r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r8.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r3 = r1.next()
            r5 = r3
            org.org.org.org.org.ui.asm.d r5 = (org.org.org.org.org.p602ui.asm.C14720d) r5
            r4 = r5
            org.org.org.org.org.ui.asm.Type r6 = r7.m486a(r4)
            if (r6 == 0) goto L9
            r0.add(r6)
            goto L9
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.C14726f.m491a(java.util.List):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final C14544h m487a(Label label) {
        Rect $r2 = label.m522a();
        Rect $r3 = label.getValue();
        boolean $z0 = Log_OC.append($r2, $r3);
        if ($z0) {
            return null;
        }
        Rect $r22 = label.getValue();
        C14544h $r4 = new C14544h($r22);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Item m492a(Rect rect) {
        List $r5;
        List $r52;
        List $r53 = m485d(rect);
        C14721f $r3 = new C14721f("", "", "", false, "no_rendering", "", "", 1.0f, 0, rect, null, $r53);
        $r5 = C13724q.m3901b($r3);
        C14719b $r4 = new C14719b(0.0f, rect, $r5);
        $r52 = C13724q.m3901b($r4);
        Item $r2 = new Item($r52);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Type m486a(C14720d c14720d) {
        C14592c $r3 = C14592c.f32345a;
        int $i0 = c14720d.m511d();
        String $r4 = $r3.get($i0);
        RectF $r5 = c14720d.m514a();
        Rect $r6 = C14621l.round($r5);
        Type $r1 = new Type($r4, $r6);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final C14719b m489a(C14590m c14590m, List list) {
        WindowManager.LayoutParams $r4 = c14590m.m1118f();
        Float $r5 = AnnotationVisitor.get($r4);
        float $f0 = $r5 != null ? $r5.floatValue() : 0.0f;
        Rect $r6 = c14590m.m1119d();
        int $i0 = $r6.left;
        Rect $r62 = c14590m.m1119d();
        int $i1 = $r62.top;
        Rect $r63 = c14590m.m1119d();
        int $i2 = $r63.width();
        Rect $r64 = c14590m.m1119d();
        int $i3 = $r64.height();
        C14719b $r2 = new C14719b($f0, $i0, $i1, $i2, $i3, list);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final C14721f m488a(Handle handle) {
        Label $r3 = handle.m523a();
        org.org.org.org.asm.Type $r4 = org.org.org.org.asm.Type.f32312c;
        View $r5 = $r3.getName();
        String $r6 = $r4.m1151a($r5, false);
        String $r7 = $r3.m520c();
        String $r8 = $r3.getCount();
        boolean $z0 = $r3.m519i();
        View $r52 = $r3.getName();
        String $r9 = C14619f.get($r52);
        View $r53 = $r3.getName();
        Class $r10 = $r53.getClass();
        String $r11 = $r10.getSimpleName();
        Log_OC.loadImage($r11, "renderingItem.view::class.java.simpleName");
        View $r54 = $r3.getName();
        String $r12 = C14619f.show($r54);
        View $r55 = $r3.getName();
        float $f0 = $r55.getAlpha();
        int $i2 = $r3.getIcon();
        Rect $r13 = $r3.m522a();
        int $i0 = $r13.left;
        Rect $r132 = $r3.m522a();
        int $i1 = $r132.top;
        Rect $r133 = $r3.m522a();
        int $i3 = $r133.width();
        Rect $r134 = $r3.m522a();
        int $i4 = $r134.height();
        C14544h $r14 = m487a($r3);
        List $r15 = handle.getName();
        C14721f $r2 = new C14721f($r6, $r7, $r8, $z0, $r9, $r11, $r12, $f0, $i2, $i0, $i1, $i3, $i4, $r14, m491a($r15));
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final List m485d(Rect rect) {
        List $r3;
        String $r2 = f32915c;
        Type $r1 = new Type($r2, rect);
        $r3 = C13724q.m3901b($r1);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0031 */
    /* JADX WARN: Incorrect condition in loop: B:17:0x006e */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.org.org.org.org.p602ui.asm.Item m490a(java.util.List r24, java.util.Map r25) {
        /*
            r23 = this;
            java.lang.String r2 = "roots"
            r0 = r24
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            if (r25 != 0) goto L22
            r0 = r24
            java.lang.Object r3 = kotlin.p557z.C13722p.m3952T(r0)
            r5 = r3
            org.org.org.org.asm.asm.m r5 = (org.org.org.org.asm.asm.C14590m) r5
            r4 = r5
            if (r4 == 0) goto L20
            android.graphics.Rect r6 = r4.m1119d()
            r0 = r23
            org.org.org.org.org.ui.asm.Item r7 = r0.m492a(r6)
            return r7
        L20:
            r8 = 0
            return r8
        L22:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0 = r24
            java.util.Iterator r10 = r0.iterator()
        L2d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L9e
            java.lang.Object r3 = r10.next()
            r12 = r3
            org.org.org.org.asm.asm.m r12 = (org.org.org.org.asm.asm.C14590m) r12
            r4 = r12
            int r13 = r4.hashCode()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r0 = r25
            java.lang.Object r3 = r0.get(r14)
            r15 = r3
            java.util.List r15 = (java.util.List) r15
            r24 = r15
            if (r24 == 0) goto L8c
            java.util.ArrayList r16 = new java.util.ArrayList
            r17 = 10
            r0 = r24
            r1 = r17
            int r13 = kotlin.p557z.C13722p.m3921o(r0, r1)
            r0 = r16
            r0.<init>(r13)
            r0 = r24
            java.util.Iterator r18 = r0.iterator()
        L68:
            r0 = r18
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L8e
            r0 = r18
            java.lang.Object r3 = r0.next()
            r20 = r3
            org.org.org.org.org.ui.asm.Handle r20 = (org.org.org.org.org.p602ui.asm.Handle) r20
            r19 = r20
            r0 = r23
            r1 = r19
            org.org.org.org.org.ui.asm.f r21 = r0.m488a(r1)
            r0 = r16
            r1 = r21
            r0.add(r1)
            goto L68
        L8c:
            r16 = 0
        L8e:
            if (r16 == 0) goto L2d
            r0 = r23
            r1 = r16
            org.org.org.org.org.ui.asm.b r22 = r0.m489a(r4, r1)
            r0 = r22
            r9.add(r0)
            goto L2d
        L9e:
            org.org.org.org.org.ui.asm.Item r7 = new org.org.org.org.org.ui.asm.Item
            r7.<init>(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.C14726f.m490a(java.util.List, java.util.Map):org.org.org.org.org.ui.asm.Item");
    }
}
