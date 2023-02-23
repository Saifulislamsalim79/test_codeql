package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e2 */
/* loaded from: classes2.dex */
public final class C3120e2 {

    /* renamed from: a */
    private final C3020aa f8415a;

    private C3120e2(C3020aa c3020aa) {
        this.f8415a = c3020aa;
    }

    /* renamed from: e */
    public static C3120e2 m31211e(String str, byte[] bArr, int i) {
        EnumC3048bb enumC3048bb;
        C3680z9 m31426z = C3020aa.m31426z();
        m31426z.m29895i(str);
        m31426z.m29894j(AbstractC3223ho.m31022J(bArr));
        EnumC3048bb enumC3048bb2 = EnumC3048bb.UNKNOWN_PREFIX;
        int i2 = i - 1;
        if (i2 == 0) {
            enumC3048bb = EnumC3048bb.TINK;
        } else if (i2 != 1) {
            enumC3048bb = i2 != 2 ? EnumC3048bb.CRUNCHY : EnumC3048bb.RAW;
        } else {
            enumC3048bb = EnumC3048bb.LEGACY;
        }
        m31426z.m29896h(enumC3048bb);
        return new C3120e2(m31426z.m31126e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3020aa m31215a() {
        return this.f8415a;
    }

    /* renamed from: b */
    public final String m31214b() {
        return this.f8415a.m31430E();
    }

    /* renamed from: c */
    public final byte[] m31213c() {
        return this.f8415a.m31431D().m31017Z();
    }

    /* renamed from: d */
    public final int m31212d() {
        EnumC3048bb m31432C = this.f8415a.m31432C();
        EnumC3048bb enumC3048bb = EnumC3048bb.UNKNOWN_PREFIX;
        int ordinal = m31432C.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
