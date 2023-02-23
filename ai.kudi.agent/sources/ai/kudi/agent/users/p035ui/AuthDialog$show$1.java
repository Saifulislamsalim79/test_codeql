package ai.kudi.agent.users.p035ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.network.exceptions.NotFoundException;
import ai.kudi.agent.users.domain.dto.User;
import ai.kudi.agent.users.domain.usecases.Authorize;
import ai.kudi.agent.users.domain.usecases.AuthorizeOps;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.p035ui.AuthDialog;
import android.content.SharedPreferences;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: AuthDialog.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "password", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.users.ui.AuthDialog$show$1 */
/* loaded from: classes.dex */
final class AuthDialog$show$1 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $deviceName;
    final /* synthetic */ C11812w<User> $user;
    final /* synthetic */ AuthDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthDialog$show$1(AuthDialog authDialog, C11812w c11812w, String str, String str2) {
        super(1);
        this.this$0 = authDialog;
        this.$user = c11812w;
        this.$deviceId = str;
        this.$deviceName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m41468invoke$lambda0(C11812w c11812w, AuthDialog authDialog, String str, String str2, String str3, ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(authDialog, "this$0");
        Log_OC.getArray(str, "$password");
        Log_OC.getArray(str2, "$deviceId");
        Log_OC.getArray(str3, "$deviceName");
        Log_OC.getArray(user, "it");
        c11812w.f26499c = user;
        SharedPreferences $r6 = authDialog.getSharedPreferences();
        String $r7 = $r6.getString(ManageDevice.IMEID_PARAM, "");
        Authorize $r8 = authDialog.authorize;
        String $r10 = user.getPhoneNumber();
        Log_OC.loadImage($r10, "it.phoneNumber");
        boolean $z0 = user.isLoggedIn();
        Authorize.Input $r9 = new Authorize.Input($r10, str, str2, str3, $r7, $z0);
        AbstractC11688p $r11 = $r8.execute($r9);
        return $r11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke$lambda-1  reason: not valid java name */
    public static final void m41469invoke$lambda1(AuthDialog authDialog, C11812w c11812w, String str, AuthorizeOps authorizeOps) {
        Log_OC.getArray(authDialog, "this$0");
        Log_OC.getArray(c11812w, "$user");
        Log_OC.getArray(str, "$password");
        AuthDialog.Dialog $r4 = authDialog.dialog;
        if ($r4 != null) {
            $r4.hideLoading();
        }
        boolean $z0 = authorizeOps.getUserExists();
        if (!$z0) {
            Throwable $r5 = authorizeOps.getException();
            boolean $z02 = $r5 instanceof NotFoundException;
            if (!$z02) {
                Throwable $r52 = authorizeOps.getException();
                if ($r52 != null) {
                    Throwable $r53 = authorizeOps.getException();
                    authDialog.handleError($r53);
                    return;
                }
                return;
            }
        }
        Analytics $r6 = authDialog.analytics;
        Object $r7 = c11812w.f26499c;
        ai.kudi.agent.users.domain.package_1.User $r8 = (ai.kudi.agent.users.domain.package_1.User) $r7;
        $r6.onTransactionAuthEvent($r8);
        authDialog.setAuthorized(true);
        InterfaceC11767l $r9 = authDialog.getOnSuccessfulAuth();
        if ($r9 == null) {
            return;
        }
        $r9.invoke(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2  reason: not valid java name */
    public static final void m41470invoke$lambda2(AuthDialog authDialog, Throwable th) {
        Log_OC.getArray(authDialog, "this$0");
        authDialog.handleError(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(String str) {
        String $r2 = str;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final String str) {
        Log_OC.getArray(str, "password");
        AuthDialog $r5 = this.this$0;
        AuthDialog.Dialog $r6 = $r5.dialog;
        if ($r6 != null) {
            $r6.showLoading();
        }
        AuthDialog $r52 = this.this$0;
        FetchCurrentUser $r7 = $r52.currentUser;
        AbstractC11696w $r8 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
        final C11812w $r9 = this.$user;
        final AuthDialog $r53 = this.this$0;
        final String $r1 = this.$deviceId;
        final String $r2 = this.$deviceName;
        AbstractC11688p $r10 = $r8.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.users.ui.Switch
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                C11812w $r12 = C11812w.this;
                AuthDialog $r22 = $r53;
                String $r3 = str;
                String $r4 = $r1;
                String $r54 = $r2;
                ai.kudi.agent.users.domain.package_1.User $r82 = (ai.kudi.agent.users.domain.package_1.User) obj;
                InterfaceC11692s $r62 = AuthDialog$show$1.m41468invoke$lambda0($r12, $r22, $r3, $r4, $r54, $r82);
                return $r62;
            }
        });
        final AuthDialog $r54 = this.this$0;
        final C11812w $r92 = this.$user;
        Object object = new Object() { // from class: ai.kudi.agent.users.ui.NumberPicker
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AuthDialog $r12 = AuthDialog.this;
                C11812w $r22 = $r92;
                String $r3 = str;
                AuthorizeOps $r55 = (AuthorizeOps) obj;
                AuthDialog$show$1.m41469invoke$lambda1($r12, $r22, $r3, $r55);
            }
        };
        final AuthDialog $r55 = this.this$0;
        $r10.e0(object, new Object() { // from class: ai.kudi.agent.users.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                AuthDialog $r12 = AuthDialog.this;
                Throwable $r3 = (Throwable) obj;
                AuthDialog$show$1.m41470invoke$lambda2($r12, $r3);
            }
        });
    }
}
