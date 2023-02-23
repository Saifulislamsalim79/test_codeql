package com.bumptech.glide.load.p072n;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: LazyHeaders.java */
/* renamed from: com.bumptech.glide.load.n.j */
/* loaded from: classes2.dex */
public final class C2189j implements InterfaceC2187h {

    /* renamed from: b */
    private final Map<String, List<InterfaceC2188i>> f6493b;

    /* renamed from: c */
    private volatile Map<String, String> f6494c;

    /* compiled from: LazyHeaders.java */
    /* renamed from: com.bumptech.glide.load.n.j$a */
    /* loaded from: classes2.dex */
    public static final class C2190a {

        /* renamed from: d */
        private static final String f6495d = m33566g();

        /* renamed from: e */
        private static final Map<String, List<InterfaceC2188i>> f6496e;

        /* renamed from: a */
        private boolean f6497a = true;

        /* renamed from: b */
        private Map<String, List<InterfaceC2188i>> f6498b = f6496e;

        /* renamed from: c */
        private boolean f6499c = true;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f6495d)) {
                hashMap.put("User-Agent", Collections.singletonList(new C2191b(f6495d)));
            }
            f6496e = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: d */
        private Map<String, List<InterfaceC2188i>> m33569d() {
            HashMap hashMap = new HashMap(this.f6498b.size());
            for (Map.Entry<String, List<InterfaceC2188i>> entry : this.f6498b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        /* renamed from: e */
        private void m33568e() {
            if (this.f6497a) {
                this.f6497a = false;
                this.f6498b = m33569d();
            }
        }

        /* renamed from: f */
        private List<InterfaceC2188i> m33567f(String str) {
            List<InterfaceC2188i> list = this.f6498b.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f6498b.put(str, arrayList);
                return arrayList;
            }
            return list;
        }

        /* renamed from: g */
        static String m33566g() {
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
        public C2190a m33572a(String str, InterfaceC2188i interfaceC2188i) {
            if (this.f6499c && "User-Agent".equalsIgnoreCase(str)) {
                m33565h(str, interfaceC2188i);
                return this;
            }
            m33568e();
            m33567f(str).add(interfaceC2188i);
            return this;
        }

        /* renamed from: b */
        public C2190a m33571b(String str, String str2) {
            m33572a(str, new C2191b(str2));
            return this;
        }

        /* renamed from: c */
        public C2189j m33570c() {
            this.f6497a = true;
            return new C2189j(this.f6498b);
        }

        /* renamed from: h */
        public C2190a m33565h(String str, InterfaceC2188i interfaceC2188i) {
            m33568e();
            if (interfaceC2188i == null) {
                this.f6498b.remove(str);
            } else {
                List<InterfaceC2188i> m33567f = m33567f(str);
                m33567f.clear();
                m33567f.add(interfaceC2188i);
            }
            if (this.f6499c && "User-Agent".equalsIgnoreCase(str)) {
                this.f6499c = false;
            }
            return this;
        }
    }

    /* compiled from: LazyHeaders.java */
    /* renamed from: com.bumptech.glide.load.n.j$b */
    /* loaded from: classes2.dex */
    static final class C2191b implements InterfaceC2188i {

        /* renamed from: a */
        private final String f6500a;

        C2191b(String str) {
            this.f6500a = str;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2188i
        /* renamed from: a */
        public String mo33564a() {
            return this.f6500a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2191b) {
                return this.f6500a.equals(((C2191b) obj).f6500a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6500a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f6500a + "'}";
        }
    }

    C2189j(Map<String, List<InterfaceC2188i>> map) {
        this.f6493b = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private String m33574b(List<InterfaceC2188i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String mo33564a = list.get(i).mo33564a();
            if (!TextUtils.isEmpty(mo33564a)) {
                sb.append(mo33564a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private Map<String, String> m33573c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<InterfaceC2188i>> entry : this.f6493b.entrySet()) {
            String m33574b = m33574b(entry.getValue());
            if (!TextUtils.isEmpty(m33574b)) {
                hashMap.put(entry.getKey(), m33574b);
            }
        }
        return hashMap;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2187h
    /* renamed from: a */
    public Map<String, String> mo33575a() {
        if (this.f6494c == null) {
            synchronized (this) {
                if (this.f6494c == null) {
                    this.f6494c = Collections.unmodifiableMap(m33573c());
                }
            }
        }
        return this.f6494c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2189j) {
            return this.f6493b.equals(((C2189j) obj).f6493b);
        }
        return false;
    }

    public int hashCode() {
        return this.f6493b.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f6493b + '}';
    }
}
