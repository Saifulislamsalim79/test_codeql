package p577n.p587c.p588d;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MessageFormatter.java */
/* renamed from: n.c.d.c */
/* loaded from: classes3.dex */
public final class C14463c {
    /* renamed from: a */
    public static final C14461a m1669a(String str, Object[] objArr) {
        int i;
        Throwable m1662h = m1662h(objArr);
        if (str == null) {
            return new C14461a(null, objArr, m1662h);
        }
        if (objArr == null) {
            return new C14461a(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int indexOf = str.indexOf("{}", i3);
            if (indexOf == -1) {
                if (i3 == 0) {
                    return new C14461a(str, objArr, m1662h);
                }
                sb.append(str.substring(i3, str.length()));
                return new C14461a(sb.toString(), objArr, m1662h);
            }
            if (m1659k(str, indexOf)) {
                if (!m1660j(str, indexOf)) {
                    i2--;
                    sb.append(str.substring(i3, indexOf - 1));
                    sb.append('{');
                    i = indexOf + 1;
                    i3 = i;
                    i2++;
                } else {
                    sb.append(str.substring(i3, indexOf - 1));
                    m1665e(sb, objArr[i2], new HashMap());
                }
            } else {
                sb.append(str.substring(i3, indexOf));
                m1665e(sb, objArr[i2], new HashMap());
            }
            i = indexOf + 2;
            i3 = i;
            i2++;
        }
        sb.append(str.substring(i3, str.length()));
        if (i2 < objArr.length - 1) {
            return new C14461a(sb.toString(), objArr, m1662h);
        }
        return new C14461a(sb.toString(), objArr, null);
    }

    /* renamed from: b */
    private static void m1668b(StringBuilder sb, boolean[] zArr) {
        sb.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(zArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: c */
    private static void m1667c(StringBuilder sb, byte[] bArr) {
        sb.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) bArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: d */
    private static void m1666d(StringBuilder sb, char[] cArr) {
        sb.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(cArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: e */
    private static void m1665e(StringBuilder sb, Object obj, Map map) {
        if (obj == null) {
            sb.append("null");
        } else if (!obj.getClass().isArray()) {
            m1656n(sb, obj);
        } else if (obj instanceof boolean[]) {
            m1668b(sb, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            m1667c(sb, (byte[]) obj);
        } else if (obj instanceof char[]) {
            m1666d(sb, (char[]) obj);
        } else if (obj instanceof short[]) {
            m1655o(sb, (short[]) obj);
        } else if (obj instanceof int[]) {
            m1661i(sb, (int[]) obj);
        } else if (obj instanceof long[]) {
            m1658l(sb, (long[]) obj);
        } else if (obj instanceof float[]) {
            m1663g(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            m1664f(sb, (double[]) obj);
        } else {
            m1657m(sb, (Object[]) obj, map);
        }
    }

    /* renamed from: f */
    private static void m1664f(StringBuilder sb, double[] dArr) {
        sb.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(dArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: g */
    private static void m1663g(StringBuilder sb, float[] fArr) {
        sb.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(fArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: h */
    static final Throwable m1662h(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    /* renamed from: i */
    private static void m1661i(StringBuilder sb, int[] iArr) {
        sb.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(iArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: j */
    static final boolean m1660j(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    /* renamed from: k */
    static final boolean m1659k(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    /* renamed from: l */
    private static void m1658l(StringBuilder sb, long[] jArr) {
        sb.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(jArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: m */
    private static void m1657m(StringBuilder sb, Object[] objArr, Map map) {
        sb.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                m1665e(sb, objArr[i], map);
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            sb.append("...");
        }
        sb.append(']');
    }

    /* renamed from: n */
    private static void m1656n(StringBuilder sb, Object obj) {
        try {
            sb.append(obj.toString());
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            printStream.println("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]");
            th.printStackTrace();
            sb.append("[FAILED toString()]");
        }
    }

    /* renamed from: o */
    private static void m1655o(StringBuilder sb, short[] sArr) {
        sb.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) sArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }
}
