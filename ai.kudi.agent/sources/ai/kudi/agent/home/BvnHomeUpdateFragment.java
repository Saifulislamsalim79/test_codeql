package ai.kudi.agent.home;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentBvnHomeUpdateBinding;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.register.p022v2.p023ui.WhyWeCollectBvnBottomSheet;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p493j0.InterfaceC11863b;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: BvnHomeUpdateFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 J2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001JB\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u0019\u0010 \u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#H\u0096\u0001J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0015H\u0002J$\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020!2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u0017H\u0016J\t\u00103\u001a\u00020\u0005H\u0096\u0001J\u0010\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u0017H\u0016J\u0016\u00109\u001a\u00020\u00152\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0016J\u0016\u0010=\u001a\u00020\u00152\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0;H\u0016J\u0010\u0010@\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u000bH\u0016J\u001e\u0010B\u001a\u00020\u00152\u0006\u0010C\u001a\u00020D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00150FH\u0016J\u0010\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020\u000bH\u0016J\b\u0010I\u001a\u00020\u0015H\u0002R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006K"}, m10421d2 = {"Lai/kudi/agent/home/BvnHomeUpdateFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/home/HomeView;", "Lai/kudi/agent/home/HomePresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentBvnHomeUpdateBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentBvnHomeUpdateBinding;", "isNewUser", "", "()Z", "setNewUser", "(Z)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/home/HomePresenter;", "setThisPresenter", "(Lai/kudi/agent/home/HomePresenter;)V", "checkTerminalID", "", "terminalId", "", "createPresenter", "displayNotificationCount", "count", "", "displayWalletBalance", "balance", "", "fundWalletView", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onContinueClicked", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "openPageByType", "type", "requireBinding", "setCashInsuranceState", "cashInsuranceState", "Lai/kudi/agent/home/CashInsuranceState;", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showMonnifyDetails", "miniMonnifyDetails", "", "Lai/kudi/agent/wallettopup/data/MiniMonnifyDetails;", "showTodoList", "todoList", "Lai/kudi/agent/postRegistrationSetUp/adapter/TodoItem;", "showTodoLoading", "isLoading", "showVerifyPrompt", "result", "Lai/kudi/agent/home/VerifyStateResult;", "buttonClickListener", "Lkotlin/Function0;", "toggleKCashFeature", "isVisible", "updateView", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BvnHomeUpdateFragment extends AbstractC9412c<HomeView, HomePresenter> implements HomeView, BaseViewBinder<FragmentBvnHomeUpdateBinding> {
    public static final Companion Companion;
    private static final String TAG;
    private final /* synthetic */ BaseViewBinderImpl<FragmentBvnHomeUpdateBinding> $$delegate_0;
    private boolean isNewUser;
    public HomePresenter thisPresenter;

    /* compiled from: BvnHomeUpdateFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/home/BvnHomeUpdateFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "newInstance", "Lai/kudi/agent/home/BvnHomeUpdateFragment;", "phoneNumber", PhoneFragment.ARG_BVN, "regId", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final String getTAG() {
            String $r1 = BvnHomeUpdateFragment.TAG;
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final BvnHomeUpdateFragment newInstance(String str, String str2, String str3) {
            BvnHomeUpdateFragment r6 = new BvnHomeUpdateFragment();
            Bundle r7 = new Bundle();
            r7.putString("phoneNo", str);
            r7.putString(PhoneFragment.ARG_BVN, str2);
            r7.putString(PhoneFragment.ARG_REG, str3);
            BvnHomeUpdateFragment r8 = r6;
            r8.setArguments(r7);
            return r6;
        }
    }

    /* compiled from: BvnHomeUpdateFragment.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            VerifyStateResult[] $r0 = VerifyStateResult.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            VerifyStateResult $r2 = VerifyStateResult.UNVERIFIED;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            VerifyStateResult $r22 = VerifyStateResult.SUCCESS;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            VerifyStateResult $r23 = VerifyStateResult.FAILURE;
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
        InterfaceC11863b $r1 = C11813x.m10316b(BvnHomeUpdateFragment.class);
        String $r2 = $r1.mo10139g();
        TAG = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BvnHomeUpdateFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onContinueClicked() {
        HomePresenter $r1 = getThisPresenter();
        FragmentBvnHomeUpdateBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.bvnInputField;
        String $r4 = $r3.getText();
        $r1.verifyId($r4);
        BvnHomeUpdateFragment r5 = this;
        ContextExtKt.hideKeyboard(r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateView() {
        final FragmentBvnHomeUpdateBinding $r1 = requireBinding();
        TextView $r2 = $r1.toolbarTitle;
        BvnHomeUpdateFragment r16 = this;
        String $r3 = r16.getString(C0001R.string.verify_bvn);
        $r2.setText($r3);
        KudiButton $r4 = $r1.verifyButton;
        $r4.m38035c();
        KudiInputField $r5 = $r1.bvnInputField;
        Log_OC.loadImage($r5, "");
        KudiInputField r17 = $r5;
        ViewExtKt.show(r17);
        EditText $r6 = $r5.getInputEditText();
        $r6.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.home.BvnHomeUpdateFragment$updateView$lambda-5$lambda-1$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                boolean $z0 = false;
                if (charSequence != null) {
                    int $i1 = charSequence.length();
                    if ($i1 == 11) {
                        $z0 = true;
                    }
                }
                if ($z0) {
                    FragmentBvnHomeUpdateBinding $r22 = FragmentBvnHomeUpdateBinding.this;
                    KudiButton $r32 = $r22.verifyButton;
                    $r32.m38034d();
                    return;
                }
                FragmentBvnHomeUpdateBinding $r23 = FragmentBvnHomeUpdateBinding.this;
                KudiButton $r33 = $r23.verifyButton;
                $r33.m38035c();
            }
        });
        ImageView $r8 = $r1.backIcon;
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.home.EditEventView$5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BvnHomeUpdateFragment $r22 = BvnHomeUpdateFragment.this;
                BvnHomeUpdateFragment.m39271updateView$lambda5$lambda2($r22, view);
            }
        });
        TextView $r22 = $r1.learnMore;
        Log_OC.loadImage($r22, "learnMore");
        ViewExtKt.show($r22);
        ViewGroup $r42 = $r1.verifyButton;
        ViewGroup r18 = $r42;
        r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.home.EditEventView$6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BvnHomeUpdateFragment $r23 = BvnHomeUpdateFragment.this;
                BvnHomeUpdateFragment.m39272updateView$lambda5$lambda3($r23, view);
            }
        });
        TextView $r23 = $r1.learnMore;
        $r23.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.home.EditActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BvnHomeUpdateFragment $r24 = BvnHomeUpdateFragment.this;
                BvnHomeUpdateFragment.m39273updateView$lambda5$lambda4($r24, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateView$lambda-5$lambda-2  reason: not valid java name */
    public static final void m39271updateView$lambda5$lambda2(BvnHomeUpdateFragment bvnHomeUpdateFragment, View view) {
        Log_OC.getArray(bvnHomeUpdateFragment, "this$0");
        BvnHomeUpdateFragment r3 = bvnHomeUpdateFragment;
        FragmentManager $r0 = r3.getParentFragmentManager();
        $r0.m35966V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateView$lambda-5$lambda-3  reason: not valid java name */
    public static final void m39272updateView$lambda5$lambda3(BvnHomeUpdateFragment bvnHomeUpdateFragment, View view) {
        Log_OC.getArray(bvnHomeUpdateFragment, "this$0");
        bvnHomeUpdateFragment.onContinueClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateView$lambda-5$lambda-4  reason: not valid java name */
    public static final void m39273updateView$lambda5$lambda4(BvnHomeUpdateFragment bvnHomeUpdateFragment, View view) {
        Log_OC.getArray(bvnHomeUpdateFragment, "this$0");
        WhyWeCollectBvnBottomSheet r6 = new WhyWeCollectBvnBottomSheet();
        BvnHomeUpdateFragment r7 = bvnHomeUpdateFragment;
        FragmentManager $r3 = r7.getChildFragmentManager();
        String $r5 = WhyWeCollectBvnBottomSheet.class.getCanonicalName();
        Chapter r8 = (Chapter) r6;
        r8.show($r3, $r5);
    }

    @Override // ai.kudi.agent.home.HomeView
    public void checkTerminalID(String str) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public HomePresenter createPresenter() {
        HomePresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    @Override // ai.kudi.agent.home.HomeView
    public void displayNotificationCount(int i) {
    }

    @Override // ai.kudi.agent.home.HomeView
    public void displayWalletBalance(double d) {
    }

    @Override // ai.kudi.agent.home.HomeView
    public void fundWalletView() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentBvnHomeUpdateBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentBvnHomeUpdateBinding $r3 = (FragmentBvnHomeUpdateBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentBvnHomeUpdateBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final HomePresenter getThisPresenter() {
        HomePresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentBvnHomeUpdateBinding fragmentBvnHomeUpdateBinding, Fragment fragment) {
        Log_OC.getArray(fragmentBvnHomeUpdateBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentBvnHomeUpdateBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentBvnHomeUpdateBinding $r4 = (FragmentBvnHomeUpdateBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isNewUser() {
        boolean z0 = this.isNewUser;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        BvnHomeUpdateFragment r2 = this;
        super.onAttach(context);
        BvnHomeUpdateFragment r22 = this;
        C7429a.m18752b(r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentBvnHomeUpdateBinding $r4 = FragmentBvnHomeUpdateBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        BvnHomeUpdateFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        updateView();
    }

    @Override // ai.kudi.agent.home.HomeView
    public void openPageByType(String str) {
        Log_OC.getArray(str, "type");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentBvnHomeUpdateBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentBvnHomeUpdateBinding $r3 = (FragmentBvnHomeUpdateBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentBvnHomeUpdateBinding $r1 = requireBinding();
        return $r1;
    }

    @Override // ai.kudi.agent.home.HomeView
    public void setCashInsuranceState(CashInsuranceState cashInsuranceState) {
        Log_OC.getArray(cashInsuranceState, "cashInsuranceState");
    }

    public final void setNewUser(boolean z) {
        this.isNewUser = z;
    }

    public final void setThisPresenter(HomePresenter homePresenter) {
        Log_OC.getArray(homePresenter, "<set-?>");
        this.thisPresenter = homePresenter;
    }

    @Override // ai.kudi.agent.home.HomeView
    public void showError(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
    }

    @Override // ai.kudi.agent.home.HomeView
    public void showMonnifyDetails(List list) {
        Log_OC.getArray(list, "miniMonnifyDetails");
    }

    @Override // ai.kudi.agent.home.HomeView
    public void showTodoList(List list) {
        Log_OC.getArray(list, "todoList");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.home.HomeView
    public void showTodoLoading(boolean z) {
        FragmentBvnHomeUpdateBinding $r1 = requireBinding();
        if (z) {
            KudiButton $r2 = $r1.verifyButton;
            $r2.m38032f();
            return;
        }
        KudiButton $r22 = $r1.verifyButton;
        $r22.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.home.HomeView
    public void showVerifyPrompt(VerifyStateResult verifyStateResult, final InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(verifyStateResult, "result");
        Log_OC.getArray(interfaceC11756a, "buttonClickListener");
        int[] $r3 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = $r3[verifyStateResult.ordinal()];
        if ($i0 == 1) {
            CustomDialog.Companion $r12 = CustomDialog.Companion;
            BvnHomeUpdateFragment r20 = this;
            Drawable $r14 = C1335a.m36322f(r20.requireContext(), C0001R.C0002drawable.ic_unfollow);
            BvnHomeUpdateFragment r202 = this;
            String $r5 = r202.getString(C0001R.string.verify_title);
            BvnHomeUpdateFragment r203 = this;
            String $r6 = r203.getString(C0001R.string.verify_message);
            Log_OC.loadImage($r6, "getString(R.string.verify_message)");
            BvnHomeUpdateFragment r204 = this;
            String $r7 = r204.getString(C0001R.string.verify_acct);
            Log_OC.loadImage($r7, "getString(R.string.verify_acct)");
            BvnHomeUpdateFragment r205 = this;
            Context $r13 = r205.requireContext();
            Log_OC.loadImage($r13, "requireContext()");
            $r12.show($r14, $r5, $r6, $r7, $r13, new CustomDialog.ClickListeners() { // from class: ai.kudi.agent.home.BvnHomeUpdateFragment$showVerifyPrompt$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // ai.kudi.agent.core.util.CustomDialog.ClickListeners
                public void onActionButtonClick() {
                    InterfaceC11756a $r1 = InterfaceC11756a.this;
                    $r1.invoke();
                }

                @Override // ai.kudi.agent.core.util.CustomDialog.ClickListeners
                public void onBackButtonClick() {
                }
            });
        } else if ($i0 == 2) {
            CustomDialog.Companion $r122 = CustomDialog.Companion;
            BvnHomeUpdateFragment r206 = this;
            Drawable $r142 = C1335a.m36322f(r206.requireContext(), C0001R.C0002drawable.ic_follow);
            BvnHomeUpdateFragment r207 = this;
            String $r52 = r207.getString(C0001R.string.verified_message);
            Log_OC.loadImage($r52, "getString(R.string.verified_message)");
            BvnHomeUpdateFragment r208 = this;
            String $r62 = r208.getString(C0001R.string.homepage);
            Log_OC.loadImage($r62, "getString(R.string.homepage)");
            BvnHomeUpdateFragment r209 = this;
            Context $r132 = r209.requireContext();
            Log_OC.loadImage($r132, "requireContext()");
            $r122.show($r142, null, $r52, $r62, $r132, new CustomDialog.ClickListeners() { // from class: ai.kudi.agent.home.BvnHomeUpdateFragment$showVerifyPrompt$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // ai.kudi.agent.core.util.CustomDialog.ClickListeners
                public void onActionButtonClick() {
                    Fragment $r2 = BvnHomeUpdateFragment.this;
                    Fragment r3 = $r2;
                    FragmentManager $r1 = r3.getParentFragmentManager();
                    $r1.m35966V0();
                }

                @Override // ai.kudi.agent.core.util.CustomDialog.ClickListeners
                public void onBackButtonClick() {
                }
            });
        } else if ($i0 != 3) {
        } else {
            SuccessScreenDialogFragment.Companion $r4 = SuccessScreenDialogFragment.Companion;
            String $r53 = getString(C0001R.string.verification_failed_short);
            String $r63 = getString(C0001R.string.invalid_provided_bvn);
            String $r72 = getString(C0001R.string.try_again);
            Log_OC.loadImage($r53, "getString(R.string.verification_failed_short)");
            Log_OC.loadImage($r63, "getString(R.string.invalid_provided_bvn)");
            Log_OC.loadImage($r72, "getString(R.string.try_again)");
            SuccessScreenCustomOption r17 = new SuccessScreenCustomOption($r53, $r63, $r72, true, false, true, 0, 0, 0, C0001R.color.background, C0001R.C0002drawable.ic_bvn_verification_fail, C0001R.C0002drawable.kudi_primary_button_ripple, false, 4560, null);
            BvnHomeUpdateFragment$showVerifyPrompt$3 $r9 = BvnHomeUpdateFragment$showVerifyPrompt$3.INSTANCE;
            SuccessScreenDialogFragment $r10 = $r4.newInstance(r17, $r9);
            BvnHomeUpdateFragment r2010 = this;
            FragmentManager $r11 = r2010.getParentFragmentManager();
            $r10.show($r11, SuccessScreenDialogFragment.PAGE_KEY);
        }
    }

    @Override // ai.kudi.agent.home.HomeView
    public void toggleKCashFeature(boolean z) {
    }
}
