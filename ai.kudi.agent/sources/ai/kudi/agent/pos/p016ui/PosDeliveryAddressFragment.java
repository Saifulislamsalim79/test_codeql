package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.databinding.FragmentPosChangeAddressBinding;
import ai.kudi.agent.pos.data.PosPurchaseInfo;
import ai.kudi.agent.pos.game.components.PosSubComponent;
import ai.kudi.agent.pos.p016ui.data.PosDeliveryAddressViewData;
import ai.kudi.agent.pos.p016ui.viewModels.PosDeliveryAddressViewModel;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.agent.statesandlgapicker.dialogs.StateFragment;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
/* compiled from: PosDeliveryAddressFragment.kt */
@Metadata(m10422d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 J2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001JB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0003H\u0014J\b\u00105\u001a\u00020\u0002H\u0014J\b\u0010\r\u001a\u000206H\u0002J.\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070-2\u0006\u00108\u001a\u00020\u00072\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0002J\b\u0010.\u001a\u000203H\u0002J&\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070-2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0002J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020:H\u0014J\b\u0010;\u001a\u000203H\u0002J\u0010\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020>H\u0016J\u0012\u0010?\u001a\u0002032\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J&\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u001a\u0010H\u001a\u0002032\u0006\u0010I\u001a\u00020C2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR\"\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006K"}, m10421d2 = {"Lai/kudi/agent/pos/ui/PosDeliveryAddressFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/pos/ui/viewModels/PosDeliveryAddressViewModel;", "Lai/kudi/agent/pos/ui/data/PosDeliveryAddressViewData;", "Lai/kudi/agent/databinding/FragmentPosChangeAddressBinding;", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "lga", "getLga", "setLga", "lgaLatitude", "", "getLgaLatitude", "()F", "setLgaLatitude", "(F)V", "lgaLongitude", "getLgaLongitude", "setLgaLongitude", "locationList", "Ljava/util/ArrayList;", "Lai/kudi/agent/register/data/models/LocationModel;", "Lkotlin/collections/ArrayList;", "getLocationList", "()Ljava/util/ArrayList;", "setLocationList", "(Ljava/util/ArrayList;)V", "posActivity", "Lai/kudi/agent/pos/ui/PosActivity;", "posDeliveryAddressViewModel", "getPosDeliveryAddressViewModel", "()Lai/kudi/agent/pos/ui/viewModels/PosDeliveryAddressViewModel;", "setPosDeliveryAddressViewModel", "(Lai/kudi/agent/pos/ui/viewModels/PosDeliveryAddressViewModel;)V", "posPurchaseInfo", "Lai/kudi/agent/pos/data/PosPurchaseInfo;", SendReceiptToTerminalConfirmationBottomSheet.STATE, "getState", "setState", "states", "", "getStates", "()Ljava/util/List;", "setStates", "(Ljava/util/List;)V", "applyViewData", "", "viewData", "createViewModel", "", "getLgaFromList", "stateLocation", "getVMType", "Ljava/lang/Class;", "loadStates", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.PosDeliveryAddressFragment */
/* loaded from: classes.dex */
public final class PosDeliveryAddressFragment extends BaseMVVMViewBindingFragment<PosDeliveryAddressViewModel, PosDeliveryAddressViewData, FragmentPosChangeAddressBinding> {
    public static final Companion Companion;
    public static final String POS_PURCHASE_INFO = "PosPurchaseInfo";
    private float lgaLatitude;
    private float lgaLongitude;
    private ArrayList<LocationModel> locationList;
    private PosActivity posActivity;
    public PosDeliveryAddressViewModel posDeliveryAddressViewModel;
    private PosPurchaseInfo posPurchaseInfo;
    private List<String> states;
    private String state = "";
    private String address = "";
    private String alias = "";

    /* compiled from: PosDeliveryAddressFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/pos/ui/PosDeliveryAddressFragment$Companion;", "", "()V", "POS_PURCHASE_INFO", "", "newInstance", "Lai/kudi/agent/pos/ui/PosDeliveryAddressFragment;", "posPurchaseInfo", "Lai/kudi/agent/pos/data/PosPurchaseInfo;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.PosDeliveryAddressFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final PosDeliveryAddressFragment newInstance(PosPurchaseInfo posPurchaseInfo) {
            Log_OC.getArray(posPurchaseInfo, "posPurchaseInfo");
            PosDeliveryAddressFragment $r3 = new PosDeliveryAddressFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(PosDeliveryAddressFragment.POS_PURCHASE_INFO, posPurchaseInfo);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
            return $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosDeliveryAddressFragment() {
        ArrayList $r1 = new ArrayList();
        this.locationList = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean getLga() {
        boolean $z0;
        InterfaceC8209a $r1 = requireBinding();
        FragmentPosChangeAddressBinding $r2 = (FragmentPosChangeAddressBinding) $r1;
        KudiInputField $r3 = $r2.statesField;
        String $r4 = $r3.getText();
        $z0 = C13276s.m5440u($r4);
        if ($z0) {
            InterfaceC8209a $r12 = requireBinding();
            FragmentPosChangeAddressBinding $r22 = (FragmentPosChangeAddressBinding) $r12;
            KudiInputField $r32 = $r22.statesField;
            $r32.setError("You must select a state first");
            return true;
        }
        List $r5 = this.states;
        if ($r5 == null) {
            return false;
        }
        StateFragment.Companion $r6 = StateFragment.Companion;
        String $r42 = getState();
        ArrayList $r7 = getLocationList();
        List $r52 = getLgaFromList($r42, $r7);
        StateFragment $r8 = StateFragment.Companion.newInstance$default($r6, $r52, null, 2, null);
        PosDeliveryAddressFragment$getLga$1$1 $r9 = new PosDeliveryAddressFragment$getLga$1$1(this, $r8);
        $r8.setCallback($r9);
        PosActivity $r10 = this.posActivity;
        Log_OC.append($r10);
        FragmentManager $r11 = $r10.getSupportFragmentManager();
        $r8.show($r11, "Select Lga");
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:9:0x002d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List getLgaFromList(java.lang.String r11, java.util.ArrayList r12) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r12.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r3 = r1.next()
            r5 = r3
            ai.kudi.agent.register.data.models.LocationModel r5 = (ai.kudi.agent.register.data.models.LocationModel) r5
            r4 = r5
            java.lang.String r6 = r4.getStateName()
            boolean r2 = kotlin.p483e0.p485d.Log_OC.append(r6, r11)
            if (r2 == 0) goto L9
            java.util.ArrayList r12 = r4.getLga()
            java.util.Iterator r1 = r12.iterator()
        L29:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r3 = r1.next()
            r8 = r3
            ai.kudi.agent.register.data.models.LgaModel r8 = (ai.kudi.agent.register.data.models.LgaModel) r8
            r7 = r8
            float r9 = r7.getLatitude()
            r10.lgaLatitude = r9
            float r9 = r7.getLongitude()
            r10.lgaLongitude = r9
            java.lang.String r11 = r7.getLga()
            r0.add(r11)
            goto L29
        L4b:
            kotlin.p557z.C13722p.m3914t(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.PosDeliveryAddressFragment.getLgaFromList(java.lang.String, java.util.ArrayList):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List getStates(java.util.ArrayList r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r8.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r3 = r1.next()
            r5 = r3
            ai.kudi.agent.register.data.models.LocationModel r5 = (ai.kudi.agent.register.data.models.LocationModel) r5
            r4 = r5
            java.lang.String r6 = r4.getStateName()
            r0.add(r6)
            goto L9
        L1f:
            kotlin.p557z.C13722p.m3914t(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.PosDeliveryAddressFragment.getStates(java.util.ArrayList):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void getStates() {
        List $r1 = this.states;
        if ($r1 == null) {
            return;
        }
        StateFragment.Companion $r2 = StateFragment.Companion;
        StateFragment $r3 = StateFragment.Companion.newInstance$default($r2, $r1, null, 2, null);
        PosDeliveryAddressFragment$getStates$1$1 $r4 = new PosDeliveryAddressFragment$getStates$1$1(this, $r3);
        $r3.setCallback($r4);
        PosActivity $r5 = this.posActivity;
        Log_OC.append($r5);
        FragmentManager $r6 = $r5.getSupportFragmentManager();
        $r3.show($r6, "Select State");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadStates() {
        PosDeliveryAddressViewModel $r1 = getPosDeliveryAddressViewModel();
        $r1.fetchLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-13  reason: not valid java name */
    public static final void m40053onViewCreated$lambda13(PosDeliveryAddressFragment posDeliveryAddressFragment, View view) {
        Log_OC.getArray(posDeliveryAddressFragment, "this$0");
        PosPurchaseInfo $r2 = posDeliveryAddressFragment.posPurchaseInfo;
        if ($r2 != null) {
            InterfaceC8209a $r3 = posDeliveryAddressFragment.requireBinding();
            FragmentPosChangeAddressBinding $r4 = (FragmentPosChangeAddressBinding) $r3;
            KudiInputField $r5 = $r4.addressView;
            String $r6 = $r5.getText();
            $r2.setAddress($r6);
        }
        PosPurchaseInfo $r22 = posDeliveryAddressFragment.posPurchaseInfo;
        if ($r22 != null) {
            InterfaceC8209a $r32 = posDeliveryAddressFragment.requireBinding();
            FragmentPosChangeAddressBinding $r42 = (FragmentPosChangeAddressBinding) $r32;
            KudiInputField $r52 = $r42.statesField;
            String $r62 = $r52.getText();
            $r22.setState($r62);
        }
        PosPurchaseInfo $r23 = posDeliveryAddressFragment.posPurchaseInfo;
        if ($r23 != null) {
            InterfaceC8209a $r33 = posDeliveryAddressFragment.requireBinding();
            FragmentPosChangeAddressBinding $r43 = (FragmentPosChangeAddressBinding) $r33;
            KudiInputField $r53 = $r43.lgaField;
            String $r63 = $r53.getText();
            $r23.setLga($r63);
        }
        PosPurchaseInfo $r24 = posDeliveryAddressFragment.posPurchaseInfo;
        if ($r24 != null) {
            InterfaceC8209a $r34 = posDeliveryAddressFragment.requireBinding();
            FragmentPosChangeAddressBinding $r44 = (FragmentPosChangeAddressBinding) $r34;
            KudiInputField $r54 = $r44.posAreaInputField;
            String $r64 = $r54.getText();
            $r24.setArea($r64);
        }
        PosDeliveryAddressViewModel $r7 = posDeliveryAddressFragment.getPosDeliveryAddressViewModel();
        PosPurchaseInfo $r25 = posDeliveryAddressFragment.posPurchaseInfo;
        Log_OC.append($r25);
        $r7.submitInfo($r25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-15$lambda-14  reason: not valid java name */
    public static final void m40054onViewCreated$lambda15$lambda14(PosDeliveryAddressFragment posDeliveryAddressFragment, View view) {
        Log_OC.getArray(posDeliveryAddressFragment, "this$0");
        posDeliveryAddressFragment.getStates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-16  reason: not valid java name */
    public static final void m40055onViewCreated$lambda16(PosDeliveryAddressFragment posDeliveryAddressFragment, View view) {
        Log_OC.getArray(posDeliveryAddressFragment, "this$0");
        posDeliveryAddressFragment.getStates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-18$lambda-17  reason: not valid java name */
    public static final void m40056onViewCreated$lambda18$lambda17(PosDeliveryAddressFragment posDeliveryAddressFragment, View view) {
        Log_OC.getArray(posDeliveryAddressFragment, "this$0");
        boolean $z0 = posDeliveryAddressFragment.getLga();
        if ($z0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-19  reason: not valid java name */
    public static final void m40057onViewCreated$lambda19(PosDeliveryAddressFragment posDeliveryAddressFragment, View view) {
        Log_OC.getArray(posDeliveryAddressFragment, "this$0");
        boolean $z0 = posDeliveryAddressFragment.getLga();
        if ($z0) {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PosDeliveryAddressViewData $r2 = (PosDeliveryAddressViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PosDeliveryAddressViewData posDeliveryAddressViewData) {
        Log_OC.getArray(posDeliveryAddressViewData, "viewData");
        PosDeliveryAddressViewData.UserInfo $r2 = posDeliveryAddressViewData.getUserInfo();
        if ($r2 != null) {
            String $r3 = $r2.getAddress();
            if ($r3 != null) {
                InterfaceC8209a $r4 = requireBinding();
                FragmentPosChangeAddressBinding $r5 = (FragmentPosChangeAddressBinding) $r4;
                KudiInputField $r6 = $r5.addressView;
                $r6.setText($r3);
            }
            String $r32 = $r2.getState();
            if ($r32 != null) {
                InterfaceC8209a $r42 = requireBinding();
                FragmentPosChangeAddressBinding $r52 = (FragmentPosChangeAddressBinding) $r42;
                KudiInputField $r62 = $r52.statesField;
                $r62.setText($r32);
            }
            String $r33 = $r2.getLga();
            if ($r33 != null) {
                InterfaceC8209a $r43 = requireBinding();
                FragmentPosChangeAddressBinding $r53 = (FragmentPosChangeAddressBinding) $r43;
                KudiInputField $r63 = $r53.lgaField;
                $r63.setText($r33);
            }
        }
        List $r7 = posDeliveryAddressViewData.getLocation();
        if ($r7 != null) {
            ArrayList $r8 = (ArrayList) $r7;
            setLocationList($r8);
            ArrayList $r82 = getLocationList();
            setStates(getStates($r82));
        }
        PosDeliveryAddressViewData.Error $r9 = posDeliveryAddressViewData.getError();
        if ($r9 == null) {
            return;
        }
        String $r34 = $r9.getAddress();
        if ($r34 != null) {
            InterfaceC8209a $r44 = requireBinding();
            FragmentPosChangeAddressBinding $r54 = (FragmentPosChangeAddressBinding) $r44;
            KudiInputField $r64 = $r54.addressView;
            $r64.setError($r34);
        }
        String $r35 = $r9.getState();
        if ($r35 != null) {
            InterfaceC8209a $r45 = requireBinding();
            FragmentPosChangeAddressBinding $r55 = (FragmentPosChangeAddressBinding) $r45;
            KudiInputField $r65 = $r55.statesField;
            $r65.setError($r35);
        }
        String $r36 = $r9.getLga();
        if ($r36 != null) {
            InterfaceC8209a $r46 = requireBinding();
            FragmentPosChangeAddressBinding $r56 = (FragmentPosChangeAddressBinding) $r46;
            KudiInputField $r66 = $r56.lgaField;
            $r66.setError($r36);
        }
        String $r37 = $r9.getArea();
        if ($r37 == null) {
            return;
        }
        InterfaceC8209a $r47 = requireBinding();
        FragmentPosChangeAddressBinding $r57 = (FragmentPosChangeAddressBinding) $r47;
        KudiInputField $r67 = $r57.posAreaInputField;
        $r67.setError($r37);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PosDeliveryAddressViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PosDeliveryAddressViewModel createViewModel() {
        PosDeliveryAddressViewModel $r1 = getPosDeliveryAddressViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAddress() {
        String r1 = this.address;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getLga  reason: collision with other method in class */
    public final String m40058getLga() {
        String r1 = this.alias;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final float getLgaLatitude() {
        float f0 = this.lgaLatitude;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final float getLgaLongitude() {
        float f0 = this.lgaLongitude;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ArrayList getLocationList() {
        ArrayList r1 = this.locationList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosDeliveryAddressViewModel getPosDeliveryAddressViewModel() {
        PosDeliveryAddressViewModel $r1 = this.posDeliveryAddressViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("posDeliveryAddressViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getState() {
        String r1 = this.state;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getStates  reason: collision with other method in class */
    public final List m40059getStates() {
        List r1 = this.states;
        return r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PosDeliveryAddressViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        PosSubComponent $r1;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof PosActivity;
        if ($z0) {
            PosActivity $r3 = (PosActivity) context;
            this.posActivity = $r3;
            if ($r3 == null || ($r1 = $r3.getPos2SubComponent()) == null) {
                return;
            }
            $r1.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(POS_PURCHASE_INFO);
        PosPurchaseInfo $r3 = (PosPurchaseInfo) $r2;
        this.posPurchaseInfo = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        LayoutInflater $r1 = getLayoutInflater();
        FragmentPosChangeAddressBinding $r4 = FragmentPosChangeAddressBinding.inflate($r1, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(layoutInflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        ArrayList $r3 = this.locationList;
        int $i0 = $r3.size();
        if ($i0 <= 0) {
            loadStates();
        }
        PosPurchaseInfo $r4 = this.posPurchaseInfo;
        if ($r4 != null) {
            PosDeliveryAddressViewModel $r5 = getPosDeliveryAddressViewModel();
            $r5.applyDeliveryAddressInfo($r4);
        }
        InterfaceC8209a $r6 = requireBinding();
        FragmentPosChangeAddressBinding $r7 = (FragmentPosChangeAddressBinding) $r6;
        ViewGroup $r8 = $r7.continueButton;
        ViewGroup r21 = $r8;
        r21.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.MainActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosDeliveryAddressFragment $r2 = PosDeliveryAddressFragment.this;
                PosDeliveryAddressFragment.m40053onViewCreated$lambda13($r2, view2);
            }
        });
        InterfaceC8209a $r62 = requireBinding();
        FragmentPosChangeAddressBinding $r72 = (FragmentPosChangeAddressBinding) $r62;
        KudiInputField $r10 = $r72.statesField;
        EditText $r11 = $r10.getEditText();
        $r11.setFocusable(false);
        $r11.setClickable(true);
        $r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosDeliveryAddressFragment $r2 = PosDeliveryAddressFragment.this;
                PosDeliveryAddressFragment.m40054onViewCreated$lambda15$lambda14($r2, view2);
            }
        });
        InterfaceC8209a $r63 = requireBinding();
        FragmentPosChangeAddressBinding $r73 = (FragmentPosChangeAddressBinding) $r63;
        ViewGroup $r102 = $r73.statesField;
        ViewGroup r212 = $r102;
        r212.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.EditEventView$5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosDeliveryAddressFragment $r2 = PosDeliveryAddressFragment.this;
                PosDeliveryAddressFragment.m40055onViewCreated$lambda16($r2, view2);
            }
        });
        InterfaceC8209a $r64 = requireBinding();
        FragmentPosChangeAddressBinding $r74 = (FragmentPosChangeAddressBinding) $r64;
        KudiInputField $r103 = $r74.lgaField;
        EditText $r112 = $r103.getEditText();
        $r112.setFocusable(false);
        $r112.setClickable(true);
        $r112.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.SettingsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosDeliveryAddressFragment $r2 = PosDeliveryAddressFragment.this;
                PosDeliveryAddressFragment.m40056onViewCreated$lambda18$lambda17($r2, view2);
            }
        });
        InterfaceC8209a $r65 = requireBinding();
        FragmentPosChangeAddressBinding $r75 = (FragmentPosChangeAddressBinding) $r65;
        ViewGroup $r104 = $r75.lgaField;
        ViewGroup r213 = $r104;
        r213.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.EulaActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosDeliveryAddressFragment $r2 = PosDeliveryAddressFragment.this;
                PosDeliveryAddressFragment.m40057onViewCreated$lambda19($r2, view2);
            }
        });
    }

    public final void setAddress(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.address = str;
    }

    public final void setLga(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.alias = str;
    }

    public final void setLgaLatitude(float f) {
        this.lgaLatitude = f;
    }

    public final void setLgaLongitude(float f) {
        this.lgaLongitude = f;
    }

    public final void setLocationList(ArrayList arrayList) {
        Log_OC.getArray(arrayList, "<set-?>");
        this.locationList = arrayList;
    }

    public final void setPosDeliveryAddressViewModel(PosDeliveryAddressViewModel posDeliveryAddressViewModel) {
        Log_OC.getArray(posDeliveryAddressViewModel, "<set-?>");
        this.posDeliveryAddressViewModel = posDeliveryAddressViewModel;
    }

    public final void setState(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.state = str;
    }

    public final void setStates(List list) {
        this.states = list;
    }
}
