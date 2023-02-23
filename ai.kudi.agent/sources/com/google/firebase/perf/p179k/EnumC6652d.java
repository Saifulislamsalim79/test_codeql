package com.google.firebase.perf.p179k;

import com.google.protobuf.C6997a0;
/* compiled from: ApplicationProcessState.java */
/* renamed from: com.google.firebase.perf.k.d */
/* loaded from: classes2.dex */
public enum EnumC6652d implements C6997a0.InterfaceC7000c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    

    /* renamed from: c */
    private final int f16027c;

    /* compiled from: ApplicationProcessState.java */
    /* renamed from: com.google.firebase.perf.k.d$a */
    /* loaded from: classes2.dex */
    private static final class C6653a implements C6997a0.InterfaceC7002e {

        /* renamed from: a */
        static final C6997a0.InterfaceC7002e f16028a = new C6653a();

        private C6653a() {
        }

        @Override // com.google.protobuf.C6997a0.InterfaceC7002e
        /* renamed from: a */
        public boolean mo20223a(int i) {
            return EnumC6652d.m21341a(i) != null;
        }
    }

    EnumC6652d(int i) {
        this.f16027c = i;
    }

    /* renamed from: a */
    public static EnumC6652d m21341a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return FOREGROUND_BACKGROUND;
                }
                return BACKGROUND;
            }
            return FOREGROUND;
        }
        return APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    /* renamed from: b */
    public static C6997a0.InterfaceC7002e m21340b() {
        return C6653a.f16028a;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7000c
    /* renamed from: d */
    public final int mo20225d() {
        return this.f16027c;
    }
}
