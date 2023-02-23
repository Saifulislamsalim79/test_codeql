package com.google.protobuf;

import com.google.protobuf.AbstractC7141y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ExtensionRegistryLite.java */
/* renamed from: com.google.protobuf.p */
/* loaded from: classes2.dex */
public class C7089p {

    /* renamed from: b */
    private static boolean f16918b = true;

    /* renamed from: c */
    private static volatile C7089p f16919c;

    /* renamed from: d */
    static final C7089p f16920d = new C7089p(true);

    /* renamed from: a */
    private final Map<C7090a, AbstractC7141y.C7146e<?, ?>> f16921a;

    /* compiled from: ExtensionRegistryLite.java */
    /* renamed from: com.google.protobuf.p$a */
    /* loaded from: classes2.dex */
    private static final class C7090a {

        /* renamed from: a */
        private final Object f16922a;

        /* renamed from: b */
        private final int f16923b;

        C7090a(Object obj, int i) {
            this.f16922a = obj;
            this.f16923b = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C7090a) {
                C7090a c7090a = (C7090a) obj;
                return this.f16922a == c7090a.f16922a && this.f16923b == c7090a.f16923b;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f16922a) * 65535) + this.f16923b;
        }
    }

    C7089p() {
        this.f16921a = new HashMap();
    }

    /* renamed from: b */
    public static C7089p m19769b() {
        C7089p c7089p = f16919c;
        if (c7089p == null) {
            synchronized (C7089p.class) {
                c7089p = f16919c;
                if (c7089p == null) {
                    c7089p = f16918b ? C7086o.m19793a() : f16920d;
                    f16919c = c7089p;
                }
            }
        }
        return c7089p;
    }

    /* renamed from: a */
    public <ContainingType extends InterfaceC7100r0> AbstractC7141y.C7146e<ContainingType, ?> m19770a(ContainingType containingtype, int i) {
        return (AbstractC7141y.C7146e<ContainingType, ?>) this.f16921a.get(new C7090a(containingtype, i));
    }

    C7089p(boolean z) {
        this.f16921a = Collections.emptyMap();
    }
}
