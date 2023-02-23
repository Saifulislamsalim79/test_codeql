package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.n;
import com.google.android.gms.common.internal.C2886k;
import com.google.android.gms.common.internal.List;
import com.google.android.gms.tasks.AbstractC4446a;
import com.google.android.gms.tasks.C4448b;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4456f;
import com.google.android.gms.tasks.Item;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.p186b.AbstractC6933f;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p272h.p286c.p287a.p300b.p307d.p316i.C8720q8;
import p272h.p286c.p360e.p361a.p362a.C9395a;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, n {
    public static final /* synthetic */ int TYPE_DIALOG = 0;

    /* renamed from: d */
    private static final C2886k f16684d;

    /* renamed from: a */
    private final AtomicBoolean f16685a;

    /* renamed from: b */
    private final AbstractC6933f f16686b;

    /* renamed from: c */
    private final C4448b f16687c;

    /* renamed from: t */
    private final Executor f16688t;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C2886k $r0 = new C2886k("MobileVisionBase", "");
        f16684d = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MobileVisionBase(AbstractC6933f abstractC6933f, Executor executor) {
        AtomicBoolean r9 = new AtomicBoolean(false);
        this.f16685a = r9;
        this.f16686b = abstractC6933f;
        C4448b r10 = new C4448b();
        this.f16687c = r10;
        this.f16688t = executor;
        abstractC6933f.m20439c();
        Executor $r2 = this.f16688t;
        CallableC6975h $r5 = CallableC6975h.f16701c;
        C4448b $r4 = this.f16687c;
        AbstractC4446a $r6 = $r4.m27787b();
        Item $r7 = abstractC6933f.m20440a($r2, (Callable) $r5, $r6);
        InterfaceC4456f $r8 = C6973f.f16698a;
        InterfaceC4456f r12 = $r8;
        $r7.m27798a(r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    static /* synthetic */ void m20424a(Exception exc) {
        C2886k $r1 = f16684d;
        $r1.m31712d("MobileVisionBase", "Error preloading model resource", exc);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public synchronized Item m20425a(final C9395a c9395a) {
        List.toArray(c9395a, "InputImage can not be null");
        AtomicBoolean $r3 = this.f16685a;
        boolean $z0 = $r3.get();
        if ($z0) {
            Exception r11 = new MlKitException("This detector is already closed!", 14);
            Exception r13 = r11;
            Item $r5 = C4469m.m27766e(r13);
            return $r5;
        }
        int $i0 = c9395a.m14850j();
        if ($i0 >= 32) {
            int $i02 = c9395a.m14854f();
            if ($i02 >= 32) {
                AbstractC6933f $r6 = this.f16686b;
                Executor $r7 = this.f16688t;
                Callable callable = new Callable() { // from class: com.google.mlkit.vision.common.internal.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return MobileVisionBase.this.J(c9395a);
                    }
                };
                C4448b $r8 = this.f16687c;
                AbstractC4446a $r9 = $r8.m27787b();
                Callable r14 = callable;
                Item $r52 = $r6.m20440a($r7, r14, $r9);
                return $r52;
            }
        }
        Exception r112 = new MlKitException("InputImage width and height should be at least 32!", 3);
        Exception r132 = r112;
        Item $r53 = C4469m.m27766e(r132);
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    final /* synthetic */ Object m20423b(C9395a c9395a) throws Exception {
        C8720q8 $r4 = C8720q8.m15928I("detectorTaskWithResource#run");
        $r4.mo15926g();
        try {
            AbstractC6933f $r1 = this.f16686b;
            Object $r5 = $r1.mo20395h(c9395a);
            $r4.close();
            return $r5;
        } catch (Throwable $r6) {
            try {
                $r4.close();
            } catch (Throwable th) {
            }
            throw $r6;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        AtomicBoolean $r1 = this.f16685a;
        boolean $z0 = $r1.getAndSet(true);
        if ($z0) {
            return;
        }
        C4448b $r2 = this.f16687c;
        $r2.m27788a();
        AbstractC6933f $r3 = this.f16686b;
        Executor $r4 = this.f16688t;
        $r3.m20438e($r4);
    }
}
