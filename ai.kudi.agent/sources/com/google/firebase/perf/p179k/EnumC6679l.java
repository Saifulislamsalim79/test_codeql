package com.google.firebase.perf.p179k;

import com.google.protobuf.C6997a0;
/* compiled from: SessionVerbosity.java */
/* renamed from: com.google.firebase.perf.k.l */
/* loaded from: classes2.dex */
public enum EnumC6679l implements C6997a0.InterfaceC7000c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    

    /* renamed from: c */
    private final int f16057c;

    /* compiled from: SessionVerbosity.java */
    /* renamed from: com.google.firebase.perf.k.l$a */
    /* loaded from: classes2.dex */
    private static final class C6680a implements C6997a0.InterfaceC7002e {

        /* renamed from: a */
        static final C6997a0.InterfaceC7002e f16058a = new C6680a();

        private C6680a() {
        }

        @Override // com.google.protobuf.C6997a0.InterfaceC7002e
        /* renamed from: a */
        public boolean mo20223a(int i) {
            return EnumC6679l.m21186a(i) != null;
        }
    }

    EnumC6679l(int i) {
        this.f16057c = i;
    }

    /* renamed from: a */
    public static EnumC6679l m21186a(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    /* renamed from: b */
    public static C6997a0.InterfaceC7002e m21185b() {
        return C6680a.f16058a;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7000c
    /* renamed from: d */
    public final int mo20225d() {
        return this.f16057c;
    }
}
