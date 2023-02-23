package com.google.firebase.inappmessaging;

import com.google.protobuf.C6997a0;
/* compiled from: DismissType.java */
/* renamed from: com.google.firebase.inappmessaging.l */
/* loaded from: classes2.dex */
public enum EnumC6361l implements C6997a0.InterfaceC7000c {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);
    

    /* renamed from: c */
    private final int f15398c;

    /* compiled from: DismissType.java */
    /* renamed from: com.google.firebase.inappmessaging.l$a */
    /* loaded from: classes2.dex */
    private static final class C6362a implements C6997a0.InterfaceC7002e {

        /* renamed from: a */
        static final C6997a0.InterfaceC7002e f15399a = new C6362a();

        private C6362a() {
        }

        @Override // com.google.protobuf.C6997a0.InterfaceC7002e
        /* renamed from: a */
        public boolean mo20223a(int i) {
            return EnumC6361l.m22207a(i) != null;
        }
    }

    EnumC6361l(int i) {
        this.f15398c = i;
    }

    /* renamed from: a */
    public static EnumC6361l m22207a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SWIPE;
                }
                return CLICK;
            }
            return AUTO;
        }
        return UNKNOWN_DISMISS_TYPE;
    }

    /* renamed from: b */
    public static C6997a0.InterfaceC7002e m22206b() {
        return C6362a.f15399a;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7000c
    /* renamed from: d */
    public final int mo20225d() {
        return this.f15398c;
    }
}
