package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
/* compiled from: AbstractMessageLite.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
/* loaded from: classes3.dex */
public abstract class AbstractC13563a implements InterfaceC13601o {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public UninitializedMessageException m4555e() {
        return new UninitializedMessageException(this);
    }

    /* renamed from: i */
    public void m4554i(OutputStream outputStream) throws IOException {
        int mo4384d = mo4384d();
        CodedOutputStream m4636J = CodedOutputStream.m4636J(outputStream, CodedOutputStream.m4579u(CodedOutputStream.m4577v(mo4384d) + mo4384d));
        m4636J.m4590o0(mo4384d);
        mo4385c(m4636J);
        m4636J.m4637I();
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC13564a<BuilderType extends AbstractC13564a> implements InterfaceC13601o.InterfaceC13602a {
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: i */
        public static UninitializedMessageException m4552i(InterfaceC13601o interfaceC13601o) {
            return new UninitializedMessageException(interfaceC13601o);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: e */
        public abstract BuilderType mo4381V(C13573e c13573e, C13575f c13575f) throws IOException;

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a */
        /* loaded from: classes3.dex */
        static final class C13565a extends FilterInputStream {

            /* renamed from: c */
            private int f29920c;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C13565a(InputStream inputStream, int i) {
                super(inputStream);
                this.f29920c = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f29920c);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f29920c <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f29920c--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, this.f29920c));
                if (skip >= 0) {
                    this.f29920c = (int) (this.f29920c - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f29920c;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f29920c -= read;
                }
                return read;
            }
        }
    }
}
