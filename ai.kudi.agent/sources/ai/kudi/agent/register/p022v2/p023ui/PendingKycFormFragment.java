package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.domain.room_entities.IdType;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.databinding.FragmentPendingKycFormBinding;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.PendingKycViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.PendingKycViewData;
import ai.kudi.agent.register.xmpp.components.PendingKycSubComponent;
import ai.kudi.agent.settings.personal.p027ui.IdtypesFragment;
import ai.kudi.agent.transactions.utils.IdTypes;
import ai.kudi.agent.transactions.utils.TransactionsUtilKt;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.location.C4107a;
import java.util.Iterator;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: PendingKycFormFragment.kt */
@Metadata(m10422d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 52\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0002H\u0014J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J-\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\u000e\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-H\u0016¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0016H\u0002J\u001a\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u00102\u001a\u00020\u0016H\u0002J\u0010\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0007H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u00066"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/PendingKycFormFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/v2/ui/viewModels/PendingKycViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/PendingKycViewData;", "Lai/kudi/agent/databinding/FragmentPendingKycFormBinding;", "()V", "idType", "Lai/kudi/agent/core/domain/room_entities/IdType;", "pendingKycActivity", "Lai/kudi/agent/register/v2/ui/PendingKycActivity;", "pendingKycViewModel", "getPendingKycViewModel", "()Lai/kudi/agent/register/v2/ui/viewModels/PendingKycViewModel;", "setPendingKycViewModel", "(Lai/kudi/agent/register/v2/ui/viewModels/PendingKycViewModel;)V", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "getRegistrationInfo", "()Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "setRegistrationInfo", "(Lai/kudi/agent/register/domain/dto/RegistrationInfo;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSubmitIdClicked", "onViewCreated", "view", "performClickIdType", "setMaxLengthOfIdNo", "selectedCard", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.PendingKycFormFragment */
/* loaded from: classes.dex */
public final class PendingKycFormFragment extends BaseMVVMViewBindingFragment<PendingKycViewModel, PendingKycViewData, FragmentPendingKycFormBinding> {
    public static final Companion Companion;
    public static final String REG_INFO = "REG_INFO";
    private IdType idType;
    private PendingKycActivity pendingKycActivity;
    public PendingKycViewModel pendingKycViewModel;
    public RegistrationInfo registrationInfo;

    /* compiled from: PendingKycFormFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/PendingKycFormFragment$Companion;", "", "()V", "REG_INFO", "", "newInstance", "Lai/kudi/agent/register/v2/ui/PendingKycFormFragment;", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.PendingKycFormFragment$Companion */
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
        public final PendingKycFormFragment newInstance(RegistrationInfo registrationInfo) {
            Log_OC.getArray(registrationInfo, "registrationInfo");
            PendingKycFormFragment $r3 = new PendingKycFormFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable("REG_INFO", registrationInfo);
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
    /* JADX WARN: Multi-variable type inference failed */
    private final void onSubmitIdClicked() {
        IdTypes idTypes;
        ContextExtKt.hideKeyboard(this);
        InterfaceC8209a $r2 = requireBinding();
        FragmentPendingKycFormBinding $r3 = (FragmentPendingKycFormBinding) $r2;
        List $r4 = TransactionsUtilKt.getLocalIdTypes();
        Iterator $r5 = $r4.iterator();
        while (true) {
            boolean $z0 = $r5.hasNext();
            if (!$z0) {
                idTypes = null;
                break;
            }
            Object $r7 = $r5.next();
            idTypes = $r7;
            String $r10 = ((IdTypes) $r7).getLabel();
            KudiInputField $r11 = $r3.idCardType;
            String $r12 = $r11.getText();
            boolean $z02 = Log_OC.append($r10, $r12);
            if ($z02) {
                break;
            }
        }
        IdTypes idTypes2 = idTypes;
        String $r6 = idTypes2 != null ? idTypes2.getId() : null;
        if ($r6 == null) {
            $r6 = "";
        }
        FragmentActivity $r14 = requireActivity();
        Log_OC.loadImage($r14, "requireActivity()");
        LocationUtil $r13 = new LocationUtil($r14);
        Context $r16 = requireContext();
        C4107a $r15 = new C4107a($r16);
        PendingKycFormFragment$onSubmitIdClicked$1$1 $r1 = new PendingKycFormFragment$onSubmitIdClicked$1$1(this, $r6, $r3);
        LocationUtil.getLastLocation$default($r13, $r15, 0, $r1, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-4$lambda-1$lambda-0  reason: not valid java name */
    public static final void m40458onViewCreated$lambda4$lambda1$lambda0(PendingKycFormFragment pendingKycFormFragment, View view) {
        Log_OC.getArray(pendingKycFormFragment, "this$0");
        pendingKycFormFragment.performClickIdType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-4$lambda-2  reason: not valid java name */
    public static final void m40459onViewCreated$lambda4$lambda2(PendingKycFormFragment pendingKycFormFragment, View view) {
        Log_OC.getArray(pendingKycFormFragment, "this$0");
        pendingKycFormFragment.performClickIdType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m40460onViewCreated$lambda4$lambda3(PendingKycFormFragment pendingKycFormFragment, View view) {
        Log_OC.getArray(pendingKycFormFragment, "this$0");
        pendingKycFormFragment.onSubmitIdClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void performClickIdType() {
        IdtypesFragment.Companion $r3 = IdtypesFragment.Companion;
        IdtypesFragment $r2 = $r3.newInstance();
        PendingKycFormFragment$performClickIdType$1 $r4 = new PendingKycFormFragment$performClickIdType$1(this);
        $r2.setCallback($r4);
        PendingKycActivity $r1 = this.pendingKycActivity;
        if ($r1 == null) {
            return;
        }
        AppCompatActivityExtKt.startFragment$default($r1, $r2, C0001R.C0003id.pendingKycFrame, false, false, false, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setMaxLengthOfIdNo(ai.kudi.agent.core.domain.room_entities.IdType r15) {
        /*
            r14 = this;
            java.util.List r0 = ai.kudi.agent.transactions.utils.TransactionsUtilKt.getLocalIdTypes()
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r3 = r1.next()
            r5 = r3
            ai.kudi.agent.transactions.utils.IdTypes r5 = (ai.kudi.agent.transactions.utils.IdTypes) r5
            r4 = r5
            java.lang.String r6 = r4.getId()
            java.lang.String r7 = r15.getId()
            boolean r2 = kotlin.p483e0.p485d.Log_OC.append(r6, r7)
            if (r2 == 0) goto L8
            g.x.a r8 = r14.requireBinding()
            r10 = r8
            ai.kudi.agent.databinding.FragmentPendingKycFormBinding r10 = (ai.kudi.agent.databinding.FragmentPendingKycFormBinding) r10
            r9 = r10
            ai.kudi.dip.library.edittext.KudiInputField r11 = r9.idCardNumberView
            java.lang.String r12 = ""
            r11.setText(r12)
            ai.kudi.dip.library.edittext.KudiInputField r11 = r9.idCardNumberView
            int r13 = r4.getValidLength()
            r11.setMaxLength(r13)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p022v2.p023ui.PendingKycFormFragment.setMaxLengthOfIdNo(ai.kudi.agent.core.domain.room_entities.IdType):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PendingKycViewData $r2 = (PendingKycViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PendingKycViewData pendingKycViewData) {
        Log_OC.getArray(pendingKycViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentPendingKycFormBinding $r3 = (FragmentPendingKycFormBinding) $r2;
        boolean $z0 = pendingKycViewData.isLoading();
        if ($z0) {
            KudiButton $r4 = $r3.submitIdVerifyView;
            $r4.m38032f();
        } else {
            KudiButton $r42 = $r3.submitIdVerifyView;
            $r42.m38033e();
        }
        PendingKycViewData.Error $r5 = pendingKycViewData.getError();
        if ($r5 == null) {
            return;
        }
        String $r6 = $r5.getIdType();
        if ($r6 != null) {
            KudiInputField $r7 = $r3.idCardType;
            $r7.setError($r6);
        }
        String $r62 = $r5.getIdNo();
        KudiInputField $r72 = $r3.idCardNumberView;
        $r72.setError($r62);
        String $r63 = $r5.getEmailAddress();
        KudiInputField $r73 = $r3.emailAddressView;
        $r73.setError($r63);
        String $r64 = $r5.getMessage();
        if ($r64 == null) {
            return;
        }
        KudiInputField $r74 = $r3.idCardNumberView;
        $r74.setError($r64);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PendingKycViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PendingKycViewModel createViewModel() {
        PendingKycViewModel $r1 = getPendingKycViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PendingKycViewModel getPendingKycViewModel() {
        PendingKycViewModel $r1 = this.pendingKycViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("pendingKycViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RegistrationInfo getRegistrationInfo() {
        RegistrationInfo $r1 = this.registrationInfo;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("registrationInfo");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PendingKycViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        PendingKycSubComponent $r1;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof PendingKycActivity;
        if ($z0) {
            PendingKycActivity $r3 = (PendingKycActivity) context;
            this.pendingKycActivity = $r3;
            if ($r3 == null || ($r1 = $r3.getPendingKycSubComponent()) == null) {
                return;
            }
            $r1.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPendingKycFormBinding $r4 = FragmentPendingKycFormBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        if (i == 1000) {
            int $i0 = iArr.length;
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                int $i02 = iArr[0];
                if ($i02 == 0) {
                    onSubmitIdClicked();
                    return;
                }
            }
            LocationUtil.Companion $r4 = LocationUtil.Companion;
            Context $r1 = requireContext();
            Log_OC.loadImage($r1, "requireContext()");
            $r4.handleDeniedPermission($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r2 = requireArguments();
        Parcelable $r3 = $r2.getParcelable("REG_INFO");
        if ($r3 == null) {
            NullPointerException r17 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.register.domain.dto.RegistrationInfo");
            throw r17;
        }
        RegistrationInfo $r4 = (RegistrationInfo) $r3;
        setRegistrationInfo($r4);
        InterfaceC8209a $r5 = requireBinding();
        FragmentPendingKycFormBinding $r6 = (FragmentPendingKycFormBinding) $r5;
        KudiInputField $r7 = $r6.idCardType;
        EditText $r8 = $r7.getEditText();
        $r8.setFocusable(false);
        $r8.setClickable(true);
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.SettingsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PendingKycFormFragment $r22 = PendingKycFormFragment.this;
                PendingKycFormFragment.m40458onViewCreated$lambda4$lambda1$lambda0($r22, view2);
            }
        });
        ViewGroup $r72 = $r6.idCardType;
        ViewGroup r18 = $r72;
        r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PendingKycFormFragment $r22 = PendingKycFormFragment.this;
                PendingKycFormFragment.m40459onViewCreated$lambda4$lambda2($r22, view2);
            }
        });
        ViewGroup $r11 = $r6.submitIdVerifyView;
        ViewGroup r182 = $r11;
        r182.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.ErrorActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PendingKycFormFragment $r22 = PendingKycFormFragment.this;
                PendingKycFormFragment.m40460onViewCreated$lambda4$lambda3($r22, view2);
            }
        });
    }

    public final void setPendingKycViewModel(PendingKycViewModel pendingKycViewModel) {
        Log_OC.getArray(pendingKycViewModel, "<set-?>");
        this.pendingKycViewModel = pendingKycViewModel;
    }

    public final void setRegistrationInfo(RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "<set-?>");
        this.registrationInfo = registrationInfo;
    }
}
