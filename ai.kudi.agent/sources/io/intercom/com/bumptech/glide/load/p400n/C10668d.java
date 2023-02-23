package io.intercom.com.bumptech.glide.load.p400n;

import android.util.Log;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.p415q.C10882b;
import io.intercom.com.bumptech.glide.p416r.C10883a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferFileLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.d */
/* loaded from: classes3.dex */
public class C10668d implements InterfaceC10697n<File, ByteBuffer> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.d$a */
    /* loaded from: classes3.dex */
    public static class C10669a implements InterfaceC10631b<ByteBuffer> {

        /* renamed from: c */
        private final File f24470c;

        C10669a(File file) {
            this.f24470c = file;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: a */
        public Class<ByteBuffer> mo12474a() {
            return ByteBuffer.class;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: b */
        public void mo12473b() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public void cancel() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: e */
        public void mo12472e(EnumC10482g enumC10482g, InterfaceC10631b.InterfaceC10632a<? super ByteBuffer> interfaceC10632a) {
            try {
                interfaceC10632a.mo12496d(C10883a.m12043a(this.f24470c));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                interfaceC10632a.mo12497c(e);
            }
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public EnumC10507a getDataSource() {
            return EnumC10507a.LOCAL;
        }
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.d$b */
    /* loaded from: classes3.dex */
    public static class C10670b implements InterfaceC10699o<File, ByteBuffer> {
        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<File, ByteBuffer> mo12453b(C10705r c10705r) {
            return new C10668d();
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<ByteBuffer> mo12456b(File file, int i, int i2, C10626i c10626i) {
        return new InterfaceC10697n.C10698a<>(new C10882b(file), new C10669a(file));
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(File file) {
        return true;
    }
}
