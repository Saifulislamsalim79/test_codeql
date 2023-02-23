package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.usecases.CheckPermission;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.issues.p008ui.viewModels.data.DelayedKTAViewData;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: DelayedKTAViewModel.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/DelayedKTAViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/DelayedKTAViewData;", "hasStoragePermission", "Lai/kudi/agent/core/usecases/CheckPermission;", "issueTypeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "(Lai/kudi/agent/core/usecases/CheckPermission;Lai/kudi/agent/issues/navigators/IssueTypeNavigator;)V", "initialData", "isInputParamsValid", "", "name", "", "bank", TransactionField.AMOUNT, AttributeType.DATE, "nipOrNeft", "navigateToSummaryView", "", "issueData", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "selectPictureFromFile", "action", "Lkotlin/Function1;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.viewModels.DelayedKTAViewModel */
/* loaded from: classes.dex */
public final class DelayedKTAViewModel extends BaseViewModel<DelayedKTAViewData> {
    private final CheckPermission hasStoragePermission;
    private final IssueTypeNavigator issueTypeNavigator;

    public DelayedKTAViewModel(CheckPermission checkPermission, IssueTypeNavigator issueTypeNavigator) {
        Log_OC.getArray(checkPermission, "hasStoragePermission");
        Log_OC.getArray(issueTypeNavigator, "issueTypeNavigator");
        this.hasStoragePermission = checkPermission;
        this.issueTypeNavigator = issueTypeNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: selectPictureFromFile$lambda-0  reason: not valid java name */
    public static final void m39528selectPictureFromFile$lambda0(InterfaceC11767l interfaceC11767l, DelayedKTAViewModel delayedKTAViewModel, Boolean bool) {
        Log_OC.getArray(interfaceC11767l, "$action");
        Log_OC.getArray(delayedKTAViewModel, "this$0");
        Log_OC.loadImage(bool, "hasPermission");
        interfaceC11767l.invoke(bool);
        ViewData $r3 = delayedKTAViewModel.getState();
        DelayedKTAViewData $r4 = (DelayedKTAViewData) $r3;
        boolean $z0 = bool.booleanValue();
        delayedKTAViewModel.publish(DelayedKTAViewData.copy$default($r4, $z0, null, 2, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        DelayedKTAViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public DelayedKTAViewData initialData() {
        DelayedKTAViewData $r1 = new DelayedKTAViewData(false, null, 3, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isInputParamsValid(String str, String str2, String str3, String str4, String str5) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        boolean $z05;
        Log_OC.getArray(str, "name");
        Log_OC.getArray(str2, "bank");
        Log_OC.getArray(str3, TransactionField.AMOUNT);
        Log_OC.getArray(str4, AttributeType.DATE);
        Log_OC.getArray(str5, "nipOrNeft");
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r6 = getState();
            DelayedKTAViewData $r7 = (DelayedKTAViewData) $r6;
            DelayedKTAViewData.Error $r8 = new DelayedKTAViewData.Error("Name cannot be blank", null, null, null, null, 30, null);
            publish(DelayedKTAViewData.copy$default($r7, false, $r8, 1, null));
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            ViewData $r62 = getState();
            DelayedKTAViewData $r72 = (DelayedKTAViewData) $r62;
            DelayedKTAViewData.Error $r82 = new DelayedKTAViewData.Error(null, "bank nme cannot be blank", null, null, null, 29, null);
            publish(DelayedKTAViewData.copy$default($r72, false, $r82, 1, null));
            return false;
        }
        $z03 = C13276s.m5440u(str3);
        if ($z03) {
            ViewData $r63 = getState();
            DelayedKTAViewData $r73 = (DelayedKTAViewData) $r63;
            DelayedKTAViewData.Error $r83 = new DelayedKTAViewData.Error(null, null, "amount cannot be blank", null, null, 27, null);
            publish(DelayedKTAViewData.copy$default($r73, false, $r83, 1, null));
            return false;
        }
        $z04 = C13276s.m5440u(str4);
        if ($z04) {
            ViewData $r64 = getState();
            DelayedKTAViewData $r74 = (DelayedKTAViewData) $r64;
            DelayedKTAViewData.Error $r84 = new DelayedKTAViewData.Error(null, null, null, "Date cannot be blank", null, 23, null);
            publish(DelayedKTAViewData.copy$default($r74, false, $r84, 1, null));
            return false;
        }
        $z05 = C13276s.m5440u(str5);
        if ($z05) {
            ViewData $r65 = getState();
            DelayedKTAViewData $r75 = (DelayedKTAViewData) $r65;
            DelayedKTAViewData.Error $r85 = new DelayedKTAViewData.Error(null, null, null, null, "please select Nip or Neft", 15, null);
            publish(DelayedKTAViewData.copy$default($r75, false, $r85, 1, null));
            return false;
        }
        boolean $z06 = StringExtKt.isDigit(str3);
        if ($z06) {
            ViewData $r66 = getState();
            DelayedKTAViewData $r76 = (DelayedKTAViewData) $r66;
            publish(DelayedKTAViewData.copy$default($r76, false, null, 1, null));
            return true;
        }
        ViewData $r67 = getState();
        DelayedKTAViewData $r77 = (DelayedKTAViewData) $r67;
        DelayedKTAViewData.Error $r86 = new DelayedKTAViewData.Error(null, null, "amount has to be a number", null, null, 27, null);
        publish(DelayedKTAViewData.copy$default($r77, false, $r86, 1, null));
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToSummaryView(IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueData");
        IssueTypeNavigator $r2 = this.issueTypeNavigator;
        $r2.toIssueSummaryFragment(issueTypeModel);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void selectPictureFromFile(final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "action");
        CheckPermission $r3 = this.hasStoragePermission;
        AbstractC11688p $r4 = $r3.execute();
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                DelayedKTAViewModel $r2 = this;
                Boolean $r42 = (Boolean) obj;
                DelayedKTAViewModel.m39528selectPictureFromFile$lambda0($r1, $r2, $r42);
            }
        };
        FalseFileFilter $r5 = FalseFileFilter.FALSE;
        FavoritesArrayAdapter $r6 = $r4.e0(object, $r5);
        Log_OC.loadImage($r6, "hasStoragePermission.execute()\n            .subscribe(\n                { hasPermission ->\n                    action(hasPermission)\n                    publish(state.copy(hasStoragePermission = hasPermission))\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }
}
