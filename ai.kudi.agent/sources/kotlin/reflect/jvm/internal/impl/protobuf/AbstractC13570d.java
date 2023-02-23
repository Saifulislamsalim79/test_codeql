package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: ByteString.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d */
/* loaded from: classes3.dex */
public abstract class AbstractC13570d implements Iterable<Byte> {

    /* renamed from: c */
    public static final AbstractC13570d f29926c = new C13598n(new byte[0]);

    /* compiled from: ByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC13571a extends Iterator<Byte> {
        byte nextByte();
    }

    /* renamed from: O */
    public static C13572b m4542O() {
        return new C13572b(128);
    }

    /* renamed from: d */
    private static AbstractC13570d m4540d(Iterator<AbstractC13570d> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return m4540d(it, i2).m4538e(m4540d(it, i - i2));
    }

    /* renamed from: f */
    public static AbstractC13570d m4536f(Iterable<AbstractC13570d> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (AbstractC13570d abstractC13570d : iterable) {
                collection.add(abstractC13570d);
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return f29926c;
        }
        return m4540d(collection.iterator(), collection.size());
    }

    /* renamed from: h */
    public static AbstractC13570d m4535h(byte[] bArr) {
        return m4534k(bArr, 0, bArr.length);
    }

    /* renamed from: k */
    public static AbstractC13570d m4534k(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C13598n(bArr2);
    }

    /* renamed from: l */
    public static AbstractC13570d m4533l(String str) {
        try {
            return new C13598n(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public abstract boolean mo4374E();

    /* renamed from: F */
    public abstract boolean mo4373F();

    @Override // java.lang.Iterable
    /* renamed from: I */
    public abstract InterfaceC13571a iterator();

    /* renamed from: J */
    public abstract C13573e mo4371J();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: P */
    public abstract int mo4370P(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public abstract int mo4369V(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public abstract int mo4368X();

    /* renamed from: Z */
    public byte[] m4541Z() {
        int size = size();
        if (size == 0) {
            return C13588i.f29976a;
        }
        byte[] bArr = new byte[size];
        mo4359s(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: b0 */
    public abstract String mo4367b0(String str) throws UnsupportedEncodingException;

    /* renamed from: d0 */
    public String m4539d0() {
        try {
            return mo4367b0("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: e */
    public AbstractC13570d m4538e(AbstractC13570d abstractC13570d) {
        int size = size();
        int size2 = abstractC13570d.size();
        if (size + size2 < 2147483647L) {
            return C13606s.m4362j0(this, abstractC13570d);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void m4537e0(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 <= size()) {
                if (i2 > 0) {
                    mo4366f0(outputStream, i, i2);
                    return;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("Source end offset exceeded: ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public abstract void mo4366f0(OutputStream outputStream, int i, int i2) throws IOException;

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: m */
    public void m4532m(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 <= bArr.length) {
                    if (i3 > 0) {
                        mo4359s(bArr, i, i2, i3);
                        return;
                    }
                    return;
                }
                StringBuilder sb3 = new StringBuilder(34);
                sb3.append("Target end offset < 0: ");
                sb3.append(i5);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new IndexOutOfBoundsException(sb4.toString());
        } else {
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append("Length < 0: ");
            sb5.append(i3);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo4359s(byte[] bArr, int i, int i2, int i3);

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public abstract int mo4358u();

    /* compiled from: ByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b */
    /* loaded from: classes3.dex */
    public static final class C13572b extends OutputStream {

        /* renamed from: x */
        private static final byte[] f29927x = new byte[0];

        /* renamed from: c */
        private final int f29928c;

        /* renamed from: d */
        private final ArrayList<AbstractC13570d> f29929d;

        /* renamed from: e */
        private int f29930e;

        /* renamed from: f */
        private byte[] f29931f;

        /* renamed from: w */
        private int f29932w;

        C13572b(int i) {
            if (i >= 0) {
                this.f29928c = i;
                this.f29929d = new ArrayList<>();
                this.f29931f = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: c */
        private byte[] m4529c(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* renamed from: g */
        private void m4528g(int i) {
            this.f29929d.add(new C13598n(this.f29931f));
            int length = this.f29930e + this.f29931f.length;
            this.f29930e = length;
            this.f29931f = new byte[Math.max(this.f29928c, Math.max(i, length >>> 1))];
            this.f29932w = 0;
        }

        /* renamed from: m */
        private void m4527m() {
            int i = this.f29932w;
            byte[] bArr = this.f29931f;
            if (i >= bArr.length) {
                this.f29929d.add(new C13598n(this.f29931f));
                this.f29931f = f29927x;
            } else if (i > 0) {
                this.f29929d.add(new C13598n(m4529c(bArr, i)));
            }
            this.f29930e += this.f29932w;
            this.f29932w = 0;
        }

        /* renamed from: F */
        public synchronized int m4531F() {
            return this.f29930e + this.f29932w;
        }

        /* renamed from: I */
        public synchronized AbstractC13570d m4530I() {
            m4527m();
            return AbstractC13570d.m4536f(this.f29929d);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m4531F()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            if (this.f29932w == this.f29931f.length) {
                m4528g(1);
            }
            byte[] bArr = this.f29931f;
            int i2 = this.f29932w;
            this.f29932w = i2 + 1;
            bArr[i2] = (byte) i;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            if (i2 <= this.f29931f.length - this.f29932w) {
                System.arraycopy(bArr, i, this.f29931f, this.f29932w, i2);
                this.f29932w += i2;
            } else {
                int length = this.f29931f.length - this.f29932w;
                System.arraycopy(bArr, i, this.f29931f, this.f29932w, length);
                int i3 = i2 - length;
                m4528g(i3);
                System.arraycopy(bArr, i + length, this.f29931f, 0, i3);
                this.f29932w = i3;
            }
        }
    }
}
