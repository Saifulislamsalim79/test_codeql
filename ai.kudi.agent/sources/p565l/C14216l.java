package p565l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p565l.p566g0.C14148c;
import p565l.p566g0.p568f.C14170d;
/* compiled from: Cookie.java */
/* renamed from: l.l */
/* loaded from: classes3.dex */
public final class C14216l {

    /* renamed from: j */
    private static final Pattern f31116j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f31117k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f31118l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f31119m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f31120a;

    /* renamed from: b */
    private final String f31121b;

    /* renamed from: c */
    private final long f31122c;

    /* renamed from: d */
    private final String f31123d;

    /* renamed from: e */
    private final String f31124e;

    /* renamed from: f */
    private final boolean f31125f;

    /* renamed from: g */
    private final boolean f31126g;

    /* renamed from: h */
    private final boolean f31127h;

    /* renamed from: i */
    private final boolean f31128i;

    private C14216l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f31120a = str;
        this.f31121b = str2;
        this.f31122c = j;
        this.f31123d = str3;
        this.f31124e = str4;
        this.f31125f = z;
        this.f31126g = z2;
        this.f31128i = z3;
        this.f31127h = z4;
    }

    /* renamed from: a */
    private static int m2606a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    private static boolean m2605b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C14148c.m2808J(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static p565l.C14216l m2603d(long r23, p565l.C14231t r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p565l.C14216l.m2603d(long, l.t, java.lang.String):l.l");
    }

    /* renamed from: e */
    public static C14216l m2602e(C14231t c14231t, String str) {
        return m2603d(System.currentTimeMillis(), c14231t, str);
    }

    /* renamed from: f */
    public static List<C14216l> m2601f(C14231t c14231t, C14229s c14229s) {
        List<String> m2543j = c14229s.m2543j("Set-Cookie");
        int size = m2543j.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C14216l m2602e = m2602e(c14231t, m2543j.get(i));
            if (m2602e != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m2602e);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: g */
    private static String m2600g(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String m2804d = C14148c.m2804d(str);
            if (m2804d != null) {
                return m2804d;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static long m2599h(String str, int i, int i2) {
        int m2606a = m2606a(str, i, i2, false);
        Matcher matcher = f31119m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (m2606a < i2) {
            int m2606a2 = m2606a(str, m2606a + 1, i2, true);
            matcher.region(m2606a, m2606a2);
            if (i4 == -1 && matcher.usePattern(f31119m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f31118l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(f31117k).matches()) {
                i6 = f31117k.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i3 == -1 && matcher.usePattern(f31116j).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
            }
            m2606a = m2606a(str, m2606a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 >= 1601) {
            if (i6 != -1) {
                if (i5 < 1 || i5 > 31) {
                    throw new IllegalArgumentException();
                }
                if (i4 < 0 || i4 > 23) {
                    throw new IllegalArgumentException();
                }
                if (i7 < 0 || i7 > 59) {
                    throw new IllegalArgumentException();
                }
                if (i8 >= 0 && i8 <= 59) {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(C14148c.f30918n);
                    gregorianCalendar.setLenient(false);
                    gregorianCalendar.set(1, i3);
                    gregorianCalendar.set(2, i6 - 1);
                    gregorianCalendar.set(5, i5);
                    gregorianCalendar.set(11, i4);
                    gregorianCalendar.set(12, i7);
                    gregorianCalendar.set(13, i8);
                    gregorianCalendar.set(14, 0);
                    return gregorianCalendar.getTimeInMillis();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    private static long m2598i(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    /* renamed from: c */
    public String m2604c() {
        return this.f31120a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14216l) {
            C14216l c14216l = (C14216l) obj;
            return c14216l.f31120a.equals(this.f31120a) && c14216l.f31121b.equals(this.f31121b) && c14216l.f31123d.equals(this.f31123d) && c14216l.f31124e.equals(this.f31124e) && c14216l.f31122c == this.f31122c && c14216l.f31125f == this.f31125f && c14216l.f31126g == this.f31126g && c14216l.f31127h == this.f31127h && c14216l.f31128i == this.f31128i;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f31122c;
        return ((((((((((((((((527 + this.f31120a.hashCode()) * 31) + this.f31121b.hashCode()) * 31) + this.f31123d.hashCode()) * 31) + this.f31124e.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f31125f ? 1 : 0)) * 31) + (!this.f31126g ? 1 : 0)) * 31) + (!this.f31127h ? 1 : 0)) * 31) + (!this.f31128i ? 1 : 0);
    }

    /* renamed from: j */
    String m2597j(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31120a);
        sb.append('=');
        sb.append(this.f31121b);
        if (this.f31127h) {
            if (this.f31122c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C14170d.m2732a(new Date(this.f31122c)));
            }
        }
        if (!this.f31128i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f31123d);
        }
        sb.append("; path=");
        sb.append(this.f31124e);
        if (this.f31125f) {
            sb.append("; secure");
        }
        if (this.f31126g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* renamed from: k */
    public String m2596k() {
        return this.f31121b;
    }

    public String toString() {
        return m2597j(false);
    }
}
