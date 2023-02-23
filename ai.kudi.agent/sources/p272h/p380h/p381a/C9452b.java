package p272h.p380h.p381a;

import java.util.ArrayList;
import java.util.List;
/* compiled from: Headers.java */
/* renamed from: h.h.a.b */
/* loaded from: classes2.dex */
public final class C9452b {

    /* renamed from: a */
    private final String[] f22112a;

    /* compiled from: Headers.java */
    /* renamed from: h.h.a.b$b */
    /* loaded from: classes2.dex */
    public static final class C9454b {

        /* renamed from: a */
        private final List<String> f22113a = new ArrayList(20);

        /* renamed from: d */
        private void m14696d(String str, String str2) {
            if (str != null) {
                if (!str.isEmpty()) {
                    int length = str.length();
                    for (int i = 0; i < length; i++) {
                        char charAt = str.charAt(i);
                        if (charAt <= 31 || charAt >= 127) {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                        }
                    }
                    if (str2 != null) {
                        int length2 = str2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            char charAt2 = str2.charAt(i2);
                            if (charAt2 <= 31 || charAt2 >= 127) {
                                throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str2));
                            }
                        }
                        return;
                    }
                    throw new IllegalArgumentException("value == null");
                }
                throw new IllegalArgumentException("name is empty");
            }
            throw new IllegalArgumentException("name == null");
        }

        /* renamed from: b */
        C9454b m14698b(String str, String str2) {
            this.f22113a.add(str);
            this.f22113a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public C9452b m14697c() {
            return new C9452b(this);
        }

        /* renamed from: e */
        public C9454b m14695e(String str) {
            int i = 0;
            while (i < this.f22113a.size()) {
                if (str.equalsIgnoreCase(this.f22113a.get(i))) {
                    this.f22113a.remove(i);
                    this.f22113a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: f */
        public C9454b m14694f(String str, String str2) {
            m14696d(str, str2);
            m14695e(str);
            m14698b(str, str2);
            return this;
        }
    }

    /* renamed from: a */
    public String m14702a(int i) {
        int i2 = i * 2;
        if (i2 >= 0) {
            String[] strArr = this.f22112a;
            if (i2 >= strArr.length) {
                return null;
            }
            return strArr[i2];
        }
        return null;
    }

    /* renamed from: b */
    public int m14701b() {
        return this.f22112a.length / 2;
    }

    /* renamed from: c */
    public String m14700c(int i) {
        int i2 = (i * 2) + 1;
        if (i2 >= 0) {
            String[] strArr = this.f22112a;
            if (i2 >= strArr.length) {
                return null;
            }
            return strArr[i2];
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int m14701b = m14701b();
        for (int i = 0; i < m14701b; i++) {
            sb.append(m14702a(i));
            sb.append(": ");
            sb.append(m14700c(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    private C9452b(C9454b c9454b) {
        this.f22112a = (String[]) c9454b.f22113a.toArray(new String[c9454b.f22113a.size()]);
    }
}
