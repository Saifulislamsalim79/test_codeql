package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x5 */
/* loaded from: classes2.dex */
public final class C3624x5 extends AbstractC3255j2<C3316l9> {
    public C3624x5() {
        super(C3316l9.class, new C3572v5(InterfaceC3439q2.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ C3174g2 m30059k(int i, int i2, EnumC3235i9 enumC3235i9, int i3) {
        C3368n9 m30506A = C3394o9.m30506A();
        C3446q9 m30387B = C3472r9.m30387B();
        m30387B.m30442h(enumC3235i9);
        m30387B.m30441i(i2);
        m30506A.m30572i(m30387B.m31126e());
        m30506A.m30573h(i);
        return new C3174g2(m30506A.m31126e(), i3);
    }

    /* renamed from: l */
    public static final void m30058l(C3316l9 c3316l9) throws GeneralSecurityException {
        C3657yc.m29960c(c3316l9.m30777z(), 0);
        if (c3316l9.m30781F().mo31014f() >= 16) {
            m30057m(c3316l9.m30782E());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static void m30057m(C3472r9 c3472r9) throws GeneralSecurityException {
        if (c3472r9.m30382z() >= 10) {
            EnumC3235i9 enumC3235i9 = EnumC3235i9.UNKNOWN_HASH;
            int ordinal = c3472r9.m30388A().ordinal();
            if (ordinal == 1) {
                if (c3472r9.m30382z() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (ordinal == 2) {
                if (c3472r9.m30382z() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (ordinal == 3) {
                if (c3472r9.m30382z() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (ordinal == 4) {
                if (c3472r9.m30382z() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (ordinal == 5) {
                if (c3472r9.m30382z() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else {
                throw new GeneralSecurityException("unknown hash type");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3316l9> mo29976a() {
        return new C3598w5(this, C3394o9.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3316l9 mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3316l9.m30783D(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3316l9 c3316l9) throws GeneralSecurityException {
        m30058l(c3316l9);
    }
}
