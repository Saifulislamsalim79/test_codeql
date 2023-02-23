package androidx.core.p058os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p201g.p227h.p237k.C7675h;
/* compiled from: ExecutorCompat.java */
/* renamed from: androidx.core.os.e */
/* loaded from: classes2.dex */
public final class C1376e {

    /* compiled from: ExecutorCompat.java */
    /* renamed from: androidx.core.os.e$a */
    /* loaded from: classes2.dex */
    private static class ExecutorC1377a implements Executor {

        /* renamed from: c */
        private final Handler f4248c;

        ExecutorC1377a(Handler handler) {
            C7675h.m17866f(handler);
            this.f4248c = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.f4248c;
            C7675h.m17866f(runnable);
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f4248c + " is shutting down");
        }
    }

    /* renamed from: a */
    public static Executor m36168a(Handler handler) {
        return new ExecutorC1377a(handler);
    }
}
