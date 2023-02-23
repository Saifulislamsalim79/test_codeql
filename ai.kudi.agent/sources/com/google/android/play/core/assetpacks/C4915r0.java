package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.InterfaceC5005y;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.r0 */
/* loaded from: classes2.dex */
public final class C4915r0 {

    /* renamed from: f */
    private static final C4957a f12482f = new C4957a("ExtractChunkTaskHandler");

    /* renamed from: a */
    private final byte[] f12483a = new byte[8192];

    /* renamed from: b */
    private final C4840b0 f12484b;

    /* renamed from: c */
    private final InterfaceC5005y<InterfaceC4883j3> f12485c;

    /* renamed from: d */
    private final InterfaceC5005y<C4930v> f12486d;

    /* renamed from: e */
    private final C4939x0 f12487e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4915r0(C4840b0 c4840b0, InterfaceC5005y<InterfaceC4883j3> interfaceC5005y, InterfaceC5005y<C4930v> interfaceC5005y2, C4939x0 c4939x0) {
        this.f12484b = c4840b0;
        this.f12485c = interfaceC5005y;
        this.f12486d = interfaceC5005y2;
        this.f12487e = c4939x0;
    }

    /* renamed from: b */
    private final File m26028b(C4911q0 c4911q0) {
        File m26158c = this.f12484b.m26158c(c4911q0.f12414b, c4911q0.f12467c, c4911q0.f12468d, c4911q0.f12469e);
        if (!m26158c.exists()) {
            m26158c.mkdirs();
        }
        return m26158c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:5|6|(1:8)(2:112|113)|9|(2:11|(12:13|(1:(1:(2:17|(2:82|83))(2:84|85))(2:86|(10:88|(7:21|(4:22|(2:26|(1:35)(4:30|(1:32)|33|34))|36|(1:38)(1:62))|40|41|(1:43)|44|(2:46|(1:48)(2:49|(1:51)(3:52|(2:54|(1:56)(2:58|59))(1:61)|57))))|63|64|(2:76|77)|66|67|68|69|(2:71|72)(1:73))(2:89|90)))(2:91|(4:93|(4:94|(1:96)|97|(1:100)(1:106))|103|(1:105))(2:107|108))|19|(0)|63|64|(0)|66|67|68|69|(0)(0))(2:109|110))|111|(0)|63|64|(0)|66|67|68|69|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ef, code lost:
        com.google.android.play.core.assetpacks.C4915r0.f12482f.m25953g("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r23.f12471g), r23.f12469e, r23.f12414b);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0293 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017f A[Catch: all -> 0x032e, TryCatch #4 {IOException -> 0x033a, blocks: (B:6:0x002f, B:89:0x028a, B:9:0x0037, B:11:0x0040, B:13:0x0046, B:15:0x0054, B:19:0x005e, B:51:0x017f, B:52:0x0188, B:54:0x0192, B:56:0x0198, B:58:0x019e, B:60:0x01a4, B:62:0x01c8, B:63:0x01d4, B:64:0x01d8, B:65:0x01df, B:67:0x01e5, B:69:0x01eb, B:71:0x01f1, B:72:0x0201, B:74:0x0207, B:76:0x020d, B:77:0x0220, B:79:0x0226, B:80:0x0235, B:82:0x023b, B:88:0x027c, B:85:0x0263, B:86:0x026a, B:87:0x026b, B:22:0x0078, B:23:0x0081, B:24:0x0082, B:25:0x009b, B:26:0x009c, B:28:0x00c3, B:29:0x00cf, B:30:0x00d8, B:31:0x00d9, B:33:0x00f7, B:34:0x0109, B:36:0x011e, B:37:0x0123, B:42:0x0132, B:44:0x013b, B:45:0x0152, B:46:0x015b, B:47:0x015c, B:48:0x017b), top: B:121:0x002f }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m26029a(com.google.android.play.core.assetpacks.C4911q0 r23) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C4915r0.m26029a(com.google.android.play.core.assetpacks.q0):void");
    }
}
