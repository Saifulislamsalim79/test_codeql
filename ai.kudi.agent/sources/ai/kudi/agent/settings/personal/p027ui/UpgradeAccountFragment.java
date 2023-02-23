package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.domain.room_entities.IdType;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.EditTextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentUpgradeAccountBinding;
import ai.kudi.agent.settings.dataSource.KycLevelRemoteDataSource;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.personal.p027ui.IdtypesFragment;
import ai.kudi.agent.settings.personal.p027ui.viewModels.UpgradeViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.UpgradeViewData;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import ai.kudi.agent.transactions.utils.IdTypes;
import ai.kudi.agent.transactions.utils.TransactionsUtilKt;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.PreferenceActivity;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: UpgradeAccountFragment.kt */
@Metadata(m10422d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 =2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001=B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0014J\b\u0010\"\u001a\u00020\u0002H\u0014J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0014J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020 H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0002J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020,H\u0016J$\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020 H\u0016J\b\u00106\u001a\u00020 H\u0016J\u001a\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020.2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00109\u001a\u00020 H\u0002J\b\u0010:\u001a\u00020 H\u0002J\b\u0010;\u001a\u00020 H\u0002J\b\u0010<\u001a\u00020 H\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/UpgradeAccountFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/personal/ui/viewModels/UpgradeViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/UpgradeViewData;", "Lai/kudi/agent/databinding/FragmentUpgradeAccountBinding;", "()V", "idNo", "", "idType", "Lai/kudi/agent/core/domain/room_entities/IdType;", "identityNumberType", "loader", "Landroid/app/Dialog;", "nameNextOfKin", "nextOfKinPhone", "picUrl", "residentialAddress", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "setSharedPref", "(Landroid/content/SharedPreferences;)V", "textChangesDisposables", "Lio/reactivex/disposables/CompositeDisposable;", "upgradeViewModel", "getUpgradeViewModel", "()Lai/kudi/agent/settings/personal/ui/viewModels/UpgradeViewModel;", "setUpgradeViewModel", "(Lai/kudi/agent/settings/personal/ui/viewModels/UpgradeViewModel;)V", "verificationNumber", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "hideViewsWhenIdIsSelected", "observeIdCardNo", "observeNextOfKinName", "observeNextOfKinPhone", "observePicUrl", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onViewCreated", "view", "performClick", "setIdPreview", "showViewsWhenIdIsSelected", "subscribeToViewModel", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.UpgradeAccountFragment */
/* loaded from: classes.dex */
public final class UpgradeAccountFragment extends BaseMVVMViewBindingFragment<UpgradeViewModel, UpgradeViewData, FragmentUpgradeAccountBinding> {
    private static final String ACTION_UPDATE_ALL = "NIN";
    private static final String ARG_CURRENT_KYC_LEVEL = "arg_current_kyc_level";
    public static final Companion Companion;
    private static final String NONE = "";
    private static final String PAGE_KEY = "BVN";
    private IdType idType;
    private String identityNumberType;
    private Dialog loader;
    public SharedPreferences sharedPref;
    private final C11280b textChangesDisposables;
    public UpgradeViewModel upgradeViewModel;
    private String nameNextOfKin = "";
    private String verificationNumber = "";
    private String residentialAddress = "";
    private String nextOfKinPhone = "";
    private String idNo = "";
    private String picUrl = "";

    /* compiled from: UpgradeAccountFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/UpgradeAccountFragment$Companion;", "", "()V", "ARG_CURRENT_KYC_LEVEL", "", "BVN", UpgradeAccountFragment.ACTION_UPDATE_ALL, KycLevelRemoteDataSource.NONE, "newInstance", "Lai/kudi/agent/settings/personal/ui/UpgradeAccountFragment;", "currentKycLevel", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.UpgradeAccountFragment$Companion */
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
        public final UpgradeAccountFragment newInstance(String str) {
            Log_OC.getArray(str, "currentKycLevel");
            UpgradeAccountFragment $r3 = new UpgradeAccountFragment();
            Bundle $r1 = new Bundle();
            $r1.putString(UpgradeAccountFragment.ARG_CURRENT_KYC_LEVEL, str);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
            return $r3;
        }
    }

    /* compiled from: UpgradeAccountFragment.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.UpgradeAccountFragment$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            IdTypes[] $r0 = IdTypes.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            IdTypes $r2 = IdTypes.DRIVERS_LICENSE;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            IdTypes $r22 = IdTypes.NIMC_SLIP;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            IdTypes $r23 = IdTypes.NATIONAL_ID_CARD;
            int $i04 = $r23.ordinal();
            $r1[$i04] = 3;
            IdTypes $r24 = IdTypes.INTL_PASSPORT;
            int $i05 = $r24.ordinal();
            $r1[$i05] = 4;
            IdTypes $r25 = IdTypes.VOTERS_CARD;
            int $i06 = $r25.ordinal();
            $r1[$i06] = 5;
            $EnumSwitchMapping$0 = $r1;
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
    public UpgradeAccountFragment() {
        C11280b $r1 = new C11280b();
        this.textChangesDisposables = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void hideViewsWhenIdIsSelected() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentUpgradeAccountBinding $r2 = (FragmentUpgradeAccountBinding) $r1;
        View $r3 = $r2.idNumberLabel;
        Log_OC.loadImage($r3, "idNumberLabel");
        View r6 = $r3;
        ViewExtKt.hide$default(r6, false, 1, null);
        View $r4 = $r2.idNumberView;
        Log_OC.loadImage($r4, "idNumberView");
        View r62 = $r4;
        ViewExtKt.hide$default(r62, false, 1, null);
        View $r42 = $r2.residentialAddressView;
        Log_OC.loadImage($r42, "residentialAddressView");
        View r63 = $r42;
        ViewExtKt.hide$default(r63, false, 1, null);
        ImageView $r5 = $r2.idPreview;
        Log_OC.loadImage($r5, "idPreview");
        ViewExtKt.show($r5);
        View $r32 = $r2.enterNoTextView;
        Log_OC.loadImage($r32, "enterNoTextView");
        View r64 = $r32;
        ViewExtKt.show(r64);
        View $r43 = $r2.nextOfKinPhoneView;
        Log_OC.loadImage($r43, "nextOfKinPhoneView");
        View r65 = $r43;
        ViewExtKt.hide$default(r65, false, 1, null);
        View $r44 = $r2.nextOfKinView;
        Log_OC.loadImage($r44, "nextOfKinView");
        View r66 = $r44;
        ViewExtKt.hide$default(r66, false, 1, null);
        View $r45 = $r2.picUrlView;
        Log_OC.loadImage($r45, "picUrlView");
        View r67 = $r45;
        ViewExtKt.hide$default(r67, false, 1, null);
        View $r33 = $r2.utilityBillLabel;
        Log_OC.loadImage($r33, "utilityBillLabel");
        View r68 = $r33;
        ViewExtKt.hide$default(r68, false, 1, null);
        View $r34 = $r2.nextOfKinLabel;
        Log_OC.loadImage($r34, "nextOfKinLabel");
        View r69 = $r34;
        ViewExtKt.hide$default(r69, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeIdCardNo() {
        InterfaceC8209a $r2 = requireBinding();
        FragmentUpgradeAccountBinding $r3 = (FragmentUpgradeAccountBinding) $r2;
        KudiInputField $r4 = $r3.idCardNumberView;
        EditText $r5 = $r4.getEditText();
        AbstractC11688p $r6 = EditTextExtKt.getTextChanges($r5);
        Object object = new Object() { // from class: ai.kudi.agent.settings.personal.ui.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UpgradeAccountFragment $r1 = UpgradeAccountFragment.this;
                CharSequence $r32 = (CharSequence) obj;
                UpgradeAccountFragment.m40816observeIdCardNo$lambda13($r1, $r32);
            }
        };
        Subscription $r1 = Subscription.subscribed;
        FavoritesArrayAdapter $r8 = $r6.e0(object, $r1);
        C11280b $r9 = this.textChangesDisposables;
        $r9.b($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observeIdCardNo$lambda-13  reason: not valid java name */
    public static final void m40816observeIdCardNo$lambda13(UpgradeAccountFragment upgradeAccountFragment, CharSequence charSequence) {
        Log_OC.getArray(upgradeAccountFragment, "this$0");
        IdType $r2 = upgradeAccountFragment.idType;
        if ($r2 == null) {
            return;
        }
        String $r3 = $r2.getId();
        IdTypes $r4 = IdTypes.NIMC_SLIP;
        String $r5 = $r4.getId();
        boolean $z0 = Log_OC.append($r3, $r5);
        if ($z0) {
            int $i0 = charSequence.length();
            if ($i0 >= 11) {
                UpgradeViewModel $r6 = upgradeAccountFragment.getUpgradeViewModel();
                $r6.publishIsIdCardNumberEmpty(false);
                upgradeAccountFragment.showViewsWhenIdIsSelected();
                return;
            }
            UpgradeViewModel $r62 = upgradeAccountFragment.getUpgradeViewModel();
            $r62.publishIsIdCardNumberEmpty(true);
            upgradeAccountFragment.hideViewsWhenIdIsSelected();
            return;
        }
        int $i02 = charSequence.length();
        int $i1 = $r2.getValidLength();
        if ($i02 >= $i1) {
            UpgradeViewModel $r63 = upgradeAccountFragment.getUpgradeViewModel();
            $r63.publishIsIdCardNumberEmpty(false);
            upgradeAccountFragment.showViewsWhenIdIsSelected();
            return;
        }
        UpgradeViewModel $r64 = upgradeAccountFragment.getUpgradeViewModel();
        $r64.publishIsIdCardNumberEmpty(true);
        upgradeAccountFragment.hideViewsWhenIdIsSelected();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeNextOfKinName() {
        InterfaceC8209a $r2 = requireBinding();
        FragmentUpgradeAccountBinding $r3 = (FragmentUpgradeAccountBinding) $r2;
        KudiInputField $r4 = $r3.nextOfKinView;
        EditText $r5 = $r4.getEditText();
        AbstractC11688p $r6 = EditTextExtKt.getTextChanges($r5);
        Object object = new Object() { // from class: ai.kudi.agent.settings.personal.ui.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UpgradeAccountFragment $r1 = UpgradeAccountFragment.this;
                CharSequence $r32 = (CharSequence) obj;
                UpgradeAccountFragment.m40818observeNextOfKinName$lambda8($r1, $r32);
            }
        };
        Chunk $r1 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r8 = $r6.e0(object, $r1);
        C11280b $r9 = this.textChangesDisposables;
        $r9.b($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observeNextOfKinName$lambda-8  reason: not valid java name */
    public static final void m40818observeNextOfKinName$lambda8(UpgradeAccountFragment upgradeAccountFragment, CharSequence charSequence) {
        Log_OC.getArray(upgradeAccountFragment, "this$0");
        Log_OC.loadImage(charSequence, "it");
        int $i0 = charSequence.length();
        boolean $z0 = $i0 > 0;
        if ($z0) {
            UpgradeViewModel $r2 = upgradeAccountFragment.getUpgradeViewModel();
            $r2.publishNextOfKinNameEmpty(false);
            return;
        }
        UpgradeViewModel $r22 = upgradeAccountFragment.getUpgradeViewModel();
        $r22.publishNextOfKinNameEmpty(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeNextOfKinPhone() {
        InterfaceC8209a $r2 = requireBinding();
        FragmentUpgradeAccountBinding $r3 = (FragmentUpgradeAccountBinding) $r2;
        KudiInputField $r4 = $r3.nextOfKinPhoneView;
        EditText $r5 = $r4.getEditText();
        AbstractC11688p $r6 = EditTextExtKt.getTextChanges($r5);
        Object object = new Object() { // from class: ai.kudi.agent.settings.personal.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UpgradeAccountFragment $r1 = UpgradeAccountFragment.this;
                CharSequence $r32 = (CharSequence) obj;
                UpgradeAccountFragment.m40820observeNextOfKinPhone$lambda10($r1, $r32);
            }
        };
        FalseFileFilter $r1 = FalseFileFilter.NULL_KEY;
        FavoritesArrayAdapter $r8 = $r6.e0(object, $r1);
        C11280b $r9 = this.textChangesDisposables;
        $r9.b($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observeNextOfKinPhone$lambda-10  reason: not valid java name */
    public static final void m40820observeNextOfKinPhone$lambda10(UpgradeAccountFragment upgradeAccountFragment, CharSequence charSequence) {
        Log_OC.getArray(upgradeAccountFragment, "this$0");
        int $i0 = charSequence.length();
        if ($i0 == 11) {
            UpgradeViewModel $r2 = upgradeAccountFragment.getUpgradeViewModel();
            $r2.publishNextOfKinPhonNumberEmpty(false);
            return;
        }
        UpgradeViewModel $r22 = upgradeAccountFragment.getUpgradeViewModel();
        $r22.publishNextOfKinPhonNumberEmpty(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observePicUrl() {
        InterfaceC8209a $r2 = requireBinding();
        FragmentUpgradeAccountBinding $r3 = (FragmentUpgradeAccountBinding) $r2;
        KudiInputField $r4 = $r3.picUrlView;
        $r4.disableEditablity();
        KudiInputField $r42 = $r3.picUrlView;
        EditText $r5 = $r42.getEditText();
        AbstractC11688p $r6 = EditTextExtKt.getTextChanges($r5);
        Object object = new Object() { // from class: ai.kudi.agent.settings.personal.ui.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UpgradeAccountFragment $r1 = UpgradeAccountFragment.this;
                CharSequence $r32 = (CharSequence) obj;
                UpgradeAccountFragment.m40822observePicUrl$lambda7$lambda5($r1, $r32);
            }
        };
        FormatedText $r1 = FormatedText.SINGLE_SPACE;
        FavoritesArrayAdapter $r8 = $r6.e0(object, $r1);
        C11280b $r9 = this.textChangesDisposables;
        $r9.b($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observePicUrl$lambda-7$lambda-5  reason: not valid java name */
    public static final void m40822observePicUrl$lambda7$lambda5(UpgradeAccountFragment upgradeAccountFragment, CharSequence charSequence) {
        Log_OC.getArray(upgradeAccountFragment, "this$0");
        Log_OC.loadImage(charSequence, "it");
        int $i0 = charSequence.length();
        boolean $z0 = $i0 > 0;
        if ($z0) {
            UpgradeViewModel $r2 = upgradeAccountFragment.getUpgradeViewModel();
            $r2.publishIsPicUrlEmpty(false);
            return;
        }
        UpgradeViewModel $r22 = upgradeAccountFragment.getUpgradeViewModel();
        $r22.publishIsPicUrlEmpty(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40824onViewCreated$lambda2$lambda1(UpgradeAccountFragment upgradeAccountFragment, FragmentUpgradeAccountBinding fragmentUpgradeAccountBinding, View view) {
        Log_OC.getArray(upgradeAccountFragment, "this$0");
        Log_OC.getArray(fragmentUpgradeAccountBinding, "$this_apply");
        KudiInputField $r9 = fragmentUpgradeAccountBinding.nextOfKinView;
        String $r0 = $r9.getText();
        upgradeAccountFragment.nameNextOfKin = $r0;
        KudiInputField $r92 = fragmentUpgradeAccountBinding.idNumberView;
        String $r02 = $r92.getText();
        upgradeAccountFragment.verificationNumber = $r02;
        KudiInputField $r93 = fragmentUpgradeAccountBinding.residentialAddressView;
        String $r03 = $r93.getText();
        upgradeAccountFragment.residentialAddress = $r03;
        KudiInputField $r94 = fragmentUpgradeAccountBinding.nextOfKinView;
        String $r04 = $r94.getText();
        upgradeAccountFragment.nameNextOfKin = $r04;
        KudiInputField $r95 = fragmentUpgradeAccountBinding.nextOfKinPhoneView;
        String $r05 = $r95.getText();
        upgradeAccountFragment.nextOfKinPhone = $r05;
        KudiInputField $r96 = fragmentUpgradeAccountBinding.idCardNumberView;
        String $r06 = $r96.getText();
        upgradeAccountFragment.idNo = $r06;
        UpgradeViewModel $r10 = upgradeAccountFragment.getUpgradeViewModel();
        String $r07 = upgradeAccountFragment.verificationNumber;
        String $r1 = upgradeAccountFragment.residentialAddress;
        String $r2 = upgradeAccountFragment.nextOfKinPhone;
        String $r3 = upgradeAccountFragment.nameNextOfKin;
        IdType $r11 = upgradeAccountFragment.idType;
        String $r4 = $r11 == null ? null : $r11.getName();
        String $r12 = $r4 != null ? $r4 : "";
        String $r42 = upgradeAccountFragment.idNo;
        String $r5 = upgradeAccountFragment.picUrl;
        Bundle $r13 = upgradeAccountFragment.requireArguments();
        String $r14 = $r13.getString(ARG_CURRENT_KYC_LEVEL);
        if ($r14 == null) {
            $r14 = "";
        }
        $r10.submitInfo($r07, $r1, $r2, $r3, $r12, $r42, $r5, $r14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performClick() {
        IdtypesFragment.Companion $r1 = IdtypesFragment.Companion;
        IdtypesFragment $r2 = $r1.newInstance();
        UpgradeAccountFragment$performClick$1 $r3 = new UpgradeAccountFragment$performClick$1(this);
        $r2.setCallback($r3);
        FragmentActivity $r4 = getActivity();
        if ($r4 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw $r6;
        }
        SettingsActivity $r5 = (SettingsActivity) $r4;
        AppCompatActivityExtKt.startFragment$default($r5, $r2, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setIdPreview() {
        int $i0;
        InterfaceC8209a $r1 = requireBinding();
        FragmentUpgradeAccountBinding $r2 = (FragmentUpgradeAccountBinding) $r1;
        IdType $r3 = this.idType;
        String $r4 = $r3 == null ? null : $r3.getId();
        if ($r4 == null) {
            $r4 = "";
        }
        IdTypes $r5 = TransactionsUtilKt.findIdTypeById($r4);
        if ($r5 == null) {
            $i0 = -1;
        } else {
            int[] $r6 = WhenMappings.$EnumSwitchMapping$0;
            int $i02 = $r5.ordinal();
            $i0 = $r6[$i02];
        }
        if ($i0 == 1) {
            ImageView $r7 = $r2.idPreview;
            $r7.setImageResource(C0001R.C0002drawable.ic_drivers_lisence);
        } else if ($i0 == 2) {
            ImageView $r72 = $r2.idPreview;
            $r72.setImageResource(C0001R.C0002drawable.ic_nimc);
        } else if ($i0 == 3) {
            ImageView $r73 = $r2.idPreview;
            $r73.setImageResource(C0001R.C0002drawable.ic_national_id);
        } else if ($i0 == 4) {
            ImageView $r74 = $r2.idPreview;
            $r74.setImageResource(C0001R.C0002drawable.ic_passport);
        } else if ($i0 == 5) {
            ImageView $r75 = $r2.idPreview;
            $r75.setImageResource(C0001R.C0002drawable.ic_voters_card);
        } else {
            ImageView $r76 = $r2.idPreview;
            Log_OC.loadImage($r76, "idPreview");
            ViewExtKt.hide$default($r76, false, 1, null);
            View $r8 = $r2.enterNoTextView;
            Log_OC.loadImage($r8, "enterNoTextView");
            View r9 = $r8;
            ViewExtKt.hide$default(r9, false, 1, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showViewsWhenIdIsSelected() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentUpgradeAccountBinding $r2 = (FragmentUpgradeAccountBinding) $r1;
        View $r3 = $r2.idNumberLabel;
        Log_OC.loadImage($r3, "idNumberLabel");
        View r7 = $r3;
        ViewExtKt.show(r7);
        UpgradeViewModel $r4 = getUpgradeViewModel();
        $r4.publishVerificationNumberType();
        View $r5 = $r2.residentialAddressView;
        Log_OC.loadImage($r5, "residentialAddressView");
        View r72 = $r5;
        ViewExtKt.show(r72);
        ImageView $r6 = $r2.idPreview;
        Log_OC.loadImage($r6, "idPreview");
        ViewExtKt.hide$default($r6, false, 1, null);
        View $r32 = $r2.enterNoTextView;
        Log_OC.loadImage($r32, "enterNoTextView");
        View r73 = $r32;
        ViewExtKt.hide$default(r73, false, 1, null);
        View $r52 = $r2.nextOfKinPhoneView;
        Log_OC.loadImage($r52, "nextOfKinPhoneView");
        View r74 = $r52;
        ViewExtKt.show(r74);
        View $r53 = $r2.nextOfKinView;
        Log_OC.loadImage($r53, "nextOfKinView");
        View r75 = $r53;
        ViewExtKt.show(r75);
        View $r54 = $r2.picUrlView;
        Log_OC.loadImage($r54, "picUrlView");
        View r76 = $r54;
        ViewExtKt.show(r76);
        View $r33 = $r2.utilityBillLabel;
        Log_OC.loadImage($r33, "utilityBillLabel");
        View r77 = $r33;
        ViewExtKt.show(r77);
        View $r34 = $r2.nextOfKinLabel;
        Log_OC.loadImage($r34, "nextOfKinLabel");
        View r78 = $r34;
        ViewExtKt.show(r78);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void subscribeToViewModel() {
        UpgradeViewModel $r1 = getUpgradeViewModel();
        C11680b $r2 = $r1.getToastMessages();
        PreferenceActivity $r3 = getViewLifecycleOwner();
        Log_OC.loadImage($r3, "viewLifecycleOwner");
        AbstractC11688p $r4 = C7390a.a($r2, $r3);
        Object object = new Object() { // from class: ai.kudi.agent.settings.personal.ui.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UpgradeAccountFragment $r12 = UpgradeAccountFragment.this;
                String $r32 = (String) obj;
                UpgradeAccountFragment.m40825subscribeToViewModel$lambda3($r12, $r32);
            }
        };
        Token $r6 = Token.GREATER_THAN;
        $r4.e0(object, $r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: subscribeToViewModel$lambda-3  reason: not valid java name */
    public static final void m40825subscribeToViewModel$lambda3(UpgradeAccountFragment upgradeAccountFragment, String str) {
        Log_OC.getArray(upgradeAccountFragment, "this$0");
        FragmentActivity $r1 = upgradeAccountFragment.requireActivity();
        Log_OC.loadImage($r1, "requireActivity()");
        ContextExtKt.toast($r1, str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: subscribeToViewModel$lambda-4  reason: not valid java name */
    public static final void m40826subscribeToViewModel$lambda4(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        UpgradeViewData $r2 = (UpgradeViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.settings.personal.p027ui.viewModels.data.UpgradeViewData r33) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.UpgradeAccountFragment.applyViewData(ai.kudi.agent.settings.personal.ui.viewModels.data.UpgradeViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        UpgradeViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public UpgradeViewModel createViewModel() {
        UpgradeViewModel $r1 = getUpgradeViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPref() {
        SharedPreferences $r1 = this.sharedPref;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPref");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UpgradeViewModel getUpgradeViewModel() {
        UpgradeViewModel $r1 = this.upgradeViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("upgradeViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return UpgradeViewModel.class;
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
        LayoutInflater $r1 = getLayoutInflater();
        FragmentUpgradeAccountBinding $r4 = FragmentUpgradeAccountBinding.inflate($r1, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(layoutInflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C11280b $r1 = this.textChangesDisposables;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog $r1 = this.loader;
        if ($r1 != null) {
            if ($r1 == null) {
                Log_OC.LogError("loader");
                NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
                throw r2;
            }
            boolean $z0 = $r1.isShowing();
            if ($z0) {
                Dialog $r12 = this.loader;
                if ($r12 != null) {
                    $r12.dismiss();
                    return;
                }
                Log_OC.LogError("loader");
                NullPointerException r22 = new NullPointerException("Null throw statement replaced by Soot");
                throw r22;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Context $r4 = requireContext();
        Dialog r16 = new Dialog($r4);
        Window $r5 = r16.getWindow();
        WindowManager.LayoutParams $r6 = $r5 == null ? null : $r5.getAttributes();
        if ($r6 != null) {
            $r6.windowAnimations = C0001R.style.DialogAnimation;
        }
        r16.setContentView(C0001R.C0004layout.upgrade_view_dialog);
        r16.setCancelable(false);
        C13666w c13666w = C13666w.f30112a;
        this.loader = r16;
        String $r8 = getString(C0001R.string.upgrade_account);
        Log_OC.loadImage($r8, "getString(R.string.upgrade_account)");
        SettingsActivityExtKt.setSettingsTitle(this, $r8);
        SettingsActivityExtKt.setSettingsTitleBarColor$default(this, C0001R.color.colorPrimary, 0, 2, null);
        hideViewsWhenIdIsSelected();
        observeIdCardNo();
        observeNextOfKinPhone();
        observeNextOfKinName();
        observePicUrl();
        InterfaceC8209a $r9 = requireBinding();
        final FragmentUpgradeAccountBinding $r10 = (FragmentUpgradeAccountBinding) $r9;
        KudiInputField $r11 = $r10.selectCardView;
        $r11.disableEditablity();
        KudiInputField $r112 = $r10.selectCardView;
        UpgradeAccountFragment$onViewCreated$2$1 r17 = new UpgradeAccountFragment$onViewCreated$2$1(this);
        $r112.setClickedListener(r17);
        ViewGroup $r13 = $r10.submitButton;
        ViewGroup r20 = $r13;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.personal.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UpgradeAccountFragment $r2 = UpgradeAccountFragment.this;
                FragmentUpgradeAccountBinding $r3 = $r10;
                UpgradeAccountFragment.m40824onViewCreated$lambda2$lambda1($r2, $r3, view2);
            }
        });
        KudiInputField $r113 = $r10.picUrlView;
        UpgradeAccountFragment$onViewCreated$2$3 r19 = new UpgradeAccountFragment$onViewCreated$2$3(this, $r10);
        $r113.setClickedListener(r19);
        subscribeToViewModel();
    }

    public final void setSharedPref(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPref = sharedPreferences;
    }

    public final void setUpgradeViewModel(UpgradeViewModel upgradeViewModel) {
        Log_OC.getArray(upgradeViewModel, "<set-?>");
        this.upgradeViewModel = upgradeViewModel;
    }
}
