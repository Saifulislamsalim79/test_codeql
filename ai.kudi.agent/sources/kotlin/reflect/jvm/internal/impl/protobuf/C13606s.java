package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RopeByteString.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s */
/* loaded from: classes3.dex */
public class C13606s extends AbstractC13570d {

    /* renamed from: z */
    private static final int[] f29991z;

    /* renamed from: d */
    private final int f29992d;

    /* renamed from: e */
    private final AbstractC13570d f29993e;

    /* renamed from: f */
    private final AbstractC13570d f29994f;

    /* renamed from: w */
    private final int f29995w;

    /* renamed from: x */
    private final int f29996x;

    /* renamed from: y */
    private int f29997y;

    /* compiled from: RopeByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$b */
    /* loaded from: classes3.dex */
    private static class C13608b {

        /* renamed from: a */
        private final Stack<AbstractC13570d> f29998a;

        private C13608b() {
            this.f29998a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public AbstractC13570d m4356b(AbstractC13570d abstractC13570d, AbstractC13570d abstractC13570d2) {
            m4355c(abstractC13570d);
            m4355c(abstractC13570d2);
            AbstractC13570d pop = this.f29998a.pop();
            while (!this.f29998a.isEmpty()) {
                pop = new C13606s(this.f29998a.pop(), pop);
            }
            return pop;
        }

        /* renamed from: c */
        private void m4355c(AbstractC13570d abstractC13570d) {
            if (abstractC13570d.mo4374E()) {
                m4353e(abstractC13570d);
            } else if (abstractC13570d instanceof C13606s) {
                C13606s c13606s = (C13606s) abstractC13570d;
                m4355c(c13606s.f29993e);
                m4355c(c13606s.f29994f);
            } else {
                String valueOf = String.valueOf(String.valueOf(abstractC13570d.getClass()));
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: d */
        private int m4354d(int i) {
            int binarySearch = Arrays.binarySearch(C13606s.f29991z, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        private void m4353e(AbstractC13570d abstractC13570d) {
            int m4354d = m4354d(abstractC13570d.size());
            int i = C13606s.f29991z[m4354d + 1];
            if (!this.f29998a.isEmpty() && this.f29998a.peek().size() < i) {
                int i2 = C13606s.f29991z[m4354d];
                AbstractC13570d pop = this.f29998a.pop();
                while (!this.f29998a.isEmpty() && this.f29998a.peek().size() < i2) {
                    pop = new C13606s(this.f29998a.pop(), pop);
                }
                C13606s c13606s = new C13606s(pop, abstractC13570d);
                while (!this.f29998a.isEmpty()) {
                    if (this.f29998a.peek().size() >= C13606s.f29991z[m4354d(c13606s.size()) + 1]) {
                        break;
                    }
                    c13606s = new C13606s(this.f29998a.pop(), c13606s);
                }
                this.f29998a.push(c13606s);
                return;
            }
            this.f29998a.push(abstractC13570d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RopeByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$c */
    /* loaded from: classes3.dex */
    public static class C13609c implements Iterator<C13598n> {

        /* renamed from: c */
        private final Stack<C13606s> f29999c;

        /* renamed from: d */
        private C13598n f30000d;

        /* renamed from: a */
        private C13598n m4352a(AbstractC13570d abstractC13570d) {
            while (abstractC13570d instanceof C13606s) {
                C13606s c13606s = (C13606s) abstractC13570d;
                this.f29999c.push(c13606s);
                abstractC13570d = c13606s.f29993e;
            }
            return (C13598n) abstractC13570d;
        }

        /* renamed from: b */
        private C13598n m4351b() {
            while (!this.f29999c.isEmpty()) {
                C13598n m4352a = m4352a(this.f29999c.pop().f29994f);
                if (!m4352a.isEmpty()) {
                    return m4352a;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public C13598n next() {
            C13598n c13598n = this.f30000d;
            if (c13598n != null) {
                this.f30000d = m4351b();
                return c13598n;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30000d != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C13609c(AbstractC13570d abstractC13570d) {
            this.f29999c = new Stack<>();
            this.f30000d = m4352a(abstractC13570d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RopeByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$d */
    /* loaded from: classes3.dex */
    public class C13610d implements AbstractC13570d.InterfaceC13571a {

        /* renamed from: c */
        private final C13609c f30001c;

        /* renamed from: d */
        private AbstractC13570d.InterfaceC13571a f30002d;

        /* renamed from: e */
        int f30003e;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30003e > 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d.InterfaceC13571a
        public byte nextByte() {
            if (!this.f30002d.hasNext()) {
                this.f30002d = this.f30001c.next().iterator();
            }
            this.f30003e--;
            return this.f30002d.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C13610d(C13606s c13606s) {
            C13609c c13609c = new C13609c(c13606s);
            this.f30001c = c13609c;
            this.f30002d = c13609c.next().iterator();
            this.f30003e = c13606s.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f29991z = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f29991z;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public static AbstractC13570d m4362j0(AbstractC13570d abstractC13570d, AbstractC13570d abstractC13570d2) {
        C13606s c13606s = abstractC13570d instanceof C13606s ? (C13606s) abstractC13570d : null;
        if (abstractC13570d2.size() == 0) {
            return abstractC13570d;
        }
        if (abstractC13570d.size() != 0) {
            int size = abstractC13570d.size() + abstractC13570d2.size();
            if (size < 128) {
                return m4361k0(abstractC13570d, abstractC13570d2);
            }
            if (c13606s != null && c13606s.f29994f.size() + abstractC13570d2.size() < 128) {
                abstractC13570d2 = new C13606s(c13606s.f29993e, m4361k0(c13606s.f29994f, abstractC13570d2));
            } else if (c13606s != null && c13606s.f29993e.mo4358u() > c13606s.f29994f.mo4358u() && c13606s.mo4358u() > abstractC13570d2.mo4358u()) {
                abstractC13570d2 = new C13606s(c13606s.f29993e, new C13606s(c13606s.f29994f, abstractC13570d2));
            } else {
                if (size < f29991z[Math.max(abstractC13570d.mo4358u(), abstractC13570d2.mo4358u()) + 1]) {
                    return new C13608b().m4356b(abstractC13570d, abstractC13570d2);
                }
                return new C13606s(abstractC13570d, abstractC13570d2);
            }
        }
        return abstractC13570d2;
    }

    /* renamed from: k0 */
    private static C13598n m4361k0(AbstractC13570d abstractC13570d, AbstractC13570d abstractC13570d2) {
        int size = abstractC13570d.size();
        int size2 = abstractC13570d2.size();
        byte[] bArr = new byte[size + size2];
        abstractC13570d.m4532m(bArr, 0, 0, size);
        abstractC13570d2.m4532m(bArr, 0, size, size2);
        return new C13598n(bArr);
    }

    /* renamed from: l0 */
    private boolean m4360l0(AbstractC13570d abstractC13570d) {
        C13609c c13609c = new C13609c(this);
        C13598n next = c13609c.next();
        C13609c c13609c2 = new C13609c(abstractC13570d);
        C13598n next2 = c13609c2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = Math.min(size, size2);
            if (!(i == 0 ? next.m4390h0(next2, i2, min) : next2.m4390h0(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.f29992d;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                next = c13609c.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == size2) {
                next2 = c13609c2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: E */
    protected boolean mo4374E() {
        return this.f29992d >= f29991z[this.f29996x];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: F */
    public boolean mo4373F() {
        int mo4369V = this.f29993e.mo4369V(0, 0, this.f29995w);
        AbstractC13570d abstractC13570d = this.f29994f;
        return abstractC13570d.mo4369V(mo4369V, 0, abstractC13570d.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d, java.lang.Iterable
    /* renamed from: I */
    public AbstractC13570d.InterfaceC13571a iterator() {
        return new C13610d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: J */
    public C13573e mo4371J() {
        return C13573e.m4500g(new C13611e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: P */
    protected int mo4370P(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f29995w;
        if (i4 <= i5) {
            return this.f29993e.mo4370P(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f29994f.mo4370P(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f29994f.mo4370P(this.f29993e.mo4370P(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: V */
    protected int mo4369V(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f29995w;
        if (i4 <= i5) {
            return this.f29993e.mo4369V(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f29994f.mo4369V(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f29994f.mo4369V(this.f29993e.mo4369V(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: X */
    protected int mo4368X() {
        return this.f29997y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: b0 */
    public String mo4367b0(String str) throws UnsupportedEncodingException {
        return new String(m4541Z(), str);
    }

    public boolean equals(Object obj) {
        int mo4368X;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13570d) {
            AbstractC13570d abstractC13570d = (AbstractC13570d) obj;
            if (this.f29992d != abstractC13570d.size()) {
                return false;
            }
            if (this.f29992d == 0) {
                return true;
            }
            if (this.f29997y == 0 || (mo4368X = abstractC13570d.mo4368X()) == 0 || this.f29997y == mo4368X) {
                return m4360l0(abstractC13570d);
            }
            return false;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: f0 */
    void mo4366f0(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.f29995w;
        if (i3 <= i4) {
            this.f29993e.mo4366f0(outputStream, i, i2);
        } else if (i >= i4) {
            this.f29994f.mo4366f0(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.f29993e.mo4366f0(outputStream, i, i5);
            this.f29994f.mo4366f0(outputStream, 0, i2 - i5);
        }
    }

    public int hashCode() {
        int i = this.f29997y;
        if (i == 0) {
            int i2 = this.f29992d;
            i = mo4370P(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f29997y = i;
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: s */
    protected void mo4359s(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f29995w;
        if (i4 <= i5) {
            this.f29993e.mo4359s(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f29994f.mo4359s(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f29993e.mo4359s(bArr, i, i2, i6);
            this.f29994f.mo4359s(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    public int size() {
        return this.f29992d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: u */
    protected int mo4358u() {
        return this.f29996x;
    }

    private C13606s(AbstractC13570d abstractC13570d, AbstractC13570d abstractC13570d2) {
        this.f29997y = 0;
        this.f29993e = abstractC13570d;
        this.f29994f = abstractC13570d2;
        int size = abstractC13570d.size();
        this.f29995w = size;
        this.f29992d = size + abstractC13570d2.size();
        this.f29996x = Math.max(abstractC13570d.mo4358u(), abstractC13570d2.mo4358u()) + 1;
    }

    /* compiled from: RopeByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$e */
    /* loaded from: classes3.dex */
    private class C13611e extends InputStream {

        /* renamed from: c */
        private C13609c f30004c;

        /* renamed from: d */
        private C13598n f30005d;

        /* renamed from: e */
        private int f30006e;

        /* renamed from: f */
        private int f30007f;

        /* renamed from: w */
        private int f30008w;

        /* renamed from: x */
        private int f30009x;

        public C13611e() {
            m4347g();
        }

        /* renamed from: c */
        private void m4348c() {
            if (this.f30005d != null) {
                int i = this.f30007f;
                int i2 = this.f30006e;
                if (i == i2) {
                    this.f30008w += i2;
                    this.f30007f = 0;
                    if (this.f30004c.hasNext()) {
                        C13598n next = this.f30004c.next();
                        this.f30005d = next;
                        this.f30006e = next.size();
                        return;
                    }
                    this.f30005d = null;
                    this.f30006e = 0;
                }
            }
        }

        /* renamed from: g */
        private void m4347g() {
            C13609c c13609c = new C13609c(C13606s.this);
            this.f30004c = c13609c;
            C13598n next = c13609c.next();
            this.f30005d = next;
            this.f30006e = next.size();
            this.f30007f = 0;
            this.f30008w = 0;
        }

        /* renamed from: m */
        private int m4346m(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m4348c();
                if (this.f30005d != null) {
                    int min = Math.min(this.f30006e - this.f30007f, i3);
                    if (bArr != null) {
                        this.f30005d.m4532m(bArr, this.f30007f, i, min);
                        i += min;
                    }
                    this.f30007f += min;
                    i3 -= min;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return C13606s.this.size() - (this.f30008w + this.f30007f);
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f30009x = this.f30008w + this.f30007f;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (bArr != null) {
                if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                    return m4346m(bArr, i, i2);
                }
                throw new IndexOutOfBoundsException();
            }
            throw null;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m4347g();
            m4346m(null, 0, this.f30009x);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return m4346m(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            m4348c();
            C13598n c13598n = this.f30005d;
            if (c13598n == null) {
                return -1;
            }
            int i = this.f30007f;
            this.f30007f = i + 1;
            return c13598n.mo4391g0(i) & 255;
        }
    }
}
