package p272h.p286c.p287a.p300b.p307d.p316i;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC5967f;
import java.io.IOException;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.o */
/* loaded from: classes2.dex */
final class C8689o implements InterfaceC5967f {

    /* renamed from: a */
    private boolean f20551a = false;

    /* renamed from: b */
    private boolean f20552b = false;

    /* renamed from: c */
    private C5961b f20553c;

    /* renamed from: d */
    private final C8645k f20554d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8689o(C8645k c8645k) {
        this.f20554d = c8645k;
    }

    /* renamed from: b */
    private final void m15934b() {
        if (this.f20551a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20551a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m15935a(C5961b c5961b, boolean z) {
        this.f20551a = false;
        this.f20553c = c5961b;
        this.f20552b = z;
    }

    @Override // com.google.firebase.encoders.InterfaceC5967f
    /* renamed from: d */
    public final InterfaceC5967f mo15764d(String str) throws IOException {
        m15934b();
        this.f20554d.m15954g(this.f20553c, str, this.f20552b);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5967f
    /* renamed from: e */
    public final InterfaceC5967f mo15763e(boolean z) throws IOException {
        m15934b();
        this.f20554d.m15953h(this.f20553c, z ? 1 : 0, this.f20552b);
        return this;
    }
}
