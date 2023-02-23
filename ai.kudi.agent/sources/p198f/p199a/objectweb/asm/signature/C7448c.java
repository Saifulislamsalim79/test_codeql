package p198f.p199a.objectweb.asm.signature;

import java.util.List;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p198f.p199a.objectweb.asm.Label;
/* compiled from: HttpChecker.kt */
/* renamed from: f.a.objectweb.asm.signature.c */
/* loaded from: classes.dex */
public final class C7448c implements InterfaceC7447b {

    /* renamed from: c */
    private final String f17668c;

    /* renamed from: d */
    private final C7450g f17669d;

    public C7448c(String str, C7450g c7450g) {
        Log_OC.getArray(str, "apiUrl");
        Log_OC.getArray(c7450g, "dispatcher");
        this.f17668c = str;
        this.f17669d = c7450g;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C7448c(java.lang.String r1, p198f.p199a.objectweb.asm.signature.C7450g r2, int r3, kotlin.p483e0.p485d.DBUtils$1 r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L9
            f.a.objectweb.asm.signature.g r2 = new f.a.objectweb.asm.signature.g
            r2.<init>()
        L9:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p198f.p199a.objectweb.asm.signature.C7448c.<init>(java.lang.String, f.a.objectweb.asm.signature.g, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p198f.p199a.objectweb.asm.signature.InterfaceC7447b
    /* renamed from: a */
    public void mo18698a(Label label, InterfaceC7449e interfaceC7449e) {
        List $r7;
        Log_OC.getArray(label, "versionInfo");
        Log_OC.getArray(interfaceC7449e, "callback");
        int $i0 = label.m18704b();
        Integer $r4 = Integer.valueOf($i0);
        C13287o $r5 = C13664u.m4227a("versionCode", $r4);
        String $r6 = label.m18705a();
        C13287o $r52 = C13664u.m4227a("versionName", $r6);
        C13287o[] $r3 = {$r5, $r52};
        $r7 = C13726r.m3888h($r3);
        C7450g $r8 = this.f17669d;
        String $r62 = this.f17668c;
        $r8.m18694a($r62, $r7, interfaceC7449e);
    }
}
