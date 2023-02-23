package p198f.p199a.objectweb.asm.signature;

import android.util.Log;
import com.github.kittinunf.fuel.core.C2500u;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.InterfaceC2464q;
import com.github.kittinunf.result.AbstractC2512a;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13254d;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HttpChecker.kt */
/* renamed from: f.a.objectweb.asm.signature.c$a$a */
/* loaded from: classes.dex */
public final class c$a$a extends AbstractC11802m implements InterfaceC11772q<InterfaceC2464q, C2500u, AbstractC2512a<? extends byte[], ? extends FuelError>, C13666w> {
    final /* synthetic */ String messageId;
    final /* synthetic */ List<C13287o<String, Object>> origin;

    /* renamed from: u */
    final /* synthetic */ InterfaceC7449e f17670u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c$a$a(String str, List list, InterfaceC7449e interfaceC7449e) {
        super(3);
        this.messageId = str;
        this.origin = list;
        this.f17670u = interfaceC7449e;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m18697a(InterfaceC2464q interfaceC2464q, C2500u c2500u, AbstractC2512a abstractC2512a) {
        Log_OC.getArray(interfaceC2464q, "req");
        Log_OC.getArray(c2500u, "res");
        Log_OC.getArray(abstractC2512a, "result");
        String $r4 = this.messageId;
        Log.e("Url", $r4);
        List $r5 = this.origin;
        String $r42 = $r5.toString();
        Log.e("Query Param", $r42);
        String $r43 = interfaceC2464q.toString();
        Log.e("Req", $r43);
        String $r44 = c2500u.toString();
        Log.e("Res", $r44);
        boolean $z0 = abstractC2512a instanceof AbstractC2512a.C2514b;
        if ($z0) {
            InterfaceC7449e $r6 = this.f17670u;
            AbstractC2512a.C2514b $r7 = (AbstractC2512a.C2514b) abstractC2512a;
            Exception $r8 = $r7.m32695d();
            $r6.mo18695a($r8);
            return;
        }
        boolean $z02 = abstractC2512a instanceof AbstractC2512a.C2515c;
        if ($z02) {
            Object $r10 = abstractC2512a.mo32694a();
            byte[] $r11 = (byte[]) $r10;
            Charset $r12 = C13254d.f29413a;
            String $r45 = new String($r11, $r12);
            JSONObject $r9 = new JSONObject($r45);
            InterfaceC7449e $r62 = this.f17670u;
            boolean $z03 = $r9.getBoolean("forceUpdate");
            boolean $z1 = $r9.getBoolean("recommendUpdate");
            Label $r13 = new Label($z03, $z1);
            $r62.mo18696a($r13);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(InterfaceC2464q interfaceC2464q, C2500u c2500u, AbstractC2512a<? extends byte[], ? extends FuelError> abstractC2512a) {
        InterfaceC2464q $r4 = interfaceC2464q;
        C2500u $r5 = c2500u;
        AbstractC2512a<? extends byte[], ? extends FuelError> $r6 = abstractC2512a;
        m18697a($r4, $r5, $r6);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }
}
