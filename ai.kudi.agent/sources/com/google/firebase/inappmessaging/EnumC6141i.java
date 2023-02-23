package com.google.firebase.inappmessaging;

import com.google.protobuf.C6997a0;
/* compiled from: CommonTypesProto.java */
/* renamed from: com.google.firebase.inappmessaging.i */
/* loaded from: classes2.dex */
public enum EnumC6141i implements C6997a0.InterfaceC7000c {
    UNKNOWN_TRIGGER(0),
    APP_LAUNCH(1),
    ON_FOREGROUND(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: c */
    private final int f14981c;

    EnumC6141i(int i) {
        this.f14981c = i;
    }

    /* renamed from: a */
    public static EnumC6141i m22634a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return ON_FOREGROUND;
            }
            return APP_LAUNCH;
        }
        return UNKNOWN_TRIGGER;
    }

    @Override // com.google.protobuf.C6997a0.InterfaceC7000c
    /* renamed from: d */
    public final int mo20225d() {
        if (this != UNRECOGNIZED) {
            return this.f14981c;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
