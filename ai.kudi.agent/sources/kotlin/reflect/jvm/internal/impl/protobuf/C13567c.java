package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BoundedByteString.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c */
/* loaded from: classes3.dex */
public class C13567c extends C13598n {

    /* renamed from: f */
    private final int f29921f;

    /* renamed from: w */
    private final int f29922w;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BoundedByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$b */
    /* loaded from: classes3.dex */
    public class C13569b implements AbstractC13570d.InterfaceC13571a {

        /* renamed from: c */
        private int f29923c;

        /* renamed from: d */
        private final int f29924d;

        @Override // java.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29923c < this.f29924d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d.InterfaceC13571a
        public byte nextByte() {
            int i = this.f29923c;
            if (i < this.f29924d) {
                byte[] bArr = C13567c.this.f29986d;
                this.f29923c = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C13569b() {
            int mo4389i0 = C13567c.this.mo4389i0();
            this.f29923c = mo4389i0;
            this.f29924d = mo4389i0 + C13567c.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13567c(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0) {
            if (i + i2 <= bArr.length) {
                this.f29921f = i;
                this.f29922w = i2;
                return;
            }
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("Offset+Length too large: ");
            sb2.append(i);
            sb2.append("+");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13598n, kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d, java.lang.Iterable
    /* renamed from: I */
    public AbstractC13570d.InterfaceC13571a iterator() {
        return new C13569b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13598n
    /* renamed from: g0 */
    public byte mo4391g0(int i) {
        if (i >= 0) {
            if (i < size()) {
                return this.f29986d[this.f29921f + i];
            }
            int size = size();
            StringBuilder sb = new StringBuilder(41);
            sb.append("Index too large: ");
            sb.append(i);
            sb.append(", ");
            sb.append(size);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("Index too small: ");
        sb2.append(i);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13598n
    /* renamed from: i0 */
    public int mo4389i0() {
        return this.f29921f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13598n, kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    /* renamed from: s */
    public void mo4359s(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f29986d, mo4389i0() + i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13598n, kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
    public int size() {
        return this.f29922w;
    }
}
