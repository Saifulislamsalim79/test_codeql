package com.google.firebase.encoders.p143i;

import com.google.firebase.encoders.C5961b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC5967f;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufValueEncoderContext.java */
/* renamed from: com.google.firebase.encoders.i.i */
/* loaded from: classes2.dex */
public class C5986i implements InterfaceC5967f {

    /* renamed from: a */
    private boolean f14652a = false;

    /* renamed from: b */
    private boolean f14653b = false;

    /* renamed from: c */
    private C5961b f14654c;

    /* renamed from: d */
    private final C5982g f14655d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5986i(C5982g c5982g) {
        this.f14655d = c5982g;
    }

    /* renamed from: a */
    private void m23103a() {
        if (!this.f14652a) {
            this.f14652a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m23102b(C5961b c5961b, boolean z) {
        this.f14652a = false;
        this.f14654c = c5961b;
        this.f14653b = z;
    }

    @Override // com.google.firebase.encoders.InterfaceC5967f
    /* renamed from: d */
    public InterfaceC5967f mo15764d(String str) throws IOException {
        m23103a();
        this.f14655d.m23127g(this.f14654c, str, this.f14653b);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC5967f
    /* renamed from: e */
    public InterfaceC5967f mo15763e(boolean z) throws IOException {
        m23103a();
        this.f14655d.m23121m(this.f14654c, z, this.f14653b);
        return this;
    }
}
