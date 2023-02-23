package ai.kudi.agent.users.p035ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.custom.views.SelectView;
import ai.kudi.agent.databinding.ViewUsersKcashTopupBinding;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.adapter.KCashBanksAdapter;
import ai.kudi.agent.users.domain.package_1.KCashInstruction;
import ai.kudi.agent.users.viewmodels.KCashTopupViewModel;
import ai.kudi.agent.users.viewmodels.data.KCashTopupViewData;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.core.app.C1291a;
import androidx.core.content.C1335a;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13722p;
import p201g.p270x.InterfaceC8209a;
/* compiled from: KCashTopupActivity.kt */
@Metadata(m10422d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u0000 ;2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0005J\u0016\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160#H\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0003H\u0014J\b\u0010&\u001a\u00020\u0002H\u0014J\b\u0010'\u001a\u00020!H\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0014J\u0012\u0010*\u001a\u00020!2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J-\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020\u00102\u000e\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u000205042\u0006\u00106\u001a\u000207H\u0016¢\u0006\u0002\u00108J\b\u00109\u001a\u00020!H\u0002J\b\u0010:\u001a\u00020!H\u0002R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006<"}, m10421d2 = {"Lai/kudi/agent/users/ui/KCashTopupActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/users/viewmodels/KCashTopupViewModel;", "Lai/kudi/agent/users/viewmodels/data/KCashTopupViewData;", "Lai/kudi/agent/databinding/ViewUsersKcashTopupBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ViewUsersKcashTopupBinding;", "adapter", "Lai/kudi/agent/users/adapter/KCashBanksAdapter;", "getAdapter", "()Lai/kudi/agent/users/adapter/KCashBanksAdapter;", "setAdapter", "(Lai/kudi/agent/users/adapter/KCashBanksAdapter;)V", TransactionField.AMOUNT, "", "getAmount", "()I", "setAmount", "(I)V", "selectedInstruction", "Lai/kudi/agent/users/domain/dto/KCashInstruction;", "getSelectedInstruction", "()Lai/kudi/agent/users/domain/dto/KCashInstruction;", "setSelectedInstruction", "(Lai/kudi/agent/users/domain/dto/KCashInstruction;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/users/viewmodels/KCashTopupViewModel;", "setViewModel", "(Lai/kudi/agent/users/viewmodels/KCashTopupViewModel;)V", "applyInstructions", "", "instructions", "", "applyViewData", "viewData", "createViewModel", "dialKCashCode", "getVMType", "Ljava/lang/Class;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onTopupButtonClicked", "showSelectedInstruction", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.users.ui.KCashTopupActivity */
/* loaded from: classes.dex */
public final class KCashTopupActivity extends BaseMVVMActivity<KCashTopupViewModel, KCashTopupViewData, ViewUsersKcashTopupBinding> {
    public static final Companion Companion;
    public static final String EXTRA_AMOUNT = "kcashtopupactivity.extra_amount";
    public static final int PERMISSION_REQUEST_CODE = 20;
    public KCashBanksAdapter adapter;
    private int amount;
    private KCashInstruction selectedInstruction;
    public KCashTopupViewModel viewModel;

    /* compiled from: KCashTopupActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/users/ui/KCashTopupActivity$Companion;", "", "()V", "EXTRA_AMOUNT", "", "PERMISSION_REQUEST_CODE", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.users.ui.KCashTopupActivity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final void applyInstructions(final List list) {
        KCashBanksAdapter $r3 = getAdapter();
        $r3.setInstructions(list);
        KCashBanksAdapter $r32 = getAdapter();
        $r32.notifyDataSetChanged();
        InterfaceC8209a $r4 = getBinding();
        ViewUsersKcashTopupBinding $r5 = (ViewUsersKcashTopupBinding) $r4;
        SelectView $r6 = $r5.bankSelectView;
        $r6.setOnItemClickListener(new AdapterView.OnItemSelectedListener() { // from class: ai.kudi.agent.users.ui.KCashTopupActivity$applyInstructions$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
                KCashTopupActivity $r42 = KCashTopupActivity.this;
                List $r52 = list;
                Object $r1 = $r52.get(i);
                KCashInstruction $r62 = (KCashInstruction) $r1;
                $r42.setSelectedInstruction($r62);
                KCashTopupActivity $r43 = KCashTopupActivity.this;
                $r43.showSelectedInstruction();
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView adapterView) {
            }
        });
        Object $r7 = C13722p.m3954R(list);
        KCashInstruction $r8 = (KCashInstruction) $r7;
        this.selectedInstruction = $r8;
        showSelectedInstruction();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final void dialKCashCode() {
        String $r2;
        String $r22;
        KCashInstruction $r1 = this.selectedInstruction;
        if ($r1 == null) {
            return;
        }
        Log_OC.append($r1);
        String $r23 = $r1.getCode();
        int $i0 = this.amount;
        $r2 = C13276s.m5451A($r23, "{AMOUNT}", String.valueOf($i0), false, 4, null);
        String $r3 = Uri.encode("#");
        Log_OC.loadImage($r3, "encode(\"#\")");
        $r22 = C13276s.m5451A($r2, "#", $r3, false, 4, null);
        Log.d("KCashTopup", Log_OC.m10359a("DIALING USSD CODE: ", (Object) $r22));
        Uri $r5 = Uri.parse(Log_OC.m10359a("tel:", (Object) $r22));
        Intent $r4 = new Intent("android.intent.action.CALL", $r5);
        startActivity($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m41479onCreate$lambda0(KCashTopupActivity kCashTopupActivity, View view) {
        Log_OC.getArray(kCashTopupActivity, "this$0");
        kCashTopupActivity.onTopupButtonClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final void onTopupButtonClicked() {
        int $i0 = C1335a.m36327a(this, "android.permission.CALL_PHONE");
        if ($i0 == 0) {
            dialKCashCode();
            return;
        }
        String[] $r1 = {"android.permission.CALL_PHONE"};
        C1291a.m36466q(this, $r1, 20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void showSelectedInstruction() {
        KCashInstruction $r1 = this.selectedInstruction;
        if ($r1 == null) {
            return;
        }
        String $r2 = $r1.getInstructions();
        Spanned $r3 = Html.fromHtml($r2);
        InterfaceC8209a $r4 = getBinding();
        ViewUsersKcashTopupBinding $r5 = (ViewUsersKcashTopupBinding) $r4;
        TextView $r6 = $r5.bankInstructionsTextView;
        $r6.setText($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        KCashTopupViewData $r2 = (KCashTopupViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    protected void applyViewData(KCashTopupViewData kCashTopupViewData) {
        Log_OC.getArray(kCashTopupViewData, "viewData");
        boolean $z0 = kCashTopupViewData.getError();
        if ($z0) {
            ContextExtKt.toast$default(this, "Error fetching KCash Instructions. Try again.", 0, 2, (Object) null);
            finish();
        }
        boolean $z02 = kCashTopupViewData.getLoading();
        if ($z02) {
            InterfaceC8209a $r2 = getBinding();
            ViewUsersKcashTopupBinding $r3 = (ViewUsersKcashTopupBinding) $r2;
            TextView $r4 = $r3.selectBankDescription;
            Log_OC.loadImage($r4, "binding.selectBankDescription");
            ViewExtKt.hide$default($r4, false, 1, null);
            InterfaceC8209a $r22 = getBinding();
            ViewUsersKcashTopupBinding $r32 = (ViewUsersKcashTopupBinding) $r22;
            View $r5 = $r32.bankSelectView;
            Log_OC.loadImage($r5, "binding.bankSelectView");
            View r9 = $r5;
            ViewExtKt.hide$default(r9, false, 1, null);
            InterfaceC8209a $r23 = getBinding();
            ViewUsersKcashTopupBinding $r33 = (ViewUsersKcashTopupBinding) $r23;
            TextView $r42 = $r33.bankInstructionsTextView;
            Log_OC.loadImage($r42, "binding.bankInstructionsTextView");
            ViewExtKt.hide$default($r42, false, 1, null);
            InterfaceC8209a $r24 = getBinding();
            ViewUsersKcashTopupBinding $r34 = (ViewUsersKcashTopupBinding) $r24;
            Button $r6 = $r34.topupButton;
            Log_OC.loadImage($r6, "binding.topupButton");
            ViewExtKt.hide$default($r6, false, 1, null);
            InterfaceC8209a $r25 = getBinding();
            ViewUsersKcashTopupBinding $r35 = (ViewUsersKcashTopupBinding) $r25;
            ProgressBar $r7 = $r35.loadingProgressBar;
            Log_OC.loadImage($r7, "binding.loadingProgressBar");
            ViewExtKt.show($r7);
        } else {
            InterfaceC8209a $r26 = getBinding();
            ViewUsersKcashTopupBinding $r36 = (ViewUsersKcashTopupBinding) $r26;
            TextView $r43 = $r36.selectBankDescription;
            Log_OC.loadImage($r43, "binding.selectBankDescription");
            ViewExtKt.show($r43);
            InterfaceC8209a $r27 = getBinding();
            ViewUsersKcashTopupBinding $r37 = (ViewUsersKcashTopupBinding) $r27;
            View $r52 = $r37.bankSelectView;
            Log_OC.loadImage($r52, "binding.bankSelectView");
            View r92 = $r52;
            ViewExtKt.show(r92);
            InterfaceC8209a $r28 = getBinding();
            ViewUsersKcashTopupBinding $r38 = (ViewUsersKcashTopupBinding) $r28;
            TextView $r44 = $r38.bankInstructionsTextView;
            Log_OC.loadImage($r44, "binding.bankInstructionsTextView");
            ViewExtKt.show($r44);
            InterfaceC8209a $r29 = getBinding();
            ViewUsersKcashTopupBinding $r39 = (ViewUsersKcashTopupBinding) $r29;
            Button $r62 = $r39.topupButton;
            Log_OC.loadImage($r62, "binding.topupButton");
            ViewExtKt.show($r62);
            InterfaceC8209a $r210 = getBinding();
            ViewUsersKcashTopupBinding $r310 = (ViewUsersKcashTopupBinding) $r210;
            ProgressBar $r72 = $r310.loadingProgressBar;
            Log_OC.loadImage($r72, "binding.loadingProgressBar");
            ViewExtKt.hide$default($r72, false, 1, null);
        }
        List $r8 = kCashTopupViewData.getInstructions();
        if ($r8 == null) {
            return;
        }
        applyInstructions($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        KCashTopupViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected KCashTopupViewModel createViewModel() {
        KCashTopupViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ViewUsersKcashTopupBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ViewUsersKcashTopupBinding $r2 = ViewUsersKcashTopupBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ViewUsersKcashTopupBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final KCashBanksAdapter getAdapter() {
        KCashBanksAdapter $r1 = this.adapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("adapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final int getAmount() {
        int i0 = this.amount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final KCashInstruction getSelectedInstruction() {
        KCashInstruction r1 = this.selectedInstruction;
        return r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return KCashTopupViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public final KCashTopupViewModel getViewModel() {
        KCashTopupViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException $r15 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r15;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        AbstractC0925a $r5 = getSupportActionBar();
        if ($r5 != null) {
            $r5.mo37602u(true);
        }
        Intent $r6 = getIntent();
        int $i0 = $r6.getIntExtra(EXTRA_AMOUNT, 0);
        this.amount = $i0;
        KCashBanksAdapter $r7 = new KCashBanksAdapter(this);
        setAdapter($r7);
        InterfaceC8209a $r8 = getBinding();
        ViewUsersKcashTopupBinding $r9 = (ViewUsersKcashTopupBinding) $r8;
        SelectView $r10 = $r9.bankSelectView;
        KCashBanksAdapter $r72 = getAdapter();
        $r10.setAdapter($r72);
        InterfaceC8209a $r82 = getBinding();
        ViewUsersKcashTopupBinding $r92 = (ViewUsersKcashTopupBinding) $r82;
        Button $r11 = $r92.topupButton;
        $r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.users.ui.k
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KCashTopupActivity $r22 = KCashTopupActivity.this;
                KCashTopupActivity.m41479onCreate$lambda0($r22, view);
            }
        });
        BaseViewModel $r13 = getViewModel();
        KCashTopupViewModel $r14 = (KCashTopupViewModel) $r13;
        int $i02 = this.amount;
        $r14.start($i02);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == 16908332) {
            onBackPressed();
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        if (i == 20) {
            int $i0 = iArr.length;
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                int $i02 = iArr[0];
                if ($i02 == 0) {
                    onTopupButtonClicked();
                    return;
                }
            }
            ContextExtKt.toast$default(this, "Call Permission is required for Kudi to dial the code.", 0, 2, (Object) null);
        }
    }

    public final void setAdapter(KCashBanksAdapter kCashBanksAdapter) {
        Log_OC.getArray(kCashBanksAdapter, "<set-?>");
        this.adapter = kCashBanksAdapter;
    }

    public final void setAmount(int i) {
        this.amount = i;
    }

    public final void setSelectedInstruction(KCashInstruction kCashInstruction) {
        this.selectedInstruction = kCashInstruction;
    }

    public final void setViewModel(KCashTopupViewModel kCashTopupViewModel) {
        Log_OC.getArray(kCashTopupViewModel, "<set-?>");
        this.viewModel = kCashTopupViewModel;
    }
}
