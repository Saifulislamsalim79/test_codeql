package com.google.mlkit.common.p186b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.j;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p300b.p307d.p315h.HandlerC8485a;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.g */
/* loaded from: classes2.dex */
public class C6935g {

    /* renamed from: b */
    private static final Object f16627b = new Object();

    /* renamed from: c */
    private static C6935g f16628c;

    /* renamed from: a */
    private Handler f16629a;

    private C6935g(Looper looper) {
        this.f16629a = new HandlerC8485a(looper);
    }

    /* renamed from: a */
    public static C6935g m20453a() {
        C6935g c6935g;
        synchronized (f16627b) {
            if (f16628c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f16628c = new C6935g(handlerThread.getLooper());
            }
            c6935g = f16628c;
        }
        return c6935g;
    }

    /* renamed from: d */
    public static Executor m20450d() {
        return EnumC6953v.f16666c;
    }

    /* renamed from: b */
    public <ResultT> j<ResultT> m20452b(final Callable<ResultT> callable) {
        final C4465k c4465k = new C4465k();
        m20451c(new Runnable() { // from class: com.google.mlkit.common.b.u
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                C4465k c4465k2 = c4465k;
                try {
                    c4465k2.m27775c(callable2.call());
                } catch (MlKitException e) {
                    c4465k2.m27776b(e);
                } catch (Exception e2) {
                    c4465k2.m27776b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e2));
                }
            }
        });
        return c4465k.m27777a();
    }

    /* renamed from: c */
    public void m20451c(Runnable runnable) {
        m20450d().execute(runnable);
    }
}
