package p272h.p286c.p287a.p300b.p307d.p313f;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC5967f;
import java.io.IOException;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: h.c.a.b.d.f.y */
/* loaded from: classes2.dex */
final class C8453y implements InterfaceC5967f {

    /* renamed from: a */
    private boolean f20149a = false;

    /* renamed from: b */
    private boolean f20150b = false;

    /* renamed from: c */
    private C5961b f20151c;

    /* renamed from: d */
    private final C8449u f20152d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8453y(C8449u c8449u) {
        this.f20152d = c8449u;
    }

    /* renamed from: b */
    private final void m16075b() {
        if (this.f20149a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20149a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m16076a(C5961b c5961b, boolean z) {
        this.f20149a = false;
        this.f20151c = c5961b;
        this.f20150b = z;
    }

    @Override // com.google.firebase.encoders.InterfaceC5967f
    /* renamed from: d */
    public final InterfaceC5967f mo15764d(String str) throws IOException {
        m16075b();
        this.f20152d.m16091g(this.f20151c, str, this.f20150b);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5967f
    /* renamed from: e */
    public final InterfaceC5967f mo15763e(boolean z) throws IOException {
        m16075b();
        this.f20152d.m16090h(this.f20151c, z ? 1 : 0, this.f20150b);
        return this;
    }
}
