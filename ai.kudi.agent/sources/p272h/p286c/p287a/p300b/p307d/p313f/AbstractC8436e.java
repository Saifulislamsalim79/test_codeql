package p272h.p286c.p287a.p300b.p307d.p313f;

import com.google.firebase.messaging.p168h1.C6508b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: h.c.a.b.d.f.e */
/* loaded from: classes2.dex */
public abstract class AbstractC8436e {

    /* renamed from: a */
    private static final C8452x f20121a;

    static {
        C8451w c8451w = new C8451w();
        C8435d.f20120a.mo15620a(c8451w);
        f20121a = c8451w.m16078b();
    }

    private AbstractC8436e() {
    }

    /* renamed from: b */
    public static byte[] m16103b(Object obj) {
        C8452x c8452x = f20121a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c8452x.m16077a(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public abstract C6508b m16104a();
}
