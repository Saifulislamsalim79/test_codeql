package com.google.protobuf;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import com.google.protobuf.C7064k0;
import com.google.protobuf.C7118t1;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* compiled from: BinaryReader.java */
/* renamed from: com.google.protobuf.f */
/* loaded from: classes2.dex */
abstract class AbstractC7025f implements InterfaceC7032g1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BinaryReader.java */
    /* renamed from: com.google.protobuf.f$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C7026a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16796a;

        static {
            int[] iArr = new int[C7118t1.EnumC7120b.values().length];
            f16796a = iArr;
            try {
                iArr[C7118t1.EnumC7120b.f16950B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16954F.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16962e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16956H.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16949A.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16967z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16963f.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16966y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16964w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16953E.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16957I.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16958J.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16959K.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16960L.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16951C.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16955G.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16796a[C7118t1.EnumC7120b.f16965x.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryReader.java */
    /* renamed from: com.google.protobuf.f$b */
    /* loaded from: classes2.dex */
    private static final class C7027b extends AbstractC7025f {

        /* renamed from: a */
        private final boolean f16797a;

        /* renamed from: b */
        private final byte[] f16798b;

        /* renamed from: c */
        private int f16799c;

        /* renamed from: d */
        private int f16800d;

        /* renamed from: e */
        private int f16801e;

        /* renamed from: f */
        private int f16802f;

        public C7027b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.f16797a = z;
            this.f16798b = byteBuffer.array();
            this.f16799c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f16800d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: Q */
        private boolean m20156Q() {
            return this.f16799c == this.f16800d;
        }

        /* renamed from: R */
        private byte m20155R() throws IOException {
            int i = this.f16799c;
            if (i != this.f16800d) {
                byte[] bArr = this.f16798b;
                this.f16799c = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        /* renamed from: S */
        private Object m20154S(C7118t1.EnumC7120b enumC7120b, Class<?> cls, C7089p c7089p) throws IOException {
            switch (C7026a.f16796a[enumC7120b.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo19888j());
                case 2:
                    return mo19916F();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo19878t());
                case 5:
                    return Integer.valueOf(mo19889i());
                case 6:
                    return Long.valueOf(mo19895c());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo19914H());
                case 9:
                    return Long.valueOf(mo19909M());
                case 10:
                    return mo19890h(cls, c7089p);
                case 11:
                    return Integer.valueOf(mo19912J());
                case 12:
                    return Long.valueOf(mo19886l());
                case 13:
                    return Integer.valueOf(mo19876v());
                case 14:
                    return Long.valueOf(mo19875w());
                case 15:
                    return mo19908N();
                case 16:
                    return Integer.valueOf(mo19883o());
                case 17:
                    return Long.valueOf(mo19896b());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: T */
        private <T> T m20153T(InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
            int i = this.f16802f;
            this.f16802f = C7118t1.m19562c(C7118t1.m19564a(this.f16801e), 4);
            try {
                T mo19417i = interfaceC7038h1.mo19417i();
                interfaceC7038h1.mo19421e(mo19417i, this, c7089p);
                interfaceC7038h1.mo19423c(mo19417i);
                if (this.f16801e == this.f16802f) {
                    return mo19417i;
                }
                throw InvalidProtocolBufferException.m20250i();
            } finally {
                this.f16802f = i;
            }
        }

        /* renamed from: U */
        private int m20152U() throws IOException {
            m20142e0(4);
            return m20151V();
        }

        /* renamed from: V */
        private int m20151V() {
            int i = this.f16799c;
            byte[] bArr = this.f16798b;
            this.f16799c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: W */
        private long m20150W() throws IOException {
            m20142e0(8);
            return m20149X();
        }

        /* renamed from: X */
        private long m20149X() {
            int i = this.f16799c;
            byte[] bArr = this.f16798b;
            this.f16799c = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* renamed from: Y */
        private <T> T m20148Y(InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
            int m20145b0 = m20145b0();
            m20142e0(m20145b0);
            int i = this.f16800d;
            int i2 = this.f16799c + m20145b0;
            this.f16800d = i2;
            try {
                T mo19417i = interfaceC7038h1.mo19417i();
                interfaceC7038h1.mo19421e(mo19417i, this, c7089p);
                interfaceC7038h1.mo19423c(mo19417i);
                if (this.f16799c == i2) {
                    return mo19417i;
                }
                throw InvalidProtocolBufferException.m20250i();
            } finally {
                this.f16800d = i;
            }
        }

        /* renamed from: b0 */
        private int m20145b0() throws IOException {
            int i;
            int i2 = this.f16799c;
            int i3 = this.f16800d;
            if (i3 != i2) {
                byte[] bArr = this.f16798b;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f16799c = i4;
                    return b;
                } else if (i3 - i4 < 9) {
                    return (int) m20143d0();
                } else {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                i7 = i5 + 1;
                                byte b2 = bArr[i5];
                                i = (i9 ^ (b2 << PrinterCommands.OTHER_SYMBOL)) ^ 266354560;
                                if (b2 < 0) {
                                    i5 = i7 + 1;
                                    if (bArr[i7] < 0) {
                                        i7 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i7 + 1;
                                            if (bArr[i7] < 0) {
                                                i7 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    i5 = i7 + 1;
                                                    if (bArr[i7] < 0) {
                                                        throw InvalidProtocolBufferException.m20252g();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i7;
                    }
                    this.f16799c = i5;
                    return i;
                }
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        /* renamed from: d0 */
        private long m20143d0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte m20155R = m20155R();
                j |= (m20155R & Byte.MAX_VALUE) << i;
                if ((m20155R & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m20252g();
        }

        /* renamed from: e0 */
        private void m20142e0(int i) throws IOException {
            if (i < 0 || i > this.f16800d - this.f16799c) {
                throw InvalidProtocolBufferException.m20245n();
            }
        }

        /* renamed from: f0 */
        private void m20141f0(int i) throws IOException {
            if (this.f16799c != i) {
                throw InvalidProtocolBufferException.m20245n();
            }
        }

        /* renamed from: g0 */
        private void m20140g0(int i) throws IOException {
            if (C7118t1.m19563b(this.f16801e) != i) {
                throw InvalidProtocolBufferException.m20253f();
            }
        }

        /* renamed from: h0 */
        private void m20139h0(int i) throws IOException {
            m20142e0(i);
            this.f16799c += i;
        }

        /* renamed from: i0 */
        private void m20138i0() throws IOException {
            int i = this.f16802f;
            this.f16802f = C7118t1.m19562c(C7118t1.m19564a(this.f16801e), 4);
            while (mo19921A() != Integer.MAX_VALUE && mo19913I()) {
            }
            if (this.f16801e == this.f16802f) {
                this.f16802f = i;
                return;
            }
            throw InvalidProtocolBufferException.m20250i();
        }

        /* renamed from: j0 */
        private void m20137j0() throws IOException {
            int i = this.f16800d;
            int i2 = this.f16799c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f16798b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f16799c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            m20136k0();
        }

        /* renamed from: k0 */
        private void m20136k0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m20155R() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m20252g();
        }

        /* renamed from: l0 */
        private void m20135l0(int i) throws IOException {
            m20142e0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.m20250i();
            }
        }

        /* renamed from: m0 */
        private void m20134m0(int i) throws IOException {
            m20142e0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.m20250i();
            }
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: A */
        public int mo19921A() throws IOException {
            if (m20156Q()) {
                return Integer.MAX_VALUE;
            }
            int m20145b0 = m20145b0();
            this.f16801e = m20145b0;
            if (m20145b0 == this.f16802f) {
                return Integer.MAX_VALUE;
            }
            return C7118t1.m19564a(m20145b0);
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: B */
        public void mo19920B(List<String> list) throws IOException {
            m20146a0(list, false);
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: C */
        public <T> T mo19919C(InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
            m20140g0(2);
            return (T) m20148Y(interfaceC7038h1, c7089p);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: D */
        public <K, V> void mo19918D(Map<K, V> map, C7064k0.C7065a<K, V> c7065a, C7089p c7089p) throws IOException {
            m20140g0(2);
            int m20145b0 = m20145b0();
            m20142e0(m20145b0);
            int i = this.f16800d;
            this.f16800d = this.f16799c + m20145b0;
            try {
                Object obj = c7065a.f16877b;
                Object obj2 = c7065a.f16879d;
                while (true) {
                    int mo19921A = mo19921A();
                    if (mo19921A == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (mo19921A == 1) {
                        obj = m20154S(c7065a.f16876a, null, null);
                    } else if (mo19921A != 2) {
                        try {
                            if (!mo19913I()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!mo19913I()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = m20154S(c7065a.f16878c, c7065a.f16879d.getClass(), c7089p);
                    }
                }
            } finally {
                this.f16800d = i;
            }
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: E */
        public void mo19917E(List<String> list) throws IOException {
            m20146a0(list, true);
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: F */
        public AbstractC7039i mo19916F() throws IOException {
            AbstractC7039i m20090l;
            m20140g0(2);
            int m20145b0 = m20145b0();
            if (m20145b0 == 0) {
                return AbstractC7039i.f16815d;
            }
            m20142e0(m20145b0);
            if (this.f16797a) {
                m20090l = AbstractC7039i.m20092h0(this.f16798b, this.f16799c, m20145b0);
            } else {
                m20090l = AbstractC7039i.m20090l(this.f16798b, this.f16799c, m20145b0);
            }
            this.f16799c += m20145b0;
            return m20090l;
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: G */
        public void mo19915G(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7137w) {
                C7137w c7137w = (C7137w) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b == 2) {
                    int m20145b0 = m20145b0();
                    m20135l0(m20145b0);
                    int i3 = this.f16799c + m20145b0;
                    while (this.f16799c < i3) {
                        c7137w.m19404h(Float.intBitsToFloat(m20151V()));
                    }
                    return;
                } else if (m19563b == 5) {
                    do {
                        c7137w.m19404h(readFloat());
                        if (m20156Q()) {
                            return;
                        }
                        i2 = this.f16799c;
                    } while (m20145b0() == this.f16801e);
                    this.f16799c = i2;
                    return;
                } else {
                    throw InvalidProtocolBufferException.m20253f();
                }
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 == 2) {
                int m20145b02 = m20145b0();
                m20135l0(m20145b02);
                int i4 = this.f16799c + m20145b02;
                while (this.f16799c < i4) {
                    list.add(Float.valueOf(Float.intBitsToFloat(m20151V())));
                }
            } else if (m19563b2 == 5) {
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: H */
        public int mo19914H() throws IOException {
            m20140g0(0);
            return m20145b0();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: I */
        public boolean mo19913I() throws IOException {
            int i;
            if (m20156Q() || (i = this.f16801e) == this.f16802f) {
                return false;
            }
            int m19563b = C7118t1.m19563b(i);
            if (m19563b == 0) {
                m20137j0();
                return true;
            } else if (m19563b == 1) {
                m20139h0(8);
                return true;
            } else if (m19563b == 2) {
                m20139h0(m20145b0());
                return true;
            } else if (m19563b == 3) {
                m20138i0();
                return true;
            } else if (m19563b == 5) {
                m20139h0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: J */
        public int mo19912J() throws IOException {
            m20140g0(5);
            return m20152U();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: K */
        public void mo19911K(List<AbstractC7039i> list) throws IOException {
            int i;
            if (C7118t1.m19563b(this.f16801e) == 2) {
                do {
                    list.add(mo19916F());
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i;
                return;
            }
            throw InvalidProtocolBufferException.m20253f();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: L */
        public void mo19910L(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7078m) {
                C7078m c7078m = (C7078m) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b == 1) {
                    do {
                        c7078m.m19815h(readDouble());
                        if (m20156Q()) {
                            return;
                        }
                        i2 = this.f16799c;
                    } while (m20145b0() == this.f16801e);
                    this.f16799c = i2;
                    return;
                } else if (m19563b == 2) {
                    int m20145b0 = m20145b0();
                    m20134m0(m20145b0);
                    int i3 = this.f16799c + m20145b0;
                    while (this.f16799c < i3) {
                        c7078m.m19815h(Double.longBitsToDouble(m20149X()));
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.m20253f();
                }
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 == 1) {
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i;
            } else if (m19563b2 == 2) {
                int m20145b02 = m20145b0();
                m20134m0(m20145b02);
                int i4 = this.f16799c + m20145b02;
                while (this.f16799c < i4) {
                    list.add(Double.valueOf(Double.longBitsToDouble(m20149X())));
                }
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: M */
        public long mo19909M() throws IOException {
            m20140g0(0);
            return m20144c0();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: N */
        public String mo19908N() throws IOException {
            return m20147Z(true);
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: O */
        public void mo19907O(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7050i0) {
                C7050i0 c7050i0 = (C7050i0) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b == 1) {
                    do {
                        c7050i0.m20075k(mo19895c());
                        if (m20156Q()) {
                            return;
                        }
                        i2 = this.f16799c;
                    } while (m20145b0() == this.f16801e);
                    this.f16799c = i2;
                    return;
                } else if (m19563b == 2) {
                    int m20145b0 = m20145b0();
                    m20134m0(m20145b0);
                    int i3 = this.f16799c + m20145b0;
                    while (this.f16799c < i3) {
                        c7050i0.m20075k(m20149X());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.m20253f();
                }
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 == 1) {
                do {
                    list.add(Long.valueOf(mo19895c()));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i;
            } else if (m19563b2 == 2) {
                int m20145b02 = m20145b0();
                m20134m0(m20145b02);
                int i4 = this.f16799c + m20145b02;
                while (this.f16799c < i4) {
                    list.add(Long.valueOf(m20149X()));
                }
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }

        /* renamed from: Z */
        public String m20147Z(boolean z) throws IOException {
            m20140g0(2);
            int m20145b0 = m20145b0();
            if (m20145b0 == 0) {
                return "";
            }
            m20142e0(m20145b0);
            if (z) {
                byte[] bArr = this.f16798b;
                int i = this.f16799c;
                if (!C7110s1.m19611t(bArr, i, i + m20145b0)) {
                    throw InvalidProtocolBufferException.m20254e();
                }
            }
            String str = new String(this.f16798b, this.f16799c, m20145b0, C6997a0.f16756a);
            this.f16799c += m20145b0;
            return str;
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: a */
        public void mo19897a(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7149z) {
                C7149z c7149z = (C7149z) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b != 0) {
                    if (m19563b == 2) {
                        int m20145b0 = this.f16799c + m20145b0();
                        while (this.f16799c < m20145b0) {
                            c7149z.mo19336C(AbstractC7052j.m20069b(m20145b0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.m20253f();
                }
                do {
                    c7149z.mo19336C(mo19876v());
                    if (m20156Q()) {
                        return;
                    }
                    i2 = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i2;
                return;
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 != 0) {
                if (m19563b2 == 2) {
                    int m20145b02 = this.f16799c + m20145b0();
                    while (this.f16799c < m20145b02) {
                        list.add(Integer.valueOf(AbstractC7052j.m20069b(m20145b0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.m20253f();
            }
            do {
                list.add(Integer.valueOf(mo19876v()));
                if (m20156Q()) {
                    return;
                }
                i = this.f16799c;
            } while (m20145b0() == this.f16801e);
            this.f16799c = i;
        }

        /* renamed from: a0 */
        public void m20146a0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (C7118t1.m19563b(this.f16801e) == 2) {
                if ((list instanceof InterfaceC7031g0) && !z) {
                    InterfaceC7031g0 interfaceC7031g0 = (InterfaceC7031g0) list;
                    do {
                        interfaceC7031g0.mo19731A(mo19916F());
                        if (m20156Q()) {
                            return;
                        }
                        i2 = this.f16799c;
                    } while (m20145b0() == this.f16801e);
                    this.f16799c = i2;
                    return;
                }
                do {
                    list.add(m20147Z(z));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i;
                return;
            }
            throw InvalidProtocolBufferException.m20253f();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: b */
        public long mo19896b() throws IOException {
            m20140g0(0);
            return m20144c0();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: c */
        public long mo19895c() throws IOException {
            m20140g0(1);
            return m20150W();
        }

        /* renamed from: c0 */
        public long m20144c0() throws IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i;
            int i2 = this.f16799c;
            int i3 = this.f16800d;
            if (i3 != i2) {
                byte[] bArr = this.f16798b;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f16799c = i4;
                    return b;
                } else if (i3 - i4 < 9) {
                    return m20143d0();
                } else {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i5 = i7;
                            j4 = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                long j5 = i9;
                                int i10 = i5 + 1;
                                long j6 = j5 ^ (bArr[i5] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i5 = i10 + 1;
                                    long j7 = j6 ^ (bArr[i10] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i10 = i5 + 1;
                                        j6 = j7 ^ (bArr[i5] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i5 = i10 + 1;
                                            j7 = j6 ^ (bArr[i10] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i11 = i5 + 1;
                                                j = (j7 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    i5 = i11 + 1;
                                                    if (bArr[i11] < 0) {
                                                        throw InvalidProtocolBufferException.m20252g();
                                                    }
                                                } else {
                                                    i5 = i11;
                                                }
                                                j4 = j;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    j4 = j;
                                }
                                j4 = j3 ^ j6;
                                i5 = i10;
                            }
                        }
                        this.f16799c = i5;
                        return j4;
                    }
                    i = i6 ^ (-128);
                    j4 = i;
                    this.f16799c = i5;
                    return j4;
                }
            }
            throw InvalidProtocolBufferException.m20245n();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: d */
        public void mo19894d(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7149z) {
                C7149z c7149z = (C7149z) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b == 2) {
                    int m20145b0 = m20145b0();
                    m20135l0(m20145b0);
                    int i3 = this.f16799c + m20145b0;
                    while (this.f16799c < i3) {
                        c7149z.mo19336C(m20151V());
                    }
                    return;
                } else if (m19563b == 5) {
                    do {
                        c7149z.mo19336C(mo19912J());
                        if (m20156Q()) {
                            return;
                        }
                        i2 = this.f16799c;
                    } while (m20145b0() == this.f16801e);
                    this.f16799c = i2;
                    return;
                } else {
                    throw InvalidProtocolBufferException.m20253f();
                }
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 == 2) {
                int m20145b02 = m20145b0();
                m20135l0(m20145b02);
                int i4 = this.f16799c + m20145b02;
                while (this.f16799c < i4) {
                    list.add(Integer.valueOf(m20151V()));
                }
            } else if (m19563b2 == 5) {
                do {
                    list.add(Integer.valueOf(mo19912J()));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: e */
        public void mo19893e(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7050i0) {
                C7050i0 c7050i0 = (C7050i0) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b != 0) {
                    if (m19563b == 2) {
                        int m20145b0 = this.f16799c + m20145b0();
                        while (this.f16799c < m20145b0) {
                            c7050i0.m20075k(AbstractC7052j.m20068c(m20144c0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.m20253f();
                }
                do {
                    c7050i0.m20075k(mo19875w());
                    if (m20156Q()) {
                        return;
                    }
                    i2 = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i2;
                return;
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 != 0) {
                if (m19563b2 == 2) {
                    int m20145b02 = this.f16799c + m20145b0();
                    while (this.f16799c < m20145b02) {
                        list.add(Long.valueOf(AbstractC7052j.m20068c(m20144c0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.m20253f();
            }
            do {
                list.add(Long.valueOf(mo19875w()));
                if (m20156Q()) {
                    return;
                }
                i = this.f16799c;
            } while (m20145b0() == this.f16801e);
            this.f16799c = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: f */
        public <T> void mo19892f(List<T> list, InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
            int i;
            if (C7118t1.m19563b(this.f16801e) == 3) {
                int i2 = this.f16801e;
                do {
                    list.add(m20153T(interfaceC7038h1, c7089p));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == i2);
                this.f16799c = i;
                return;
            }
            throw InvalidProtocolBufferException.m20253f();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: g */
        public void mo19891g(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7149z) {
                C7149z c7149z = (C7149z) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b != 0) {
                    if (m19563b == 2) {
                        int m20145b0 = this.f16799c + m20145b0();
                        while (this.f16799c < m20145b0) {
                            c7149z.mo19336C(m20145b0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.m20253f();
                }
                do {
                    c7149z.mo19336C(mo19883o());
                    if (m20156Q()) {
                        return;
                    }
                    i2 = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i2;
                return;
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 != 0) {
                if (m19563b2 == 2) {
                    int m20145b02 = this.f16799c + m20145b0();
                    while (this.f16799c < m20145b02) {
                        list.add(Integer.valueOf(m20145b0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.m20253f();
            }
            do {
                list.add(Integer.valueOf(mo19883o()));
                if (m20156Q()) {
                    return;
                }
                i = this.f16799c;
            } while (m20145b0() == this.f16801e);
            this.f16799c = i;
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        public int getTag() {
            return this.f16801e;
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: h */
        public <T> T mo19890h(Class<T> cls, C7089p c7089p) throws IOException {
            m20140g0(2);
            return (T) m20148Y(C7019d1.m20212a().m20209d(cls), c7089p);
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: i */
        public int mo19889i() throws IOException {
            m20140g0(5);
            return m20152U();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: j */
        public boolean mo19888j() throws IOException {
            m20140g0(0);
            return m20145b0() != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: k */
        public <T> void mo19887k(List<T> list, InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
            int i;
            if (C7118t1.m19563b(this.f16801e) == 2) {
                int i2 = this.f16801e;
                do {
                    list.add(m20148Y(interfaceC7038h1, c7089p));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == i2);
                this.f16799c = i;
                return;
            }
            throw InvalidProtocolBufferException.m20253f();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: l */
        public long mo19886l() throws IOException {
            m20140g0(1);
            return m20150W();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: m */
        public void mo19885m(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7050i0) {
                C7050i0 c7050i0 = (C7050i0) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b == 0) {
                    do {
                        c7050i0.m20075k(mo19896b());
                        if (m20156Q()) {
                            return;
                        }
                        i2 = this.f16799c;
                    } while (m20145b0() == this.f16801e);
                    this.f16799c = i2;
                    return;
                } else if (m19563b == 2) {
                    int m20145b0 = this.f16799c + m20145b0();
                    while (this.f16799c < m20145b0) {
                        c7050i0.m20075k(m20144c0());
                    }
                    m20141f0(m20145b0);
                    return;
                } else {
                    throw InvalidProtocolBufferException.m20253f();
                }
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 == 0) {
                do {
                    list.add(Long.valueOf(mo19896b()));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i;
            } else if (m19563b2 == 2) {
                int m20145b02 = this.f16799c + m20145b0();
                while (this.f16799c < m20145b02) {
                    list.add(Long.valueOf(m20144c0()));
                }
                m20141f0(m20145b02);
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: n */
        public <T> T mo19884n(InterfaceC7038h1<T> interfaceC7038h1, C7089p c7089p) throws IOException {
            m20140g0(3);
            return (T) m20153T(interfaceC7038h1, c7089p);
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: o */
        public int mo19883o() throws IOException {
            m20140g0(0);
            return m20145b0();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: p */
        public void mo19882p(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7050i0) {
                C7050i0 c7050i0 = (C7050i0) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b == 0) {
                    do {
                        c7050i0.m20075k(mo19909M());
                        if (m20156Q()) {
                            return;
                        }
                        i2 = this.f16799c;
                    } while (m20145b0() == this.f16801e);
                    this.f16799c = i2;
                    return;
                } else if (m19563b == 2) {
                    int m20145b0 = this.f16799c + m20145b0();
                    while (this.f16799c < m20145b0) {
                        c7050i0.m20075k(m20144c0());
                    }
                    m20141f0(m20145b0);
                    return;
                } else {
                    throw InvalidProtocolBufferException.m20253f();
                }
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 == 0) {
                do {
                    list.add(Long.valueOf(mo19909M()));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i;
            } else if (m19563b2 == 2) {
                int m20145b02 = this.f16799c + m20145b0();
                while (this.f16799c < m20145b02) {
                    list.add(Long.valueOf(m20144c0()));
                }
                m20141f0(m20145b02);
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: q */
        public void mo19881q(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7050i0) {
                C7050i0 c7050i0 = (C7050i0) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b == 1) {
                    do {
                        c7050i0.m20075k(mo19886l());
                        if (m20156Q()) {
                            return;
                        }
                        i2 = this.f16799c;
                    } while (m20145b0() == this.f16801e);
                    this.f16799c = i2;
                    return;
                } else if (m19563b == 2) {
                    int m20145b0 = m20145b0();
                    m20134m0(m20145b0);
                    int i3 = this.f16799c + m20145b0;
                    while (this.f16799c < i3) {
                        c7050i0.m20075k(m20149X());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.m20253f();
                }
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 == 1) {
                do {
                    list.add(Long.valueOf(mo19886l()));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i;
            } else if (m19563b2 == 2) {
                int m20145b02 = m20145b0();
                m20134m0(m20145b02);
                int i4 = this.f16799c + m20145b02;
                while (this.f16799c < i4) {
                    list.add(Long.valueOf(m20149X()));
                }
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: r */
        public void mo19880r(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7149z) {
                C7149z c7149z = (C7149z) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b == 0) {
                    do {
                        c7149z.mo19336C(mo19914H());
                        if (m20156Q()) {
                            return;
                        }
                        i2 = this.f16799c;
                    } while (m20145b0() == this.f16801e);
                    this.f16799c = i2;
                    return;
                } else if (m19563b == 2) {
                    int m20145b0 = this.f16799c + m20145b0();
                    while (this.f16799c < m20145b0) {
                        c7149z.mo19336C(m20145b0());
                    }
                    m20141f0(m20145b0);
                    return;
                } else {
                    throw InvalidProtocolBufferException.m20253f();
                }
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 == 0) {
                do {
                    list.add(Integer.valueOf(mo19914H()));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i;
            } else if (m19563b2 == 2) {
                int m20145b02 = this.f16799c + m20145b0();
                while (this.f16799c < m20145b02) {
                    list.add(Integer.valueOf(m20145b0()));
                }
                m20141f0(m20145b02);
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        public double readDouble() throws IOException {
            m20140g0(1);
            return Double.longBitsToDouble(m20150W());
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        public float readFloat() throws IOException {
            m20140g0(5);
            return Float.intBitsToFloat(m20152U());
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: s */
        public void mo19879s(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7149z) {
                C7149z c7149z = (C7149z) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b != 0) {
                    if (m19563b == 2) {
                        int m20145b0 = this.f16799c + m20145b0();
                        while (this.f16799c < m20145b0) {
                            c7149z.mo19336C(m20145b0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.m20253f();
                }
                do {
                    c7149z.mo19336C(mo19878t());
                    if (m20156Q()) {
                        return;
                    }
                    i2 = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i2;
                return;
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 != 0) {
                if (m19563b2 == 2) {
                    int m20145b02 = this.f16799c + m20145b0();
                    while (this.f16799c < m20145b02) {
                        list.add(Integer.valueOf(m20145b0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.m20253f();
            }
            do {
                list.add(Integer.valueOf(mo19878t()));
                if (m20156Q()) {
                    return;
                }
                i = this.f16799c;
            } while (m20145b0() == this.f16801e);
            this.f16799c = i;
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: t */
        public int mo19878t() throws IOException {
            m20140g0(0);
            return m20145b0();
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: u */
        public void mo19877u(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7149z) {
                C7149z c7149z = (C7149z) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b == 2) {
                    int m20145b0 = m20145b0();
                    m20135l0(m20145b0);
                    int i3 = this.f16799c + m20145b0;
                    while (this.f16799c < i3) {
                        c7149z.mo19336C(m20151V());
                    }
                    return;
                } else if (m19563b == 5) {
                    do {
                        c7149z.mo19336C(mo19889i());
                        if (m20156Q()) {
                            return;
                        }
                        i2 = this.f16799c;
                    } while (m20145b0() == this.f16801e);
                    this.f16799c = i2;
                    return;
                } else {
                    throw InvalidProtocolBufferException.m20253f();
                }
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 == 2) {
                int m20145b02 = m20145b0();
                m20135l0(m20145b02);
                int i4 = this.f16799c + m20145b02;
                while (this.f16799c < i4) {
                    list.add(Integer.valueOf(m20151V()));
                }
            } else if (m19563b2 == 5) {
                do {
                    list.add(Integer.valueOf(mo19889i()));
                    if (m20156Q()) {
                        return;
                    }
                    i = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i;
            } else {
                throw InvalidProtocolBufferException.m20253f();
            }
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: v */
        public int mo19876v() throws IOException {
            m20140g0(0);
            return AbstractC7052j.m20069b(m20145b0());
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: w */
        public long mo19875w() throws IOException {
            m20140g0(0);
            return AbstractC7052j.m20068c(m20144c0());
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: x */
        public void mo19874x(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C7030g) {
                C7030g c7030g = (C7030g) list;
                int m19563b = C7118t1.m19563b(this.f16801e);
                if (m19563b != 0) {
                    if (m19563b == 2) {
                        int m20145b0 = this.f16799c + m20145b0();
                        while (this.f16799c < m20145b0) {
                            c7030g.m20118k(m20145b0() != 0);
                        }
                        m20141f0(m20145b0);
                        return;
                    }
                    throw InvalidProtocolBufferException.m20253f();
                }
                do {
                    c7030g.m20118k(mo19888j());
                    if (m20156Q()) {
                        return;
                    }
                    i2 = this.f16799c;
                } while (m20145b0() == this.f16801e);
                this.f16799c = i2;
                return;
            }
            int m19563b2 = C7118t1.m19563b(this.f16801e);
            if (m19563b2 != 0) {
                if (m19563b2 == 2) {
                    int m20145b02 = this.f16799c + m20145b0();
                    while (this.f16799c < m20145b02) {
                        list.add(Boolean.valueOf(m20145b0() != 0));
                    }
                    m20141f0(m20145b02);
                    return;
                }
                throw InvalidProtocolBufferException.m20253f();
            }
            do {
                list.add(Boolean.valueOf(mo19888j()));
                if (m20156Q()) {
                    return;
                }
                i = this.f16799c;
            } while (m20145b0() == this.f16801e);
            this.f16799c = i;
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: y */
        public String mo19873y() throws IOException {
            return m20147Z(false);
        }

        @Override // com.google.protobuf.InterfaceC7032g1
        /* renamed from: z */
        public <T> T mo19872z(Class<T> cls, C7089p c7089p) throws IOException {
            m20140g0(3);
            return (T) m20153T(C7019d1.m20212a().m20209d(cls), c7089p);
        }
    }

    /* synthetic */ AbstractC7025f(C7026a c7026a) {
        this();
    }

    /* renamed from: P */
    public static AbstractC7025f m20157P(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C7027b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private AbstractC7025f() {
    }
}
