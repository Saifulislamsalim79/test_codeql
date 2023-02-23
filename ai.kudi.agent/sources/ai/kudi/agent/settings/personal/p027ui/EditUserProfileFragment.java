package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentEditUserProfileBinding;
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
/* compiled from: EditUserProfileFragment.kt */
@Metadata(m10422d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 B2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001BB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003H\u0014J\b\u0010&\u001a\u00020\u0002H\u0014J.\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0 2\u0006\u0010(\u001a\u00020\b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0002J&\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0 2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0014J\b\u0010,\u001a\u00020$H\u0002J\u0010\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/H\u0016J&\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u001a\u00108\u001a\u00020$2\u0006\u00109\u001a\u0002012\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u0010:\u001a\u00020$H\u0002J\b\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020$H\u0002J\b\u0010>\u001a\u00020$H\u0002J\f\u0010?\u001a\u00020$*\u00020\u0003H\u0002J\f\u0010@\u001a\u00020$*\u00020\u0003H\u0002J\f\u0010A\u001a\u00020$*\u00020\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/EditUserProfileFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/personal/ui/viewModels/EditProfileViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/EditProfileViewData;", "Lai/kudi/agent/databinding/FragmentEditUserProfileBinding;", "()V", "_binding", PhoneFragment.ARG_BVN, "", "getBvn", "()Ljava/lang/String;", "setBvn", "(Ljava/lang/String;)V", "editProfileViewModel", "getEditProfileViewModel", "()Lai/kudi/agent/settings/personal/ui/viewModels/EditProfileViewModel;", "setEditProfileViewModel", "(Lai/kudi/agent/settings/personal/ui/viewModels/EditProfileViewModel;)V", "lga", "getLga", "setLga", "lgaLatitude", "", "lgaLongitude", "locationList", "Ljava/util/ArrayList;", "Lai/kudi/agent/register/data/models/LocationModel;", "Lkotlin/collections/ArrayList;", SendReceiptToTerminalConfirmationBottomSheet.STATE, "getState", "setState", "states", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "applyViewData", "", "viewData", "createViewModel", "getLgaFromList", "stateLocation", "getStates", "getVMType", "Ljava/lang/Class;", "loadStates", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUpStateAndLga", "showLgas", "", "showStates", "submit", "applyData", "applyError", "applyLoading", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.EditUserProfileFragment */
/* loaded from: classes.dex */
public final class EditUserProfileFragment extends BaseMVVMViewBindingFragment<EditProfileViewModel, EditProfileViewData, FragmentEditUserProfileBinding> {
    public static final String ARGS_BVN_VERIFIED = "bvnVerified";
    public static final Companion Companion;
    private FragmentEditUserProfileBinding _binding;
    public EditProfileViewModel editProfileViewModel;
    private float lgaLatitude;
    private float lgaLongitude;
    private ArrayList<LocationModel> locationList;
    private List<String> states;
    private User user;
    private String mapname = "";
    private String state = "";
    private String alias = "";

    /* compiled from: EditUserProfileFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/EditUserProfileFragment$Companion;", "", "()V", "ARGS_BVN_VERIFIED", "", "newInstance", "Lai/kudi/agent/settings/personal/ui/EditUserProfileFragment;", "isBvnVerified", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.EditUserProfileFragment$Companion */
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
        public final EditUserProfileFragment newInstance(boolean z) {
            EditUserProfileFragment $r1 = new EditUserProfileFragment();
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
    public EditUserProfileFragment() {
        ArrayList $r1 = new ArrayList();
        this.locationList = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyData(EditProfileViewData editProfileViewData) {
        User $r5;
        List $r2 = editProfileViewData.getLocation();
        if ($r2 != null) {
            ArrayList $r3 = (ArrayList) $r2;
            this.locationList = $r3;
            this.states = getStates($r3);
        }
        EditProfileViewData.Error $r4 = editProfileViewData.getError();
        if ($r4 != null || ($r5 = editProfileViewData.getUserProfile()) == null) {
            return;
        }
        this.user = $r5;
        FragmentEditUserProfileBinding $r6 = this._binding;
        if ($r6 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        KudiInputField $r7 = $r6.emailInput;
        String $r8 = $r5.getEmail();
        $r7.setText($r8);
        FragmentEditUserProfileBinding $r62 = this._binding;
        if ($r62 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r92 = new NullPointerException("Null throw statement replaced by Soot");
            throw r92;
        }
        KudiInputField $r72 = $r62.addressTextView;
        String $r82 = $r5.getHomeAddress();
        $r72.setText($r82);
        FragmentEditUserProfileBinding $r63 = this._binding;
        if ($r63 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r93 = new NullPointerException("Null throw statement replaced by Soot");
            throw r93;
        }
        KudiInputField $r73 = $r63.stateView;
        String $r83 = $r5.state;
        $r73.setText($r83);
        FragmentEditUserProfileBinding $r64 = this._binding;
        if ($r64 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r94 = new NullPointerException("Null throw statement replaced by Soot");
            throw r94;
        }
        KudiInputField $r74 = $r64.lgaView;
        String $r84 = $r5.country;
        $r74.setText($r84);
        FragmentEditUserProfileBinding $r65 = this._binding;
        if ($r65 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r95 = new NullPointerException("Null throw statement replaced by Soot");
            throw r95;
        }
        KudiInputField $r75 = $r65.closestLandmarkView;
        String $r85 = $r5.closestLandmark;
        $r75.setText($r85);
        String $r86 = $r5.keywords;
        Log_OC.append($r86);
        setBvn($r86);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyError(EditProfileViewData editProfileViewData) {
        FragmentActivity $r6;
        FragmentActivity $r62;
        EditProfileViewData.Error $r2 = editProfileViewData.getError();
        if ($r2 == null) {
            return;
        }
        FragmentEditUserProfileBinding $r3 = this._binding;
        if ($r3 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r7 = new NullPointerException("Null throw statement replaced by Soot");
            throw r7;
        }
        KudiInputField $r4 = $r3.emailInput;
        String $r5 = $r2.getEmail();
        $r4.setError($r5);
        FragmentEditUserProfileBinding $r32 = this._binding;
        if ($r32 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r72 = new NullPointerException("Null throw statement replaced by Soot");
            throw r72;
        }
        KudiInputField $r42 = $r32.addressTextView;
        String $r52 = $r2.getHomeAddress();
        $r42.setError($r52);
        FragmentEditUserProfileBinding $r33 = this._binding;
        if ($r33 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r73 = new NullPointerException("Null throw statement replaced by Soot");
            throw r73;
        }
        KudiInputField $r43 = $r33.closestLandmarkView;
        String $r53 = $r2.getClosestLandmark();
        $r43.setError($r53);
        FragmentEditUserProfileBinding $r34 = this._binding;
        if ($r34 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r74 = new NullPointerException("Null throw statement replaced by Soot");
            throw r74;
        }
        KudiInputField $r44 = $r34.stateView;
        String $r54 = $r2.getState();
        $r44.setError($r54);
        FragmentEditUserProfileBinding $r35 = this._binding;
        if ($r35 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r75 = new NullPointerException("Null throw statement replaced by Soot");
            throw r75;
        }
        KudiInputField $r45 = $r35.lgaView;
        String $r55 = $r2.getLga();
        $r45.setError($r55);
        String $r56 = $r2.getGenericMessage();
        if ($r56 != null && ($r62 = getActivity()) != null) {
            ContextExtKt.toast$default($r62, $r56, 0, 2, (Object) null);
        }
        String $r57 = $r2.getLocation();
        if ($r57 == null || ($r6 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r6, $r57, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyLoading(EditProfileViewData editProfileViewData) {
        boolean $z0 = editProfileViewData.isEditingProfile();
        if (!$z0) {
            boolean $z02 = editProfileViewData.isFetchinLocation();
            if (!$z02) {
                FragmentEditUserProfileBinding $r2 = this._binding;
                if ($r2 != null) {
                    KudiButton $r3 = $r2.submitButton;
                    $r3.m38033e();
                    return;
                }
                Log_OC.LogError("_binding");
                NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
                throw r4;
            }
        }
        FragmentEditUserProfileBinding $r22 = this._binding;
        if ($r22 != null) {
            KudiButton $r32 = $r22.submitButton;
            $r32.m38032f();
            return;
        }
        Log_OC.LogError("_binding");
        NullPointerException r42 = new NullPointerException("Null throw statement replaced by Soot");
        throw r42;
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.EditUserProfileFragment.getLgaFromList(java.lang.String, java.util.ArrayList):java.util.List");
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.EditUserProfileFragment.getStates(java.util.ArrayList):java.util.List");
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
    public static final EditUserProfileFragment newInstance(boolean z) {
        Companion $r0 = Companion;
        EditUserProfileFragment $r1 = $r0.newInstance(z);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40803onViewCreated$lambda0(EditUserProfileFragment editUserProfileFragment, View view) {
        Log_OC.getArray(editUserProfileFragment, "this$0");
        editUserProfileFragment.submit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m40804onViewCreated$lambda2(EditUserProfileFragment editUserProfileFragment, View view) {
        Log_OC.getArray(editUserProfileFragment, "this$0");
        EditProfileViewModel $r0 = editUserProfileFragment.getEditProfileViewModel();
        User $r3 = editUserProfileFragment.user;
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
        FragmentEditUserProfileBinding $r2 = this._binding;
        if ($r2 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        KudiInputField $r3 = $r2.stateView;
        EditText $r4 = $r3.getEditText();
        $r4.setEnabled(false);
        FragmentEditUserProfileBinding $r22 = this._binding;
        if ($r22 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r92 = new NullPointerException("Null throw statement replaced by Soot");
            throw r92;
        }
        KudiInputField $r32 = $r22.lgaView;
        EditText $r42 = $r32.getEditText();
        $r42.setEnabled(false);
        FragmentEditUserProfileBinding $r23 = this._binding;
        if ($r23 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r93 = new NullPointerException("Null throw statement replaced by Soot");
            throw r93;
        }
        KudiInputField $r33 = $r23.lgaView;
        EditText $r43 = $r33.getEditText();
        $r43.setClickable(true);
        FragmentEditUserProfileBinding $r24 = this._binding;
        if ($r24 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r94 = new NullPointerException("Null throw statement replaced by Soot");
            throw r94;
        }
        KudiInputField $r34 = $r24.stateView;
        EditText $r44 = $r34.getEditText();
        $r44.setClickable(true);
        FragmentEditUserProfileBinding $r25 = this._binding;
        if ($r25 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r95 = new NullPointerException("Null throw statement replaced by Soot");
            throw r95;
        }
        ViewGroup $r35 = $r25.stateView;
        ViewGroup r14 = $r35;
        r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.SettingsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditUserProfileFragment $r26 = EditUserProfileFragment.this;
                EditUserProfileFragment.m40808setUpStateAndLga$lambda9($r26, view);
            }
        });
        FragmentEditUserProfileBinding $r26 = this._binding;
        if ($r26 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r96 = new NullPointerException("Null throw statement replaced by Soot");
            throw r96;
        }
        KudiInputField $r36 = $r26.stateView;
        EditText $r45 = $r36.getEditText();
        $r45.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.k
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditUserProfileFragment $r27 = EditUserProfileFragment.this;
                EditUserProfileFragment.m40805setUpStateAndLga$lambda10($r27, view);
            }
        });
        FragmentEditUserProfileBinding $r27 = this._binding;
        if ($r27 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r97 = new NullPointerException("Null throw statement replaced by Soot");
            throw r97;
        }
        KudiInputField $r37 = $r27.lgaView;
        EditText $r46 = $r37.getEditText();
        $r46.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditUserProfileFragment $r28 = EditUserProfileFragment.this;
                EditUserProfileFragment.m40806setUpStateAndLga$lambda11($r28, view);
            }
        });
        FragmentEditUserProfileBinding $r28 = this._binding;
        if ($r28 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r98 = new NullPointerException("Null throw statement replaced by Soot");
            throw r98;
        }
        ViewGroup $r38 = $r28.lgaView;
        ViewGroup r142 = $r38;
        r142.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditUserProfileFragment $r29 = EditUserProfileFragment.this;
                EditUserProfileFragment.m40807setUpStateAndLga$lambda12($r29, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpStateAndLga$lambda-10  reason: not valid java name */
    public static final void m40805setUpStateAndLga$lambda10(EditUserProfileFragment editUserProfileFragment, View view) {
        Log_OC.getArray(editUserProfileFragment, "this$0");
        editUserProfileFragment.showStates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpStateAndLga$lambda-11  reason: not valid java name */
    public static final void m40806setUpStateAndLga$lambda11(EditUserProfileFragment editUserProfileFragment, View view) {
        Log_OC.getArray(editUserProfileFragment, "this$0");
        boolean $z0 = editUserProfileFragment.showLgas();
        if ($z0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpStateAndLga$lambda-12  reason: not valid java name */
    public static final void m40807setUpStateAndLga$lambda12(EditUserProfileFragment editUserProfileFragment, View view) {
        Log_OC.getArray(editUserProfileFragment, "this$0");
        boolean $z0 = editUserProfileFragment.showLgas();
        if ($z0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpStateAndLga$lambda-9  reason: not valid java name */
    public static final void m40808setUpStateAndLga$lambda9(EditUserProfileFragment editUserProfileFragment, View view) {
        Log_OC.getArray(editUserProfileFragment, "this$0");
        editUserProfileFragment.showStates();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean showLgas() {
        boolean $z0;
        FragmentEditUserProfileBinding $r1 = this._binding;
        if ($r1 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r10 = new NullPointerException("Null throw statement replaced by Soot");
            throw r10;
        }
        KudiInputField $r2 = $r1.stateView;
        String $r3 = $r2.getText();
        $z0 = C13276s.m5440u($r3);
        if ($z0) {
            FragmentEditUserProfileBinding $r12 = this._binding;
            if ($r12 != null) {
                KudiInputField $r22 = $r12.stateView;
                $r22.setError("You must select a state first");
                return true;
            }
            Log_OC.LogError("_binding");
            NullPointerException r102 = new NullPointerException("Null throw statement replaced by Soot");
            throw r102;
        }
        List $r4 = this.states;
        if ($r4 == null) {
            return false;
        }
        StateFragment.Companion $r5 = StateFragment.Companion;
        FragmentEditUserProfileBinding $r13 = this._binding;
        if ($r13 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r103 = new NullPointerException("Null throw statement replaced by Soot");
            throw r103;
        }
        KudiInputField $r23 = $r13.stateView;
        String $r32 = $r23.getText();
        ArrayList $r6 = this.locationList;
        List $r42 = getLgaFromList($r32, $r6);
        StateFragment $r7 = StateFragment.Companion.newInstance$default($r5, $r42, null, 2, null);
        EditUserProfileFragment$showLgas$1$1 $r8 = new EditUserProfileFragment$showLgas$1$1(this, $r7);
        $r7.setCallback($r8);
        FragmentManager $r9 = getChildFragmentManager();
        $r7.show($r9, "Select Lga");
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
        EditUserProfileFragment$showStates$1$1 $r4 = new EditUserProfileFragment$showStates$1$1(this, $r3);
        $r3.setCallback($r4);
        FragmentManager $r5 = getChildFragmentManager();
        $r3.show($r5, "Select State");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void submit() {
        ContextExtKt.hideKeyboard(this);
        EditProfileViewModel $r1 = getEditProfileViewModel();
        FragmentEditUserProfileBinding $r2 = this._binding;
        if ($r2 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        KudiInputField $r3 = $r2.addressTextView;
        String $r4 = $r3.getText();
        FragmentEditUserProfileBinding $r22 = this._binding;
        if ($r22 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r92 = new NullPointerException("Null throw statement replaced by Soot");
            throw r92;
        }
        KudiInputField $r32 = $r22.closestLandmarkView;
        String $r5 = $r32.getText();
        FragmentEditUserProfileBinding $r23 = this._binding;
        if ($r23 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r93 = new NullPointerException("Null throw statement replaced by Soot");
            throw r93;
        }
        KudiInputField $r33 = $r23.lgaView;
        String $r6 = $r33.getText();
        FragmentEditUserProfileBinding $r24 = this._binding;
        if ($r24 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r94 = new NullPointerException("Null throw statement replaced by Soot");
            throw r94;
        }
        KudiInputField $r34 = $r24.emailInput;
        String $r7 = $r34.getText();
        FragmentEditUserProfileBinding $r25 = this._binding;
        if ($r25 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r95 = new NullPointerException("Null throw statement replaced by Soot");
            throw r95;
        }
        KudiInputField $r35 = $r25.stateView;
        String $r8 = $r35.getText();
        $r1.editUserProfile($r4, $r5, $r6, $r7, $r8);
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
        FragmentEditUserProfileBinding $r4 = FragmentEditUserProfileBinding.inflate(layoutInflater, viewGroup, false);
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
        InterfaceC8209a $r3 = requireBinding();
        this._binding = (FragmentEditUserProfileBinding) $r3;
        boolean $z0 = getActivity() instanceof SettingsActivity;
        if ($z0) {
            FragmentActivity $r5 = getActivity();
            if ($r5 == null) {
                NullPointerException r16 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw r16;
            }
            SettingsActivity $r6 = (SettingsActivity) $r5;
            String $r7 = getString(C0001R.string.edit_profile);
            Log_OC.loadImage($r7, "getString(R.string.edit_profile)");
            $r6.setTitle($r7);
        }
        EditProfileViewModel $r9 = getEditProfileViewModel();
        $r9.start();
        FragmentEditUserProfileBinding $r4 = this._binding;
        if ($r4 == null) {
            Log_OC.LogError("_binding");
            NullPointerException $r8 = new NullPointerException("Null throw statement replaced by Soot");
            throw $r8;
        }
        ViewGroup r19 = $r4.submitButton;
        r19.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.MainActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditUserProfileFragment $r2 = EditUserProfileFragment.this;
                EditUserProfileFragment.m40803onViewCreated$lambda0($r2, view2);
            }
        });
        FragmentEditUserProfileBinding $r42 = this._binding;
        if ($r42 == null) {
            Log_OC.LogError("_binding");
            NullPointerException $r82 = new NullPointerException("Null throw statement replaced by Soot");
            throw $r82;
        }
        View $r12 = $r42.lgaView;
        Log_OC.loadImage($r12, "lgaView");
        View $r1 = $r12;
        ViewExtKt.disable($r1);
        View $r122 = $r42.stateView;
        Log_OC.loadImage($r122, "stateView");
        View $r13 = $r122;
        ViewExtKt.disable($r13);
        EditText $r132 = $r42.emailInput.getInputEditText();
        ViewExtKt.disable($r132);
        EditText $r133 = $r42.closestLandmarkView.getInputEditText();
        ViewExtKt.disable($r133);
        EditText $r134 = $r42.addressTextView.getInputEditText();
        ViewExtKt.disable($r134);
        View $r10 = $r42.submitButton;
        Log_OC.loadImage($r10, "submitButton");
        View $r14 = $r10;
        ViewExtKt.hide$default($r14, false, 1, null);
        FragmentEditUserProfileBinding $r43 = this._binding;
        if ($r43 == null) {
            Log_OC.LogError("_binding");
            NullPointerException $r83 = new NullPointerException("Null throw statement replaced by Soot");
            throw $r83;
        }
        TextView $r142 = $r43.viewVerifiedInfoView;
        TextView r20 = $r142;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.EditEventView$5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditUserProfileFragment $r2 = EditUserProfileFragment.this;
                EditUserProfileFragment.m40804onViewCreated$lambda2($r2, view2);
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
