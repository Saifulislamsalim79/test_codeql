package io.intercom.android.sdk.conversation;

import io.intercom.android.sdk.models.Conversation;
/* loaded from: classes.dex */
class ProfileExpansionLogic {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean hasNoUserReplies(io.intercom.android.sdk.models.Conversation r8) {
        /*
            java.util.List r0 = r8.getParts()
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L28
            java.lang.Object r4 = r1.next()
            r6 = r4
            io.intercom.android.sdk.models.Part r6 = (io.intercom.android.sdk.models.Part) r6
            r5 = r6
            boolean r3 = r5.isAdmin()
            if (r3 == 0) goto L1e
            r2 = 1
        L1e:
            if (r2 == 0) goto L9
            boolean r3 = r5.isAdmin()
            if (r3 != 0) goto L9
            r7 = 0
            return r7
        L28:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ProfileExpansionLogic.hasNoUserReplies(io.intercom.android.sdk.models.Conversation):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean hasOnlyUserParts(io.intercom.android.sdk.models.Conversation r7) {
        /*
            java.util.List r0 = r7.getParts()
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r3 = r1.next()
            r5 = r3
            io.intercom.android.sdk.models.Part r5 = (io.intercom.android.sdk.models.Part) r5
            r4 = r5
            boolean r2 = r4.isAdmin()
            if (r2 == 0) goto L8
            r6 = 0
            return r6
        L1e:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ProfileExpansionLogic.hasOnlyUserParts(io.intercom.android.sdk.models.Conversation):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean shouldExpandProfile(Conversation conversation) {
        boolean $z0 = hasOnlyUserParts(conversation);
        if ($z0) {
            return true;
        }
        boolean $z02 = hasNoUserReplies(conversation);
        return $z02;
    }
}
