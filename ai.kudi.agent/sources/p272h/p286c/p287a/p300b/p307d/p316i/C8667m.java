package p272h.p286c.p287a.p300b.p307d.p316i;

import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.p141g.InterfaceC5969b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.m */
/* loaded from: classes2.dex */
public final class C8667m implements InterfaceC5969b {

    /* renamed from: d */
    private static final InterfaceC5964c f20526d = C8656l.f20520a;

    /* renamed from: e */
    public static final /* synthetic */ int f20527e = 0;

    /* renamed from: a */
    private final Map f20528a = new HashMap();

    /* renamed from: b */
    private final Map f20529b = new HashMap();

    /* renamed from: c */
    private final InterfaceC5964c f20530c = f20526d;

    @Override // com.google.firebase.encoders.p141g.InterfaceC5969b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC5969b mo15833a(Class cls, InterfaceC5964c interfaceC5964c) {
        this.f20528a.put(cls, interfaceC5964c);
        this.f20529b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C8678n m15939b() {
        return new C8678n(new HashMap(this.f20528a), new HashMap(this.f20529b), this.f20530c);
    }
}
