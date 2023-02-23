package ai.kudi.agent.pos.p016ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.pos.data.PosPurchaseInfo;
import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.pos.p016ui.data.PosDeliveryAddressViewData;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: PosDeliveryAddressViewModel.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u0005\u001a\u00020\tJ\b\u0010\f\u001a\u00020\u0002H\u0016J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/pos/ui/viewModels/PosDeliveryAddressViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/pos/ui/data/PosDeliveryAddressViewData;", "terminalRequestNavigator", "Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;", "fetchLocation", "Lai/kudi/agent/register/domain/usecases/FetchLocation;", "(Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;Lai/kudi/agent/register/domain/usecases/FetchLocation;)V", "applyDeliveryAddressInfo", "", "posPurchaseInfo", "Lai/kudi/agent/pos/data/PosPurchaseInfo;", "initialData", "isInputParamsValid", "", "address", "", "selectedState", "lga", "area", "submitInfo", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.viewModels.PosDeliveryAddressViewModel */
/* loaded from: classes.dex */
public final class PosDeliveryAddressViewModel extends BaseViewModel<PosDeliveryAddressViewData> {
    private final FetchLocation fetchLocation;
    private final TerminalRequestNavigator terminalRequestNavigator;

    public PosDeliveryAddressViewModel(TerminalRequestNavigator terminalRequestNavigator, FetchLocation fetchLocation) {
        Log_OC.getArray(terminalRequestNavigator, "terminalRequestNavigator");
        Log_OC.getArray(fetchLocation, "fetchLocation");
        this.terminalRequestNavigator = terminalRequestNavigator;
        this.fetchLocation = fetchLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-0  reason: not valid java name */
    public static final void m40090fetchLocation$lambda0(PosDeliveryAddressViewModel posDeliveryAddressViewModel, List list) {
        Log_OC.getArray(posDeliveryAddressViewModel, "this$0");
        ViewData $r3 = posDeliveryAddressViewModel.getState();
        PosDeliveryAddressViewData $r4 = (PosDeliveryAddressViewData) $r3;
        Boolean $r1 = Boolean.FALSE;
        posDeliveryAddressViewModel.publish(PosDeliveryAddressViewData.copy$default($r4, null, $r1, list, null, 9, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-1  reason: not valid java name */
    public static final void m40091fetchLocation$lambda1(PosDeliveryAddressViewModel posDeliveryAddressViewModel, Throwable th) {
        Log_OC.getArray(posDeliveryAddressViewModel, "this$0");
        th.printStackTrace();
        ViewData $r3 = posDeliveryAddressViewModel.getState();
        PosDeliveryAddressViewData $r4 = (PosDeliveryAddressViewData) $r3;
        Boolean $r1 = Boolean.FALSE;
        posDeliveryAddressViewModel.publish(PosDeliveryAddressViewData.copy$default($r4, null, $r1, null, null, 13, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isInputParamsValid(String str, String str2, String str3, String str4) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r5 = getState();
            PosDeliveryAddressViewData $r6 = (PosDeliveryAddressViewData) $r5;
            PosDeliveryAddressViewData.Error $r7 = new PosDeliveryAddressViewData.Error("Delivery address cannot be empty", null, null, null, 14, null);
            publish(PosDeliveryAddressViewData.copy$default($r6, $r7, null, null, null, 6, null));
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            ViewData $r52 = getState();
            PosDeliveryAddressViewData $r62 = (PosDeliveryAddressViewData) $r52;
            PosDeliveryAddressViewData.Error $r72 = new PosDeliveryAddressViewData.Error(null, "Please select a state", null, null, 13, null);
            publish(PosDeliveryAddressViewData.copy$default($r62, $r72, null, null, null, 6, null));
            return false;
        }
        $z03 = C13276s.m5440u(str3);
        if ($z03) {
            ViewData $r53 = getState();
            PosDeliveryAddressViewData $r63 = (PosDeliveryAddressViewData) $r53;
            PosDeliveryAddressViewData.Error $r73 = new PosDeliveryAddressViewData.Error(null, null, "Please select a local government", null, 11, null);
            publish(PosDeliveryAddressViewData.copy$default($r63, $r73, null, null, null, 6, null));
            return false;
        }
        $z04 = C13276s.m5440u(str4);
        if ($z04) {
            ViewData $r54 = getState();
            PosDeliveryAddressViewData $r64 = (PosDeliveryAddressViewData) $r54;
            PosDeliveryAddressViewData.Error $r74 = new PosDeliveryAddressViewData.Error(null, null, null, "Area cannot be blank", 7, null);
            publish(PosDeliveryAddressViewData.copy$default($r64, $r74, null, null, null, 6, null));
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void applyDeliveryAddressInfo(PosPurchaseInfo posPurchaseInfo) {
        Log_OC.getArray(posPurchaseInfo, "posPurchaseInfo");
        ViewData $r3 = getState();
        PosDeliveryAddressViewData $r4 = (PosDeliveryAddressViewData) $r3;
        String $r5 = posPurchaseInfo.getAddress();
        String $r6 = posPurchaseInfo.getState();
        String $r7 = posPurchaseInfo.getLga();
        String $r8 = posPurchaseInfo.getArea();
        PosDeliveryAddressViewData.UserInfo $r1 = new PosDeliveryAddressViewData.UserInfo($r5, $r6, $r7, $r8);
        publish(PosDeliveryAddressViewData.copy$default($r4, null, null, null, $r1, 7, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchLocation() {
        FetchLocation $r2 = this.fetchLocation;
        AbstractC11688p $r3 = $r2.execute();
        FavoritesArrayAdapter $r5 = $r3.e0(new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosDeliveryAddressViewModel $r1 = PosDeliveryAddressViewModel.this;
                List $r32 = (List) obj;
                PosDeliveryAddressViewModel.m40090fetchLocation$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosDeliveryAddressViewModel $r1 = PosDeliveryAddressViewModel.this;
                Throwable $r32 = (Throwable) obj;
                PosDeliveryAddressViewModel.m40091fetchLocation$lambda1($r1, $r32);
            }
        });
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PosDeliveryAddressViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PosDeliveryAddressViewData initialData() {
        PosDeliveryAddressViewData $r1 = new PosDeliveryAddressViewData(null, null, null, null, 15, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitInfo(PosPurchaseInfo posPurchaseInfo) {
        Log_OC.getArray(posPurchaseInfo, "posPurchaseInfo");
        String $r2 = posPurchaseInfo.getAddress();
        Log_OC.append($r2);
        String $r3 = posPurchaseInfo.getState();
        Log_OC.append($r3);
        String $r4 = posPurchaseInfo.getLga();
        Log_OC.append($r4);
        String $r5 = posPurchaseInfo.getArea();
        Log_OC.append($r5);
        boolean $z0 = isInputParamsValid($r2, $r3, $r4, $r5);
        if ($z0) {
            TerminalRequestNavigator $r6 = this.terminalRequestNavigator;
            $r6.navigateToMakePayment(true, posPurchaseInfo);
        }
    }
}
