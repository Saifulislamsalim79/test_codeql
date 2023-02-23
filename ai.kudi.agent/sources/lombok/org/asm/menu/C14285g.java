package lombok.org.asm.menu;

import a.a.a.a2.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13706j;
import kotlin.p557z.C13712m;
import kotlin.p557z.C13715n;
import lombok.org.asm.asm.Paint;
/* renamed from: lombok.org.asm.menu.g */
/* loaded from: classes.dex */
public final class C14285g<E> implements a.a.a.a2.e<E> {
    public static final AtomicIntegerFieldUpdater ONCE_TERMINATED;

    /* renamed from: b */
    public static final Paint f31442b;

    /* renamed from: g */
    public static final l.b<java.lang.Object> f31443g;

    /* renamed from: h */
    public static final AtomicReferenceFieldUpdater f31444h;

    /* renamed from: f */
    private volatile java.lang.Object f31447f = f31443g;

    /* renamed from: c */
    private volatile int f31445c = 0;

    /* renamed from: d */
    private volatile java.lang.Object f31446d = null;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Paint $r0 = new Paint("UNDEFINED");
        f31442b = $r0;
        Type $r1 = new Type($r0, null);
        f31443g = $r1;
        AtomicReferenceFieldUpdater $r2 = AtomicReferenceFieldUpdater.newUpdater(a.a.a.a2.l.class, java.lang.Object.class, "b");
        f31444h = $r2;
        AtomicIntegerFieldUpdater $r3 = AtomicIntegerFieldUpdater.newUpdater(a.a.a.a2.l.class, "c");
        ONCE_TERMINATED = $r3;
        AtomicReferenceFieldUpdater.newUpdater(a.a.a.a2.l.class, java.lang.Object.class, "d");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final void m2224a(C14285g c14285g, Item item) {
        boolean $z0;
        do {
            java.lang.Object $r3 = c14285g.f31447f;
            boolean $z02 = $r3 instanceof C14292p;
            if ($z02) {
                return;
            }
            boolean $z03 = $r3 instanceof Type;
            if (!$z03) {
                String $r10 = "Invalid state " + $r3;
                IllegalStateException $r11 = new IllegalStateException($r10.toString());
                throw $r11;
            }
            Type $r5 = (Type) $r3;
            java.lang.Object $r0 = $r5.f31422a;
            if ($r3 == null) {
                NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                throw $r8;
            }
            l.c<E>[] cVarArr = $r5.f31423b;
            Log_OC.append(cVarArr);
            Item[] $r6 = c14285g.m2223a((Item[]) cVarArr, item);
            Type $r4 = new Type($r0, $r6);
            AtomicReferenceFieldUpdater $r7 = f31444h;
            $z0 = $r7.compareAndSet(c14285g, $r3, $r4);
        } while (!$z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public InterfaceC14277a m2225a() {
        boolean $z0;
        Item $r1 = new Item(this);
        do {
            java.lang.Object $r2 = this.f31447f;
            boolean $z02 = $r2 instanceof C14292p;
            if ($z02) {
                C14292p $r3 = (C14292p) $r2;
                Throwable $r4 = $r3.f31453e;
                $r1.m2230a($r4);
                return $r1;
            }
            boolean $z03 = $r2 instanceof Type;
            if (!$z03) {
                String $r13 = "Invalid state " + $r2;
                IllegalStateException $r14 = new IllegalStateException($r13.toString());
                throw $r14;
            }
            Type $r5 = (Type) $r2;
            java.lang.Object $r6 = $r5.f31422a;
            Paint $r7 = f31442b;
            if ($r6 != $r7) {
                $r1.m2256a($r6);
            }
            java.lang.Object $r62 = $r5.f31422a;
            if ($r2 == null) {
                NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                throw $r11;
            }
            Item[] $r9 = m2222b($r5.f31423b, $r1);
            Type $r8 = new Type($r62, $r9);
            AtomicReferenceFieldUpdater $r10 = f31444h;
            $z0 = $r10.compareAndSet(this, $r2, $r8);
        } while (!$z0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Item[] m2223a(Item[] itemArr, Item item) {
        int $i0;
        int $i1 = itemArr.length;
        $i0 = C13715n.m4047D(itemArr, item);
        boolean $z0 = lombok.org.asm.Item.f31289c;
        if ($z0) {
            boolean $z02 = $i0 >= 0;
            if (!$z02) {
                AssertionError $r3 = new AssertionError();
                throw $r3;
            }
        }
        if ($i1 == 1) {
            return null;
        }
        Item[] $r4 = new Item[$i1 - 1];
        C13712m.m4064g(itemArr, $r4, 0, 0, $i0, 6, null);
        C13712m.m4064g(itemArr, $r4, $i0, $i0 + 1, 0, 8, null);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final Item[] m2222b(Item[] $r2, Item item) {
        if ($r2 != null) {
            java.lang.Object[] $r3 = C13706j.m4085m($r2, item);
            return (Item[]) $r3;
        }
        Item[] $r22 = new Item[1];
        for (int $i0 = 0; $i0 < 1; $i0++) {
            $r22[$i0] = item;
        }
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean offer(java.lang.Object obj) {
        AtomicIntegerFieldUpdater $r3 = ONCE_TERMINATED;
        boolean $z0 = $r3.compareAndSet(this, 0, 1);
        C14292p $r4 = null;
        if ($z0) {
            while (true) {
                try {
                    java.lang.Object $r5 = this.f31447f;
                    boolean $z02 = $r5 instanceof C14292p;
                    if ($z02) {
                        $r4 = (C14292p) $r5;
                        break;
                    }
                    boolean $z03 = $r5 instanceof Type;
                    if (!$z03) {
                        String $r12 = "Invalid state " + $r5;
                        IllegalStateException r19 = new IllegalStateException($r12.toString());
                        throw r19;
                    } else if ($r5 == null) {
                        NullPointerException r17 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                        throw r17;
                    } else {
                        Type $r7 = (Type) $r5;
                        Type r15 = new Type(obj, $r7.f31423b);
                        AtomicReferenceFieldUpdater $r9 = f31444h;
                        boolean $z04 = $r9.compareAndSet(this, $r5, r15);
                        if ($z04) {
                            Type $r6 = (Type) $r5;
                            Item[] $r8 = $r6.f31423b;
                            if ($r8 != null) {
                                for (Item $r1 : $r8) {
                                    $r1.m2256a(obj);
                                }
                            }
                        }
                    }
                } finally {
                    this.f31445c = 0;
                }
            }
        }
        if ($r4 != null) {
            java.lang.Object $r2 = $r4.f31453e;
            if ($r2 == null) {
                $r2 = r16;
                java.lang.Object r16 = new List("Channel was closed");
            }
            Throwable $r14 = (Throwable) $r2;
            throw $r14;
        }
        return true;
    }
}
