package io.grpc;

import io.grpc.InterfaceC10014m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: CompressorRegistry.java */
/* renamed from: io.grpc.p */
/* loaded from: classes2.dex */
public final class C10036p {

    /* renamed from: b */
    private static final C10036p f23761b = new C10036p(new InterfaceC10014m.C10015a(), InterfaceC10014m.C10016b.f23740a);

    /* renamed from: a */
    private final ConcurrentMap<String, InterfaceC10033o> f23762a = new ConcurrentHashMap();

    C10036p(InterfaceC10033o... interfaceC10033oArr) {
        for (InterfaceC10033o interfaceC10033o : interfaceC10033oArr) {
            this.f23762a.put(interfaceC10033o.mo13106a(), interfaceC10033o);
        }
    }

    /* renamed from: a */
    public static C10036p m13253a() {
        return f23761b;
    }

    /* renamed from: b */
    public InterfaceC10033o m13252b(String str) {
        return this.f23762a.get(str);
    }
}
