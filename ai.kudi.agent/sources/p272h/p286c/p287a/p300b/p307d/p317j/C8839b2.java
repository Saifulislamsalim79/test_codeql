package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.firebase.encoders.InterfaceC5964c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.b2 */
/* loaded from: classes2.dex */
public final class C8839b2 {

    /* renamed from: a */
    private final Map f20811a;

    /* renamed from: b */
    private final Map f20812b;

    /* renamed from: c */
    private final InterfaceC5964c f20813c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8839b2(Map map, Map map2, InterfaceC5964c interfaceC5964c) {
        this.f20811a = map;
        this.f20812b = map2;
        this.f20813c = interfaceC5964c;
    }

    /* renamed from: a */
    public final byte[] m15810a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C9178y1(byteArrayOutputStream, this.f20811a, this.f20812b, this.f20813c).m15503j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
