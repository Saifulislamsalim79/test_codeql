package io.grpc.p385i1;

import com.google.common.base.C5051n;
import io.grpc.C10049s0;
import io.grpc.C9897i0;
import io.grpc.p384h1.C9718m2;
import io.grpc.p384h1.C9755r0;
import io.grpc.p385i1.p386r.p387j.C9966d;
import java.util.ArrayList;
import java.util.List;
import p576m.C14347f;
/* compiled from: Headers.java */
/* renamed from: io.grpc.i1.c */
/* loaded from: classes2.dex */
class C9906c {

    /* renamed from: a */
    public static final C9966d f23262a = new C9966d(C9966d.f23631g, "https");

    /* renamed from: b */
    public static final C9966d f23263b = new C9966d(C9966d.f23631g, "http");

    /* renamed from: c */
    public static final C9966d f23264c = new C9966d(C9966d.f23629e, "POST");

    /* renamed from: d */
    public static final C9966d f23265d = new C9966d(C9966d.f23629e, "GET");

    /* renamed from: e */
    public static final C9966d f23266e = new C9966d(C9755r0.f22907g.m13186d(), "application/grpc");

    /* renamed from: f */
    public static final C9966d f23267f = new C9966d("te", "trailers");

    /* renamed from: a */
    public static List<C9966d> m13730a(C10049s0 c10049s0, String str, String str2, String str3, boolean z, boolean z2) {
        C5051n.m25779o(c10049s0, "headers");
        C5051n.m25779o(str, "defaultPath");
        C5051n.m25779o(str2, "authority");
        c10049s0.m13213d(C9755r0.f22907g);
        c10049s0.m13213d(C9755r0.f22908h);
        c10049s0.m13213d(C9755r0.f22909i);
        ArrayList arrayList = new ArrayList(C9897i0.m13745a(c10049s0) + 7);
        if (z2) {
            arrayList.add(f23263b);
        } else {
            arrayList.add(f23262a);
        }
        if (z) {
            arrayList.add(f23265d);
        } else {
            arrayList.add(f23264c);
        }
        arrayList.add(new C9966d(C9966d.f23632h, str2));
        arrayList.add(new C9966d(C9966d.f23630f, str));
        arrayList.add(new C9966d(C9755r0.f22909i.m13186d(), str3));
        arrayList.add(f23266e);
        arrayList.add(f23267f);
        byte[][] m14135d = C9718m2.m14135d(c10049s0);
        for (int i = 0; i < m14135d.length; i += 2) {
            C14347f m2034r = C14347f.m2034r(m14135d[i]);
            if (m13729b(m2034r.mo1965M())) {
                arrayList.add(new C9966d(m2034r, C14347f.m2034r(m14135d[i + 1])));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m13729b(String str) {
        return (str.startsWith(":") || C9755r0.f22907g.m13186d().equalsIgnoreCase(str) || C9755r0.f22909i.m13186d().equalsIgnoreCase(str)) ? false : true;
    }
}
