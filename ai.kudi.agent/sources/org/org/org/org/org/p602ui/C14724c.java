package org.org.org.org.org.p602ui;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
import org.org.org.org.asm.Label;
import org.org.org.org.asm.asm.Attribute;
import org.org.org.org.asm.util.C14619f;
import org.org.org.org.asm.util.C14621l;
import org.org.org.org.org.p602ui.asm.C14720d;
import org.org.org.org.org.p602ui.asm.Handle;
/* renamed from: org.org.org.org.org.ui.c */
/* loaded from: classes.dex */
public final class C14724c {

    /* renamed from: a */
    public final InterfaceC11824h f32912a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14724c() {
        InterfaceC11824h $r1;
        StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2 $r2 = StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2.INSTANCE;
        $r1 = C13218k.m5625b($r2);
        this.f32912a = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Rect m502a(StaticLayout staticLayout, int i) {
        float $f0 = staticLayout.getLineLeft(i);
        int $i1 = (int) $f0;
        int $i2 = staticLayout.getLineBaseline(i);
        int $i3 = staticLayout.getLineAscent(i);
        int $i22 = $i2 + $i3;
        float $f02 = staticLayout.getLineLeft(i);
        int $i32 = (int) $f02;
        float $f03 = staticLayout.getLineMax(i);
        int $i4 = (int) $f03;
        int $i33 = $i32 + $i4;
        int $i42 = staticLayout.getLineBaseline(i);
        int $i0 = staticLayout.getLineDescent(i);
        Rect $r1 = new Rect($i1, $i22, $i33, $i42 + $i0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Rect m501a(View view, C14727h c14727h, Rect $r3, Rect rect) {
        int $i2;
        Rect $r10;
        boolean $z0 = rect.isEmpty();
        Integer $r5 = null;
        if ($z0) {
            return null;
        }
        boolean $z02 = view instanceof ImageView;
        if ($z02) {
            boolean $z03 = c14727h.m479n();
            if ($z03) {
                Label $r6 = Label.f32309i;
                int $i0 = c14727h.getIcon();
                int $i1 = c14727h.m483d();
                ImageView $r7 = (ImageView) view;
                return $r6.draw($i0, $i1, $r3, rect, $r7);
            }
        }
        Attribute $r8 = C14619f.draw(view, $r3);
        Integer $r9 = c14727h.getCount();
        if ($r8 != null) {
            int $i02 = $r8.getValue();
            $r5 = Integer.valueOf($i02);
        }
        if ($r5 == null && $r9 == null) {
            return rect;
        }
        if ($r8 != null && ($r10 = $r8.m1143a()) != null) {
            $r3 = $r10;
        }
        Rect $r102 = c14727h.m480m();
        int $i03 = $r102.width();
        Rect $r103 = c14727h.m480m();
        int $i12 = $r103.height();
        if ($r8 != null) {
            $i2 = $r8.getValue();
        } else {
            Log_OC.append($r9);
            $i2 = $r9.intValue();
        }
        return apply($r3, rect, $i03, $i12, $i2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:27:0x0081 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List m503a(android.graphics.drawable.Drawable r31) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.C14724c.m503a(android.graphics.drawable.Drawable):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:11:0x009d */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List m500a(android.widget.TextView r26, android.graphics.Rect r27, boolean r28) {
        /*
            r25 = this;
            android.graphics.Rect r3 = new android.graphics.Rect
            r4 = r3
            r0 = r27
            r3.<init>(r0)
            r0 = r26
            int r5 = r0.getCompoundPaddingLeft()
            r0 = r26
            int r6 = r0.getCompoundPaddingTop()
            r0 = r26
            int r7 = r0.getCompoundPaddingRight()
            r0 = r26
            int r8 = r0.getCompoundPaddingBottom()
            org.org.org.org.asm.util.C14621l.draw(r4, r5, r6, r7, r8)
            int r5 = r4.width()
            r0 = r26
            android.text.StaticLayout r9 = org.org.org.org.asm.util.Snackbar.show(r0, r5)
            int r5 = r9.getLineCount()
            r11 = 0
            kotlin.i0.e r10 = kotlin.p491i0.C11839f.m10272j(r11, r5)
            r13 = r10
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r12 = r13
            kotlin.k0.h r14 = kotlin.p557z.C13722p.m3965H(r12)
            org.org.org.org.org.ui.e r15 = new org.org.org.org.org.ui.e
            r0 = r25
            r15.<init>(r0, r9)
            kotlin.k0.h r14 = kotlin.p548k0.C13231i.m5595r(r14, r15)
            java.util.List r16 = kotlin.p548k0.C13231i.m5590x(r14)
            r0 = r16
            boolean r17 = r0.isEmpty()
            if (r17 == 0) goto L5a
            java.util.List r16 = kotlin.p557z.C13722p.m3941e()
            goto L80
        L5a:
            r0 = r16
            int r5 = r0.size()
            r11 = 1
            if (r5 != r11) goto L72
            r0 = r26
            int r5 = r0.getGravity()
            r0 = r25
            r1 = r16
            java.util.List r16 = r0.apply(r1, r5, r4)
            goto L80
        L72:
            r0 = r26
            int r5 = r0.getGravity()
            r0 = r25
            r1 = r16
            java.util.List r16 = r0.get(r1, r5, r4)
        L80:
            java.util.ArrayList r18 = new java.util.ArrayList
            r19 = r18
            r11 = 10
            r0 = r16
            int r5 = kotlin.p557z.C13722p.m3921o(r0, r11)
            r0 = r18
            r0.<init>(r5)
            r0 = r16
            java.util.Iterator r20 = r0.iterator()
        L97:
            r0 = r20
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto Lc5
            r0 = r20
            java.lang.Object r21 = r0.next()
            r23 = r21
            android.graphics.RectF r23 = (android.graphics.RectF) r23
            r22 = r23
            org.org.org.org.org.ui.asm.d r24 = new org.org.org.org.org.ui.asm.d
            r0 = r26
            int r5 = r0.getCurrentTextColor()
            r11 = 1
            r0 = r24
            r1 = r22
            r2 = r28
            r0.<init>(r5, r1, r11, r2)
            r0 = r19
            r1 = r24
            r0.add(r1)
            goto L97
        Lc5:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.C14724c.m500a(android.widget.TextView, android.graphics.Rect, boolean):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0066 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001d */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0039 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List m498a(org.org.org.org.org.p602ui.asm.Label r18) {
        /*
            r17 = this;
            r0 = r18
            android.view.View r2 = r0.getName()
            java.util.List r3 = org.org.org.org.asm.util.C14619f.m1036a(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r5 = kotlin.p557z.C13722p.m3921o(r3, r6)
            r4.<init>(r5)
            java.util.Iterator r7 = r3.iterator()
        L19:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L4f
            java.lang.Object r9 = r7.next()
            r11 = r9
            org.org.org.org.asm.asm.Type r11 = (org.org.org.org.asm.asm.Type) r11
            r10 = r11
            android.graphics.drawable.Drawable r12 = r10.m1138a()
            r0 = r17
            java.util.List r3 = r0.m503a(r12)
            java.util.Iterator r13 = r3.iterator()
        L35:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L4b
            java.lang.Object r9 = r13.next()
            r15 = r9
            org.org.org.org.org.ui.h r15 = (org.org.org.org.org.p602ui.C14727h) r15
            r14 = r15
            boolean r8 = r10.getValue()
            r14.m482d(r8)
            goto L35
        L4b:
            r4.add(r3)
            goto L19
        L4f:
            java.util.List r3 = kotlin.p557z.C13722p.m3917r(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r5 = kotlin.p557z.C13722p.m3921o(r3, r6)
            r4.<init>(r5)
            java.util.Iterator r7 = r3.iterator()
        L62:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7e
            java.lang.Object r9 = r7.next()
            r16 = r9
            org.org.org.org.org.ui.h r16 = (org.org.org.org.org.p602ui.C14727h) r16
            r14 = r16
            r0 = r17
            r1 = r18
            java.util.List r3 = r0.m496a(r1, r14)
            r4.add(r3)
            goto L62
        L7e:
            java.util.List r3 = kotlin.p557z.C13722p.m3917r(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.C14724c.m498a(org.org.org.org.org.ui.asm.Label):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final List m496a(org.org.org.org.org.p602ui.asm.Label label, C14727h c14727h) {
        ArrayList $r2 = new ArrayList();
        View $r5 = label.getName();
        Rect $r6 = label.getValue();
        Rect $r7 = label.m522a();
        Rect $r62 = m501a($r5, c14727h, $r6, $r7);
        if ($r62 != null) {
            int $i0 = c14727h.m481f();
            RectF $r8 = C14621l.add($r62);
            C14720d $r3 = new C14720d($i0, $r8, false, false, 12, null);
            $r2.add($r3);
        }
        Rect $r63 = label.m522a();
        Rect $r72 = label.getValue();
        boolean $z0 = Log_OC.append($r63, $r72);
        if (!$z0) {
            View $r52 = label.getName();
            Rect $r64 = label.getValue();
            Rect $r73 = label.getValue();
            Rect $r65 = m501a($r52, c14727h, $r64, $r73);
            if ($r65 != null) {
                int $i02 = c14727h.m481f();
                RectF $r82 = C14621l.add($r65);
                C14720d $r32 = new C14720d($i02, $r82, false, true, 4, null);
                $r2.add($r32);
            }
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Label m504a() {
        InterfaceC11824h $r2 = this.f32912a;
        Object $r1 = $r2.getValue();
        Label $r3 = (Label) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Handle m497a(org.org.org.org.org.p602ui.asm.Label label, String str) {
        ArrayList $r2 = new ArrayList();
        List $r4 = m498a(label);
        $r2.addAll($r4);
        View $r5 = label.getName();
        boolean $z0 = $r5 instanceof TextView;
        if ($z0) {
            View $r52 = label.getName();
            TextView $r6 = (TextView) $r52;
            CharSequence $r7 = $r6.getText();
            Log_OC.loadImage($r7, "renderItem.view.text");
            int $i0 = $r7.length();
            boolean $z02 = $i0 > 0;
            if ($z02) {
                boolean $z03 = Log_OC.append(str, "simplified_wireframe");
                if ($z03) {
                    List $r42 = m494b(label);
                    $r2.addAll($r42);
                } else {
                    List $r43 = write(label);
                    $r2.addAll($r43);
                }
            }
        }
        Handle $r8 = new Handle(label, $r2);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Rect apply(int i, Rect rect, Rect rect2) {
        Rect $r2 = new Rect();
        int $i1 = rect.width();
        int $i2 = rect.height();
        Gravity.apply(i, $i1, $i2, rect2, $r2);
        return $r2;
    }

    private final Rect apply(Rect rect, Rect rect2) {
        rect.intersect(rect2);
        return rect;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Rect apply(Rect rect, Rect rect2, int i, int i2, int i3) {
        Rect $r2 = new Rect();
        Gravity.apply(i3, i, i2, rect, $r2);
        boolean $z0 = $r2.intersect(rect2);
        if ($z0) {
            return $r2;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x005c */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0013 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0038 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List apply(java.util.List r13, int r14, android.graphics.Rect r15) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r1 = kotlin.p557z.C13722p.m3921o(r13, r2)
            r0.<init>(r1)
            java.util.Iterator r3 = r13.iterator()
        Lf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L25
            java.lang.Object r5 = r3.next()
            r7 = r5
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            r6 = r7
            android.graphics.Rect r6 = r12.apply(r14, r6, r15)
            r0.add(r6)
            goto Lf
        L25:
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r14 = kotlin.p557z.C13722p.m3921o(r0, r2)
            r8.<init>(r14)
            java.util.Iterator r3 = r0.iterator()
        L34:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r5 = r3.next()
            r9 = r5
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            r6 = r9
            r12.apply(r6, r15)
            r8.add(r6)
            goto L34
        L49:
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r14 = kotlin.p557z.C13722p.m3921o(r8, r2)
            r0.<init>(r14)
            java.util.Iterator r3 = r8.iterator()
        L58:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6e
            java.lang.Object r5 = r3.next()
            r10 = r5
            android.graphics.Rect r10 = (android.graphics.Rect) r10
            r15 = r10
            android.graphics.RectF r11 = org.org.org.org.asm.util.C14621l.add(r15)
            r0.add(r11)
            goto L58
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.C14724c.apply(java.util.List, int, android.graphics.Rect):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    private final List m494b(org.org.org.org.org.p602ui.asm.Label label) {
        List $r9;
        View $r4 = label.getName();
        if ($r4 == null) {
            NullPointerException $r10 = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            throw $r10;
        }
        TextView $r5 = (TextView) $r4;
        ArrayList $r1 = new ArrayList();
        int $i0 = $r5.getCurrentTextColor();
        Rect $r7 = label.m522a();
        RectF $r2 = new RectF($r7);
        C14720d $r6 = new C14720d($i0, $r2, true, false);
        $r1.add($r6);
        Rect $r72 = label.m522a();
        Rect $r8 = label.getValue();
        boolean $z0 = Log_OC.append($r72, $r8);
        if (!$z0) {
            int $i02 = $r5.getCurrentTextColor();
            Rect $r73 = label.getValue();
            RectF $r22 = new RectF($r73);
            C14720d $r62 = new C14720d($i02, $r22, true, true);
            $r1.add($r62);
        }
        $r9 = C13742z.m3825B0($r1);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x00d6 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0070 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x00a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List get(java.util.List r24, int r25, android.graphics.Rect r26) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.C14724c.get(java.util.List, int, android.graphics.Rect):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0013 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List write(java.util.List r10, java.lang.String r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r1 = kotlin.p557z.C13722p.m3921o(r10, r2)
            r0.<init>(r1)
            java.util.Iterator r3 = r10.iterator()
        Lf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L25
            java.lang.Object r5 = r3.next()
            r7 = r5
            org.org.org.org.org.ui.asm.Label r7 = (org.org.org.org.org.p602ui.asm.Label) r7
            r6 = r7
            org.org.org.org.org.ui.asm.Handle r8 = r9.m497a(r6, r11)
            r0.add(r8)
            goto Lf
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.C14724c.write(java.util.List, java.lang.String):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final List write(org.org.org.org.org.p602ui.asm.Label label) {
        List $r6;
        View $r3 = label.getName();
        if ($r3 == null) {
            NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            throw $r8;
        }
        TextView $r4 = (TextView) $r3;
        ArrayList $r1 = new ArrayList();
        Rect $r5 = label.m522a();
        List $r62 = m500a($r4, $r5, false);
        $r1.addAll($r62);
        Rect $r52 = label.m522a();
        Rect $r7 = label.getValue();
        boolean $z0 = Log_OC.append($r52, $r7);
        if (!$z0) {
            Rect $r53 = label.getValue();
            List $r63 = m500a($r4, $r53, true);
            $r1.addAll($r63);
        }
        $r6 = C13742z.m3825B0($r1);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0017 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map m499a(java.util.List r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "roots"
            kotlin.p483e0.p485d.Log_OC.getArray(r13, r0)
            java.lang.String r0 = "activeRenderingMode"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r2 = r13.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r4 = r2.next()
            r6 = r4
            org.org.org.org.asm.asm.m r6 = (org.org.org.org.asm.asm.C14590m) r6
            r5 = r6
            org.org.org.org.org.ui.Label r7 = r12.m504a()
            android.view.View r8 = r5.getName()
            java.util.List r13 = r7.m538a(r8)
            java.util.List r13 = r12.write(r13, r14)
            int r9 = r5.hashCode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r1.put(r10, r13)
            goto L13
        L3d:
            java.util.Map r11 = kotlin.p557z.C13721o0.m3976v(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.p602ui.C14724c.m499a(java.util.List, java.lang.String):java.util.Map");
    }
}
