package kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
/* compiled from: BitEncoding.java */
/* renamed from: kotlin.j0.o.c.p0.e.a0.b.a */
/* loaded from: classes3.dex */
public class C12488a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    /* renamed from: a */
    private static /* synthetic */ void m8656a(int i) {
        String str = (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) ? 2 : 3];
        if (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = TransactionBreakDownItemType.DATA;
        }
        if (i == 1) {
            objArr[1] = "encodeBytes";
        } else if (i == 3) {
            objArr[1] = "encode8to7";
        } else if (i == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i == 8) {
            objArr[1] = "decodeBytes";
        } else if (i == 10) {
            objArr[1] = "dropMarker";
        } else if (i == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 6 && i != 8 && i != 10 && i != 12 && i != 14) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: b */
    private static void m8655b(byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = (byte) ((bArr[i2] + i) & 127);
            }
            return;
        }
        m8656a(4);
        throw null;
    }

    /* renamed from: c */
    private static byte[] m8654c(String[] strArr) {
        if (strArr != null) {
            int i = 0;
            for (String str : strArr) {
                i += str.length();
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            for (String str2 : strArr) {
                int length = str2.length();
                int i3 = 0;
                while (i3 < length) {
                    bArr[i2] = (byte) str2.charAt(i3);
                    i3++;
                    i2++;
                }
            }
            return bArr;
        }
        m8656a(11);
        throw null;
    }

    /* renamed from: d */
    private static byte[] m8653d(byte[] bArr) {
        if (bArr != null) {
            int length = (bArr.length * 7) / 8;
            byte[] bArr2 = new byte[length];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                i++;
                int i4 = i2 + 1;
                bArr2[i3] = (byte) (((bArr[i] & 255) >>> i2) + ((bArr[i] & ((1 << i4) - 1)) << (7 - i2)));
                if (i2 == 6) {
                    i++;
                    i2 = 0;
                } else {
                    i2 = i4;
                }
            }
            return bArr2;
        }
        m8656a(13);
        throw null;
    }

    /* renamed from: e */
    public static byte[] m8652e(String[] strArr) {
        if (strArr != null) {
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    byte[] m8627a = C12498h.m8627a(m8651f(strArr));
                    if (m8627a != null) {
                        return m8627a;
                    }
                    m8656a(8);
                    throw null;
                } else if (charAt == 65535) {
                    strArr = m8651f(strArr);
                }
            }
            byte[] m8654c = m8654c(strArr);
            m8655b(m8654c, 127);
            return m8653d(m8654c);
        }
        m8656a(7);
        throw null;
    }

    /* renamed from: f */
    private static String[] m8651f(String[] strArr) {
        if (strArr != null) {
            String[] strArr2 = (String[]) strArr.clone();
            strArr2[0] = strArr2[0].substring(1);
            if (strArr2 != null) {
                return strArr2;
            }
            m8656a(10);
            throw null;
        }
        m8656a(9);
        throw null;
    }
}
