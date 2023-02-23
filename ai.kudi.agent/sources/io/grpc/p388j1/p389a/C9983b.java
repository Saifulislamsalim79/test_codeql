package io.grpc.p388j1.p389a;

import com.google.common.base.C5051n;
import com.google.protobuf.AbstractC7052j;
import com.google.protobuf.C7089p;
import com.google.protobuf.InterfaceC7007a1;
import com.google.protobuf.InterfaceC7100r0;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.C10060t0;
import io.grpc.C9497c1;
import io.grpc.InterfaceC10017m0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* compiled from: ProtoLiteUtils.java */
/* renamed from: io.grpc.j1.a.b */
/* loaded from: classes2.dex */
public final class C9983b {

    /* renamed from: a */
    static volatile C7089p f23695a = C7089p.m19769b();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProtoLiteUtils.java */
    /* renamed from: io.grpc.j1.a.b$a */
    /* loaded from: classes2.dex */
    public static final class C9984a<T extends InterfaceC7100r0> implements Object<T> {

        /* renamed from: c */
        private static final ThreadLocal<Reference<byte[]>> f23696c = new ThreadLocal<>();

        /* renamed from: a */
        private final InterfaceC7007a1<T> f23697a;

        /* renamed from: b */
        private final T f23698b;

        C9984a(T t) {
            this.f23698b = t;
            this.f23697a = (InterfaceC7007a1<T>) t.mo19377g();
        }

        /* renamed from: d */
        private T m13370d(AbstractC7052j abstractC7052j) throws InvalidProtocolBufferException {
            T parseFrom = this.f23697a.parseFrom(abstractC7052j, C9983b.f23695a);
            try {
                abstractC7052j.mo19999a(0);
                return parseFrom;
            } catch (InvalidProtocolBufferException e) {
                e.m20247l(parseFrom);
                throw e;
            }
        }

        /* renamed from: c */
        public T m13373a(InputStream inputStream) {
            byte[] bArr;
            if ((inputStream instanceof C9982a) && ((C9982a) inputStream).m13376m() == this.f23697a) {
                try {
                    return (T) ((C9982a) inputStream).m13377g();
                } catch (IllegalStateException unused) {
                }
            }
            AbstractC7052j abstractC7052j = null;
            try {
                if (inputStream instanceof InterfaceC10017m0) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        Reference<byte[]> reference = f23696c.get();
                        if (reference == null || (bArr = reference.get()) == null || bArr.length < available) {
                            bArr = new byte[available];
                            f23696c.set(new WeakReference(bArr));
                        }
                        int i = available;
                        while (i > 0) {
                            int read = inputStream.read(bArr, available - i, i);
                            if (read == -1) {
                                break;
                            }
                            i -= read;
                        }
                        if (i == 0) {
                            abstractC7052j = AbstractC7052j.m20062k(bArr, 0, available);
                        } else {
                            int i2 = available - i;
                            throw new RuntimeException("size inaccurate: " + available + " != " + i2);
                        }
                    } else if (available == 0) {
                        return this.f23698b;
                    }
                }
                if (abstractC7052j == null) {
                    abstractC7052j = AbstractC7052j.m20067f(inputStream);
                }
                abstractC7052j.m20070H(Integer.MAX_VALUE);
                try {
                    return m13370d(abstractC7052j);
                } catch (InvalidProtocolBufferException e) {
                    throw C9497c1.f22194m.m14578r("Invalid protobuf byte sequence").m14579q(e).m14592d();
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* renamed from: e */
        public InputStream m13372b(T t) {
            return new C9982a(t, this.f23697a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m13375a(InputStream inputStream, OutputStream outputStream) throws IOException {
        C5051n.m25779o(inputStream, "inputStream cannot be null!");
        C5051n.m25779o(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* renamed from: b */
    public static <T extends InterfaceC7100r0> C10060t0.InterfaceC10063c<T> m13374b(T t) {
        return new C9984a(t);
    }
}
