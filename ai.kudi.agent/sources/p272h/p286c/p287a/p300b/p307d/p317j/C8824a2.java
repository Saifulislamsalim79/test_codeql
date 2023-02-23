package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.p141g.InterfaceC5969b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.a2 */
/* loaded from: classes2.dex */
public final class C8824a2 implements InterfaceC5969b {

    /* renamed from: d */
    private static final InterfaceC5964c f20781d = C9192z1.f21576a;

    /* renamed from: e */
    public static final /* synthetic */ int f20782e = 0;

    /* renamed from: a */
    private final Map f20783a = new HashMap();

    /* renamed from: b */
    private final Map f20784b = new HashMap();

    /* renamed from: c */
    private final InterfaceC5964c f20785c = f20781d;

    @Override // com.google.firebase.encoders.p141g.InterfaceC5969b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC5969b mo15833a(Class cls, InterfaceC5964c interfaceC5964c) {
        this.f20783a.put(cls, interfaceC5964c);
        this.f20784b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C8839b2 m15832b() {
        return new C8839b2(new HashMap(this.f20783a), new HashMap(this.f20784b), this.f20785c);
    }
}
