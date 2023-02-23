package io.intercom.com.bumptech.glide.load.p400n;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: LazyHeaders.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.j */
/* loaded from: classes3.dex */
public final class C10687j implements InterfaceC10685h {

    /* renamed from: b */
    private final Map<String, List<InterfaceC10686i>> f24489b;

    /* renamed from: c */
    private volatile Map<String, String> f24490c;

    /* compiled from: LazyHeaders.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.j$a */
    /* loaded from: classes3.dex */
    public static final class C10688a {

        /* renamed from: b */
        private static final String f24491b = m12516b();

        /* renamed from: c */
        private static final Map<String, List<InterfaceC10686i>> f24492c;

        /* renamed from: a */
        private Map<String, List<InterfaceC10686i>> f24493a = f24492c;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f24491b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C10689b(f24491b)));
            }
            f24492c = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m12516b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C10687j m12517a() {
            return new C10687j(this.f24493a);
        }
    }

    /* compiled from: LazyHeaders.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.j$b */
    /* loaded from: classes3.dex */
    static final class C10689b implements InterfaceC10686i {

        /* renamed from: a */
        private final String f24494a;

        C10689b(String str) {
            this.f24494a = str;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10686i
        /* renamed from: a */
        public String mo12515a() {
            return this.f24494a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10689b) {
                return this.f24494a.equals(((C10689b) obj).f24494a);
            }
            return false;
        }

        public int hashCode() {
            return this.f24494a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f24494a + "'}";
        }
    }

    C10687j(Map<String, List<InterfaceC10686i>> map) {
        this.f24489b = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private Map<String, String> m12518b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<InterfaceC10686i>> entry : this.f24489b.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List<InterfaceC10686i> value = entry.getValue();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String mo12515a = value.get(i).mo12515a();
                if (!TextUtils.isEmpty(mo12515a)) {
                    sb.append(mo12515a);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            if (!TextUtils.isEmpty(sb.toString())) {
                hashMap.put(entry.getKey(), sb.toString());
            }
        }
        return hashMap;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10685h
    /* renamed from: a */
    public Map<String, String> mo12519a() {
        if (this.f24490c == null) {
            synchronized (this) {
                if (this.f24490c == null) {
                    this.f24490c = Collections.unmodifiableMap(m12518b());
                }
            }
        }
        return this.f24490c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10687j) {
            return this.f24489b.equals(((C10687j) obj).f24489b);
        }
        return false;
    }

    public int hashCode() {
        return this.f24489b.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f24489b + '}';
    }
}
