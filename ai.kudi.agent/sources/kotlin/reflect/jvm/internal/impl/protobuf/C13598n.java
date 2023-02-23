package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiteralByteString.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.n */
/* loaded from: classes3.dex */
public class C13598n extends AbstractC13570d {

    /* renamed from: d */
    protected final byte[] f29986d;

    /* renamed from: e */
    private int f29987e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LiteralByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.n$b */
    /* loaded from: classes3.dex */
    public class C13600b implements AbstractC13570d.InterfaceC13571a {

        /* renamed from: c */
        private int f29988c;

        /* renamed from: d */
        private final int f29989d;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29988c < this.f29989d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d.InterfaceC13571a
        public byte nextByte() {
            try {
                byte[] bArr = C13598n.this.f29986d;
                int i = this.f29988c;
                this.f29988c = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C13600b() {
            this.f29988c = 0;
            this.f29989d = C13598n.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13598n(byte[] bArr) {
        this.f29986d = bArr;
    }

    /* renamed from: j0 */
    static int m4388j0(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: E */
    protected boolean mo4374E() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: F */
    public boolean mo4373F() {
        int mo4389i0 = mo4389i0();
        return C13623v.m4305f(this.f29986d, mo4389i0, size() + mo4389i0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d, java.lang.Iterable
    /* renamed from: I */
    public AbstractC13570d.InterfaceC13571a iterator() {
        return new C13600b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: J */
    public C13573e mo4371J() {
        return C13573e.m4499h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: P */
    protected int mo4370P(int i, int i2, int i3) {
        return m4388j0(i, this.f29986d, mo4389i0() + i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: V */
    protected int mo4369V(int i, int i2, int i3) {
        int mo4389i0 = mo4389i0() + i2;
        return C13623v.m4304g(i, this.f29986d, mo4389i0, i3 + mo4389i0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: X */
    protected int mo4368X() {
        return this.f29987e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: b0 */
    public String mo4367b0(String str) throws UnsupportedEncodingException {
        return new String(this.f29986d, mo4389i0(), size(), str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC13570d) && size() == ((AbstractC13570d) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof C13598n) {
                return m4390h0((C13598n) obj, 0, size());
            }
            if (obj instanceof C13606s) {
                return obj.equals(this);
            }
            String valueOf = String.valueOf(String.valueOf(obj.getClass()));
            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
            sb.append("Has a new type of ByteString been created? Found ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: f0 */
    void mo4366f0(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f29986d, mo4389i0() + i, i2);
    }

    /* renamed from: g0 */
    public byte mo4391g0(int i) {
        return this.f29986d[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public boolean m4390h0(C13598n c13598n, int i, int i2) {
        if (i2 <= c13598n.size()) {
            if (i + i2 <= c13598n.size()) {
                byte[] bArr = this.f29986d;
                byte[] bArr2 = c13598n.f29986d;
                int mo4389i0 = mo4389i0() + i2;
                int mo4389i02 = mo4389i0();
                int mo4389i03 = c13598n.mo4389i0() + i;
                while (mo4389i02 < mo4389i0) {
                    if (bArr[mo4389i02] != bArr2[mo4389i03]) {
                        return false;
                    }
                    mo4389i02++;
                    mo4389i03++;
                }
                return true;
            }
            int size = c13598n.size();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(", ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int size2 = size();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i2);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int i = this.f29987e;
        if (i == 0) {
            int size = size();
            i = mo4370P(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f29987e = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i0 */
    public int mo4389i0() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: s */
    protected void mo4359s(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f29986d, i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    public int size() {
        return this.f29986d.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: u */
    protected int mo4358u() {
        return 0;
    }
}
