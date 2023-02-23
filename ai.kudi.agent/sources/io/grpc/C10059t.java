package io.grpc;

import com.google.common.base.C5051n;
import io.grpc.C9497c1;
import java.util.concurrent.TimeoutException;
/* compiled from: Contexts.java */
/* renamed from: io.grpc.t */
/* loaded from: classes2.dex */
public final class C10059t {
    /* renamed from: a */
    public static C9497c1 m13171a(C10043s c10043s) {
        C5051n.m25779o(c10043s, "context must not be null");
        if (c10043s.mo13230P()) {
            Throwable mo13224m = c10043s.mo13224m();
            if (mo13224m == null) {
                return C9497c1.f22188g.m14578r("io.grpc.Context was cancelled without error");
            }
            if (mo13224m instanceof TimeoutException) {
                return C9497c1.f22190i.m14578r(mo13224m.getMessage()).m14579q(mo13224m);
            }
            C9497c1 m14584l = C9497c1.m14584l(mo13224m);
            if (C9497c1.EnumC9499b.UNKNOWN.equals(m14584l.m14582n()) && m14584l.m14583m() == mo13224m) {
                return C9497c1.f22188g.m14578r("Context cancelled").m14579q(mo13224m);
            }
            return m14584l.m14579q(mo13224m);
        }
        return null;
    }
}
