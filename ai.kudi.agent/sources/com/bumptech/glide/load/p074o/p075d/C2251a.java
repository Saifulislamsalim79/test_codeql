package com.bumptech.glide.load.p074o.p075d;

import com.bumptech.glide.load.p070m.InterfaceC2132e;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferRewinder.java */
/* renamed from: com.bumptech.glide.load.o.d.a */
/* loaded from: classes2.dex */
public class C2251a implements InterfaceC2132e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f6591a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: com.bumptech.glide.load.o.d.a$a */
    /* loaded from: classes2.dex */
    public static class C2252a implements InterfaceC2132e.InterfaceC2133a<ByteBuffer> {
        @Override // com.bumptech.glide.load.p070m.InterfaceC2132e.InterfaceC2133a
        /* renamed from: a */
        public Class<ByteBuffer> mo33489a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2132e.InterfaceC2133a
        /* renamed from: c */
        public InterfaceC2132e<ByteBuffer> mo33488b(ByteBuffer byteBuffer) {
            return new C2251a(byteBuffer);
        }
    }

    public C2251a(ByteBuffer byteBuffer) {
        this.f6591a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2132e
    /* renamed from: b */
    public void mo33491b() {
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2132e
    /* renamed from: c */
    public ByteBuffer mo33492a() {
        this.f6591a.position(0);
        return this.f6591a;
    }
}
