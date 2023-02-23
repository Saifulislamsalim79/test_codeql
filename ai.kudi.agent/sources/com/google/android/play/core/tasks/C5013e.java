package com.google.android.play.core.tasks;

import com.google.android.play.core.internal.C4985m;
import java.util.concurrent.ExecutionException;
/* renamed from: com.google.android.play.core.tasks.e */
/* loaded from: classes2.dex */
public final class C5013e {
    /* renamed from: a */
    public static <ResultT> AbstractC5011c<ResultT> m25871a(Exception exc) {
        C5024p c5024p = new C5024p();
        c5024p.m25846i(exc);
        return c5024p;
    }

    /* renamed from: b */
    public static <ResultT> AbstractC5011c<ResultT> m25870b(ResultT resultt) {
        C5024p c5024p = new C5024p();
        c5024p.m25845j(resultt);
        return c5024p;
    }

    /* renamed from: c */
    private static <ResultT> ResultT m25869c(AbstractC5011c<ResultT> abstractC5011c) throws ExecutionException {
        if (abstractC5011c.mo25848g()) {
            return abstractC5011c.mo25850e();
        }
        throw new ExecutionException(abstractC5011c.mo25851d());
    }

    /* renamed from: d */
    private static void m25868d(AbstractC5011c<?> abstractC5011c, C5025q c5025q) {
        abstractC5011c.mo25852c(C5012d.f12658b, c5025q);
        abstractC5011c.mo25854a(C5012d.f12658b, c5025q);
    }

    /* renamed from: e */
    public static <ResultT> ResultT m25867e(AbstractC5011c<ResultT> abstractC5011c) throws ExecutionException, InterruptedException {
        C4985m.m25920b(abstractC5011c, "Task must not be null");
        if (abstractC5011c.mo25849f()) {
            return (ResultT) m25869c(abstractC5011c);
        }
        C5025q c5025q = new C5025q(null);
        m25868d(abstractC5011c, c5025q);
        c5025q.m25840a();
        return (ResultT) m25869c(abstractC5011c);
    }
}
