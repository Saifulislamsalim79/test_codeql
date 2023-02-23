package io.intercom.android.sdk.blocks.logic;
/* loaded from: classes.dex */
public class TextSplittingStrategy {
    private static final String NEW_LINE = "\n";
    private static final String NEW_LINE_REPLACEMENT = "<br>";
    private static final String NEW_PARAGRAPH_DELIMETER = "\n\n";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List apply(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r1 = "\n\n"
            java.lang.String[] r0 = r9.split(r1)
            r2 = 0
        L7:
            int r3 = r0.length
            if (r2 >= r3) goto L19
            r9 = r0[r2]
            java.lang.String r1 = "\n"
            java.lang.String r4 = "<br>"
            java.lang.String r9 = r9.replace(r1, r4)
            r0[r2] = r9
            int r2 = r2 + 1
            goto L7
        L19:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r6 = java.util.Arrays.asList(r0)
            r5.<init>(r6)
            java.lang.String r1 = ""
            java.util.Set r7 = java.util.Collections.singleton(r1)
            r5.removeAll(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.logic.TextSplittingStrategy.apply(java.lang.String):java.util.List");
    }
}
