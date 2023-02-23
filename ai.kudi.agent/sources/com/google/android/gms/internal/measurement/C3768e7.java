package com.google.android.gms.internal.measurement;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.e7 */
/* loaded from: classes2.dex */
public final class C3768e7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m29653a(byte[] bArr, int i, C3753d7 c3753d7) throws zzkh {
        int m29644j = m29644j(bArr, i, c3753d7);
        int i2 = c3753d7.f9240a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m29644j) {
                if (i2 == 0) {
                    c3753d7.f9242c = AbstractC3909n7.f9575d;
                    return m29644j;
                }
                c3753d7.f9242c = AbstractC3909n7.m29345F(bArr, m29644j, i2);
                return m29644j + i2;
            }
            throw zzkh.m28514f();
        }
        throw zzkh.m28516d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m29652b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m29651c(InterfaceC4101z9 interfaceC4101z9, byte[] bArr, int i, int i2, int i3, C3753d7 c3753d7) throws IOException {
        C3973r9 c3973r9 = (C3973r9) interfaceC4101z9;
        Object mo28533a = c3973r9.mo28533a();
        int m29023D = c3973r9.m29023D(mo28533a, bArr, i, i2, i3, c3753d7);
        c3973r9.mo28531c(mo28533a);
        c3753d7.f9242c = mo28533a;
        return m29023D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m29650d(InterfaceC4101z9 interfaceC4101z9, byte[] bArr, int i, int i2, C3753d7 c3753d7) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m29643k(i4, bArr, i3, c3753d7);
            i4 = c3753d7.f9240a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object mo28533a = interfaceC4101z9.mo28533a();
            int i6 = i4 + i5;
            interfaceC4101z9.mo28527g(mo28533a, bArr, i5, i6, c3753d7);
            interfaceC4101z9.mo28531c(mo28533a);
            c3753d7.f9242c = mo28533a;
            return i6;
        }
        throw zzkh.m28514f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m29649e(InterfaceC4101z9<?> interfaceC4101z9, int i, byte[] bArr, int i2, int i3, InterfaceC3988s8<?> interfaceC3988s8, C3753d7 c3753d7) throws IOException {
        int m29650d = m29650d(interfaceC4101z9, bArr, i2, i3, c3753d7);
        interfaceC3988s8.add(c3753d7.f9242c);
        while (m29650d < i3) {
            int m29644j = m29644j(bArr, m29650d, c3753d7);
            if (i != c3753d7.f9240a) {
                break;
            }
            m29650d = m29650d(interfaceC4101z9, bArr, m29644j, i3, c3753d7);
            interfaceC3988s8.add(c3753d7.f9242c);
        }
        return m29650d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m29648f(byte[] bArr, int i, InterfaceC3988s8<?> interfaceC3988s8, C3753d7 c3753d7) throws IOException {
        C3910n8 c3910n8 = (C3910n8) interfaceC3988s8;
        int m29644j = m29644j(bArr, i, c3753d7);
        int i2 = c3753d7.f9240a + m29644j;
        while (m29644j < i2) {
            m29644j = m29644j(bArr, m29644j, c3753d7);
            c3910n8.m29331h(c3753d7.f9240a);
        }
        if (m29644j == i2) {
            return m29644j;
        }
        throw zzkh.m28514f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m29647g(byte[] bArr, int i, C3753d7 c3753d7) throws zzkh {
        int m29644j = m29644j(bArr, i, c3753d7);
        int i2 = c3753d7.f9240a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c3753d7.f9242c = "";
                return m29644j;
            }
            c3753d7.f9242c = new String(bArr, m29644j, i2, C4004t8.f9713a);
            return m29644j + i2;
        }
        throw zzkh.m28516d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m29646h(byte[] bArr, int i, C3753d7 c3753d7) throws zzkh {
        int m29644j = m29644j(bArr, i, c3753d7);
        int i2 = c3753d7.f9240a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c3753d7.f9242c = "";
                return m29644j;
            }
            c3753d7.f9242c = C3741cb.m29705d(bArr, m29644j, i2);
            return m29644j + i2;
        }
        throw zzkh.m28516d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m29645i(int i, byte[] bArr, int i2, int i3, C3928oa c3928oa, C3753d7 c3753d7) throws zzkh {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m29641m = m29641m(bArr, i2, c3753d7);
                c3928oa.m29238h(i, Long.valueOf(c3753d7.f9241b));
                return m29641m;
            } else if (i4 == 1) {
                c3928oa.m29238h(i, Long.valueOf(m29640n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int m29644j = m29644j(bArr, i2, c3753d7);
                int i5 = c3753d7.f9240a;
                if (i5 >= 0) {
                    if (i5 <= bArr.length - m29644j) {
                        if (i5 == 0) {
                            c3928oa.m29238h(i, AbstractC3909n7.f9575d);
                        } else {
                            c3928oa.m29238h(i, AbstractC3909n7.m29345F(bArr, m29644j, i5));
                        }
                        return m29644j + i5;
                    }
                    throw zzkh.m28514f();
                }
                throw zzkh.m28516d();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    c3928oa.m29238h(i, Integer.valueOf(m29652b(bArr, i2)));
                    return i2 + 4;
                }
                throw zzkh.m28518b();
            } else {
                int i6 = (i & (-8)) | 4;
                C3928oa m29241e = C3928oa.m29241e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int m29644j2 = m29644j(bArr, i2, c3753d7);
                    int i8 = c3753d7.f9240a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = m29644j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m29645i(i8, bArr, m29644j2, i3, m29241e, c3753d7);
                }
                if (i2 <= i3 && i7 == i6) {
                    c3928oa.m29238h(i, m29241e);
                    return i2;
                }
                throw zzkh.m28515e();
            }
        }
        throw zzkh.m28518b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m29644j(byte[] bArr, int i, C3753d7 c3753d7) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c3753d7.f9240a = b;
            return i2;
        }
        return m29643k(b, bArr, i2, c3753d7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m29643k(int i, byte[] bArr, int i2, C3753d7 c3753d7) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c3753d7.f9240a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c3753d7.f9240a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c3753d7.f9240a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c3753d7.f9240a = i9 | (b4 << PrinterCommands.OTHER_SYMBOL);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c3753d7.f9240a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m29642l(int i, byte[] bArr, int i2, int i3, InterfaceC3988s8<?> interfaceC3988s8, C3753d7 c3753d7) {
        C3910n8 c3910n8 = (C3910n8) interfaceC3988s8;
        int m29644j = m29644j(bArr, i2, c3753d7);
        c3910n8.m29331h(c3753d7.f9240a);
        while (m29644j < i3) {
            int m29644j2 = m29644j(bArr, m29644j, c3753d7);
            if (i != c3753d7.f9240a) {
                break;
            }
            m29644j = m29644j(bArr, m29644j2, c3753d7);
            c3910n8.m29331h(c3753d7.f9240a);
        }
        return m29644j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m29641m(byte[] bArr, int i, C3753d7 c3753d7) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c3753d7.f9241b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        c3753d7.f9241b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static long m29640n(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
