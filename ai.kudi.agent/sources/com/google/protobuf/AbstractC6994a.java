package com.google.protobuf;

import com.google.protobuf.AbstractC6994a;
import com.google.protobuf.AbstractC6994a.AbstractC6995a;
import com.google.protobuf.AbstractC7039i;
import com.google.protobuf.InterfaceC7100r0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: AbstractMessageLite.java */
/* renamed from: com.google.protobuf.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6994a<MessageType extends AbstractC6994a<MessageType, BuilderType>, BuilderType extends AbstractC6995a<MessageType, BuilderType>> implements InterfaceC7100r0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static <T> void m20243m(Iterable<T> iterable, List<? super T> list) {
        AbstractC6995a.m20239r(iterable, list);
    }

    /* renamed from: t */
    private String m20241t(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.InterfaceC7100r0
    /* renamed from: c */
    public void mo19710c(OutputStream outputStream) throws IOException {
        CodedOutputStream m20327g0 = CodedOutputStream.m20327g0(outputStream, CodedOutputStream.m20362J(mo19378d()));
        mo19376j(m20327g0);
        m20327g0.mo20274d0();
    }

    @Override // com.google.protobuf.InterfaceC7100r0
    /* renamed from: e */
    public byte[] mo19709e() {
        try {
            byte[] bArr = new byte[mo19378d()];
            CodedOutputStream m20325h0 = CodedOutputStream.m20325h0(bArr);
            mo19376j(m20325h0);
            m20325h0.m20333d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m20241t("byte array"), e);
        }
    }

    @Override // com.google.protobuf.InterfaceC7100r0
    /* renamed from: n */
    public AbstractC7039i mo19708n() {
        try {
            AbstractC7039i.C7046g m20102I = AbstractC7039i.m20102I(mo19378d());
            mo19376j(m20102I.m20086b());
            return m20102I.m20087a();
        } catch (IOException e) {
            throw new RuntimeException(m20241t("ByteString"), e);
        }
    }

    /* renamed from: r */
    int mo19375r() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public int m20242s(InterfaceC7038h1 interfaceC7038h1) {
        int mo19375r = mo19375r();
        if (mo19375r == -1) {
            int mo19418h = interfaceC7038h1.mo19418h(this);
            mo19374v(mo19418h);
            return mo19418h;
        }
        return mo19375r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public UninitializedMessageException m20240u() {
        return new UninitializedMessageException(this);
    }

    /* renamed from: v */
    void mo19374v(int i) {
        throw new UnsupportedOperationException();
    }

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.protobuf.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6995a<MessageType extends AbstractC6994a<MessageType, BuilderType>, BuilderType extends AbstractC6995a<MessageType, BuilderType>> implements InterfaceC7100r0.InterfaceC7101a {
        /* renamed from: r */
        protected static <T> void m20239r(Iterable<T> iterable, List<? super T> list) {
            C6997a0.m20235a(iterable);
            if (iterable instanceof InterfaceC7031g0) {
                List<?> mo19727p = ((InterfaceC7031g0) iterable).mo19727p();
                InterfaceC7031g0 interfaceC7031g0 = (InterfaceC7031g0) list;
                int size = list.size();
                for (Object obj : mo19727p) {
                    if (obj == null) {
                        String str = "Element at index " + (interfaceC7031g0.size() - size) + " is null.";
                        for (int size2 = interfaceC7031g0.size() - 1; size2 >= size; size2--) {
                            interfaceC7031g0.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (obj instanceof AbstractC7039i) {
                        interfaceC7031g0.mo19731A((AbstractC7039i) obj);
                    } else {
                        interfaceC7031g0.add((String) obj);
                    }
                }
            } else if (iterable instanceof InterfaceC7010b1) {
                list.addAll((Collection) iterable);
            } else {
                m20238s(iterable, list);
            }
        }

        /* renamed from: s */
        private static <T> void m20238s(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: v */
        public static UninitializedMessageException m20236v(InterfaceC7100r0 interfaceC7100r0) {
            return new UninitializedMessageException(interfaceC7100r0);
        }

        /* renamed from: t */
        protected abstract BuilderType mo19362t(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: u */
        public BuilderType m20237u(InterfaceC7100r0 interfaceC7100r0) {
            if (mo19354a().getClass().isInstance(interfaceC7100r0)) {
                mo19362t((AbstractC6994a) interfaceC7100r0);
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // com.google.protobuf.InterfaceC7100r0.InterfaceC7101a
        /* renamed from: w0 */
        public /* bridge */ /* synthetic */ InterfaceC7100r0.InterfaceC7101a mo19707w0(InterfaceC7100r0 interfaceC7100r0) {
            m20237u(interfaceC7100r0);
            return this;
        }

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: com.google.protobuf.a$a$a */
        /* loaded from: classes2.dex */
        static final class C6996a extends FilterInputStream {

            /* renamed from: c */
            private int f16755c;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C6996a(InputStream inputStream, int i) {
                super(inputStream);
                this.f16755c = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f16755c);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f16755c <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f16755c--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, this.f16755c));
                if (skip >= 0) {
                    this.f16755c = (int) (this.f16755c - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f16755c;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f16755c -= read;
                }
                return read;
            }
        }
    }
}
