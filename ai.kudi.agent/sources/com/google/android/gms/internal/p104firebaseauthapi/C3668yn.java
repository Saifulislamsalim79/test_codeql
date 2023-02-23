package com.google.android.gms.internal.p104firebaseauthapi;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yn */
/* loaded from: classes2.dex */
public final class C3668yn {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m29935a(byte[] bArr, int i, C3642xn c3642xn) throws zzaae {
        int m29926j = m29926j(bArr, i, c3642xn);
        int i2 = c3642xn.f9110a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m29926j) {
                if (i2 == 0) {
                    c3642xn.f9112c = AbstractC3223ho.f8571d;
                    return m29926j;
                }
                c3642xn.f9112c = AbstractC3223ho.m31021O(bArr, m29926j, i2);
                return m29926j + i2;
            }
            throw zzaae.m29865i();
        }
        throw zzaae.m29868f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m29934b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m29933c(InterfaceC3307l0 interfaceC3307l0, byte[] bArr, int i, int i2, int i3, C3642xn c3642xn) throws IOException {
        C3064c0 c3064c0 = (C3064c0) interfaceC3307l0;
        Object mo30816a = c3064c0.mo30816a();
        int m31341I = c3064c0.m31341I(mo30816a, bArr, i, i2, i3, c3642xn);
        c3064c0.mo30814c(mo30816a);
        c3642xn.f9112c = mo30816a;
        return m31341I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m29932d(InterfaceC3307l0 interfaceC3307l0, byte[] bArr, int i, int i2, C3642xn c3642xn) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m29925k(i4, bArr, i3, c3642xn);
            i4 = c3642xn.f9110a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object mo30816a = interfaceC3307l0.mo30816a();
            int i6 = i4 + i5;
            interfaceC3307l0.mo30808i(mo30816a, bArr, i5, i6, c3642xn);
            interfaceC3307l0.mo30814c(mo30816a);
            c3642xn.f9112c = mo30816a;
            return i6;
        }
        throw zzaae.m29865i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m29931e(InterfaceC3307l0<?> interfaceC3307l0, int i, byte[] bArr, int i2, int i3, InterfaceC3090d<?> interfaceC3090d, C3642xn c3642xn) throws IOException {
        int m29932d = m29932d(interfaceC3307l0, bArr, i2, i3, c3642xn);
        interfaceC3090d.add(c3642xn.f9112c);
        while (m29932d < i3) {
            int m29926j = m29926j(bArr, m29932d, c3642xn);
            if (i != c3642xn.f9110a) {
                break;
            }
            m29932d = m29932d(interfaceC3307l0, bArr, m29926j, i3, c3642xn);
            interfaceC3090d.add(c3642xn.f9112c);
        }
        return m29932d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m29930f(byte[] bArr, int i, InterfaceC3090d<?> interfaceC3090d, C3642xn c3642xn) throws IOException {
        C3278jp c3278jp = (C3278jp) interfaceC3090d;
        int m29926j = m29926j(bArr, i, c3642xn);
        int i2 = c3642xn.f9110a + m29926j;
        while (m29926j < i2) {
            m29926j = m29926j(bArr, m29926j, c3642xn);
            c3278jp.m30883f(c3642xn.f9110a);
        }
        if (m29926j == i2) {
            return m29926j;
        }
        throw zzaae.m29865i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m29929g(byte[] bArr, int i, C3642xn c3642xn) throws zzaae {
        int m29926j = m29926j(bArr, i, c3642xn);
        int i2 = c3642xn.f9110a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c3642xn.f9112c = "";
                return m29926j;
            }
            c3642xn.f9112c = new String(bArr, m29926j, i2, C3117e.f8412a);
            return m29926j + i2;
        }
        throw zzaae.m29868f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m29928h(byte[] bArr, int i, C3642xn c3642xn) throws zzaae {
        int m29926j = m29926j(bArr, i, c3642xn);
        int i2 = c3642xn.f9110a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c3642xn.f9112c = "";
                return m29926j;
            }
            c3642xn.f9112c = C3386o1.m30524d(bArr, m29926j, i2);
            return m29926j + i2;
        }
        throw zzaae.m29868f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m29927i(int i, byte[] bArr, int i2, int i3, C3011a1 c3011a1, C3642xn c3642xn) throws zzaae {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m29923m = m29923m(bArr, i2, c3642xn);
                c3011a1.m31457h(i, Long.valueOf(c3642xn.f9111b));
                return m29923m;
            } else if (i4 == 1) {
                c3011a1.m31457h(i, Long.valueOf(m29922n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int m29926j = m29926j(bArr, i2, c3642xn);
                int i5 = c3642xn.f9110a;
                if (i5 >= 0) {
                    if (i5 <= bArr.length - m29926j) {
                        if (i5 == 0) {
                            c3011a1.m31457h(i, AbstractC3223ho.f8571d);
                        } else {
                            c3011a1.m31457h(i, AbstractC3223ho.m31021O(bArr, m29926j, i5));
                        }
                        return m29926j + i5;
                    }
                    throw zzaae.m29865i();
                }
                throw zzaae.m29868f();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    c3011a1.m31457h(i, Integer.valueOf(m29934b(bArr, i2)));
                    return i2 + 4;
                }
                throw zzaae.m29871c();
            } else {
                int i6 = (i & (-8)) | 4;
                C3011a1 m31460e = C3011a1.m31460e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int m29926j2 = m29926j(bArr, i2, c3642xn);
                    int i8 = c3642xn.f9110a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = m29926j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m29927i(i8, bArr, m29926j2, i3, m31460e, c3642xn);
                }
                if (i2 <= i3 && i7 == i6) {
                    c3011a1.m31457h(i, m31460e);
                    return i2;
                }
                throw zzaae.m29867g();
            }
        }
        throw zzaae.m29871c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m29926j(byte[] bArr, int i, C3642xn c3642xn) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c3642xn.f9110a = b;
            return i2;
        }
        return m29925k(b, bArr, i2, c3642xn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m29925k(int i, byte[] bArr, int i2, C3642xn c3642xn) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c3642xn.f9110a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c3642xn.f9110a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c3642xn.f9110a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c3642xn.f9110a = i9 | (b4 << PrinterCommands.OTHER_SYMBOL);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c3642xn.f9110a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m29924l(int i, byte[] bArr, int i2, int i3, InterfaceC3090d<?> interfaceC3090d, C3642xn c3642xn) {
        C3278jp c3278jp = (C3278jp) interfaceC3090d;
        int m29926j = m29926j(bArr, i2, c3642xn);
        c3278jp.m30883f(c3642xn.f9110a);
        while (m29926j < i3) {
            int m29926j2 = m29926j(bArr, m29926j, c3642xn);
            if (i != c3642xn.f9110a) {
                break;
            }
            m29926j = m29926j(bArr, m29926j2, c3642xn);
            c3278jp.m30883f(c3642xn.f9110a);
        }
        return m29926j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m29923m(byte[] bArr, int i, C3642xn c3642xn) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c3642xn.f9111b = j;
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
        c3642xn.f9111b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static long m29922n(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
