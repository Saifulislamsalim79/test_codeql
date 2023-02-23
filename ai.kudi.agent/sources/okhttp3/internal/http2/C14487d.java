package okhttp3.internal.http2;

import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import java.io.IOException;
import p565l.p566g0.C14148c;
import p576m.C14347f;
/* compiled from: Http2.java */
/* renamed from: okhttp3.internal.http2.d */
/* loaded from: classes3.dex */
public final class C14487d {

    /* renamed from: a */
    static final C14347f f31932a = C14347f.m2035m("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f31933b = {IssueTypeFragmentNew.DATA, "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    static final String[] f31934c = new String[64];

    /* renamed from: d */
    static final String[] f31935d = new String[256];

    static {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = f31935d;
            if (i3 >= strArr.length) {
                break;
            }
            strArr[i3] = C14148c.m2790r("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = f31934c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i4 = 0; i4 < 1; i4++) {
            f31934c[iArr[i4] | 8] = f31934c[i] + "|PADDED";
        }
        String[] strArr3 = f31934c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                int i9 = i8 | i6;
                f31934c[i9] = f31934c[i8] + '|' + f31934c[i6];
                f31934c[i9 | 8] = f31934c[i8] + '|' + f31934c[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr4 = f31934c;
            if (i2 >= strArr4.length) {
                return;
            }
            if (strArr4[i2] == null) {
                strArr4[i2] = f31935d[i2];
            }
            i2++;
        }
    }

    private C14487d() {
    }

    /* renamed from: a */
    static String m1531a(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (b != 2 && b != 3) {
            if (b == 4 || b == 6) {
                return b2 == 1 ? "ACK" : f31935d[b2];
            } else if (b != 7 && b != 8) {
                String[] strArr = f31934c;
                String str = b2 < strArr.length ? strArr[b2] : f31935d[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f31935d[b2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m1530b(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f31933b;
        String m2790r = b < strArr.length ? strArr[b] : C14148c.m2790r("0x%02x", Byte.valueOf(b));
        String m1531a = m1531a(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = m2790r;
        objArr[4] = m1531a;
        return C14148c.m2790r("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static IllegalArgumentException m1529c(String str, Object... objArr) {
        throw new IllegalArgumentException(C14148c.m2790r(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static IOException m1528d(String str, Object... objArr) throws IOException {
        throw new IOException(C14148c.m2790r(str, objArr));
    }
}
