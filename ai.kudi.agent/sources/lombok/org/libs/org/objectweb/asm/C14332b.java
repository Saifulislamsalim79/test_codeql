package lombok.org.libs.org.objectweb.asm;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.asm.AbstractC14328d;
import lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h;
/* renamed from: lombok.org.libs.org.objectweb.asm.b */
/* loaded from: classes.dex */
public final class C14332b {

    /* renamed from: a */
    public static final C14332b f31591a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14332b $r0 = new C14332b();
        f31591a = $r0;
    }

    private C14332b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m2105a(AbstractC14331h abstractC14331h) {
        Log_OC.getArray(abstractC14331h, "part");
        StringBuilder $r2 = new StringBuilder();
        $r2.append("Content-Length: ");
        long $l0 = abstractC14331h.mo2112a();
        $r2.append($l0);
        String $r3 = $r2.toString();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x002d */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.URL m2107a(java.lang.String r16, java.util.List r17) throws java.net.MalformedURLException {
        /*
            r15 = this;
            java.lang.String r1 = "url"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r0 = r16
            r2.<init>(r0)
            if (r17 == 0) goto L20
            r0 = r17
            boolean r3 = r0.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            r4 = 1
            if (r3 != r4) goto L20
            r4 = 63
            r2.append(r4)
        L20:
            if (r17 == 0) goto L7a
            r5 = 0
            r0 = r17
            java.util.Iterator r6 = r0.iterator()
        L29:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L7a
            java.lang.Object r7 = r6.next()
            int r8 = r5 + 1
            if (r5 < 0) goto L6f
            r10 = r7
            lombok.org.libs.org.objectweb.asm.asm.Label r10 = (lombok.org.libs.org.objectweb.asm.asm.Label) r10
            r9 = r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r16 = r9.m2120b()
            r0 = r16
            r11.append(r0)
            r4 = 61
            r11.append(r4)
            java.lang.String r16 = r9.m2121a()
            r0 = r16
            r11.append(r0)
            java.lang.String r16 = r11.toString()
            r0 = r16
            r2.append(r0)
            r0 = r17
            int r12 = kotlin.p557z.C13722p.m3937g(r0)
            if (r5 == r12) goto L6d
            r4 = 38
            r2.append(r4)
        L6d:
            r5 = r8
            goto L29
        L6f:
            kotlin.p557z.C13722p.m3923n()
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r1 = "Null throw statement replaced by Soot"
            r13.<init>(r1)
            throw r13
        L7a:
            java.lang.String r16 = r2.toString()
            java.net.URL r14 = new java.net.URL
            r0 = r16
            r14.<init>(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.libs.org.objectweb.asm.C14332b.m2107a(java.lang.String, java.util.List):java.net.URL");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final URL m2106a(String str, AbstractC14328d abstractC14328d) throws MalformedURLException {
        String $r1;
        Log_OC.getArray(str, "base");
        Log_OC.getArray(abstractC14328d, TransactionRequest.TYPE_REQUEST);
        boolean $z0 = abstractC14328d.m2115c();
        if ($z0) {
            StringBuilder $r3 = new StringBuilder();
            $r3.append(str);
            String $r12 = abstractC14328d.m2113f();
            $r3.append($r12);
            $r1 = $r3.toString();
        } else {
            $r1 = abstractC14328d.m2113f();
        }
        List $r4 = abstractC14328d.m2114e();
        URL $r5 = m2107a($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final String m2104d(String str) {
        Log_OC.getArray(str, "writerHost");
        String $r1 = "https://" + str;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final String m2103d(AbstractC14331h abstractC14331h) {
        Log_OC.getArray(abstractC14331h, "part");
        StringBuilder $r2 = new StringBuilder("Content-Disposition: form-data; ");
        $r2.append("name=\"");
        $r2.append(abstractC14331h.m2109d());
        $r2.append("\"");
        boolean $z0 = abstractC14331h.mo2110c();
        if ($z0) {
            $r2.append("; filename=\"");
            $r2.append(abstractC14331h.getValue());
            $r2.append("\"");
        }
        String $r3 = $r2.toString();
        Log_OC.loadImage($r3, "StringBuilder(CONTENT_DI…   }\n        }.toString()");
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m2102e(AbstractC14331h abstractC14331h) {
        Log_OC.getArray(abstractC14331h, "part");
        StringBuilder $r2 = new StringBuilder();
        $r2.append("Content-Type: multipart/form-data;");
        boolean $z0 = abstractC14331h.isEnabled();
        String $r3 = $z0 ? "; charset=utf-8" : "";
        $r2.append($r3);
        String $r32 = $r2.toString();
        return $r32;
    }
}
