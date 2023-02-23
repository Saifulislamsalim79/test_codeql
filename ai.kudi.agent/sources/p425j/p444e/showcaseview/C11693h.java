package p425j.p444e.showcaseview;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import j.e.e0.e;
import j.e.v;
import java.lang.Thread;
import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.Item;
import p425j.p444e.p449d0.AbstractC11285a;
import p425j.p444e.p450e0.InterfaceC11288b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p467j.C11661h;
import p425j.p444e.p468g0.AbstractC11671a;
import p577n.p586b.InterfaceC14456b;
/* compiled from: RxJavaPlugins.java */
/* renamed from: j.e.showcaseview.h */
/* loaded from: classes.dex */
public final class C11693h {

    /* renamed from: A */
    static volatile InterfaceC11288b<? super AbstractC11677k, ? super InterfaceC11685m, ? extends InterfaceC11685m> f26407A;

    /* renamed from: B */
    static volatile InterfaceC11291f<? super AbstractC11271b, ? extends AbstractC11271b> f26408B;

    /* renamed from: E */
    static volatile InterfaceC11291f<? super AbstractC11671a, ? extends AbstractC11671a> f26409E;

    /* renamed from: I */
    static volatile boolean f26410I;

    /* renamed from: a */
    static volatile InterfaceC11288b<? super AbstractC11688p, ? super InterfaceC11695u, ? extends InterfaceC11695u> f26411a;

    /* renamed from: b */
    static volatile InterfaceC11291f<? super v, ? extends v> f26412b;

    /* renamed from: c */
    static volatile InterfaceC11291f<? super Callable<v>, ? extends v> f26413c;

    /* renamed from: d */
    static volatile InterfaceC11291f<? super Callable<v>, ? extends v> f26414d;

    /* renamed from: e */
    static volatile InterfaceC11288b<? super AbstractC11696w, ? super InterfaceC11698y, ? extends InterfaceC11698y> f26415e;

    /* renamed from: f */
    static volatile InterfaceC11291f<? super Callable<v>, ? extends v> f26416f;

    /* renamed from: h */
    static volatile InterfaceC11288b<? super AbstractC11271b, ? super InterfaceC11278c, ? extends InterfaceC11278c> f26417h;

    /* renamed from: i */
    static volatile InterfaceC11291f<? super AbstractC11285a, ? extends AbstractC11285a> f26418i;

    /* renamed from: j */
    static volatile InterfaceC11291f<? super v, ? extends v> f26419j;

    /* renamed from: k */
    static volatile InterfaceC11288b<? super AbstractC11293f, ? super InterfaceC14456b, ? extends InterfaceC14456b> f26420k;

    /* renamed from: l */
    static volatile InterfaceC11291f<? super v, ? extends v> f26421l;

    /* renamed from: n */
    static volatile InterfaceC11291f<? super Callable<v>, ? extends v> f26422n;

    /* renamed from: o */
    static volatile InterfaceC11291f<? super AbstractC11293f, ? extends AbstractC11293f> f26423o;

    /* renamed from: p */
    static volatile InterfaceC11291f<? super v, ? extends v> f26424p;

    /* renamed from: r */
    static volatile InterfaceC11291f<? super Runnable, ? extends Runnable> f26425r;

    /* renamed from: s */
    static volatile InterfaceC11291f<? super AbstractC11677k, ? extends AbstractC11677k> f26426s;

    /* renamed from: t */
    static volatile e<? super Throwable> f26427t;

    /* renamed from: u */
    static volatile InterfaceC11291f<? super AbstractC11688p, ? extends AbstractC11688p> f26428u;

    /* renamed from: z */
    static volatile InterfaceC11291f<? super AbstractC11696w, ? extends AbstractC11696w> f26429z;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static Item m10477a(Item item) {
        InterfaceC11291f $r0 = f26424p;
        if ($r0 == null) {
            return item;
        }
        Object $r1 = m10471a($r0, item);
        Item $r2 = (Item) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    static Item m10470a(InterfaceC11291f interfaceC11291f, Callable callable) {
        Object $r0 = m10471a(interfaceC11291f, (Object) callable);
        C11312b.m11113d($r0, "Scheduler Callable result can't be null");
        Item $r3 = (Item) $r0;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static Item m10459a(Callable callable) {
        C11312b.m11113d(callable, "Scheduler Callable can't be null");
        InterfaceC11291f $r1 = f26414d;
        if ($r1 == null) {
            Item $r2 = get(callable);
            return $r2;
        }
        Item $r22 = m10470a($r1, callable);
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static AbstractC11271b m10476a(AbstractC11271b $r2) {
        InterfaceC11291f $r0 = f26408B;
        if ($r0 != null) {
            Object $r1 = m10471a($r0, $r2);
            return (AbstractC11271b) $r1;
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static InterfaceC11278c m10475a(AbstractC11271b abstractC11271b, InterfaceC11278c $r0) {
        InterfaceC11288b $r1 = f26417h;
        if ($r1 != null) {
            Object $r2 = m10472a($r1, abstractC11271b, $r0);
            return (InterfaceC11278c) $r2;
        }
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static AbstractC11285a m10474a(AbstractC11285a $r2) {
        InterfaceC11291f $r0 = f26418i;
        if ($r0 != null) {
            Object $r1 = m10471a($r0, $r2);
            return (AbstractC11285a) $r1;
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static AbstractC11293f m10469a(AbstractC11293f $r2) {
        InterfaceC11291f $r0 = f26423o;
        if ($r0 != null) {
            Object $r1 = m10471a($r0, $r2);
            return (AbstractC11293f) $r1;
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static AbstractC11671a m10467a(AbstractC11671a $r2) {
        InterfaceC11291f $r0 = f26409E;
        if ($r0 != null) {
            Object $r1 = m10471a($r0, $r2);
            return (AbstractC11671a) $r1;
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static AbstractC11677k m10466a(AbstractC11677k $r2) {
        InterfaceC11291f $r0 = f26426s;
        if ($r0 != null) {
            Object $r1 = m10471a($r0, $r2);
            return (AbstractC11677k) $r1;
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static InterfaceC11685m m10465a(AbstractC11677k abstractC11677k, InterfaceC11685m $r0) {
        InterfaceC11288b $r1 = f26407A;
        if ($r1 != null) {
            Object $r2 = m10472a($r1, abstractC11677k, $r0);
            return (InterfaceC11685m) $r2;
        }
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static AbstractC11688p m10464a(AbstractC11688p $r2) {
        InterfaceC11291f $r0 = f26428u;
        if ($r0 != null) {
            Object $r1 = m10471a($r0, $r2);
            return (AbstractC11688p) $r1;
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static InterfaceC11695u m10463a(AbstractC11688p abstractC11688p, InterfaceC11695u $r0) {
        InterfaceC11288b $r1 = f26411a;
        if ($r1 != null) {
            Object $r2 = m10472a($r1, abstractC11688p, $r0);
            return (InterfaceC11695u) $r2;
        }
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static AbstractC11696w m10462a(AbstractC11696w $r2) {
        InterfaceC11291f $r0 = f26429z;
        if ($r0 != null) {
            Object $r1 = m10471a($r0, $r2);
            return (AbstractC11696w) $r1;
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static InterfaceC11698y m10461a(AbstractC11696w abstractC11696w, InterfaceC11698y $r0) {
        InterfaceC11288b $r1 = f26415e;
        if ($r1 != null) {
            Object $r2 = m10472a($r1, abstractC11696w, $r0);
            return (InterfaceC11698y) $r2;
        }
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    static Object m10472a(InterfaceC11288b interfaceC11288b, Object obj, Object obj2) {
        try {
            Object $r0 = interfaceC11288b.mo11200a(obj, obj2);
            return $r0;
        } catch (Throwable $r3) {
            RuntimeException $r4 = C11661h.m10646d($r3);
            throw $r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    static Object m10471a(InterfaceC11291f interfaceC11291f, Object obj) {
        try {
            Object $r0 = interfaceC11291f.mo10663a(obj);
            return $r0;
        } catch (Throwable $r2) {
            RuntimeException $r3 = C11661h.m10646d($r2);
            throw $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static Runnable m10460a(Runnable runnable) {
        C11312b.m11113d(runnable, "run is null");
        InterfaceC11291f $r2 = f26425r;
        if ($r2 == null) {
            return runnable;
        }
        Object $r0 = m10471a($r2, runnable);
        Runnable $r1 = (Runnable) $r0;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static InterfaceC14456b m10468a(AbstractC11293f abstractC11293f, InterfaceC14456b $r0) {
        InterfaceC11288b $r1 = f26420k;
        if ($r1 != null) {
            Object $r2 = m10472a($r1, abstractC11293f, $r0);
            return (InterfaceC14456b) $r2;
        }
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static void m10473a(Object object) {
        boolean $z0 = f26410I;
        if ($z0) {
            IllegalStateException $r1 = new IllegalStateException("Plugins can't be changed anymore");
            throw $r1;
        } else {
            f26427t = object;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static Item m10458b(Item item) {
        InterfaceC11291f $r0 = f26419j;
        if ($r0 == null) {
            return item;
        }
        Object $r1 = m10471a($r0, item);
        Item $r2 = (Item) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static Item m10457b(Callable callable) {
        C11312b.m11113d(callable, "Scheduler Callable can't be null");
        InterfaceC11291f $r1 = f26416f;
        if ($r1 == null) {
            Item $r2 = get(callable);
            return $r2;
        }
        Item $r22 = m10470a($r1, callable);
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public static Item m10456c(Item item) {
        InterfaceC11291f $r0 = f26421l;
        if ($r0 == null) {
            return item;
        }
        Object $r1 = m10471a($r0, item);
        Item $r2 = (Item) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public static Item m10455c(Callable callable) {
        C11312b.m11113d(callable, "Scheduler Callable can't be null");
        InterfaceC11291f $r1 = f26413c;
        if ($r1 == null) {
            Item $r2 = get(callable);
            return $r2;
        }
        Item $r22 = m10470a($r1, callable);
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public static Item m10454e(Item item) {
        InterfaceC11291f $r0 = f26412b;
        if ($r0 == null) {
            return item;
        }
        Object $r1 = m10471a($r0, item);
        Item $r2 = (Item) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public static void m10453e(Throwable th) {
        e<? super Throwable> eVar = f26427t;
        if (th == null) {
            th = r4;
            NullPointerException r4 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            Throwable $r3 = th;
            boolean $z0 = isEnabled($r3);
            if (!$z0) {
                Throwable $r32 = th;
                UndeliverableException r5 = new UndeliverableException($r32);
                th = r5;
            }
        }
        if (eVar != null) {
            try {
                eVar.accept(th);
                return;
            } catch (Throwable $r33) {
                $r33.printStackTrace();
                report($r33);
            }
        }
        Throwable $r34 = th;
        $r34.printStackTrace();
        Throwable $r35 = th;
        report($r35);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static Item get(Callable callable) {
        try {
            Object $r1 = callable.call();
            C11312b.m11113d($r1, "Scheduler Callable result can't be null");
            Item $r2 = (Item) $r1;
            return $r2;
        } catch (Throwable $r3) {
            RuntimeException $r4 = C11661h.m10646d($r3);
            throw $r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Item getItem(Callable callable) {
        C11312b.m11113d(callable, "Scheduler Callable can't be null");
        InterfaceC11291f $r1 = f26422n;
        if ($r1 == null) {
            Item $r2 = get(callable);
            return $r2;
        }
        Item $r22 = m10470a($r1, callable);
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static boolean isEnabled(Throwable th) {
        boolean $z0 = th instanceof OnErrorNotImplementedException;
        if ($z0) {
            return true;
        }
        boolean $z02 = th instanceof MissingBackpressureException;
        if ($z02) {
            return true;
        }
        boolean $z03 = th instanceof IllegalStateException;
        if ($z03) {
            return true;
        }
        boolean $z04 = th instanceof NullPointerException;
        if ($z04) {
            return true;
        }
        boolean $z05 = th instanceof IllegalArgumentException;
        if ($z05) {
            return true;
        }
        boolean $z06 = th instanceof CompositeException;
        return $z06;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static void report(Throwable th) {
        Thread $r1 = Thread.currentThread();
        Thread.UncaughtExceptionHandler $r2 = $r1.getUncaughtExceptionHandler();
        $r2.uncaughtException($r1, th);
    }
}
