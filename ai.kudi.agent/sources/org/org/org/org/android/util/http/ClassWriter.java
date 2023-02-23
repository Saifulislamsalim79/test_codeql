package org.org.org.org.android.util.http;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import e.a.a.a.f.u.h;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13742z;
import org.org.org.org.asm.C14598f;
import org.org.org.org.asm.asm.AbstractMapBasedMultiset;
/* loaded from: classes.dex */
public final class ClassWriter {

    /* renamed from: D */
    public static final int f32203D;

    /* renamed from: H */
    public static final int f32204H;

    /* renamed from: d */
    public static final int f32205d;

    /* renamed from: q */
    public static final int f32206q;

    /* renamed from: C */
    public final Handler f32207C;

    /* renamed from: a */
    public MotionEvent f32208a;

    /* renamed from: b */
    public Label f32209b;

    /* renamed from: c */
    public Label f32210c;

    /* renamed from: e */
    public Label f32211e;

    /* renamed from: f */
    public int f32212f;

    /* renamed from: g */
    public int f32213g;

    /* renamed from: h */
    public boolean f32214h;

    /* renamed from: i */
    public boolean f32215i;

    /* renamed from: j */
    public boolean f32216j;

    /* renamed from: k */
    public Label f32217k;

    /* renamed from: l */
    public final AbstractC14561f f32218l;

    /* renamed from: m */
    public boolean f32219m;
    public int mMaximumFlingVelocity;
    public int mMinimumFlingVelocity;
    public MotionEvent mPreviousUpEvent;
    public VelocityTracker mVelocityTracker;

    /* renamed from: n */
    public int f32220n;

    /* renamed from: p */
    public boolean f32221p;

    /* renamed from: r */
    public boolean f32222r;

    /* renamed from: s */
    public boolean f32223s;

    /* renamed from: t */
    public int f32224t;

    /* renamed from: u */
    public int f32225u;

    /* renamed from: v */
    public final h<MotionEvent> f32226v;

    /* renamed from: w */
    public int f32227w;

    /* renamed from: x */
    public boolean f32228x;

    /* renamed from: y */
    public float f32229y;

    /* renamed from: z */
    public int f32230z;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        boolean $z0;
        int $i0 = ViewConfiguration.getLongPressTimeout();
        f32206q = $i0;
        int $i02 = ViewConfiguration.getTapTimeout();
        f32205d = $i02;
        int $i03 = ViewConfiguration.getDoubleTapTimeout();
        f32204H = $i03;
        $z0 = C13276s.m5440u("");
        short $s1 = !$z0 ? (short) 1250 : (short) 750;
        f32203D = $s1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ClassWriter(AbstractC14561f abstractC14561f) {
        Log_OC.getArray(abstractC14561f, "callback");
        this.f32218l = abstractC14561f;
        this.f32213g = 10;
        Label $r3 = new Label();
        this.f32209b = $r3;
        Label $r32 = new Label();
        this.f32211e = $r32;
        this.f32212f = -1;
        this.f32220n = -1;
        AbstractMapBasedMultiset $r4 = new AbstractMapBasedMultiset(4);
        this.f32226v = $r4;
        this.f32207C = new Handler() { // from class: org.org.org.org.android.util.http.SlidingDrawer$SlidingHandler
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r1 = this;
                    org.org.org.org.android.util.http.ClassWriter.this = r2
                    android.os.Looper r0 = android.os.Looper.getMainLooper()
                    r1.<init>(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.http.SlidingDrawer$SlidingHandler.<init>(org.org.org.org.android.util.http.ClassWriter):void");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Log_OC.getArray(message, "msg");
                int $i0 = message.what;
                if ($i0 == 1) {
                    ClassWriter $r2 = ClassWriter.this;
                    AbstractC14561f $r33 = $r2.get();
                    ClassWriter $r22 = ClassWriter.this;
                    MotionEvent $r42 = $r22.f32208a;
                    Log_OC.append($r42);
                    $r33.set($r42);
                } else if ($i0 == 2) {
                    ClassWriter $r23 = ClassWriter.this;
                    $r23.m1226c();
                } else if ($i0 != 3) {
                    String $r7 = "Unknown message " + message;
                    RuntimeException $r5 = new RuntimeException($r7);
                    throw $r5;
                } else {
                    ClassWriter $r24 = ClassWriter.this;
                    boolean $z0 = $r24.f32221p;
                    if ($z0) {
                        ClassWriter $r25 = ClassWriter.this;
                        $r25.f32228x = true;
                        return;
                    }
                    ClassWriter $r26 = ClassWriter.this;
                    AbstractC14561f $r34 = $r26.get();
                    ClassWriter $r27 = ClassWriter.this;
                    MotionEvent $r43 = $r27.f32208a;
                    Log_OC.append($r43);
                    $r34.remove($r43);
                }
            }
        };
        C14598f $r6 = C14598f.f32351c;
        Context $r1 = $r6.getContext();
        init($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final float m1230a(Label label, Label label2) {
        float $f0 = label.m1222e();
        float $f1 = label2.m1222e();
        double $d0 = $f0 - $f1;
        float $f02 = label.m1223b();
        float $f12 = label2.m1223b();
        double $d1 = $f02 - $f12;
        float $f03 = (float) Math.atan2($d0, $d1);
        double $d02 = $f03;
        float $f04 = (float) Math.toDegrees($d02);
        float $f05 = $f04 % 360.0f;
        if ($f05 < -180.0f) {
            $f05 += 360.0f;
        }
        return $f05 > 180.0f ? $f05 - 360.0f : $f05;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Label m1234a(int i, int $i1, MotionEvent motionEvent) {
        int $i2 = i & 255;
        boolean $z0 = $i2 == 6;
        int $i22 = $z0 ? motionEvent.getActionIndex() : -1;
        float $f0 = 0.0f;
        float $f1 = 0.0f;
        for (int $i0 = 0; $i0 < $i1; $i0++) {
            if ($i22 != $i0) {
                $f0 += motionEvent.getX($i0);
                $f1 += motionEvent.getY($i0);
            }
        }
        if ($z0) {
            $i1--;
        }
        float $f2 = $i1;
        Label $r2 = new Label($f0 / $f2, $f1 / $f2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m1235a() {
        Handler $r1 = this.f32207C;
        $r1.removeMessages(1);
        $r1.removeMessages(2);
        $r1.removeMessages(3);
        this.f32212f = -1;
        this.f32220n = -1;
        VelocityTracker $r2 = this.mVelocityTracker;
        if ($r2 != null) {
            $r2.recycle();
        }
        this.mVelocityTracker = null;
        this.f32214h = false;
        this.f32221p = false;
        this.f32215i = false;
        this.f32222r = false;
        this.f32228x = false;
        this.f32223s = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m1233a(MotionEvent motionEvent) {
        List $r5;
        motionEvent.getEventTime();
        h<MotionEvent> hVar = this.f32226v;
        MotionEvent $r1 = MotionEvent.obtain(motionEvent);
        Log_OC.loadImage($r1, "MotionEvent.obtain(event)");
        hVar.add($r1);
        int $i0 = this.f32226v.size();
        if ($i0 < 4) {
            return;
        }
        Object $r3 = this.f32226v.peekLast();
        Log_OC.loadImage($r3, "lastUpEvents.peekLast()");
        long $l1 = ((MotionEvent) $r3).getEventTime();
        Object $r32 = this.f32226v.peekFirst();
        Log_OC.loadImage($r32, "lastUpEvents.peekFirst()");
        long $l2 = ((MotionEvent) $r32).getEventTime();
        long $l12 = $l1 - $l2;
        int $i02 = f32203D;
        long $l22 = $i02;
        if ($l12 < $l22) {
            AbstractC14561f $r4 = this.f32218l;
            $r5 = C13742z.m3825B0(this.f32226v);
            $r4.add($r5);
            this.f32226v.clear();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final boolean m1232a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        boolean $z0 = this.f32222r;
        if ($z0) {
            long $l0 = motionEvent3.getEventTime();
            long $l1 = motionEvent2.getEventTime();
            long $l02 = $l0 - $l1;
            int $i2 = f32204H;
            long $l12 = $i2;
            if ($l02 <= $l12) {
                long $l13 = 40;
                if ($l02 < $l13) {
                    return false;
                }
                float $f0 = motionEvent.getX();
                int $i22 = (int) $f0;
                float $f02 = motionEvent3.getX();
                int $i4 = (int) $f02;
                int $i23 = $i22 - $i4;
                float $f03 = motionEvent.getY();
                int $i42 = (int) $f03;
                float $f04 = motionEvent3.getY();
                int $i5 = (int) $f04;
                int $i43 = $i42 - $i5;
                int $i52 = motionEvent.getFlags();
                boolean $z02 = ($i52 & 8) != 0;
                int $i53 = $z02 ? 0 : this.f32230z;
                return ($i23 * $i23) + ($i43 * $i43) < $i53;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    private final void m1229b(MotionEvent motionEvent) {
        int $i0 = motionEvent.getPointerCount();
        if ($i0 == 2) {
            Label $r2 = this.f32210c;
            if ($r2 != null) {
                Label $r22 = this.f32217k;
                if ($r22 != null) {
                    a$b$a $r3 = Label.f32231h;
                    Label $r23 = $r3.get(motionEvent, 0);
                    Label $r4 = $r3.get(motionEvent, 1);
                    float $f1 = get($r23, $r4);
                    boolean $z0 = this.f32219m;
                    if (!$z0) {
                        int $i02 = this.f32227w;
                        float $f0 = $i02;
                        if ($f1 < $f0) {
                            return;
                        }
                    }
                    this.f32219m = true;
                    AbstractC14561f $r5 = this.f32218l;
                    Label $r24 = this.f32211e;
                    float $f02 = this.f32229y;
                    $r5.mo1213b(motionEvent, $r24, $f1 / $f02);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final void m1226c() {
        Handler $r1 = this.f32207C;
        $r1.removeMessages(3);
        this.f32228x = false;
        this.f32223s = true;
        AbstractC14561f $r2 = this.f32218l;
        MotionEvent $r3 = this.f32208a;
        Log_OC.append($r3);
        $r2.mo1212d($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    private final void m1225c(MotionEvent motionEvent) {
        a$b$a $r2;
        Label $r3;
        Label $r4;
        int $i0 = this.f32212f;
        if ($i0 != -1) {
            int $i1 = this.f32220n;
            if ($i1 == -1 || ($r3 = ($r2 = Label.f32231h).m1221a(motionEvent, $i0)) == null || ($r4 = $r2.m1221a(motionEvent, this.f32220n)) == null) {
                return;
            }
            float $f0 = m1230a($r3, $r4);
            boolean $z0 = this.f32216j;
            if (!$z0) {
                float $f1 = Math.abs($f0);
                float $f2 = this.f32213g;
                if ($f1 < $f2) {
                    return;
                }
            }
            this.f32216j = true;
            AbstractC14561f $r5 = this.f32218l;
            $r5.mo1215a(motionEvent, this.f32211e, $f0);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final void m1224d() {
        Handler $r1 = this.f32207C;
        $r1.removeMessages(1);
        $r1.removeMessages(2);
        $r1.removeMessages(3);
        this.f32214h = false;
        this.f32215i = false;
        this.f32222r = false;
        this.f32228x = false;
        this.f32223s = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final float get(Label label, Label label2) {
        float $f0 = label2.m1222e();
        float $f1 = label.m1222e();
        float $f02 = Math.abs($f0 - $f1);
        float $f12 = label2.m1223b();
        float $f2 = label.m1223b();
        double $d0 = $f02;
        double $d1 = Math.abs($f12 - $f2);
        float $f03 = (float) Math.hypot($d0, $d1);
        return $f03;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final int getPointerId(MotionEvent motionEvent) {
        int $i0 = motionEvent.getActionIndex();
        return motionEvent.getPointerId($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void init(Context context) {
        ViewConfiguration $r2 = ViewConfiguration.get(context);
        int $i0 = $r2.getScaledTouchSlop();
        int $i1 = $r2.getScaledTouchSlop();
        int $i2 = $r2.getScaledDoubleTapSlop();
        int $i3 = $r2.getScaledMinimumFlingVelocity();
        this.mMinimumFlingVelocity = $i3;
        int $i32 = $r2.getScaledMaximumFlingVelocity();
        this.mMaximumFlingVelocity = $i32;
        this.f32224t = $i0 * $i0;
        this.f32225u = $i1 * $i1;
        this.f32230z = $i2 * $i2;
        org.org.org.org.asm.p598ec.ClassWriter $r3 = org.org.org.org.asm.p598ec.ClassWriter.f32349b;
        float $f0 = $r3.init(27.0f);
        this.f32227w = (int) $f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onTouchEvent(MotionEvent motionEvent, int i) {
        VelocityTracker $r1 = this.mVelocityTracker;
        if ($r1 != null) {
            float $f0 = this.mMaximumFlingVelocity;
            $r1.computeCurrentVelocity(1000, $f0);
        }
        int $i1 = motionEvent.getActionIndex();
        int $i2 = motionEvent.getPointerId($i1);
        VelocityTracker $r12 = this.mVelocityTracker;
        Log_OC.append($r12);
        float $f02 = $r12.getXVelocity($i2);
        VelocityTracker $r13 = this.mVelocityTracker;
        Log_OC.append($r13);
        float $f1 = $r13.getYVelocity($i2);
        for (int $i22 = 0; $i22 < i; $i22++) {
            if ($i22 != $i1) {
                int $i3 = motionEvent.getPointerId($i22);
                VelocityTracker $r14 = this.mVelocityTracker;
                Log_OC.append($r14);
                float $f2 = $r14.getXVelocity($i3);
                VelocityTracker $r15 = this.mVelocityTracker;
                Log_OC.append($r15);
                float $f3 = $r15.getYVelocity($i3);
                if (($f2 * $f02) + ($f3 * $f1) < 0.0f) {
                    VelocityTracker $r16 = this.mVelocityTracker;
                    Log_OC.append($r16);
                    $r16.clear();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC14561f get() {
        AbstractC14561f r1 = this.f32218l;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0297, code lost:
        if (r19 > r0) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTouchEvent(android.view.MotionEvent r30) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.http.ClassWriter.onTouchEvent(android.view.MotionEvent):void");
    }

    public final void visitInnerClass() {
        m1235a();
    }
}
