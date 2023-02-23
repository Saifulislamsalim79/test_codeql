package com.google.mlkit.common.p186b;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.a */
/* loaded from: classes2.dex */
public class C6922a {

    /* renamed from: a */
    private final ReferenceQueue f16611a = new ReferenceQueue();

    /* renamed from: b */
    private final Set f16612b = Collections.synchronizedSet(new HashSet());

    /* compiled from: com.google.mlkit:common@@18.0.0 */
    /* renamed from: com.google.mlkit.common.b.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC6923a {
        /* renamed from: a */
        void mo20426a();
    }

    private C6922a() {
    }

    /* renamed from: a */
    public static C6922a m20459a() {
        C6922a c6922a = new C6922a();
        c6922a.m20458b(c6922a, RunnableC6949r.f16661c);
        final ReferenceQueue referenceQueue = c6922a.f16611a;
        final Set set = c6922a.f16612b;
        Thread thread = new Thread(new Runnable() { // from class: com.google.mlkit.common.b.q
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        ((C6951t) referenceQueue2.remove()).mo20426a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c6922a;
    }

    /* renamed from: b */
    public InterfaceC6923a m20458b(Object obj, Runnable runnable) {
        C6951t c6951t = new C6951t(obj, this.f16611a, this.f16612b, runnable, null);
        this.f16612b.add(c6951t);
        return c6951t;
    }
}
