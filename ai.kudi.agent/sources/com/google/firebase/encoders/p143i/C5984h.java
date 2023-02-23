package com.google.firebase.encoders.p143i;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC5964c;
import com.google.firebase.encoders.InterfaceC5965d;
import com.google.firebase.encoders.InterfaceC5966e;
import com.google.firebase.encoders.p141g.InterfaceC5968a;
import com.google.firebase.encoders.p141g.InterfaceC5969b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProtobufEncoder.java */
/* renamed from: com.google.firebase.encoders.i.h */
/* loaded from: classes2.dex */
public class C5984h {

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC5964c<?>> f14645a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC5966e<?>> f14646b;

    /* renamed from: c */
    private final InterfaceC5964c<Object> f14647c;

    /* compiled from: ProtobufEncoder.java */
    /* renamed from: com.google.firebase.encoders.i.h$a */
    /* loaded from: classes2.dex */
    public static final class C5985a implements InterfaceC5969b<C5985a> {

        /* renamed from: d */
        private static final InterfaceC5964c<Object> f14648d = C5978b.f14631a;

        /* renamed from: a */
        private final Map<Class<?>, InterfaceC5964c<?>> f14649a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, InterfaceC5966e<?>> f14650b = new HashMap();

        /* renamed from: c */
        private InterfaceC5964c<Object> f14651c = f14648d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public static /* synthetic */ void m23105d(Object obj, InterfaceC5965d interfaceC5965d) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        @Override // com.google.firebase.encoders.p141g.InterfaceC5969b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ C5985a mo15833a(Class cls, InterfaceC5964c interfaceC5964c) {
            m23104e(cls, interfaceC5964c);
            return this;
        }

        /* renamed from: b */
        public C5984h m23107b() {
            return new C5984h(new HashMap(this.f14649a), new HashMap(this.f14650b), this.f14651c);
        }

        /* renamed from: c */
        public C5985a m23106c(InterfaceC5968a interfaceC5968a) {
            interfaceC5968a.mo15620a(this);
            return this;
        }

        /* renamed from: e */
        public <U> C5985a m23104e(Class<U> cls, InterfaceC5964c<? super U> interfaceC5964c) {
            this.f14649a.put(cls, interfaceC5964c);
            this.f14650b.remove(cls);
            return this;
        }
    }

    C5984h(Map<Class<?>, InterfaceC5964c<?>> map, Map<Class<?>, InterfaceC5966e<?>> map2, InterfaceC5964c<Object> interfaceC5964c) {
        this.f14645a = map;
        this.f14646b = map2;
        this.f14647c = interfaceC5964c;
    }

    /* renamed from: a */
    public static C5985a m23110a() {
        return new C5985a();
    }

    /* renamed from: b */
    public void m23109b(Object obj, OutputStream outputStream) throws IOException {
        new C5982g(outputStream, this.f14645a, this.f14646b, this.f14647c).m23116r(obj);
    }

    /* renamed from: c */
    public byte[] m23108c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m23109b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
