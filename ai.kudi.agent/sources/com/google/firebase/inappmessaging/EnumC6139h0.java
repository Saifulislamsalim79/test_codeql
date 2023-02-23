package com.google.firebase.inappmessaging;

import com.google.protobuf.C6997a0;
/* compiled from: RenderErrorReason.java */
/* renamed from: com.google.firebase.inappmessaging.h0 */
/* loaded from: classes2.dex */
public enum EnumC6139h0 implements C6997a0.InterfaceC7000c {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);
    

    /* renamed from: c */
    private final int f14974c;

    /* compiled from: RenderErrorReason.java */
    /* renamed from: com.google.firebase.inappmessaging.h0$a */
    /* loaded from: classes2.dex */
    private static final class C6140a implements C6997a0.InterfaceC7002e {

        /* renamed from: a */
        static final C6997a0.InterfaceC7002e f14975a = new C6140a();

        private C6140a() {
        }

        @Override // com.google.protobuf.C6997a0.InterfaceC7002e
        /* renamed from: a */
        public boolean mo20223a(int i) {
            return EnumC6139h0.m22636a(i) != null;
        }
    }

    EnumC6139h0(int i) {
        this.f14974c = i;
    }

    /* renamed from: a */
    public static EnumC6139h0 m22636a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return IMAGE_UNSUPPORTED_FORMAT;
                }
                return IMAGE_DISPLAY_ERROR;
            }
            return IMAGE_FETCH_ERROR;
        }
        return UNSPECIFIED_RENDER_ERROR;
    }

    /* renamed from: b */
    public static C6997a0.InterfaceC7002e m22635b() {
        return C6140a.f14975a;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7000c
    /* renamed from: d */
    public final int mo20225d() {
        return this.f14974c;
    }
}
