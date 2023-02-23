package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.ViewRegisterBusinessInfoBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.setup.DashboardData;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.agent.register.domain.dto.BusinessCategoryData;
import ai.kudi.agent.register.domain.wiki.AccountType;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p021ui.viewmodels.BusinessInfoViewModel;
import ai.kudi.agent.register.p021ui.viewmodels.data.BusinessInfoViewData;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import ai.kudi.agent.statesandlgapicker.dialogs.StateFragment;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ProgressBar;
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
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: BusinessInfoFragment.kt */
@Metadata(m10422d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001bB\u0005¢\u0006\u0002\u0010\u0005J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0010\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020\u0003H\u0014J\b\u0010;\u001a\u00020\u0002H\u0014J\b\u0010<\u001a\u000206H\u0002J.\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010>\u001a\u00020\u00102\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#H\u0002J&\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#H\u0002J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020@H\u0014J\b\u0010A\u001a\u000206H\u0002J\u0010\u0010B\u001a\u0002062\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u000206H\u0002J\u0012\u0010F\u001a\u0002062\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J&\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J-\u0010O\u001a\u0002062\u0006\u0010P\u001a\u00020Q2\u000e\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100S2\u0006\u0010T\u001a\u00020UH\u0016¢\u0006\u0002\u0010VJ\b\u0010W\u001a\u000206H\u0016J\u001a\u0010X\u001a\u0002062\u0006\u0010Y\u001a\u00020J2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0010\u0010Z\u001a\u0002062\u0006\u0010[\u001a\u00020)H\u0002J\b\u0010\\\u001a\u000206H\u0002J\u0016\u0010]\u001a\u0002062\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\b\u0010_\u001a\u00020`H\u0002J\b\u0010a\u001a\u000206H\u0002R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR*\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\"\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\n\"\u0004\b/\u0010\fR\u001e\u00100\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006c"}, m10421d2 = {"Lai/kudi/agent/register/ui/BusinessInfoFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/ui/viewmodels/BusinessInfoViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/BusinessInfoViewData;", "Lai/kudi/agent/databinding/ViewRegisterBusinessInfoBinding;", "()V", "businessCategories", "", "Lai/kudi/agent/register/domain/dto/BusinessCategoryData;", "getBusinessCategories", "()Ljava/util/List;", "setBusinessCategories", "(Ljava/util/List;)V", "dashboardData", "Lai/kudi/agent/login/setup/DashboardData;", "isFrom", "", "lastSelectedCategory", "lga", "getLga", "()Ljava/lang/String;", "setLga", "(Ljava/lang/String;)V", "lgaLatitude", "", "getLgaLatitude", "()F", "setLgaLatitude", "(F)V", "lgaLongitude", "getLgaLongitude", "setLgaLongitude", "locationList", "Ljava/util/ArrayList;", "Lai/kudi/agent/register/data/models/LocationModel;", "Lkotlin/collections/ArrayList;", "getLocationList", "()Ljava/util/ArrayList;", "setLocationList", "(Ljava/util/ArrayList;)V", "registrationData", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", SendReceiptToTerminalConfirmationBottomSheet.STATE, "getState", "setState", "states", "getStates", "setStates", "vm", "getVm", "()Lai/kudi/agent/register/ui/viewmodels/BusinessInfoViewModel;", "setVm", "(Lai/kudi/agent/register/ui/viewmodels/BusinessInfoViewModel;)V", "applyErrors", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/register/ui/viewmodels/data/BusinessInfoViewData$Error;", "applyViewData", "viewData", "createViewModel", "editProfile", "getLgaFromList", "stateLocation", "getVMType", "Ljava/lang/Class;", "loadStates", "onAttach", "context", "Landroid/content/Context;", "onContinueClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "setUpAccountType", "it", "setupView", "showBottomSheet", "businessCategoryData", "showLga", "", "showStates", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.BusinessInfoFragment */
/* loaded from: classes.dex */
public final class BusinessInfoFragment extends BaseMVVMViewBindingFragment<BusinessInfoViewModel, BusinessInfoViewData, ViewRegisterBusinessInfoBinding> {
    private static final String ARGS_REG_INFO;
    public static final Companion Companion;
    private List<BusinessCategoryData> businessCategories;
    private DashboardData dashboardData;
    private String isFrom;
    private float lgaLatitude;
    private float lgaLongitude;
    private ArrayList<LocationModel> locationList;
    private RegistrationInfo registrationData;
    public BusinessInfoViewModel srv;
    private List<String> states;
    private String lastSelectedCategory = "";
    private String state = "";
    private String alias = "";

    /* compiled from: BusinessInfoFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/register/ui/BusinessInfoFragment$Companion;", "", "()V", "ARGS_REG_INFO", "", "getARGS_REG_INFO", "()Ljava/lang/String;", "newInstance", "Lai/kudi/agent/register/ui/BusinessInfoFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "isFrom", "dashboardData", "Lai/kudi/agent/login/setup/DashboardData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.BusinessInfoFragment$Companion */
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
        public static /* synthetic */ BusinessInfoFragment newInstance$default(Companion companion, RegistrationInfo registrationInfo, String $r3, DashboardData $r4, int i, Object obj) {
            int $i1 = i & 2;
            if ($i1 != 0) {
                $r3 = "";
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r4 = null;
            }
            BusinessInfoFragment $r1 = companion.newInstance(registrationInfo, $r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getARGS_REG_INFO() {
            String $r1 = BusinessInfoFragment.ARGS_REG_INFO;
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final BusinessInfoFragment newInstance(RegistrationInfo registrationInfo, String str, DashboardData dashboardData) {
            Log_OC.getArray(str, "isFrom");
            BusinessInfoFragment $r3 = new BusinessInfoFragment();
            Bundle $r4 = new Bundle();
            String $r5 = getARGS_REG_INFO();
            $r4.putParcelable($r5, registrationInfo);
            $r4.putString("isFrom", str);
            $r4.putParcelable(LoginParams.DASHBOARD_DATA, dashboardData);
            $r3.setArguments($r4);
            return $r3;
        }
    }

    /* compiled from: BusinessInfoFragment.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.BusinessInfoFragment$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            AccountType[] $r0 = AccountType.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            AccountType $r2 = AccountType.MERCHANT;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            AccountType $r22 = AccountType.AGENT;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            AccountType $r23 = AccountType.MERCHANT_AGENT;
            int $i04 = $r23.ordinal();
            $r1[$i04] = 3;
            $EnumSwitchMapping$0 = $r1;
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
    public BusinessInfoFragment() {
        List $r1;
        $r1 = C13726r.m3891e();
        this.businessCategories = $r1;
        ArrayList $r2 = new ArrayList();
        this.locationList = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyErrors(BusinessInfoViewData.Error error) {
        InterfaceC8209a $r2 = requireBinding();
        ViewRegisterBusinessInfoBinding $r3 = (ViewRegisterBusinessInfoBinding) $r2;
        if (error == null) {
            return;
        }
        KudiInputField $r4 = $r3.businessNameField;
        String $r5 = error.getBusinessNameError();
        $r4.setError($r5);
        KudiInputField $r42 = $r3.businessAddressField;
        String $r52 = error.getBusinessAddressError();
        $r42.setError($r52);
        KudiInputField $r43 = $r3.stateField;
        String $r53 = error.getBusinessStateError();
        $r43.setError($r53);
        KudiInputField $r44 = $r3.lgaField;
        String $r54 = error.getBusinessLgaError();
        $r44.setError($r54);
        KudiInputField $r45 = $r3.bussinessInfoAreaInpuitField;
        String $r55 = error.getAreaError();
        $r45.setError($r55);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void editProfile() {
        InterfaceC8209a $r3 = requireBinding();
        ViewRegisterBusinessInfoBinding $r4 = (ViewRegisterBusinessInfoBinding) $r3;
        RegistrationInfo $r1 = this.registrationData;
        if ($r1 == null) {
            return;
        }
        KudiInputField $r5 = $r4.businessAddressField;
        String $r6 = $r5.getText();
        KudiInputField $r52 = $r4.businessNameField;
        String $r7 = $r52.getText();
        KudiInputField $r53 = $r4.stateField;
        String $r8 = $r53.getText();
        KudiInputField $r54 = $r4.lgaField;
        String $r9 = $r54.getText();
        KudiInputField $r55 = $r4.specifyPrimaryBusiness;
        String $r10 = $r55.getText();
        KudiInputField $r56 = $r4.bussinessInfoAreaInpuitField;
        String $r11 = $r56.getText();
        String $r12 = this.isFrom;
        if ($r12 == null) {
            $r12 = "";
        }
        DashboardData $r2 = this.dashboardData;
        BusinessInfoViewModel $r13 = getVm();
        $r13.editProfile($r6, $r7, $r9, $r8, $r10, $r11, $r1, $r12, $r2);
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p021ui.BusinessInfoFragment.getLgaFromList(java.lang.String, java.util.ArrayList):java.util.List");
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p021ui.BusinessInfoFragment.getStates(java.util.ArrayList):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadStates() {
        BusinessInfoViewModel $r1 = getVm();
        $r1.fetchLocation();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onContinueClicked() {
        InterfaceC8209a $r3 = requireBinding();
        ViewRegisterBusinessInfoBinding $r4 = (ViewRegisterBusinessInfoBinding) $r3;
        ContextExtKt.hideKeyboard(this);
        KudiInputField $r5 = $r4.businessNameField;
        String $r6 = $r5.getText();
        KudiInputField $r52 = $r4.businessAddressField;
        String $r7 = $r52.getText();
        KudiInputField $r53 = $r4.bussinessInfoAreaInpuitField;
        String $r8 = $r53.getText();
        KudiInputField $r54 = $r4.businessEmail;
        String $r9 = $r54.getText();
        FragmentActivity $r10 = requireActivity();
        Log_OC.loadImage($r10, "requireActivity()");
        LocationUtil $r1 = new LocationUtil($r10);
        Context $r11 = requireActivity().getApplicationContext();
        C4107a $r12 = C4109b.m28502b($r11);
        Log_OC.loadImage($r12, "getFusedLocationProviderClient(requireActivity().applicationContext)");
        BusinessInfoFragment$onContinueClicked$1$1 $r2 = new BusinessInfoFragment$onContinueClicked$1$1(this, $r6, $r7, $r9, $r8);
        LocationUtil.getLastLocation$default($r1, $r12, 0, $r2, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setUpAccountType(RegistrationInfo $r1) {
        int $i0;
        PersonalInfo $r6;
        InterfaceC8209a $r2 = requireBinding();
        ViewRegisterBusinessInfoBinding $r3 = (ViewRegisterBusinessInfoBinding) $r2;
        AccountType $r4 = $r1.getAccountType();
        if ($r4 == null) {
            $i0 = -1;
        } else {
            int[] $r5 = WhenMappings.$EnumSwitchMapping$0;
            int $i02 = $r4.ordinal();
            $i0 = $r5[$i02];
        }
        if ($i0 == 1) {
            RegistrationInfo $r12 = this.registrationData;
            $r6 = $r12 != null ? $r12.getPersonalInfo() : null;
            if ($r6 != null) {
                String $r8 = $r3.specifyPrimaryBusiness.getText();
                $r6.setPrimaryBusinessCategory($r8);
            }
            View $r7 = $r3.specifyPrimaryBusiness;
            Log_OC.loadImage($r7, "specifyPrimaryBusiness");
            View r9 = $r7;
            ViewExtKt.show(r9);
        } else if ($i0 == 2) {
            PersonalInfo $r62 = $r1.getPersonalInfo();
            String $r82 = getString(C0001R.string.agency_banking);
            $r62.setPrimaryBusinessCategory($r82);
            View $r72 = $r3.specifyPrimaryBusiness;
            Log_OC.loadImage($r72, "specifyPrimaryBusiness");
            View r92 = $r72;
            ViewExtKt.hide$default(r92, false, 1, null);
        } else if ($i0 != 3) {
        } else {
            RegistrationInfo $r13 = this.registrationData;
            $r6 = $r13 != null ? $r13.getPersonalInfo() : null;
            if ($r6 != null) {
                String $r83 = $r3.specifyPrimaryBusiness.getText();
                $r6.setPrimaryBusinessCategory($r83);
            }
            View $r73 = $r3.specifyPrimaryBusiness;
            Log_OC.loadImage($r73, "specifyPrimaryBusiness");
            View r93 = $r73;
            ViewExtKt.show(r93);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupView() {
        InterfaceC8209a $r2 = requireBinding();
        ViewRegisterBusinessInfoBinding $r3 = (ViewRegisterBusinessInfoBinding) $r2;
        RegistrationInfo $r4 = this.registrationData;
        if ($r4 != null) {
            setUpAccountType($r4);
            TextView $r5 = $r3.pageTitle;
            Object[] $r1 = new Object[1];
            PersonalInfo $r6 = $r4.getPersonalInfo();
            String $r7 = $r6.getFirstName();
            String $r8 = $r7;
            if ($r7 == null) {
                $r8 = "";
            }
            $r1[0] = $r8;
            $r5.setText(getString(C0001R.string.welcome_text, $r1));
        }
        KudiInputField $r9 = $r3.specifyPrimaryBusiness;
        $r9.disableEditablity();
        BusinessInfoFragment$setupView$1$2$1 r19 = new BusinessInfoFragment$setupView$1$2$1(this);
        $r9.setClickedListener(r19);
        ViewGroup $r11 = $r3.continueToNextPage;
        ViewGroup r25 = $r11;
        r25.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessInfoFragment $r22 = BusinessInfoFragment.this;
                BusinessInfoFragment.m40370setupView$lambda8$lambda3($r22, view);
            }
        });
        ArrayList $r13 = getLocationList();
        int $i0 = $r13.size();
        if ($i0 <= 0) {
            loadStates();
        }
        EditText $r14 = $r3.stateField.getEditText();
        $r14.setFocusable(false);
        EditText $r142 = $r3.lgaField.getEditText();
        $r142.setFocusable(false);
        EditText $r143 = $r3.lgaField.getEditText();
        $r143.setClickable(true);
        EditText $r144 = $r3.stateField.getEditText();
        $r144.setClickable(true);
        ViewGroup r252 = $r3.stateField;
        r252.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessInfoFragment $r22 = BusinessInfoFragment.this;
                BusinessInfoFragment.m40371setupView$lambda8$lambda4($r22, view);
            }
        });
        EditText $r145 = $r3.stateField.getEditText();
        $r145.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.AddSerie$SeriesSearchAdapter$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessInfoFragment $r22 = BusinessInfoFragment.this;
                BusinessInfoFragment.m40372setupView$lambda8$lambda5($r22, view);
            }
        });
        EditText $r146 = $r3.lgaField.getEditText();
        $r146.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.ExportActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessInfoFragment $r22 = BusinessInfoFragment.this;
                BusinessInfoFragment.m40373setupView$lambda8$lambda6($r22, view);
            }
        });
        ViewGroup r253 = $r3.lgaField;
        r253.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessInfoFragment $r22 = BusinessInfoFragment.this;
                BusinessInfoFragment.m40374setupView$lambda8$lambda7($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-8$lambda-3 */
    public static final void m40370setupView$lambda8$lambda3(BusinessInfoFragment businessInfoFragment, View view) {
        Log_OC.getArray(businessInfoFragment, "this$0");
        FragmentActivity $r1 = businessInfoFragment.getActivity();
        boolean $z0 = $r1 instanceof BvnExistingAgentActivity;
        if ($z0) {
            businessInfoFragment.editProfile();
        } else {
            businessInfoFragment.onContinueClicked();
        }
    }

    /* renamed from: setupView$lambda-8$lambda-4 */
    public static final void m40371setupView$lambda8$lambda4(BusinessInfoFragment businessInfoFragment, View view) {
        Log_OC.getArray(businessInfoFragment, "this$0");
        businessInfoFragment.showStates();
    }

    /* renamed from: setupView$lambda-8$lambda-5 */
    public static final void m40372setupView$lambda8$lambda5(BusinessInfoFragment businessInfoFragment, View view) {
        Log_OC.getArray(businessInfoFragment, "this$0");
        businessInfoFragment.showStates();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-8$lambda-6 */
    public static final void m40373setupView$lambda8$lambda6(BusinessInfoFragment businessInfoFragment, View view) {
        Log_OC.getArray(businessInfoFragment, "this$0");
        boolean $z0 = businessInfoFragment.showLga();
        if ($z0) {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-8$lambda-7 */
    public static final void m40374setupView$lambda8$lambda7(BusinessInfoFragment businessInfoFragment, View view) {
        Log_OC.getArray(businessInfoFragment, "this$0");
        boolean $z0 = businessInfoFragment.showLga();
        if ($z0) {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showBottomSheet(List list) {
        FragmentActivity $r3 = requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        BusinessInfoFragment$showBottomSheet$1 r5 = new BusinessInfoFragment$showBottomSheet$1(list, this);
        Dialog r6 = new DialogC0809i($r3, r5);
        Dialog r7 = r6;
        r7.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean showLga() {
        boolean $z0;
        InterfaceC8209a $r1 = requireBinding();
        ViewRegisterBusinessInfoBinding $r2 = (ViewRegisterBusinessInfoBinding) $r1;
        KudiInputField $r3 = $r2.stateField;
        String $r4 = $r3.getText();
        $z0 = C13276s.m5440u($r4);
        if ($z0) {
            KudiInputField $r32 = $r2.stateField;
            $r32.setError("You must select a state first");
            return true;
        }
        List $r5 = getStates();
        if ($r5 == null) {
            return false;
        }
        StateFragment.Companion $r6 = StateFragment.Companion;
        String $r42 = getState();
        ArrayList $r7 = getLocationList();
        List $r52 = getLgaFromList($r42, $r7);
        StateFragment $r8 = StateFragment.Companion.newInstance$default($r6, $r52, null, 2, null);
        BusinessInfoFragment$showLga$1$1$1 $r9 = new BusinessInfoFragment$showLga$1$1$1($r2, this, $r8);
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
        BusinessInfoFragment$showStates$1$1 $r4 = new BusinessInfoFragment$showStates$1$1(this, $r3);
        $r3.setCallback($r4);
        FragmentManager $r5 = requireFragmentManager();
        $r3.show($r5, "Select State");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        BusinessInfoViewData $r2 = (BusinessInfoViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(BusinessInfoViewData businessInfoViewData) {
        Log_OC.getArray(businessInfoViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        ViewRegisterBusinessInfoBinding $r3 = (ViewRegisterBusinessInfoBinding) $r2;
        boolean $z0 = businessInfoViewData.isLoading();
        if ($z0) {
            KudiButton $r4 = $r3.continueToNextPage;
            $r4.m38032f();
        } else {
            KudiButton $r42 = $r3.continueToNextPage;
            $r42.m38033e();
        }
        boolean $z02 = businessInfoViewData.isBusicategoryLoading();
        if ($z02) {
            ProgressBar $r5 = $r3.primaryBusinessProgressBar;
            Log_OC.loadImage($r5, "primaryBusinessProgressBar");
            ViewExtKt.show($r5);
            ViewGroup $r6 = $r3.specifyPrimaryBusiness;
            ViewGroup r14 = $r6;
            r14.setEnabled(false);
        } else {
            ProgressBar $r52 = $r3.primaryBusinessProgressBar;
            Log_OC.loadImage($r52, "primaryBusinessProgressBar");
            ViewExtKt.hide$default($r52, false, 1, null);
            ViewGroup $r62 = $r3.specifyPrimaryBusiness;
            ViewGroup r142 = $r62;
            r142.setEnabled(true);
        }
        List $r7 = businessInfoViewData.getBusinessCategories();
        if ($r7 != null) {
            setBusinessCategories($r7);
        }
        User $r8 = businessInfoViewData.getUserProfile();
        if ($r8 != null) {
            TextView $r9 = $r3.pageTitle;
            String $r11 = $r8.getFirstName();
            Object[] $r10 = {$r11};
            String $r112 = getString(C0001R.string.welcome_text, $r10);
            $r9.setText($r112);
            KudiInputField $r63 = $r3.businessNameField;
            String $r113 = $r8.getBusinessName();
            $r63.setText($r113);
            KudiInputField $r64 = $r3.businessAddressField;
            String $r114 = $r8.businessAddress;
            $r64.setText($r114);
            KudiInputField $r65 = $r3.stateField;
            String $r115 = $r8.state;
            $r65.setText($r115);
            KudiInputField $r66 = $r3.lgaField;
            String $r116 = $r8.country;
            $r66.setText($r116);
        }
        List $r72 = businessInfoViewData.getLocation();
        if ($r72 != null) {
            ArrayList $r12 = (ArrayList) $r72;
            setLocationList($r12);
            ArrayList $r122 = getLocationList();
            setStates(getStates($r122));
        }
        BusinessInfoViewData.Error $r13 = businessInfoViewData.getError();
        applyErrors($r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        BusinessInfoViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public BusinessInfoViewModel createViewModel() {
        BusinessInfoViewModel $r1 = getVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getBusinessCategories() {
        List r1 = this.businessCategories;
        return r1;
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
        return BusinessInfoViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BusinessInfoViewModel getVm() {
        BusinessInfoViewModel $r1 = this.srv;
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
        ViewRegisterBusinessInfoBinding $r6 = ViewRegisterBusinessInfoBinding.inflate(layoutInflater, viewGroup, false);
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
        BusinessInfoViewModel $r3 = getVm();
        $r3.fetchBusinessCategory();
        FragmentActivity $r4 = getActivity();
        boolean $z0 = $r4 instanceof BvnExistingAgentActivity;
        if ($z0) {
            BusinessInfoViewModel $r32 = getVm();
            $r32.start();
        }
    }

    public final void setBusinessCategories(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.businessCategories = list;
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

    public final void setVm(BusinessInfoViewModel businessInfoViewModel) {
        Log_OC.getArray(businessInfoViewModel, "<set-?>");
        this.srv = businessInfoViewModel;
    }
}
