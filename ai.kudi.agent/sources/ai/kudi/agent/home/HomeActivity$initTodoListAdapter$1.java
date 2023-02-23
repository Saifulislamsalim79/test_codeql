package ai.kudi.agent.home;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.postRegistrationSetUp.PostRegistrationActivity;
import ai.kudi.agent.postRegistrationSetUp.TodoConstantsKt;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "todo", "", "<anonymous parameter 1>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HomeActivity$initTodoListAdapter$1 extends AbstractC11802m implements InterfaceC11771p<String, Boolean, C13666w> {
    final /* synthetic */ HomeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeActivity.kt */
    @Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.home.HomeActivity$initTodoListAdapter$1$1 */
    /* loaded from: classes.dex */
    public static final class C02381 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
        public static final C02381 INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            C02381 $r0 = new C02381();
            INSTANCE = $r0;
        }

        C02381() {
            super(1);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Bundle bundle) {
            Bundle $r2 = bundle;
            invoke2($r2);
            C13666w r3 = C13666w.f30112a;
            return r3;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Bundle bundle) {
            Log_OC.getArray(bundle, "$this$launchActivity");
            bundle.putString(WalletTopUpActivity.EXTRA_MODE, WalletTopUpActivity.MODE_WALLET_TOPUP);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeActivity.kt */
    @Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.home.HomeActivity$initTodoListAdapter$1$2 */
    /* loaded from: classes.dex */
    public static final class C02392 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
        public static final C02392 INSTANCE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            C02392 $r0 = new C02392();
            INSTANCE = $r0;
        }

        C02392() {
            super(1);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Bundle bundle) {
            Bundle $r2 = bundle;
            invoke2($r2);
            C13666w r3 = C13666w.f30112a;
            return r3;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Bundle bundle) {
            Log_OC.getArray(bundle, "$this$launchActivity");
            bundle.putString("PARAM_SETTINGS", TodoConstantsKt.CASH_INSURANCE_TODO);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity$initTodoListAdapter$1(HomeActivity homeActivity) {
        super(2);
        this.this$0 = homeActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(String str, Boolean bool) {
        String $r3 = str;
        Boolean $r4 = bool;
        boolean $z0 = $r4.booleanValue();
        invoke($r3, $z0);
        C13666w r5 = C13666w.f30112a;
        return r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(String str, boolean z) {
        Log_OC.getArray(str, "todo");
        boolean $z0 = Log_OC.append(str, TodoConstantsKt.FUND_WALLET_TODO);
        if ($z0) {
            HomeActivity $r2 = this.this$0;
            C02381 $r3 = C02381.INSTANCE;
            Context r9 = (Context) $r2;
            ContextExtKt.launchActivity$default(r9, false, WalletTopUpActivity.class, (InterfaceC11767l) $r3, 1, (Object) null);
            return;
        }
        boolean $z02 = Log_OC.append(str, TodoConstantsKt.CASH_INSURANCE_TODO);
        if ($z02) {
            HomeActivity $r22 = this.this$0;
            C02392 $r4 = C02392.INSTANCE;
            Context r92 = (Context) $r22;
            ContextExtKt.launchActivity$default(r92, false, SettingsActivity.class, (InterfaceC11767l) $r4, 1, (Object) null);
            return;
        }
        HomeActivity $r23 = this.this$0;
        HomeActivity $r6 = this.this$0;
        Context r93 = (Context) $r6;
        Intent r8 = new Intent(r93, PostRegistrationActivity.class);
        r8.putExtra(TodoConstantsKt.TODO_SELECTED, str);
        C13666w c13666w = C13666w.f30112a;
        ComponentActivity r10 = (ComponentActivity) $r23;
        r10.startActivityForResult(r8, 1000);
    }
}
