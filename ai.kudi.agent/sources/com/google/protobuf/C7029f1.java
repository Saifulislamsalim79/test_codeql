package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RawMessageInfo.java */
/* renamed from: com.google.protobuf.f1 */
/* loaded from: classes2.dex */
public final class C7029f1 implements InterfaceC7091p0 {

    /* renamed from: a */
    private final InterfaceC7100r0 f16805a;

    /* renamed from: b */
    private final String f16806b;

    /* renamed from: c */
    private final Object[] f16807c;

    /* renamed from: d */
    private final int f16808d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7029f1(InterfaceC7100r0 interfaceC7100r0, String str, Object[] objArr) {
        String str2;
        Throwable e;
        char charAt;
        this.f16805a = interfaceC7100r0;
        this.f16806b = str;
        this.f16807c = objArr;
        int i = 1;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str3 = new String(charArray);
            try {
                try {
                    charAt = str3.charAt(0);
                    str = str3;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str3.length()];
                    str3.getChars(0, str3.length(), cArr, 0);
                    str2 = new String(cArr);
                    try {
                        charAt = str2.charAt(0);
                        str = str2;
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        e = e2;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    } catch (StringIndexOutOfBoundsException e3) {
                        e = e3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e4) {
                str2 = str3;
                e = e4;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (charAt < 55296) {
            this.f16808d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 < 55296) {
                this.f16808d = (charAt2 << i3) | i2;
                return;
            }
            i2 |= (charAt2 & 8191) << i3;
            i3 += 13;
            i = i4;
        }
    }

    @Override // com.google.protobuf.InterfaceC7091p0
    /* renamed from: a */
    public boolean mo19768a() {
        return (this.f16808d & 2) == 2;
    }

    @Override // com.google.protobuf.InterfaceC7091p0
    /* renamed from: b */
    public InterfaceC7100r0 mo19767b() {
        return this.f16805a;
    }

    @Override // com.google.protobuf.InterfaceC7091p0
    /* renamed from: c */
    public EnumC7013c1 mo19766c() {
        return (this.f16808d & 1) == 1 ? EnumC7013c1.PROTO2 : EnumC7013c1.PROTO3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] m20127d() {
        return this.f16807c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m20126e() {
        return this.f16806b;
    }
}
