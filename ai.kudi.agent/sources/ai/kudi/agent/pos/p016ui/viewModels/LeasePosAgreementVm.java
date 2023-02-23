package ai.kudi.agent.pos.p016ui.viewModels;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.RandomUtilKt;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.pos.data.PosTypeData;
import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.os.CountDownTimer;
import java.util.Iterator;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: LeasePosAgreementViewModel.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\b\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\rH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/pos/ui/viewModels/LeasePosAgreementVm;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/pos/ui/viewModels/LeasePosAgreementViewData;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "terminalRequestNavigator", "Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;", "resource", "Lai/kudi/agent/core/util/ResourceDelegate;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;Lai/kudi/agent/core/util/ResourceDelegate;)V", "countDown", "Landroid/os/CountDownTimer;", "filterPartnersPrice", "", "posTypeData", "", "Lai/kudi/agent/pos/data/PosTypeData;", "initialData", "navigateToPosSelectionFragment", "onCleared", "startCountDown", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.viewModels.LeasePosAgreementVm */
/* loaded from: classes.dex */
public final class LeasePosAgreementVm extends BaseViewModel<LeasePosAgreementViewData> {
    private CountDownTimer countDown;
    private final FetchCurrentUser fetchCurrentUser;
    private final ResourceDelegate resource;
    private final TerminalRequestNavigator terminalRequestNavigator;

    public LeasePosAgreementVm(FetchCurrentUser fetchCurrentUser, TerminalRequestNavigator terminalRequestNavigator, ResourceDelegate resourceDelegate) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(terminalRequestNavigator, "terminalRequestNavigator");
        Log_OC.getArray(resourceDelegate, "resource");
        this.fetchCurrentUser = fetchCurrentUser;
        this.terminalRequestNavigator = terminalRequestNavigator;
        this.resource = resourceDelegate;
        startCountDown();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final /* synthetic */ LeasePosAgreementViewData access$getState(LeasePosAgreementVm leasePosAgreementVm) {
        ViewData $r0 = leasePosAgreementVm.getState();
        LeasePosAgreementViewData $r2 = (LeasePosAgreementViewData) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    private final void filterPartnersPrice(List list) {
        C13666w $r3;
        PosTypeData posTypeData;
        PosTypeData posTypeData2;
        List $r1;
        Iterator $r2 = list.iterator();
        while (true) {
            boolean $z0 = $r2.hasNext();
            $r3 = null;
            if (!$z0) {
                posTypeData = null;
                break;
            }
            Object $r4 = $r2.next();
            posTypeData = $r4;
            String $r7 = ((PosTypeData) $r4).getTerminalType();
            ResourceDelegate $r8 = this.resource;
            String $r9 = $r8.getString(C0001R.string.nomba_lite);
            boolean $z02 = Log_OC.append($r7, $r9);
            if ($z02) {
                break;
            }
        }
        PosTypeData $r6 = posTypeData;
        Iterator $r22 = list.iterator();
        while (true) {
            boolean $z03 = $r22.hasNext();
            if (!$z03) {
                posTypeData2 = null;
                break;
            }
            Object $r42 = $r22.next();
            posTypeData2 = $r42;
            String $r72 = ((PosTypeData) $r42).getTerminalType();
            ResourceDelegate $r82 = this.resource;
            String $r92 = $r82.getString(C0001R.string.nomba_pro);
            boolean $z04 = Log_OC.append($r72, $r92);
            if ($z04) {
                break;
            }
        }
        PosTypeData $r10 = posTypeData2;
        if ($r6 != null && $r10 != null) {
            TerminalRequestNavigator $r11 = this.terminalRequestNavigator;
            PosTypeData[] $r12 = {$r6, $r10};
            $r1 = C13726r.m3888h($r12);
            $r11.navigateToPosSelection($r1);
            $r3 = C13666w.f30112a;
        }
        if ($r3 == null) {
            ResourceDelegate $r83 = this.resource;
            String $r73 = $r83.getString(C0001R.string.error_occurred);
            LeasePosAgreementViewData $r13 = new LeasePosAgreementViewData(null, false, $r73, 3, null);
            publish($r13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005a A[EDGE_INSN: B:37:0x005a->B:16:0x005a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[EDGE_INSN: B:41:0x00ab->B:30:0x00ab ?: BREAK  , SYNTHETIC] */
    /* renamed from: navigateToPosSelectionFragment$lambda-3  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40079navigateToPosSelectionFragment$lambda3(java.util.List r21, ai.kudi.agent.pos.p016ui.viewModels.LeasePosAgreementVm r22, ai.kudi.agent.users.domain.package_1.User r23) {
        /*
            java.lang.String r2 = "$posTypeData"
            r0 = r21
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            java.lang.String r2 = "this$0"
            r0 = r22
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            r0 = r21
            java.util.Iterator r3 = r0.iterator()
        L14:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L59
            java.lang.Object r6 = r3.next()
            r7 = r6
            r9 = r6
            ai.kudi.agent.pos.data.PosTypeData r9 = (ai.kudi.agent.pos.data.PosTypeData) r9
            r8 = r9
            java.lang.String r10 = r8.getPosRequestType()
            java.lang.String r2 = "LEASE"
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r10, r2)
            if (r4 == 0) goto L55
            java.lang.String r10 = r8.getCustomerType()
            r0 = r23
            java.lang.String r11 = r0.customerType
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r10, r11)
            if (r4 == 0) goto L55
            java.lang.String r10 = r8.getTerminalType()
            r0 = r22
            ai.kudi.agent.core.util.ResourceDelegate r12 = r0.resource
            r13 = 2131887073(0x7f1203e1, float:1.9408743E38)
            java.lang.String r11 = r12.getString(r13)
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r10, r11)
            if (r4 == 0) goto L55
            r4 = 1
            goto L56
        L55:
            r4 = 0
        L56:
            if (r4 == 0) goto L14
            goto L5a
        L59:
            r7 = 0
        L5a:
            r14 = r7
            ai.kudi.agent.pos.data.PosTypeData r14 = (ai.kudi.agent.pos.data.PosTypeData) r14
            r8 = r14
            r0 = r21
            java.util.Iterator r3 = r0.iterator()
        L64:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Laa
            java.lang.Object r6 = r3.next()
            r7 = r6
            r16 = r6
            ai.kudi.agent.pos.data.PosTypeData r16 = (ai.kudi.agent.pos.data.PosTypeData) r16
            r15 = r16
            java.lang.String r10 = r15.getPosRequestType()
            java.lang.String r2 = "LEASE"
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r10, r2)
            if (r4 == 0) goto La6
            java.lang.String r10 = r15.getCustomerType()
            r0 = r23
            java.lang.String r11 = r0.customerType
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r10, r11)
            if (r4 == 0) goto La6
            java.lang.String r10 = r15.getTerminalType()
            r0 = r22
            ai.kudi.agent.core.util.ResourceDelegate r12 = r0.resource
            r13 = 2131887076(0x7f1203e4, float:1.9408749E38)
            java.lang.String r11 = r12.getString(r13)
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r10, r11)
            if (r4 == 0) goto La6
            r4 = 1
            goto La7
        La6:
            r4 = 0
        La7:
            if (r4 == 0) goto L64
            goto Lab
        Laa:
            r7 = 0
        Lab:
            r17 = r7
            ai.kudi.agent.pos.data.PosTypeData r17 = (ai.kudi.agent.pos.data.PosTypeData) r17
            r15 = r17
            if (r8 == 0) goto Ld5
            if (r15 == 0) goto Ld5
            r0 = r22
            ai.kudi.agent.pos.navigators.TerminalRequestNavigator r0 = r0.terminalRequestNavigator
            r18 = r0
            r13 = 2
            ai.kudi.agent.pos.data.PosTypeData[] r0 = new ai.kudi.agent.pos.data.PosTypeData[r13]
            r19 = r0
            r13 = 0
            r19[r13] = r8
            r13 = 1
            r19[r13] = r15
            r0 = r19
            java.util.List r20 = kotlin.p557z.C13722p.m3935h(r0)
            r0 = r18
            r1 = r20
            r0.navigateToPosSelection(r1)
            kotlin.w r5 = kotlin.C13666w.f30112a
        Ld5:
            if (r5 != 0) goto Lde
            r0 = r22
            r1 = r21
            r0.filterPartnersPrice(r1)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.viewModels.LeasePosAgreementVm.m40079navigateToPosSelectionFragment$lambda3(java.util.List, ai.kudi.agent.pos.ui.viewModels.LeasePosAgreementVm, ai.kudi.agent.users.domain.package_1.User):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void startCountDown() {
        LeasePosAgreementVm$startCountDown$1 $r1 = new LeasePosAgreementVm$startCountDown$1(this);
        LeasePosAgreementVm$startCountDown$2 $r2 = new LeasePosAgreementVm$startCountDown$2(this);
        CountDownTimer $r3 = RandomUtilKt.initCountDownTimer(8000L, 1000L, $r1, $r2);
        this.countDown = $r3.start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        LeasePosAgreementViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public LeasePosAgreementViewData initialData() {
        LeasePosAgreementViewData $r1 = new LeasePosAgreementViewData(null, false, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToPosSelectionFragment(final List list) {
        Log_OC.getArray(list, "posTypeData");
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.FileChooser
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                List $r1 = list;
                LeasePosAgreementVm $r22 = this;
                User $r4 = (User) obj;
                LeasePosAgreementVm.m40079navigateToPosSelectionFragment$lambda3($r1, $r22, $r4);
            }
        };
        Function $r5 = Function.SUBTOTAL;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        Log_OC.loadImage($r6, "fetchCurrentUser.execute().subscribe(\n            {\n                val liteTypeData = posTypeData.find { data ->\n                    data.posRequestType == POS_REQUEST_TYPE_LEASE &&\n                        data.customerType == it.customerType &&\n                        data.terminalType == resource.getString(R.string.nomba_lite)\n                }\n\n                val proTypeData = posTypeData.find { data ->\n                    data.posRequestType == POS_REQUEST_TYPE_LEASE &&\n                        data.customerType == it.customerType &&\n                        data.terminalType == resource.getString(R.string.nomba_pro)\n                }\n                safeLet(liteTypeData, proTypeData) { lite, pro ->\n                    terminalRequestNavigator.navigateToPosSelection(listOf(lite, pro))\n                } ?: filterPartnersPrice(posTypeData)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        super.onCleared();
        CountDownTimer $r1 = this.countDown;
        if ($r1 == null) {
            return;
        }
        $r1.cancel();
    }
}
