package com.github.kittinunf.fuel.core;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.p486e0.InterfaceC11794d;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
/* compiled from: Headers.kt */
/* renamed from: com.github.kittinunf.fuel.core.n */
/* loaded from: classes2.dex */
public final class C2460n implements Map<String, Collection<? extends String>>, InterfaceC11794d {

    /* renamed from: d */
    private static final Map<C2459m, Boolean> f7033d;

    /* renamed from: e */
    private static final Map<C2459m, Boolean> f7034e;

    /* renamed from: f */
    private static final Map<C2459m, String> f7035f;

    /* renamed from: w */
    public static final C2461a f7036w = new C2461a(null);

    /* renamed from: c */
    private HashMap<C2459m, Collection<String>> f7037c = new HashMap<>();

    /* compiled from: Headers.kt */
    /* renamed from: com.github.kittinunf.fuel.core.n$a */
    /* loaded from: classes2.dex */
    public static final class C2461a {
        private C2461a() {
        }

        /* renamed from: a */
        public final String m32829a(C2459m c2459m, Collection<String> collection) {
            String m3797a0;
            kotlin.e0.d.l.g(c2459m, "header");
            kotlin.e0.d.l.g(collection, "values");
            String str = (String) C2460n.f7035f.get(c2459m);
            if (str == null) {
                str = ", ";
            }
            m3797a0 = C13742z.m3797a0(collection, str, null, null, 0, null, null, 62, null);
            return m3797a0;
        }

        /* renamed from: b */
        public final C2460n m32828b(Collection<? extends C13287o<String, ? extends Object>> collection) {
            boolean m5440u;
            int m3867o;
            kotlin.e0.d.l.g(collection, "pairs");
            C2460n c2460n = new C2460n();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                C13287o c13287o = (C13287o) it.next();
                String str = (String) c13287o.m5364c();
                if (str == null) {
                    str = "";
                }
                m5440u = C13276s.m5440u(str);
                if (m5440u) {
                    str = null;
                }
                if (str != null) {
                    Object m5363d = c13287o.m5363d();
                    if (m5363d instanceof Collection) {
                        Collection collection2 = (Collection) m5363d;
                        Collection<Object> collection3 = collection2.isEmpty() ? null : collection2;
                        if (collection3 != null) {
                            m3867o = C13728s.m3867o(collection3, 10);
                            ArrayList arrayList = new ArrayList(m3867o);
                            for (Object obj : collection3) {
                                arrayList.add(String.valueOf(obj));
                            }
                            c2460n.m32843g(str, arrayList);
                        }
                    } else {
                        c2460n.m32844e(str, m5363d.toString());
                    }
                }
            }
            return c2460n;
        }

        /* renamed from: c */
        public final C2460n m32827c(Map<? extends String, ? extends Object> map) {
            int m3867o;
            kotlin.e0.d.l.g(map, TransactionField.TRANSACTION_CHANNEL);
            Set<Map.Entry<? extends String, ? extends Object>> entrySet = map.entrySet();
            m3867o = C13728s.m3867o(entrySet, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new C13287o(entry.getKey(), entry.getValue()));
            }
            return m32828b(arrayList);
        }

        /* renamed from: d */
        public final C2460n m32826d(C13287o<String, ? extends Object>... c13287oArr) {
            List m4025Z;
            kotlin.e0.d.l.g(c13287oArr, "pairs");
            m4025Z = C13715n.m4025Z(c13287oArr);
            return m32828b(m4025Z);
        }

        /* renamed from: e */
        public final boolean m32825e(C2459m c2459m) {
            kotlin.e0.d.l.g(c2459m, "header");
            Object obj = C2460n.f7033d.get(c2459m);
            if (obj == null) {
                obj = Boolean.valueOf(!C2460n.f7036w.m32824f(c2459m));
            }
            return ((Boolean) obj).booleanValue();
        }

        /* renamed from: f */
        public final boolean m32824f(C2459m c2459m) {
            kotlin.e0.d.l.g(c2459m, "header");
            Boolean bool = (Boolean) C2460n.f7034e.get(c2459m);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        /* renamed from: g */
        public final boolean m32823g(String str) {
            kotlin.e0.d.l.g(str, "header");
            return m32824f(new C2459m(str));
        }

        public /* synthetic */ C2461a(kotlin.e0.d.g gVar) {
            this();
        }
    }

    static {
        Map<C2459m, Boolean> m3897g;
        Map<C2459m, Boolean> m3878n;
        Map<C2459m, String> m3897g2;
        m3897g = C13725q0.m3897g(C13664u.m4227a(new C2459m("Set-Cookie"), Boolean.FALSE));
        f7033d = m3897g;
        m3878n = C13727r0.m3878n(C13664u.m4227a(new C2459m("Age"), Boolean.TRUE), C13664u.m4227a(new C2459m("Content-Encoding"), Boolean.TRUE), C13664u.m4227a(new C2459m("Content-Length"), Boolean.TRUE), C13664u.m4227a(new C2459m("Content-Location"), Boolean.TRUE), C13664u.m4227a(new C2459m("Content-Type"), Boolean.TRUE), C13664u.m4227a(new C2459m("Expect"), Boolean.TRUE), C13664u.m4227a(new C2459m("Expires"), Boolean.TRUE), C13664u.m4227a(new C2459m("Location"), Boolean.TRUE), C13664u.m4227a(new C2459m("User-Agent"), Boolean.TRUE));
        f7034e = m3878n;
        m3897g2 = C13725q0.m3897g(C13664u.m4227a(new C2459m("Cookie"), "; "));
        f7035f = m3897g2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public static /* synthetic */ void m32830u(C2460n c2460n, InterfaceC11771p interfaceC11771p, InterfaceC11771p interfaceC11771p2, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC11771p2 = interfaceC11771p;
        }
        c2460n.m32831t(interfaceC11771p, interfaceC11771p2);
    }

    @Override // java.util.Map
    public void clear() {
        this.f7037c.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return m32842h((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Collection) {
            return m32841i((Collection) obj);
        }
        return false;
    }

    /* renamed from: e */
    public final C2460n m32844e(String str, Object obj) {
        List m3783o0;
        kotlin.e0.d.l.g(str, "header");
        kotlin.e0.d.l.g(obj, "value");
        boolean m32823g = f7036w.m32823g(str);
        if (m32823g) {
            m32833q(str, obj.toString());
        } else if (m32823g) {
            throw new NoWhenBranchMatchedException();
        } else {
            m3783o0 = C13742z.m3783o0(get(str), obj.toString());
            m32832s(str, m3783o0);
        }
        return this;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Collection<? extends String>>> entrySet() {
        return m32839k();
    }

    /* renamed from: g */
    public final C2460n m32843g(String str, Collection<?> collection) {
        int m3867o;
        List m3784n0;
        kotlin.e0.d.l.g(str, "header");
        kotlin.e0.d.l.g(collection, "values");
        Collection<? extends String> collection2 = get(str);
        m3867o = C13728s.m3867o(collection, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        m3784n0 = C13742z.m3784n0(collection2, arrayList);
        put(str, m3784n0);
        return this;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<? extends String> get(Object obj) {
        if (obj instanceof String) {
            return m32840j((String) obj);
        }
        return null;
    }

    /* renamed from: h */
    public boolean m32842h(String str) {
        kotlin.e0.d.l.g(str, "key");
        return this.f7037c.containsKey(new C2459m(str));
    }

    /* renamed from: i */
    public boolean m32841i(Collection<String> collection) {
        kotlin.e0.d.l.g(collection, "value");
        return this.f7037c.containsValue(collection);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f7037c.isEmpty();
    }

    /* renamed from: j */
    public Collection<String> m32840j(String str) {
        List m3887i;
        kotlin.e0.d.l.g(str, "key");
        C2459m c2459m = new C2459m(str);
        Collection<String> collection = this.f7037c.get(c2459m);
        if (collection == null) {
            collection = C13726r.m3891e();
        }
        boolean m32824f = f7036w.m32824f(c2459m);
        if (m32824f) {
            m3887i = C13726r.m3887i(C13722p.m3942d0(collection));
            return m3887i;
        } else if (m32824f) {
            throw new NoWhenBranchMatchedException();
        } else {
            return collection;
        }
    }

    /* renamed from: k */
    public Set<Map.Entry<String, Collection<String>>> m32839k() {
        int m3898f;
        Map m3868x;
        HashMap<C2459m, Collection<String>> hashMap = this.f7037c;
        m3898f = C13725q0.m3898f(hashMap.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3898f);
        Iterator<T> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((C2459m) entry.getKey()).m32848a(), entry.getValue());
        }
        m3868x = C13727r0.m3868x(linkedHashMap);
        return m3868x.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m32838l();
    }

    /* renamed from: l */
    public Set<String> m32838l() {
        int m3867o;
        Set<String> m3822E0;
        Set<C2459m> keySet = this.f7037c.keySet();
        kotlin.e0.d.l.c(keySet, "contents.keys");
        m3867o = C13728s.m3867o(keySet, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C2459m c2459m : keySet) {
            arrayList.add(c2459m.m32848a());
        }
        m3822E0 = C13742z.m3822E0(new HashSet(arrayList));
        return m3822E0;
    }

    /* renamed from: m */
    public int m32837m() {
        return this.f7037c.size();
    }

    /* renamed from: n */
    public Collection<Collection<String>> m32836n() {
        Collection<Collection<String>> values = this.f7037c.values();
        kotlin.e0.d.l.c(values, "contents.values");
        return values;
    }

    @Override // java.util.Map
    /* renamed from: o */
    public Collection<String> put(String str, Collection<String> collection) {
        kotlin.e0.d.l.g(str, "key");
        kotlin.e0.d.l.g(collection, "value");
        return this.f7037c.put(new C2459m(str), collection);
    }

    /* renamed from: p */
    public Collection<String> m32834p(String str) {
        kotlin.e0.d.l.g(str, "key");
        return this.f7037c.remove(new C2459m(str));
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Collection<? extends String>> map) {
        kotlin.e0.d.l.g(map, "from");
        for (Map.Entry<String, Collection<? extends String>> entry : f7036w.m32827c(map).entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: q */
    public final C2460n m32833q(String str, String str2) {
        List m3901b;
        kotlin.e0.d.l.g(str, "key");
        kotlin.e0.d.l.g(str2, "value");
        m3901b = C13724q.m3901b(str2);
        put(str, m3901b);
        return this;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<? extends String> remove(Object obj) {
        if (obj instanceof String) {
            return m32834p((String) obj);
        }
        return null;
    }

    /* renamed from: s */
    public final C2460n m32832s(String str, Collection<String> collection) {
        kotlin.e0.d.l.g(str, "key");
        kotlin.e0.d.l.g(collection, "values");
        put(str, collection);
        return this;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m32837m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final void m32831t(InterfaceC11771p<? super String, ? super String, ? extends Object> interfaceC11771p, InterfaceC11771p<? super String, ? super String, ? extends Object> interfaceC11771p2) {
        kotlin.e0.d.l.g(interfaceC11771p, "set");
        kotlin.e0.d.l.g(interfaceC11771p2, "add");
        for (Map.Entry<String, Collection<? extends String>> entry : entrySet()) {
            String key = entry.getKey();
            Collection<? extends String> value = entry.getValue();
            C2459m c2459m = new C2459m(key);
            boolean m32825e = f7036w.m32825e(c2459m);
            if (m32825e) {
                interfaceC11771p.invoke(key, f7036w.m32829a(c2459m, value));
            } else if (!m32825e) {
                boolean m32824f = f7036w.m32824f(c2459m);
                if (m32824f) {
                    String str = (String) C13722p.m3942d0(value);
                    if (str != null) {
                        interfaceC11771p.invoke(key, str);
                    }
                } else if (!m32824f) {
                    for (String str2 : value) {
                        interfaceC11771p2.invoke(key, str2);
                    }
                }
            }
        }
    }

    public String toString() {
        String hashMap = this.f7037c.toString();
        kotlin.e0.d.l.c(hashMap, "contents.toString()");
        return hashMap;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Collection<? extends String>> values() {
        return m32836n();
    }
}
