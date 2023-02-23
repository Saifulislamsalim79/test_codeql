package ai.kudi.agent.login.p011ui;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.login.presenters.LoginPresenter;
import android.content.Context;
import android.location.Location;
import kotlin.C13287o;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginActivity.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.LoginActivity$attemptLogin$1 */
/* loaded from: classes.dex */
public final class LoginActivity$attemptLogin$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $deviceName;
    final /* synthetic */ String $kudiPin;
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$attemptLogin$1(LoginActivity loginActivity, String str, String str2, String str3) {
        super(1);
        this.this$0 = loginActivity;
        this.$kudiPin = str;
        this.$deviceName = str2;
        this.$deviceId = str3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Location location) {
        Location $r2 = location;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Location location) {
        if (location != null) {
            LoginActivity $r6 = this.this$0;
            LoginPresenter $r8 = (LoginPresenter) $r6.getPresenter();
            LoginActivity $r62 = this.this$0;
            String $r9 = $r62.getPhoneNumber();
            String $r1 = this.$kudiPin;
            String $r2 = this.$deviceName;
            String $r3 = this.$deviceId;
            LoginActivity $r63 = this.this$0;
            boolean $z0 = ContextExtKt.checkPlayServices((Context) $r63);
            LoginActivity $r64 = this.this$0;
            String $r10 = $r64.imeiId;
            String $r11 = $r10;
            if ($r10 == null) {
                $r11 = "";
            }
            double $d0 = location.getLatitude();
            Double $r12 = Double.valueOf($d0);
            double $d02 = location.getLongitude();
            Double $r13 = Double.valueOf($d02);
            C13287o r14 = new C13287o($r12, $r13);
            $r8.performLogin($r9, $r1, $r2, $r3, $z0, $r11, r14);
        }
    }
}
