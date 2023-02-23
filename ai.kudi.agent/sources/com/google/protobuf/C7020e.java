package com.google.protobuf;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.C7118t1;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArrayDecoders.java */
/* renamed from: com.google.protobuf.e */
/* loaded from: classes2.dex */
public final class C7020e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayDecoders.java */
    /* renamed from: com.google.protobuf.e$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C7021a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16784a;

        static {
            int[] iArr = new int[C7118t1.EnumC7120b.values().length];
            f16784a = iArr;
            try {
                iArr[C7118t1.EnumC7120b.f16962e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16963f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16964w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16965x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16966y.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16955G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16967z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16958J.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16949A.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16957I.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16950B.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16959K.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16960L.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16956H.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16954F.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16951C.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16952D.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16784a[C7118t1.EnumC7120b.f16953E.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayDecoders.java */
    /* renamed from: com.google.protobuf.e$b */
    /* loaded from: classes2.dex */
    public static final class C7022b {

        /* renamed from: a */
        public int f16785a;

        /* renamed from: b */
        public long f16786b;

        /* renamed from: c */
        public Object f16787c;

        /* renamed from: d */
        public final C7089p f16788d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C7022b(C7089p c7089p) {
            if (c7089p != null) {
                this.f16788d = c7089p;
                return;
            }
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static int m20207A(int i, byte[] bArr, int i2, int i3, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) {
        C7149z c7149z = (C7149z) interfaceC7006i;
        int m20199I = m20199I(bArr, i2, c7022b);
        c7149z.mo19336C(AbstractC7052j.m20069b(c7022b.f16785a));
        while (m20199I < i3) {
            int m20199I2 = m20199I(bArr, m20199I, c7022b);
            if (i != c7022b.f16785a) {
                break;
            }
            m20199I = m20199I(bArr, m20199I2, c7022b);
            c7149z.mo19336C(AbstractC7052j.m20069b(c7022b.f16785a));
        }
        return m20199I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static int m20206B(int i, byte[] bArr, int i2, int i3, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) {
        C7050i0 c7050i0 = (C7050i0) interfaceC7006i;
        int m20196L = m20196L(bArr, i2, c7022b);
        c7050i0.m20075k(AbstractC7052j.m20068c(c7022b.f16786b));
        while (m20196L < i3) {
            int m20199I = m20199I(bArr, m20196L, c7022b);
            if (i != c7022b.f16785a) {
                break;
            }
            m20196L = m20196L(bArr, m20199I, c7022b);
            c7050i0.m20075k(AbstractC7052j.m20068c(c7022b.f16786b));
        }
        return m20196L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static int m20205C(byte[] bArr, int i, C7022b c7022b) throws InvalidProtocolBufferException {
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c7022b.f16787c = "";
                return m20199I;
            }
            c7022b.f16787c = new String(bArr, m20199I, i2, C6997a0.f16756a);
            return m20199I + i2;
        }
        throw InvalidProtocolBufferException.m20251h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001a -> B:9:0x001b). Please submit an issue!!! */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m20204D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.C6997a0.InterfaceC7006i<?> r8, com.google.protobuf.C7020e.C7022b r9) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            int r6 = m20199I(r5, r6, r9)
            int r0 = r9.f16785a
            if (r0 < 0) goto L45
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.C6997a0.f16756a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L1a:
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L44
            int r0 = m20199I(r5, r6, r9)
            int r2 = r9.f16785a
            if (r4 == r2) goto L26
            goto L44
        L26:
            int r6 = m20199I(r5, r0, r9)
            int r0 = r9.f16785a
            if (r0 < 0) goto L3f
            if (r0 != 0) goto L34
            r8.add(r1)
            goto L1b
        L34:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.C6997a0.f16756a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L1a
        L3f:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.m20251h()
            throw r4
        L44:
            return r6
        L45:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.m20251h()
            goto L4b
        L4a:
            throw r4
        L4b:
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7020e.m20204D(int, byte[], int, int, com.google.protobuf.a0$i, com.google.protobuf.e$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0023). Please submit an issue!!! */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m20203E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.C6997a0.InterfaceC7006i<?> r9, com.google.protobuf.C7020e.C7022b r10) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            int r7 = m20199I(r6, r7, r10)
            int r0 = r10.f16785a
            if (r0 < 0) goto L5f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.C7110s1.m19611t(r6, r7, r2)
            if (r3 == 0) goto L5a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.C6997a0.f16756a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L22:
            r7 = r2
        L23:
            if (r7 >= r8) goto L59
            int r0 = m20199I(r6, r7, r10)
            int r2 = r10.f16785a
            if (r5 == r2) goto L2e
            goto L59
        L2e:
            int r7 = m20199I(r6, r0, r10)
            int r0 = r10.f16785a
            if (r0 < 0) goto L54
            if (r0 != 0) goto L3c
            r9.add(r1)
            goto L23
        L3c:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.C7110s1.m19611t(r6, r7, r2)
            if (r3 == 0) goto L4f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.C6997a0.f16756a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L22
        L4f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.m20254e()
            throw r5
        L54:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.m20251h()
            throw r5
        L59:
            return r7
        L5a:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.m20254e()
            throw r5
        L5f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.m20251h()
            goto L65
        L64:
            throw r5
        L65:
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7020e.m20203E(int, byte[], int, int, com.google.protobuf.a0$i, com.google.protobuf.e$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m20202F(byte[] bArr, int i, C7022b c7022b) throws InvalidProtocolBufferException {
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c7022b.f16787c = "";
                return m20199I;
            }
            c7022b.f16787c = C7110s1.m19623h(bArr, m20199I, i2);
            return m20199I + i2;
        }
        throw InvalidProtocolBufferException.m20251h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static int m20201G(int i, byte[] bArr, int i2, int i3, C7088o1 c7088o1, C7022b c7022b) throws InvalidProtocolBufferException {
        if (C7118t1.m19564a(i) != 0) {
            int m19563b = C7118t1.m19563b(i);
            if (m19563b == 0) {
                int m20196L = m20196L(bArr, i2, c7022b);
                c7088o1.m19775m(i, Long.valueOf(c7022b.f16786b));
                return m20196L;
            } else if (m19563b == 1) {
                c7088o1.m19775m(i, Long.valueOf(m20184j(bArr, i2)));
                return i2 + 8;
            } else if (m19563b == 2) {
                int m20199I = m20199I(bArr, i2, c7022b);
                int i4 = c7022b.f16785a;
                if (i4 >= 0) {
                    if (i4 <= bArr.length - m20199I) {
                        if (i4 == 0) {
                            c7088o1.m19775m(i, AbstractC7039i.f16815d);
                        } else {
                            c7088o1.m19775m(i, AbstractC7039i.m20090l(bArr, m20199I, i4));
                        }
                        return m20199I + i4;
                    }
                    throw InvalidProtocolBufferException.m20245n();
                }
                throw InvalidProtocolBufferException.m20251h();
            } else if (m19563b != 3) {
                if (m19563b == 5) {
                    c7088o1.m19775m(i, Integer.valueOf(m20186h(bArr, i2)));
                    return i2 + 4;
                }
                throw InvalidProtocolBufferException.m20255d();
            } else {
                C7088o1 m19778j = C7088o1.m19778j();
                int i5 = (i & (-8)) | 4;
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int m20199I2 = m20199I(bArr, i2, c7022b);
                    int i7 = c7022b.f16785a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = m20199I2;
                        break;
                    }
                    i6 = i7;
                    i2 = m20201G(i7, bArr, m20199I2, i3, m19778j, c7022b);
                }
                if (i2 <= i3 && i6 == i5) {
                    c7088o1.m19775m(i, m19778j);
                    return i2;
                }
                throw InvalidProtocolBufferException.m20250i();
            }
        }
        throw InvalidProtocolBufferException.m20255d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static int m20200H(int i, byte[] bArr, int i2, C7022b c7022b) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c7022b.f16785a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c7022b.f16785a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c7022b.f16785a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c7022b.f16785a = i9 | (b4 << PrinterCommands.OTHER_SYMBOL);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c7022b.f16785a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static int m20199I(byte[] bArr, int i, C7022b c7022b) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c7022b.f16785a = b;
            return i2;
        }
        return m20200H(b, bArr, i2, c7022b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static int m20198J(int i, byte[] bArr, int i2, int i3, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) {
        C7149z c7149z = (C7149z) interfaceC7006i;
        int m20199I = m20199I(bArr, i2, c7022b);
        c7149z.mo19336C(c7022b.f16785a);
        while (m20199I < i3) {
            int m20199I2 = m20199I(bArr, m20199I, c7022b);
            if (i != c7022b.f16785a) {
                break;
            }
            m20199I = m20199I(bArr, m20199I2, c7022b);
            c7149z.mo19336C(c7022b.f16785a);
        }
        return m20199I;
    }

    /* renamed from: K */
    static int m20197K(long j, byte[] bArr, int i, C7022b c7022b) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i3;
            i2 = i4;
            b = b2;
        }
        c7022b.f16786b = j2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static int m20196L(byte[] bArr, int i, C7022b c7022b) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c7022b.f16786b = j;
            return i2;
        }
        return m20197K(j, bArr, i2, c7022b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static int m20195M(int i, byte[] bArr, int i2, int i3, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) {
        C7050i0 c7050i0 = (C7050i0) interfaceC7006i;
        int m20196L = m20196L(bArr, i2, c7022b);
        c7050i0.m20075k(c7022b.f16786b);
        while (m20196L < i3) {
            int m20199I = m20199I(bArr, m20196L, c7022b);
            if (i != c7022b.f16785a) {
                break;
            }
            m20196L = m20196L(bArr, m20199I, c7022b);
            c7050i0.m20075k(c7022b.f16786b);
        }
        return m20196L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static int m20194N(int i, byte[] bArr, int i2, int i3, C7022b c7022b) throws InvalidProtocolBufferException {
        if (C7118t1.m19564a(i) != 0) {
            int m19563b = C7118t1.m19563b(i);
            if (m19563b != 0) {
                if (m19563b != 1) {
                    if (m19563b != 2) {
                        if (m19563b != 3) {
                            if (m19563b == 5) {
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.m20255d();
                        }
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (i2 < i3) {
                            i2 = m20199I(bArr, i2, c7022b);
                            i5 = c7022b.f16785a;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = m20194N(i5, bArr, i2, i3, c7022b);
                        }
                        if (i2 > i3 || i5 != i4) {
                            throw InvalidProtocolBufferException.m20250i();
                        }
                        return i2;
                    }
                    return m20199I(bArr, i2, c7022b) + c7022b.f16785a;
                }
                return i2 + 8;
            }
            return m20196L(bArr, i2, c7022b);
        }
        throw InvalidProtocolBufferException.m20255d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20193a(int i, byte[] bArr, int i2, int i3, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) {
        C7030g c7030g = (C7030g) interfaceC7006i;
        int m20196L = m20196L(bArr, i2, c7022b);
        c7030g.m20118k(c7022b.f16786b != 0);
        while (m20196L < i3) {
            int m20199I = m20199I(bArr, m20196L, c7022b);
            if (i != c7022b.f16785a) {
                break;
            }
            m20196L = m20196L(bArr, m20199I, c7022b);
            c7030g.m20118k(c7022b.f16786b != 0);
        }
        return m20196L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m20192b(byte[] bArr, int i, C7022b c7022b) throws InvalidProtocolBufferException {
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m20199I) {
                if (i2 == 0) {
                    c7022b.f16787c = AbstractC7039i.f16815d;
                    return m20199I;
                }
                c7022b.f16787c = AbstractC7039i.m20090l(bArr, m20199I, i2);
                return m20199I + i2;
            }
            throw InvalidProtocolBufferException.m20245n();
        }
        throw InvalidProtocolBufferException.m20251h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001b -> B:10:0x001c). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m20191c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.C6997a0.InterfaceC7006i<?> r6, com.google.protobuf.C7020e.C7022b r7) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            int r4 = m20199I(r3, r4, r7)
            int r0 = r7.f16785a
            if (r0 < 0) goto L53
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L4e
            if (r0 != 0) goto L14
            com.google.protobuf.i r0 = com.google.protobuf.AbstractC7039i.f16815d
            r6.add(r0)
            goto L1c
        L14:
            com.google.protobuf.i r1 = com.google.protobuf.AbstractC7039i.m20090l(r3, r4, r0)
            r6.add(r1)
        L1b:
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L4d
            int r0 = m20199I(r3, r4, r7)
            int r1 = r7.f16785a
            if (r2 == r1) goto L27
            goto L4d
        L27:
            int r4 = m20199I(r3, r0, r7)
            int r0 = r7.f16785a
            if (r0 < 0) goto L48
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L43
            if (r0 != 0) goto L3b
            com.google.protobuf.i r0 = com.google.protobuf.AbstractC7039i.f16815d
            r6.add(r0)
            goto L1c
        L3b:
            com.google.protobuf.i r1 = com.google.protobuf.AbstractC7039i.m20090l(r3, r4, r0)
            r6.add(r1)
            goto L1b
        L43:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.m20245n()
            throw r2
        L48:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.m20251h()
            throw r2
        L4d:
            return r4
        L4e:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.m20245n()
            throw r2
        L53:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.m20251h()
            goto L59
        L58:
            throw r2
        L59:
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7020e.m20191c(int, byte[], int, int, com.google.protobuf.a0$i, com.google.protobuf.e$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static double m20190d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m20184j(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m20189e(int i, byte[] bArr, int i2, int i3, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) {
        C7078m c7078m = (C7078m) interfaceC7006i;
        c7078m.m19815h(m20190d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m20199I = m20199I(bArr, i4, c7022b);
            if (i != c7022b.f16785a) {
                break;
            }
            c7078m.m19815h(m20190d(bArr, m20199I));
            i4 = m20199I + 8;
        }
        return i4;
    }

    /* renamed from: f */
    static int m20188f(int i, byte[] bArr, int i2, int i3, AbstractC7141y.AbstractC7144c<?, ?> abstractC7144c, AbstractC7141y.C7146e<?, ?> c7146e, AbstractC7085n1<C7088o1, C7088o1> abstractC7085n1, C7022b c7022b) throws IOException {
        Object m19552h;
        C7126u<AbstractC7141y.C7145d> c7126u = abstractC7144c.extensions;
        int i4 = i >>> 3;
        if (c7146e.f17091b.mo19347f() && c7146e.f17091b.mo19344s()) {
            switch (C7021a.f16784a[c7146e.m19343a().ordinal()]) {
                case 1:
                    C7078m c7078m = new C7078m();
                    int m20175s = m20175s(bArr, i2, c7078m, c7022b);
                    c7126u.m19537w(c7146e.f17091b, c7078m);
                    return m20175s;
                case 2:
                    C7137w c7137w = new C7137w();
                    int m20172v = m20172v(bArr, i2, c7137w, c7022b);
                    c7126u.m19537w(c7146e.f17091b, c7137w);
                    return m20172v;
                case 3:
                case 4:
                    C7050i0 c7050i0 = new C7050i0();
                    int m20168z = m20168z(bArr, i2, c7050i0, c7022b);
                    c7126u.m19537w(c7146e.f17091b, c7050i0);
                    return m20168z;
                case 5:
                case 6:
                    C7149z c7149z = new C7149z();
                    int m20169y = m20169y(bArr, i2, c7149z, c7022b);
                    c7126u.m19537w(c7146e.f17091b, c7149z);
                    return m20169y;
                case 7:
                case 8:
                    C7050i0 c7050i02 = new C7050i0();
                    int m20173u = m20173u(bArr, i2, c7050i02, c7022b);
                    c7126u.m19537w(c7146e.f17091b, c7050i02);
                    return m20173u;
                case 9:
                case 10:
                    C7149z c7149z2 = new C7149z();
                    int m20174t = m20174t(bArr, i2, c7149z2, c7022b);
                    c7126u.m19537w(c7146e.f17091b, c7149z2);
                    return m20174t;
                case 11:
                    C7030g c7030g = new C7030g();
                    int m20176r = m20176r(bArr, i2, c7030g, c7022b);
                    c7126u.m19537w(c7146e.f17091b, c7030g);
                    return m20176r;
                case 12:
                    C7149z c7149z3 = new C7149z();
                    int m20171w = m20171w(bArr, i2, c7149z3, c7022b);
                    c7126u.m19537w(c7146e.f17091b, c7149z3);
                    return m20171w;
                case 13:
                    C7050i0 c7050i03 = new C7050i0();
                    int m20170x = m20170x(bArr, i2, c7050i03, c7022b);
                    c7126u.m19537w(c7146e.f17091b, c7050i03);
                    return m20170x;
                case 14:
                    C7149z c7149z4 = new C7149z();
                    int m20169y2 = m20169y(bArr, i2, c7149z4, c7022b);
                    C7088o1 c7088o1 = abstractC7144c.unknownFields;
                    C7088o1 c7088o12 = (C7088o1) C7061j1.m19922z(i4, c7149z4, c7146e.f17091b.m19349b(), c7088o1 != C7088o1.m19785c() ? c7088o1 : null, abstractC7085n1);
                    if (c7088o12 != null) {
                        abstractC7144c.unknownFields = c7088o12;
                    }
                    c7126u.m19537w(c7146e.f17091b, c7149z4);
                    return m20169y2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c7146e.f17091b.mo19346k());
            }
        }
        if (c7146e.m19343a() == C7118t1.EnumC7120b.f16956H) {
            i2 = m20199I(bArr, i2, c7022b);
            if (c7146e.f17091b.m19349b().m20224a(c7022b.f16785a) == null) {
                C7088o1 c7088o13 = abstractC7144c.unknownFields;
                if (c7088o13 == C7088o1.m19785c()) {
                    c7088o13 = C7088o1.m19778j();
                    abstractC7144c.unknownFields = c7088o13;
                }
                C7061j1.m19967L(i4, c7022b.f16785a, c7088o13, abstractC7085n1);
                return i2;
            }
            r2 = Integer.valueOf(c7022b.f16785a);
        } else {
            switch (C7021a.f16784a[c7146e.m19343a().ordinal()]) {
                case 1:
                    r2 = Double.valueOf(m20190d(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    r2 = Float.valueOf(m20182l(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = m20196L(bArr, i2, c7022b);
                    r2 = Long.valueOf(c7022b.f16786b);
                    break;
                case 5:
                case 6:
                    i2 = m20199I(bArr, i2, c7022b);
                    r2 = Integer.valueOf(c7022b.f16785a);
                    break;
                case 7:
                case 8:
                    r2 = Long.valueOf(m20184j(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    r2 = Integer.valueOf(m20186h(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = m20196L(bArr, i2, c7022b);
                    r2 = Boolean.valueOf(c7022b.f16786b != 0);
                    break;
                case 12:
                    i2 = m20199I(bArr, i2, c7022b);
                    r2 = Integer.valueOf(AbstractC7052j.m20069b(c7022b.f16785a));
                    break;
                case 13:
                    i2 = m20196L(bArr, i2, c7022b);
                    r2 = Long.valueOf(AbstractC7052j.m20068c(c7022b.f16786b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = m20192b(bArr, i2, c7022b);
                    r2 = c7022b.f16787c;
                    break;
                case 16:
                    i2 = m20205C(bArr, i2, c7022b);
                    r2 = c7022b.f16787c;
                    break;
                case 17:
                    i2 = m20180n(C7019d1.m20212a().m20209d(c7146e.m19342b().getClass()), bArr, i2, i3, (i4 << 3) | 4, c7022b);
                    r2 = c7022b.f16787c;
                    break;
                case 18:
                    i2 = m20178p(C7019d1.m20212a().m20209d(c7146e.m19342b().getClass()), bArr, i2, i3, c7022b);
                    r2 = c7022b.f16787c;
                    break;
            }
        }
        if (c7146e.m19340d()) {
            c7126u.m19559a(c7146e.f17091b, r2);
        } else {
            int i5 = C7021a.f16784a[c7146e.m19343a().ordinal()];
            if ((i5 == 17 || i5 == 18) && (m19552h = c7126u.m19552h(c7146e.f17091b)) != null) {
                r2 = C6997a0.m20228h(m19552h, r2);
            }
            c7126u.m19537w(c7146e.f17091b, r2);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m20187g(int i, byte[] bArr, int i2, int i3, Object obj, InterfaceC7100r0 interfaceC7100r0, AbstractC7085n1<C7088o1, C7088o1> abstractC7085n1, C7022b c7022b) throws IOException {
        AbstractC7141y.C7146e m19770a = c7022b.f16788d.m19770a(interfaceC7100r0, i >>> 3);
        if (m19770a == null) {
            return m20201G(i, bArr, i2, i3, C7129u0.m19473w(obj), c7022b);
        }
        AbstractC7141y.AbstractC7144c abstractC7144c = (AbstractC7141y.AbstractC7144c) obj;
        abstractC7144c.m19355R();
        return m20188f(i, bArr, i2, i3, abstractC7144c, m19770a, abstractC7085n1, c7022b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m20186h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m20185i(int i, byte[] bArr, int i2, int i3, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) {
        C7149z c7149z = (C7149z) interfaceC7006i;
        c7149z.mo19336C(m20186h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m20199I = m20199I(bArr, i4, c7022b);
            if (i != c7022b.f16785a) {
                break;
            }
            c7149z.mo19336C(m20186h(bArr, m20199I));
            i4 = m20199I + 4;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static long m20184j(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m20183k(int i, byte[] bArr, int i2, int i3, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) {
        C7050i0 c7050i0 = (C7050i0) interfaceC7006i;
        c7050i0.m20075k(m20184j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m20199I = m20199I(bArr, i4, c7022b);
            if (i != c7022b.f16785a) {
                break;
            }
            c7050i0.m20075k(m20184j(bArr, m20199I));
            i4 = m20199I + 8;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static float m20182l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m20186h(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m20181m(int i, byte[] bArr, int i2, int i3, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) {
        C7137w c7137w = (C7137w) interfaceC7006i;
        c7137w.m19404h(m20182l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m20199I = m20199I(bArr, i4, c7022b);
            if (i != c7022b.f16785a) {
                break;
            }
            c7137w.m19404h(m20182l(bArr, m20199I));
            i4 = m20199I + 4;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m20180n(InterfaceC7038h1 interfaceC7038h1, byte[] bArr, int i, int i2, int i3, C7022b c7022b) throws IOException {
        C7129u0 c7129u0 = (C7129u0) interfaceC7038h1;
        Object mo19417i = c7129u0.mo19417i();
        int m19504d0 = c7129u0.m19504d0(mo19417i, bArr, i, i2, i3, c7022b);
        c7129u0.mo19423c(mo19417i);
        c7022b.f16787c = mo19417i;
        return m19504d0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int m20179o(InterfaceC7038h1 interfaceC7038h1, int i, byte[] bArr, int i2, int i3, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) throws IOException {
        int i4 = (i & (-8)) | 4;
        int m20180n = m20180n(interfaceC7038h1, bArr, i2, i3, i4, c7022b);
        interfaceC7006i.add(c7022b.f16787c);
        while (m20180n < i3) {
            int m20199I = m20199I(bArr, m20180n, c7022b);
            if (i != c7022b.f16785a) {
                break;
            }
            m20180n = m20180n(interfaceC7038h1, bArr, m20199I, i3, i4, c7022b);
            interfaceC7006i.add(c7022b.f16787c);
        }
        return m20180n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static int m20178p(InterfaceC7038h1 interfaceC7038h1, byte[] bArr, int i, int i2, C7022b c7022b) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m20200H(i4, bArr, i3, c7022b);
            i4 = c7022b.f16785a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object mo19417i = interfaceC7038h1.mo19417i();
            int i6 = i4 + i5;
            interfaceC7038h1.mo19420f(mo19417i, bArr, i5, i6, c7022b);
            interfaceC7038h1.mo19423c(mo19417i);
            c7022b.f16787c = mo19417i;
            return i6;
        }
        throw InvalidProtocolBufferException.m20245n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static int m20177q(InterfaceC7038h1<?> interfaceC7038h1, int i, byte[] bArr, int i2, int i3, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) throws IOException {
        int m20178p = m20178p(interfaceC7038h1, bArr, i2, i3, c7022b);
        interfaceC7006i.add(c7022b.f16787c);
        while (m20178p < i3) {
            int m20199I = m20199I(bArr, m20178p, c7022b);
            if (i != c7022b.f16785a) {
                break;
            }
            m20178p = m20178p(interfaceC7038h1, bArr, m20199I, i3, c7022b);
            interfaceC7006i.add(c7022b.f16787c);
        }
        return m20178p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static int m20176r(byte[] bArr, int i, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) throws IOException {
        C7030g c7030g = (C7030g) interfaceC7006i;
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a + m20199I;
        while (m20199I < i2) {
            m20199I = m20196L(bArr, m20199I, c7022b);
            c7030g.m20118k(c7022b.f16786b != 0);
        }
        if (m20199I == i2) {
            return m20199I;
        }
        throw InvalidProtocolBufferException.m20245n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static int m20175s(byte[] bArr, int i, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) throws IOException {
        C7078m c7078m = (C7078m) interfaceC7006i;
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a + m20199I;
        while (m20199I < i2) {
            c7078m.m19815h(m20190d(bArr, m20199I));
            m20199I += 8;
        }
        if (m20199I == i2) {
            return m20199I;
        }
        throw InvalidProtocolBufferException.m20245n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static int m20174t(byte[] bArr, int i, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) throws IOException {
        C7149z c7149z = (C7149z) interfaceC7006i;
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a + m20199I;
        while (m20199I < i2) {
            c7149z.mo19336C(m20186h(bArr, m20199I));
            m20199I += 4;
        }
        if (m20199I == i2) {
            return m20199I;
        }
        throw InvalidProtocolBufferException.m20245n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static int m20173u(byte[] bArr, int i, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) throws IOException {
        C7050i0 c7050i0 = (C7050i0) interfaceC7006i;
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a + m20199I;
        while (m20199I < i2) {
            c7050i0.m20075k(m20184j(bArr, m20199I));
            m20199I += 8;
        }
        if (m20199I == i2) {
            return m20199I;
        }
        throw InvalidProtocolBufferException.m20245n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static int m20172v(byte[] bArr, int i, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) throws IOException {
        C7137w c7137w = (C7137w) interfaceC7006i;
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a + m20199I;
        while (m20199I < i2) {
            c7137w.m19404h(m20182l(bArr, m20199I));
            m20199I += 4;
        }
        if (m20199I == i2) {
            return m20199I;
        }
        throw InvalidProtocolBufferException.m20245n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static int m20171w(byte[] bArr, int i, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) throws IOException {
        C7149z c7149z = (C7149z) interfaceC7006i;
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a + m20199I;
        while (m20199I < i2) {
            m20199I = m20199I(bArr, m20199I, c7022b);
            c7149z.mo19336C(AbstractC7052j.m20069b(c7022b.f16785a));
        }
        if (m20199I == i2) {
            return m20199I;
        }
        throw InvalidProtocolBufferException.m20245n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static int m20170x(byte[] bArr, int i, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) throws IOException {
        C7050i0 c7050i0 = (C7050i0) interfaceC7006i;
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a + m20199I;
        while (m20199I < i2) {
            m20199I = m20196L(bArr, m20199I, c7022b);
            c7050i0.m20075k(AbstractC7052j.m20068c(c7022b.f16786b));
        }
        if (m20199I == i2) {
            return m20199I;
        }
        throw InvalidProtocolBufferException.m20245n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static int m20169y(byte[] bArr, int i, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) throws IOException {
        C7149z c7149z = (C7149z) interfaceC7006i;
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a + m20199I;
        while (m20199I < i2) {
            m20199I = m20199I(bArr, m20199I, c7022b);
            c7149z.mo19336C(c7022b.f16785a);
        }
        if (m20199I == i2) {
            return m20199I;
        }
        throw InvalidProtocolBufferException.m20245n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static int m20168z(byte[] bArr, int i, C6997a0.InterfaceC7006i<?> interfaceC7006i, C7022b c7022b) throws IOException {
        C7050i0 c7050i0 = (C7050i0) interfaceC7006i;
        int m20199I = m20199I(bArr, i, c7022b);
        int i2 = c7022b.f16785a + m20199I;
        while (m20199I < i2) {
            m20199I = m20196L(bArr, m20199I, c7022b);
            c7050i0.m20075k(c7022b.f16786b);
        }
        if (m20199I == i2) {
            return m20199I;
        }
        throw InvalidProtocolBufferException.m20245n();
    }
}
