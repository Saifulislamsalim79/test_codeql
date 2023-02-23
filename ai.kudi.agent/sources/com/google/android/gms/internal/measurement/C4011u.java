package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.u */
/* loaded from: classes2.dex */
public final class C4011u implements Iterable<q>, q {

    /* renamed from: c */
    private final String f9721c;

    public C4011u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f9721c = str;
    }

    /* renamed from: b */
    public final Double m28895b() {
        if (this.f9721c.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f9721c);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    /* renamed from: d */
    public final q m28894d() {
        return new C4011u(this.f9721c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4011u) {
            return this.f9721c.equals(((C4011u) obj).f9721c);
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean m28892f() {
        return Boolean.valueOf(!this.f9721c.isEmpty());
    }

    /* renamed from: h */
    public final String m28891h() {
        return this.f9721c;
    }

    public final int hashCode() {
        return this.f9721c.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<q> iterator() {
        return new C3995t(this);
    }

    /* renamed from: l */
    public final Iterator<q> m28890l() {
        return new C3979s(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: s */
    public final q m28889s(String str, C3968r4 c3968r4, List<q> list) {
        String str2;
        Object obj;
        String str3;
        String str4;
        char c;
        C4011u c4011u;
        int i;
        q c3822i;
        double doubleValue;
        String str5;
        Matcher matcher;
        double min;
        double min2;
        C4011u c4011u2;
        int i2;
        int i3;
        C3968r4 c3968r42;
        int i4;
        int length;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str) && !"trim".equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                obj = "charAt";
                str3 = "hasOwnProperty";
                if (str.equals(str3)) {
                    str4 = "toString";
                    c = 2;
                    break;
                }
                c = 65535;
                str4 = "toString";
                break;
            case -1776922004:
                obj = "charAt";
                if (str.equals("toString")) {
                    c = 14;
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1464939364:
                obj = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c = '\f';
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1361633751:
                obj = "charAt";
                if (str.equals(obj)) {
                    str3 = "hasOwnProperty";
                    c = 0;
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1354795244:
                if (str.equals("concat")) {
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    c = 1;
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = '\r';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -906336856:
                if (str.equals("search")) {
                    c = 7;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -726908483:
                if (str.equals(str2)) {
                    c = 11;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 4;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = 15;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 3568674:
                if (str.equals("trim")) {
                    c = 16;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 103668165:
                if (str.equals("match")) {
                    c = 5;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 109526418:
                if (str.equals("slice")) {
                    c = '\b';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 109648666:
                if (str.equals("split")) {
                    c = '\t';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 530542161:
                if (str.equals("substring")) {
                    c = '\n';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 1094496948:
                if (str.equals("replace")) {
                    c = 6;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 3;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            default:
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
                break;
        }
        String str6 = obj;
        switch (c) {
            case 0:
                C3969r5.m29035j(str6, 1, list);
                int m29044a = list.size() > 0 ? (int) C3969r5.m29044a(c3968r4.m29051b(list.get(0)).b().doubleValue()) : 0;
                String str7 = this.f9721c;
                if (m29044a >= 0 && m29044a < str7.length()) {
                    return new C4011u(String.valueOf(str7.charAt(m29044a)));
                }
                return q.p;
            case 1:
                c4011u = this;
                if (list.size() != 0) {
                    StringBuilder sb = new StringBuilder(c4011u.f9721c);
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        sb.append(c3968r4.m29051b(list.get(i5)).h());
                    }
                    return new C4011u(sb.toString());
                }
                return c4011u;
            case 2:
                C3969r5.m29037h(str3, 1, list);
                String str8 = this.f9721c;
                q m29051b = c3968r4.m29051b(list.get(0));
                if ("length".equals(m29051b.h())) {
                    return q.n;
                }
                double doubleValue2 = m29051b.b().doubleValue();
                return (doubleValue2 != Math.floor(doubleValue2) || (i = (int) doubleValue2) < 0 || i >= str8.length()) ? q.o : q.n;
            case 3:
                C3969r5.m29035j("indexOf", 2, list);
                c3822i = new C3822i(Double.valueOf(this.f9721c.indexOf(list.size() > 0 ? c3968r4.m29051b(list.get(0)).h() : "undefined", (int) C3969r5.m29044a(list.size() < 2 ? 0.0d : c3968r4.m29051b(list.get(1)).b().doubleValue()))));
                return c3822i;
            case 4:
                C3969r5.m29035j("lastIndexOf", 2, list);
                String str9 = this.f9721c;
                String h = list.size() > 0 ? c3968r4.m29051b(list.get(0)).h() : "undefined";
                return new C3822i(Double.valueOf(str9.lastIndexOf(h, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : c3968r4.m29051b(list.get(1)).b().doubleValue()) ? Double.POSITIVE_INFINITY : C3969r5.m29044a(doubleValue)))));
            case 5:
                C3969r5.m29035j("match", 1, list);
                Matcher matcher2 = Pattern.compile(list.size() > 0 ? c3968r4.m29051b(list.get(0)).h() : "").matcher(this.f9721c);
                return matcher2.find() ? new f(Arrays.asList(new C4011u(matcher2.group()))) : q.j;
            case 6:
                c4011u = this;
                C3969r5.m29035j("replace", 2, list);
                q qVar = q.i;
                if (list.size() > 0) {
                    str5 = c3968r4.m29051b(list.get(0)).h();
                    if (list.size() > 1) {
                        qVar = c3968r4.m29051b(list.get(1));
                    }
                }
                String str10 = str5;
                String str11 = c4011u.f9721c;
                int indexOf = str11.indexOf(str10);
                if (indexOf >= 0) {
                    if (qVar instanceof AbstractC3838j) {
                        qVar = ((AbstractC3838j) qVar).mo28520a(c3968r4, Arrays.asList(new C4011u(str10), new C3822i(Double.valueOf(indexOf)), c4011u));
                    }
                    String substring = str11.substring(0, indexOf);
                    String h2 = qVar.h();
                    String substring2 = str11.substring(indexOf + str10.length());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(h2).length() + String.valueOf(substring2).length());
                    sb2.append(substring);
                    sb2.append(h2);
                    sb2.append(substring2);
                    c3822i = new C4011u(sb2.toString());
                    return c3822i;
                }
                return c4011u;
            case 7:
                C3969r5.m29035j("search", 1, list);
                if (Pattern.compile(list.size() > 0 ? c3968r4.m29051b(list.get(0)).h() : "undefined").matcher(this.f9721c).find()) {
                    return new C3822i(Double.valueOf(matcher.start()));
                }
                return new C3822i(Double.valueOf(-1.0d));
            case '\b':
                C3969r5.m29035j("slice", 2, list);
                String str12 = this.f9721c;
                double m29044a2 = C3969r5.m29044a(list.size() > 0 ? c3968r4.m29051b(list.get(0)).b().doubleValue() : 0.0d);
                if (m29044a2 < 0.0d) {
                    double length2 = str12.length();
                    Double.isNaN(length2);
                    min = Math.max(length2 + m29044a2, 0.0d);
                } else {
                    min = Math.min(m29044a2, str12.length());
                }
                int i6 = (int) min;
                double m29044a3 = C3969r5.m29044a(list.size() > 1 ? c3968r4.m29051b(list.get(1)).b().doubleValue() : str12.length());
                if (m29044a3 < 0.0d) {
                    double length3 = str12.length();
                    Double.isNaN(length3);
                    min2 = Math.max(length3 + m29044a3, 0.0d);
                } else {
                    min2 = Math.min(m29044a3, str12.length());
                }
                c4011u2 = new C4011u(str12.substring(i6, Math.max(0, ((int) min2) - i6) + i6));
                return c4011u2;
            case '\t':
                C3969r5.m29035j("split", 2, list);
                String str13 = this.f9721c;
                if (str13.length() == 0) {
                    return new f(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.size() == 0) {
                    arrayList.add(this);
                } else {
                    String h3 = c3968r4.m29051b(list.get(0)).h();
                    long m29041d = list.size() > 1 ? C3969r5.m29041d(c3968r4.m29051b(list.get(1)).b().doubleValue()) : 2147483647L;
                    if (m29041d == 0) {
                        return new f();
                    }
                    String[] split = str13.split(Pattern.quote(h3), ((int) m29041d) + 1);
                    int length4 = split.length;
                    if (!h3.equals("") || length4 <= 0) {
                        i2 = length4;
                        i3 = 0;
                    } else {
                        boolean equals = split[0].equals("");
                        i2 = length4 - 1;
                        if (!split[i2].equals("")) {
                            i2 = length4;
                        }
                        i3 = equals;
                    }
                    if (length4 > m29041d) {
                        i2--;
                    }
                    for (int i7 = i3; i7 < i2; i7++) {
                        arrayList.add(new C4011u(split[i7]));
                    }
                }
                return new f(arrayList);
            case '\n':
                C3969r5.m29035j("substring", 2, list);
                String str14 = this.f9721c;
                if (list.size() > 0) {
                    c3968r42 = c3968r4;
                    i4 = (int) C3969r5.m29044a(c3968r42.m29051b(list.get(0)).b().doubleValue());
                } else {
                    c3968r42 = c3968r4;
                    i4 = 0;
                }
                if (list.size() > 1) {
                    length = (int) C3969r5.m29044a(c3968r42.m29051b(list.get(1)).b().doubleValue());
                } else {
                    length = str14.length();
                }
                int min3 = Math.min(Math.max(i4, 0), str14.length());
                int min4 = Math.min(Math.max(length, 0), str14.length());
                c4011u2 = new C4011u(str14.substring(Math.min(min3, min4), Math.max(min3, min4)));
                return c4011u2;
            case 11:
                C3969r5.m29037h(str2, 0, list);
                return new C4011u(this.f9721c.toUpperCase());
            case '\f':
                C3969r5.m29037h("toLocaleLowerCase", 0, list);
                return new C4011u(this.f9721c.toLowerCase());
            case '\r':
                C3969r5.m29037h("toLowerCase", 0, list);
                return new C4011u(this.f9721c.toLowerCase(Locale.ENGLISH));
            case 14:
                c4011u = this;
                C3969r5.m29037h(str4, 0, list);
                return c4011u;
            case 15:
                C3969r5.m29037h("toUpperCase", 0, list);
                return new C4011u(this.f9721c.toUpperCase(Locale.ENGLISH));
            case 16:
                C3969r5.m29037h("toUpperCase", 0, list);
                return new C4011u(this.f9721c.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        String str = this.f9721c;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }
}
