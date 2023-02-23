package p565l;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: MediaType.java */
/* renamed from: l.v */
/* loaded from: classes3.dex */
public final class C14235v {

    /* renamed from: d */
    private static final Pattern f31170d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    private static final Pattern f31171e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f31172a;

    /* renamed from: b */
    private final String f31173b;

    /* renamed from: c */
    private final String f31174c;

    private C14235v(String str, String str2, String str3, String str4) {
        this.f31172a = str;
        this.f31173b = str2;
        this.f31174c = str4;
    }

    /* renamed from: c */
    public static C14235v m2475c(String str) {
        Matcher matcher = f31170d.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = f31171e.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        String group2 = matcher2.group(2);
                        if (group2 != null) {
                            if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                                group2 = group2.substring(1, group2.length() - 1);
                            }
                        } else {
                            group2 = matcher2.group(3);
                        }
                        if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + '\"');
                        }
                        str2 = group2;
                    }
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new C14235v(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    /* renamed from: d */
    public static C14235v m2474d(String str) {
        try {
            return m2475c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Charset m2477a() {
        return m2476b(null);
    }

    /* renamed from: b */
    public Charset m2476b(Charset charset) {
        try {
            return this.f31174c != null ? Charset.forName(this.f31174c) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* renamed from: e */
    public String m2473e() {
        return this.f31173b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14235v) && ((C14235v) obj).f31172a.equals(this.f31172a);
    }

    public int hashCode() {
        return this.f31172a.hashCode();
    }

    public String toString() {
        return this.f31172a;
    }
}
