package com.google.firebase.inappmessaging;

import com.google.protobuf.C6997a0;
/* compiled from: EventType.java */
/* renamed from: com.google.firebase.inappmessaging.m */
/* loaded from: classes2.dex */
public enum EnumC6363m implements C6997a0.InterfaceC7000c {
    UNKNOWN_EVENT_TYPE(0),
    IMPRESSION_EVENT_TYPE(1),
    CLICK_EVENT_TYPE(2);
    

    /* renamed from: c */
    private final int f15404c;

    /* compiled from: EventType.java */
    /* renamed from: com.google.firebase.inappmessaging.m$a */
    /* loaded from: classes2.dex */
    private static final class C6364a implements C6997a0.InterfaceC7002e {

        /* renamed from: a */
        static final C6997a0.InterfaceC7002e f15405a = new C6364a();

        private C6364a() {
        }

        @Override // com.google.protobuf.C6997a0.InterfaceC7002e
        /* renamed from: a */
        public boolean mo20223a(int i) {
            return EnumC6363m.m22205a(i) != null;
        }
    }

    EnumC6363m(int i) {
        this.f15404c = i;
    }

    /* renamed from: a */
    public static EnumC6363m m22205a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CLICK_EVENT_TYPE;
            }
            return IMPRESSION_EVENT_TYPE;
        }
        return UNKNOWN_EVENT_TYPE;
    }

    /* renamed from: b */
    public static C6997a0.InterfaceC7002e m22204b() {
        return C6364a.f15405a;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7000c
    /* renamed from: d */
    public final int mo20225d() {
        return this.f15404c;
    }
}
