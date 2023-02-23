package com.google.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
/* compiled from: ByteString.java */
/* renamed from: com.google.protobuf.i */
/* loaded from: classes2.dex */
public abstract class AbstractC7039i implements Iterable<Byte>, Serializable {

    /* renamed from: d */
    public static final AbstractC7039i f16815d = new C7048i(C6997a0.f16757b);

    /* renamed from: e */
    private static final InterfaceC7044e f16816e;

    /* renamed from: c */
    private int f16817c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$a */
    /* loaded from: classes2.dex */
    public class C7040a extends AbstractC7041b {

        /* renamed from: c */
        private int f16818c = 0;

        /* renamed from: d */
        private final int f16819d;

        C7040a() {
            this.f16819d = AbstractC7039i.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16818c < this.f16819d;
        }

        @Override // com.google.protobuf.AbstractC7039i.InterfaceC7045f
        public byte nextByte() {
            int i = this.f16818c;
            if (i < this.f16819d) {
                this.f16818c = i + 1;
                return AbstractC7039i.this.mo19314u(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$b */
    /* loaded from: classes2.dex */
    static abstract class AbstractC7041b implements InterfaceC7045f {
        AbstractC7041b() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$c */
    /* loaded from: classes2.dex */
    private static final class C7042c implements InterfaceC7044e {
        private C7042c() {
        }

        @Override // com.google.protobuf.AbstractC7039i.InterfaceC7044e
        /* renamed from: a */
        public byte[] mo20083a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        /* synthetic */ C7042c(C7040a c7040a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$d */
    /* loaded from: classes2.dex */
    public static final class C7043d extends C7048i {

        /* renamed from: w */
        private final int f16821w;

        /* renamed from: x */
        private final int f16822x;

        C7043d(byte[] bArr, int i, int i2) {
            super(bArr);
            AbstractC7039i.m20093h(i, i + i2, bArr.length);
            this.f16821w = i;
            this.f16822x = i2;
        }

        @Override // com.google.protobuf.AbstractC7039i.C7048i, com.google.protobuf.AbstractC7039i
        /* renamed from: e */
        public byte mo19318e(int i) {
            AbstractC7039i.m20096f(i, size());
            return this.f16825f[this.f16821w + i];
        }

        @Override // com.google.protobuf.AbstractC7039i.C7048i
        /* renamed from: k0 */
        protected int mo20084k0() {
            return this.f16821w;
        }

        @Override // com.google.protobuf.AbstractC7039i.C7048i, com.google.protobuf.AbstractC7039i
        /* renamed from: s */
        protected void mo19315s(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f16825f, mo20084k0() + i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.AbstractC7039i.C7048i, com.google.protobuf.AbstractC7039i
        public int size() {
            return this.f16822x;
        }

        @Override // com.google.protobuf.AbstractC7039i.C7048i, com.google.protobuf.AbstractC7039i
        /* renamed from: u */
        byte mo19314u(int i) {
            return this.f16825f[this.f16821w + i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC7044e {
        /* renamed from: a */
        byte[] mo20083a(byte[] bArr, int i, int i2);
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC7045f extends Iterator<Byte> {
        byte nextByte();
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$g */
    /* loaded from: classes2.dex */
    static final class C7046g {

        /* renamed from: a */
        private final CodedOutputStream f16823a;

        /* renamed from: b */
        private final byte[] f16824b;

        /* synthetic */ C7046g(int i, C7040a c7040a) {
            this(i);
        }

        /* renamed from: a */
        public AbstractC7039i m20087a() {
            this.f16823a.m20333d();
            return new C7048i(this.f16824b);
        }

        /* renamed from: b */
        public CodedOutputStream m20086b() {
            return this.f16823a;
        }

        private C7046g(int i) {
            byte[] bArr = new byte[i];
            this.f16824b = bArr;
            this.f16823a = CodedOutputStream.m20325h0(bArr);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$h */
    /* loaded from: classes2.dex */
    static abstract class AbstractC7047h extends AbstractC7039i {
        @Override // com.google.protobuf.AbstractC7039i, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$i */
    /* loaded from: classes2.dex */
    public static class C7048i extends AbstractC7047h {

        /* renamed from: f */
        protected final byte[] f16825f;

        C7048i(byte[] bArr) {
            if (bArr != null) {
                this.f16825f = bArr;
                return;
            }
            throw null;
        }

        @Override // com.google.protobuf.AbstractC7039i
        /* renamed from: E */
        public final boolean mo19324E() {
            int mo20084k0 = mo20084k0();
            return C7110s1.m19611t(this.f16825f, mo20084k0, size() + mo20084k0);
        }

        @Override // com.google.protobuf.AbstractC7039i
        /* renamed from: J */
        public final AbstractC7052j mo19323J() {
            return AbstractC7052j.m20061l(this.f16825f, mo20084k0(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC7039i
        /* renamed from: O */
        protected final int mo19322O(int i, int i2, int i3) {
            return C6997a0.m20227i(i, this.f16825f, mo20084k0() + i2, i3);
        }

        @Override // com.google.protobuf.AbstractC7039i
        /* renamed from: V */
        public final AbstractC7039i mo19321V(int i, int i2) {
            int m20093h = AbstractC7039i.m20093h(i, i2, size());
            if (m20093h == 0) {
                return AbstractC7039i.f16815d;
            }
            return new C7043d(this.f16825f, mo20084k0() + i, m20093h);
        }

        @Override // com.google.protobuf.AbstractC7039i
        /* renamed from: b0 */
        protected final String mo19320b0(Charset charset) {
            return new String(this.f16825f, mo20084k0(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC7039i
        /* renamed from: d */
        public final ByteBuffer mo19319d() {
            return ByteBuffer.wrap(this.f16825f, mo20084k0(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.AbstractC7039i
        /* renamed from: e */
        public byte mo19318e(int i) {
            return this.f16825f[i];
        }

        @Override // com.google.protobuf.AbstractC7039i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof AbstractC7039i) && size() == ((AbstractC7039i) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (obj instanceof C7048i) {
                    C7048i c7048i = (C7048i) obj;
                    int m20101P = m20101P();
                    int m20101P2 = c7048i.m20101P();
                    if (m20101P == 0 || m20101P2 == 0 || m20101P == m20101P2) {
                        return m20085j0(c7048i, 0, size());
                    }
                    return false;
                }
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC7039i
        /* renamed from: i0 */
        final void mo19317i0(AbstractC7033h abstractC7033h) throws IOException {
            abstractC7033h.mo20112b(this.f16825f, mo20084k0(), size());
        }

        /* renamed from: j0 */
        final boolean m20085j0(AbstractC7039i abstractC7039i, int i, int i2) {
            if (i2 <= abstractC7039i.size()) {
                int i3 = i + i2;
                if (i3 <= abstractC7039i.size()) {
                    if (abstractC7039i instanceof C7048i) {
                        C7048i c7048i = (C7048i) abstractC7039i;
                        byte[] bArr = this.f16825f;
                        byte[] bArr2 = c7048i.f16825f;
                        int mo20084k0 = mo20084k0() + i2;
                        int mo20084k02 = mo20084k0();
                        int mo20084k03 = c7048i.mo20084k0() + i;
                        while (mo20084k02 < mo20084k0) {
                            if (bArr[mo20084k02] != bArr2[mo20084k03]) {
                                return false;
                            }
                            mo20084k02++;
                            mo20084k03++;
                        }
                        return true;
                    }
                    return abstractC7039i.mo19321V(i, i3).equals(mo19321V(0, i2));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + abstractC7039i.size());
            }
            throw new IllegalArgumentException("Length too large: " + i2 + size());
        }

        /* renamed from: k0 */
        protected int mo20084k0() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC7039i
        /* renamed from: s */
        protected void mo19315s(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f16825f, i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.AbstractC7039i
        public int size() {
            return this.f16825f.length;
        }

        @Override // com.google.protobuf.AbstractC7039i
        /* renamed from: u */
        byte mo19314u(int i) {
            return this.f16825f[i];
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$j */
    /* loaded from: classes2.dex */
    private static final class C7049j implements InterfaceC7044e {
        private C7049j() {
        }

        @Override // com.google.protobuf.AbstractC7039i.InterfaceC7044e
        /* renamed from: a */
        public byte[] mo20083a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        /* synthetic */ C7049j(C7040a c7040a) {
            this();
        }
    }

    static {
        f16816e = C7014d.m20216c() ? new C7049j(null) : new C7042c(null);
    }

    AbstractC7039i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static C7046g m20102I(int i) {
        return new C7046g(i, null);
    }

    /* renamed from: e0 */
    private String m20097e0() {
        if (size() <= 50) {
            return C7080m1.m19809a(this);
        }
        return C7080m1.m19809a(mo19321V(0, 47)) + "...";
    }

    /* renamed from: f */
    static void m20096f(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public static AbstractC7039i m20095f0(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return m20092h0(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        return new C7150z0(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public static AbstractC7039i m20094g0(byte[] bArr) {
        return new C7048i(bArr);
    }

    /* renamed from: h */
    static int m20093h(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
            } else if (i2 < i) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public static AbstractC7039i m20092h0(byte[] bArr, int i, int i2) {
        return new C7043d(bArr, i, i2);
    }

    /* renamed from: k */
    public static AbstractC7039i m20091k(byte[] bArr) {
        return m20090l(bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static AbstractC7039i m20090l(byte[] bArr, int i, int i2) {
        m20093h(i, i + i2, bArr.length);
        return new C7048i(f16816e.mo20083a(bArr, i, i2));
    }

    /* renamed from: m */
    public static AbstractC7039i m20089m(String str) {
        return new C7048i(str.getBytes(C6997a0.f16756a));
    }

    /* renamed from: E */
    public abstract boolean mo19324E();

    @Override // java.lang.Iterable
    /* renamed from: F */
    public InterfaceC7045f iterator() {
        return new C7040a();
    }

    /* renamed from: J */
    public abstract AbstractC7052j mo19323J();

    /* renamed from: O */
    protected abstract int mo19322O(int i, int i2, int i3);

    /* renamed from: P */
    protected final int m20101P() {
        return this.f16817c;
    }

    /* renamed from: V */
    public abstract AbstractC7039i mo19321V(int i, int i2);

    /* renamed from: X */
    public final byte[] m20100X() {
        int size = size();
        if (size == 0) {
            return C6997a0.f16757b;
        }
        byte[] bArr = new byte[size];
        mo19315s(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: Z */
    public final String m20099Z(Charset charset) {
        return size() == 0 ? "" : mo19320b0(charset);
    }

    /* renamed from: b0 */
    protected abstract String mo19320b0(Charset charset);

    /* renamed from: d */
    public abstract ByteBuffer mo19319d();

    /* renamed from: d0 */
    public final String m20098d0() {
        return m20099Z(C6997a0.f16756a);
    }

    /* renamed from: e */
    public abstract byte mo19318e(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f16817c;
        if (i == 0) {
            int size = size();
            i = mo19322O(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f16817c = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public abstract void mo19317i0(AbstractC7033h abstractC7033h) throws IOException;

    /* renamed from: s */
    protected abstract void mo19315s(byte[] bArr, int i, int i2, int i3);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m20097e0());
    }

    /* renamed from: u */
    abstract byte mo19314u(int i);
}
