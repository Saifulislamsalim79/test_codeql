package com.paypad.models.messaging.nibss;

import android.content.Context;
import com.paypad.facade.PayPadManager;
/* loaded from: classes2.dex */
public class HSMClient {

    /* renamed from: Pd */
    static PayPadManager f17115Pd = null;
    public static final int UPDATE_PROGRESS = 2;
    public static Context mContext;

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[Catch: Exception -> 0x01aa, TryCatch #0 {Exception -> 0x01aa, blocks: (B:3:0x0019, B:10:0x0042, B:12:0x006a, B:13:0x0071, B:15:0x00d2, B:18:0x00da, B:19:0x0199), top: B:26:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void downloadKeys(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypad.models.messaging.nibss.HSMClient.downloadKeys(android.content.Context):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r4.equals("04") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void parseField62(java.lang.String r9) {
        /*
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
        L4:
            r1 = 2
            r2 = 5
            java.lang.String r3 = r9.substring(r1, r2)
            int r3 = java.lang.Integer.parseInt(r3)
            int r3 = r3 + r2
            java.lang.String r4 = r9.substring(r2, r3)
            r5 = 0
            r0[r5] = r4
            java.lang.String r4 = r9.substring(r5, r1)
            r6 = -1
            int r7 = r4.hashCode()
            r8 = 1693(0x69d, float:2.372E-42)
            if (r7 == r8) goto L6c
            switch(r7) {
                case 1538: goto L62;
                case 1539: goto L58;
                case 1540: goto L4f;
                case 1541: goto L45;
                case 1542: goto L3b;
                case 1543: goto L31;
                case 1544: goto L27;
                default: goto L26;
            }
        L26:
            goto L76
        L27:
            java.lang.String r1 = "08"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L76
            r1 = 6
            goto L77
        L31:
            java.lang.String r1 = "07"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L76
            r1 = 5
            goto L77
        L3b:
            java.lang.String r1 = "06"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L76
            r1 = 4
            goto L77
        L45:
            java.lang.String r1 = "05"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L76
            r1 = 3
            goto L77
        L4f:
            java.lang.String r2 = "04"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L76
            goto L77
        L58:
            java.lang.String r1 = "03"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L76
            r1 = 1
            goto L77
        L62:
            java.lang.String r1 = "02"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L76
            r1 = 0
            goto L77
        L6c:
            java.lang.String r1 = "52"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L76
            r1 = 7
            goto L77
        L76:
            r1 = -1
        L77:
            java.lang.String r2 = "Currency Code: "
            switch(r1) {
                case 1: goto Lbf;
                case 2: goto Lb0;
                case 3: goto La3;
                case 4: goto L96;
                case 5: goto L87;
                case 6: goto L82;
                case 7: goto L7d;
                default: goto L7c;
            }
        L7c:
            goto Lc3
        L7d:
            r1 = r0[r5]
            com.paypad.models.messaging.nibss.Globals.acceptorName = r1
            goto Lc3
        L82:
            r1 = r0[r5]
            com.paypad.models.messaging.nibss.Globals.merchantType = r1
            goto Lc3
        L87:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "Call Timeout: "
            r1.print(r2)
            java.io.PrintStream r1 = java.lang.System.out
            r2 = r0[r5]
            r1.println(r2)
            goto Lc3
        L96:
            java.io.PrintStream r1 = java.lang.System.out
            r1.print(r2)
            java.io.PrintStream r1 = java.lang.System.out
            r2 = r0[r5]
            r1.println(r2)
            goto Lc3
        La3:
            java.io.PrintStream r1 = java.lang.System.out
            r1.print(r2)
            java.io.PrintStream r1 = java.lang.System.out
            r2 = r0[r5]
            r1.println(r2)
            goto Lc3
        Lb0:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "Timeout: "
            r1.print(r2)
            java.io.PrintStream r1 = java.lang.System.out
            r2 = r0[r5]
            r1.println(r2)
            goto Lc3
        Lbf:
            r1 = r0[r5]
            com.paypad.models.messaging.nibss.Globals.acceptorID = r1
        Lc3:
            java.lang.String r9 = r9.substring(r3)
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypad.models.messaging.nibss.HSMClient.parseField62(java.lang.String):void");
    }
}
