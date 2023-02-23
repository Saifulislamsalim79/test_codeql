package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.C2832e;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC2883j;
import com.google.android.gms.common.internal.C2894m0;
import com.google.android.gms.common.internal.C2903p;
import com.google.android.gms.common.internal.C2920t;
import com.google.android.gms.common.internal.C2923u;
import com.google.android.gms.common.internal.C2929w;
import com.google.android.gms.common.internal.C2932x;
import com.google.android.gms.common.internal.InterfaceC2935y;
import com.google.android.gms.common.util.C2971i;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p201g.p218e.C7523b;
import p272h.p286c.p287a.p300b.p307d.p310c.HandlerC8416f;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.f */
/* loaded from: classes.dex */
public class C2766f implements Handler.Callback {

    /* renamed from: C */
    public static final Status f7756C;

    /* renamed from: o */
    private static C2766f f7757o;

    /* renamed from: p */
    private static final Object f7758p;

    /* renamed from: r */
    private static final Status f7759r;

    /* renamed from: a */
    private final Context f7760a;

    /* renamed from: b */
    private C2929w f7761b;

    /* renamed from: d */
    private InterfaceC2935y f7763d;

    /* renamed from: e */
    private volatile boolean f7764e;

    /* renamed from: f */
    private C2813v f7765f;

    /* renamed from: g */
    private final AtomicInteger f7766g;
    @NotOnlyInitialized

    /* renamed from: h */
    private final Handler f7767h;
    private final AtomicInteger index;

    /* renamed from: l */
    private final C2832e f7768l;

    /* renamed from: n */
    private final Set<C2754b<?>> f7769n;

    /* renamed from: s */
    private final Set<C2754b<?>> f7770s;
    private final Map<C2754b<?>, e0<?>> this$0;

    /* renamed from: v */
    private final C2894m0 f7771v;
    private long mPresenters = 5000;
    private long mCallback = 120000;

    /* renamed from: x */
    private long f7772x = 10000;

    /* renamed from: c */
    private boolean f7762c = false;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Status $r0 = new Status(4, "Sign-out occurred while this API call was in progress.");
        f7756C = $r0;
        Status $r02 = new Status(4, "The user must be signed in to make this API call.");
        f7759r = $r02;
        Object $r1 = new Object();
        f7758p = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private C2766f(Context context, Looper looper, C2832e c2832e) {
        AtomicInteger r11 = new AtomicInteger(1);
        this.index = r11;
        AtomicInteger r112 = new AtomicInteger(0);
        this.f7766g = r112;
        ConcurrentHashMap r12 = new ConcurrentHashMap(5, 0.75f, 1);
        this.this$0 = r12;
        this.f7765f = null;
        Set r13 = new C7523b();
        Set r16 = r13;
        this.f7769n = r16;
        Set r132 = new C7523b();
        Set r162 = r132;
        this.f7770s = r162;
        this.f7764e = true;
        this.f7760a = context;
        Handler r14 = new HandlerC8416f(looper, this);
        this.f7767h = r14;
        this.f7768l = c2832e;
        C2894m0 r15 = new C2894m0(c2832e);
        this.f7771v = r15;
        boolean $z0 = C2971i.m31532a(context);
        if ($z0) {
            this.f7764e = false;
        }
        Handler $r9 = this.f7767h;
        Message $r10 = $r9.obtainMessage(6);
        $r9.sendMessage($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Handler m32031a(C2766f c2766f) {
        Handler r1 = c2766f.f7767h;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static Status m32032a(C2754b c2754b, C2826b c2826b) {
        String $r4 = c2754b.m32050b();
        String $r5 = String.valueOf(c2826b);
        String $r6 = String.valueOf($r4);
        int $i0 = $r6.length();
        String $r62 = String.valueOf($r5);
        int $i1 = $r62.length();
        StringBuilder $r2 = new StringBuilder($i0 + 63 + $i1);
        $r2.append("API: ");
        $r2.append($r4);
        $r2.append(" is not available on this device. Connection failed with: ");
        $r2.append($r5);
        Status $r1 = new Status(c2826b, $r2.toString());
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static C2766f m32037a(Context context) {
        C2766f $r1;
        Object $r0 = f7758p;
        synchronized ($r0) {
            C2766f $r12 = f7757o;
            if ($r12 == null) {
                HandlerThread $r3 = AbstractC2883j.m31723c();
                Looper $r4 = $r3.getLooper();
                Context $r2 = context.getApplicationContext();
                C2832e $r5 = C2832e.m31864o();
                C2766f $r13 = new C2766f($r2, $r4, $r5);
                f7757o = $r13;
            }
            $r1 = f7757o;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final C2772h m32036a(AbstractC2743d abstractC2743d) {
        C2754b $r2 = abstractC2743d.getString();
        Map $r3 = this.this$0;
        Object $r4 = $r3.get($r2);
        e0<?> e0Var = (C2772h) $r4;
        if (e0Var == null) {
            e0Var = new C2772h<>(this, abstractC2743d);
            Map $r32 = this.this$0;
            $r32.put($r2, e0Var);
        }
        boolean $z0 = e0Var.hasSubMenu();
        if ($z0) {
            Set $r6 = this.f7770s;
            $r6.add($r2);
        }
        e0Var.m31986d();
        return e0Var;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m32030a(C2766f c2766f, boolean z) {
        c2766f.f7762c = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m32026a(C4465k c4465k, int i, AbstractC2743d abstractC2743d) {
        if (i != 0) {
            C2754b $r4 = abstractC2743d.getString();
            InterfaceC4454e $r5 = C2791n0.b(this, i, $r4);
            if ($r5 != null) {
                Item $r6 = c4465k.m27777a();
                final Handler $r7 = this.f7767h;
                $r7.getClass();
                Executor r9 = new Executor() { // from class: com.google.android.gms.common.api.internal.y
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        $r7.post(runnable);
                    }
                };
                InterfaceC4454e r10 = $r5;
                $r6.m27793a(r9, r10);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* bridge */ /* synthetic */ long add(C2766f c2766f) {
        long l0 = c2766f.f7772x;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Context m32024b(C2766f c2766f) {
        Context r1 = c2766f.f7760a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Object m32025b() {
        Object r0 = f7758p;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ boolean m32023c(C2766f c2766f) {
        boolean z0 = c2766f.f7764e;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ Status m32021d(C2754b c2754b, C2826b c2826b) {
        Status $r1 = m32032a(c2754b, c2826b);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ C2813v m32020d(C2766f c2766f) {
        C2813v r1 = c2766f.f7765f;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x000e, code lost:
        if (r2 != false) goto L10;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m32022d() {
        /*
            r5 = this;
            com.google.android.gms.common.internal.w r0 = r5.f7761b
            if (r0 == 0) goto L1a
            int r1 = r0.m31617f()
            if (r1 > 0) goto L10
            boolean r2 = r5.m32038a()
            if (r2 == 0) goto L17
        L10:
            com.google.android.gms.common.internal.y r3 = r5.m32019e()
            r3.mo31598a(r0)
        L17:
            r4 = 0
            r5.f7761b = r4
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C2766f.m32022d():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* bridge */ /* synthetic */ long dispatchMenuItemSelected(C2766f c2766f) {
        long l0 = c2766f.mCallback;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    private final InterfaceC2935y m32019e() {
        InterfaceC2935y $r1 = this.f7763d;
        if ($r1 == null) {
            Context $r2 = this.f7760a;
            InterfaceC2935y $r12 = C2932x.m31603a($r2);
            this.f7763d = $r12;
        }
        InterfaceC2935y $r13 = this.f7763d;
        return $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* bridge */ /* synthetic */ long expandItemActionView(C2766f c2766f) {
        long l0 = c2766f.mPresenters;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public static /* bridge */ /* synthetic */ C2832e m32017i(C2766f c2766f) {
        C2832e r1 = c2766f.f7768l;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: l */
    public static /* bridge */ /* synthetic */ Set m32016l(C2766f c2766f) {
        Set r1 = c2766f.f7769n;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: r */
    public static /* bridge */ /* synthetic */ Status m32015r() {
        Status r0 = f7759r;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* bridge */ /* synthetic */ C2894m0 size(C2766f c2766f) {
        C2894m0 r1 = c2766f.f7771v;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final C2772h m32033a(C2754b c2754b) {
        Map $r1 = this.this$0;
        Object $r2 = $r1.get(c2754b);
        C2772h $r4 = (C2772h) $r2;
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m32035a(AbstractC2743d abstractC2743d, int i, AbstractC2761d abstractC2761d) {
        C2763d1 $r1 = new C2763d1(i, abstractC2761d);
        Handler $r4 = this.f7767h;
        AtomicInteger $r6 = this.f7766g;
        int $i0 = $r6.get();
        C2804r0 $r5 = new C2804r0($r1, $i0, abstractC2743d);
        Message $r7 = $r4.obtainMessage(4, $r5);
        $r4.sendMessage($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m32034a(AbstractC2743d abstractC2743d, int i, AbstractC2796p abstractC2796p, C4465k c4465k, InterfaceC2793o interfaceC2793o) {
        int $i1 = abstractC2796p.m31933d();
        m32026a(c4465k, $i1, abstractC2743d);
        C2765e1 $r5 = new C2765e1(i, abstractC2796p, c4465k, interfaceC2793o);
        Handler $r6 = this.f7767h;
        AtomicInteger $r8 = this.f7766g;
        int $i0 = $r8.get();
        C2804r0 $r7 = new C2804r0($r5, $i0, abstractC2743d);
        Message $r9 = $r6.obtainMessage(4, $r7);
        $r6.sendMessage($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m32029a(C2813v c2813v) {
        Object $r1 = f7758p;
        synchronized ($r1) {
            C2813v $r4 = this.f7765f;
            if ($r4 != c2813v) {
                this.f7765f = c2813v;
                Set $r5 = this.f7769n;
                $r5.clear();
            }
            Set $r52 = this.f7769n;
            C7523b $r2 = c2813v.m31901t();
            $r52.addAll($r2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m32028a(C2826b c2826b, int i) {
        boolean $z0 = add(c2826b, i);
        if ($z0) {
            return;
        }
        Handler $r2 = this.f7767h;
        Message $r3 = $r2.obtainMessage(5, i, 0, c2826b);
        $r2.sendMessage($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final void m32027a(C2903p c2903p, int i, long j, int i2) {
        Handler $r1 = this.f7767h;
        C2794o0 $r2 = new C2794o0(c2903p, i, j, i2);
        Message $r3 = $r1.obtainMessage(18, $r2);
        $r1.sendMessage($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final boolean m32038a() {
        boolean $z0 = this.f7762c;
        if ($z0) {
            return false;
        }
        C2920t $r1 = C2920t.m31637b();
        C2923u $r2 = $r1.m31638a();
        if ($r2 != null) {
            boolean $z02 = $r2.m31623k();
            if (!$z02) {
                return false;
            }
        }
        C2894m0 $r3 = this.f7771v;
        Context $r4 = this.f7760a;
        int $i0 = $r3.m31707a($r4, 203400000);
        return $i0 == -1 || $i0 == 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean add(C2826b c2826b, int i) {
        C2832e $r1 = this.f7768l;
        Context $r2 = this.f7760a;
        boolean $z0 = $r1.m31854y($r2, c2826b, i);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clear(AbstractC2743d abstractC2743d) {
        Handler $r1 = this.f7767h;
        Message $r2 = $r1.obtainMessage(7, abstractC2743d);
        $r1.sendMessage($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close() {
        Handler $r1 = this.f7767h;
        Message $r2 = $r1.obtainMessage(3);
        $r1.sendMessage($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    final void close(C2813v c2813v) {
        Object $r1 = f7758p;
        synchronized ($r1) {
            C2813v $r2 = this.f7765f;
            if ($r2 == c2813v) {
                this.f7765f = null;
                Set $r4 = this.f7769n;
                $r4.clear();
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x008f, code lost:
        if (r4 >= r0) goto L18;
     */
    /* JADX WARN: Incorrect condition in loop: B:207:0x0248 */
    /* JADX WARN: Incorrect condition in loop: B:253:0x0473 */
    /* JADX WARN: Incorrect condition in loop: B:257:0x04a4 */
    /* JADX WARN: Incorrect condition in loop: B:275:0x0556 */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r78) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C2766f.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int next() {
        AtomicInteger $r1 = this.index;
        int $i0 = $r1.getAndIncrement();
        return $i0;
    }
}
