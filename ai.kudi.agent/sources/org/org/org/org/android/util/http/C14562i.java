package org.org.org.org.android.util.http;

import android.app.Activity;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p491i0.C11837e;
import kotlin.p491i0.C11841h;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import org.org.org.org.android.util.asm.ByteVector;
import org.org.org.org.android.util.asm.C14542f;
import org.org.org.org.android.util.asm.C14544h;
import org.org.org.org.android.util.asm.C14545i;
import org.org.org.org.android.util.asm.C14547m;
import org.org.org.org.android.util.asm.Item;
import org.org.org.org.android.util.asm.Location;
import org.org.org.org.android.util.asm.Node;
import org.org.org.org.android.util.lib.InterfaceC14567f;
import org.org.org.org.android.util.lib.InterfaceC14568i;
import org.org.org.org.asm.Type;
import org.org.org.org.asm.graph.C14601i;
import org.org.org.org.org.common.Buffer;
/* renamed from: org.org.org.org.android.util.http.i */
/* loaded from: classes.dex */
public final class C14562i extends AbstractC14561f {

    /* renamed from: g */
    public static final float f32236g;

    /* renamed from: a */
    public Float f32237a;

    /* renamed from: b */
    public Label f32238b;

    /* renamed from: c */
    public String f32239c;

    /* renamed from: d */
    public final InterfaceC14568i f32240d;

    /* renamed from: e */
    public final InterfaceC11824h f32241e;

    /* renamed from: f */
    public Float f32242f;

    /* renamed from: h */
    public float f32243h;

    /* renamed from: j */
    public float f32244j;

    /* renamed from: l */
    public Label f32245l;

    /* renamed from: p */
    public Float f32246p;

    /* renamed from: q */
    public final InterfaceC14567f f32247q;

    /* renamed from: r */
    public Float f32248r;

    /* renamed from: s */
    public double f32249s;

    /* renamed from: u */
    public MotionEvent f32250u;

    /* renamed from: w */
    public final WeakReference<View> f32251w;

    /* renamed from: x */
    public String f32252x;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        org.org.org.org.asm.p598ec.ClassWriter $r0 = org.org.org.org.asm.p598ec.ClassWriter.f32349b;
        float $f0 = $r0.put();
        f32236g = $f0 * 0.07f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14562i(WeakReference weakReference, InterfaceC14567f interfaceC14567f, InterfaceC14568i interfaceC14568i) {
        InterfaceC11824h $r3;
        Log_OC.getArray(interfaceC14567f, "multitouchCallback");
        Log_OC.getArray(interfaceC14568i, "gestureCallback");
        this.f32251w = weakReference;
        this.f32247q = interfaceC14567f;
        this.f32240d = interfaceC14568i;
        C14560b $r5 = C14560b.f32235a;
        $r3 = C13218k.m5625b($r5);
        this.f32241e = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001a */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List m1217a(android.view.MotionEvent r18) {
        /*
            r17 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = r2
            r2.<init>()
            r0 = r17
            r1 = r18
            kotlin.i0.e r4 = r0.setIcon(r1)
            r6 = r4
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r5 = r6
            java.util.Iterator r7 = r5.iterator()
        L16:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L4f
            r10 = r7
            kotlin.z.l0 r10 = (kotlin.p557z.AbstractC13711l0) r10
            r9 = r10
            int r11 = r9.mo4069b()
            r0 = r18
            int r12 = r0.getPointerId(r11)
            org.org.org.org.android.util.asm.Label r13 = new org.org.org.org.android.util.asm.Label
            r0 = r18
            float r14 = r0.getX(r11)
            r0 = r17
            float r15 = r0.f32243h
            float r14 = r14 + r15
            int r0 = (int) r14
            r16 = r0
            r0 = r18
            float r14 = r0.getY(r11)
            r0 = r17
            float r15 = r0.f32244j
            float r14 = r14 + r15
            int r11 = (int) r14
            r0 = r16
            r13.<init>(r0, r11, r12)
            r3.add(r13)
            goto L16
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.http.C14562i.m1217a(android.view.MotionEvent):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Item m1218a(Point point) {
        WeakReference $r4 = this.f32251w;
        if ($r4 != null) {
            Object $r5 = $r4.get();
            View $r6 = (View) $r5;
            if ($r6 != null) {
                Log_OC.loadImage($r6, "weakRootView?.get() ?: return null");
                Type $r7 = Type.f32312c;
                int $i0 = point.x;
                int $i1 = point.y;
                View $r62 = $r7.m1152a($r6, $i0, $i1);
                if ($r62 != null) {
                    try {
                        Buffer $r8 = getItem();
                        Activity $r9 = $r8.getString();
                        if ($r9 != null) {
                            C14544h $r10 = $r7.onSaveInstanceState($r62);
                            String $r11 = Type.m1148a($r7, $r62, false, 2, null);
                            Class $r12 = $r9.getClass();
                            String $r13 = $r12.getSimpleName();
                            Log_OC.loadImage($r13, "activity.javaClass.simpleName");
                            Class $r122 = $r62.getClass();
                            String $r14 = $r122.getSimpleName();
                            Log_OC.loadImage($r14, "clickedView.javaClass.simpleName");
                            Item $r2 = new Item($r10, $r11, $r13, $r14, "click", -1L, null, 64, null);
                            return $r2;
                        }
                        return null;
                    } catch (Exception e) {
                        return null;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final C14544h m1219a(float f, float f2) {
        View $r5;
        C14544h $r2 = new C14544h();
        Type $r1 = Type.f32312c;
        WeakReference $r3 = this.f32251w;
        if ($r3 != null) {
            Object $r4 = $r3.get();
            $r5 = (View) $r4;
        } else {
            $r5 = null;
        }
        int $i0 = (int) f;
        int $i1 = (int) f2;
        View $r52 = $r1.get($r5, $i0, $i1);
        if ($r52 != null) {
            C14544h $r22 = $r1.equals($r52);
            return $r22;
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Buffer getItem() {
        InterfaceC11824h $r2 = this.f32241e;
        Object $r1 = $r2.getValue();
        Buffer $r3 = (Buffer) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0020 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List process(android.view.MotionEvent r14) {
        /*
            r13 = this;
            kotlin.i0.e r0 = r13.setIcon(r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            r6 = 10
            int r5 = kotlin.p557z.C13722p.m3921o(r3, r6)
            r1.<init>(r5)
            r7 = r0
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r3 = r7
            java.util.Iterator r8 = r3.iterator()
        L1c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L36
            r11 = r8
            kotlin.z.l0 r11 = (kotlin.p557z.AbstractC13711l0) r11
            r10 = r11
            int r5 = r10.mo4069b()
            int r5 = r14.getPointerId(r5)
            java.lang.String r12 = java.lang.String.valueOf(r5)
            r2.add(r12)
            goto L1c
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.http.C14562i.process(android.view.MotionEvent):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final C11837e setIcon(MotionEvent motionEvent) {
        C11837e $r2;
        int $i0 = motionEvent.getPointerCount();
        $r2 = C11841h.m10262j(0, $i0);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    /* renamed from: a */
    public void mo1216a(MotionEvent motionEvent, float f, float f2) {
        Log_OC.getArray(motionEvent, "event");
        double $d0 = this.f32249s;
        double $d2 = f2;
        double $d1 = $d0 + Math.hypot(f, $d2);
        this.f32249s = $d1;
        MotionEvent $r2 = this.f32250u;
        if ($r2 == null) {
            InterfaceC14567f $r3 = this.f32247q;
            List $r5 = m1217a(motionEvent);
            Location $r4 = new Location($r5, null, 2, null);
            $r3.add("move", $r4);
        } else {
            float $f0 = f32236g;
            double $d02 = $f0;
            if ($d1 >= $d02) {
                InterfaceC14567f $r32 = this.f32247q;
                List $r52 = m1217a(motionEvent);
                Location $r42 = new Location($r52, null, 2, null);
                $r32.add("move", $r42);
                this.f32249s = 0.0d;
            }
        }
        this.f32250u = motionEvent;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    /* renamed from: a */
    public void mo1215a(MotionEvent motionEvent, Label label, float f) {
        double $d1;
        Log_OC.getArray(motionEvent, "event");
        Log_OC.getArray(label, "focus");
        this.f32238b = label;
        this.f32248r = Float.valueOf(f);
        Float $r5 = this.f32246p;
        if ($r5 != null) {
            float $f1 = $r5.floatValue();
            $d1 = $f1;
        } else {
            $d1 = 0.0d;
        }
        double $d0 = f;
        Double.isNaN($d0);
        double $d12 = Math.abs($d1 - $d0);
        if (this.f32248r != null && this.f32246p != null) {
            double $d2 = 10.0f;
            if ($d12 < $d2) {
                return;
            }
        }
        this.f32246p = Float.valueOf(f);
        if (this.f32252x == null) {
            C14601i $r6 = C14601i.f32355b;
            this.f32252x = $r6.m1104a();
        }
        InterfaceC14568i $r7 = this.f32240d;
        ByteVector $r8 = C14547m.f32147d;
        String $r2 = this.f32252x;
        Log_OC.append($r2);
        float $f0 = label.m1223b();
        float $f12 = label.m1222e();
        C14544h $r9 = m1219a($f0, $f12);
        C14542f $r3 = new C14542f(label);
        List $r10 = process(motionEvent);
        float $f02 = (float) Math.toRadians($d0);
        C14547m $r11 = $r8.m1346b($r2, false, $r9, $r3, $r10, $f02);
        $r7.mo1203d($r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    public void add(MotionEvent motionEvent) {
        List $r6;
        Log_OC.getArray(motionEvent, "event");
        InterfaceC14568i $r3 = this.f32240d;
        ByteVector $r1 = C14547m.f32147d;
        float $f0 = motionEvent.getX();
        float $f1 = motionEvent.getY();
        C14544h $r4 = m1219a($f0, $f1);
        C14542f $r5 = new C14542f(motionEvent);
        $r6 = C13726r.m3891e();
        C14547m $r7 = $r1.m1349a($r4, $r5, $r6);
        $r3.mo1203d($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    public void add(MotionEvent motionEvent, float f, float f2) {
        List $r7;
        Log_OC.getArray(motionEvent, "event");
        InterfaceC14568i $r4 = this.f32240d;
        ByteVector $r1 = C14547m.f32147d;
        float $f2 = motionEvent.getX();
        float $f3 = motionEvent.getY();
        C14544h $r5 = m1219a($f2, $f3);
        C14542f $r6 = new C14542f(motionEvent);
        $r7 = C13726r.m3891e();
        double $d1 = f;
        double $d0 = f2;
        float $f22 = (float) Math.hypot($d1, $d0);
        C14545i $r2 = new C14545i(f, f2);
        C14547m $r8 = $r1.m1348a($r5, $r6, $r7, $f22, $r2);
        $r4.mo1203d($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    public void add(List list) {
        Log_OC.getArray(list, "rageEvents");
        try {
            Buffer $r4 = getItem();
            Activity $r5 = $r4.getString();
            if ($r5 != null) {
                InterfaceC14568i $r6 = this.f32240d;
                Class $r7 = $r5.getClass();
                String $r8 = $r7.getSimpleName();
                Log_OC.loadImage($r8, "activity.javaClass.simpleName");
                Node $r1 = new Node($r8, null, 2, null);
                $r6.mo1204d($r1);
            }
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    /* renamed from: b */
    public void mo1214b(MotionEvent motionEvent) {
        String $r7;
        List $r4;
        String $r72;
        List $r42;
        Log_OC.getArray(motionEvent, "event");
        MotionEvent $r1 = this.f32250u;
        if ($r1 != null) {
            InterfaceC14567f $r2 = this.f32247q;
            List $r43 = m1217a($r1);
            Location $r3 = new Location($r43, null, 2, null);
            $r2.add("move", $r3);
            this.f32250u = null;
        }
        Float $r5 = this.f32248r;
        if ($r5 != null) {
            if (this.f32238b != null && ($r72 = this.f32252x) != null) {
                InterfaceC14568i $r8 = this.f32240d;
                ByteVector $r9 = C14547m.f32147d;
                Log_OC.append($r72);
                Label $r6 = this.f32238b;
                Log_OC.append($r6);
                float $f0 = $r6.m1223b();
                Label $r62 = this.f32238b;
                Log_OC.append($r62);
                float $f1 = $r62.m1222e();
                C14544h $r10 = m1219a($f0, $f1);
                Label $r63 = this.f32238b;
                Log_OC.append($r63);
                C14542f $r11 = new C14542f($r63);
                $r42 = C13726r.m3891e();
                Float $r52 = this.f32248r;
                Log_OC.append($r52);
                float $f02 = $r52.floatValue();
                double $d0 = $f02;
                float $f03 = (float) Math.toRadians($d0);
                C14547m $r12 = $r9.m1346b($r72, true, $r10, $r11, $r42, $f03);
                $r8.mo1203d($r12);
                this.f32252x = null;
                this.f32238b = null;
                this.f32248r = null;
                this.f32246p = null;
            }
        }
        Float $r53 = this.f32237a;
        if ($r53 == null || this.f32245l == null || ($r7 = this.f32239c) == null) {
            return;
        }
        InterfaceC14568i $r82 = this.f32240d;
        ByteVector $r92 = C14547m.f32147d;
        Log_OC.append($r7);
        Label $r64 = this.f32245l;
        Log_OC.append($r64);
        float $f04 = $r64.m1223b();
        Label $r65 = this.f32245l;
        Log_OC.append($r65);
        float $f12 = $r65.m1222e();
        C14544h $r102 = m1219a($f04, $f12);
        Label $r66 = this.f32245l;
        Log_OC.append($r66);
        C14542f $r112 = new C14542f($r66);
        $r4 = C13726r.m3891e();
        Float $r54 = this.f32237a;
        Log_OC.append($r54);
        float $f05 = $r54.floatValue();
        double $d02 = $f05;
        float $f06 = (float) Math.toRadians($d02);
        C14547m $r122 = $r92.m1351a($r7, true, $r102, $r112, $r4, $f06);
        $r82.mo1203d($r122);
        this.f32239c = null;
        this.f32245l = null;
        this.f32237a = null;
        this.f32242f = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    /* renamed from: b */
    public void mo1213b(MotionEvent motionEvent, Label label, float f) {
        double $d0;
        Log_OC.getArray(motionEvent, "event");
        Log_OC.getArray(label, "focus");
        this.f32245l = label;
        this.f32237a = Float.valueOf(f);
        Float $r5 = this.f32242f;
        if ($r5 != null) {
            float $f1 = $r5.floatValue();
            $d0 = $f1;
        } else {
            $d0 = 0.0d;
        }
        double $d1 = f;
        Double.isNaN($d1);
        double $d02 = Math.abs($d0 - $d1);
        if (this.f32237a == null || this.f32242f == null || $d02 >= 0.25d) {
            this.f32242f = Float.valueOf(f);
            if (this.f32239c == null) {
                C14601i $r7 = C14601i.f32355b;
                this.f32239c = $r7.m1104a();
            }
            InterfaceC14568i $r8 = this.f32240d;
            ByteVector $r2 = C14547m.f32147d;
            String $r6 = this.f32239c;
            Log_OC.append($r6);
            float $f12 = label.m1223b();
            float $f2 = label.m1222e();
            C14544h $r9 = m1219a($f12, $f2);
            C14542f $r3 = new C14542f(label);
            List $r10 = process(motionEvent);
            C14547m $r11 = $r2.m1351a($r6, false, $r9, $r3, $r10, f);
            $r8.mo1203d($r11);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    public void clear(MotionEvent motionEvent) {
        Log_OC.getArray(motionEvent, "event");
        InterfaceC14567f $r4 = this.f32247q;
        List $r2 = m1217a(motionEvent);
        Location $r1 = new Location($r2, null, 2, null);
        $r4.add("move", $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    /* renamed from: d */
    public void mo1212d(MotionEvent motionEvent) {
        List $r6;
        Log_OC.getArray(motionEvent, "event");
        InterfaceC14568i $r3 = this.f32240d;
        ByteVector $r1 = C14547m.f32147d;
        float $f0 = motionEvent.getX();
        float $f1 = motionEvent.getY();
        C14544h $r4 = m1219a($f0, $f1);
        C14542f $r5 = new C14542f(motionEvent);
        $r6 = C13726r.m3891e();
        C14547m $r7 = $r1.get($r4, $r5, $r6);
        $r3.mo1203d($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    /* renamed from: i */
    public void mo1211i(MotionEvent motionEvent) {
        Log_OC.getArray(motionEvent, "event");
        InterfaceC14567f $r4 = this.f32247q;
        List $r2 = m1217a(motionEvent);
        Location $r1 = new Location($r2, null, 2, null);
        $r4.add("move", $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    public void onTouchEvent(MotionEvent motionEvent) {
        Log_OC.getArray(motionEvent, "event");
        this.f32249s = 0.0d;
        this.f32246p = null;
        float $f0 = motionEvent.getRawX();
        float $f1 = motionEvent.getX(0);
        this.f32243h = $f0 - $f1;
        float $f02 = motionEvent.getRawY();
        float $f12 = motionEvent.getY(0);
        this.f32244j = $f02 - $f12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.util.http.AbstractC14561f
    public void run(MotionEvent motionEvent) {
        Log_OC.getArray(motionEvent, "event");
        List $r3 = m1217a(motionEvent);
        Location $r2 = new Location($r3, null, 2, null);
        List $r32 = $r2.getPath();
        Object $r5 = C13722p.m3954R($r32);
        org.org.org.org.android.util.asm.Label $r6 = (org.org.org.org.android.util.asm.Label) $r5;
        int $i0 = $r6.m1332a();
        List $r33 = $r2.getPath();
        Object $r52 = C13722p.m3954R($r33);
        org.org.org.org.android.util.asm.Label $r62 = (org.org.org.org.android.util.asm.Label) $r52;
        int $i1 = $r62.getOffset();
        Point $r4 = new Point($i0, $i1);
        InterfaceC14567f $r7 = this.f32247q;
        $r7.add("tap", $r2);
        InterfaceC14568i $r8 = this.f32240d;
        Item $r9 = m1218a($r4);
        $r8.mo1205d($r9);
    }
}
