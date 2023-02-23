package p272h.p286c.p287a.p300b.p307d.p317j;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC5967f;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.d2 */
/* loaded from: classes2.dex */
final class C8869d2 implements InterfaceC5967f {

    /* renamed from: a */
    private boolean f20858a = false;

    /* renamed from: b */
    private boolean f20859b = false;

    /* renamed from: c */
    private C5961b f20860c;

    /* renamed from: d */
    private final C9178y1 f20861d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8869d2(C9178y1 c9178y1) {
        this.f20861d = c9178y1;
    }

    /* renamed from: b */
    private final void m15765b() {
        if (this.f20858a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20858a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m15766a(C5961b c5961b, boolean z) {
        this.f20858a = false;
        this.f20860c = c5961b;
        this.f20859b = z;
    }

    @Override // com.google.firebase.encoders.InterfaceC5967f
    /* renamed from: d */
    public final InterfaceC5967f mo15764d(String str) throws IOException {
        m15765b();
        this.f20861d.m15506g(this.f20860c, str, this.f20859b);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5967f
    /* renamed from: e */
    public final InterfaceC5967f mo15763e(boolean z) throws IOException {
        m15765b();
        this.f20861d.m15505h(this.f20860c, z ? 1 : 0, this.f20859b);
        return this;
    }
}
