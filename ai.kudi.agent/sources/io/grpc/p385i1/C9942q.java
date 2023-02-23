package io.grpc.p385i1;

import io.grpc.C10049s0;
import io.grpc.C9897i0;
import io.grpc.p384h1.C9718m2;
import io.grpc.p385i1.p386r.p387j.C9966d;
import java.util.List;
import java.util.logging.Logger;
/* compiled from: Utils.java */
/* renamed from: io.grpc.i1.q */
/* loaded from: classes2.dex */
class C9942q {
    static {
        Logger.getLogger(C9942q.class.getName());
    }

    private C9942q() {
    }

    /* renamed from: a */
    public static C10049s0 m13531a(List<C9966d> list) {
        return C9897i0.m13743c(m13530b(list));
    }

    /* renamed from: b */
    private static byte[][] m13530b(List<C9966d> list) {
        byte[][] bArr = new byte[list.size() * 2];
        int i = 0;
        for (C9966d c9966d : list) {
            int i2 = i + 1;
            bArr[i] = c9966d.f23633a.mo1966J();
            i = i2 + 1;
            bArr[i2] = c9966d.f23634b.mo1966J();
        }
        return C9718m2.m14134e(bArr);
    }

    /* renamed from: c */
    public static C10049s0 m13529c(List<C9966d> list) {
        return C9897i0.m13743c(m13530b(list));
    }
}
