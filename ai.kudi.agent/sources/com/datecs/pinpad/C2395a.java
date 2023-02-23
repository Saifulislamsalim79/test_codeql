package com.datecs.pinpad;
/* compiled from: DeviceInfo.java */
/* renamed from: com.datecs.pinpad.a */
/* loaded from: classes2.dex */
public class C2395a {

    /* renamed from: a */
    private String f6884a;

    /* renamed from: b */
    private String f6885b;

    /* renamed from: c */
    private String f6886c;

    /* renamed from: d */
    private String f6887d;

    /* renamed from: e */
    private String f6888e;

    /* renamed from: f */
    private String f6889f;

    private C2395a() {
    }

    /* renamed from: a */
    private static final String m33089a(byte[] bArr, int i, int i2) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + 1;
            int i6 = i + i4;
            cArr2[i3] = cArr[(bArr[i6] >> 4) & 15];
            i3 = i5 + 1;
            cArr2[i5] = cArr[(bArr[i6] >> 0) & 15];
        }
        return new String(cArr2, 0, i3);
    }

    /* renamed from: b */
    private static final String m33088b(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            char c = (char) (bArr[i + i3] & 255);
            if (c == 0) {
                break;
            }
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    private static final String m33087c(byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf("" + (bArr[i + 3] & 255) + "."));
        sb.append(bArr[i + 2] & 255);
        sb.append(".");
        return String.valueOf(String.valueOf(sb.toString()) + (bArr[i + 1] & 255) + ".") + (bArr[i] & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static C2395a m33078l(byte[] bArr) {
        C2395a c2395a = new C2395a();
        c2395a.f6884a = m33089a(bArr, 0, 16);
        m33088b(bArr, 16, 16);
        c2395a.f6885b = m33088b(bArr, 32, 16);
        c2395a.f6886c = m33088b(bArr, 48, 16);
        m33087c(bArr, 64);
        m33087c(bArr, 72);
        m33087c(bArr, 80);
        m33087c(bArr, 84);
        c2395a.f6887d = m33087c(bArr, 88);
        long j = ((bArr[95] & 255) << 24) + 0 + ((bArr[94] & 255) << 16) + ((bArr[93] & 255) << 8) + (bArr[92] & 255);
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        c2395a.f6888e = sb.toString();
        m33087c(bArr, 116);
        m33087c(bArr, 120);
        c2395a.f6889f = m33087c(bArr, 124);
        m33087c(bArr, 128);
        return c2395a;
    }

    /* renamed from: d */
    public String m33086d() {
        return this.f6886c;
    }

    /* renamed from: e */
    public String m33085e() {
        return this.f6887d;
    }

    /* renamed from: f */
    public String m33084f() {
        return this.f6884a;
    }

    /* renamed from: g */
    public String m33083g() {
        return this.f6888e;
    }

    /* renamed from: h */
    public int m33082h() {
        String lowerCase = this.f6885b.toLowerCase();
        if (lowerCase.startsWith("fw blupad")) {
            return 2;
        }
        if (lowerCase.startsWith("fw mped")) {
            return 1;
        }
        return lowerCase.startsWith("fw ppad") ? 3 : 0;
    }

    /* renamed from: i */
    public String m33081i() {
        return this.f6885b;
    }

    /* renamed from: j */
    public String m33080j() {
        return m33079k();
    }

    /* renamed from: k */
    public String m33079k() {
        return this.f6889f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DeviceInfo ");
        stringBuffer.append("[DeviceType=" + Integer.toHexString(m33082h()));
        stringBuffer.append(",ApplicationVersion=" + m33085e());
        stringBuffer.append(",ApplicationVersionName=" + m33086d());
        stringBuffer.append(",CPUSerialNumber=" + m33084f());
        stringBuffer.append(",DeviceSerialNumber=" + m33083g());
        stringBuffer.append(",KeyVersion=" + m33080j());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
