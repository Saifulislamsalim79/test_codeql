package lombok.org.asm.menu;

import a.a.a.a2.r;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11709c;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11782b0;
import lombok.org.asm.PositionMetric$a;
import lombok.org.asm.asm.C14263p;
import lombok.org.asm.asm.ClassReader;
import lombok.org.asm.asm.DownloadFile;
import lombok.org.asm.asm.Handler;
import lombok.org.asm.asm.Integer;
import lombok.org.asm.asm.Paint;
import lombok.org.asm.asm.Range;
/* renamed from: lombok.org.asm.menu.f */
/* loaded from: classes.dex */
public abstract class AbstractC14284f<E> implements r<E> {

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f31438c;

    /* renamed from: a */
    private volatile java.lang.Object f31439a;

    /* renamed from: p */
    public final DownloadFile f31440p;

    /* renamed from: s */
    public final InterfaceC11767l<E, C13666w> f31441s;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        AtomicReferenceFieldUpdater $r0 = AtomicReferenceFieldUpdater.newUpdater(a.a.a.a2.c.class, java.lang.Object.class, "c");
        f31438c = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC14284f(InterfaceC11767l interfaceC11767l) {
        this.f31441s = interfaceC11767l;
        DownloadFile $r2 = new DownloadFile();
        this.f31440p = $r2;
        this.f31439a = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public java.lang.Object m2232a(java.lang.Object obj) {
        MenuItem $r2;
        Paint $r3;
        do {
            $r2 = add();
            if ($r2 == null) {
                return ClassWriter.f31412g;
            }
            $r3 = $r2.m2253a(obj, null);
        } while ($r3 == null);
        boolean $z0 = lombok.org.asm.Item.f31289c;
        if ($z0) {
            Paint $r4 = PositionMetric$a.f31306a;
            boolean $z02 = $r3 == $r4;
            if (!$z02) {
                AssertionError $r5 = new AssertionError();
                throw $r5;
            }
        }
        $r2.toString(obj);
        java.lang.Object $r1 = $r2.m2254a();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Throwable m2231a(java.lang.Object obj, C14289m c14289m) {
        C14263p $r2;
        m2229a(c14289m);
        InterfaceC11767l $r1 = this.f31441s;
        if ($r1 == null || ($r2 = Handler.m2340a($r1, obj, null)) == null) {
            Throwable $r5 = c14289m.f31452e;
            if ($r5 != null) {
                return $r5;
            }
            List r7 = new List("Channel was closed");
            return r7;
        }
        java.lang.Object $r3 = c14289m.f31452e;
        if ($r3 == null) {
            $r3 = $r6;
            List $r6 = new List("Channel was closed");
        }
        C11709c.m10411a($r2, (Throwable) $r3);
        throw $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m2229a(C14289m c14289m) {
        java.lang.Object $r2 = null;
        while (true) {
            Integer $r3 = c14289m.get();
            Integer $r4 = $r3;
            boolean $z0 = $r3 instanceof AbstractC14291o;
            if (!$z0) {
                $r4 = null;
            }
            AbstractC14291o $r5 = (AbstractC14291o) $r4;
            if ($r5 == null) {
                break;
            }
            boolean $z02 = $r5.exists();
            if ($z02) {
                $r2 = ClassReader.get($r2, $r5);
            } else {
                $r5.remove();
            }
        }
        if ($r2 == null) {
            return;
        }
        boolean $z03 = $r2 instanceof ArrayList;
        if (!$z03) {
            ((AbstractC14291o) $r2).m2200a(c14289m);
            return;
        }
        ArrayList $r6 = (ArrayList) $r2;
        int $i0 = $r6.size();
        for (int $i02 = $i0 - 1; $i02 >= 0; $i02--) {
            java.lang.Object $r22 = $r6.get($i02);
            ((AbstractC14291o) $r22).m2200a(c14289m);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public boolean m2230a(Throwable th) {
        boolean $z0;
        java.lang.Object $r5;
        Paint $r6;
        C14289m $r2 = new C14289m(th);
        DownloadFile $r3 = this.f31440p;
        while (true) {
            Integer $r4 = $r3.get();
            boolean $z02 = $r4 instanceof C14289m;
            if (!(!$z02)) {
                $z0 = false;
                break;
            }
            boolean $z03 = $r4.get($r2, $r3);
            if ($z03) {
                $z0 = true;
                break;
            }
        }
        if (!$z0) {
            $r2 = (C14289m) this.f31440p.get();
        }
        m2229a($r2);
        if ($z0 && ($r5 = this.f31439a) != null && $r5 != ($r6 = ClassWriter.f31414s)) {
            AtomicReferenceFieldUpdater $r7 = f31438c;
            boolean $z1 = $r7.compareAndSet(this, $r5, $r6);
            if ($z1) {
                C11782b0.m10345f($r5, 1);
                InterfaceC11767l $r8 = (InterfaceC11767l) $r5;
                $r8.invoke(th);
            }
        }
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuItem add() {
        Integer $r3;
        Integer $r1 = this.f31440p;
        while (true) {
            java.lang.Object $r2 = $r1.next();
            if ($r2 == null) {
                NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.internal.Node /* = com.smartlook.coroutines.internal.LockFreeLinkedListNode */");
                throw $r8;
            }
            $r3 = (Integer) $r2;
            if ($r3 == $r1) {
                break;
            }
            boolean $z0 = $r3 instanceof MenuItem;
            if (!$z0) {
                break;
            }
            MenuItem $r4 = (MenuItem) $r3;
            boolean $z02 = $r4 instanceof C14289m;
            if ($z02) {
                boolean $z03 = $r3.isEmpty();
                if (!$z03) {
                    break;
                }
            }
            Integer $r5 = $r3.add();
            Integer $r6 = $r5;
            if ($r5 == null) {
                break;
            }
            while (true) {
                java.lang.Object $r22 = $r6.next();
                boolean $z04 = $r22 instanceof Range;
                if (!$z04) {
                    break;
                }
                Range $r7 = (Range) $r22;
                $r6 = $r7.state;
            }
            $r6.get(null);
        }
        $r3 = null;
        MenuItem $r42 = (MenuItem) $r3;
        return $r42;
    }

    /* renamed from: e */
    public String m2228e() {
        return "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final C14289m m2227f() {
        DownloadFile $r2 = this.f31440p;
        Integer $r1 = $r2.getValue();
        Integer $r3 = $r1;
        boolean $z0 = $r1 instanceof C14289m;
        if (!$z0) {
            $r3 = null;
        }
        C14289m $r4 = (C14289m) $r3;
        if ($r4 != null) {
            m2229a($r4);
            return $r4;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final C14289m m2226i() {
        DownloadFile $r2 = this.f31440p;
        Integer $r1 = $r2.get();
        Integer $r3 = $r1;
        boolean $z0 = $r1 instanceof C14289m;
        if (!$z0) {
            $r3 = null;
        }
        C14289m $r4 = (C14289m) $r3;
        if ($r4 != null) {
            m2229a($r4);
            return $r4;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean offer(java.lang.Object obj) {
        java.lang.Object $r2 = m2232a(obj);
        Paint $r3 = ClassWriter.f31410b;
        if ($r2 == $r3) {
            return true;
        }
        Paint $r32 = ClassWriter.f31412g;
        if ($r2 == $r32) {
            C14289m $r4 = m2226i();
            if ($r4 == null) {
                return false;
            }
            Throwable $r5 = m2231a(obj, $r4);
            throw lombok.org.asm.asm.ClassWriter.m2346a($r5);
        }
        boolean $z0 = $r2 instanceof C14289m;
        if ($z0) {
            Throwable $r52 = m2231a(obj, (C14289m) $r2);
            throw lombok.org.asm.asm.ClassWriter.m2346a($r52);
        }
        String $r7 = "offerInternal returned " + $r2;
        IllegalStateException $r8 = new IllegalStateException($r7.toString());
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC14278ad read() {
        Integer $r3;
        Integer $r1 = this.f31440p;
        while (true) {
            java.lang.Object $r2 = $r1.next();
            if ($r2 == null) {
                NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.internal.Node /* = com.smartlook.coroutines.internal.LockFreeLinkedListNode */");
                throw $r8;
            }
            $r3 = (Integer) $r2;
            if ($r3 == $r1) {
                break;
            }
            boolean $z0 = $r3 instanceof AbstractC14278ad;
            if (!$z0) {
                break;
            }
            AbstractC14278ad $r4 = (AbstractC14278ad) $r3;
            boolean $z02 = $r4 instanceof C14289m;
            if ($z02) {
                boolean $z03 = $r3.isEmpty();
                if (!$z03) {
                    break;
                }
            }
            Integer $r5 = $r3.add();
            Integer $r6 = $r5;
            if ($r5 == null) {
                break;
            }
            while (true) {
                java.lang.Object $r22 = $r6.next();
                boolean $z04 = $r22 instanceof Range;
                if (!$z04) {
                    break;
                }
                Range $r7 = (Range) $r22;
                $r6 = $r7.state;
            }
            $r6.get(null);
        }
        $r3 = null;
        AbstractC14278ad $r42 = (AbstractC14278ad) $r3;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:21:0x0084 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r15 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r15.getClass()
            java.lang.String r2 = r1.getSimpleName()
            r0.append(r2)
            r3 = 64
            r0.append(r3)
            int r4 = java.lang.System.identityHashCode(r15)
            java.lang.String r2 = java.lang.Integer.toHexString(r4)
            r0.append(r2)
            r3 = 123(0x7b, float:1.72E-43)
            r0.append(r3)
            lombok.org.asm.asm.DownloadFile r5 = r15.f31440p
            lombok.org.asm.asm.Integer r6 = r5.getValue()
            lombok.org.asm.asm.DownloadFile r5 = r15.f31440p
            if (r6 != r5) goto L34
            java.lang.String r2 = "EmptyQueue"
            goto Lb6
        L34:
            boolean r7 = r6 instanceof lombok.org.asm.menu.C14289m
            if (r7 == 0) goto L3d
            java.lang.String r2 = r6.toString()
            goto L5c
        L3d:
            boolean r7 = r6 instanceof lombok.org.asm.menu.AbstractC14291o
            if (r7 == 0) goto L44
            java.lang.String r2 = "ReceiveQueued"
            goto L5c
        L44:
            boolean r7 = r6 instanceof lombok.org.asm.menu.AbstractC14278ad
            if (r7 == 0) goto L4b
            java.lang.String r2 = "SendQueued"
            goto L5c
        L4b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "UNEXPECTED:"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r2 = r8.toString()
        L5c:
            lombok.org.asm.asm.DownloadFile r5 = r15.f31440p
            lombok.org.asm.asm.Integer r10 = r5.get()
            if (r10 == r6) goto Lb6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            java.lang.String r9 = ",queueSize="
            r8.append(r9)
            r4 = 0
            lombok.org.asm.asm.DownloadFile r5 = r15.f31440p
            java.lang.Object r11 = r5.next()
            if (r11 == 0) goto Lae
            r12 = r11
            lombok.org.asm.asm.Integer r12 = (lombok.org.asm.asm.Integer) r12
            r6 = r12
        L7e:
            boolean r7 = kotlin.p483e0.p485d.Log_OC.append(r6, r5)
            r3 = 1
            r7 = r7 ^ r3
            if (r7 == 0) goto L8d
            int r4 = r4 + 1
            lombok.org.asm.asm.Integer r6 = r6.getValue()
            goto L7e
        L8d:
            r8.append(r4)
            java.lang.String r13 = r8.toString()
            r2 = r13
            boolean r7 = r10 instanceof lombok.org.asm.menu.C14289m
            if (r7 == 0) goto Lb6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r13)
            java.lang.String r9 = ",closedForSend="
            r8.append(r9)
            r8.append(r10)
            java.lang.String r2 = r8.toString()
            goto Lb6
        Lae:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
        */
        //  java.lang.String r9 = "null cannot be cast to non-null type com.smartlook.coroutines.internal.Node /* = com.smartlook.coroutines.internal.LockFreeLinkedListNode */"
        /*
            r14.<init>(r9)
            throw r14
        Lb6:
            r0.append(r2)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r2 = r15.m2228e()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.menu.AbstractC14284f.toString():java.lang.String");
    }
}
