package com.google.mlkit.common.p185a;

import com.google.firebase.p170o.InterfaceC6560b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.a.c */
/* loaded from: classes2.dex */
public class C6920c {

    /* renamed from: a */
    private final Map f16608a = new HashMap();

    /* compiled from: com.google.mlkit:common@@18.0.0 */
    /* renamed from: com.google.mlkit.common.a.c$a */
    /* loaded from: classes2.dex */
    public static class C6921a {

        /* renamed from: a */
        private final Class f16609a;

        /* renamed from: b */
        private final InterfaceC6560b f16610b;

        public <RemoteT extends AbstractC6919b> C6921a(Class<RemoteT> cls, InterfaceC6560b<? extends Object<RemoteT>> interfaceC6560b) {
            this.f16609a = cls;
            this.f16610b = interfaceC6560b;
        }

        /* renamed from: a */
        final InterfaceC6560b m20461a() {
            return this.f16610b;
        }

        /* renamed from: b */
        final Class m20460b() {
            return this.f16609a;
        }
    }

    public C6920c(Set<C6921a> set) {
        for (C6921a c6921a : set) {
            this.f16608a.put(c6921a.m20460b(), c6921a.m20461a());
        }
    }
}
