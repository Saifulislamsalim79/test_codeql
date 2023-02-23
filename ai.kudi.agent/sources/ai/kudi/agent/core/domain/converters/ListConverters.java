package ai.kudi.agent.core.domain.converters;

import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
/* compiled from: ListConverter.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/core/domain/converters/ListConverters;", "", "()V", "fromList", "", "items", "", "toList", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ListConverters {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0020 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String fromList(java.util.List r14) {
        /*
            r13 = this;
            java.lang.String r0 = "items"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r0)
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto Le
            java.lang.String r0 = ""
            return r0
        Le:
            java.util.Iterator r2 = r14.iterator()
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r3 = r2.next()
        L1c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r4 = r2.next()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r5 = r6
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            r7 = r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r10 = 44
            r9.append(r10)
            r9.append(r5)
            java.lang.String r3 = r9.toString()
            goto L1c
        L43:
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            r5 = r11
            return r5
        L48:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Empty collection can't be reduced."
            r12.<init>(r0)
            goto L50
        L50:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.converters.ListConverters.fromList(java.util.List):java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List toList(String str) {
        List $r3;
        Log_OC.getArray(str, "items");
        String[] $r2 = {","};
        $r3 = C13277t.m5383r0(str, $r2, false, 0, 6, null);
        return $r3;
    }
}
