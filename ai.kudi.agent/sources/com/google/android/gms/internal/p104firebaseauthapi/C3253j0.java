package com.google.android.gms.internal.p104firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j0 */
/* loaded from: classes2.dex */
public final class C3253j0 implements InterfaceC3566v {

    /* renamed from: a */
    private final InterfaceC3644y f8611a;

    /* renamed from: b */
    private final String f8612b;

    /* renamed from: c */
    private final Object[] f8613c;

    /* renamed from: d */
    private final int f8614d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3253j0(InterfaceC3644y interfaceC3644y, String str, Object[] objArr) {
        char charAt;
        this.f8611a = interfaceC3644y;
        this.f8612b = str;
        this.f8613c = objArr;
        int i = 1;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    charAt = str2.charAt(0);
                    str = str2;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str2.length()];
                    str2.getChars(0, str2.length(), cArr, 0);
                    String str3 = new String(cArr);
                    try {
                        charAt = str3.charAt(0);
                        str = str3;
                    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
                        e = e;
                        str2 = str3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            } catch (StringIndexOutOfBoundsException e3) {
                e = e3;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (charAt < 55296) {
            this.f8614d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 < 55296) {
                this.f8614d = (charAt2 << i3) | i2;
                return;
            }
            i2 |= (charAt2 & 8191) << i3;
            i3 += 13;
            i = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m30940a() {
        return this.f8612b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] m30939b() {
        return this.f8613c;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3566v
    /* renamed from: c */
    public final int mo30103c() {
        return (this.f8614d & 1) == 1 ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3566v
    public final InterfaceC3644y zza() {
        return this.f8611a;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3566v
    public final boolean zzb() {
        return (this.f8614d & 2) == 2;
    }
}
