package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentEditProfileBinding;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.personal.p027ui.viewModels.EditProfileViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.EditProfileViewData;
import ai.kudi.agent.statesandlgapicker.dialogs.StateFragment;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
/* compiled from: EditProfileFragment.kt */
@Metadata(m10422d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 @2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003H\u0014J\b\u0010%\u001a\u00020\u0002H\u0014J.\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\u0006\u0010'\u001a\u00020\u00072\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aH\u0002J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aH\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0014J\b\u0010+\u001a\u00020#H\u0002J\u0010\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.H\u0016J&\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u001a\u00107\u001a\u00020#2\u0006\u00108\u001a\u0002002\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00109\u001a\u00020#H\u0002J\b\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020#H\u0002J\f\u0010=\u001a\u00020#*\u00020\u0003H\u0002J\f\u0010>\u001a\u00020#*\u00020\u0003H\u0002J\f\u0010?\u001a\u00020#*\u00020\u0003H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u0016\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/EditProfileFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/personal/ui/viewModels/EditProfileViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/EditProfileViewData;", "Lai/kudi/agent/databinding/FragmentEditProfileBinding;", "()V", PhoneFragment.ARG_BVN, "", "getBvn", "()Ljava/lang/String;", "setBvn", "(Ljava/lang/String;)V", "editProfileViewModel", "getEditProfileViewModel", "()Lai/kudi/agent/settings/personal/ui/viewModels/EditProfileViewModel;", "setEditProfileViewModel", "(Lai/kudi/agent/settings/personal/ui/viewModels/EditProfileViewModel;)V", "lga", "getLga", "setLga", "lgaLatitude", "", "lgaLongitude", "locationList", "Ljava/util/ArrayList;", "Lai/kudi/agent/register/data/models/LocationModel;", "Lkotlin/collections/ArrayList;", SendReceiptToTerminalConfirmationBottomSheet.STATE, "getState", "setState", "states", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "applyViewData", "", "viewData", "createViewModel", "getLgaFromList", "stateLocation", "getStates", "getVMType", "Ljava/lang/Class;", "loadStates", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUpStateAndLga", "showLgas", "", "showStates", "applyData", "applyError", "applyLoading", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.EditProfileFragment */
/* loaded from: classes.dex */
public final class EditProfileFragment extends BaseMVVMViewBindingFragment<EditProfileViewModel, EditProfileViewData, FragmentEditProfileBinding> {
    public static final String ARGS_BVN_VERIFIED = "bvnVerified";
    public static final Companion Companion;
    public EditProfileViewModel editProfileViewModel;
    private float lgaLatitude;
    private float lgaLongitude;
    private ArrayList<LocationModel> locationList;
    private List<String> states;
    private User user;
    private String mapname = "";
    private String state = "";
    private String alias = "";

    /* compiled from: EditProfileFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/EditProfileFragment$Companion;", "", "()V", "ARGS_BVN_VERIFIED", "", "newInstance", "Lai/kudi/agent/settings/personal/ui/EditProfileFragment;", "isBvnVerified", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.EditProfileFragment$Companion */
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
        public final EditProfileFragment newInstance(boolean z) {
            EditProfileFragment $r1 = new EditProfileFragment();
            Bundle $r2 = new Bundle();
            $r2.putBoolean("bvnVerified", z);
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
            return $r1;
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
    public EditProfileFragment() {
        ArrayList $r1 = new ArrayList();
        this.locationList = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyData(EditProfileViewData editProfileViewData) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentEditProfileBinding $r3 = (FragmentEditProfileBinding) $r2;
        List $r4 = editProfileViewData.getLocation();
        if ($r4 != null) {
            ArrayList $r5 = (ArrayList) $r4;
            this.locationList = $r5;
            this.states = getStates($r5);
        }
        User $r6 = editProfileViewData.getUserProfile();
        if ($r6 == null) {
            return;
        }
        this.user = $r6;
        KudiInputField $r7 = $r3.emailTextView;
        String $r8 = $r6.getEmail();
        $r7.setText($r8);
        KudiInputField $r72 = $r3.businessAddressView;
        String $r82 = $r6.businessAddress;
        $r72.setText($r82);
        KudiInputField $r73 = $r3.stateView;
        String $r83 = $r6.state;
        $r73.setText($r83);
        KudiInputField $r74 = $r3.lgaView;
        String $r84 = $r6.country;
        $r74.setText($r84);
        KudiInputField $r75 = $r3.businessNameView;
        String $r85 = $r6.getBusinessName();
        $r75.setText($r85);
        String $r86 = $r6.keywords;
        Log_OC.append($r86);
        setBvn($r86);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyError(EditProfileViewData editProfileViewData) {
        FragmentActivity $r7;
        FragmentActivity $r72;
        InterfaceC8209a $r2 = requireBinding();
        FragmentEditProfileBinding $r3 = (FragmentEditProfileBinding) $r2;
        EditProfileViewData.Error $r4 = editProfileViewData.getError();
        if ($r4 == null) {
            return;
        }
        KudiInputField $r5 = $r3.emailTextView;
        String $r6 = $r4.getEmail();
        $r5.setError($r6);
        KudiInputField $r52 = $r3.businessAddressView;
        String $r62 = $r4.getBusinessAddress();
        $r52.setError($r62);
        KudiInputField $r53 = $r3.businessNameView;
        String $r63 = $r4.getBusinessName();
        $r53.setError($r63);
        KudiInputField $r54 = $r3.stateView;
        String $r64 = $r4.getState();
        $r54.setError($r64);
        KudiInputField $r55 = $r3.lgaView;
        String $r65 = $r4.getLga();
        $r55.setError($r65);
        String $r66 = $r4.getGenericMessage();
        if ($r66 != null && ($r72 = getActivity()) != null) {
            ContextExtKt.toast$default($r72, $r66, 0, 2, (Object) null);
        }
        String $r67 = $r4.getLocation();
        if ($r67 == null || ($r7 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r7, $r67, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyLoading(EditProfileViewData editProfileViewData) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentEditProfileBinding $r3 = (FragmentEditProfileBinding) $r2;
        boolean $z0 = editProfileViewData.isEditingProfile();
        if (!$z0) {
            boolean $z02 = editProfileViewData.isFetchinLocation();
            if (!$z02) {
                KudiButton $r4 = $r3.submitButton;
                $r4.m38033e();
                return;
            }
        }
        KudiButton $r42 = $r3.submitButton;
        $r42.m38032f();
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.EditProfileFragment.getLgaFromList(java.lang.String, java.util.ArrayList):java.util.List");
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.EditProfileFragment.getStates(java.util.ArrayList):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadStates() {
        EditProfileViewModel $r1 = getEditProfileViewModel();
        $r1.fetchLocation();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final EditProfileFragment newInstance(boolean z) {
        Companion $r0 = Companion;
        EditProfileFragment $r1 = $r0.newInstance(z);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-0  reason: not valid java name */
    public static final void m40797onViewCreated$lambda2$lambda0(EditProfileFragment editProfileFragment, FragmentEditProfileBinding fragmentEditProfileBinding, View view) {
        Log_OC.getArray(editProfileFragment, "this$0");
        Log_OC.getArray(fragmentEditProfileBinding, "$this_apply");
        ContextExtKt.hideKeyboard(editProfileFragment);
        KudiInputField $r3 = fragmentEditProfileBinding.businessNameView;
        String $r4 = $r3.getText();
        KudiInputField $r32 = fragmentEditProfileBinding.businessAddressView;
        String $r5 = $r32.getText();
        KudiInputField $r33 = fragmentEditProfileBinding.emailTextView;
        String $r6 = $r33.getText();
        KudiInputField $r34 = fragmentEditProfileBinding.lgaView;
        String $r7 = $r34.getText();
        KudiInputField $r35 = fragmentEditProfileBinding.stateView;
        String $r8 = $r35.getText();
        EditProfileViewModel $r9 = editProfileFragment.getEditProfileViewModel();
        $r9.editProfile($r5, $r4, $r6, $r7, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40798onViewCreated$lambda2$lambda1(EditProfileFragment editProfileFragment, View view) {
        Log_OC.getArray(editProfileFragment, "this$0");
        EditProfileViewModel $r0 = editProfileFragment.getEditProfileViewModel();
        User $r3 = editProfileFragment.user;
        Log_OC.append($r3);
        $r0.navigateToVerifiedInfo($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpStateAndLga() {
        ArrayList $r1 = this.locationList;
        int $i0 = $r1.size();
        if ($i0 <= 0) {
            loadStates();
        }
        InterfaceC8209a $r2 = requireBinding();
        FragmentEditProfileBinding $r3 = (FragmentEditProfileBinding) $r2;
        KudiInputField $r4 = $r3.stateView;
        EditText $r5 = $r4.getEditText();
        $r5.setEnabled(false);
        KudiInputField $r42 = $r3.lgaView;
        EditText $r52 = $r42.getEditText();
        $r52.setEnabled(false);
        KudiInputField $r43 = $r3.lgaView;
        EditText $r53 = $r43.getEditText();
        $r53.setClickable(true);
        KudiInputField $r44 = $r3.stateView;
        EditText $r54 = $r44.getEditText();
        $r54.setClickable(true);
        ViewGroup $r45 = $r3.stateView;
        ViewGroup r14 = $r45;
        r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.SearchResultsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditProfileFragment $r22 = EditProfileFragment.this;
                EditProfileFragment.m40799setUpStateAndLga$lambda16$lambda12($r22, view);
            }
        });
        KudiInputField $r46 = $r3.stateView;
        EditText $r55 = $r46.getEditText();
        $r55.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.Stats$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditProfileFragment $r22 = EditProfileFragment.this;
                EditProfileFragment.m40800setUpStateAndLga$lambda16$lambda13($r22, view);
            }
        });
        KudiInputField $r47 = $r3.lgaView;
        EditText $r56 = $r47.getEditText();
        $r56.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.NumberPicker
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditProfileFragment $r22 = EditProfileFragment.this;
                EditProfileFragment.m40801setUpStateAndLga$lambda16$lambda14($r22, view);
            }
        });
        ViewGroup $r48 = $r3.lgaView;
        ViewGroup r142 = $r48;
        r142.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditProfileFragment $r22 = EditProfileFragment.this;
                EditProfileFragment.m40802setUpStateAndLga$lambda16$lambda15($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpStateAndLga$lambda-16$lambda-12  reason: not valid java name */
    public static final void m40799setUpStateAndLga$lambda16$lambda12(EditProfileFragment editProfileFragment, View view) {
        Log_OC.getArray(editProfileFragment, "this$0");
        editProfileFragment.showStates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpStateAndLga$lambda-16$lambda-13  reason: not valid java name */
    public static final void m40800setUpStateAndLga$lambda16$lambda13(EditProfileFragment editProfileFragment, View view) {
        Log_OC.getArray(editProfileFragment, "this$0");
        editProfileFragment.showStates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpStateAndLga$lambda-16$lambda-14  reason: not valid java name */
    public static final void m40801setUpStateAndLga$lambda16$lambda14(EditProfileFragment editProfileFragment, View view) {
        Log_OC.getArray(editProfileFragment, "this$0");
        boolean $z0 = editProfileFragment.showLgas();
        if ($z0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpStateAndLga$lambda-16$lambda-15  reason: not valid java name */
    public static final void m40802setUpStateAndLga$lambda16$lambda15(EditProfileFragment editProfileFragment, View view) {
        Log_OC.getArray(editProfileFragment, "this$0");
        boolean $z0 = editProfileFragment.showLgas();
        if ($z0) {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean showLgas() {
        boolean $z0;
        InterfaceC8209a $r1 = requireBinding();
        FragmentEditProfileBinding $r2 = (FragmentEditProfileBinding) $r1;
        KudiInputField $r3 = $r2.stateView;
        String $r4 = $r3.getText();
        $z0 = C13276s.m5440u($r4);
        if ($z0) {
            InterfaceC8209a $r12 = requireBinding();
            FragmentEditProfileBinding $r22 = (FragmentEditProfileBinding) $r12;
            KudiInputField $r32 = $r22.stateView;
            $r32.setError("You must select a state first");
            return true;
        }
        List $r5 = this.states;
        if ($r5 == null) {
            return false;
        }
        StateFragment.Companion $r6 = StateFragment.Companion;
        InterfaceC8209a $r13 = requireBinding();
        FragmentEditProfileBinding $r23 = (FragmentEditProfileBinding) $r13;
        KudiInputField $r33 = $r23.stateView;
        String $r42 = $r33.getText();
        ArrayList $r7 = this.locationList;
        List $r52 = getLgaFromList($r42, $r7);
        StateFragment $r8 = StateFragment.Companion.newInstance$default($r6, $r52, null, 2, null);
        EditProfileFragment$showLgas$1$1 $r9 = new EditProfileFragment$showLgas$1$1(this, $r8);
        $r8.setCallback($r9);
        FragmentManager $r10 = getChildFragmentManager();
        $r8.show($r10, "Select Lga");
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showStates() {
        List $r1 = this.states;
        if ($r1 == null) {
            return;
        }
        StateFragment.Companion $r2 = StateFragment.Companion;
        StateFragment $r3 = StateFragment.Companion.newInstance$default($r2, $r1, null, 2, null);
        EditProfileFragment$showStates$1$1 $r4 = new EditProfileFragment$showStates$1$1(this, $r3);
        $r3.setCallback($r4);
        FragmentManager $r5 = getChildFragmentManager();
        $r3.show($r5, "Select State");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        EditProfileViewData $r2 = (EditProfileViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(EditProfileViewData editProfileViewData) {
        Log_OC.getArray(editProfileViewData, "viewData");
        applyLoading(editProfileViewData);
        applyData(editProfileViewData);
        applyError(editProfileViewData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        EditProfileViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public EditProfileViewModel createViewModel() {
        EditProfileViewModel $r1 = getEditProfileViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBvn() {
        String r1 = this.mapname;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final EditProfileViewModel getEditProfileViewModel() {
        EditProfileViewModel $r1 = this.editProfileViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("editProfileViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLga() {
        String r1 = this.alias;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getState() {
        String r1 = this.state;
        return r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return EditProfileViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw $r5;
        }
        SettingsActivity $r3 = (SettingsActivity) $r2;
        SettingsSubComponent $r4 = $r3.getSettingsSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentEditProfileBinding $r4 = FragmentEditProfileBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
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
        boolean $z0 = getActivity() instanceof SettingsActivity;
        if ($z0) {
            FragmentActivity $r3 = getActivity();
            if ($r3 == null) {
                NullPointerException r16 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw r16;
            }
            SettingsActivity $r4 = (SettingsActivity) $r3;
            String $r5 = getString(C0001R.string.edit_profile);
            Log_OC.loadImage($r5, "getString(R.string.edit_profile)");
            $r4.setTitle($r5);
        }
        EditProfileViewModel $r7 = getEditProfileViewModel();
        $r7.start();
        InterfaceC8209a $r8 = requireBinding();
        final FragmentEditProfileBinding $r9 = (FragmentEditProfileBinding) $r8;
        View $r10 = $r9.lgaView;
        Log_OC.loadImage($r10, "lgaView");
        View $r1 = $r10;
        ViewExtKt.disable($r1);
        View $r102 = $r9.stateView;
        Log_OC.loadImage($r102, "stateView");
        View $r12 = $r102;
        ViewExtKt.disable($r12);
        EditText $r11 = $r9.emailTextView.getInputEditText();
        ViewExtKt.disable($r11);
        EditText $r112 = $r9.businessNameView.getInputEditText();
        ViewExtKt.disable($r112);
        EditText $r113 = $r9.businessAddressView.getInputEditText();
        ViewExtKt.disable($r113);
        View $r122 = $r9.submitButton;
        Log_OC.loadImage($r122, "submitButton");
        View $r13 = $r122;
        ViewExtKt.hide$default($r13, false, 1, null);
        ViewGroup r19 = $r9.submitButton;
        r19.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditProfileFragment $r2 = EditProfileFragment.this;
                FragmentEditProfileBinding $r32 = $r9;
                EditProfileFragment.m40797onViewCreated$lambda2$lambda0($r2, $r32, view2);
            }
        });
        TextView $r14 = $r9.viewVerifiedInfoView;
        TextView r20 = $r14;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditProfileFragment $r2 = EditProfileFragment.this;
                EditProfileFragment.m40798onViewCreated$lambda2$lambda1($r2, view2);
            }
        });
        setUpStateAndLga();
    }

    public final void setBvn(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.mapname = str;
    }

    public final void setEditProfileViewModel(EditProfileViewModel editProfileViewModel) {
        Log_OC.getArray(editProfileViewModel, "<set-?>");
        this.editProfileViewModel = editProfileViewModel;
    }

    public final void setLga(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.alias = str;
    }

    public final void setState(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.state = str;
    }
}
