package p565l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p565l.p566g0.C14148c;
/* compiled from: Headers.java */
/* renamed from: l.s */
/* loaded from: classes3.dex */
public final class C14229s {

    /* renamed from: a */
    private final String[] f31150a;

    /* compiled from: Headers.java */
    /* renamed from: l.s$a */
    /* loaded from: classes3.dex */
    public static final class C14230a {

        /* renamed from: a */
        final List<String> f31151a = new ArrayList(20);

        /* renamed from: a */
        public C14230a m2542a(String str, String str2) {
            C14229s.m2552a(str);
            C14229s.m2551b(str2, str);
            m2540c(str, str2);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public C14230a m2541b(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                m2540c(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(":")) {
                m2540c("", str.substring(1));
                return this;
            } else {
                m2540c("", str);
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public C14230a m2540c(String str, String str2) {
            this.f31151a.add(str);
            this.f31151a.add(str2.trim());
            return this;
        }

        /* renamed from: d */
        public C14229s m2539d() {
            return new C14229s(this);
        }

        /* renamed from: e */
        public String m2538e(String str) {
            for (int size = this.f31151a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f31151a.get(size))) {
                    return this.f31151a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: f */
        public C14230a m2537f(String str) {
            int i = 0;
            while (i < this.f31151a.size()) {
                if (str.equalsIgnoreCase(this.f31151a.get(i))) {
                    this.f31151a.remove(i);
                    this.f31151a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: g */
        public C14230a m2536g(String str, String str2) {
            C14229s.m2552a(str);
            C14229s.m2551b(str2, str);
            m2537f(str);
            m2540c(str, str2);
            return this;
        }
    }

    C14229s(C14230a c14230a) {
        List<String> list = c14230a.f31151a;
        this.f31150a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a */
    static void m2552a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(C14148c.m2790r("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    /* renamed from: b */
    static void m2551b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    throw new IllegalArgumentException(C14148c.m2790r("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    /* renamed from: d */
    private static String m2549d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C14229s m2546g(String... strArr) {
        if (strArr != null) {
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                for (int i = 0; i < strArr2.length; i++) {
                    if (strArr2[i] != null) {
                        strArr2[i] = strArr2[i].trim();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                    String str = strArr2[i2];
                    String str2 = strArr2[i2 + 1];
                    m2552a(str);
                    m2551b(str2, str);
                }
                return new C14229s(strArr2);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        throw new NullPointerException("namesAndValues == null");
    }

    /* renamed from: c */
    public String m2550c(String str) {
        return m2549d(this.f31150a, str);
    }

    /* renamed from: e */
    public String m2548e(int i) {
        return this.f31150a[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14229s) && Arrays.equals(((C14229s) obj).f31150a, this.f31150a);
    }

    /* renamed from: f */
    public C14230a m2547f() {
        C14230a c14230a = new C14230a();
        Collections.addAll(c14230a.f31151a, this.f31150a);
        return c14230a;
    }

    /* renamed from: h */
    public int m2545h() {
        return this.f31150a.length / 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f31150a);
    }

    /* renamed from: i */
    public String m2544i(int i) {
        return this.f31150a[(i * 2) + 1];
    }

    /* renamed from: j */
    public List<String> m2543j(String str) {
        int m2545h = m2545h();
        ArrayList arrayList = null;
        for (int i = 0; i < m2545h; i++) {
            if (str.equalsIgnoreCase(m2548e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m2544i(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int m2545h = m2545h();
        for (int i = 0; i < m2545h; i++) {
            sb.append(m2548e(i));
            sb.append(": ");
            sb.append(m2544i(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    private C14229s(String[] strArr) {
        this.f31150a = strArr;
    }
}
