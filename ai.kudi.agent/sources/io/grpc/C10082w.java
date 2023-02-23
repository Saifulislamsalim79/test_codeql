package io.grpc;

import com.google.common.base.C5041i;
import com.google.common.base.C5051n;
import io.grpc.InterfaceC10014m;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: DecompressorRegistry.java */
/* renamed from: io.grpc.w */
/* loaded from: classes2.dex */
public final class C10082w {

    /* renamed from: c */
    static final C5041i f23853c = C5041i.m25816e(',');

    /* renamed from: d */
    private static final C10082w f23854d = m13101a().m13096f(new InterfaceC10014m.C10015a(), true).m13096f(InterfaceC10014m.C10016b.f23740a, false);

    /* renamed from: a */
    private final Map<String, C10083a> f23855a;

    /* renamed from: b */
    private final byte[] f23856b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecompressorRegistry.java */
    /* renamed from: io.grpc.w$a */
    /* loaded from: classes2.dex */
    public static final class C10083a {

        /* renamed from: a */
        final InterfaceC10080v f23857a;

        /* renamed from: b */
        final boolean f23858b;

        C10083a(InterfaceC10080v interfaceC10080v, boolean z) {
            C5051n.m25779o(interfaceC10080v, "decompressor");
            this.f23857a = interfaceC10080v;
            this.f23858b = z;
        }
    }

    private C10082w(InterfaceC10080v interfaceC10080v, boolean z, C10082w c10082w) {
        String mo13106a = interfaceC10080v.mo13106a();
        C5051n.m25789e(!mo13106a.contains(","), "Comma is currently not allowed in message encoding");
        int size = c10082w.f23855a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c10082w.f23855a.containsKey(interfaceC10080v.mo13106a()) ? size : size + 1);
        for (C10083a c10083a : c10082w.f23855a.values()) {
            String mo13106a2 = c10083a.f23857a.mo13106a();
            if (!mo13106a2.equals(mo13106a)) {
                linkedHashMap.put(mo13106a2, new C10083a(c10083a.f23857a, c10083a.f23858b));
            }
        }
        linkedHashMap.put(mo13106a, new C10083a(interfaceC10080v, z));
        this.f23855a = Collections.unmodifiableMap(linkedHashMap);
        this.f23856b = f23853c.m25818c(m13100b()).getBytes(Charset.forName("US-ASCII"));
    }

    /* renamed from: a */
    public static C10082w m13101a() {
        return new C10082w();
    }

    /* renamed from: c */
    public static C10082w m13099c() {
        return f23854d;
    }

    /* renamed from: b */
    public Set<String> m13100b() {
        HashSet hashSet = new HashSet(this.f23855a.size());
        for (Map.Entry<String, C10083a> entry : this.f23855a.entrySet()) {
            if (entry.getValue().f23858b) {
                hashSet.add(entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public byte[] m13098d() {
        return this.f23856b;
    }

    /* renamed from: e */
    public InterfaceC10080v m13097e(String str) {
        C10083a c10083a = this.f23855a.get(str);
        if (c10083a != null) {
            return c10083a.f23857a;
        }
        return null;
    }

    /* renamed from: f */
    public C10082w m13096f(InterfaceC10080v interfaceC10080v, boolean z) {
        return new C10082w(interfaceC10080v, z, this);
    }

    private C10082w() {
        this.f23855a = new LinkedHashMap(0);
        this.f23856b = new byte[0];
    }
}
