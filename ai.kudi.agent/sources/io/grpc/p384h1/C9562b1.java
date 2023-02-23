package io.grpc.p384h1;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p272h.p286c.p348b.p349a.C9360b;
/* compiled from: JsonUtil.java */
/* renamed from: io.grpc.h1.b1 */
/* loaded from: classes2.dex */
public class C9562b1 {

    /* renamed from: a */
    private static final long f22383a = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: a */
    public static List<Map<String, ?>> m14470a(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
        return list;
    }

    /* renamed from: b */
    public static List<String> m14469b(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof String)) {
                throw new ClassCastException(String.format("value '%s' for idx %d in '%s' is not string", list.get(i), Integer.valueOf(i), list));
            }
        }
        return list;
    }

    /* renamed from: c */
    private static boolean m14468c(long j, int i) {
        if (j >= -315576000000L && j <= 315576000000L) {
            long j2 = i;
            if (j2 >= -999999999 && j2 < f22383a) {
                if (j >= 0 && i >= 0) {
                    return true;
                }
                if (j <= 0 && i <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static Boolean m14467d(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
        }
        return null;
    }

    /* renamed from: e */
    public static List<?> m14466e(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                return (List) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
        }
        return null;
    }

    /* renamed from: f */
    public static List<Map<String, ?>> m14465f(Map<String, ?> map, String str) {
        List m14466e = m14466e(map, str);
        if (m14466e == null) {
            return null;
        }
        m14470a(m14466e);
        return m14466e;
    }

    /* renamed from: g */
    public static List<String> m14464g(Map<String, ?> map, String str) {
        List m14466e = m14466e(map, str);
        if (m14466e == null) {
            return null;
        }
        m14469b(m14466e);
        return m14466e;
    }

    /* renamed from: h */
    public static Double m14463h(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Double", obj, str, map));
        }
        return null;
    }

    /* renamed from: i */
    public static Integer m14462i(Map<String, ?> map, String str) {
        Double m14463h = m14463h(map, str);
        if (m14463h == null) {
            return null;
        }
        int intValue = m14463h.intValue();
        if (intValue == m14463h.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        throw new ClassCastException("Number expected to be integer: " + m14463h);
    }

    /* renamed from: j */
    public static Map<String, ?> m14461j(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Map) {
                return (Map) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
        }
        return null;
    }

    /* renamed from: k */
    public static String m14460k(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
        }
        return null;
    }

    /* renamed from: l */
    public static Long m14459l(Map<String, ?> map, String str) {
        String m14460k = m14460k(map, str);
        if (m14460k == null) {
            return null;
        }
        try {
            return Long.valueOf(m14457n(m14460k));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private static long m14458m(long j, int i) {
        long j2 = i;
        long j3 = f22383a;
        if (j2 <= (-j3) || j2 >= j3) {
            j = C9360b.m14963a(j, j2 / f22383a);
            i = (int) (j2 % f22383a);
        }
        if (j > 0 && i < 0) {
            i = (int) (i + f22383a);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (i - f22383a);
            j++;
        }
        if (m14468c(j, i)) {
            return m14455p(TimeUnit.SECONDS.toNanos(j), i);
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }

    /* renamed from: n */
    private static long m14457n(String str) throws ParseException {
        boolean z;
        String str2;
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 's') {
            if (str.charAt(0) == '-') {
                str = str.substring(1);
                z = true;
            } else {
                z = false;
            }
            String substring = str.substring(0, str.length() - 1);
            int indexOf = substring.indexOf(46);
            if (indexOf != -1) {
                str2 = substring.substring(indexOf + 1);
                substring = substring.substring(0, indexOf);
            } else {
                str2 = "";
            }
            long parseLong = Long.parseLong(substring);
            int m14456o = str2.isEmpty() ? 0 : m14456o(str2);
            if (parseLong >= 0) {
                if (z) {
                    parseLong = -parseLong;
                    m14456o = -m14456o;
                }
                try {
                    return m14458m(parseLong, m14456o);
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        throw new ParseException("Invalid duration string: " + str, 0);
    }

    /* renamed from: o */
    private static int m14456o(String str) throws ParseException {
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            i *= 10;
            if (i2 < str.length()) {
                if (str.charAt(i2) >= '0' && str.charAt(i2) <= '9') {
                    i += str.charAt(i2) - '0';
                } else {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
            }
        }
        return i;
    }

    /* renamed from: p */
    private static long m14455p(long j, long j2) {
        long j3 = j + j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}
