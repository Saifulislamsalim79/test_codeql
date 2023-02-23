package p272h.p286c.p287a.p300b.p307d.p316i;

import com.google.firebase.encoders.InterfaceC5964c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.n */
/* loaded from: classes2.dex */
public final class C8678n {

    /* renamed from: a */
    private final Map f20543a;

    /* renamed from: b */
    private final Map f20544b;

    /* renamed from: c */
    private final InterfaceC5964c f20545c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8678n(Map map, Map map2, InterfaceC5964c interfaceC5964c) {
        this.f20543a = map;
        this.f20544b = map2;
        this.f20545c = interfaceC5964c;
    }

    /* renamed from: a */
    public final byte[] m15938a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C8645k(byteArrayOutputStream, this.f20543a, this.f20544b, this.f20545c).m15951j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
