package io.intercom.com.bumptech.glide.load.p402o.p404d;

import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferRewinder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.d.a */
/* loaded from: classes3.dex */
public class C10778a implements InterfaceC10633c<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f24627a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.d.a$a */
    /* loaded from: classes3.dex */
    public static class C10779a implements InterfaceC10633c.InterfaceC10634a<ByteBuffer> {
        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c.InterfaceC10634a
        /* renamed from: a */
        public Class<ByteBuffer> mo12355a() {
            return ByteBuffer.class;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c.InterfaceC10634a
        /* renamed from: c */
        public InterfaceC10633c<ByteBuffer> mo12354b(ByteBuffer byteBuffer) {
            return new C10778a(byteBuffer);
        }
    }

    public C10778a(ByteBuffer byteBuffer) {
        this.f24627a = byteBuffer;
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c
    /* renamed from: b */
    public void mo12357b() {
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c
    /* renamed from: c */
    public ByteBuffer mo12358a() throws IOException {
        this.f24627a.position(0);
        return this.f24627a;
    }
}
