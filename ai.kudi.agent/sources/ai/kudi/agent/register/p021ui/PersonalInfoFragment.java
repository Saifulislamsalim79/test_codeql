package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.ViewRegisterPersonalInfoBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.setup.DashboardData;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p021ui.viewmodels.PersonalInfoViewModel;
import ai.kudi.agent.register.p021ui.viewmodels.data.PersonalInfoViewData;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import ai.kudi.agent.statesandlgapicker.dialogs.StateFragment;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: PersonalInfoFragment.kt */
@Metadata(m10422d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 Y2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001YB\u0005¢\u0006\u0002\u0010\u0005J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\u0003H\u0014J\b\u00106\u001a\u00020\u0002H\u0014J\b\u00107\u001a\u000201H\u0002J.\u00108\u001a\b\u0012\u0004\u0012\u00020\t0&2\u0006\u00109\u001a\u00020\t2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0002J&\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0&2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0002J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020;H\u0014J\b\u0010<\u001a\u000201H\u0002J\u0010\u0010=\u001a\u0002012\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u000201H\u0002J\u0012\u0010A\u001a\u0002012\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J$\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J-\u0010J\u001a\u0002012\u0006\u0010K\u001a\u00020L2\u000e\u0010M\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0N2\u0006\u0010O\u001a\u00020PH\u0016¢\u0006\u0002\u0010QJ\b\u0010R\u001a\u000201H\u0016J\u001a\u0010S\u001a\u0002012\u0006\u0010T\u001a\u00020E2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010U\u001a\u000201H\u0002J\b\u0010V\u001a\u00020WH\u0002J\b\u0010X\u001a\u000201H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006Z"}, m10421d2 = {"Lai/kudi/agent/register/ui/PersonalInfoFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/ui/viewmodels/PersonalInfoViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/PersonalInfoViewData;", "Lai/kudi/agent/databinding/ViewRegisterPersonalInfoBinding;", "()V", "dashboardData", "Lai/kudi/agent/login/setup/DashboardData;", "isFrom", "", "lga", "getLga", "()Ljava/lang/String;", "setLga", "(Ljava/lang/String;)V", "lgaLatitude", "", "getLgaLatitude", "()F", "setLgaLatitude", "(F)V", "lgaLongitude", "getLgaLongitude", "setLgaLongitude", "locationList", "Ljava/util/ArrayList;", "Lai/kudi/agent/register/data/models/LocationModel;", "Lkotlin/collections/ArrayList;", "getLocationList", "()Ljava/util/ArrayList;", "setLocationList", "(Ljava/util/ArrayList;)V", "registrationData", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", SendReceiptToTerminalConfirmationBottomSheet.STATE, "getState", "setState", "states", "", "getStates", "()Ljava/util/List;", "setStates", "(Ljava/util/List;)V", "vm", "getVm", "()Lai/kudi/agent/register/ui/viewmodels/PersonalInfoViewModel;", "setVm", "(Lai/kudi/agent/register/ui/viewmodels/PersonalInfoViewModel;)V", "applyErrors", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/register/ui/viewmodels/data/PersonalInfoViewData$Error;", "applyViewData", "viewData", "createViewModel", "editProfile", "getLgaFromList", "stateLocation", "getVMType", "Ljava/lang/Class;", "loadStates", "onAttach", "context", "Landroid/content/Context;", "onContinueClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "setupView", "showLga", "", "showStates", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.PersonalInfoFragment */
/* loaded from: classes.dex */
public final class PersonalInfoFragment extends BaseMVVMViewBindingFragment<PersonalInfoViewModel, PersonalInfoViewData, ViewRegisterPersonalInfoBinding> {
    private static final String ARGS_REG_INFO;
    public static final Companion Companion;
    private DashboardData dashboardData;
    private String isFrom;
    private float lgaLatitude;
    private float lgaLongitude;
    private ArrayList<LocationModel> locationList;
    private RegistrationInfo registrationData;
    public PersonalInfoViewModel srv;
    private List<String> states;
    private String state = "";
    private String alias = "";

    /* compiled from: PersonalInfoFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/register/ui/PersonalInfoFragment$Companion;", "", "()V", "ARGS_REG_INFO", "", "getARGS_REG_INFO", "()Ljava/lang/String;", "newInstance", "Lai/kudi/agent/register/ui/PersonalInfoFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "isFrom", "dashboardData", "Lai/kudi/agent/login/setup/DashboardData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.PersonalInfoFragment$Companion */
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
        public static /* synthetic */ PersonalInfoFragment newInstance$default(Companion companion, RegistrationInfo registrationInfo, String $r3, DashboardData $r4, int i, Object obj) {
            int $i1 = i & 2;
            if ($i1 != 0) {
                $r3 = "";
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r4 = null;
            }
            PersonalInfoFragment $r1 = companion.newInstance(registrationInfo, $r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getARGS_REG_INFO() {
            String $r1 = PersonalInfoFragment.ARGS_REG_INFO;
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final PersonalInfoFragment newInstance(RegistrationInfo registrationInfo, String str, DashboardData dashboardData) {
            Log_OC.getArray(str, "isFrom");
            PersonalInfoFragment $r3 = new PersonalInfoFragment();
            Bundle $r4 = new Bundle();
            String $r5 = getARGS_REG_INFO();
            $r4.putParcelable($r5, registrationInfo);
            $r4.putString("isFrom", str);
            $r4.putParcelable(LoginParams.DASHBOARD_DATA, dashboardData);
            $r3.setArguments($r4);
            return $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        ARGS_REG_INFO = "ARGS_REG_INFO";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PersonalInfoFragment() {
        ArrayList $r1 = new ArrayList();
        this.locationList = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyErrors(PersonalInfoViewData.Error error) {
        InterfaceC8209a $r2 = requireBinding();
        ViewRegisterPersonalInfoBinding $r3 = (ViewRegisterPersonalInfoBinding) $r2;
        if (error == null) {
            return;
        }
        KudiInputField $r4 = $r3.residentialAddressField;
        String $r5 = error.getResidentialAddress();
        $r4.setError($r5);
        KudiInputField $r42 = $r3.closestLandmarkField;
        String $r52 = error.getClosestLandmark();
        $r42.setError($r52);
        KudiInputField $r43 = $r3.stateField;
        String $r53 = error.getStateError();
        $r43.setError($r53);
        KudiInputField $r44 = $r3.lgaField;
        String $r54 = error.getLgaError();
        $r44.setError($r54);
        FragmentActivity $r6 = requireActivity();
        Log_OC.loadImage($r6, "requireActivity()");
        String $r55 = error.getGenderError();
        ContextExtKt.toast$default($r6, $r55, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void editProfile() {
        InterfaceC8209a $r3 = requireBinding();
        ViewRegisterPersonalInfoBinding $r4 = (ViewRegisterPersonalInfoBinding) $r3;
        RegistrationInfo $r1 = this.registrationData;
        if ($r1 == null) {
            return;
        }
        KudiInputField $r5 = $r4.residentialAddressField;
        String $r6 = $r5.getText();
        KudiInputField $r52 = $r4.closestLandmarkField;
        String $r7 = $r52.getText();
        KudiInputField $r53 = $r4.stateField;
        String $r8 = $r53.getText();
        KudiInputField $r54 = $r4.lgaField;
        String $r9 = $r54.getText();
        String $r10 = this.isFrom;
        if ($r10 == null) {
            $r10 = "";
        }
        DashboardData $r2 = this.dashboardData;
        PersonalInfoViewModel $r11 = getVm();
        $r11.editProfile($r6, $r7, $r9, $r8, $r1, $r10, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:25:0x002d */
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p021ui.PersonalInfoFragment.getLgaFromList(java.lang.String, java.util.ArrayList):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:13:0x000d */
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p021ui.PersonalInfoFragment.getStates(java.util.ArrayList):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadStates() {
        PersonalInfoViewModel $r1 = getVm();
        $r1.fetchLocation();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onContinueClicked() {
        ContextExtKt.hideKeyboard(this);
        InterfaceC8209a $r3 = requireBinding();
        ViewRegisterPersonalInfoBinding $r4 = (ViewRegisterPersonalInfoBinding) $r3;
        KudiInputField $r5 = $r4.residentialAddressField;
        String $r6 = $r5.getText();
        InterfaceC8209a $r32 = requireBinding();
        ViewRegisterPersonalInfoBinding $r42 = (ViewRegisterPersonalInfoBinding) $r32;
        KudiInputField $r52 = $r42.closestLandmarkField;
        String $r7 = $r52.getText();
        FragmentActivity $r8 = requireActivity();
        Log_OC.loadImage($r8, "requireActivity()");
        LocationUtil $r1 = new LocationUtil($r8);
        Context $r9 = requireActivity().getApplicationContext();
        C4107a $r10 = C4109b.m28502b($r9);
        Log_OC.loadImage($r10, "getFusedLocationProviderClient(requireActivity().applicationContext)");
        PersonalInfoFragment$onContinueClicked$1 $r2 = new PersonalInfoFragment$onContinueClicked$1(this, $r6, $r7);
        LocationUtil.getLastLocation$default($r1, $r10, 0, $r2, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupView() {
        InterfaceC8209a $r2 = requireBinding();
        ViewRegisterPersonalInfoBinding $r3 = (ViewRegisterPersonalInfoBinding) $r2;
        final RegistrationInfo $r4 = this.registrationData;
        if ($r4 != null) {
            TextView $r5 = $r3.pageTitle;
            PersonalInfo $r6 = $r4.getPersonalInfo();
            String $r7 = $r6.getFirstName();
            Object[] $r1 = {$r7};
            String $r72 = getString(C0001R.string.welcome_text, $r1);
            $r5.setText($r72);
            RadioButton $r8 = $r3.femaleRadioButton;
            RadioButton r27 = $r8;
            r27.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.ImportExport$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RegistrationInfo $r22 = RegistrationInfo.this;
                    PersonalInfoFragment $r32 = this;
                    PersonalInfoFragment.m40380setupView$lambda9$lambda3$lambda1($r22, $r32, view);
                }
            });
            RadioButton $r82 = $r3.maleRadioButton;
            RadioButton r272 = $r82;
            r272.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.l
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RegistrationInfo $r22 = RegistrationInfo.this;
                    PersonalInfoFragment $r32 = this;
                    PersonalInfoFragment.m40381setupView$lambda9$lambda3$lambda2($r22, $r32, view);
                }
            });
        }
        ViewGroup $r11 = $r3.continueToNextPage;
        ViewGroup r28 = $r11;
        r28.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.EditEventView$6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalInfoFragment $r22 = PersonalInfoFragment.this;
                PersonalInfoFragment.m40382setupView$lambda9$lambda4($r22, view);
            }
        });
        ArrayList $r13 = getLocationList();
        int $i0 = $r13.size();
        if ($i0 <= 0) {
            loadStates();
        }
        KudiInputField $r14 = $r3.stateField;
        EditText $r15 = $r14.getEditText();
        $r15.setFocusable(false);
        KudiInputField $r142 = $r3.lgaField;
        EditText $r152 = $r142.getEditText();
        $r152.setFocusable(false);
        KudiInputField $r143 = $r3.lgaField;
        EditText $r153 = $r143.getEditText();
        $r153.setClickable(true);
        KudiInputField $r144 = $r3.stateField;
        EditText $r154 = $r144.getEditText();
        $r154.setClickable(true);
        ViewGroup $r145 = $r3.stateField;
        ViewGroup r282 = $r145;
        r282.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.ExportActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalInfoFragment $r22 = PersonalInfoFragment.this;
                PersonalInfoFragment.m40383setupView$lambda9$lambda5($r22, view);
            }
        });
        KudiInputField $r146 = $r3.stateField;
        EditText $r155 = $r146.getEditText();
        $r155.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalInfoFragment $r22 = PersonalInfoFragment.this;
                PersonalInfoFragment.m40384setupView$lambda9$lambda6($r22, view);
            }
        });
        KudiInputField $r147 = $r3.lgaField;
        EditText $r156 = $r147.getEditText();
        $r156.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.DatePicker
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalInfoFragment $r22 = PersonalInfoFragment.this;
                PersonalInfoFragment.m40385setupView$lambda9$lambda7($r22, view);
            }
        });
        ViewGroup $r148 = $r3.lgaField;
        ViewGroup r283 = $r148;
        r283.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalInfoFragment $r22 = PersonalInfoFragment.this;
                PersonalInfoFragment.m40386setupView$lambda9$lambda8($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-9$lambda-3$lambda-1 */
    public static final void m40380setupView$lambda9$lambda3$lambda1(RegistrationInfo registrationInfo, PersonalInfoFragment personalInfoFragment, View view) {
        Log_OC.getArray(registrationInfo, "$it");
        Log_OC.getArray(personalInfoFragment, "this$0");
        PersonalInfo $r3 = registrationInfo.getPersonalInfo();
        String $r4 = personalInfoFragment.getString(C0001R.string.female);
        $r3.setGender($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-9$lambda-3$lambda-2 */
    public static final void m40381setupView$lambda9$lambda3$lambda2(RegistrationInfo registrationInfo, PersonalInfoFragment personalInfoFragment, View view) {
        Log_OC.getArray(registrationInfo, "$it");
        Log_OC.getArray(personalInfoFragment, "this$0");
        PersonalInfo $r3 = registrationInfo.getPersonalInfo();
        String $r4 = personalInfoFragment.getString(C0001R.string.male);
        $r3.setGender($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-9$lambda-4 */
    public static final void m40382setupView$lambda9$lambda4(PersonalInfoFragment personalInfoFragment, View view) {
        Log_OC.getArray(personalInfoFragment, "this$0");
        FragmentActivity $r1 = personalInfoFragment.getActivity();
        boolean $z0 = $r1 instanceof BvnExistingAgentActivity;
        if ($z0) {
            personalInfoFragment.editProfile();
        } else {
            personalInfoFragment.onContinueClicked();
        }
    }

    /* renamed from: setupView$lambda-9$lambda-5 */
    public static final void m40383setupView$lambda9$lambda5(PersonalInfoFragment personalInfoFragment, View view) {
        Log_OC.getArray(personalInfoFragment, "this$0");
        personalInfoFragment.showStates();
    }

    /* renamed from: setupView$lambda-9$lambda-6 */
    public static final void m40384setupView$lambda9$lambda6(PersonalInfoFragment personalInfoFragment, View view) {
        Log_OC.getArray(personalInfoFragment, "this$0");
        personalInfoFragment.showStates();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-9$lambda-7 */
    public static final void m40385setupView$lambda9$lambda7(PersonalInfoFragment personalInfoFragment, View view) {
        Log_OC.getArray(personalInfoFragment, "this$0");
        boolean $z0 = personalInfoFragment.showLga();
        if ($z0) {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-9$lambda-8 */
    public static final void m40386setupView$lambda9$lambda8(PersonalInfoFragment personalInfoFragment, View view) {
        Log_OC.getArray(personalInfoFragment, "this$0");
        boolean $z0 = personalInfoFragment.showLga();
        if ($z0) {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean showLga() {
        boolean $z0;
        InterfaceC8209a $r1 = requireBinding();
        ViewRegisterPersonalInfoBinding $r2 = (ViewRegisterPersonalInfoBinding) $r1;
        KudiInputField $r3 = $r2.stateField;
        String $r4 = $r3.getText();
        $z0 = C13276s.m5440u($r4);
        if ($z0) {
            InterfaceC8209a $r12 = requireBinding();
            ViewRegisterPersonalInfoBinding $r22 = (ViewRegisterPersonalInfoBinding) $r12;
            KudiInputField $r32 = $r22.stateField;
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
        PersonalInfoFragment$showLga$1$1 $r9 = new PersonalInfoFragment$showLga$1$1(this, $r8);
        $r8.setCallback($r9);
        FragmentManager $r10 = requireFragmentManager();
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
        PersonalInfoFragment$showStates$1$1 $r4 = new PersonalInfoFragment$showStates$1$1(this, $r3);
        $r3.setCallback($r4);
        FragmentManager $r5 = requireFragmentManager();
        $r3.show($r5, "Select State");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PersonalInfoViewData $r2 = (PersonalInfoViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PersonalInfoViewData personalInfoViewData) {
        Log_OC.getArray(personalInfoViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        ViewRegisterPersonalInfoBinding $r3 = (ViewRegisterPersonalInfoBinding) $r2;
        boolean $z0 = personalInfoViewData.isLoading();
        if ($z0) {
            KudiButton $r4 = $r3.continueToNextPage;
            $r4.m38032f();
        } else {
            KudiButton $r42 = $r3.continueToNextPage;
            $r42.m38033e();
        }
        User $r5 = personalInfoViewData.getUserProfile();
        if ($r5 != null) {
            TextView $r6 = $r3.pageTitle;
            String $r8 = $r5.getFirstName();
            Object[] $r7 = {$r8};
            String $r82 = getString(C0001R.string.welcome_text, $r7);
            $r6.setText($r82);
            KudiInputField $r9 = $r3.residentialAddressField;
            String $r83 = $r5.getHomeAddress();
            $r9.setText($r83);
            KudiInputField $r92 = $r3.closestLandmarkField;
            String $r84 = $r5.closestLandmark;
            $r92.setText($r84);
            KudiInputField $r93 = $r3.stateField;
            String $r85 = $r5.state;
            $r93.setText($r85);
            KudiInputField $r94 = $r3.lgaField;
            String $r86 = $r5.country;
            $r94.setText($r86);
        }
        List $r10 = personalInfoViewData.getLocation();
        if ($r10 != null) {
            ArrayList $r11 = (ArrayList) $r10;
            setLocationList($r11);
            ArrayList $r112 = getLocationList();
            setStates(getStates($r112));
        }
        PersonalInfoViewData.Error $r12 = personalInfoViewData.getError();
        applyErrors($r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PersonalInfoViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PersonalInfoViewModel createViewModel() {
        PersonalInfoViewModel $r1 = getVm();
        return $r1;
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
    public final String getState() {
        String r1 = this.state;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getStates() {
        List r1 = this.states;
        return r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PersonalInfoViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PersonalInfoViewModel getVm() {
        PersonalInfoViewModel $r1 = this.srv;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("vm");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        boolean $z0 = $r2 instanceof RegisterActivity;
        if ($z0) {
            FragmentActivity $r22 = getActivity();
            if ($r22 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.register.v2.ui.RegisterActivity");
                throw $r5;
            }
            RegisterActivity $r3 = (RegisterActivity) $r22;
            RegistrationSubComponent $r4 = $r3.getRegistrationV2SubComponent();
            $r4.inject(this);
            return;
        }
        boolean $z02 = $r2 instanceof BvnExistingAgentActivity;
        if ($z02) {
            FragmentActivity $r23 = getActivity();
            if ($r23 == null) {
                NullPointerException $r52 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.BvnExistingAgentActivity");
                throw $r52;
            }
            BvnExistingAgentActivity $r6 = (BvnExistingAgentActivity) $r23;
            BvnVerificationSubcomponent $r7 = $r6.getBvnVerificationSubComponent();
            $r7.inject(this);
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
        String $r2 = ARGS_REG_INFO;
        Parcelable $r3 = $r1.getParcelable($r2);
        RegistrationInfo $r4 = (RegistrationInfo) $r3;
        this.registrationData = $r4;
        String $r22 = $r1.getString("isFrom");
        this.isFrom = $r22;
        boolean $z0 = $r1.containsKey(LoginParams.DASHBOARD_DATA);
        if ($z0) {
            Parcelable $r32 = $r1.getParcelable(LoginParams.DASHBOARD_DATA);
            DashboardData $r5 = (DashboardData) $r32;
            this.dashboardData = $r5;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentActivity $r4 = requireActivity();
        Window $r5 = $r4.getWindow();
        $r5.setSoftInputMode(16);
        ViewRegisterPersonalInfoBinding $r6 = ViewRegisterPersonalInfoBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r6, "inflate(inflater, container, false)");
        View $r7 = initBinding($r6, this);
        return $r7;
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
                    onContinueClicked();
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
    public void onResume() {
        super.onResume();
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            return;
        }
        $r1.setTitle(C0001R.string.business_information);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setupView();
        FragmentActivity $r3 = getActivity();
        boolean $z0 = $r3 instanceof BvnExistingAgentActivity;
        if ($z0) {
            PersonalInfoViewModel $r4 = getVm();
            $r4.start();
        }
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

    public final void setState(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.state = str;
    }

    public final void setStates(List list) {
        this.states = list;
    }

    public final void setVm(PersonalInfoViewModel personalInfoViewModel) {
        Log_OC.getArray(personalInfoViewModel, "<set-?>");
        this.srv = personalInfoViewModel;
    }
}
