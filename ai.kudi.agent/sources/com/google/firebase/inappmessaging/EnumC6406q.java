package com.google.firebase.inappmessaging;

import com.google.protobuf.C6997a0;
/* compiled from: FetchErrorReason.java */
/* renamed from: com.google.firebase.inappmessaging.q */
/* loaded from: classes2.dex */
public enum EnumC6406q implements C6997a0.InterfaceC7000c {
    UNSPECIFIED_FETCH_ERROR(0),
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    NETWORK_ERROR(3);
    

    /* renamed from: c */
    private final int f15482c;

    /* compiled from: FetchErrorReason.java */
    /* renamed from: com.google.firebase.inappmessaging.q$a */
    /* loaded from: classes2.dex */
    private static final class C6407a implements C6997a0.InterfaceC7002e {

        /* renamed from: a */
        static final C6997a0.InterfaceC7002e f15483a = new C6407a();

        private C6407a() {
        }

        @Override // com.google.protobuf.C6997a0.InterfaceC7002e
        /* renamed from: a */
        public boolean mo20223a(int i) {
            return EnumC6406q.m22101a(i) != null;
        }
    }

    EnumC6406q(int i) {
        this.f15482c = i;
    }

    /* renamed from: a */
    public static EnumC6406q m22101a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return NETWORK_ERROR;
                }
                return CLIENT_ERROR;
            }
            return SERVER_ERROR;
        }
        return UNSPECIFIED_FETCH_ERROR;
    }

    /* renamed from: b */
    public static C6997a0.InterfaceC7002e m22100b() {
        return C6407a.f15483a;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7000c
    /* renamed from: d */
    public final int mo20225d() {
        return this.f15482c;
    }
}
