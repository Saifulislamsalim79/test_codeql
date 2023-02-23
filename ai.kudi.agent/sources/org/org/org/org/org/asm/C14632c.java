package org.org.org.org.org.asm;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import org.org.org.org.org.asm.commons.JSONObject;
/* renamed from: org.org.org.org.org.asm.c */
/* loaded from: classes.dex */
public final class C14632c {

    /* renamed from: c */
    public final Map<String, e.a.a.a.c.i.e.b> f32493c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14632c() {
        LinkedHashMap $r1 = new LinkedHashMap();
        this.f32493c = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ void m978a(C14632c c14632c, List $r2, List $r3, InterfaceC11767l interfaceC11767l, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r2 = C13726r.m3891e();
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r3 = C13726r.m3891e();
        }
        c14632c.m979a($r2, $r3, interfaceC11767l);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m980a(java.util.List r7) {
        /*
            r6 = this;
            java.lang.String r0 = "handlers"
            kotlin.p483e0.p485d.Log_OC.getArray(r7, r0)
            java.util.Iterator r1 = r7.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r3 = r1.next()
            r5 = r3
            org.org.org.org.org.asm.g r5 = (org.org.org.org.org.asm.InterfaceC14636g) r5
            r4 = r5
            r6.m977a(r4)
            goto L9
        L1b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.asm.C14632c.m980a(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0047 */
    /* JADX WARN: Incorrect condition in loop: B:16:0x0081 */
    /* JADX WARN: Incorrect condition in loop: B:22:0x00a9 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0024 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m979a(java.util.List r19, java.util.List r20, kotlin.p483e0.p484c.InterfaceC11767l r21) {
        /*
            r18 = this;
            java.lang.String r1 = "prioritize"
            r0 = r19
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.lang.String r1 = "postpone"
            r0 = r20
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.lang.String r1 = "toCall"
            r0 = r21
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = r19
            java.util.Iterator r3 = r0.iterator()
        L20:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r5 = r3.next()
            r7 = r5
            java.lang.Class r7 = (java.lang.Class) r7
            r6 = r7
            java.lang.String r8 = r6.getCanonicalName()
            if (r8 == 0) goto L20
            r2.add(r8)
            goto L20
        L38:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0 = r20
            java.util.Iterator r3 = r0.iterator()
        L43:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r5 = r3.next()
            r10 = r5
            java.lang.Class r10 = (java.lang.Class) r10
            r6 = r10
            java.lang.String r8 = r6.getCanonicalName()
            if (r8 == 0) goto L43
            r9.add(r8)
            goto L43
        L5b:
            r0 = r18
            java.util.Map<java.lang.String, e.a.a.a.c.i.e.b> r11 = r0.f32493c
            java.util.Set r12 = r11.keySet()
            java.util.List r19 = kotlin.p557z.C13722p.m3970D0(r12)
            org.org.org.org.org.asm.IdListQueryResult$2 r13 = new org.org.org.org.org.asm.IdListQueryResult$2
            r13.<init>()
            r0 = r19
            java.util.List r19 = kotlin.p557z.C13722p.m3911u0(r0, r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = r19
            java.util.Iterator r3 = r0.iterator()
        L7d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La1
            java.lang.Object r5 = r3.next()
            r14 = r5
            java.lang.String r14 = (java.lang.String) r14
            r8 = r14
            r0 = r18
            java.util.Map<java.lang.String, e.a.a.a.c.i.e.b> r11 = r0.f32493c
            java.lang.Object r5 = r11.get(r8)
            r16 = r5
            org.org.org.org.org.asm.commons.JSONObject r16 = (org.org.org.org.org.asm.commons.JSONObject) r16
            r15 = r16
            if (r15 == 0) goto L7d
            r2.add(r15)
            goto L7d
        La1:
            java.util.Iterator r3 = r2.iterator()
        La5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lbb
            java.lang.Object r5 = r3.next()
            r17 = r5
            org.org.org.org.org.asm.commons.JSONObject r17 = (org.org.org.org.org.asm.commons.JSONObject) r17
            r15 = r17
            r0 = r21
            r0.invoke(r15)
            goto La5
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.asm.C14632c.m979a(java.util.List, java.util.List, kotlin.e0.c.l):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m977a(InterfaceC14636g interfaceC14636g) {
        Log_OC.getArray(interfaceC14636g, "handler");
        Map $r2 = this.f32493c;
        String $r3 = interfaceC14636g.mo812e();
        JSONObject $r4 = interfaceC14636g.mo814c();
        $r2.put($r3, $r4);
    }
}
